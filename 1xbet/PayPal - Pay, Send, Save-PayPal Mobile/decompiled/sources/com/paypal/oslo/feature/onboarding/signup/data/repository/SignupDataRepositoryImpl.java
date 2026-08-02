package com.paypal.oslo.feature.onboarding.signup.data.repository;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\bJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\bJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\u0003R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010&\u001a\b\u0012\u0004\u0012\u00020\u001e0%8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/data/repository/SignupDataRepositoryImpl;", "Lcom/paypal/oslo/feature/onboarding/signup/domain/repository/SignupDataRepository;", "<init>", "()V", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/PhoneNumber;", "phone", "", "updatePhoneNumber-EzAuIyE", "(Ljava/lang/String;)V", "updatePhoneNumber", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/Email;", "email", "updateEmail-RQoNrjY", "updateEmail", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/Name;", "name", "updateName", "(Lcom/paypal/oslo/feature/onboarding/signup/domain/model/Name;)V", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "address", "updateAddress", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;)V", "Lcom/paypal/oslo/feature/onboarding/signup/password/domain/model/Password;", "password", "updatePassword-0q9jJwI", "updatePassword", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/GoogleToken;", "googleToken", "updateGoogleToken-d-_PDoU", "updateGoogleToken", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/SignupData;", "getCurrentSignupState", "()Lcom/paypal/oslo/feature/onboarding/signup/domain/model/SignupData;", "clearSignupData", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "signupData", "Lkotlinx/coroutines/flow/StateFlow;", "getSignupData", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SignupDataRepositoryImpl implements com.paypal.oslo.feature.onboarding.signup.domain.repository.SignupDataRepository {
    public static final int $stable = 8;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData> getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData> signupData;

    @javax.inject.Inject
    public SignupDataRepositoryImpl() {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData.INSTANCE.empty());
        this.getHighSpeedVideoSizes = MutableStateFlow;
        this.signupData = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    @Override // com.paypal.oslo.feature.onboarding.signup.domain.repository.SignupDataRepository
    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData> getSignupData() {
        return this.signupData;
    }

    @Override // com.paypal.oslo.feature.onboarding.signup.domain.repository.SignupDataRepository
    /* renamed from: updatePhoneNumber-EzAuIyE, reason: not valid java name */
    public final void mo16272updatePhoneNumberEzAuIyE(java.lang.String phone) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phone, "");
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData> mutableStateFlow = this.getHighSpeedVideoSizes;
        mutableStateFlow.setValue(com.paypal.oslo.feature.onboarding.signup.domain.model.SignupDataKt.m16326updatePhoneNumberMo8Xu2s(mutableStateFlow.getValue(), phone));
    }

    @Override // com.paypal.oslo.feature.onboarding.signup.domain.repository.SignupDataRepository
    /* renamed from: updateEmail-RQoNrjY, reason: not valid java name */
    public final void mo16269updateEmailRQoNrjY(java.lang.String email) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData> mutableStateFlow = this.getHighSpeedVideoSizes;
        mutableStateFlow.setValue(com.paypal.oslo.feature.onboarding.signup.domain.model.SignupDataKt.m16323updateEmailTNt61W4(mutableStateFlow.getValue(), email));
    }

    @Override // com.paypal.oslo.feature.onboarding.signup.domain.repository.SignupDataRepository
    public final void updateName(com.paypal.oslo.feature.onboarding.signup.domain.model.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData> mutableStateFlow = this.getHighSpeedVideoSizes;
        mutableStateFlow.setValue(com.paypal.oslo.feature.onboarding.signup.domain.model.SignupDataKt.updateName(mutableStateFlow.getValue(), name2));
    }

    @Override // com.paypal.oslo.feature.onboarding.signup.domain.repository.SignupDataRepository
    public final void updateAddress(com.paypal.oslo.core.i18n.domain.model.Address address) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData> mutableStateFlow = this.getHighSpeedVideoSizes;
        mutableStateFlow.setValue(com.paypal.oslo.feature.onboarding.signup.domain.model.SignupDataKt.updateAddress(mutableStateFlow.getValue(), address));
    }

    @Override // com.paypal.oslo.feature.onboarding.signup.domain.repository.SignupDataRepository
    /* renamed from: updatePassword-0q9jJwI, reason: not valid java name */
    public final void mo16271updatePassword0q9jJwI(java.lang.String password) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(password, "");
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData> mutableStateFlow = this.getHighSpeedVideoSizes;
        mutableStateFlow.setValue(com.paypal.oslo.feature.onboarding.signup.domain.model.SignupDataKt.m16325updatePasswordOemDTCI(mutableStateFlow.getValue(), password));
    }

    @Override // com.paypal.oslo.feature.onboarding.signup.domain.repository.SignupDataRepository
    /* renamed from: updateGoogleToken-d-_PDoU, reason: not valid java name */
    public final void mo16270updateGoogleTokend_PDoU(java.lang.String googleToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleToken, "");
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData> mutableStateFlow = this.getHighSpeedVideoSizes;
        mutableStateFlow.setValue(com.paypal.oslo.feature.onboarding.signup.domain.model.SignupDataKt.m16324updateGoogleTokenMUset20(mutableStateFlow.getValue(), googleToken));
    }

    @Override // com.paypal.oslo.feature.onboarding.signup.domain.repository.SignupDataRepository
    public final com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData getCurrentSignupState() {
        return this.getHighSpeedVideoSizes.getValue();
    }

    @Override // com.paypal.oslo.feature.onboarding.signup.domain.repository.SignupDataRepository
    public final void clearSignupData() {
        this.getHighSpeedVideoSizes.setValue(com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData.INSTANCE.empty());
    }
}
