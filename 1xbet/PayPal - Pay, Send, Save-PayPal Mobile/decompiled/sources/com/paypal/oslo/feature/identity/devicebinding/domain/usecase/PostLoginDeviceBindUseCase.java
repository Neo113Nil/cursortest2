package com.paypal.oslo.feature.identity.devicebinding.domain.usecase;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086B¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0082@¢\u0006\u0004\b\u0011\u0010\rJ$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0014\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0082@¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/identity/devicebinding/domain/usecase/PostLoginDeviceBindUseCase;", "", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/usecase/DeviceBindingUseCase;", "deviceBindingUseCase", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceAuthPreferenceStorage;", "preferenceStorage", "<init>", "(Lcom/paypal/oslo/feature/identity/devicebinding/domain/usecase/DeviceBindingUseCase;Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceAuthPreferenceStorage;)V", "", "Lcom/paypal/oslo/feature/identity/login/domain/model/PostAuthenticationOperation;", "postAuthOperations", "", "invoke", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/usecase/DeviceBindingUseCase;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceAuthPreferenceStorage;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PostLoginDeviceBindUseCase {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.identity.devicebinding.domain.usecase.DeviceBindingUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceAuthPreferenceStorage Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public PostLoginDeviceBindUseCase(com.paypal.oslo.feature.identity.devicebinding.domain.usecase.DeviceBindingUseCase deviceBindingUseCase, com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceAuthPreferenceStorage deviceAuthPreferenceStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceBindingUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceAuthPreferenceStorage, "");
        this.getHighSpeedVideoFpsRanges = deviceBindingUseCase;
        this.Camera2StreamConfigurationMap = deviceAuthPreferenceStorage;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(4:11|12|13|14)(2:16|17))(2:18|19))(2:27|28)|20|(2:22|23)(1:24)))|34|6|7|(0)(0)|20|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (getHighSpeedVideoSizes(r7, r0) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        if (r7 != r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to trigger device binding after login", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[Catch: Exception -> 0x0076, CancellationException -> 0x0083, TryCatch #2 {CancellationException -> 0x0083, Exception -> 0x0076, blocks: (B:12:0x0031, B:19:0x0041, B:20:0x0056, B:22:0x005e, B:24:0x0061, B:28:0x0048), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061 A[Catch: Exception -> 0x0076, CancellationException -> 0x0083, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0083, Exception -> 0x0076, blocks: (B:12:0x0031, B:19:0x0041, B:20:0x0056, B:22:0x005e, B:24:0x0061, B:28:0x0048), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> list, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase$invoke$1 postLoginDeviceBindUseCase$invoke$1;
        int i;
        java.util.Set<? extends com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod> set;
        if (continuation instanceof com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase$invoke$1) {
            postLoginDeviceBindUseCase$invoke$1 = (com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase$invoke$1) continuation;
            if ((postLoginDeviceBindUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                postLoginDeviceBindUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = postLoginDeviceBindUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = postLoginDeviceBindUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    postLoginDeviceBindUseCase$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                    postLoginDeviceBindUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = getHighResolutionOutputSizeshNQ4ISI(list, postLoginDeviceBindUseCase$invoke$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    list = (java.util.List) postLoginDeviceBindUseCase$invoke$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                set = (java.util.Set) obj;
                if (!set.isEmpty()) {
                    return kotlin.Unit.INSTANCE;
                }
                postLoginDeviceBindUseCase$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                postLoginDeviceBindUseCase$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(set);
                postLoginDeviceBindUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 2;
            }
        }
        postLoginDeviceBindUseCase$invoke$1 = new com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = postLoginDeviceBindUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = postLoginDeviceBindUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        set = (java.util.Set) obj2;
        if (!set.isEmpty()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> list, kotlin.coroutines.Continuation<? super java.util.Set<? extends com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod>> continuation) {
        com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase$resolveBindableMethods$1 postLoginDeviceBindUseCase$resolveBindableMethods$1;
        int i;
        java.util.Set<? extends com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod> set;
        java.util.Set set2;
        if (continuation instanceof com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase$resolveBindableMethods$1) {
            postLoginDeviceBindUseCase$resolveBindableMethods$1 = (com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase$resolveBindableMethods$1) continuation;
            if ((postLoginDeviceBindUseCase$resolveBindableMethods$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                postLoginDeviceBindUseCase$resolveBindableMethods$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = postLoginDeviceBindUseCase$resolveBindableMethods$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = postLoginDeviceBindUseCase$resolveBindableMethods$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.Set<? extends com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod> allowedDeviceAuthMethods = com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperationKt.toAllowedDeviceAuthMethods(list);
                    if (allowedDeviceAuthMethods.isEmpty()) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "No eligible device auth methods derived from post-auth operations, skipping binding", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("operationCount", java.lang.String.valueOf(list.size()))), null, 4, null);
                        return kotlin.collections.SetsKt.emptySet();
                    }
                    postLoginDeviceBindUseCase$resolveBindableMethods$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                    postLoginDeviceBindUseCase$resolveBindableMethods$1.getHighResolutionOutputSizeshNQ4ISI = allowedDeviceAuthMethods;
                    postLoginDeviceBindUseCase$resolveBindableMethods$1.getHighSpeedVideoFpsRangesFor = 1;
                    java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(allowedDeviceAuthMethods, postLoginDeviceBindUseCase$resolveBindableMethods$1);
                    if (highSpeedVideoFpsRanges == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    set = allowedDeviceAuthMethods;
                    obj = highSpeedVideoFpsRanges;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    set = (java.util.Set) postLoginDeviceBindUseCase$resolveBindableMethods$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                set2 = (java.util.Set) obj;
                if (!set2.isEmpty()) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "No authentication methods to enable - all disabled by user", null, null, 6, null);
                    return set2;
                }
                java.util.Set set3 = set2;
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Enabling authentication methods after login", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("methods", kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.sortedWith(set3, new java.util.Comparator() { // from class: com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase$resolveBindableMethods$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return kotlin.comparisons.ComparisonsKt.compareValues(((com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod) t).name(), ((com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod) t2).name());
                    }
                }), null, null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase.$r8$lambda$4B9ixK6uS6bMTgjZA5AdwtaR2es((com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod) obj2);
                    }
                }, 31, null)), kotlin.TuplesKt.to(com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.FlowOutcome.SKIPPED, kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.sortedWith(kotlin.collections.SetsKt.minus((java.util.Set) set, (java.lang.Iterable) set3), new java.util.Comparator() { // from class: com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase$resolveBindableMethods$$inlined$sortedBy$2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return kotlin.comparisons.ComparisonsKt.compareValues(((com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod) t).name(), ((com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod) t2).name());
                    }
                }), null, null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase.$r8$lambda$gw7Ri8qE6KLjSdUvn5lgz7AEewM((com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod) obj2);
                    }
                }, 31, null))), null, 4, null);
                return set2;
            }
        }
        postLoginDeviceBindUseCase$resolveBindableMethods$1 = new com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase$resolveBindableMethods$1(this, continuation);
        java.lang.Object obj2 = postLoginDeviceBindUseCase$resolveBindableMethods$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = postLoginDeviceBindUseCase$resolveBindableMethods$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        set2 = (java.util.Set) obj2;
        if (!set2.isEmpty()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0118, code lost:
    
        r1 = true;
        r6[1] = kotlin.TuplesKt.to("error", r0);
        com.paypal.android.logger.Logger.w$default(r16, "Failed to check preference, assuming enabled", kotlin.collections.MapsKt.mapOf(r6), null, 4, null);
        r0 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b1 -> B:12:0x00c0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(java.util.Set<? extends com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod> set, kotlin.coroutines.Continuation<? super java.util.Set<? extends com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod>> continuation) {
        com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase$filterEnabledMethods$1 postLoginDeviceBindUseCase$filterEnabledMethods$1;
        int i;
        com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase$filterEnabledMethods$1 postLoginDeviceBindUseCase$filterEnabledMethods$12;
        java.util.ArrayList arrayList;
        int i2;
        int i3;
        java.util.Iterator it;
        java.util.Set<? extends com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod> set2;
        java.lang.Object obj;
        java.lang.Object obj2;
        com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod;
        java.lang.Object obj3;
        java.lang.String message;
        boolean z;
        boolean z2;
        com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase postLoginDeviceBindUseCase = this;
        if (continuation instanceof com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase$filterEnabledMethods$1) {
            postLoginDeviceBindUseCase$filterEnabledMethods$1 = (com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase$filterEnabledMethods$1) continuation;
            if ((postLoginDeviceBindUseCase$filterEnabledMethods$1.getOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                postLoginDeviceBindUseCase$filterEnabledMethods$1.getOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj4 = postLoginDeviceBindUseCase$filterEnabledMethods$1.getOutputMinFrameDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = postLoginDeviceBindUseCase$filterEnabledMethods$1.getOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj4);
                    java.util.Set<? extends com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod> set3 = set;
                    postLoginDeviceBindUseCase$filterEnabledMethods$12 = postLoginDeviceBindUseCase$filterEnabledMethods$1;
                    arrayList = new java.util.ArrayList();
                    i2 = 0;
                    i3 = 0;
                    it = set3.iterator();
                    set2 = set;
                    obj = set3;
                    obj2 = obj;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = postLoginDeviceBindUseCase$filterEnabledMethods$1.getHighSpeedVideoFpsRangesFor;
                    int i5 = postLoginDeviceBindUseCase$filterEnabledMethods$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i6 = postLoginDeviceBindUseCase$filterEnabledMethods$1.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod2 = (com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod) postLoginDeviceBindUseCase$filterEnabledMethods$1.getInputFormats;
                    java.lang.Object obj5 = postLoginDeviceBindUseCase$filterEnabledMethods$1.getOutputFormats;
                    it = (java.util.Iterator) postLoginDeviceBindUseCase$filterEnabledMethods$1.getHighSpeedVideoSizesFor;
                    ?? r12 = (java.util.Collection) postLoginDeviceBindUseCase$filterEnabledMethods$1.getOutputMinFrameDuration;
                    java.lang.Object obj6 = (java.lang.Iterable) postLoginDeviceBindUseCase$filterEnabledMethods$1.getInputSizeshNQ4ISI;
                    java.lang.Object obj7 = (java.lang.Iterable) postLoginDeviceBindUseCase$filterEnabledMethods$1.getHighSpeedVideoSizes;
                    java.util.Set<? extends com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod> set4 = (java.util.Set) postLoginDeviceBindUseCase$filterEnabledMethods$1.getHighSpeedVideoFpsRanges;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj4);
                        r12 = r12;
                    } catch (java.lang.Exception e) {
                        e = e;
                        com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod3 = deviceAuthMethod2;
                        postLoginDeviceBindUseCase$filterEnabledMethods$12 = postLoginDeviceBindUseCase$filterEnabledMethods$1;
                        set2 = set4;
                        deviceAuthMethod = deviceAuthMethod3;
                        java.lang.Object obj8 = obj6;
                        i3 = i5;
                        obj = obj7;
                        obj3 = obj5;
                        arrayList = r12;
                        i2 = i6;
                        obj2 = obj8;
                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
                        kotlin.Pair[] pairArr = new kotlin.Pair[2];
                        pairArr[0] = kotlin.TuplesKt.to("method", deviceAuthMethod.name());
                        message = e.getMessage();
                        if (message == null) {
                        }
                        z = true;
                        pairArr[1] = kotlin.TuplesKt.to("error", "");
                        com.paypal.android.logger.Logger.w$default(logger, "Failed to check preference, assuming enabled", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                        z2 = false;
                        if (z2) {
                        }
                        if (!z2) {
                        }
                        postLoginDeviceBindUseCase = this;
                        if (it.hasNext()) {
                        }
                    }
                    z2 = ((java.lang.Boolean) obj4).booleanValue();
                    z = true;
                    com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod4 = deviceAuthMethod2;
                    postLoginDeviceBindUseCase$filterEnabledMethods$12 = postLoginDeviceBindUseCase$filterEnabledMethods$1;
                    set2 = set4;
                    deviceAuthMethod = deviceAuthMethod4;
                    java.lang.Object obj9 = obj6;
                    i3 = i5;
                    obj = obj7;
                    obj3 = obj5;
                    arrayList = r12;
                    i2 = i6;
                    obj2 = obj9;
                    if (z2) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Skipping auto-enable - user disabled it in Settings", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("method", deviceAuthMethod.name())), null, 4, null);
                    }
                    if (!z2) {
                        arrayList.add(obj3);
                    }
                    postLoginDeviceBindUseCase = this;
                    if (it.hasNext()) {
                        obj3 = it.next();
                        deviceAuthMethod = (com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod) obj3;
                        try {
                        } catch (java.lang.Exception e2) {
                            e = e2;
                            com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.identity.LoggerKt.log;
                            kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
                            pairArr2[0] = kotlin.TuplesKt.to("method", deviceAuthMethod.name());
                            message = e.getMessage();
                            if (message == null) {
                            }
                            z = true;
                            pairArr2[1] = kotlin.TuplesKt.to("error", "");
                            com.paypal.android.logger.Logger.w$default(logger2, "Failed to check preference, assuming enabled", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
                            z2 = false;
                            if (z2) {
                            }
                            if (!z2) {
                            }
                            postLoginDeviceBindUseCase = this;
                            if (it.hasNext()) {
                            }
                        }
                        com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceAuthPreferenceStorage deviceAuthPreferenceStorage = postLoginDeviceBindUseCase.Camera2StreamConfigurationMap;
                        postLoginDeviceBindUseCase$filterEnabledMethods$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(set2);
                        postLoginDeviceBindUseCase$filterEnabledMethods$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                        postLoginDeviceBindUseCase$filterEnabledMethods$12.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
                        postLoginDeviceBindUseCase$filterEnabledMethods$12.getOutputMinFrameDuration = arrayList;
                        postLoginDeviceBindUseCase$filterEnabledMethods$12.getHighSpeedVideoSizesFor = it;
                        postLoginDeviceBindUseCase$filterEnabledMethods$12.getOutputFormats = obj3;
                        postLoginDeviceBindUseCase$filterEnabledMethods$12.getInputFormats = deviceAuthMethod;
                        postLoginDeviceBindUseCase$filterEnabledMethods$12.Camera2StreamConfigurationMap = i2;
                        postLoginDeviceBindUseCase$filterEnabledMethods$12.getHighResolutionOutputSizeshNQ4ISI = i3;
                        postLoginDeviceBindUseCase$filterEnabledMethods$12.getHighSpeedVideoFpsRangesFor = 0;
                        postLoginDeviceBindUseCase$filterEnabledMethods$12.getOutputSizeshNQ4ISI = 1;
                        obj4 = deviceAuthPreferenceStorage.isDisabledByUser(deviceAuthMethod, postLoginDeviceBindUseCase$filterEnabledMethods$12);
                        if (obj4 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        set4 = set2;
                        postLoginDeviceBindUseCase$filterEnabledMethods$1 = postLoginDeviceBindUseCase$filterEnabledMethods$12;
                        deviceAuthMethod2 = deviceAuthMethod;
                        obj7 = obj;
                        i5 = i3;
                        obj6 = obj2;
                        i6 = i2;
                        r12 = arrayList;
                        obj5 = obj3;
                        z2 = ((java.lang.Boolean) obj4).booleanValue();
                        z = true;
                        com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod42 = deviceAuthMethod2;
                        postLoginDeviceBindUseCase$filterEnabledMethods$12 = postLoginDeviceBindUseCase$filterEnabledMethods$1;
                        set2 = set4;
                        deviceAuthMethod = deviceAuthMethod42;
                        java.lang.Object obj92 = obj6;
                        i3 = i5;
                        obj = obj7;
                        obj3 = obj5;
                        arrayList = r12;
                        i2 = i6;
                        obj2 = obj92;
                        if (z2) {
                        }
                        if (!z2) {
                        }
                        postLoginDeviceBindUseCase = this;
                        if (it.hasNext()) {
                            return kotlin.collections.CollectionsKt.toSet(arrayList);
                        }
                    }
                }
            }
        }
        postLoginDeviceBindUseCase$filterEnabledMethods$1 = new com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase$filterEnabledMethods$1(postLoginDeviceBindUseCase, continuation);
        java.lang.Object obj42 = postLoginDeviceBindUseCase$filterEnabledMethods$1.getOutputMinFrameDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = postLoginDeviceBindUseCase$filterEnabledMethods$1.getOutputSizeshNQ4ISI;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(java.util.Set<? extends com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod> set, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase$performBinding$1 postLoginDeviceBindUseCase$performBinding$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase$performBinding$1) {
            postLoginDeviceBindUseCase$performBinding$1 = (com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase$performBinding$1) continuation;
            if ((postLoginDeviceBindUseCase$performBinding$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                postLoginDeviceBindUseCase$performBinding$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = postLoginDeviceBindUseCase$performBinding$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = postLoginDeviceBindUseCase$performBinding$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingInput deviceBindingInput = new com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingInput(set, new com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingFlowContext(com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingSource.NATIVE_LOGIN, null, 2, null));
                    com.paypal.oslo.feature.identity.devicebinding.domain.usecase.DeviceBindingUseCase deviceBindingUseCase = this.getHighSpeedVideoFpsRanges;
                    postLoginDeviceBindUseCase$performBinding$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(set);
                    postLoginDeviceBindUseCase$performBinding$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deviceBindingInput);
                    postLoginDeviceBindUseCase$performBinding$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = deviceBindingUseCase.invoke(deviceBindingInput, postLoginDeviceBindUseCase$performBinding$1);
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
                if (either.isLeft()) {
                    com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError deviceBindingError = (com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError) ((arrow.core.Either.Left) either).getValue();
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
                    java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(deviceBindingError.getClass()).getSimpleName();
                    if (simpleName == null) {
                        simpleName = "";
                    }
                    com.paypal.android.logger.Logger.d$default(logger, "Post-login device bind skipped or failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", simpleName)), null, 4, null);
                }
                if (either.isRight()) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Device binding triggered successfully after login", null, null, 6, null);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        postLoginDeviceBindUseCase$performBinding$1 = new com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase$performBinding$1(this, continuation);
        java.lang.Object obj2 = postLoginDeviceBindUseCase$performBinding$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = postLoginDeviceBindUseCase$performBinding$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (either.isLeft()) {
        }
        if (either.isRight()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$4B9ixK6uS6bMTgjZA5AdwtaR2es(com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceAuthMethod, "");
        return deviceAuthMethod.getDisplayName();
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$gw7Ri8qE6KLjSdUvn5lgz7AEewM(com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceAuthMethod, "");
        return deviceAuthMethod.getDisplayName();
    }
}
