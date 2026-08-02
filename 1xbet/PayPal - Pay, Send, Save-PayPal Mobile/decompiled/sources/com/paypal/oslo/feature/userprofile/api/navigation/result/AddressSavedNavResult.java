package com.paypal.oslo.feature.userprofile.api.navigation.result;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/api/navigation/result/AddressSavedNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "Lcom/paypal/oslo/core/userstore/model/ProfileAddress;", "address", "<init>", "(Lcom/paypal/oslo/core/userstore/model/ProfileAddress;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/core/userstore/model/ProfileAddress;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/core/userstore/model/ProfileAddress;", "copy", "(Lcom/paypal/oslo/core/userstore/model/ProfileAddress;)Lcom/paypal/oslo/feature/userprofile/api/navigation/result/AddressSavedNavResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$user_profile_api_prodRelease", "(Lcom/paypal/oslo/feature/userprofile/api/navigation/result/AddressSavedNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/core/userstore/model/ProfileAddress;", "getAddress", "getAddress$annotations", "()V", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class AddressSavedNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    private final com.paypal.oslo.core.userstore.model.ProfileAddress address;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.userprofile.api.navigation.result.AddressSavedNavResult.Companion INSTANCE = new com.paypal.oslo.feature.userprofile.api.navigation.result.AddressSavedNavResult.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.api.navigation.result.AddressSavedNavResult$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.userprofile.api.navigation.result.AddressSavedNavResult.m20436$r8$lambda$mrWlWGePUaFOuxnHspUoPzKQCo();
        }
    })};

    public static /* synthetic */ void getAddress$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/api/navigation/result/AddressSavedNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/userprofile/api/navigation/result/AddressSavedNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.userprofile.api.navigation.result.AddressSavedNavResult> serializer() {
            return com.paypal.oslo.feature.userprofile.api.navigation.result.AddressSavedNavResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AddressSavedNavResult(int i, com.paypal.oslo.core.userstore.model.ProfileAddress profileAddress, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.userprofile.api.navigation.result.AddressSavedNavResult$$serializer.INSTANCE.getDescriptor());
        }
        this.address = profileAddress;
    }

    public AddressSavedNavResult(com.paypal.oslo.core.userstore.model.ProfileAddress profileAddress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profileAddress, "");
        this.address = profileAddress;
    }

    public final com.paypal.oslo.core.userstore.model.ProfileAddress getAddress() {
        return this.address;
    }

    /* renamed from: $r8$lambda$mrWlWGePUaFOuxnHsp-UoPzKQCo, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m20436$r8$lambda$mrWlWGePUaFOuxnHspUoPzKQCo() {
        return new kotlinx.serialization.ContextualSerializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.userstore.model.ProfileAddress.class), null, new kotlinx.serialization.KSerializer[0]);
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.userstore.model.ProfileAddress profileAddress = this.address;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressSavedNavResult(address=");
        sb.append(profileAddress);
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
        return (other instanceof com.paypal.oslo.feature.userprofile.api.navigation.result.AddressSavedNavResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, ((com.paypal.oslo.feature.userprofile.api.navigation.result.AddressSavedNavResult) other).address);
    }

    public final com.paypal.oslo.feature.userprofile.api.navigation.result.AddressSavedNavResult copy(com.paypal.oslo.core.userstore.model.ProfileAddress address) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        return new com.paypal.oslo.feature.userprofile.api.navigation.result.AddressSavedNavResult(address);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.userstore.model.ProfileAddress getAddress() {
        return this.address;
    }

    public static /* synthetic */ com.paypal.oslo.feature.userprofile.api.navigation.result.AddressSavedNavResult copy$default(com.paypal.oslo.feature.userprofile.api.navigation.result.AddressSavedNavResult addressSavedNavResult, com.paypal.oslo.core.userstore.model.ProfileAddress profileAddress, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            profileAddress = addressSavedNavResult.address;
        }
        return addressSavedNavResult.copy(profileAddress);
    }
}
