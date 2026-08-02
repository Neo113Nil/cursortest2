package com.paypal.oslo.feature.onboarding.signup.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0010J\u0015\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0010J\u0015\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u0010J\u0015\u0010 \u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010\u0010J\u0015\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u000e¢\u0006\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/domain/usecase/SignupDataManager;", "", "Lcom/paypal/oslo/feature/onboarding/signup/domain/repository/SignupDataRepository;", "signupDataRepository", "<init>", "(Lcom/paypal/oslo/feature/onboarding/signup/domain/repository/SignupDataRepository;)V", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/SignupData;", "observeState", "()Lkotlinx/coroutines/flow/StateFlow;", "getCurrentState", "()Lcom/paypal/oslo/feature/onboarding/signup/domain/model/SignupData;", "", "firstName", "", "updateFirstName", "(Ljava/lang/String;)V", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/GoogleToken;", "googleToken", "updateGoogleToken-d-_PDoU", "updateGoogleToken", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/Email;", "email", "updateEmail-RQoNrjY", "updateEmail", "Lcom/paypal/oslo/feature/onboarding/signup/password/domain/model/Password;", "password", "updatePassword-0q9jJwI", "updatePassword", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/PhoneNumber;", "phone", "updatePhoneNumber-EzAuIyE", "updatePhoneNumber", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/Name;", "name", "updateName", "(Lcom/paypal/oslo/feature/onboarding/signup/domain/model/Name;)V", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "address", "updateAddress", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;)V", "clearSignupData", "()V", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/onboarding/signup/domain/repository/SignupDataRepository;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SignupDataManager {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.onboarding.signup.domain.repository.SignupDataRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public SignupDataManager(com.paypal.oslo.feature.onboarding.signup.domain.repository.SignupDataRepository signupDataRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupDataRepository, "");
        this.Camera2StreamConfigurationMap = signupDataRepository;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData> observeState() {
        return this.Camera2StreamConfigurationMap.getSignupData();
    }

    public final com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData getCurrentState() {
        return this.Camera2StreamConfigurationMap.getCurrentSignupState();
    }

    public final void updateFirstName(java.lang.String firstName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstName, "");
        this.Camera2StreamConfigurationMap.updateName(com.paypal.oslo.feature.onboarding.signup.domain.model.Name.m16300copyRV_47s$default(getCurrentState().getName(), com.paypal.oslo.feature.onboarding.api.signup.domain.model.FirstName.m15931constructorimpl(firstName), null, 2, null));
    }

    /* renamed from: updateGoogleToken-d-_PDoU, reason: not valid java name */
    public final void m16334updateGoogleTokend_PDoU(java.lang.String googleToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleToken, "");
        this.Camera2StreamConfigurationMap.mo16270updateGoogleTokend_PDoU(googleToken);
    }

    /* renamed from: updateEmail-RQoNrjY, reason: not valid java name */
    public final void m16333updateEmailRQoNrjY(java.lang.String email) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
        this.Camera2StreamConfigurationMap.mo16269updateEmailRQoNrjY(email);
    }

    /* renamed from: updatePassword-0q9jJwI, reason: not valid java name */
    public final void m16335updatePassword0q9jJwI(java.lang.String password) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(password, "");
        this.Camera2StreamConfigurationMap.mo16271updatePassword0q9jJwI(password);
    }

    /* renamed from: updatePhoneNumber-EzAuIyE, reason: not valid java name */
    public final void m16336updatePhoneNumberEzAuIyE(java.lang.String phone) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phone, "");
        this.Camera2StreamConfigurationMap.mo16272updatePhoneNumberEzAuIyE(phone);
    }

    public final void updateName(com.paypal.oslo.feature.onboarding.signup.domain.model.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        this.Camera2StreamConfigurationMap.updateName(name2);
    }

    public final void updateAddress(com.paypal.oslo.core.i18n.domain.model.Address address) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        this.Camera2StreamConfigurationMap.updateAddress(address);
    }

    public final void clearSignupData() {
        this.Camera2StreamConfigurationMap.clearSignupData();
    }
}
