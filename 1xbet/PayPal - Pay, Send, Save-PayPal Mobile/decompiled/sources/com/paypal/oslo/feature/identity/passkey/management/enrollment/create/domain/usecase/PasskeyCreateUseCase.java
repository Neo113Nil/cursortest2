package com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0086B¢\u0006\u0004\b\u0019\u0010\u001aJ\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001b0\u0016H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u001f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u001eH\u0082@¢\u0006\u0004\b\u001f\u0010\u001dJ.\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\"0\u00162\u0006\u0010 \u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u0014H\u0082@¢\u0006\u0004\b\u001f\u0010#J@\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020'0\u00162\u0006\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u00142\b\u0010&\u001a\u0004\u0018\u00010\u0014H\u0082@¢\u0006\u0004\b(\u0010)J,\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0006\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020'H\u0082@¢\u0006\u0004\b\u001f\u0010*R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010+R\u0014\u0010,\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010.R\u0014\u00101\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u001f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00102R\u0014\u00104\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00103"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/usecase/PasskeyCreateUseCase;", "", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/usecase/PasskeyCreateChallengeUseCase;", "passkeyCreateChallengeUseCase", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/domain/repository/PasskeyAttestationRepository;", "passkeyAttestationRepository", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/repository/PasskeyCreateRepository;", "passkeyCreateRepository", "Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/usecase/SystemPasskeyEligibilityUseCase;", "systemEligibility", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/usecase/GetRememberedUserUseCase;", "getRememberedUserUseCase", "<init>", "(Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/usecase/PasskeyCreateChallengeUseCase;Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/domain/repository/PasskeyAttestationRepository;Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/repository/PasskeyCreateRepository;Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/usecase/SystemPasskeyEligibilityUseCase;Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/usecase/GetRememberedUserUseCase;)V", "Landroid/content/Context;", "activityContext", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyFlowVariant;", "passkeyFlowVariant", "", "publicCredential", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateSuccess;", "invoke", "(Landroid/content/Context;Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyFlowVariant;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getHighSpeedVideoFpsRangesFor", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Pair;", "getHighSpeedVideoFpsRanges", "p0", "p1", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/model/PasskeyCreateChallengeSuccess;", "(Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyFlowVariant;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/model/PasskeyCreateChallenge;", "p2", "p3", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/domain/model/PasskeyAttestationSuccess;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/content/Context;Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/model/PasskeyCreateChallenge;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyFlowVariant;Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/domain/model/PasskeyAttestationSuccess;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/usecase/PasskeyCreateChallengeUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/domain/repository/PasskeyAttestationRepository;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/repository/PasskeyCreateRepository;", "getInputFormats", "Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/usecase/SystemPasskeyEligibilityUseCase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/usecase/GetRememberedUserUseCase;", "getHighSpeedVideoSizesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasskeyCreateUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.repository.PasskeyAttestationRepository Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.usecase.PasskeyCreateChallengeUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.repository.PasskeyCreateRepository getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase getHighSpeedVideoSizesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.SystemPasskeyEligibilityUseCase getHighSpeedVideoSizes;

    @javax.inject.Inject
    public PasskeyCreateUseCase(com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.usecase.PasskeyCreateChallengeUseCase passkeyCreateChallengeUseCase, com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.repository.PasskeyAttestationRepository passkeyAttestationRepository, com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.repository.PasskeyCreateRepository passkeyCreateRepository, com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.SystemPasskeyEligibilityUseCase systemPasskeyEligibilityUseCase, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase getRememberedUserUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyCreateChallengeUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyAttestationRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyCreateRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(systemPasskeyEligibilityUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getRememberedUserUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = passkeyCreateChallengeUseCase;
        this.Camera2StreamConfigurationMap = passkeyAttestationRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = passkeyCreateRepository;
        this.getHighSpeedVideoSizes = systemPasskeyEligibilityUseCase;
        this.getHighSpeedVideoFpsRanges = featureGate;
        this.getHighSpeedVideoSizesFor = getRememberedUserUseCase;
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase passkeyCreateUseCase, android.content.Context context, com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant passkeyFlowVariant, java.lang.String str, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        return passkeyCreateUseCase.invoke(context, passkeyFlowVariant, str, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r22v0, types: [com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11, types: [arrow.core.raise.DefaultRaise] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(android.content.Context context, com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant passkeyFlowVariant, java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError, com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateSuccess>> continuation) {
        com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase$invoke$1 passkeyCreateUseCase$invoke$1;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        ?? r3;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.DefaultRaise defaultRaise3;
        android.content.Context context2;
        java.lang.String str2;
        arrow.core.raise.Raise raise;
        arrow.core.raise.DefaultRaise defaultRaise4;
        int i2;
        int i3;
        com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant passkeyFlowVariant2;
        int i4;
        int i5;
        int i6;
        arrow.core.raise.DefaultRaise defaultRaise5;
        java.lang.String str3;
        arrow.core.raise.Raise raise2;
        com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant passkeyFlowVariant3;
        java.lang.Object highSpeedVideoFpsRanges;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        int i7;
        com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant passkeyFlowVariant4;
        arrow.core.raise.DefaultRaise defaultRaise6;
        int i8;
        arrow.core.raise.Raise raise3;
        int i9;
        int i10;
        arrow.core.raise.Raise raise4;
        arrow.core.raise.DefaultRaise defaultRaise7;
        int i11;
        int i12;
        com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant passkeyFlowVariant5;
        android.content.Context context3;
        arrow.core.raise.DefaultRaise defaultRaise8;
        java.lang.String str7;
        com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeSuccess passkeyCreateChallengeSuccess;
        arrow.core.raise.Raise raise5;
        arrow.core.raise.Raise raise6;
        arrow.core.raise.Raise raise7;
        try {
            try {
                if (continuation instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase$invoke$1) {
                    passkeyCreateUseCase$invoke$1 = (com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase$invoke$1) continuation;
                    if ((passkeyCreateUseCase$invoke$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                        passkeyCreateUseCase$invoke$1.getOutputStallDurationlomOqCM -= 2147483648;
                        com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase$invoke$1 passkeyCreateUseCase$invoke$12 = passkeyCreateUseCase$invoke$1;
                        obj = passkeyCreateUseCase$invoke$12.getValidOutputFormatsForInputhNQ4ISI;
                        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = passkeyCreateUseCase$invoke$12.getOutputStallDurationlomOqCM;
                        r3 = 4;
                        r3 = 4;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            arrow.core.raise.DefaultRaise defaultRaise9 = new arrow.core.raise.DefaultRaise(false);
                            defaultRaise3 = defaultRaise9;
                            passkeyCreateUseCase$invoke$12.getHighResolutionOutputSizeshNQ4ISI = context;
                            passkeyCreateUseCase$invoke$12.getInputSizeshNQ4ISI = passkeyFlowVariant;
                            passkeyCreateUseCase$invoke$12.getOutputFormats = str;
                            passkeyCreateUseCase$invoke$12.getInputFormats = defaultRaise9;
                            passkeyCreateUseCase$invoke$12.getHighSpeedVideoSizesFor = defaultRaise3;
                            passkeyCreateUseCase$invoke$12.getOutputMinFrameDuration = defaultRaise3;
                            passkeyCreateUseCase$invoke$12.getHighSpeedVideoFpsRanges = 0;
                            passkeyCreateUseCase$invoke$12.getHighSpeedVideoFpsRangesFor = 0;
                            passkeyCreateUseCase$invoke$12.getHighSpeedVideoSizes = 0;
                            passkeyCreateUseCase$invoke$12.Camera2StreamConfigurationMap = 0;
                            passkeyCreateUseCase$invoke$12.getOutputStallDurationlomOqCM = 1;
                            java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(passkeyCreateUseCase$invoke$12);
                            if (highSpeedVideoFpsRangesFor != coroutine_suspended) {
                                context2 = context;
                                str2 = str;
                                raise = defaultRaise3;
                                defaultRaise4 = defaultRaise9;
                                i2 = 0;
                                i3 = 0;
                                passkeyFlowVariant2 = passkeyFlowVariant;
                                i4 = 0;
                                obj = highSpeedVideoFpsRangesFor;
                                i5 = 0;
                            }
                            return coroutine_suspended;
                        }
                        if (i == 1) {
                            i2 = passkeyCreateUseCase$invoke$12.Camera2StreamConfigurationMap;
                            i4 = passkeyCreateUseCase$invoke$12.getHighSpeedVideoSizes;
                            i5 = passkeyCreateUseCase$invoke$12.getHighSpeedVideoFpsRangesFor;
                            i3 = passkeyCreateUseCase$invoke$12.getHighSpeedVideoFpsRanges;
                            defaultRaise3 = (arrow.core.raise.Raise) passkeyCreateUseCase$invoke$12.getOutputMinFrameDuration;
                            raise = (arrow.core.raise.Raise) passkeyCreateUseCase$invoke$12.getHighSpeedVideoSizesFor;
                            defaultRaise4 = (arrow.core.raise.DefaultRaise) passkeyCreateUseCase$invoke$12.getInputFormats;
                            str2 = (java.lang.String) passkeyCreateUseCase$invoke$12.getOutputFormats;
                            passkeyFlowVariant2 = (com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant) passkeyCreateUseCase$invoke$12.getInputSizeshNQ4ISI;
                            context2 = (android.content.Context) passkeyCreateUseCase$invoke$12.getHighResolutionOutputSizeshNQ4ISI;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                            } catch (arrow.core.raise.RaiseCancellationException e) {
                                e = e;
                                defaultRaise2 = defaultRaise4;
                                defaultRaise2.complete();
                                return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise2));
                            } catch (java.lang.Throwable th) {
                                th = th;
                                defaultRaise = defaultRaise4;
                                defaultRaise.complete();
                                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                            }
                        } else {
                            if (i == 2) {
                                i2 = passkeyCreateUseCase$invoke$12.Camera2StreamConfigurationMap;
                                int i13 = passkeyCreateUseCase$invoke$12.getHighSpeedVideoSizes;
                                int i14 = passkeyCreateUseCase$invoke$12.getHighSpeedVideoFpsRangesFor;
                                int i15 = passkeyCreateUseCase$invoke$12.getHighSpeedVideoFpsRanges;
                                arrow.core.raise.Raise raise8 = (arrow.core.raise.Raise) passkeyCreateUseCase$invoke$12.getHighSpeedVideoSizesFor;
                                arrow.core.raise.DefaultRaise defaultRaise10 = (arrow.core.raise.DefaultRaise) passkeyCreateUseCase$invoke$12.getInputFormats;
                                str3 = (java.lang.String) passkeyCreateUseCase$invoke$12.getOutputFormats;
                                passkeyFlowVariant3 = (com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant) passkeyCreateUseCase$invoke$12.getInputSizeshNQ4ISI;
                                android.content.Context context4 = (android.content.Context) passkeyCreateUseCase$invoke$12.getHighResolutionOutputSizeshNQ4ISI;
                                kotlin.ResultKt.throwOnFailure(obj);
                                context2 = context4;
                                raise2 = raise8;
                                i3 = i15;
                                i5 = i14;
                                i6 = i13;
                                defaultRaise5 = defaultRaise10;
                                kotlin.Pair pair = (kotlin.Pair) obj;
                                java.lang.String str8 = (java.lang.String) pair.component1();
                                java.lang.String str9 = (java.lang.String) pair.component2();
                                passkeyCreateUseCase$invoke$12.getHighResolutionOutputSizeshNQ4ISI = context2;
                                passkeyCreateUseCase$invoke$12.getInputSizeshNQ4ISI = passkeyFlowVariant3;
                                passkeyCreateUseCase$invoke$12.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                                passkeyCreateUseCase$invoke$12.getInputFormats = defaultRaise5;
                                passkeyCreateUseCase$invoke$12.getHighSpeedVideoSizesFor = raise2;
                                passkeyCreateUseCase$invoke$12.getOutputMinFrameDuration = raise2;
                                passkeyCreateUseCase$invoke$12.getOutputSizeshNQ4ISI = str8;
                                passkeyCreateUseCase$invoke$12.getOutputMinFrameDurationlomOqCM = str9;
                                passkeyCreateUseCase$invoke$12.getHighSpeedVideoFpsRanges = i3;
                                passkeyCreateUseCase$invoke$12.getHighSpeedVideoFpsRangesFor = i5;
                                passkeyCreateUseCase$invoke$12.getHighSpeedVideoSizes = i6;
                                passkeyCreateUseCase$invoke$12.Camera2StreamConfigurationMap = i2;
                                passkeyCreateUseCase$invoke$12.getOutputStallDurationlomOqCM = 3;
                                highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(passkeyFlowVariant3, str3, passkeyCreateUseCase$invoke$12);
                                if (highSpeedVideoFpsRanges != coroutine_suspended) {
                                    str4 = str9;
                                    obj = highSpeedVideoFpsRanges;
                                    str5 = str3;
                                    str6 = str8;
                                    i7 = i6;
                                    passkeyFlowVariant4 = passkeyFlowVariant3;
                                    defaultRaise6 = defaultRaise5;
                                    i8 = i5;
                                    raise3 = raise2;
                                    i9 = i3;
                                    i10 = i2;
                                    raise4 = raise3;
                                    com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeSuccess passkeyCreateChallengeSuccess2 = (com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeSuccess) raise4.bind((arrow.core.Either) obj);
                                    com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallenge passkeyCreateChallenge = passkeyCreateChallengeSuccess2.getPasskeyCreateChallenge();
                                    passkeyCreateUseCase$invoke$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(context2);
                                    passkeyCreateUseCase$invoke$12.getInputSizeshNQ4ISI = passkeyFlowVariant4;
                                    passkeyCreateUseCase$invoke$12.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str5);
                                    passkeyCreateUseCase$invoke$12.getInputFormats = defaultRaise6;
                                    passkeyCreateUseCase$invoke$12.getHighSpeedVideoSizesFor = raise3;
                                    passkeyCreateUseCase$invoke$12.getOutputMinFrameDuration = raise3;
                                    passkeyCreateUseCase$invoke$12.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str6);
                                    passkeyCreateUseCase$invoke$12.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                                    passkeyCreateUseCase$invoke$12.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyCreateChallengeSuccess2);
                                    passkeyCreateUseCase$invoke$12.getHighSpeedVideoFpsRanges = i9;
                                    passkeyCreateUseCase$invoke$12.getHighSpeedVideoFpsRangesFor = i8;
                                    passkeyCreateUseCase$invoke$12.getHighSpeedVideoSizes = i7;
                                    passkeyCreateUseCase$invoke$12.Camera2StreamConfigurationMap = i10;
                                    passkeyCreateUseCase$invoke$12.getOutputStallDurationlomOqCM = 4;
                                    defaultRaise7 = defaultRaise6;
                                    arrow.core.raise.Raise raise9 = raise3;
                                    obj = getHighResolutionOutputSizeshNQ4ISI(context2, passkeyCreateChallenge, str6, str4, passkeyCreateUseCase$invoke$12);
                                    if (obj != coroutine_suspended) {
                                    }
                                }
                                return coroutine_suspended;
                            }
                            if (i != 3) {
                                if (i != 4) {
                                    if (i != 5) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    int i16 = passkeyCreateUseCase$invoke$12.Camera2StreamConfigurationMap;
                                    int i17 = passkeyCreateUseCase$invoke$12.getHighSpeedVideoSizes;
                                    int i18 = passkeyCreateUseCase$invoke$12.getHighSpeedVideoFpsRangesFor;
                                    int i19 = passkeyCreateUseCase$invoke$12.getHighSpeedVideoFpsRanges;
                                    raise7 = (arrow.core.raise.Raise) passkeyCreateUseCase$invoke$12.getOutputMinFrameDuration;
                                    arrow.core.raise.DefaultRaise defaultRaise11 = (arrow.core.raise.DefaultRaise) passkeyCreateUseCase$invoke$12.getInputFormats;
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    r3 = defaultRaise11;
                                    com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateSuccess passkeyCreateSuccess = (com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateSuccess) raise7.bind((arrow.core.Either) obj);
                                    r3.complete();
                                    return new arrow.core.Either.Right(passkeyCreateSuccess);
                                }
                                int i20 = passkeyCreateUseCase$invoke$12.Camera2StreamConfigurationMap;
                                int i21 = passkeyCreateUseCase$invoke$12.getHighSpeedVideoSizes;
                                i11 = passkeyCreateUseCase$invoke$12.getHighSpeedVideoFpsRangesFor;
                                i12 = passkeyCreateUseCase$invoke$12.getHighSpeedVideoFpsRanges;
                                passkeyCreateChallengeSuccess = (com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeSuccess) passkeyCreateUseCase$invoke$12.getOutputStallDuration;
                                java.lang.String str10 = (java.lang.String) passkeyCreateUseCase$invoke$12.getOutputMinFrameDurationlomOqCM;
                                java.lang.String str11 = (java.lang.String) passkeyCreateUseCase$invoke$12.getOutputSizeshNQ4ISI;
                                raise5 = (arrow.core.raise.Raise) passkeyCreateUseCase$invoke$12.getOutputMinFrameDuration;
                                raise6 = (arrow.core.raise.Raise) passkeyCreateUseCase$invoke$12.getHighSpeedVideoSizesFor;
                                arrow.core.raise.DefaultRaise defaultRaise12 = (arrow.core.raise.DefaultRaise) passkeyCreateUseCase$invoke$12.getInputFormats;
                                str7 = (java.lang.String) passkeyCreateUseCase$invoke$12.getOutputFormats;
                                com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant passkeyFlowVariant6 = (com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant) passkeyCreateUseCase$invoke$12.getInputSizeshNQ4ISI;
                                context3 = (android.content.Context) passkeyCreateUseCase$invoke$12.getHighResolutionOutputSizeshNQ4ISI;
                                kotlin.ResultKt.throwOnFailure(obj);
                                str6 = str11;
                                passkeyFlowVariant5 = passkeyFlowVariant6;
                                i10 = i20;
                                i7 = i21;
                                defaultRaise8 = defaultRaise12;
                                str4 = str10;
                                com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationSuccess passkeyAttestationSuccess = (com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationSuccess) raise5.bind((arrow.core.Either) obj);
                                passkeyCreateUseCase$invoke$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(context3);
                                passkeyCreateUseCase$invoke$12.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyFlowVariant5);
                                passkeyCreateUseCase$invoke$12.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str7);
                                passkeyCreateUseCase$invoke$12.getInputFormats = defaultRaise8;
                                passkeyCreateUseCase$invoke$12.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise6);
                                passkeyCreateUseCase$invoke$12.getOutputMinFrameDuration = raise6;
                                passkeyCreateUseCase$invoke$12.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str6);
                                passkeyCreateUseCase$invoke$12.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                                passkeyCreateUseCase$invoke$12.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyCreateChallengeSuccess);
                                passkeyCreateUseCase$invoke$12.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyAttestationSuccess);
                                passkeyCreateUseCase$invoke$12.getHighSpeedVideoFpsRanges = i12;
                                passkeyCreateUseCase$invoke$12.getHighSpeedVideoFpsRangesFor = i11;
                                passkeyCreateUseCase$invoke$12.getHighSpeedVideoSizes = i7;
                                passkeyCreateUseCase$invoke$12.Camera2StreamConfigurationMap = i10;
                                passkeyCreateUseCase$invoke$12.getOutputStallDurationlomOqCM = 5;
                                obj = getHighSpeedVideoFpsRanges(passkeyFlowVariant5, passkeyAttestationSuccess, passkeyCreateUseCase$invoke$12);
                                if (obj != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                raise7 = raise6;
                                r3 = defaultRaise8;
                                com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateSuccess passkeyCreateSuccess2 = (com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateSuccess) raise7.bind((arrow.core.Either) obj);
                                r3.complete();
                                return new arrow.core.Either.Right(passkeyCreateSuccess2);
                            }
                            int i22 = passkeyCreateUseCase$invoke$12.Camera2StreamConfigurationMap;
                            int i23 = passkeyCreateUseCase$invoke$12.getHighSpeedVideoSizes;
                            int i24 = passkeyCreateUseCase$invoke$12.getHighSpeedVideoFpsRangesFor;
                            int i25 = passkeyCreateUseCase$invoke$12.getHighSpeedVideoFpsRanges;
                            java.lang.String str12 = (java.lang.String) passkeyCreateUseCase$invoke$12.getOutputMinFrameDurationlomOqCM;
                            java.lang.String str13 = (java.lang.String) passkeyCreateUseCase$invoke$12.getOutputSizeshNQ4ISI;
                            arrow.core.raise.Raise raise10 = (arrow.core.raise.Raise) passkeyCreateUseCase$invoke$12.getOutputMinFrameDuration;
                            arrow.core.raise.Raise raise11 = (arrow.core.raise.Raise) passkeyCreateUseCase$invoke$12.getHighSpeedVideoSizesFor;
                            arrow.core.raise.DefaultRaise defaultRaise13 = (arrow.core.raise.DefaultRaise) passkeyCreateUseCase$invoke$12.getInputFormats;
                            java.lang.String str14 = (java.lang.String) passkeyCreateUseCase$invoke$12.getOutputFormats;
                            com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant passkeyFlowVariant7 = (com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant) passkeyCreateUseCase$invoke$12.getInputSizeshNQ4ISI;
                            android.content.Context context5 = (android.content.Context) passkeyCreateUseCase$invoke$12.getHighResolutionOutputSizeshNQ4ISI;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                str6 = str13;
                                str5 = str14;
                                i7 = i23;
                                str4 = str12;
                                i10 = i22;
                                raise4 = raise10;
                                i8 = i24;
                                defaultRaise6 = defaultRaise13;
                                passkeyFlowVariant4 = passkeyFlowVariant7;
                                context2 = context5;
                                i9 = i25;
                                raise3 = raise11;
                                try {
                                    com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeSuccess passkeyCreateChallengeSuccess22 = (com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeSuccess) raise4.bind((arrow.core.Either) obj);
                                    com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallenge passkeyCreateChallenge2 = passkeyCreateChallengeSuccess22.getPasskeyCreateChallenge();
                                    passkeyCreateUseCase$invoke$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(context2);
                                    passkeyCreateUseCase$invoke$12.getInputSizeshNQ4ISI = passkeyFlowVariant4;
                                    passkeyCreateUseCase$invoke$12.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str5);
                                    passkeyCreateUseCase$invoke$12.getInputFormats = defaultRaise6;
                                    passkeyCreateUseCase$invoke$12.getHighSpeedVideoSizesFor = raise3;
                                    passkeyCreateUseCase$invoke$12.getOutputMinFrameDuration = raise3;
                                    passkeyCreateUseCase$invoke$12.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str6);
                                    passkeyCreateUseCase$invoke$12.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                                    passkeyCreateUseCase$invoke$12.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyCreateChallengeSuccess22);
                                    passkeyCreateUseCase$invoke$12.getHighSpeedVideoFpsRanges = i9;
                                    passkeyCreateUseCase$invoke$12.getHighSpeedVideoFpsRangesFor = i8;
                                    passkeyCreateUseCase$invoke$12.getHighSpeedVideoSizes = i7;
                                    passkeyCreateUseCase$invoke$12.Camera2StreamConfigurationMap = i10;
                                    passkeyCreateUseCase$invoke$12.getOutputStallDurationlomOqCM = 4;
                                    defaultRaise7 = defaultRaise6;
                                    arrow.core.raise.Raise raise92 = raise3;
                                    try {
                                        obj = getHighResolutionOutputSizeshNQ4ISI(context2, passkeyCreateChallenge2, str6, str4, passkeyCreateUseCase$invoke$12);
                                        if (obj != coroutine_suspended) {
                                            i11 = i8;
                                            i12 = i9;
                                            passkeyFlowVariant5 = passkeyFlowVariant4;
                                            context3 = context2;
                                            defaultRaise8 = defaultRaise7;
                                            str7 = str5;
                                            passkeyCreateChallengeSuccess = passkeyCreateChallengeSuccess22;
                                            raise5 = raise92;
                                            raise6 = raise5;
                                            com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationSuccess passkeyAttestationSuccess2 = (com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationSuccess) raise5.bind((arrow.core.Either) obj);
                                            passkeyCreateUseCase$invoke$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(context3);
                                            passkeyCreateUseCase$invoke$12.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyFlowVariant5);
                                            passkeyCreateUseCase$invoke$12.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str7);
                                            passkeyCreateUseCase$invoke$12.getInputFormats = defaultRaise8;
                                            passkeyCreateUseCase$invoke$12.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise6);
                                            passkeyCreateUseCase$invoke$12.getOutputMinFrameDuration = raise6;
                                            passkeyCreateUseCase$invoke$12.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str6);
                                            passkeyCreateUseCase$invoke$12.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                                            passkeyCreateUseCase$invoke$12.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyCreateChallengeSuccess);
                                            passkeyCreateUseCase$invoke$12.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyAttestationSuccess2);
                                            passkeyCreateUseCase$invoke$12.getHighSpeedVideoFpsRanges = i12;
                                            passkeyCreateUseCase$invoke$12.getHighSpeedVideoFpsRangesFor = i11;
                                            passkeyCreateUseCase$invoke$12.getHighSpeedVideoSizes = i7;
                                            passkeyCreateUseCase$invoke$12.Camera2StreamConfigurationMap = i10;
                                            passkeyCreateUseCase$invoke$12.getOutputStallDurationlomOqCM = 5;
                                            obj = getHighSpeedVideoFpsRanges(passkeyFlowVariant5, passkeyAttestationSuccess2, passkeyCreateUseCase$invoke$12);
                                            if (obj != coroutine_suspended) {
                                            }
                                        }
                                        return coroutine_suspended;
                                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                                        e = e2;
                                        defaultRaise2 = defaultRaise7;
                                        defaultRaise2.complete();
                                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise2));
                                    } catch (java.lang.Throwable th2) {
                                        th = th2;
                                        defaultRaise = defaultRaise7;
                                        defaultRaise.complete();
                                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                                    }
                                } catch (arrow.core.raise.RaiseCancellationException e3) {
                                    e = e3;
                                    defaultRaise7 = defaultRaise6;
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    defaultRaise7 = defaultRaise6;
                                }
                            } catch (arrow.core.raise.RaiseCancellationException e4) {
                                e = e4;
                                defaultRaise2 = defaultRaise13;
                                defaultRaise2.complete();
                                return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise2));
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                defaultRaise = defaultRaise13;
                                defaultRaise.complete();
                                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                            }
                        }
                        defaultRaise3.bind((arrow.core.Either) obj);
                        passkeyCreateUseCase$invoke$12.getHighResolutionOutputSizeshNQ4ISI = context2;
                        passkeyCreateUseCase$invoke$12.getInputSizeshNQ4ISI = passkeyFlowVariant2;
                        passkeyCreateUseCase$invoke$12.getOutputFormats = str2;
                        passkeyCreateUseCase$invoke$12.getInputFormats = defaultRaise4;
                        passkeyCreateUseCase$invoke$12.getHighSpeedVideoSizesFor = raise;
                        passkeyCreateUseCase$invoke$12.getOutputMinFrameDuration = null;
                        passkeyCreateUseCase$invoke$12.getHighSpeedVideoFpsRanges = i3;
                        passkeyCreateUseCase$invoke$12.getHighSpeedVideoFpsRangesFor = i5;
                        passkeyCreateUseCase$invoke$12.getHighSpeedVideoSizes = i4;
                        passkeyCreateUseCase$invoke$12.Camera2StreamConfigurationMap = i2;
                        passkeyCreateUseCase$invoke$12.getOutputStallDurationlomOqCM = 2;
                        obj = getHighSpeedVideoFpsRanges(passkeyCreateUseCase$invoke$12);
                        if (obj != coroutine_suspended) {
                            i6 = i4;
                            defaultRaise5 = defaultRaise4;
                            str3 = str2;
                            raise2 = raise;
                            passkeyFlowVariant3 = passkeyFlowVariant2;
                            kotlin.Pair pair2 = (kotlin.Pair) obj;
                            java.lang.String str82 = (java.lang.String) pair2.component1();
                            java.lang.String str92 = (java.lang.String) pair2.component2();
                            passkeyCreateUseCase$invoke$12.getHighResolutionOutputSizeshNQ4ISI = context2;
                            passkeyCreateUseCase$invoke$12.getInputSizeshNQ4ISI = passkeyFlowVariant3;
                            passkeyCreateUseCase$invoke$12.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                            passkeyCreateUseCase$invoke$12.getInputFormats = defaultRaise5;
                            passkeyCreateUseCase$invoke$12.getHighSpeedVideoSizesFor = raise2;
                            passkeyCreateUseCase$invoke$12.getOutputMinFrameDuration = raise2;
                            passkeyCreateUseCase$invoke$12.getOutputSizeshNQ4ISI = str82;
                            passkeyCreateUseCase$invoke$12.getOutputMinFrameDurationlomOqCM = str92;
                            passkeyCreateUseCase$invoke$12.getHighSpeedVideoFpsRanges = i3;
                            passkeyCreateUseCase$invoke$12.getHighSpeedVideoFpsRangesFor = i5;
                            passkeyCreateUseCase$invoke$12.getHighSpeedVideoSizes = i6;
                            passkeyCreateUseCase$invoke$12.Camera2StreamConfigurationMap = i2;
                            passkeyCreateUseCase$invoke$12.getOutputStallDurationlomOqCM = 3;
                            highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(passkeyFlowVariant3, str3, passkeyCreateUseCase$invoke$12);
                            if (highSpeedVideoFpsRanges != coroutine_suspended) {
                            }
                        }
                        return coroutine_suspended;
                    }
                }
                if (i != 0) {
                }
                defaultRaise3.bind((arrow.core.Either) obj);
                passkeyCreateUseCase$invoke$12.getHighResolutionOutputSizeshNQ4ISI = context2;
                passkeyCreateUseCase$invoke$12.getInputSizeshNQ4ISI = passkeyFlowVariant2;
                passkeyCreateUseCase$invoke$12.getOutputFormats = str2;
                passkeyCreateUseCase$invoke$12.getInputFormats = defaultRaise4;
                passkeyCreateUseCase$invoke$12.getHighSpeedVideoSizesFor = raise;
                passkeyCreateUseCase$invoke$12.getOutputMinFrameDuration = null;
                passkeyCreateUseCase$invoke$12.getHighSpeedVideoFpsRanges = i3;
                passkeyCreateUseCase$invoke$12.getHighSpeedVideoFpsRangesFor = i5;
                passkeyCreateUseCase$invoke$12.getHighSpeedVideoSizes = i4;
                passkeyCreateUseCase$invoke$12.Camera2StreamConfigurationMap = i2;
                passkeyCreateUseCase$invoke$12.getOutputStallDurationlomOqCM = 2;
                obj = getHighSpeedVideoFpsRanges(passkeyCreateUseCase$invoke$12);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            } catch (arrow.core.raise.RaiseCancellationException e5) {
                e = e5;
            } catch (java.lang.Throwable th5) {
                th = th5;
            }
        } catch (arrow.core.raise.RaiseCancellationException e6) {
            e = e6;
            defaultRaise2 = r3;
        } catch (java.lang.Throwable th6) {
            th = th6;
            defaultRaise = r3;
        }
        passkeyCreateUseCase$invoke$1 = new com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase$invoke$1(this, continuation);
        com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase$invoke$1 passkeyCreateUseCase$invoke$122 = passkeyCreateUseCase$invoke$1;
        obj = passkeyCreateUseCase$invoke$122.getValidOutputFormatsForInputhNQ4ISI;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = passkeyCreateUseCase$invoke$122.getOutputStallDurationlomOqCM;
        r3 = 4;
        r3 = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0091 A[Catch: all -> 0x0040, RaiseCancellationException -> 0x0043, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x0043, all -> 0x0040, blocks: (B:11:0x003c, B:12:0x008b, B:15:0x0091, B:16:0x00b8, B:21:0x00aa, B:22:0x00c8, B:23:0x00cd), top: B:10:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase$checkEligibility$1 passkeyCreateUseCase$checkEligibility$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.Raise raise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.Either either;
        arrow.core.Either right;
        if (continuation instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase$checkEligibility$1) {
            passkeyCreateUseCase$checkEligibility$1 = (com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase$checkEligibility$1) continuation;
            if ((passkeyCreateUseCase$checkEligibility$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                passkeyCreateUseCase$checkEligibility$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = passkeyCreateUseCase$checkEligibility$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = passkeyCreateUseCase$checkEligibility$1.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        boolean checkGate = this.getHighSpeedVideoFpsRanges.checkGate(com.paypal.oslo.feature.identity.remoteconfig.AuthFeatureGates.INSTANCE.getNativePasskeyCreationEnabled());
                        if (checkGate) {
                            com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.SystemPasskeyEligibilityUseCase systemPasskeyEligibilityUseCase = this.getHighSpeedVideoSizes;
                            passkeyCreateUseCase$checkEligibility$1.getHighSpeedVideoFpsRangesFor = defaultRaise;
                            passkeyCreateUseCase$checkEligibility$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                            passkeyCreateUseCase$checkEligibility$1.getInputFormats = defaultRaise3;
                            passkeyCreateUseCase$checkEligibility$1.getHighSpeedVideoFpsRanges = 0;
                            passkeyCreateUseCase$checkEligibility$1.getHighSpeedVideoSizes = 0;
                            passkeyCreateUseCase$checkEligibility$1.Camera2StreamConfigurationMap = 0;
                            passkeyCreateUseCase$checkEligibility$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            passkeyCreateUseCase$checkEligibility$1.getOutputFormats = checkGate;
                            passkeyCreateUseCase$checkEligibility$1.getInputSizeshNQ4ISI = 1;
                            java.lang.Object invoke = systemPasskeyEligibilityUseCase.invoke(passkeyCreateUseCase$checkEligibility$1);
                            if (invoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            raise = defaultRaise3;
                            defaultRaise2 = defaultRaise;
                            obj = invoke;
                        } else {
                            defaultRaise3.raise(new com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.NotEligible(com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason.FeatureDisabled.INSTANCE));
                            throw new kotlin.KotlinNothingValueException();
                        }
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z = passkeyCreateUseCase$checkEligibility$1.getOutputFormats;
                    int i2 = passkeyCreateUseCase$checkEligibility$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i3 = passkeyCreateUseCase$checkEligibility$1.Camera2StreamConfigurationMap;
                    int i4 = passkeyCreateUseCase$checkEligibility$1.getHighSpeedVideoSizes;
                    int i5 = passkeyCreateUseCase$checkEligibility$1.getHighSpeedVideoFpsRanges;
                    raise = (arrow.core.raise.Raise) passkeyCreateUseCase$checkEligibility$1.getInputFormats;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) passkeyCreateUseCase$checkEligibility$1.getHighSpeedVideoFpsRangesFor;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Left)) {
                    right = new arrow.core.Either.Left(new com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.NotEligible((com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                raise.bind(right);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                defaultRaise2.complete();
                return new arrow.core.Either.Right(unit);
            }
        }
        passkeyCreateUseCase$checkEligibility$1 = new com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase$checkEligibility$1(this, continuation);
        java.lang.Object obj2 = passkeyCreateUseCase$checkEligibility$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = passkeyCreateUseCase$checkEligibility$1.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        raise.bind(right);
        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        defaultRaise2.complete();
        return new arrow.core.Either.Right(unit2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(kotlin.coroutines.Continuation<? super kotlin.Pair<java.lang.String, java.lang.String>> continuation) {
        com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase$resolveRememberedUserIdentity$1 passkeyCreateUseCase$resolveRememberedUserIdentity$1;
        int i;
        com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser rememberedUser;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String displayName;
        if (continuation instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase$resolveRememberedUserIdentity$1) {
            passkeyCreateUseCase$resolveRememberedUserIdentity$1 = (com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase$resolveRememberedUserIdentity$1) continuation;
            if ((passkeyCreateUseCase$resolveRememberedUserIdentity$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                passkeyCreateUseCase$resolveRememberedUserIdentity$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = passkeyCreateUseCase$resolveRememberedUserIdentity$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = passkeyCreateUseCase$resolveRememberedUserIdentity$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase getRememberedUserUseCase = this.getHighSpeedVideoSizesFor;
                    passkeyCreateUseCase$resolveRememberedUserIdentity$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = getRememberedUserUseCase.invoke(passkeyCreateUseCase$resolveRememberedUserIdentity$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                rememberedUser = (com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser) ((arrow.core.Either) obj).getOrNull();
                str = null;
                if (rememberedUser != null || (str2 = rememberedUser.getPublicCredential()) == null || kotlin.text.StringsKt.isBlank(str2)) {
                    str2 = null;
                }
                if (rememberedUser != null && (displayName = rememberedUser.getDisplayName()) != null && !kotlin.text.StringsKt.isBlank(displayName)) {
                    str = displayName;
                }
                return kotlin.TuplesKt.to(str2, str);
            }
        }
        passkeyCreateUseCase$resolveRememberedUserIdentity$1 = new com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase$resolveRememberedUserIdentity$1(this, continuation);
        java.lang.Object obj2 = passkeyCreateUseCase$resolveRememberedUserIdentity$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = passkeyCreateUseCase$resolveRememberedUserIdentity$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        rememberedUser = (com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser) ((arrow.core.Either) obj2).getOrNull();
        str = null;
        if (rememberedUser != null) {
        }
        str2 = null;
        if (rememberedUser != null) {
            str = displayName;
        }
        return kotlin.TuplesKt.to(str2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009e A[Catch: all -> 0x004a, RaiseCancellationException -> 0x004d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x004d, all -> 0x004a, blocks: (B:11:0x0046, B:12:0x0098, B:15:0x009e, B:16:0x00c5, B:19:0x00cf, B:21:0x00d5, B:24:0x00e0, B:25:0x00ea, B:29:0x00b7, B:30:0x00eb, B:31:0x00f0), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cf A[Catch: all -> 0x004a, RaiseCancellationException -> 0x004d, TRY_ENTER, TryCatch #3 {RaiseCancellationException -> 0x004d, all -> 0x004a, blocks: (B:11:0x0046, B:12:0x0098, B:15:0x009e, B:16:0x00c5, B:19:0x00cf, B:21:0x00d5, B:24:0x00e0, B:25:0x00ea, B:29:0x00b7, B:30:0x00eb, B:31:0x00f0), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d5 A[Catch: all -> 0x004a, RaiseCancellationException -> 0x004d, TryCatch #3 {RaiseCancellationException -> 0x004d, all -> 0x004a, blocks: (B:11:0x0046, B:12:0x0098, B:15:0x009e, B:16:0x00c5, B:19:0x00cf, B:21:0x00d5, B:24:0x00e0, B:25:0x00ea, B:29:0x00b7, B:30:0x00eb, B:31:0x00f0), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e0 A[Catch: all -> 0x004a, RaiseCancellationException -> 0x004d, TryCatch #3 {RaiseCancellationException -> 0x004d, all -> 0x004a, blocks: (B:11:0x0046, B:12:0x0098, B:15:0x009e, B:16:0x00c5, B:19:0x00cf, B:21:0x00d5, B:24:0x00e0, B:25:0x00ea, B:29:0x00b7, B:30:0x00eb, B:31:0x00f0), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant passkeyFlowVariant, java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError, com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeSuccess>> continuation) {
        com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase$requestEnrollmentChallenge$1 passkeyCreateUseCase$requestEnrollmentChallenge$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.raise.Raise raise2;
        arrow.core.Either either;
        arrow.core.Either right;
        com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeSuccess passkeyCreateChallengeSuccess;
        if (continuation instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase$requestEnrollmentChallenge$1) {
            passkeyCreateUseCase$requestEnrollmentChallenge$1 = (com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase$requestEnrollmentChallenge$1) continuation;
            if ((passkeyCreateUseCase$requestEnrollmentChallenge$1.getOutputSizes & Integer.MIN_VALUE) != 0) {
                passkeyCreateUseCase$requestEnrollmentChallenge$1.getOutputSizes -= 2147483648;
                java.lang.Object obj = passkeyCreateUseCase$requestEnrollmentChallenge$1.getOutputStallDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = passkeyCreateUseCase$requestEnrollmentChallenge$1.getOutputSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeRequest passkeyCreateChallengeRequest = new com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeRequest(passkeyFlowVariant, str);
                        com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.usecase.PasskeyCreateChallengeUseCase passkeyCreateChallengeUseCase = this.getHighSpeedVideoFpsRangesFor;
                        passkeyCreateUseCase$requestEnrollmentChallenge$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyFlowVariant);
                        passkeyCreateUseCase$requestEnrollmentChallenge$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        passkeyCreateUseCase$requestEnrollmentChallenge$1.getInputFormats = defaultRaise;
                        passkeyCreateUseCase$requestEnrollmentChallenge$1.getOutputMinFrameDuration = defaultRaise3;
                        passkeyCreateUseCase$requestEnrollmentChallenge$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyCreateChallengeRequest);
                        passkeyCreateUseCase$requestEnrollmentChallenge$1.getInputSizeshNQ4ISI = defaultRaise3;
                        passkeyCreateUseCase$requestEnrollmentChallenge$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        passkeyCreateUseCase$requestEnrollmentChallenge$1.getHighSpeedVideoFpsRangesFor = 0;
                        passkeyCreateUseCase$requestEnrollmentChallenge$1.getHighSpeedVideoFpsRanges = 0;
                        passkeyCreateUseCase$requestEnrollmentChallenge$1.Camera2StreamConfigurationMap = 0;
                        passkeyCreateUseCase$requestEnrollmentChallenge$1.getOutputSizes = 1;
                        java.lang.Object invoke = passkeyCreateChallengeUseCase.invoke(passkeyCreateChallengeRequest, passkeyCreateUseCase$requestEnrollmentChallenge$1);
                        if (invoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        raise = defaultRaise3;
                        obj = invoke;
                        raise2 = raise;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = passkeyCreateUseCase$requestEnrollmentChallenge$1.Camera2StreamConfigurationMap;
                    int i3 = passkeyCreateUseCase$requestEnrollmentChallenge$1.getHighSpeedVideoFpsRanges;
                    int i4 = passkeyCreateUseCase$requestEnrollmentChallenge$1.getHighSpeedVideoFpsRangesFor;
                    int i5 = passkeyCreateUseCase$requestEnrollmentChallenge$1.getHighResolutionOutputSizeshNQ4ISI;
                    raise2 = (arrow.core.raise.Raise) passkeyCreateUseCase$requestEnrollmentChallenge$1.getInputSizeshNQ4ISI;
                    raise = (arrow.core.raise.Raise) passkeyCreateUseCase$requestEnrollmentChallenge$1.getOutputMinFrameDuration;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) passkeyCreateUseCase$requestEnrollmentChallenge$1.getInputFormats;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Left)) {
                    right = new arrow.core.Either.Left(new com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.ChallengeRequestFailed((com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyEnrollmentOptionResult passkeyEnrollmentOptionResult = (com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyEnrollmentOptionResult) raise2.bind(right);
                passkeyCreateChallengeSuccess = !(passkeyEnrollmentOptionResult instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeSuccess) ? (com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeSuccess) passkeyEnrollmentOptionResult : null;
                if (passkeyCreateChallengeSuccess != null) {
                    raise.raise(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.MissingData.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                defaultRaise2.complete();
                return new arrow.core.Either.Right(passkeyCreateChallengeSuccess);
            }
        }
        passkeyCreateUseCase$requestEnrollmentChallenge$1 = new com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase$requestEnrollmentChallenge$1(this, continuation);
        java.lang.Object obj2 = passkeyCreateUseCase$requestEnrollmentChallenge$1.getOutputStallDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = passkeyCreateUseCase$requestEnrollmentChallenge$1.getOutputSizes;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyEnrollmentOptionResult passkeyEnrollmentOptionResult2 = (com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyEnrollmentOptionResult) raise2.bind(right);
        if (!(passkeyEnrollmentOptionResult2 instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeSuccess)) {
        }
        if (passkeyCreateChallengeSuccess != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c0 A[Catch: all -> 0x0056, RaiseCancellationException -> 0x0059, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x0059, all -> 0x0056, blocks: (B:11:0x0052, B:12:0x00ba, B:15:0x00c0, B:16:0x00e6, B:19:0x00f0, B:21:0x00f6, B:24:0x0101, B:25:0x010b, B:29:0x00d9, B:30:0x010c, B:31:0x0111), top: B:10:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f0 A[Catch: all -> 0x0056, RaiseCancellationException -> 0x0059, TRY_ENTER, TryCatch #3 {RaiseCancellationException -> 0x0059, all -> 0x0056, blocks: (B:11:0x0052, B:12:0x00ba, B:15:0x00c0, B:16:0x00e6, B:19:0x00f0, B:21:0x00f6, B:24:0x0101, B:25:0x010b, B:29:0x00d9, B:30:0x010c, B:31:0x0111), top: B:10:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f6 A[Catch: all -> 0x0056, RaiseCancellationException -> 0x0059, TryCatch #3 {RaiseCancellationException -> 0x0059, all -> 0x0056, blocks: (B:11:0x0052, B:12:0x00ba, B:15:0x00c0, B:16:0x00e6, B:19:0x00f0, B:21:0x00f6, B:24:0x0101, B:25:0x010b, B:29:0x00d9, B:30:0x010c, B:31:0x0111), top: B:10:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0101 A[Catch: all -> 0x0056, RaiseCancellationException -> 0x0059, TryCatch #3 {RaiseCancellationException -> 0x0059, all -> 0x0056, blocks: (B:11:0x0052, B:12:0x00ba, B:15:0x00c0, B:16:0x00e6, B:19:0x00f0, B:21:0x00f6, B:24:0x0101, B:25:0x010b, B:29:0x00d9, B:30:0x010c, B:31:0x0111), top: B:10:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(android.content.Context context, com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallenge passkeyCreateChallenge, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError, com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationSuccess>> continuation) {
        com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase$createPasskeyCredential$1 passkeyCreateUseCase$createPasskeyCredential$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.raise.Raise raise2;
        arrow.core.Either either;
        arrow.core.Either right;
        com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationSuccess passkeyAttestationSuccess;
        if (continuation instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase$createPasskeyCredential$1) {
            passkeyCreateUseCase$createPasskeyCredential$1 = (com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase$createPasskeyCredential$1) continuation;
            if ((passkeyCreateUseCase$createPasskeyCredential$1.getOutputSizes & Integer.MIN_VALUE) != 0) {
                passkeyCreateUseCase$createPasskeyCredential$1.getOutputSizes -= 2147483648;
                java.lang.Object obj = passkeyCreateUseCase$createPasskeyCredential$1.getOutputStallDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = passkeyCreateUseCase$createPasskeyCredential$1.getOutputSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyBindChallenge passkeyBindChallenge = com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeKt.toPasskeyBindChallenge(passkeyCreateChallenge, str, str2);
                        com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationRequest passkeyAttestationRequest = new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationRequest(passkeyBindChallenge, false);
                        com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.repository.PasskeyAttestationRepository passkeyAttestationRepository = this.Camera2StreamConfigurationMap;
                        passkeyCreateUseCase$createPasskeyCredential$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(context);
                        passkeyCreateUseCase$createPasskeyCredential$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyCreateChallenge);
                        passkeyCreateUseCase$createPasskeyCredential$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        passkeyCreateUseCase$createPasskeyCredential$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        passkeyCreateUseCase$createPasskeyCredential$1.getHighSpeedVideoSizesFor = defaultRaise;
                        passkeyCreateUseCase$createPasskeyCredential$1.getOutputMinFrameDuration = defaultRaise3;
                        passkeyCreateUseCase$createPasskeyCredential$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyBindChallenge);
                        passkeyCreateUseCase$createPasskeyCredential$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyAttestationRequest);
                        passkeyCreateUseCase$createPasskeyCredential$1.getOutputSizeshNQ4ISI = defaultRaise3;
                        passkeyCreateUseCase$createPasskeyCredential$1.getHighSpeedVideoSizes = 0;
                        passkeyCreateUseCase$createPasskeyCredential$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        passkeyCreateUseCase$createPasskeyCredential$1.getHighSpeedVideoFpsRangesFor = 0;
                        passkeyCreateUseCase$createPasskeyCredential$1.getHighSpeedVideoFpsRanges = 0;
                        passkeyCreateUseCase$createPasskeyCredential$1.getOutputSizes = 1;
                        java.lang.Object createPasskeyAttestation = passkeyAttestationRepository.createPasskeyAttestation(context, passkeyAttestationRequest, passkeyCreateUseCase$createPasskeyCredential$1);
                        if (createPasskeyAttestation == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        raise = defaultRaise3;
                        obj = createPasskeyAttestation;
                        raise2 = raise;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = passkeyCreateUseCase$createPasskeyCredential$1.getHighSpeedVideoFpsRanges;
                    int i3 = passkeyCreateUseCase$createPasskeyCredential$1.getHighSpeedVideoFpsRangesFor;
                    int i4 = passkeyCreateUseCase$createPasskeyCredential$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i5 = passkeyCreateUseCase$createPasskeyCredential$1.getHighSpeedVideoSizes;
                    raise2 = (arrow.core.raise.Raise) passkeyCreateUseCase$createPasskeyCredential$1.getOutputSizeshNQ4ISI;
                    raise = (arrow.core.raise.Raise) passkeyCreateUseCase$createPasskeyCredential$1.getOutputMinFrameDuration;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) passkeyCreateUseCase$createPasskeyCredential$1.getHighSpeedVideoSizesFor;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Left)) {
                    right = new arrow.core.Either.Left(new com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.AttestationFailed((com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationResult passkeyAttestationResult = (com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationResult) raise2.bind(right);
                passkeyAttestationSuccess = !(passkeyAttestationResult instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationSuccess) ? (com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationSuccess) passkeyAttestationResult : null;
                if (passkeyAttestationSuccess != null) {
                    raise.raise(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.MissingData.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                defaultRaise2.complete();
                return new arrow.core.Either.Right(passkeyAttestationSuccess);
            }
        }
        passkeyCreateUseCase$createPasskeyCredential$1 = new com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase$createPasskeyCredential$1(this, continuation);
        java.lang.Object obj2 = passkeyCreateUseCase$createPasskeyCredential$1.getOutputStallDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = passkeyCreateUseCase$createPasskeyCredential$1.getOutputSizes;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationResult passkeyAttestationResult2 = (com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationResult) raise2.bind(right);
        if (!(passkeyAttestationResult2 instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationSuccess)) {
        }
        if (passkeyAttestationSuccess != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant passkeyFlowVariant, com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationSuccess passkeyAttestationSuccess, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError, com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateSuccess>> continuation) {
        return this.getHighResolutionOutputSizeshNQ4ISI.createPasskey(new com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateRequest(passkeyFlowVariant, passkeyAttestationSuccess.getCredentialId(), passkeyAttestationSuccess.getCredentialId(), passkeyAttestationSuccess.toUrlEncoded()), continuation);
    }
}
