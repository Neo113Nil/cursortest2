package com.ingo.sdk.kotlin.common.features.customer_enrollment.model;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0011"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/customer_enrollment/model/CustomerEnrollmentResponse;", "", "", "customerId", "", "Lcom/ingo/sdk/kotlin/common/features/customer/model/Account;", "accounts", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/ingo/sdk/kotlin/common/features/customer_enrollment/model/CustomerEnrollmentResponse;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sharedSdk_release", "(Lcom/ingo/sdk/kotlin/common/features/customer_enrollment/model/CustomerEnrollmentResponse;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getCustomerId", "Ljava/util/List;", "getAccounts", "Companion", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes.dex */
public final /* data */ class CustomerEnrollmentResponse {
    private final java.util.List<com.ingo.sdk.kotlin.common.features.customer.model.Account> accounts;
    private final java.lang.String customerId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.ingo.sdk.kotlin.common.features.customer_enrollment.model.CustomerEnrollmentResponse.Companion INSTANCE = new com.ingo.sdk.kotlin.common.features.customer_enrollment.model.CustomerEnrollmentResponse.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.kotlin.common.features.customer_enrollment.model.CustomerEnrollmentResponse$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.ingo.sdk.kotlin.common.features.customer_enrollment.model.CustomerEnrollmentResponse.m10773$r8$lambda$5NgAlYwDTvVC64zNWjBTrYupIc();
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/customer_enrollment/model/CustomerEnrollmentResponse$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingo/sdk/kotlin/common/features/customer_enrollment/model/CustomerEnrollmentResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        public final kotlinx.serialization.KSerializer<com.ingo.sdk.kotlin.common.features.customer_enrollment.model.CustomerEnrollmentResponse> serializer() {
            return com.ingo.sdk.kotlin.common.features.customer_enrollment.model.CustomerEnrollmentResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ CustomerEnrollmentResponse(int i, java.lang.String str, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.ingo.sdk.kotlin.common.features.customer_enrollment.model.CustomerEnrollmentResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.customerId = str;
        if ((i & 2) == 0) {
            this.accounts = null;
        } else {
            this.accounts = list;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$sharedSdk_release(com.ingo.sdk.kotlin.common.features.customer_enrollment.model.CustomerEnrollmentResponse self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.customerId);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.accounts != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.accounts);
        }
    }

    public CustomerEnrollmentResponse(java.lang.String str, java.util.List<com.ingo.sdk.kotlin.common.features.customer.model.Account> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.customerId = str;
        this.accounts = list;
    }

    public /* synthetic */ CustomerEnrollmentResponse(java.lang.String str, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : list);
    }

    public final java.util.List<com.ingo.sdk.kotlin.common.features.customer.model.Account> getAccounts() {
        return this.accounts;
    }

    public final java.lang.String getCustomerId() {
        return this.customerId;
    }

    /* renamed from: $r8$lambda$5NgAlYwD-TvVC64zNWjBTrYupIc, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m10773$r8$lambda$5NgAlYwDTvVC64zNWjBTrYupIc() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.ingo.sdk.kotlin.common.features.customer.model.Account$$serializer.INSTANCE);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.customerId;
        java.util.List<com.ingo.sdk.kotlin.common.features.customer.model.Account> list = this.accounts;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomerEnrollmentResponse(customerId=");
        sb.append(str);
        sb.append(", accounts=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.customerId.hashCode();
        java.util.List<com.ingo.sdk.kotlin.common.features.customer.model.Account> list = this.accounts;
        return (hashCode * 31) + (list == null ? 0 : list.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.ingo.sdk.kotlin.common.features.customer_enrollment.model.CustomerEnrollmentResponse)) {
            return false;
        }
        com.ingo.sdk.kotlin.common.features.customer_enrollment.model.CustomerEnrollmentResponse customerEnrollmentResponse = (com.ingo.sdk.kotlin.common.features.customer_enrollment.model.CustomerEnrollmentResponse) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.customerId, customerEnrollmentResponse.customerId) && kotlin.jvm.internal.Intrinsics.areEqual(this.accounts, customerEnrollmentResponse.accounts);
    }

    public final com.ingo.sdk.kotlin.common.features.customer_enrollment.model.CustomerEnrollmentResponse copy(java.lang.String customerId, java.util.List<com.ingo.sdk.kotlin.common.features.customer.model.Account> accounts) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerId, "");
        return new com.ingo.sdk.kotlin.common.features.customer_enrollment.model.CustomerEnrollmentResponse(customerId, accounts);
    }

    public final java.util.List<com.ingo.sdk.kotlin.common.features.customer.model.Account> component2() {
        return this.accounts;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCustomerId() {
        return this.customerId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.ingo.sdk.kotlin.common.features.customer_enrollment.model.CustomerEnrollmentResponse copy$default(com.ingo.sdk.kotlin.common.features.customer_enrollment.model.CustomerEnrollmentResponse customerEnrollmentResponse, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = customerEnrollmentResponse.customerId;
        }
        if ((i & 2) != 0) {
            list = customerEnrollmentResponse.accounts;
        }
        return customerEnrollmentResponse.copy(str, list);
    }
}
