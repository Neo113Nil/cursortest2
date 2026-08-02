package com.paypal.oslo.feature.onboarding.signup.ui.model;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentUiState;", "", "Empty", "Name", "Address", "Dropdown", "Email", com.google.common.net.HttpHeaders.LINK, "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentUiState$Address;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentUiState$Dropdown;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentUiState$Email;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentUiState$Empty;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentUiState$Link;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentUiState$Name;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ComponentUiState {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentUiState$Empty;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Empty implements com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Empty INSTANCE = new com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Empty();

        public final int hashCode() {
            return 362195530;
        }

        private Empty() {
        }

        public final java.lang.String toString() {
            return "Empty";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Empty)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012 \b\u0002\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0002¢\u0006\u0004\b\b\u0010\tJ(\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\f\u001a\u00020\u00002 \b\u0002\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R/\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentUiState$Name;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentUiState;", "", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/SignupFieldType;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/validators/domain/ValidationError;", "Lcom/paypal/oslo/feature/onboarding/validators/domain/ValidationSuccess;", "validationResults", "<init>", "(Ljava/util/Map;)V", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentUiState$Name;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getValidationResults"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Name implements com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState {
        public static final int $stable = 8;
        private final java.util.Map<com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType, arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> validationResults;

        /* JADX WARN: Multi-variable type inference failed */
        public Name(java.util.Map<com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType, ? extends arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.validationResults = map;
        }

        public /* synthetic */ Name(java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
        }

        public final java.util.Map<com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType, arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> getValidationResults() {
            return this.validationResults;
        }

        public final java.lang.String toString() {
            java.util.Map<com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType, arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> map = this.validationResults;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Name(validationResults=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.validationResults.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Name) && kotlin.jvm.internal.Intrinsics.areEqual(this.validationResults, ((com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Name) other).validationResults);
        }

        public final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Name copy(java.util.Map<com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType, ? extends arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> validationResults) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validationResults, "");
            return new com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Name(validationResults);
        }

        public final java.util.Map<com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType, arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> component1() {
            return this.validationResults;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Name copy$default(com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Name name2, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                map = name2.validationResults;
            }
            return name2.copy(map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Name() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012 \b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022 \b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u0003\u0010\rR2\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentUiState$Address;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentUiState;", "", "isManualMode", "", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/SignupFieldType;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/validators/domain/ValidationError;", "Lcom/paypal/oslo/feature/onboarding/validators/domain/ValidationSuccess;", "validationResults", "<init>", "(ZLjava/util/Map;)V", "component1", "()Z", "component2", "()Ljava/util/Map;", "copy", "(ZLjava/util/Map;)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentUiState$Address;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "Ljava/util/Map;", "getValidationResults"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Address implements com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState {
        public static final int $stable = 8;
        private final boolean isManualMode;
        private final java.util.Map<com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType, arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> validationResults;

        /* JADX WARN: Multi-variable type inference failed */
        public Address(boolean z, java.util.Map<com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType, ? extends arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.isManualMode = z;
            this.validationResults = map;
        }

        public final boolean isManualMode() {
            return this.isManualMode;
        }

        public /* synthetic */ Address(boolean z, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
        }

        public final java.util.Map<com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType, arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> getValidationResults() {
            return this.validationResults;
        }

        public final java.lang.String toString() {
            boolean z = this.isManualMode;
            java.util.Map<com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType, arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> map = this.validationResults;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Address(isManualMode=");
            sb.append(z);
            sb.append(", validationResults=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Boolean.hashCode(this.isManualMode) * 31) + this.validationResults.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Address)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Address address = (com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Address) other;
            return this.isManualMode == address.isManualMode && kotlin.jvm.internal.Intrinsics.areEqual(this.validationResults, address.validationResults);
        }

        public final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Address copy(boolean isManualMode, java.util.Map<com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType, ? extends arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> validationResults) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validationResults, "");
            return new com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Address(isManualMode, validationResults);
        }

        public final java.util.Map<com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType, arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> component2() {
            return this.validationResults;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsManualMode() {
            return this.isManualMode;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Address copy$default(com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Address address, boolean z, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = address.isManualMode;
            }
            if ((i & 2) != 0) {
                map = address.validationResults;
            }
            return address.copy(z, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Address() {
            this(false, null, 3, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0012\b\u0002\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012 \b\u0002\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0019\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004HÆ\u0003J\u0013\u0010\u001a\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J!\u0010\u001d\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\u000bHÆ\u0003Je\u0010\u001e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\u0012\b\u0002\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2 \b\u0002\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\u000bHÆ\u0001J\u0014\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0083\u0004J\n\u0010\"\u001a\u00020#HÖ\u0081\u0004J\n\u0010$\u001a\u00020%HÖ\u0081\u0004R\u0019\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0016R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0016R)\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentUiState$Dropdown;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentUiState;", "selectedItem", "Lcom/paypal/pds/components/MenuItem;", "Lcom/paypal/pds/components/DropdownItem;", "items", "", "isSearchable", "", "isSearchLoading", "validationResults", "", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/SignupFieldType;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/validators/domain/ValidationError;", "Lcom/paypal/oslo/feature/onboarding/validators/domain/ValidationSuccess;", "<init>", "(Lcom/paypal/pds/components/MenuItem;Ljava/util/List;ZZLjava/util/Map;)V", "getSelectedItem", "()Lcom/paypal/pds/components/MenuItem;", "getItems", "()Ljava/util/List;", "()Z", "getValidationResults", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "", "onboarding_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Dropdown implements com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState {
        public static final int $stable = 8;
        private final com.paypal.pds.components.MenuItem Camera2StreamConfigurationMap;
        private final java.util.List<com.paypal.pds.components.MenuItem> getHighResolutionOutputSizeshNQ4ISI;
        private final java.util.Map<com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType, arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> getHighSpeedVideoFpsRanges;
        private final boolean getHighSpeedVideoFpsRangesFor;
        private final boolean getHighSpeedVideoSizes;

        /* JADX WARN: Multi-variable type inference failed */
        public Dropdown(com.paypal.pds.components.MenuItem menuItem, java.util.List<com.paypal.pds.components.MenuItem> list, boolean z, boolean z2, java.util.Map<com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType, ? extends arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.Camera2StreamConfigurationMap = menuItem;
            this.getHighResolutionOutputSizeshNQ4ISI = list;
            this.getHighSpeedVideoSizes = z;
            this.getHighSpeedVideoFpsRangesFor = z2;
            this.getHighSpeedVideoFpsRanges = map;
        }

        public final com.paypal.pds.components.MenuItem getSelectedItem() {
            return this.Camera2StreamConfigurationMap;
        }

        public /* synthetic */ Dropdown(com.paypal.pds.components.MenuItem menuItem, java.util.List list, boolean z, boolean z2, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : menuItem, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 4) != 0 ? false : z, (i & 8) == 0 ? z2 : false, (i & 16) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
        }

        public final java.util.List<com.paypal.pds.components.MenuItem> getItems() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final boolean isSearchable() {
            return this.getHighSpeedVideoSizes;
        }

        public final boolean isSearchLoading() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final java.util.Map<com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType, arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> getValidationResults() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final java.lang.String toString() {
            com.paypal.pds.components.MenuItem menuItem = this.Camera2StreamConfigurationMap;
            java.util.List<com.paypal.pds.components.MenuItem> list = this.getHighResolutionOutputSizeshNQ4ISI;
            boolean z = this.getHighSpeedVideoSizes;
            boolean z2 = this.getHighSpeedVideoFpsRangesFor;
            java.util.Map<com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType, arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> map = this.getHighSpeedVideoFpsRanges;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Dropdown(selectedItem=");
            sb.append(menuItem);
            sb.append(", items=");
            sb.append(list);
            sb.append(", isSearchable=");
            sb.append(z);
            sb.append(", isSearchLoading=");
            sb.append(z2);
            sb.append(", validationResults=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.pds.components.MenuItem menuItem = this.Camera2StreamConfigurationMap;
            return ((((((((menuItem == null ? 0 : menuItem.hashCode()) * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode()) * 31) + java.lang.Boolean.hashCode(this.getHighSpeedVideoSizes)) * 31) + java.lang.Boolean.hashCode(this.getHighSpeedVideoFpsRangesFor)) * 31) + this.getHighSpeedVideoFpsRanges.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Dropdown)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Dropdown dropdown = (com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Dropdown) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, dropdown.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, dropdown.getHighResolutionOutputSizeshNQ4ISI) && this.getHighSpeedVideoSizes == dropdown.getHighSpeedVideoSizes && this.getHighSpeedVideoFpsRangesFor == dropdown.getHighSpeedVideoFpsRangesFor && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, dropdown.getHighSpeedVideoFpsRanges);
        }

        public final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Dropdown copy(com.paypal.pds.components.MenuItem selectedItem, java.util.List<com.paypal.pds.components.MenuItem> items, boolean isSearchable, boolean isSearchLoading, java.util.Map<com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType, ? extends arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> validationResults) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validationResults, "");
            return new com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Dropdown(selectedItem, items, isSearchable, isSearchLoading, validationResults);
        }

        public final java.util.Map<com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType, arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> component5() {
            return this.getHighSpeedVideoFpsRanges;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getGetHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getGetHighSpeedVideoSizes() {
            return this.getHighSpeedVideoSizes;
        }

        public final java.util.List<com.paypal.pds.components.MenuItem> component2() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.pds.components.MenuItem getCamera2StreamConfigurationMap() {
            return this.Camera2StreamConfigurationMap;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Dropdown copy$default(com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Dropdown dropdown, com.paypal.pds.components.MenuItem menuItem, java.util.List list, boolean z, boolean z2, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                menuItem = dropdown.Camera2StreamConfigurationMap;
            }
            if ((i & 2) != 0) {
                list = dropdown.getHighResolutionOutputSizeshNQ4ISI;
            }
            java.util.List list2 = list;
            if ((i & 4) != 0) {
                z = dropdown.getHighSpeedVideoSizes;
            }
            boolean z3 = z;
            if ((i & 8) != 0) {
                z2 = dropdown.getHighSpeedVideoFpsRangesFor;
            }
            boolean z4 = z2;
            if ((i & 16) != 0) {
                map = dropdown.getHighSpeedVideoFpsRanges;
            }
            return dropdown.copy(menuItem, list2, z3, z4, map);
        }

        public Dropdown() {
            this(null, null, false, false, null, 31, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ,\u0010\u000b\u001a\u00020\u00002\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R)\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentUiState$Email;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentUiState;", "", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/validators/domain/ValidationError;", "Lcom/paypal/oslo/feature/onboarding/validators/domain/ValidationSuccess;", "validationResults", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentUiState$Email;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getValidationResults"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Email implements com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState {
        public static final int $stable = 8;
        private final java.util.List<arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> validationResults;

        /* JADX WARN: Multi-variable type inference failed */
        public Email(java.util.List<? extends arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.validationResults = list;
        }

        public /* synthetic */ Email(java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
        }

        public final java.util.List<arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> getValidationResults() {
            return this.validationResults;
        }

        public final java.lang.String toString() {
            java.util.List<arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> list = this.validationResults;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Email(validationResults=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.validationResults.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Email) && kotlin.jvm.internal.Intrinsics.areEqual(this.validationResults, ((com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Email) other).validationResults);
        }

        public final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Email copy(java.util.List<? extends arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> validationResults) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validationResults, "");
            return new com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Email(validationResults);
        }

        public final java.util.List<arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> component1() {
            return this.validationResults;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Email copy$default(com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Email email, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = email.validationResults;
            }
            return email.copy(list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Email() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentUiState$Link;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentUiState;", "", "isVisible", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentUiState$Link;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Link implements com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState {
        public static final int $stable = 0;
        private final boolean isVisible;

        public Link(boolean z) {
            this.isVisible = z;
        }

        public /* synthetic */ Link(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z);
        }

        public final boolean isVisible() {
            return this.isVisible;
        }

        public final java.lang.String toString() {
            boolean z = this.isVisible;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Link(isVisible=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.isVisible);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Link) && this.isVisible == ((com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Link) other).isVisible;
        }

        public final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Link copy(boolean isVisible) {
            return new com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Link(isVisible);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsVisible() {
            return this.isVisible;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Link copy$default(com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Link link, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = link.isVisible;
            }
            return link.copy(z);
        }

        public Link() {
            this(false, 1, null);
        }
    }
}
