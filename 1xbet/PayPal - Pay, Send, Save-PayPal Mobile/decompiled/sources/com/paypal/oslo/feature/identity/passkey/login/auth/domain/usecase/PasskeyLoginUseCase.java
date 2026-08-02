package com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0086B¢\u0006\u0004\b\u0019\u0010\u001aJ\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001b0\u0016H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0082@¢\u0006\u0004\b\u001f\u0010\u001dJ.\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\"0\u00162\b\u0010 \u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b#\u0010$J,\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020%0\u00162\u0006\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\"H\u0082@¢\u0006\u0004\b&\u0010'J,\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0006\u0010 \u001a\u00020%2\u0006\u0010!\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u001f\u0010(R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010-R\u0014\u0010&\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010.R\u0014\u0010\u001c\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00101R\u0014\u00104\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00103"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/auth/domain/usecase/PasskeyLoginUseCase;", "", "Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/usecase/PasskeyLoginChallengeUseCase;", "passkeyLoginChallengeUseCase", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/usecase/PasskeyAssertionUseCase;", "passkeyAssertionUseCase", "Lcom/paypal/oslo/feature/identity/login/domain/usecase/LoginUseCase;", "loginUseCase", "Lcom/paypal/oslo/feature/identity/shared/domain/Base64Encoder;", "base64Encoder", "Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/usecase/SystemPasskeyEligibilityUseCase;", "systemEligibility", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/usecase/GetRememberedUserUseCase;", "getRememberedUserUseCase", "<init>", "(Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/usecase/PasskeyLoginChallengeUseCase;Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/usecase/PasskeyAssertionUseCase;Lcom/paypal/oslo/feature/identity/login/domain/usecase/LoginUseCase;Lcom/paypal/oslo/feature/identity/shared/domain/Base64Encoder;Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/usecase/SystemPasskeyEligibilityUseCase;Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/usecase/GetRememberedUserUseCase;)V", "Landroid/content/Context;", "activityContext", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "authIntent", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/passkey/login/auth/domain/model/PasskeyLoginError;", "Lcom/paypal/oslo/feature/identity/passkey/login/auth/domain/model/PasskeyLoginSuccess;", "invoke", "(Landroid/content/Context;Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getHighResolutionOutputSizeshNQ4ISI", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getHighSpeedVideoFpsRangesFor", "p0", "p1", "Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginChallengeSuccess;", "Camera2StreamConfigurationMap", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionSuccess;", "getHighSpeedVideoSizes", "(Landroid/content/Context;Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginChallengeSuccess;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionSuccess;Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/usecase/PasskeyLoginChallengeUseCase;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/usecase/PasskeyAssertionUseCase;", "Lcom/paypal/oslo/feature/identity/login/domain/usecase/LoginUseCase;", "Lcom/paypal/oslo/feature/identity/shared/domain/Base64Encoder;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/usecase/SystemPasskeyEligibilityUseCase;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "getOutputFormats", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/usecase/GetRememberedUserUseCase;", "getOutputMinFrameDuration"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasskeyLoginUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase getOutputMinFrameDuration;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.identity.passkey.login.assertion.domain.usecase.PasskeyAssertionUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate getOutputFormats;
    private final com.paypal.oslo.feature.identity.shared.domain.Base64Encoder getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.SystemPasskeyEligibilityUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.passkey.login.challenge.domain.usecase.PasskeyLoginChallengeUseCase Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public PasskeyLoginUseCase(com.paypal.oslo.feature.identity.passkey.login.challenge.domain.usecase.PasskeyLoginChallengeUseCase passkeyLoginChallengeUseCase, com.paypal.oslo.feature.identity.passkey.login.assertion.domain.usecase.PasskeyAssertionUseCase passkeyAssertionUseCase, com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase loginUseCase, com.paypal.oslo.feature.identity.shared.domain.Base64Encoder base64Encoder, com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.SystemPasskeyEligibilityUseCase systemPasskeyEligibilityUseCase, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase getRememberedUserUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyLoginChallengeUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyAssertionUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base64Encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(systemPasskeyEligibilityUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getRememberedUserUseCase, "");
        this.Camera2StreamConfigurationMap = passkeyLoginChallengeUseCase;
        this.getHighSpeedVideoFpsRanges = passkeyAssertionUseCase;
        this.getHighSpeedVideoFpsRangesFor = loginUseCase;
        this.getHighSpeedVideoSizes = base64Encoder;
        this.getHighResolutionOutputSizeshNQ4ISI = systemPasskeyEligibilityUseCase;
        this.getOutputFormats = featureGate;
        this.getOutputMinFrameDuration = getRememberedUserUseCase;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r11v14, types: [arrow.core.raise.Raise] */
    /* JADX WARN: Type inference failed for: r12v17, types: [arrow.core.raise.Raise] */
    /* JADX WARN: Type inference failed for: r13v14, types: [arrow.core.raise.Raise] */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v4, types: [arrow.core.raise.DefaultRaise] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(android.content.Context context, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError, com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginSuccess>> continuation) {
        com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase$invoke$1 passkeyLoginUseCase$invoke$1;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        ?? r4;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        android.content.Context context2;
        int i;
        com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent2;
        arrow.core.raise.DefaultRaise defaultRaise3;
        arrow.core.raise.DefaultRaise defaultRaise4;
        int i2;
        int i3;
        int i4;
        arrow.core.raise.Raise raise;
        android.content.Context context3;
        com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent3;
        arrow.core.raise.Raise raise2;
        arrow.core.raise.Raise raise3;
        java.lang.String str;
        int i5;
        int i6;
        int i7;
        com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeSuccess passkeyLoginChallengeSuccess;
        arrow.core.raise.DefaultRaise defaultRaise5;
        arrow.core.raise.Raise raise4;
        int i8;
        int i9;
        int i10;
        java.lang.String str2;
        arrow.core.raise.DefaultRaise defaultRaise6;
        java.lang.Object highSpeedVideoSizes;
        com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent4;
        int i11;
        arrow.core.raise.DefaultRaise defaultRaise7;
        java.lang.Object Camera2StreamConfigurationMap;
        arrow.core.raise.DefaultRaise defaultRaise8;
        try {
            if (continuation instanceof com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase$invoke$1) {
                passkeyLoginUseCase$invoke$1 = (com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase$invoke$1) continuation;
                if ((passkeyLoginUseCase$invoke$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                    passkeyLoginUseCase$invoke$1.getOutputStallDurationlomOqCM -= 2147483648;
                    obj = passkeyLoginUseCase$invoke$1.getOutputSizes;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r4 = passkeyLoginUseCase$invoke$1.getOutputStallDurationlomOqCM;
                    if (r4 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        arrow.core.raise.DefaultRaise defaultRaise9 = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise10 = defaultRaise9;
                        context2 = context;
                        passkeyLoginUseCase$invoke$1.getHighSpeedVideoSizes = context2;
                        passkeyLoginUseCase$invoke$1.getInputFormats = authIntent;
                        passkeyLoginUseCase$invoke$1.getOutputMinFrameDuration = defaultRaise9;
                        passkeyLoginUseCase$invoke$1.getInputSizeshNQ4ISI = defaultRaise10;
                        passkeyLoginUseCase$invoke$1.getHighSpeedVideoSizesFor = defaultRaise10;
                        passkeyLoginUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        passkeyLoginUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                        passkeyLoginUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                        passkeyLoginUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                        passkeyLoginUseCase$invoke$1.getOutputStallDurationlomOqCM = 1;
                        java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(passkeyLoginUseCase$invoke$1);
                        if (highResolutionOutputSizeshNQ4ISI != coroutine_suspended) {
                            i = 0;
                            authIntent2 = authIntent;
                            defaultRaise3 = defaultRaise10;
                            defaultRaise4 = defaultRaise3;
                            i2 = 0;
                            i3 = 0;
                            obj = highResolutionOutputSizeshNQ4ISI;
                            i4 = 0;
                            defaultRaise8 = defaultRaise9;
                        }
                        return coroutine_suspended;
                    }
                    if (r4 != 1) {
                        try {
                            if (r4 == 2) {
                                int i12 = passkeyLoginUseCase$invoke$1.Camera2StreamConfigurationMap;
                                i11 = passkeyLoginUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                                int i13 = passkeyLoginUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                                i8 = passkeyLoginUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                                ?? r11 = (arrow.core.raise.Raise) passkeyLoginUseCase$invoke$1.getInputSizeshNQ4ISI;
                                arrow.core.raise.DefaultRaise defaultRaise11 = (arrow.core.raise.DefaultRaise) passkeyLoginUseCase$invoke$1.getOutputMinFrameDuration;
                                authIntent4 = (com.paypal.oslo.feature.identity.login.domain.model.AuthIntent) passkeyLoginUseCase$invoke$1.getInputFormats;
                                android.content.Context context4 = (android.content.Context) passkeyLoginUseCase$invoke$1.getHighSpeedVideoSizes;
                                kotlin.ResultKt.throwOnFailure(obj);
                                context2 = context4;
                                defaultRaise4 = r11;
                                i = i13;
                                i4 = i12;
                                defaultRaise7 = defaultRaise11;
                                java.lang.String str3 = (java.lang.String) obj;
                                passkeyLoginUseCase$invoke$1.getHighSpeedVideoSizes = context2;
                                passkeyLoginUseCase$invoke$1.getInputFormats = authIntent4;
                                passkeyLoginUseCase$invoke$1.getOutputMinFrameDuration = defaultRaise7;
                                passkeyLoginUseCase$invoke$1.getInputSizeshNQ4ISI = defaultRaise4;
                                passkeyLoginUseCase$invoke$1.getHighSpeedVideoSizesFor = defaultRaise4;
                                passkeyLoginUseCase$invoke$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                                passkeyLoginUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i8;
                                passkeyLoginUseCase$invoke$1.getHighSpeedVideoFpsRanges = i;
                                passkeyLoginUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i11;
                                passkeyLoginUseCase$invoke$1.Camera2StreamConfigurationMap = i4;
                                passkeyLoginUseCase$invoke$1.getOutputStallDurationlomOqCM = 3;
                                Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(str3, authIntent4, passkeyLoginUseCase$invoke$1);
                                if (Camera2StreamConfigurationMap != coroutine_suspended) {
                                    context3 = context2;
                                    str2 = str3;
                                    obj = Camera2StreamConfigurationMap;
                                    i10 = i11;
                                    i9 = i;
                                    raise4 = defaultRaise4;
                                    authIntent3 = authIntent4;
                                    raise2 = raise4;
                                    defaultRaise6 = defaultRaise7;
                                    com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeSuccess passkeyLoginChallengeSuccess2 = (com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeSuccess) raise4.bind((arrow.core.Either) obj);
                                    passkeyLoginUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(context3);
                                    passkeyLoginUseCase$invoke$1.getInputFormats = authIntent3;
                                    passkeyLoginUseCase$invoke$1.getOutputMinFrameDuration = defaultRaise6;
                                    passkeyLoginUseCase$invoke$1.getInputSizeshNQ4ISI = raise2;
                                    passkeyLoginUseCase$invoke$1.getHighSpeedVideoSizesFor = raise2;
                                    passkeyLoginUseCase$invoke$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                                    passkeyLoginUseCase$invoke$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyLoginChallengeSuccess2);
                                    passkeyLoginUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i8;
                                    passkeyLoginUseCase$invoke$1.getHighSpeedVideoFpsRanges = i9;
                                    passkeyLoginUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i10;
                                    passkeyLoginUseCase$invoke$1.Camera2StreamConfigurationMap = i4;
                                    passkeyLoginUseCase$invoke$1.getOutputStallDurationlomOqCM = 4;
                                    highSpeedVideoSizes = getHighSpeedVideoSizes(context3, passkeyLoginChallengeSuccess2, passkeyLoginUseCase$invoke$1);
                                    if (highSpeedVideoSizes != coroutine_suspended) {
                                    }
                                }
                                return coroutine_suspended;
                            }
                            if (r4 == 3) {
                                int i14 = passkeyLoginUseCase$invoke$1.Camera2StreamConfigurationMap;
                                i10 = passkeyLoginUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                                i9 = passkeyLoginUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                                int i15 = passkeyLoginUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                                java.lang.String str4 = (java.lang.String) passkeyLoginUseCase$invoke$1.getOutputFormats;
                                raise4 = (arrow.core.raise.Raise) passkeyLoginUseCase$invoke$1.getHighSpeedVideoSizesFor;
                                raise2 = (arrow.core.raise.Raise) passkeyLoginUseCase$invoke$1.getInputSizeshNQ4ISI;
                                arrow.core.raise.DefaultRaise defaultRaise12 = (arrow.core.raise.DefaultRaise) passkeyLoginUseCase$invoke$1.getOutputMinFrameDuration;
                                authIntent3 = (com.paypal.oslo.feature.identity.login.domain.model.AuthIntent) passkeyLoginUseCase$invoke$1.getInputFormats;
                                context3 = (android.content.Context) passkeyLoginUseCase$invoke$1.getHighSpeedVideoSizes;
                                kotlin.ResultKt.throwOnFailure(obj);
                                str2 = str4;
                                i8 = i15;
                                i4 = i14;
                                defaultRaise6 = defaultRaise12;
                                com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeSuccess passkeyLoginChallengeSuccess22 = (com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeSuccess) raise4.bind((arrow.core.Either) obj);
                                passkeyLoginUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(context3);
                                passkeyLoginUseCase$invoke$1.getInputFormats = authIntent3;
                                passkeyLoginUseCase$invoke$1.getOutputMinFrameDuration = defaultRaise6;
                                passkeyLoginUseCase$invoke$1.getInputSizeshNQ4ISI = raise2;
                                passkeyLoginUseCase$invoke$1.getHighSpeedVideoSizesFor = raise2;
                                passkeyLoginUseCase$invoke$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                                passkeyLoginUseCase$invoke$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyLoginChallengeSuccess22);
                                passkeyLoginUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i8;
                                passkeyLoginUseCase$invoke$1.getHighSpeedVideoFpsRanges = i9;
                                passkeyLoginUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i10;
                                passkeyLoginUseCase$invoke$1.Camera2StreamConfigurationMap = i4;
                                passkeyLoginUseCase$invoke$1.getOutputStallDurationlomOqCM = 4;
                                highSpeedVideoSizes = getHighSpeedVideoSizes(context3, passkeyLoginChallengeSuccess22, passkeyLoginUseCase$invoke$1);
                                if (highSpeedVideoSizes != coroutine_suspended) {
                                    raise3 = raise2;
                                    java.lang.String str5 = str2;
                                    passkeyLoginChallengeSuccess = passkeyLoginChallengeSuccess22;
                                    obj = highSpeedVideoSizes;
                                    i7 = i10;
                                    i6 = i9;
                                    i5 = i8;
                                    str = str5;
                                    defaultRaise5 = defaultRaise6;
                                    com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionSuccess passkeyAssertionSuccess = (com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionSuccess) raise3.bind((arrow.core.Either) obj);
                                    passkeyLoginUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(context3);
                                    passkeyLoginUseCase$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(authIntent3);
                                    passkeyLoginUseCase$invoke$1.getOutputMinFrameDuration = defaultRaise5;
                                    passkeyLoginUseCase$invoke$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise2);
                                    passkeyLoginUseCase$invoke$1.getHighSpeedVideoSizesFor = raise2;
                                    passkeyLoginUseCase$invoke$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                                    passkeyLoginUseCase$invoke$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyLoginChallengeSuccess);
                                    passkeyLoginUseCase$invoke$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyAssertionSuccess);
                                    passkeyLoginUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i5;
                                    passkeyLoginUseCase$invoke$1.getHighSpeedVideoFpsRanges = i6;
                                    passkeyLoginUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i7;
                                    passkeyLoginUseCase$invoke$1.Camera2StreamConfigurationMap = i4;
                                    passkeyLoginUseCase$invoke$1.getOutputStallDurationlomOqCM = 5;
                                    obj = getHighSpeedVideoFpsRangesFor(passkeyAssertionSuccess, authIntent3, passkeyLoginUseCase$invoke$1);
                                    if (obj != coroutine_suspended) {
                                    }
                                }
                                return coroutine_suspended;
                            }
                            if (r4 != 4) {
                                if (r4 != 5) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i16 = passkeyLoginUseCase$invoke$1.Camera2StreamConfigurationMap;
                                int i17 = passkeyLoginUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                                int i18 = passkeyLoginUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                                int i19 = passkeyLoginUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                                raise = (arrow.core.raise.Raise) passkeyLoginUseCase$invoke$1.getHighSpeedVideoSizesFor;
                                arrow.core.raise.DefaultRaise defaultRaise13 = (arrow.core.raise.DefaultRaise) passkeyLoginUseCase$invoke$1.getOutputMinFrameDuration;
                                kotlin.ResultKt.throwOnFailure(obj);
                                r4 = defaultRaise13;
                                com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginSuccess passkeyLoginSuccess = (com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginSuccess) raise.bind((arrow.core.Either) obj);
                                r4.complete();
                                return new arrow.core.Either.Right(passkeyLoginSuccess);
                            }
                            int i20 = passkeyLoginUseCase$invoke$1.Camera2StreamConfigurationMap;
                            i7 = passkeyLoginUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                            i6 = passkeyLoginUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                            i5 = passkeyLoginUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                            com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeSuccess passkeyLoginChallengeSuccess3 = (com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeSuccess) passkeyLoginUseCase$invoke$1.getOutputMinFrameDurationlomOqCM;
                            str = (java.lang.String) passkeyLoginUseCase$invoke$1.getOutputFormats;
                            raise3 = (arrow.core.raise.Raise) passkeyLoginUseCase$invoke$1.getHighSpeedVideoSizesFor;
                            raise2 = (arrow.core.raise.Raise) passkeyLoginUseCase$invoke$1.getInputSizeshNQ4ISI;
                            arrow.core.raise.DefaultRaise defaultRaise14 = (arrow.core.raise.DefaultRaise) passkeyLoginUseCase$invoke$1.getOutputMinFrameDuration;
                            authIntent3 = (com.paypal.oslo.feature.identity.login.domain.model.AuthIntent) passkeyLoginUseCase$invoke$1.getInputFormats;
                            context3 = (android.content.Context) passkeyLoginUseCase$invoke$1.getHighSpeedVideoSizes;
                            kotlin.ResultKt.throwOnFailure(obj);
                            passkeyLoginChallengeSuccess = passkeyLoginChallengeSuccess3;
                            i4 = i20;
                            defaultRaise5 = defaultRaise14;
                            com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionSuccess passkeyAssertionSuccess2 = (com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionSuccess) raise3.bind((arrow.core.Either) obj);
                            passkeyLoginUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(context3);
                            passkeyLoginUseCase$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(authIntent3);
                            passkeyLoginUseCase$invoke$1.getOutputMinFrameDuration = defaultRaise5;
                            passkeyLoginUseCase$invoke$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise2);
                            passkeyLoginUseCase$invoke$1.getHighSpeedVideoSizesFor = raise2;
                            passkeyLoginUseCase$invoke$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                            passkeyLoginUseCase$invoke$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyLoginChallengeSuccess);
                            passkeyLoginUseCase$invoke$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyAssertionSuccess2);
                            passkeyLoginUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i5;
                            passkeyLoginUseCase$invoke$1.getHighSpeedVideoFpsRanges = i6;
                            passkeyLoginUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i7;
                            passkeyLoginUseCase$invoke$1.Camera2StreamConfigurationMap = i4;
                            passkeyLoginUseCase$invoke$1.getOutputStallDurationlomOqCM = 5;
                            obj = getHighSpeedVideoFpsRangesFor(passkeyAssertionSuccess2, authIntent3, passkeyLoginUseCase$invoke$1);
                            if (obj != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            raise = raise2;
                            r4 = defaultRaise5;
                            com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginSuccess passkeyLoginSuccess2 = (com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginSuccess) raise.bind((arrow.core.Either) obj);
                            r4.complete();
                            return new arrow.core.Either.Right(passkeyLoginSuccess2);
                        } catch (arrow.core.raise.RaiseCancellationException e) {
                            e = e;
                            defaultRaise2.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise2));
                        } catch (java.lang.Throwable th) {
                            th = th;
                            defaultRaise.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    }
                    int i21 = passkeyLoginUseCase$invoke$1.Camera2StreamConfigurationMap;
                    int i22 = passkeyLoginUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    int i23 = passkeyLoginUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    int i24 = passkeyLoginUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    ?? r12 = (arrow.core.raise.Raise) passkeyLoginUseCase$invoke$1.getHighSpeedVideoSizesFor;
                    ?? r13 = (arrow.core.raise.Raise) passkeyLoginUseCase$invoke$1.getInputSizeshNQ4ISI;
                    arrow.core.raise.DefaultRaise defaultRaise15 = (arrow.core.raise.DefaultRaise) passkeyLoginUseCase$invoke$1.getOutputMinFrameDuration;
                    authIntent2 = (com.paypal.oslo.feature.identity.login.domain.model.AuthIntent) passkeyLoginUseCase$invoke$1.getInputFormats;
                    context2 = (android.content.Context) passkeyLoginUseCase$invoke$1.getHighSpeedVideoSizes;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        i4 = i21;
                        defaultRaise8 = defaultRaise15;
                        defaultRaise4 = r13;
                        defaultRaise3 = r12;
                        i3 = i24;
                        i = i23;
                        i2 = i22;
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise2 = defaultRaise15;
                        defaultRaise2.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise2));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise15;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                    defaultRaise3.bind((arrow.core.Either) obj);
                    passkeyLoginUseCase$invoke$1.getHighSpeedVideoSizes = context2;
                    passkeyLoginUseCase$invoke$1.getInputFormats = authIntent2;
                    passkeyLoginUseCase$invoke$1.getOutputMinFrameDuration = defaultRaise8;
                    passkeyLoginUseCase$invoke$1.getInputSizeshNQ4ISI = defaultRaise4;
                    passkeyLoginUseCase$invoke$1.getHighSpeedVideoSizesFor = null;
                    passkeyLoginUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i3;
                    passkeyLoginUseCase$invoke$1.getHighSpeedVideoFpsRanges = i;
                    passkeyLoginUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i2;
                    passkeyLoginUseCase$invoke$1.Camera2StreamConfigurationMap = i4;
                    passkeyLoginUseCase$invoke$1.getOutputStallDurationlomOqCM = 2;
                    obj = getHighSpeedVideoFpsRangesFor(passkeyLoginUseCase$invoke$1);
                    if (obj != coroutine_suspended) {
                        i11 = i2;
                        i8 = i3;
                        authIntent4 = authIntent2;
                        defaultRaise7 = defaultRaise8;
                        java.lang.String str32 = (java.lang.String) obj;
                        passkeyLoginUseCase$invoke$1.getHighSpeedVideoSizes = context2;
                        passkeyLoginUseCase$invoke$1.getInputFormats = authIntent4;
                        passkeyLoginUseCase$invoke$1.getOutputMinFrameDuration = defaultRaise7;
                        passkeyLoginUseCase$invoke$1.getInputSizeshNQ4ISI = defaultRaise4;
                        passkeyLoginUseCase$invoke$1.getHighSpeedVideoSizesFor = defaultRaise4;
                        passkeyLoginUseCase$invoke$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str32);
                        passkeyLoginUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i8;
                        passkeyLoginUseCase$invoke$1.getHighSpeedVideoFpsRanges = i;
                        passkeyLoginUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i11;
                        passkeyLoginUseCase$invoke$1.Camera2StreamConfigurationMap = i4;
                        passkeyLoginUseCase$invoke$1.getOutputStallDurationlomOqCM = 3;
                        Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(str32, authIntent4, passkeyLoginUseCase$invoke$1);
                        if (Camera2StreamConfigurationMap != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
            }
            if (r4 != 0) {
            }
            defaultRaise3.bind((arrow.core.Either) obj);
            passkeyLoginUseCase$invoke$1.getHighSpeedVideoSizes = context2;
            passkeyLoginUseCase$invoke$1.getInputFormats = authIntent2;
            passkeyLoginUseCase$invoke$1.getOutputMinFrameDuration = defaultRaise8;
            passkeyLoginUseCase$invoke$1.getInputSizeshNQ4ISI = defaultRaise4;
            passkeyLoginUseCase$invoke$1.getHighSpeedVideoSizesFor = null;
            passkeyLoginUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i3;
            passkeyLoginUseCase$invoke$1.getHighSpeedVideoFpsRanges = i;
            passkeyLoginUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i2;
            passkeyLoginUseCase$invoke$1.Camera2StreamConfigurationMap = i4;
            passkeyLoginUseCase$invoke$1.getOutputStallDurationlomOqCM = 2;
            obj = getHighSpeedVideoFpsRangesFor(passkeyLoginUseCase$invoke$1);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (arrow.core.raise.RaiseCancellationException e3) {
            e = e3;
            defaultRaise2 = r4;
        } catch (java.lang.Throwable th3) {
            th = th3;
            defaultRaise = r4;
        }
        passkeyLoginUseCase$invoke$1 = new com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase$invoke$1(this, continuation);
        obj = passkeyLoginUseCase$invoke$1.getOutputSizes;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r4 = passkeyLoginUseCase$invoke$1.getOutputStallDurationlomOqCM;
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase passkeyLoginUseCase, android.content.Context context, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            authIntent = com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.LOGIN;
        }
        return passkeyLoginUseCase.invoke(context, authIntent, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0091 A[Catch: all -> 0x0040, RaiseCancellationException -> 0x0043, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x0043, all -> 0x0040, blocks: (B:11:0x003c, B:12:0x008b, B:15:0x0091, B:16:0x00b8, B:21:0x00aa, B:22:0x00c8, B:23:0x00cd), top: B:10:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase$checkEligibility$1 passkeyLoginUseCase$checkEligibility$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.Raise raise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.Either either;
        arrow.core.Either right;
        if (continuation instanceof com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase$checkEligibility$1) {
            passkeyLoginUseCase$checkEligibility$1 = (com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase$checkEligibility$1) continuation;
            if ((passkeyLoginUseCase$checkEligibility$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                passkeyLoginUseCase$checkEligibility$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = passkeyLoginUseCase$checkEligibility$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = passkeyLoginUseCase$checkEligibility$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        boolean checkGate = this.getOutputFormats.checkGate(com.paypal.oslo.feature.identity.remoteconfig.AuthFeatureGates.INSTANCE.getNativePasskeyLoginEnabled());
                        if (checkGate) {
                            com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.SystemPasskeyEligibilityUseCase systemPasskeyEligibilityUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                            passkeyLoginUseCase$checkEligibility$1.Camera2StreamConfigurationMap = defaultRaise;
                            passkeyLoginUseCase$checkEligibility$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                            passkeyLoginUseCase$checkEligibility$1.getHighSpeedVideoSizesFor = defaultRaise3;
                            passkeyLoginUseCase$checkEligibility$1.getHighSpeedVideoFpsRangesFor = 0;
                            passkeyLoginUseCase$checkEligibility$1.getHighSpeedVideoFpsRanges = 0;
                            passkeyLoginUseCase$checkEligibility$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            passkeyLoginUseCase$checkEligibility$1.getHighSpeedVideoSizes = 0;
                            passkeyLoginUseCase$checkEligibility$1.getOutputMinFrameDuration = checkGate;
                            passkeyLoginUseCase$checkEligibility$1.getOutputFormats = 1;
                            java.lang.Object invoke = systemPasskeyEligibilityUseCase.invoke(passkeyLoginUseCase$checkEligibility$1);
                            if (invoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            raise = defaultRaise3;
                            defaultRaise2 = defaultRaise;
                            obj = invoke;
                        } else {
                            defaultRaise3.raise(new com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError.NotEligible(com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason.FeatureDisabled.INSTANCE));
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
                    boolean z = passkeyLoginUseCase$checkEligibility$1.getOutputMinFrameDuration;
                    int i2 = passkeyLoginUseCase$checkEligibility$1.getHighSpeedVideoSizes;
                    int i3 = passkeyLoginUseCase$checkEligibility$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i4 = passkeyLoginUseCase$checkEligibility$1.getHighSpeedVideoFpsRanges;
                    int i5 = passkeyLoginUseCase$checkEligibility$1.getHighSpeedVideoFpsRangesFor;
                    raise = (arrow.core.raise.Raise) passkeyLoginUseCase$checkEligibility$1.getHighSpeedVideoSizesFor;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) passkeyLoginUseCase$checkEligibility$1.Camera2StreamConfigurationMap;
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
                    right = new arrow.core.Either.Left(new com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError.NotEligible((com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason) ((arrow.core.Either.Left) either).getValue()));
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
        passkeyLoginUseCase$checkEligibility$1 = new com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase$checkEligibility$1(this, continuation);
        java.lang.Object obj2 = passkeyLoginUseCase$checkEligibility$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = passkeyLoginUseCase$checkEligibility$1.getOutputFormats;
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
    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase$resolvePartyId$1 passkeyLoginUseCase$resolvePartyId$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase$resolvePartyId$1) {
            passkeyLoginUseCase$resolvePartyId$1 = (com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase$resolvePartyId$1) continuation;
            if ((passkeyLoginUseCase$resolvePartyId$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                passkeyLoginUseCase$resolvePartyId$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = passkeyLoginUseCase$resolvePartyId$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = passkeyLoginUseCase$resolvePartyId$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase getRememberedUserUseCase = this.getOutputMinFrameDuration;
                    passkeyLoginUseCase$resolvePartyId$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = getRememberedUserUseCase.invoke(passkeyLoginUseCase$resolvePartyId$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    java.lang.String userId = ((com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser) ((arrow.core.Either.Right) either).getValue()).getUserId();
                    if (kotlin.text.StringsKt.isBlank(userId)) {
                        return null;
                    }
                    return userId;
                }
                if (!(either instanceof arrow.core.Either.Left)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return null;
            }
        }
        passkeyLoginUseCase$resolvePartyId$1 = new com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase$resolvePartyId$1(this, continuation);
        java.lang.Object obj2 = passkeyLoginUseCase$resolvePartyId$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = passkeyLoginUseCase$resolvePartyId$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b2 A[Catch: all -> 0x004e, RaiseCancellationException -> 0x0051, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x0051, all -> 0x004e, blocks: (B:11:0x004a, B:12:0x00ac, B:15:0x00b2, B:16:0x00d9, B:19:0x00e3, B:21:0x00e9, B:24:0x00f4, B:25:0x0105, B:29:0x00cb, B:30:0x0106, B:31:0x010b), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e3 A[Catch: all -> 0x004e, RaiseCancellationException -> 0x0051, TRY_ENTER, TryCatch #3 {RaiseCancellationException -> 0x0051, all -> 0x004e, blocks: (B:11:0x004a, B:12:0x00ac, B:15:0x00b2, B:16:0x00d9, B:19:0x00e3, B:21:0x00e9, B:24:0x00f4, B:25:0x0105, B:29:0x00cb, B:30:0x0106, B:31:0x010b), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e9 A[Catch: all -> 0x004e, RaiseCancellationException -> 0x0051, TryCatch #3 {RaiseCancellationException -> 0x0051, all -> 0x004e, blocks: (B:11:0x004a, B:12:0x00ac, B:15:0x00b2, B:16:0x00d9, B:19:0x00e3, B:21:0x00e9, B:24:0x00f4, B:25:0x0105, B:29:0x00cb, B:30:0x0106, B:31:0x010b), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f4 A[Catch: all -> 0x004e, RaiseCancellationException -> 0x0051, TryCatch #3 {RaiseCancellationException -> 0x0051, all -> 0x004e, blocks: (B:11:0x004a, B:12:0x00ac, B:15:0x00b2, B:16:0x00d9, B:19:0x00e3, B:21:0x00e9, B:24:0x00f4, B:25:0x0105, B:29:0x00cb, B:30:0x0106, B:31:0x010b), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(java.lang.String str, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError, com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeSuccess>> continuation) {
        com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase$requestLoginChallenge$1 passkeyLoginUseCase$requestLoginChallenge$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.raise.Raise raise2;
        arrow.core.Either either;
        arrow.core.Either right;
        com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeSuccess passkeyLoginChallengeSuccess;
        if (continuation instanceof com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase$requestLoginChallenge$1) {
            passkeyLoginUseCase$requestLoginChallenge$1 = (com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase$requestLoginChallenge$1) continuation;
            if ((passkeyLoginUseCase$requestLoginChallenge$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                passkeyLoginUseCase$requestLoginChallenge$1.getOutputStallDurationlomOqCM -= 2147483648;
                java.lang.Object obj = passkeyLoginUseCase$requestLoginChallenge$1.getOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = passkeyLoginUseCase$requestLoginChallenge$1.getOutputStallDurationlomOqCM;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        java.lang.String encode = this.getHighSpeedVideoSizes.encode(com.paypal.oslo.feature.identity.devicebinding.security.utils.NonceUtilsKt.generateNonce());
                        com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeRequest passkeyLoginChallengeRequest = new com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeRequest(encode, str, authIntent);
                        com.paypal.oslo.feature.identity.passkey.login.challenge.domain.usecase.PasskeyLoginChallengeUseCase passkeyLoginChallengeUseCase = this.Camera2StreamConfigurationMap;
                        passkeyLoginUseCase$requestLoginChallenge$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        passkeyLoginUseCase$requestLoginChallenge$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(authIntent);
                        passkeyLoginUseCase$requestLoginChallenge$1.getInputSizeshNQ4ISI = defaultRaise;
                        passkeyLoginUseCase$requestLoginChallenge$1.getHighSpeedVideoSizesFor = defaultRaise3;
                        passkeyLoginUseCase$requestLoginChallenge$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(encode);
                        passkeyLoginUseCase$requestLoginChallenge$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyLoginChallengeRequest);
                        passkeyLoginUseCase$requestLoginChallenge$1.getOutputStallDuration = defaultRaise3;
                        passkeyLoginUseCase$requestLoginChallenge$1.getHighSpeedVideoFpsRanges = 0;
                        passkeyLoginUseCase$requestLoginChallenge$1.getHighSpeedVideoSizes = 0;
                        passkeyLoginUseCase$requestLoginChallenge$1.Camera2StreamConfigurationMap = 0;
                        passkeyLoginUseCase$requestLoginChallenge$1.getHighSpeedVideoFpsRangesFor = 0;
                        passkeyLoginUseCase$requestLoginChallenge$1.getOutputStallDurationlomOqCM = 1;
                        java.lang.Object invoke = passkeyLoginChallengeUseCase.invoke(passkeyLoginChallengeRequest, passkeyLoginUseCase$requestLoginChallenge$1);
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
                    int i2 = passkeyLoginUseCase$requestLoginChallenge$1.getHighSpeedVideoFpsRangesFor;
                    int i3 = passkeyLoginUseCase$requestLoginChallenge$1.Camera2StreamConfigurationMap;
                    int i4 = passkeyLoginUseCase$requestLoginChallenge$1.getHighSpeedVideoSizes;
                    int i5 = passkeyLoginUseCase$requestLoginChallenge$1.getHighSpeedVideoFpsRanges;
                    raise2 = (arrow.core.raise.Raise) passkeyLoginUseCase$requestLoginChallenge$1.getOutputStallDuration;
                    raise = (arrow.core.raise.Raise) passkeyLoginUseCase$requestLoginChallenge$1.getHighSpeedVideoSizesFor;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) passkeyLoginUseCase$requestLoginChallenge$1.getInputSizeshNQ4ISI;
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
                    right = new arrow.core.Either.Left(new com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError.ChallengeRequestFailed((com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeResult passkeyLoginChallengeResult = (com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeResult) raise2.bind(right);
                passkeyLoginChallengeSuccess = !(passkeyLoginChallengeResult instanceof com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeSuccess) ? (com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeSuccess) passkeyLoginChallengeResult : null;
                if (passkeyLoginChallengeSuccess != null) {
                    raise.raise(new com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError.ChallengeRequestFailed(com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeError.MissingData.INSTANCE));
                    throw new kotlin.KotlinNothingValueException();
                }
                defaultRaise2.complete();
                return new arrow.core.Either.Right(passkeyLoginChallengeSuccess);
            }
        }
        passkeyLoginUseCase$requestLoginChallenge$1 = new com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase$requestLoginChallenge$1(this, continuation);
        java.lang.Object obj2 = passkeyLoginUseCase$requestLoginChallenge$1.getOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = passkeyLoginUseCase$requestLoginChallenge$1.getOutputStallDurationlomOqCM;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeResult passkeyLoginChallengeResult2 = (com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeResult) raise2.bind(right);
        if (!(passkeyLoginChallengeResult2 instanceof com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeSuccess)) {
        }
        if (passkeyLoginChallengeSuccess != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00aa A[Catch: all -> 0x004a, RaiseCancellationException -> 0x004d, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x004d, all -> 0x004a, blocks: (B:11:0x0046, B:12:0x00a4, B:15:0x00aa, B:16:0x00d1, B:19:0x00dc, B:21:0x00e2, B:24:0x00ed, B:25:0x0102, B:29:0x00c3, B:30:0x0103, B:31:0x0108), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00dc A[Catch: all -> 0x004a, RaiseCancellationException -> 0x004d, TRY_ENTER, TryCatch #4 {RaiseCancellationException -> 0x004d, all -> 0x004a, blocks: (B:11:0x0046, B:12:0x00a4, B:15:0x00aa, B:16:0x00d1, B:19:0x00dc, B:21:0x00e2, B:24:0x00ed, B:25:0x0102, B:29:0x00c3, B:30:0x0103, B:31:0x0108), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e2 A[Catch: all -> 0x004a, RaiseCancellationException -> 0x004d, TryCatch #4 {RaiseCancellationException -> 0x004d, all -> 0x004a, blocks: (B:11:0x0046, B:12:0x00a4, B:15:0x00aa, B:16:0x00d1, B:19:0x00dc, B:21:0x00e2, B:24:0x00ed, B:25:0x0102, B:29:0x00c3, B:30:0x0103, B:31:0x0108), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ed A[Catch: all -> 0x004a, RaiseCancellationException -> 0x004d, TryCatch #4 {RaiseCancellationException -> 0x004d, all -> 0x004a, blocks: (B:11:0x0046, B:12:0x00a4, B:15:0x00aa, B:16:0x00d1, B:19:0x00dc, B:21:0x00e2, B:24:0x00ed, B:25:0x0102, B:29:0x00c3, B:30:0x0103, B:31:0x0108), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(android.content.Context context, com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeSuccess passkeyLoginChallengeSuccess, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError, com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionSuccess>> continuation) {
        com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase$getPasskeyAssertion$1 passkeyLoginUseCase$getPasskeyAssertion$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.raise.Raise raise2;
        arrow.core.Either either;
        arrow.core.Either right;
        com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionSuccess passkeyAssertionSuccess;
        if (continuation instanceof com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase$getPasskeyAssertion$1) {
            passkeyLoginUseCase$getPasskeyAssertion$1 = (com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase$getPasskeyAssertion$1) continuation;
            if ((passkeyLoginUseCase$getPasskeyAssertion$1.getOutputStallDuration & Integer.MIN_VALUE) != 0) {
                passkeyLoginUseCase$getPasskeyAssertion$1.getOutputStallDuration -= 2147483648;
                java.lang.Object obj = passkeyLoginUseCase$getPasskeyAssertion$1.getOutputMinFrameDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = passkeyLoginUseCase$getPasskeyAssertion$1.getOutputStallDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionRequest passkeyAssertionRequest = new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionRequest(passkeyLoginChallengeSuccess.getPasskeyLoginCredentialChallenge(), true, passkeyLoginChallengeSuccess.getPasskeyLoginCredentialChallenge().getChallenge());
                        com.paypal.oslo.feature.identity.passkey.login.assertion.domain.usecase.PasskeyAssertionUseCase passkeyAssertionUseCase = this.getHighSpeedVideoFpsRanges;
                        passkeyLoginUseCase$getPasskeyAssertion$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(context);
                        passkeyLoginUseCase$getPasskeyAssertion$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyLoginChallengeSuccess);
                        passkeyLoginUseCase$getPasskeyAssertion$1.getInputSizeshNQ4ISI = defaultRaise;
                        passkeyLoginUseCase$getPasskeyAssertion$1.getOutputMinFrameDuration = defaultRaise3;
                        passkeyLoginUseCase$getPasskeyAssertion$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyAssertionRequest);
                        passkeyLoginUseCase$getPasskeyAssertion$1.getHighSpeedVideoSizesFor = defaultRaise3;
                        passkeyLoginUseCase$getPasskeyAssertion$1.getHighSpeedVideoFpsRangesFor = 0;
                        passkeyLoginUseCase$getPasskeyAssertion$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        passkeyLoginUseCase$getPasskeyAssertion$1.getHighSpeedVideoFpsRanges = 0;
                        passkeyLoginUseCase$getPasskeyAssertion$1.Camera2StreamConfigurationMap = 0;
                        passkeyLoginUseCase$getPasskeyAssertion$1.getOutputStallDuration = 1;
                        java.lang.Object invoke = passkeyAssertionUseCase.invoke(context, passkeyAssertionRequest, passkeyLoginUseCase$getPasskeyAssertion$1);
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
                    int i2 = passkeyLoginUseCase$getPasskeyAssertion$1.Camera2StreamConfigurationMap;
                    int i3 = passkeyLoginUseCase$getPasskeyAssertion$1.getHighSpeedVideoFpsRanges;
                    int i4 = passkeyLoginUseCase$getPasskeyAssertion$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i5 = passkeyLoginUseCase$getPasskeyAssertion$1.getHighSpeedVideoFpsRangesFor;
                    raise2 = (arrow.core.raise.Raise) passkeyLoginUseCase$getPasskeyAssertion$1.getHighSpeedVideoSizesFor;
                    raise = (arrow.core.raise.Raise) passkeyLoginUseCase$getPasskeyAssertion$1.getOutputMinFrameDuration;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) passkeyLoginUseCase$getPasskeyAssertion$1.getInputSizeshNQ4ISI;
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
                    right = new arrow.core.Either.Left(new com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError.AssertionFailed((com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionResult passkeyAssertionResult = (com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionResult) raise2.bind(right);
                passkeyAssertionSuccess = !(passkeyAssertionResult instanceof com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionSuccess) ? (com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionSuccess) passkeyAssertionResult : null;
                if (passkeyAssertionSuccess != null) {
                    raise.raise(new com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError.AssertionFailed(new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.UnknownError(null, null, 3, null)));
                    throw new kotlin.KotlinNothingValueException();
                }
                defaultRaise2.complete();
                return new arrow.core.Either.Right(passkeyAssertionSuccess);
            }
        }
        passkeyLoginUseCase$getPasskeyAssertion$1 = new com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase$getPasskeyAssertion$1(this, continuation);
        java.lang.Object obj2 = passkeyLoginUseCase$getPasskeyAssertion$1.getOutputMinFrameDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = passkeyLoginUseCase$getPasskeyAssertion$1.getOutputStallDuration;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionResult passkeyAssertionResult2 = (com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionResult) raise2.bind(right);
        if (!(passkeyAssertionResult2 instanceof com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionSuccess)) {
        }
        if (passkeyAssertionSuccess != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bc A[Catch: all -> 0x004d, RaiseCancellationException -> 0x0050, TRY_ENTER, TRY_LEAVE, TryCatch #2 {RaiseCancellationException -> 0x0050, all -> 0x004d, blocks: (B:11:0x0049, B:12:0x00b6, B:15:0x00bc, B:16:0x00df, B:21:0x00d2, B:22:0x00f5, B:23:0x00fa, B:27:0x0064), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r4v0, types: [arrow.core.raise.DefaultRaise, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionSuccess passkeyAssertionSuccess, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError, com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginSuccess>> continuation) {
        com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase$submitLogin$1 passkeyLoginUseCase$submitLogin$1;
        ?? r4;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.Raise raise;
        com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionSuccess passkeyAssertionSuccess2;
        arrow.core.Either either;
        arrow.core.Either right;
        try {
            if (continuation instanceof com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase$submitLogin$1) {
                passkeyLoginUseCase$submitLogin$1 = (com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase$submitLogin$1) continuation;
                if ((passkeyLoginUseCase$submitLogin$1.getOutputStallDuration & Integer.MIN_VALUE) != 0) {
                    passkeyLoginUseCase$submitLogin$1.getOutputStallDuration -= 2147483648;
                    java.lang.Object obj = passkeyLoginUseCase$submitLogin$1.getOutputMinFrameDurationlomOqCM;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r4 = passkeyLoginUseCase$submitLogin$1.getOutputStallDuration;
                    if (r4 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                        java.lang.String obj2 = java.util.UUID.randomUUID().toString();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
                        com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginRequest passkeyLoginRequest = new com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginRequest(obj2, passkeyAssertionSuccess.toUrlEncoded(), authIntent, false, 8, null);
                        passkeyLoginUseCase$submitLogin$1.getHighSpeedVideoFpsRanges = passkeyAssertionSuccess;
                        passkeyLoginUseCase$submitLogin$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(authIntent);
                        passkeyLoginUseCase$submitLogin$1.getOutputMinFrameDuration = defaultRaise;
                        passkeyLoginUseCase$submitLogin$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise2);
                        passkeyLoginUseCase$submitLogin$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyLoginRequest);
                        passkeyLoginUseCase$submitLogin$1.getInputSizeshNQ4ISI = defaultRaise2;
                        passkeyLoginUseCase$submitLogin$1.getHighSpeedVideoFpsRangesFor = 0;
                        passkeyLoginUseCase$submitLogin$1.getHighSpeedVideoSizes = 0;
                        passkeyLoginUseCase$submitLogin$1.Camera2StreamConfigurationMap = 0;
                        passkeyLoginUseCase$submitLogin$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        passkeyLoginUseCase$submitLogin$1.getOutputStallDuration = 1;
                        obj = this.getHighSpeedVideoFpsRangesFor.invoke(passkeyLoginRequest, passkeyLoginUseCase$submitLogin$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        raise = defaultRaise2;
                        passkeyAssertionSuccess2 = passkeyAssertionSuccess;
                    } else {
                        if (r4 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i = passkeyLoginUseCase$submitLogin$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i2 = passkeyLoginUseCase$submitLogin$1.Camera2StreamConfigurationMap;
                        int i3 = passkeyLoginUseCase$submitLogin$1.getHighSpeedVideoSizes;
                        int i4 = passkeyLoginUseCase$submitLogin$1.getHighSpeedVideoFpsRangesFor;
                        raise = (arrow.core.raise.Raise) passkeyLoginUseCase$submitLogin$1.getInputSizeshNQ4ISI;
                        defaultRaise = (arrow.core.raise.DefaultRaise) passkeyLoginUseCase$submitLogin$1.getOutputMinFrameDuration;
                        passkeyAssertionSuccess2 = (com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionSuccess) passkeyLoginUseCase$submitLogin$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    either = (arrow.core.Either) obj;
                    if (!(either instanceof arrow.core.Either.Left)) {
                        right = new arrow.core.Either.Left(com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError.LoginSubmissionFailed.INSTANCE);
                    } else {
                        if (!(either instanceof arrow.core.Either.Right)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                    }
                    com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginSuccess passkeyLoginSuccess = new com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginSuccess((com.paypal.oslo.feature.identity.login.domain.model.LoginResult) raise.bind(right), passkeyAssertionSuccess2);
                    defaultRaise.complete();
                    return new arrow.core.Either.Right(passkeyLoginSuccess);
                }
            }
            if (r4 != 0) {
            }
            either = (arrow.core.Either) obj;
            if (!(either instanceof arrow.core.Either.Left)) {
            }
            com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginSuccess passkeyLoginSuccess2 = new com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginSuccess((com.paypal.oslo.feature.identity.login.domain.model.LoginResult) raise.bind(right), passkeyAssertionSuccess2);
            defaultRaise.complete();
            return new arrow.core.Either.Right(passkeyLoginSuccess2);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            r4.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, r4));
        } catch (java.lang.Throwable th) {
            r4.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        passkeyLoginUseCase$submitLogin$1 = new com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase$submitLogin$1(this, continuation);
        java.lang.Object obj3 = passkeyLoginUseCase$submitLogin$1.getOutputMinFrameDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r4 = passkeyLoginUseCase$submitLogin$1.getOutputStallDuration;
    }
}
