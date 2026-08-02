package com.paypal.oslo.feature.onboarding.signup.phone.ui;

@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u0013R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0007¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020'0\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 R \u0010(\u001a\b\u0012\u0004\u0012\u00020'0!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&R@\u00102\u001a.\u0012*\u0012(\u0012\u0006\u0012\u0004\u0018\u00010+\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.0,0\fj\n\u0012\u0006\u0012\u0004\u0018\u00010+`/0*8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u00101R \u00103\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u00105"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/phone/ui/PhoneEntryViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/onboarding/signup/domain/usecase/SignupDataManager;", "signupDataManager", "<init>", "(Lcom/paypal/oslo/feature/onboarding/signup/domain/usecase/SignupDataManager;)V", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/PageConfig;", "pageConfig", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbackMap;", "createCallbackMapForPhone", "(Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/PageConfig;)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbackMap;", "p0", "Lkotlin/Function1;", "", "", "p1", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/PageConfig;Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbackMap;", "onNextClicked", "()V", "clearNavigateToOtp", "getCurrentPhoneNumber", "()Ljava/lang/String;", "errorMessage", "setApiError", "(Ljava/lang/String;)V", "clearApiError", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/onboarding/signup/domain/usecase/SignupDataManager;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$PhoneData;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData;", "phoneNumberDataFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getPhoneNumberDataFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "", "shouldNavigateToOtp", "getShouldNavigateToOtp", "", "", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/validators/domain/ValidationError;", "Lcom/paypal/oslo/feature/onboarding/validators/domain/ValidationSuccess;", "Lcom/paypal/oslo/feature/onboarding/validators/domain/Validator;", "getInputSizeshNQ4ISI", "Ljava/util/List;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbackMap;", "getInputFormats"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhoneEntryViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbackMap getInputFormats;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PhoneData> Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager getHighSpeedVideoSizes;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.List<kotlin.jvm.functions.Function1<java.lang.CharSequence, arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>>> getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData> phoneNumberDataFlow;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> shouldNavigateToOtp;

    @javax.inject.Inject
    public PhoneEntryViewModel(com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager signupDataManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupDataManager, "");
        this.getHighSpeedVideoSizes = signupDataManager;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PhoneData> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PhoneData(null, null, null, 7, null));
        this.Camera2StreamConfigurationMap = MutableStateFlow;
        this.phoneNumberDataFlow = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow2;
        this.shouldNavigateToOtp = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow2);
        this.getHighSpeedVideoFpsRanges = kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.onboarding.validators.factory.ValidatorsFactoryKt.length$default(4, 17, com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_phone_validation_error_invalid, null, null, 24, null));
        this.getHighResolutionOutputSizeshNQ4ISI = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryViewModel.$r8$lambda$gwdQiPrvEQ6ub2wd1TNEKnvZYH0(com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryViewModel.this, (java.lang.String) obj);
            }
        };
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData> getPhoneNumberDataFlow() {
        return this.phoneNumberDataFlow;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getShouldNavigateToOtp() {
        return this.shouldNavigateToOtp;
    }

    public final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbackMap createCallbackMapForPhone(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig pageConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageConfig, "");
        com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbackMap componentCallbackMap = this.getInputFormats;
        if (componentCallbackMap != null) {
            return componentCallbackMap;
        }
        com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbackMap Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(pageConfig, this.getHighResolutionOutputSizeshNQ4ISI);
        this.getInputFormats = Camera2StreamConfigurationMap;
        return Camera2StreamConfigurationMap;
    }

    private static com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbackMap Camera2StreamConfigurationMap(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig p0, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> p1) {
        java.lang.Object m23436constructorimpl;
        com.paypal.oslo.feature.onboarding.signup.ui.model.MutableComponentCallbackMap mutableComponentCallbackMap = com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbackMapKt.mutableComponentCallbackMap();
        java.util.List<com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentConfig> components = p0.getComponents();
        java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
        for (com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentConfig componentConfig : components) {
            java.lang.String mo16534getComponentTypeNvngK3s = componentConfig.mo16534getComponentTypeNvngK3s();
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                java.lang.String upperCase = mo16534getComponentTypeNvngK3s.toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType.valueOf(upperCase));
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            if (kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl) != null) {
                m23436constructorimpl = null;
            }
            com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType signupComponentType = (com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType) ((java.lang.Enum) m23436constructorimpl);
            kotlin.Pair pair = signupComponentType != null ? kotlin.TuplesKt.to(componentConfig, signupComponentType) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        for (kotlin.Pair pair2 : arrayList) {
            com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentConfig componentConfig2 = (com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentConfig) pair2.component1();
            if (com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryViewModel.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType) pair2.component2()).ordinal()] == 1) {
                mutableComponentCallbackMap.register(componentConfig2.getComponentId(), new com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Phone(p1));
            }
        }
        return mutableComponentCallbackMap;
    }

    public final void onNextClicked() {
        java.util.List<kotlin.jvm.functions.Function1<java.lang.CharSequence, arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>>> list = this.getHighSpeedVideoFpsRanges;
        java.lang.String m16497getPhoneNumbervCycbc = this.Camera2StreamConfigurationMap.getValue().m16497getPhoneNumbervCycbc();
        java.util.List<kotlin.jvm.functions.Function1<java.lang.CharSequence, arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>>> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add((arrow.core.Either) ((kotlin.jvm.functions.Function1) it.next()).invoke(m16497getPhoneNumbervCycbc));
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = arrayList2;
        boolean z = true;
        if (!arrayList3.isEmpty()) {
            java.util.Iterator it2 = arrayList3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (!((arrow.core.Either) it2.next()).isRight()) {
                    z = false;
                    break;
                }
            }
        }
        this.Camera2StreamConfigurationMap.setValue(new com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PhoneData(com.paypal.oslo.feature.onboarding.api.signup.domain.model.PhoneNumber.m15979constructorimpl(m16497getPhoneNumbervCycbc), arrayList2, null, 4, null));
        if (z) {
            this.getHighSpeedVideoFpsRangesFor.setValue(java.lang.Boolean.TRUE);
        }
    }

    public final void clearNavigateToOtp() {
        this.getHighSpeedVideoFpsRangesFor.setValue(java.lang.Boolean.FALSE);
    }

    public final java.lang.String getCurrentPhoneNumber() {
        return this.Camera2StreamConfigurationMap.getValue().m16497getPhoneNumbervCycbc();
    }

    public final void setApiError(java.lang.String errorMessage) {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PhoneData> mutableStateFlow = this.Camera2StreamConfigurationMap;
        mutableStateFlow.setValue(com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PhoneData.m16494copyAEiZKBk$default(mutableStateFlow.getValue(), null, null, errorMessage, 3, null));
    }

    public final void clearApiError() {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PhoneData> mutableStateFlow = this.Camera2StreamConfigurationMap;
        mutableStateFlow.setValue(com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PhoneData.m16494copyAEiZKBk$default(mutableStateFlow.getValue(), null, null, null, 3, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$gwdQiPrvEQ6ub2wd1TNEKnvZYH0(com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryViewModel phoneEntryViewModel, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = str2.length();
        for (int i = 0; i < length; i++) {
            char charAt = str2.charAt(i);
            if (java.lang.Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        java.lang.String obj = sb.toString();
        if (obj.length() <= 17) {
            java.lang.String m15979constructorimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.PhoneNumber.m15979constructorimpl(obj);
            phoneEntryViewModel.Camera2StreamConfigurationMap.setValue(new com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PhoneData(m15979constructorimpl, kotlin.collections.CollectionsKt.emptyList(), null, 0 == true ? 1 : 0));
            phoneEntryViewModel.getHighSpeedVideoSizes.m16336updatePhoneNumberEzAuIyE(m15979constructorimpl);
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType.values().length];
            try {
                iArr[com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType.PHONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
