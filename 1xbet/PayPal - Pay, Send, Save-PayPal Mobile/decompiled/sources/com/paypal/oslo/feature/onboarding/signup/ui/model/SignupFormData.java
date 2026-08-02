package com.paypal.oslo.feature.onboarding.signup.ui.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData;", "", "EmailData", "PhoneData", "PasswordData", "NameData", "AddressData", "PersonalData", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$AddressData;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$EmailData;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$NameData;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$None;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$PasswordData;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$PersonalData;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$PhoneData;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface SignupFormData {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$EmailData;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/Email;", "email", "<init>", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-BvNj-jI", "()Ljava/lang/String;", "component1", "copy-RQoNrjY", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$EmailData;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "Ljava/lang/String;", "getEmail-BvNj-jI"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EmailData implements com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData {
        public static final int $stable = 0;
        private final java.lang.String email;

        private EmailData(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.email = str;
        }

        public /* synthetic */ EmailData(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15922constructorimpl("") : str, null);
        }

        /* renamed from: getEmail-BvNj-jI, reason: not valid java name */
        public final java.lang.String m16483getEmailBvNjjI() {
            return this.email;
        }

        public final java.lang.String toString() {
            java.lang.String m15926toStringimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15926toStringimpl(this.email);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EmailData(email=");
            sb.append(m15926toStringimpl);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15925hashCodeimpl(this.email);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.EmailData) && com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15924equalsimpl0(this.email, ((com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.EmailData) other).email);
        }

        /* renamed from: copy-RQoNrjY, reason: not valid java name */
        public final com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.EmailData m16482copyRQoNrjY(java.lang.String email) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
            return new com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.EmailData(email, null);
        }

        /* renamed from: component1-BvNj-jI, reason: not valid java name and from getter */
        public final java.lang.String getEmail() {
            return this.email;
        }

        /* renamed from: copy-RQoNrjY$default, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.EmailData m16480copyRQoNrjY$default(com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.EmailData emailData, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = emailData.email;
            }
            return emailData.m16482copyRQoNrjY(str);
        }

        public /* synthetic */ EmailData(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJB\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR,\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b#\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$PhoneData;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/PhoneNumber;", "phoneNumber", "", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/validators/domain/ValidationError;", "Lcom/paypal/oslo/feature/onboarding/validators/domain/ValidationSuccess;", "validationResults", "", "apiErrorMessage", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-v-Cycbc", "()Ljava/lang/String;", "component1", "component2", "()Ljava/util/List;", "component3", "copy-AEiZKBk", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$PhoneData;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPhoneNumber-v-Cycbc", "Ljava/util/List;", "getValidationResults", "getApiErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PhoneData implements com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData {
        public static final int $stable = 8;
        private final java.lang.String apiErrorMessage;
        private final java.lang.String phoneNumber;
        private final java.util.List<arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> validationResults;

        /* JADX WARN: Multi-variable type inference failed */
        private PhoneData(java.lang.String str, java.util.List<? extends arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> list, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.phoneNumber = str;
            this.validationResults = list;
            this.apiErrorMessage = str2;
        }

        public /* synthetic */ PhoneData(java.lang.String str, java.util.List list, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.feature.onboarding.api.signup.domain.model.PhoneNumber.m15979constructorimpl("") : str, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : str2, null);
        }

        /* renamed from: getPhoneNumber-v-Cycbc, reason: not valid java name */
        public final java.lang.String m16497getPhoneNumbervCycbc() {
            return this.phoneNumber;
        }

        public final java.util.List<arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> getValidationResults() {
            return this.validationResults;
        }

        public final java.lang.String getApiErrorMessage() {
            return this.apiErrorMessage;
        }

        public final java.lang.String toString() {
            java.lang.String m15983toStringimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.PhoneNumber.m15983toStringimpl(this.phoneNumber);
            java.util.List<arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> list = this.validationResults;
            java.lang.String str = this.apiErrorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PhoneData(phoneNumber=");
            sb.append(m15983toStringimpl);
            sb.append(", validationResults=");
            sb.append(list);
            sb.append(", apiErrorMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int m15982hashCodeimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.PhoneNumber.m15982hashCodeimpl(this.phoneNumber);
            int hashCode = this.validationResults.hashCode();
            java.lang.String str = this.apiErrorMessage;
            return (((m15982hashCodeimpl * 31) + hashCode) * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PhoneData)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PhoneData phoneData = (com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PhoneData) other;
            return com.paypal.oslo.feature.onboarding.api.signup.domain.model.PhoneNumber.m15981equalsimpl0(this.phoneNumber, phoneData.phoneNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.validationResults, phoneData.validationResults) && kotlin.jvm.internal.Intrinsics.areEqual(this.apiErrorMessage, phoneData.apiErrorMessage);
        }

        /* renamed from: copy-AEiZKBk, reason: not valid java name */
        public final com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PhoneData m16496copyAEiZKBk(java.lang.String phoneNumber, java.util.List<? extends arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> validationResults, java.lang.String apiErrorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validationResults, "");
            return new com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PhoneData(phoneNumber, validationResults, apiErrorMessage, null);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getApiErrorMessage() {
            return this.apiErrorMessage;
        }

        public final java.util.List<arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> component2() {
            return this.validationResults;
        }

        /* renamed from: component1-v-Cycbc, reason: not valid java name and from getter */
        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: copy-AEiZKBk$default, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PhoneData m16494copyAEiZKBk$default(com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PhoneData phoneData, java.lang.String str, java.util.List list, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = phoneData.phoneNumber;
            }
            if ((i & 2) != 0) {
                list = phoneData.validationResults;
            }
            if ((i & 4) != 0) {
                str2 = phoneData.apiErrorMessage;
            }
            return phoneData.m16496copyAEiZKBk(str, list, str2);
        }

        public /* synthetic */ PhoneData(java.lang.String str, java.util.List list, java.lang.String str2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, list, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0011R,\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$PasswordData;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData;", "Lcom/paypal/oslo/feature/onboarding/signup/password/domain/model/Password;", "password", "", "showPasswordHints", "", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/validators/domain/ValidationError;", "Lcom/paypal/oslo/feature/onboarding/validators/domain/ValidationSuccess;", "validationResults", "<init>", "(Ljava/lang/String;ZLjava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-WarBkgA", "()Ljava/lang/String;", "component1", "component2", "()Z", "component3", "()Ljava/util/List;", "copy-uEj6_PA", "(Ljava/lang/String;ZLjava/util/List;)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$PasswordData;", "copy", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "Ljava/lang/String;", "getPassword-WarBkgA", "Z", "getShowPasswordHints", "Ljava/util/List;", "getValidationResults"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PasswordData implements com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData {
        public static final int $stable = 8;
        private final java.lang.String password;
        private final boolean showPasswordHints;
        private final java.util.List<arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> validationResults;

        /* JADX WARN: Multi-variable type inference failed */
        private PasswordData(java.lang.String str, boolean z, java.util.List<? extends arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.password = str;
            this.showPasswordHints = z;
            this.validationResults = list;
        }

        public /* synthetic */ PasswordData(java.lang.String str, boolean z, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.feature.onboarding.signup.password.domain.model.Password.m16373constructorimpl("") : str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, null);
        }

        /* renamed from: getPassword-WarBkgA, reason: not valid java name */
        public final java.lang.String m16493getPasswordWarBkgA() {
            return this.password;
        }

        public final boolean getShowPasswordHints() {
            return this.showPasswordHints;
        }

        public final java.util.List<arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> getValidationResults() {
            return this.validationResults;
        }

        public final java.lang.String toString() {
            java.lang.String m16377toStringimpl = com.paypal.oslo.feature.onboarding.signup.password.domain.model.Password.m16377toStringimpl(this.password);
            boolean z = this.showPasswordHints;
            java.util.List<arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> list = this.validationResults;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PasswordData(password=");
            sb.append(m16377toStringimpl);
            sb.append(", showPasswordHints=");
            sb.append(z);
            sb.append(", validationResults=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((com.paypal.oslo.feature.onboarding.signup.password.domain.model.Password.m16376hashCodeimpl(this.password) * 31) + java.lang.Boolean.hashCode(this.showPasswordHints)) * 31) + this.validationResults.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PasswordData)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PasswordData passwordData = (com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PasswordData) other;
            return com.paypal.oslo.feature.onboarding.signup.password.domain.model.Password.m16375equalsimpl0(this.password, passwordData.password) && this.showPasswordHints == passwordData.showPasswordHints && kotlin.jvm.internal.Intrinsics.areEqual(this.validationResults, passwordData.validationResults);
        }

        /* renamed from: copy-uEj6_PA, reason: not valid java name */
        public final com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PasswordData m16492copyuEj6_PA(java.lang.String password, boolean showPasswordHints, java.util.List<? extends arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> validationResults) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(password, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validationResults, "");
            return new com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PasswordData(password, showPasswordHints, validationResults, null);
        }

        public final java.util.List<arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> component3() {
            return this.validationResults;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShowPasswordHints() {
            return this.showPasswordHints;
        }

        /* renamed from: component1-WarBkgA, reason: not valid java name and from getter */
        public final java.lang.String getPassword() {
            return this.password;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: copy-uEj6_PA$default, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PasswordData m16490copyuEj6_PA$default(com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PasswordData passwordData, java.lang.String str, boolean z, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = passwordData.password;
            }
            if ((i & 2) != 0) {
                z = passwordData.showPasswordHints;
            }
            if ((i & 4) != 0) {
                list = passwordData.validationResults;
            }
            return passwordData.m16492copyuEj6_PA(str, z, list);
        }

        public /* synthetic */ PasswordData(java.lang.String str, boolean z, java.util.List list, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$NameData;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/FirstName;", "firstName", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/LastName;", "lastName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-w8YRmDk", "()Ljava/lang/String;", "component1", "component2-i7KAUmI", "component2", "copy-RV_4-7s", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$NameData;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "Ljava/lang/String;", "getFirstName-w8YRmDk", "getLastName-i7KAUmI"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NameData implements com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData {
        public static final int $stable = 0;
        private final java.lang.String firstName;
        private final java.lang.String lastName;

        private NameData(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.firstName = str;
            this.lastName = str2;
        }

        public /* synthetic */ NameData(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.feature.onboarding.api.signup.domain.model.FirstName.m15931constructorimpl("") : str, (i & 2) != 0 ? com.paypal.oslo.feature.onboarding.api.signup.domain.model.LastName.m15970constructorimpl("") : str2, null);
        }

        /* renamed from: getFirstName-w8YRmDk, reason: not valid java name */
        public final java.lang.String m16488getFirstNamew8YRmDk() {
            return this.firstName;
        }

        /* renamed from: getLastName-i7KAUmI, reason: not valid java name */
        public final java.lang.String m16489getLastNamei7KAUmI() {
            return this.lastName;
        }

        public final java.lang.String toString() {
            java.lang.String m15935toStringimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.FirstName.m15935toStringimpl(this.firstName);
            java.lang.String m15974toStringimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.LastName.m15974toStringimpl(this.lastName);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NameData(firstName=");
            sb.append(m15935toStringimpl);
            sb.append(", lastName=");
            sb.append(m15974toStringimpl);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (com.paypal.oslo.feature.onboarding.api.signup.domain.model.FirstName.m15934hashCodeimpl(this.firstName) * 31) + com.paypal.oslo.feature.onboarding.api.signup.domain.model.LastName.m15973hashCodeimpl(this.lastName);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.NameData)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.NameData nameData = (com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.NameData) other;
            return com.paypal.oslo.feature.onboarding.api.signup.domain.model.FirstName.m15933equalsimpl0(this.firstName, nameData.firstName) && com.paypal.oslo.feature.onboarding.api.signup.domain.model.LastName.m15972equalsimpl0(this.lastName, nameData.lastName);
        }

        /* renamed from: copy-RV_4-7s, reason: not valid java name */
        public final com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.NameData m16487copyRV_47s(java.lang.String firstName, java.lang.String lastName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastName, "");
            return new com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.NameData(firstName, lastName, null);
        }

        /* renamed from: component2-i7KAUmI, reason: not valid java name and from getter */
        public final java.lang.String getLastName() {
            return this.lastName;
        }

        /* renamed from: component1-w8YRmDk, reason: not valid java name and from getter */
        public final java.lang.String getFirstName() {
            return this.firstName;
        }

        /* renamed from: copy-RV_4-7s$default, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.NameData m16484copyRV_47s$default(com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.NameData nameData, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = nameData.firstName;
            }
            if ((i & 2) != 0) {
                str2 = nameData.lastName;
            }
            return nameData.m16487copyRV_47s(str, str2);
        }

        public /* synthetic */ NameData(java.lang.String str, java.lang.String str2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$AddressData;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData;", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "address", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;)V", "component1", "()Lcom/paypal/oslo/core/i18n/domain/model/Address;", "copy", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$AddressData;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "getAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddressData implements com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData {
        public static final int $stable = 8;
        private final com.paypal.oslo.core.i18n.domain.model.Address address;

        public AddressData(com.paypal.oslo.core.i18n.domain.model.Address address) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
            this.address = address;
        }

        public /* synthetic */ AddressData(com.paypal.oslo.core.i18n.domain.model.Address address, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new com.paypal.oslo.core.i18n.domain.model.Address(null, null, null, null, null, null, null, null, null, null, 1023, null) : address);
        }

        public final com.paypal.oslo.core.i18n.domain.model.Address getAddress() {
            return this.address;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.i18n.domain.model.Address address = this.address;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressData(address=");
            sb.append(address);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.address.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.AddressData) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, ((com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.AddressData) other).address);
        }

        public final com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.AddressData copy(com.paypal.oslo.core.i18n.domain.model.Address address) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
            return new com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.AddressData(address);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.i18n.domain.model.Address getAddress() {
            return this.address;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.AddressData copy$default(com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.AddressData addressData, com.paypal.oslo.core.i18n.domain.model.Address address, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                address = addressData.address;
            }
            return addressData.copy(address);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AddressData() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$PersonalData;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$NameData;", "name", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "address", "<init>", "(Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$NameData;Lcom/paypal/oslo/core/i18n/domain/model/Address;)V", "component1", "()Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$NameData;", "component2", "()Lcom/paypal/oslo/core/i18n/domain/model/Address;", "copy", "(Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$NameData;Lcom/paypal/oslo/core/i18n/domain/model/Address;)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$PersonalData;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$NameData;", "getName", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "getAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PersonalData implements com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData {
        public static final int $stable = 8;
        private final com.paypal.oslo.core.i18n.domain.model.Address address;
        private final com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.NameData name;

        public PersonalData(com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.NameData nameData, com.paypal.oslo.core.i18n.domain.model.Address address) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
            this.name = nameData;
            this.address = address;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ PersonalData(com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.NameData nameData, com.paypal.oslo.core.i18n.domain.model.Address address, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(r0, (i & 2) != 0 ? new com.paypal.oslo.core.i18n.domain.model.Address(null, null, null, null, null, null, null, null, null, null, 1023, null) : address);
            com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.NameData nameData2;
            if ((i & 1) != 0) {
                nameData2 = new com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.NameData(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            } else {
                nameData2 = nameData;
            }
        }

        public final com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.NameData getName() {
            return this.name;
        }

        public final com.paypal.oslo.core.i18n.domain.model.Address getAddress() {
            return this.address;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.NameData nameData = this.name;
            com.paypal.oslo.core.i18n.domain.model.Address address = this.address;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PersonalData(name=");
            sb.append(nameData);
            sb.append(", address=");
            sb.append(address);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.name.hashCode() * 31) + this.address.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PersonalData)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PersonalData personalData = (com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PersonalData) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, personalData.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, personalData.address);
        }

        public final com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PersonalData copy(com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.NameData name2, com.paypal.oslo.core.i18n.domain.model.Address address) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
            return new com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PersonalData(name2, address);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.i18n.domain.model.Address getAddress() {
            return this.address;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.NameData getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PersonalData copy$default(com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PersonalData personalData, com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.NameData nameData, com.paypal.oslo.core.i18n.domain.model.Address address, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                nameData = personalData.name;
            }
            if ((i & 2) != 0) {
                address = personalData.address;
            }
            return personalData.copy(nameData, address);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PersonalData() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$None;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class None implements com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.None INSTANCE = new com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.None();

        public final int hashCode() {
            return -881405323;
        }

        private None() {
        }

        public final java.lang.String toString() {
            return com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.None)) {
                return false;
            }
            return true;
        }
    }
}
