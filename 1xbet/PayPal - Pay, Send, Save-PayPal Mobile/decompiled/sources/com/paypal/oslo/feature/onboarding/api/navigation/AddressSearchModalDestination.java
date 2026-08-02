package com.paypal.oslo.feature.onboarding.api.navigation;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b&\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/navigation/AddressSearchModalDestination;", "Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", "countryCode", "", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-ALGuh4w", "()Ljava/lang/String;", "component1", "component2", "copy-n_l99Nk", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/api/navigation/AddressSearchModalDestination;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$onboarding_api_prodRelease", "(Lcom/paypal/oslo/feature/onboarding/api/navigation/AddressSearchModalDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getCountryCode-ALGuh4w", "getFlowName", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class AddressSearchModalDestination implements androidx.navigation3.runtime.NavKey {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.onboarding.api.navigation.AddressSearchModalDestination.Companion INSTANCE = new com.paypal.oslo.feature.onboarding.api.navigation.AddressSearchModalDestination.Companion(null);
    private final java.lang.String countryCode;
    private final java.lang.String flowName;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/navigation/AddressSearchModalDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/onboarding/api/navigation/AddressSearchModalDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.onboarding.api.navigation.AddressSearchModalDestination> serializer() {
            return com.paypal.oslo.feature.onboarding.api.navigation.AddressSearchModalDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ AddressSearchModalDestination(int i, java.lang.String str, java.lang.String str2) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.onboarding.api.navigation.AddressSearchModalDestination$$serializer.INSTANCE.getDescriptor());
        }
        this.countryCode = str;
        this.flowName = str2;
    }

    private AddressSearchModalDestination(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.countryCode = str;
        this.flowName = str2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$onboarding_api_prodRelease(com.paypal.oslo.feature.onboarding.api.navigation.AddressSearchModalDestination self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.core.i18n.domain.model.CountryCode$$serializer.INSTANCE, com.paypal.oslo.core.i18n.domain.model.CountryCode.m11363boximpl(self.countryCode));
        output.encodeStringElement(serialDesc, 1, self.flowName);
    }

    /* renamed from: getCountryCode-ALGuh4w, reason: not valid java name */
    public final java.lang.String m15884getCountryCodeALGuh4w() {
        return this.countryCode;
    }

    public final java.lang.String getFlowName() {
        return this.flowName;
    }

    public final java.lang.String toString() {
        java.lang.String m11368toStringimpl = com.paypal.oslo.core.i18n.domain.model.CountryCode.m11368toStringimpl(this.countryCode);
        java.lang.String str = this.flowName;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressSearchModalDestination(countryCode=");
        sb.append(m11368toStringimpl);
        sb.append(", flowName=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (com.paypal.oslo.core.i18n.domain.model.CountryCode.m11367hashCodeimpl(this.countryCode) * 31) + this.flowName.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.onboarding.api.navigation.AddressSearchModalDestination)) {
            return false;
        }
        com.paypal.oslo.feature.onboarding.api.navigation.AddressSearchModalDestination addressSearchModalDestination = (com.paypal.oslo.feature.onboarding.api.navigation.AddressSearchModalDestination) other;
        return com.paypal.oslo.core.i18n.domain.model.CountryCode.m11366equalsimpl0(this.countryCode, addressSearchModalDestination.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.flowName, addressSearchModalDestination.flowName);
    }

    /* renamed from: copy-n_l99Nk, reason: not valid java name */
    public final com.paypal.oslo.feature.onboarding.api.navigation.AddressSearchModalDestination m15883copyn_l99Nk(java.lang.String countryCode, java.lang.String flowName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowName, "");
        return new com.paypal.oslo.feature.onboarding.api.navigation.AddressSearchModalDestination(countryCode, flowName, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFlowName() {
        return this.flowName;
    }

    /* renamed from: component1-ALGuh4w, reason: not valid java name and from getter */
    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: copy-n_l99Nk$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.onboarding.api.navigation.AddressSearchModalDestination m15881copyn_l99Nk$default(com.paypal.oslo.feature.onboarding.api.navigation.AddressSearchModalDestination addressSearchModalDestination, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = addressSearchModalDestination.countryCode;
        }
        if ((i & 2) != 0) {
            str2 = addressSearchModalDestination.flowName;
        }
        return addressSearchModalDestination.m15883copyn_l99Nk(str, str2);
    }

    public /* synthetic */ AddressSearchModalDestination(java.lang.String str, java.lang.String str2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public /* synthetic */ AddressSearchModalDestination(int i, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2);
    }
}
