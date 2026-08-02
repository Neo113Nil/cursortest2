package com.paypal.oslo.feature.oneonboarding.api.domain;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ$\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u000eJ'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b'\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/Phone;", "", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/CountryCode;", "countryCode", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/PhoneNumber;", "phoneNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-dGTghNU", "()Ljava/lang/String;", "component1", "component2-0u3eDS4", "component2", "copy-uOS59e8", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/oneonboarding/api/domain/Phone;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$one_onboarding_api_prodRelease", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/Phone;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getCountryCode-dGTghNU", "getPhoneNumber-0u3eDS4", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class Phone {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.oneonboarding.api.domain.Phone.Companion INSTANCE = new com.paypal.oslo.feature.oneonboarding.api.domain.Phone.Companion(null);
    private final java.lang.String countryCode;
    private final java.lang.String phoneNumber;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/Phone$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/Phone;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.oneonboarding.api.domain.Phone> serializer() {
            return com.paypal.oslo.feature.oneonboarding.api.domain.Phone$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ Phone(int i, java.lang.String str, java.lang.String str2) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.oneonboarding.api.domain.Phone$$serializer.INSTANCE.getDescriptor());
        }
        this.countryCode = str;
        this.phoneNumber = str2;
    }

    private Phone(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.countryCode = str;
        this.phoneNumber = str2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$one_onboarding_api_prodRelease(com.paypal.oslo.feature.oneonboarding.api.domain.Phone self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.feature.oneonboarding.api.domain.CountryCode$$serializer.INSTANCE, com.paypal.oslo.feature.oneonboarding.api.domain.CountryCode.m16617boximpl(self.countryCode));
        output.encodeSerializableElement(serialDesc, 1, com.paypal.oslo.feature.oneonboarding.api.domain.PhoneNumber$$serializer.INSTANCE, com.paypal.oslo.feature.oneonboarding.api.domain.PhoneNumber.m16663boximpl(self.phoneNumber));
    }

    /* renamed from: getCountryCode-dGTghNU, reason: not valid java name */
    public final java.lang.String m16661getCountryCodedGTghNU() {
        return this.countryCode;
    }

    /* renamed from: getPhoneNumber-0u3eDS4, reason: not valid java name */
    public final java.lang.String m16662getPhoneNumber0u3eDS4() {
        return this.phoneNumber;
    }

    public final java.lang.String toString() {
        java.lang.String m16622toStringimpl = com.paypal.oslo.feature.oneonboarding.api.domain.CountryCode.m16622toStringimpl(this.countryCode);
        java.lang.String m16668toStringimpl = com.paypal.oslo.feature.oneonboarding.api.domain.PhoneNumber.m16668toStringimpl(this.phoneNumber);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Phone(countryCode=");
        sb.append(m16622toStringimpl);
        sb.append(", phoneNumber=");
        sb.append(m16668toStringimpl);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (com.paypal.oslo.feature.oneonboarding.api.domain.CountryCode.m16621hashCodeimpl(this.countryCode) * 31) + com.paypal.oslo.feature.oneonboarding.api.domain.PhoneNumber.m16667hashCodeimpl(this.phoneNumber);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.oneonboarding.api.domain.Phone)) {
            return false;
        }
        com.paypal.oslo.feature.oneonboarding.api.domain.Phone phone = (com.paypal.oslo.feature.oneonboarding.api.domain.Phone) other;
        return com.paypal.oslo.feature.oneonboarding.api.domain.CountryCode.m16620equalsimpl0(this.countryCode, phone.countryCode) && com.paypal.oslo.feature.oneonboarding.api.domain.PhoneNumber.m16666equalsimpl0(this.phoneNumber, phone.phoneNumber);
    }

    /* renamed from: copy-uOS59e8, reason: not valid java name */
    public final com.paypal.oslo.feature.oneonboarding.api.domain.Phone m16660copyuOS59e8(java.lang.String countryCode, java.lang.String phoneNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
        return new com.paypal.oslo.feature.oneonboarding.api.domain.Phone(countryCode, phoneNumber, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* renamed from: component2-0u3eDS4, reason: not valid java name and from getter */
    public final java.lang.String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: component1-dGTghNU, reason: not valid java name and from getter */
    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: copy-uOS59e8$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.api.domain.Phone m16657copyuOS59e8$default(com.paypal.oslo.feature.oneonboarding.api.domain.Phone phone, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = phone.countryCode;
        }
        if ((i & 2) != 0) {
            str2 = phone.phoneNumber;
        }
        return phone.m16660copyuOS59e8(str, str2);
    }

    public /* synthetic */ Phone(java.lang.String str, java.lang.String str2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public /* synthetic */ Phone(int i, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2);
    }
}
