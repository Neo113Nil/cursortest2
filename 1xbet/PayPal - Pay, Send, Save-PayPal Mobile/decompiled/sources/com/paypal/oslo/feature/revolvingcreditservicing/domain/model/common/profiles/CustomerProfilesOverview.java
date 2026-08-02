package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002'&B'\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ4\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u000eR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b%\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/CustomerProfilesOverview;", "", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/CustomerProfileDetails;", "customerProfiles", "supplementaryProfiles", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/CustomerProfilesOverview;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/CustomerProfilesOverview;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/util/List;", "getCustomerProfiles", "getSupplementaryProfiles", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class CustomerProfilesOverview {
    private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails> customerProfiles;
    private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails> supplementaryProfiles;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfilesOverview.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfilesOverview.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfilesOverview$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfilesOverview.m18141$r8$lambda$qCOrSyCJyTcGsG4t_4gExSkh60();
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfilesOverview$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfilesOverview.$r8$lambda$_uY97iAO1hJPRSORMoJRByqJCGo();
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/CustomerProfilesOverview$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/CustomerProfilesOverview;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfilesOverview> serializer() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfilesOverview$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CustomerProfilesOverview(int i, java.util.List list, java.util.List list2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfilesOverview$$serializer.INSTANCE.getDescriptor());
        }
        this.customerProfiles = list;
        this.supplementaryProfiles = list2;
    }

    public CustomerProfilesOverview(java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails> list, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails> list2) {
        this.customerProfiles = list;
        this.supplementaryProfiles = list2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$revolvingcredit_servicing_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfilesOverview self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.customerProfiles);
        output.encodeNullableSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.supplementaryProfiles);
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails> getCustomerProfiles() {
        return this.customerProfiles;
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails> getSupplementaryProfiles() {
        return this.supplementaryProfiles;
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$_uY97iAO1hJPRSORMoJRByqJCGo() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails$$serializer.INSTANCE);
    }

    /* renamed from: $r8$lambda$qCOrSyC-JyTcGsG4t_4gExSkh60, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m18141$r8$lambda$qCOrSyCJyTcGsG4t_4gExSkh60() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails$$serializer.INSTANCE);
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails> list = this.customerProfiles;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails> list2 = this.supplementaryProfiles;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomerProfilesOverview(customerProfiles=");
        sb.append(list);
        sb.append(", supplementaryProfiles=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails> list = this.customerProfiles;
        int hashCode = list == null ? 0 : list.hashCode();
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails> list2 = this.supplementaryProfiles;
        return (hashCode * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfilesOverview)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfilesOverview customerProfilesOverview = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfilesOverview) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.customerProfiles, customerProfilesOverview.customerProfiles) && kotlin.jvm.internal.Intrinsics.areEqual(this.supplementaryProfiles, customerProfilesOverview.supplementaryProfiles);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfilesOverview copy(java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails> customerProfiles, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails> supplementaryProfiles) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfilesOverview(customerProfiles, supplementaryProfiles);
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails> component2() {
        return this.supplementaryProfiles;
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails> component1() {
        return this.customerProfiles;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfilesOverview copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfilesOverview customerProfilesOverview, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = customerProfilesOverview.customerProfiles;
        }
        if ((i & 2) != 0) {
            list2 = customerProfilesOverview.supplementaryProfiles;
        }
        return customerProfilesOverview.copy(list, list2);
    }
}
