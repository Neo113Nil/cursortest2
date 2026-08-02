package com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0002=<B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fBQ\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJL\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010\u0016J'\u00101\u001a\u0002002\u0006\u0010+\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0001¢\u0006\u0004\b1\u00102R\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b4\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b6\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b\b\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010\u001dR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b;\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/nameaddress/domain/NameAddressViewComponentConfig;", "Lcom/paypal/oslo/feature/oneonboarding/domain/ViewComponentConfig;", "Lcom/paypal/oslo/feature/oneonboarding/domain/Editable;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/ComponentId;", "id", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/nameaddress/domain/NameAddressVariant;", "variant", "", "isEditable", "Lcom/paypal/oslo/core/i18n/domain/model/PersonName;", "name", "", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "address", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/nameaddress/domain/NameAddressVariant;ZLcom/paypal/oslo/core/i18n/domain/model/PersonName;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/nameaddress/domain/NameAddressVariant;ZLcom/paypal/oslo/core/i18n/domain/model/PersonName;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-fHLlpbY", "()Ljava/lang/String;", "component1", "component2", "()Lcom/paypal/oslo/feature/oneonboarding/inventory/views/nameaddress/domain/NameAddressVariant;", "component3", "()Z", "component4", "()Lcom/paypal/oslo/core/i18n/domain/model/PersonName;", "component5", "()Ljava/util/List;", "copy-mn192JU", "(Ljava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/nameaddress/domain/NameAddressVariant;ZLcom/paypal/oslo/core/i18n/domain/model/PersonName;Ljava/util/List;)Lcom/paypal/oslo/feature/oneonboarding/inventory/views/nameaddress/domain/NameAddressViewComponentConfig;", "copy", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$one_onboarding_prodRelease", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/nameaddress/domain/NameAddressViewComponentConfig;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getId-fHLlpbY", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/nameaddress/domain/NameAddressVariant;", "getVariant", "Z", "Lcom/paypal/oslo/core/i18n/domain/model/PersonName;", "getName", "Ljava/util/List;", "getAddress", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class NameAddressViewComponentConfig implements com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig, com.paypal.oslo.feature.oneonboarding.domain.Editable {
    private final java.util.List<com.paypal.oslo.core.i18n.domain.model.Address> address;
    private final java.lang.String id;
    private final boolean isEditable;
    private final com.paypal.oslo.core.i18n.domain.model.PersonName name;
    private final com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressVariant variant;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig.Companion INSTANCE = new com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressVariant.INSTANCE.serializer();
            return serializer;
        }
    }), null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig.m17055$r8$lambda$TCWSCqM6lZbONZr_yaQgG0MUAo();
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/nameaddress/domain/NameAddressViewComponentConfig$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/nameaddress/domain/NameAddressViewComponentConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig> serializer() {
            return com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ NameAddressViewComponentConfig(int i, java.lang.String str, com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressVariant nameAddressVariant, boolean z, com.paypal.oslo.core.i18n.domain.model.PersonName personName, java.util.List list) {
        if (31 != (i & 31)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 31, com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.variant = nameAddressVariant;
        this.isEditable = z;
        this.name = personName;
        this.address = list;
    }

    private NameAddressViewComponentConfig(java.lang.String str, com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressVariant nameAddressVariant, boolean z, com.paypal.oslo.core.i18n.domain.model.PersonName personName, java.util.List<com.paypal.oslo.core.i18n.domain.model.Address> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameAddressVariant, "");
        this.id = str;
        this.variant = nameAddressVariant;
        this.isEditable = z;
        this.name = personName;
        this.address = list;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$one_onboarding_prodRelease(com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId$$serializer.INSTANCE, com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16607boximpl(self.mo16702getIdfHLlpbY()));
        output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.variant);
        output.encodeBooleanElement(serialDesc, 2, self.isEditable());
        output.encodeNullableSerializableElement(serialDesc, 3, com.paypal.oslo.core.i18n.domain.model.PersonName$$serializer.INSTANCE, self.name);
        output.encodeNullableSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.address);
    }

    @Override // com.paypal.oslo.feature.oneonboarding.domain.ComponentConfig
    /* renamed from: getId-fHLlpbY */
    public final java.lang.String mo16702getIdfHLlpbY() {
        return this.id;
    }

    public final com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressVariant getVariant() {
        return this.variant;
    }

    @Override // com.paypal.oslo.feature.oneonboarding.domain.Editable
    public final boolean isEditable() {
        return this.isEditable;
    }

    public final com.paypal.oslo.core.i18n.domain.model.PersonName getName() {
        return this.name;
    }

    public final java.util.List<com.paypal.oslo.core.i18n.domain.model.Address> getAddress() {
        return this.address;
    }

    /* renamed from: $r8$lambda$TCWSCqM6l-ZbONZr_yaQgG0MUAo, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m17055$r8$lambda$TCWSCqM6lZbONZr_yaQgG0MUAo() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.core.i18n.domain.model.Address$$serializer.INSTANCE);
    }

    public final java.lang.String toString() {
        java.lang.String m16613toStringimpl = com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16613toStringimpl(this.id);
        com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressVariant nameAddressVariant = this.variant;
        boolean z = this.isEditable;
        com.paypal.oslo.core.i18n.domain.model.PersonName personName = this.name;
        java.util.List<com.paypal.oslo.core.i18n.domain.model.Address> list = this.address;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NameAddressViewComponentConfig(id=");
        sb.append(m16613toStringimpl);
        sb.append(", variant=");
        sb.append(nameAddressVariant);
        sb.append(", isEditable=");
        sb.append(z);
        sb.append(", name=");
        sb.append(personName);
        sb.append(", address=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int m16612hashCodeimpl = com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16612hashCodeimpl(this.id);
        int hashCode = this.variant.hashCode();
        int hashCode2 = java.lang.Boolean.hashCode(this.isEditable);
        com.paypal.oslo.core.i18n.domain.model.PersonName personName = this.name;
        int hashCode3 = personName == null ? 0 : personName.hashCode();
        java.util.List<com.paypal.oslo.core.i18n.domain.model.Address> list = this.address;
        return (((((((m16612hashCodeimpl * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig)) {
            return false;
        }
        com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig nameAddressViewComponentConfig = (com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig) other;
        return com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16611equalsimpl0(this.id, nameAddressViewComponentConfig.id) && this.variant == nameAddressViewComponentConfig.variant && this.isEditable == nameAddressViewComponentConfig.isEditable && kotlin.jvm.internal.Intrinsics.areEqual(this.name, nameAddressViewComponentConfig.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, nameAddressViewComponentConfig.address);
    }

    /* renamed from: copy-mn192JU, reason: not valid java name */
    public final com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig m17058copymn192JU(java.lang.String id, com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressVariant variant, boolean isEditable, com.paypal.oslo.core.i18n.domain.model.PersonName name2, java.util.List<com.paypal.oslo.core.i18n.domain.model.Address> address) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variant, "");
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig(id, variant, isEditable, name2, address, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public final java.util.List<com.paypal.oslo.core.i18n.domain.model.Address> component5() {
        return this.address;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.core.i18n.domain.model.PersonName getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsEditable() {
        return this.isEditable;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressVariant getVariant() {
        return this.variant;
    }

    /* renamed from: component1-fHLlpbY, reason: not valid java name and from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* renamed from: copy-mn192JU$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig m17056copymn192JU$default(com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig nameAddressViewComponentConfig, java.lang.String str, com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressVariant nameAddressVariant, boolean z, com.paypal.oslo.core.i18n.domain.model.PersonName personName, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = nameAddressViewComponentConfig.id;
        }
        if ((i & 2) != 0) {
            nameAddressVariant = nameAddressViewComponentConfig.variant;
        }
        com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressVariant nameAddressVariant2 = nameAddressVariant;
        if ((i & 4) != 0) {
            z = nameAddressViewComponentConfig.isEditable;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            personName = nameAddressViewComponentConfig.name;
        }
        com.paypal.oslo.core.i18n.domain.model.PersonName personName2 = personName;
        if ((i & 16) != 0) {
            list = nameAddressViewComponentConfig.address;
        }
        return nameAddressViewComponentConfig.m17058copymn192JU(str, nameAddressVariant2, z2, personName2, list);
    }

    public /* synthetic */ NameAddressViewComponentConfig(java.lang.String str, com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressVariant nameAddressVariant, boolean z, com.paypal.oslo.core.i18n.domain.model.PersonName personName, java.util.List list, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, nameAddressVariant, z, personName, list);
    }

    public /* synthetic */ NameAddressViewComponentConfig(int i, java.lang.String str, com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressVariant nameAddressVariant, boolean z, com.paypal.oslo.core.i18n.domain.model.PersonName personName, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, nameAddressVariant, z, personName, list);
    }
}
