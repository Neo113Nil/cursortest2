package com.paypal.oslo.feature.identity.identitymanagement.domain.usecase;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/identity/identitymanagement/domain/usecase/EnableAuthenticationMethodUseCase;", "", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/usecase/DeviceBindingUseCase;", "deviceBindingUseCase", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceAuthPreferenceStorage;", "preferenceStorage", "<init>", "(Lcom/paypal/oslo/feature/identity/devicebinding/domain/usecase/DeviceBindingUseCase;Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceAuthPreferenceStorage;)V", "", "Lcom/paypal/oslo/feature/identity/api/AuthenticationMethod;", "listAuthenticationMethod", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/api/model/IdentityManagementError;", "", "invoke", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/usecase/DeviceBindingUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceAuthPreferenceStorage;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EnableAuthenticationMethodUseCase {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceAuthPreferenceStorage getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.identity.devicebinding.domain.usecase.DeviceBindingUseCase getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public EnableAuthenticationMethodUseCase(com.paypal.oslo.feature.identity.devicebinding.domain.usecase.DeviceBindingUseCase deviceBindingUseCase, com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceAuthPreferenceStorage deviceAuthPreferenceStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceBindingUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceAuthPreferenceStorage, "");
        this.getHighResolutionOutputSizeshNQ4ISI = deviceBindingUseCase;
        this.getHighSpeedVideoFpsRangesFor = deviceAuthPreferenceStorage;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:(3:12|13|14)|15|16|17|18|19|20|21|22|23|25|26|(22:28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|(1:51)(14:50|15|16|17|18|19|20|21|22|23|24|25|26|(2:74|76)(0)))(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:11|(3:12|13|14)|15|16|17|18|19|20|21|22|23|24|25|26|(22:28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|(1:51)(14:50|15|16|17|18|19|20|21|22|23|24|25|26|(2:74|76)(0)))(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(22:28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|(1:51)(14:50|15|16|17|18|19|20|21|22|23|24|25|26|(2:74|76)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x027c, code lost:
    
        r25 = r10;
        r10 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0261, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0278, code lost:
    
        r23 = r3;
        r3 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x026b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0275, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0276, code lost:
    
        r34 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0263, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0264, code lost:
    
        r34 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0266, code lost:
    
        r3 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0283, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0284, code lost:
    
        r22 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0294, code lost:
    
        r23 = r3;
        r3 = r20;
        r1 = r21;
        r10 = r0;
        r21 = r11;
        r11 = r34;
        r34 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0280, code lost:
    
        r2 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x02bd, code lost:
    
        r9 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0287, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0288, code lost:
    
        r24 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x028b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x028c, code lost:
    
        r25 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x028f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0290, code lost:
    
        r34 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0293, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x030d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x030a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x025f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0180 A[Catch: all -> 0x02eb, RaiseCancellationException -> 0x02ee, Exception -> 0x02f2, CancellationException -> 0x02f8, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x02f2, blocks: (B:58:0x02a2, B:61:0x02bf, B:135:0x0180, B:140:0x031e), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01b9 A[Catch: all -> 0x030a, RaiseCancellationException -> 0x030d, Exception -> 0x0312, CancellationException -> 0x0316, TRY_LEAVE, TryCatch #10 {CancellationException -> 0x0316, blocks: (B:26:0x01b3, B:28:0x01b9, B:31:0x01c5, B:34:0x01f1, B:36:0x01f5, B:39:0x0207, B:42:0x020d, B:45:0x0213, B:47:0x0218), top: B:25:0x01b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02fc A[Catch: all -> 0x030a, RaiseCancellationException -> 0x030d, TRY_ENTER, TRY_LEAVE, TryCatch #28 {RaiseCancellationException -> 0x030d, all -> 0x030a, blocks: (B:26:0x01b3, B:28:0x01b9, B:31:0x01c5, B:34:0x01f1, B:36:0x01f5, B:39:0x0207, B:42:0x020d, B:45:0x0213, B:47:0x0218, B:74:0x02fc), top: B:25:0x01b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v108 */
    /* JADX WARN: Type inference failed for: r2v109 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v110 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v69 */
    /* JADX WARN: Type inference failed for: r2v73, types: [arrow.core.raise.DefaultRaise, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v75 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v84 */
    /* JADX WARN: Type inference failed for: r3v17, types: [arrow.core.raise.DefaultRaise, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0228 -> B:15:0x022e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x02d5 -> B:24:0x0259). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.util.List<? extends com.paypal.oslo.feature.identity.api.AuthenticationMethod> list, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.api.model.IdentityManagementError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.EnableAuthenticationMethodUseCase$invoke$1 enableAuthenticationMethodUseCase$invoke$1;
        int i;
        java.lang.Exception exc;
        java.lang.Throwable th;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.DefaultRaise defaultRaise3;
        arrow.core.raise.RaiseCancellationException raiseCancellationException;
        arrow.core.raise.DefaultRaise defaultRaise4;
        arrow.core.raise.Raise raise;
        java.lang.String message;
        java.util.LinkedHashSet linkedHashSet;
        com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingInput deviceBindingInput;
        java.util.List list2;
        int i2;
        int i3;
        int i4;
        int i5;
        arrow.core.raise.DefaultRaise defaultRaise5;
        java.lang.Exception e;
        arrow.core.raise.DefaultRaise defaultRaise6;
        arrow.core.Either either;
        com.paypal.oslo.feature.identity.api.model.LLSDisableError.NotEnabled notEnabled;
        com.paypal.oslo.feature.identity.api.model.LLSEnableError.NetworkError networkError;
        java.util.Set set;
        java.lang.Object obj;
        java.lang.Object obj2;
        int i6;
        int i7;
        com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.EnableAuthenticationMethodUseCase$invoke$1 enableAuthenticationMethodUseCase$invoke$12;
        int i8;
        int i9;
        int i10;
        com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingOutput deviceBindingOutput;
        java.util.Iterator it;
        java.lang.Object obj3;
        int i11;
        arrow.core.raise.DefaultRaise defaultRaise7;
        int i12;
        int i13;
        arrow.core.Either either2;
        java.lang.Object obj4;
        java.lang.Object obj5;
        arrow.core.raise.DefaultRaise defaultRaise8;
        com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.EnableAuthenticationMethodUseCase enableAuthenticationMethodUseCase = this;
        ?? r2 = list;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                if (continuation instanceof com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.EnableAuthenticationMethodUseCase$invoke$1) {
                                    enableAuthenticationMethodUseCase$invoke$1 = (com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.EnableAuthenticationMethodUseCase$invoke$1) continuation;
                                    if ((enableAuthenticationMethodUseCase$invoke$1.toString & Integer.MIN_VALUE) != 0) {
                                        enableAuthenticationMethodUseCase$invoke$1.toString -= 2147483648;
                                        java.lang.Object obj6 = enableAuthenticationMethodUseCase$invoke$1.coroutineCreation;
                                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        i = enableAuthenticationMethodUseCase$invoke$1.toString;
                                        if (i != 0) {
                                            kotlin.ResultKt.throwOnFailure(obj6);
                                            linkedHashSet = new java.util.LinkedHashSet();
                                            if (r2.contains(com.paypal.oslo.feature.identity.api.AuthenticationMethod.BIOMETRIC)) {
                                                linkedHashSet.add(com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.BIOMETRIC);
                                            }
                                            if (r2.contains(com.paypal.oslo.feature.identity.api.AuthenticationMethod.LLS)) {
                                                linkedHashSet.add(com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.LLS);
                                            }
                                            ?? r3 = new arrow.core.raise.DefaultRaise(false);
                                            try {
                                                raise = (arrow.core.raise.Raise) r3;
                                                try {
                                                    deviceBindingInput = new com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingInput(linkedHashSet, new com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingFlowContext(com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingSource.APP_SETTINGS, null, 2, null));
                                                    com.paypal.oslo.feature.identity.devicebinding.domain.usecase.DeviceBindingUseCase deviceBindingUseCase = enableAuthenticationMethodUseCase.getHighResolutionOutputSizeshNQ4ISI;
                                                    enableAuthenticationMethodUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                                                    enableAuthenticationMethodUseCase$invoke$1.getOutputMinFrameDuration = linkedHashSet;
                                                    enableAuthenticationMethodUseCase$invoke$1.getOutputStallDurationlomOqCM = r3;
                                                    enableAuthenticationMethodUseCase$invoke$1.getOutputMinFrameDurationlomOqCM = raise;
                                                    enableAuthenticationMethodUseCase$invoke$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deviceBindingInput);
                                                    enableAuthenticationMethodUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                                                    enableAuthenticationMethodUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                                                    enableAuthenticationMethodUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                                                    enableAuthenticationMethodUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                                                    enableAuthenticationMethodUseCase$invoke$1.toString = 1;
                                                    java.lang.Object invoke = deviceBindingUseCase.invoke(deviceBindingInput, enableAuthenticationMethodUseCase$invoke$1);
                                                    if (invoke == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    list2 = r2;
                                                    r2 = r3;
                                                    obj6 = invoke;
                                                    i2 = 0;
                                                    i3 = 0;
                                                    i4 = 0;
                                                    i5 = 0;
                                                } catch (java.util.concurrent.CancellationException e2) {
                                                    throw e2;
                                                } catch (java.lang.Exception e3) {
                                                    exc = e3;
                                                    com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to trigger device binding after login", exc);
                                                    message = exc.getMessage();
                                                    if (message == null) {
                                                    }
                                                    raise.raise(new com.paypal.oslo.feature.identity.api.model.LLSEnableError.UnknownError(message));
                                                    throw new kotlin.KotlinNothingValueException();
                                                }
                                            } catch (arrow.core.raise.RaiseCancellationException e4) {
                                                raiseCancellationException = e4;
                                                defaultRaise3 = r3;
                                                defaultRaise3.complete();
                                                return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(raiseCancellationException, defaultRaise3));
                                            } catch (java.lang.Throwable th2) {
                                                th = th2;
                                                th = th;
                                                defaultRaise = r3;
                                                defaultRaise.complete();
                                                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                                            }
                                        } else if (i == 1) {
                                            int i14 = enableAuthenticationMethodUseCase$invoke$1.getHighSpeedVideoSizes;
                                            int i15 = enableAuthenticationMethodUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                                            int i16 = enableAuthenticationMethodUseCase$invoke$1.Camera2StreamConfigurationMap;
                                            int i17 = enableAuthenticationMethodUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                                            deviceBindingInput = (com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingInput) enableAuthenticationMethodUseCase$invoke$1.getOutputStallDuration;
                                            raise = (arrow.core.raise.Raise) enableAuthenticationMethodUseCase$invoke$1.getOutputMinFrameDurationlomOqCM;
                                            defaultRaise5 = (arrow.core.raise.DefaultRaise) enableAuthenticationMethodUseCase$invoke$1.getOutputStallDurationlomOqCM;
                                            linkedHashSet = (java.util.Set) enableAuthenticationMethodUseCase$invoke$1.getOutputMinFrameDuration;
                                            list2 = (java.util.List) enableAuthenticationMethodUseCase$invoke$1.getHighSpeedVideoSizesFor;
                                            try {
                                                kotlin.ResultKt.throwOnFailure(obj6);
                                                i2 = i14;
                                                r2 = defaultRaise5;
                                                i5 = i17;
                                                i4 = i16;
                                                i3 = i15;
                                            } catch (arrow.core.raise.RaiseCancellationException e5) {
                                                raiseCancellationException = e5;
                                                defaultRaise4 = defaultRaise5;
                                                defaultRaise3 = defaultRaise4;
                                                defaultRaise3.complete();
                                                return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(raiseCancellationException, defaultRaise3));
                                            } catch (java.util.concurrent.CancellationException e6) {
                                                throw e6;
                                            } catch (java.lang.Exception e7) {
                                                e = e7;
                                                exc = e;
                                                com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to trigger device binding after login", exc);
                                                message = exc.getMessage();
                                                if (message == null) {
                                                }
                                                raise.raise(new com.paypal.oslo.feature.identity.api.model.LLSEnableError.UnknownError(message));
                                                throw new kotlin.KotlinNothingValueException();
                                            } catch (java.lang.Throwable th3) {
                                                th = th3;
                                                defaultRaise2 = defaultRaise5;
                                                defaultRaise = defaultRaise2;
                                                defaultRaise.complete();
                                                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                                            }
                                        } else {
                                            if (i != 2) {
                                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            int i18 = enableAuthenticationMethodUseCase$invoke$1.getOutputFormats;
                                            int i19 = enableAuthenticationMethodUseCase$invoke$1.getInputFormats;
                                            int i20 = enableAuthenticationMethodUseCase$invoke$1.getInputSizeshNQ4ISI;
                                            int i21 = enableAuthenticationMethodUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                                            int i22 = enableAuthenticationMethodUseCase$invoke$1.getHighSpeedVideoSizes;
                                            int i23 = enableAuthenticationMethodUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                                            int i24 = enableAuthenticationMethodUseCase$invoke$1.Camera2StreamConfigurationMap;
                                            int i25 = enableAuthenticationMethodUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                                            com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod = (com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod) enableAuthenticationMethodUseCase$invoke$1.getOutputSizeshNQ4ISI;
                                            java.lang.Object obj7 = enableAuthenticationMethodUseCase$invoke$1.unwrapAs;
                                            java.util.Iterator it2 = (java.util.Iterator) enableAuthenticationMethodUseCase$invoke$1.getValidOutputFormatsForInputhNQ4ISI;
                                            set = (java.lang.Iterable) enableAuthenticationMethodUseCase$invoke$1.isOutputSupportedFor;
                                            com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingOutput deviceBindingOutput2 = (com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingOutput) enableAuthenticationMethodUseCase$invoke$1.isOutputSupportedForhNQ4ISI;
                                            arrow.core.Either either3 = (arrow.core.Either) enableAuthenticationMethodUseCase$invoke$1.getOutputSizes;
                                            com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingInput deviceBindingInput2 = (com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingInput) enableAuthenticationMethodUseCase$invoke$1.getOutputStallDuration;
                                            arrow.core.raise.Raise raise2 = (arrow.core.raise.Raise) enableAuthenticationMethodUseCase$invoke$1.getOutputMinFrameDurationlomOqCM;
                                            arrow.core.raise.DefaultRaise defaultRaise9 = (arrow.core.raise.DefaultRaise) enableAuthenticationMethodUseCase$invoke$1.getOutputStallDurationlomOqCM;
                                            java.util.Set set2 = (java.util.Set) enableAuthenticationMethodUseCase$invoke$1.getOutputMinFrameDuration;
                                            java.util.List list3 = (java.util.List) enableAuthenticationMethodUseCase$invoke$1.getHighSpeedVideoSizesFor;
                                            try {
                                                try {
                                                    try {
                                                        kotlin.ResultKt.throwOnFailure(obj6);
                                                        obj5 = coroutine_suspended;
                                                        i6 = i23;
                                                        either = either3;
                                                        linkedHashSet = set2;
                                                        i13 = i20;
                                                        obj2 = "method";
                                                        i8 = i22;
                                                        i9 = i24;
                                                        list2 = list3;
                                                        i5 = i25;
                                                        r2 = defaultRaise9;
                                                        enableAuthenticationMethodUseCase$invoke$12 = enableAuthenticationMethodUseCase$invoke$1;
                                                        deviceBindingOutput = deviceBindingOutput2;
                                                        obj3 = "error";
                                                        i11 = i21;
                                                        raise = raise2;
                                                        i7 = i19;
                                                    } catch (arrow.core.raise.RaiseCancellationException e8) {
                                                        raiseCancellationException = e8;
                                                        defaultRaise4 = defaultRaise9;
                                                        defaultRaise3 = defaultRaise4;
                                                        defaultRaise3.complete();
                                                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(raiseCancellationException, defaultRaise3));
                                                    } catch (java.util.concurrent.CancellationException e9) {
                                                        throw e9;
                                                    } catch (java.lang.Exception e10) {
                                                        obj5 = coroutine_suspended;
                                                        obj4 = "method";
                                                        i12 = i21;
                                                        i8 = i22;
                                                        i6 = i23;
                                                        raise = raise2;
                                                        linkedHashSet = set2;
                                                        i7 = i19;
                                                        i13 = i20;
                                                        i5 = i25;
                                                        i9 = i24;
                                                        defaultRaise7 = defaultRaise9;
                                                        list2 = list3;
                                                        enableAuthenticationMethodUseCase$invoke$12 = enableAuthenticationMethodUseCase$invoke$1;
                                                        java.lang.Object obj8 = "error";
                                                        deviceBindingOutput = deviceBindingOutput2;
                                                        either2 = either3;
                                                        java.lang.Exception exc2 = e10;
                                                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
                                                        com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingOutput deviceBindingOutput3 = deviceBindingOutput;
                                                        int i26 = i6;
                                                        kotlin.Pair[] pairArr = new kotlin.Pair[2];
                                                        pairArr[0] = kotlin.TuplesKt.to(obj4, deviceAuthMethod.name());
                                                        java.lang.String message2 = exc2.getMessage();
                                                        if (message2 == null) {
                                                        }
                                                        pairArr[1] = kotlin.TuplesKt.to(obj8, message2);
                                                        com.paypal.android.logger.Logger.w$default(logger, "Failed to clear disabled preference", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                                                        obj2 = obj4;
                                                        i6 = i26;
                                                        deviceBindingOutput = deviceBindingOutput3;
                                                        either = either2;
                                                        i10 = i13;
                                                        i11 = i12;
                                                        obj3 = obj8;
                                                        defaultRaise8 = defaultRaise7;
                                                        it = it2;
                                                        deviceBindingInput = deviceBindingInput2;
                                                        obj = obj5;
                                                        enableAuthenticationMethodUseCase = this;
                                                        r2 = defaultRaise8;
                                                        if (it.hasNext()) {
                                                        }
                                                    } catch (java.lang.Throwable th4) {
                                                        th = th4;
                                                        defaultRaise2 = defaultRaise9;
                                                        defaultRaise = defaultRaise2;
                                                        defaultRaise.complete();
                                                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                                                    }
                                                    defaultRaise7 = r2;
                                                    either2 = either;
                                                    obj4 = obj2;
                                                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Cleared user preference - method enabled by user", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(obj4, deviceAuthMethod.name())), null, 4, null);
                                                    defaultRaise8 = defaultRaise7;
                                                    obj2 = obj4;
                                                    it = it2;
                                                    deviceBindingInput = deviceBindingInput2;
                                                    either = either2;
                                                    i10 = i13;
                                                    if (it.hasNext()) {
                                                        java.lang.Object next = it.next();
                                                        i13 = i10;
                                                        deviceAuthMethod = (com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod) next;
                                                        i12 = i11;
                                                        com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceAuthPreferenceStorage deviceAuthPreferenceStorage = enableAuthenticationMethodUseCase.getHighSpeedVideoFpsRangesFor;
                                                        enableAuthenticationMethodUseCase$invoke$12.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list2);
                                                        enableAuthenticationMethodUseCase$invoke$12.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(linkedHashSet);
                                                        enableAuthenticationMethodUseCase$invoke$12.getOutputStallDurationlomOqCM = r2;
                                                        enableAuthenticationMethodUseCase$invoke$12.getOutputMinFrameDurationlomOqCM = raise;
                                                        enableAuthenticationMethodUseCase$invoke$12.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deviceBindingInput);
                                                        enableAuthenticationMethodUseCase$invoke$12.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                                                        enableAuthenticationMethodUseCase$invoke$12.isOutputSupportedForhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deviceBindingOutput);
                                                        enableAuthenticationMethodUseCase$invoke$12.isOutputSupportedFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(set);
                                                        java.util.Iterator it3 = it;
                                                        enableAuthenticationMethodUseCase$invoke$12.getValidOutputFormatsForInputhNQ4ISI = it3;
                                                        it = it3;
                                                        enableAuthenticationMethodUseCase$invoke$12.unwrapAs = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                                                        enableAuthenticationMethodUseCase$invoke$12.getOutputSizeshNQ4ISI = deviceAuthMethod;
                                                        enableAuthenticationMethodUseCase$invoke$12.getHighSpeedVideoFpsRangesFor = i5;
                                                        enableAuthenticationMethodUseCase$invoke$12.Camera2StreamConfigurationMap = i9;
                                                        enableAuthenticationMethodUseCase$invoke$12.getHighSpeedVideoFpsRanges = i6;
                                                        enableAuthenticationMethodUseCase$invoke$12.getHighSpeedVideoSizes = i8;
                                                        enableAuthenticationMethodUseCase$invoke$12.getHighResolutionOutputSizeshNQ4ISI = i12;
                                                        i12 = i12;
                                                        enableAuthenticationMethodUseCase$invoke$12.getInputSizeshNQ4ISI = i13;
                                                        i13 = i13;
                                                        int i27 = i7;
                                                        enableAuthenticationMethodUseCase$invoke$12.getInputFormats = i27;
                                                        i7 = i27;
                                                        enableAuthenticationMethodUseCase$invoke$12.getOutputFormats = 0;
                                                        enableAuthenticationMethodUseCase$invoke$12.toString = 2;
                                                        obj5 = obj;
                                                        if (deviceAuthPreferenceStorage.setDisabledByUser(deviceAuthMethod, false, enableAuthenticationMethodUseCase$invoke$12) == obj5) {
                                                            return obj5;
                                                        }
                                                        deviceBindingInput2 = deviceBindingInput;
                                                        i11 = i12;
                                                        it2 = it;
                                                        r2 = r2;
                                                        defaultRaise7 = r2;
                                                        either2 = either;
                                                        obj4 = obj2;
                                                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Cleared user preference - method enabled by user", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(obj4, deviceAuthMethod.name())), null, 4, null);
                                                        defaultRaise8 = defaultRaise7;
                                                        obj2 = obj4;
                                                        it = it2;
                                                        deviceBindingInput = deviceBindingInput2;
                                                        either = either2;
                                                        i10 = i13;
                                                        obj = obj5;
                                                        enableAuthenticationMethodUseCase = this;
                                                        r2 = defaultRaise8;
                                                        if (it.hasNext()) {
                                                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                                            r2.complete();
                                                            return new arrow.core.Either.Right(unit);
                                                        }
                                                    }
                                                } catch (java.util.concurrent.CancellationException e11) {
                                                    e = e11;
                                                    throw e;
                                                }
                                            } catch (java.lang.Exception e12) {
                                                exc = e12;
                                                com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to trigger device binding after login", exc);
                                                message = exc.getMessage();
                                                if (message == null) {
                                                    message = "Unknown exception";
                                                }
                                                raise.raise(new com.paypal.oslo.feature.identity.api.model.LLSEnableError.UnknownError(message));
                                                throw new kotlin.KotlinNothingValueException();
                                            }
                                            obj = obj5;
                                            enableAuthenticationMethodUseCase = this;
                                            r2 = defaultRaise8;
                                        }
                                        either = (arrow.core.Either) obj6;
                                        defaultRaise6 = r2;
                                        if (!(either instanceof arrow.core.Either.Right)) {
                                            com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingOutput deviceBindingOutput4 = (com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingOutput) ((arrow.core.Either.Right) either).getValue();
                                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Device binding triggered successfully from settings", null, null, 6, null);
                                            set = linkedHashSet;
                                            obj = coroutine_suspended;
                                            obj2 = "method";
                                            i6 = i3;
                                            i7 = 0;
                                            enableAuthenticationMethodUseCase$invoke$12 = enableAuthenticationMethodUseCase$invoke$1;
                                            i8 = i2;
                                            i9 = i4;
                                            i10 = 0;
                                            deviceBindingOutput = deviceBindingOutput4;
                                            r2 = defaultRaise6;
                                            it = set.iterator();
                                            obj3 = "error";
                                            i11 = 0;
                                            if (it.hasNext()) {
                                            }
                                        } else {
                                            try {
                                                if (!(either instanceof arrow.core.Either.Left)) {
                                                    throw new kotlin.NoWhenBranchMatchedException();
                                                }
                                                com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError deviceBindingError = (com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError) ((arrow.core.Either.Left) either).getValue();
                                                if (deviceBindingError instanceof com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.EmptyMethods) {
                                                    notEnabled = com.paypal.oslo.feature.identity.api.model.LLSDisableError.NotEnabled.INSTANCE;
                                                } else if (deviceBindingError instanceof com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.NoEligibleMethods) {
                                                    notEnabled = new com.paypal.oslo.feature.identity.api.model.LLSEnableError.NotSupported("No eligible authentication methods");
                                                } else if (deviceBindingError instanceof com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.KeyGenerationFailed) {
                                                    notEnabled = new com.paypal.oslo.feature.identity.api.model.LLSEnableError.UnknownError("Failed to generate cryptographic keys");
                                                } else if (deviceBindingError instanceof com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.Api) {
                                                    com.paypal.oslo.feature.identity.shared.domain.model.ApiError error = ((com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.Api) deviceBindingError).getError();
                                                    if (error instanceof com.paypal.oslo.feature.identity.shared.domain.model.ApiError.NetworkError) {
                                                        networkError = new com.paypal.oslo.feature.identity.api.model.LLSEnableError.NetworkError("Network error", com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase.NETWORK_ERROR_CODE);
                                                    } else if (error instanceof com.paypal.oslo.feature.identity.shared.domain.model.ApiError.HttpError) {
                                                        com.paypal.oslo.feature.identity.shared.domain.model.ApiError.HttpError httpError = (com.paypal.oslo.feature.identity.shared.domain.model.ApiError.HttpError) error;
                                                        networkError = new com.paypal.oslo.feature.identity.api.model.LLSEnableError.NetworkError("HTTP error: ".concat(java.lang.String.valueOf(httpError.getBody())), java.lang.String.valueOf(httpError.getCode()));
                                                    } else {
                                                        if (!(error instanceof com.paypal.oslo.feature.identity.shared.domain.model.ApiError.UnknownError)) {
                                                            throw new kotlin.NoWhenBranchMatchedException();
                                                        }
                                                        java.lang.String message3 = ((com.paypal.oslo.feature.identity.shared.domain.model.ApiError.UnknownError) error).getCause().getMessage();
                                                        if (message3 == null) {
                                                            message3 = "Unknown API error";
                                                        }
                                                        networkError = new com.paypal.oslo.feature.identity.api.model.LLSEnableError.UnknownError(message3);
                                                    }
                                                    notEnabled = (com.paypal.oslo.feature.identity.api.model.IdentityManagementError) networkError;
                                                } else if (deviceBindingError instanceof com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.RateLimitExceeded) {
                                                    int retryAfterSeconds = ((com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.RateLimitExceeded) deviceBindingError).getRetryAfterSeconds();
                                                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Rate limit exceeded. Retry after ");
                                                    sb.append(retryAfterSeconds);
                                                    sb.append(lib.android.paypal.com.magnessdk.g.n2);
                                                    notEnabled = new com.paypal.oslo.feature.identity.api.model.LLSEnableError.NotSupported(sb.toString());
                                                } else if (deviceBindingError instanceof com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.ServerError) {
                                                    notEnabled = new com.paypal.oslo.feature.identity.api.model.LLSEnableError.UnknownError("Server error: ".concat(java.lang.String.valueOf(((com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.ServerError) deviceBindingError).getMessage())));
                                                } else if (deviceBindingError instanceof com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.NotAuthenticated) {
                                                    notEnabled = com.paypal.oslo.feature.identity.api.model.LLSEnableError.AlreadyEnabled.INSTANCE;
                                                } else if (deviceBindingError instanceof com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.UnsupportedDevice) {
                                                    java.lang.String details = ((com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.UnsupportedDevice) deviceBindingError).getDetails();
                                                    if (details == null) {
                                                        details = "Unsupported device";
                                                    }
                                                    notEnabled = new com.paypal.oslo.feature.identity.api.model.LLSEnableError.NotSupported(details);
                                                } else if (deviceBindingError instanceof com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.MethodNotEligible) {
                                                    notEnabled = new com.paypal.oslo.feature.identity.api.model.LLSEnableError.NotSupported("Method not eligible: ".concat(java.lang.String.valueOf(((com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.MethodNotEligible) deviceBindingError).getMethod())));
                                                } else {
                                                    if (!(deviceBindingError instanceof com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.Unknown)) {
                                                        throw new kotlin.NoWhenBranchMatchedException();
                                                    }
                                                    notEnabled = new com.paypal.oslo.feature.identity.api.model.LLSEnableError.UnknownError(((com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.Unknown) deviceBindingError).getMessage());
                                                }
                                                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Device binding failed from settings", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", notEnabled.toString())), null, null, 12, null);
                                                raise.raise(notEnabled);
                                                throw new kotlin.KotlinNothingValueException();
                                            } catch (arrow.core.raise.RaiseCancellationException e13) {
                                                e = e13;
                                                r2 = defaultRaise6;
                                                raiseCancellationException = e;
                                                defaultRaise4 = r2;
                                                defaultRaise3 = defaultRaise4;
                                                defaultRaise3.complete();
                                                return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(raiseCancellationException, defaultRaise3));
                                            } catch (java.lang.Exception e14) {
                                                e = e14;
                                                defaultRaise5 = defaultRaise6;
                                                exc = e;
                                                com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to trigger device binding after login", exc);
                                                message = exc.getMessage();
                                                if (message == null) {
                                                }
                                                raise.raise(new com.paypal.oslo.feature.identity.api.model.LLSEnableError.UnknownError(message));
                                                throw new kotlin.KotlinNothingValueException();
                                            } catch (java.lang.Throwable th5) {
                                                th = th5;
                                                r2 = defaultRaise6;
                                                th = th;
                                                defaultRaise2 = r2;
                                                defaultRaise = defaultRaise2;
                                                defaultRaise.complete();
                                                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                                            }
                                        }
                                    }
                                }
                                either = (arrow.core.Either) obj6;
                                defaultRaise6 = r2;
                                if (!(either instanceof arrow.core.Either.Right)) {
                                }
                            } catch (java.util.concurrent.CancellationException e15) {
                                e = e15;
                                throw e;
                            }
                        } catch (arrow.core.raise.RaiseCancellationException e16) {
                            e = e16;
                        } catch (java.lang.Exception e17) {
                            e = e17;
                            defaultRaise6 = r2;
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                        }
                        if (i != 0) {
                        }
                    } catch (java.lang.Exception e18) {
                        exc = e18;
                    }
                } catch (java.util.concurrent.CancellationException e19) {
                    e = e19;
                }
            } catch (arrow.core.raise.RaiseCancellationException e20) {
                e = e20;
                r2 = list;
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
        } catch (arrow.core.raise.RaiseCancellationException e21) {
            e = e21;
        } catch (java.lang.Throwable th8) {
            th = th8;
        }
        enableAuthenticationMethodUseCase$invoke$1 = new com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.EnableAuthenticationMethodUseCase$invoke$1(enableAuthenticationMethodUseCase, continuation);
        java.lang.Object obj62 = enableAuthenticationMethodUseCase$invoke$1.coroutineCreation;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = enableAuthenticationMethodUseCase$invoke$1.toString;
    }
}
