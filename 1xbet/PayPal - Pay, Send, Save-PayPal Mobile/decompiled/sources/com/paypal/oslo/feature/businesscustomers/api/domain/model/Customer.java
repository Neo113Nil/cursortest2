package com.paypal.oslo.feature.businesscustomers.api.domain.model;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0002KJB{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u0099\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJ\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bHÆ\u0003¢\u0006\u0004\b&\u0010%J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bHÆ\u0003¢\u0006\u0004\b'\u0010%J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001cJ\u0010\u0010)\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b)\u0010*J\u009a\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\u00122\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b2\u0010\u001cJ'\u00109\u001a\u0002082\u0006\u00103\u001a\u00020\u00002\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0001¢\u0006\u0004\b9\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b>\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b?\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b@\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010A\u001a\u0004\bB\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\bC\u0010\u001cR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010D\u001a\u0004\bE\u0010%R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010D\u001a\u0004\bF\u0010%R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010D\u001a\u0004\bG\u0010%R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010;\u001a\u0004\bH\u0010\u001cR\u001a\u0010\u0013\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010I\u001a\u0004\b\u0013\u0010*"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "", "", "id", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerType;", "type", "accountId", "externalId", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerName;", "name", "photoUrl", "", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerAddress;", "addresses", "emails", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerPhoneNumber;", "phoneNumbers", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "", "isFavorite", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerType;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerName;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerType;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerName;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerType;", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerName;", "component6", "component7", "()Ljava/util/List;", "component8", "component9", "component10", "component11", "()Z", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerType;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerName;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$business_customers_api_prodRelease", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerType;", "getType", "getAccountId", "getExternalId", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerName;", "getName", "getPhotoUrl", "Ljava/util/List;", "getAddresses", "getEmails", "getPhoneNumbers", "getDescription", "Z", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class Customer {
    private final java.lang.String accountId;
    private final java.util.List<com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress> addresses;
    private final java.lang.String description;
    private final java.util.List<java.lang.String> emails;
    private final java.lang.String externalId;
    private final java.lang.String id;
    private final boolean isFavorite;
    private final com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName name;
    private final java.util.List<com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPhoneNumber> phoneNumbers;
    private final java.lang.String photoUrl;
    private final com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer.Companion INSTANCE = new com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType", com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType.values());
            return createSimpleEnumSerializer;
        }
    }), null, null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer.$r8$lambda$4_LD3XNpsR7_sEsxVUhaLs5VFwg();
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer.m12720$r8$lambda$DVUrHgl7tlwcxH5WvHY8omPdDY();
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer.m12721$r8$lambda$eFtBNJlb_KgfyATaYuHriWax4E();
        }
    }), null, null};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer> serializer() {
            return com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Customer(int i, java.lang.String str, com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType customerType, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName customerName, java.lang.String str4, java.util.List list, java.util.List list2, java.util.List list3, java.lang.String str5, boolean z, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i & 2047)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 2047, com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.type = customerType;
        this.accountId = str2;
        this.externalId = str3;
        this.name = customerName;
        this.photoUrl = str4;
        this.addresses = list;
        this.emails = list2;
        this.phoneNumbers = list3;
        this.description = str5;
        this.isFavorite = z;
    }

    public Customer(java.lang.String str, com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType customerType, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName customerName, java.lang.String str4, java.util.List<com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress> list, java.util.List<java.lang.String> list2, java.util.List<com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPhoneNumber> list3, java.lang.String str5, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
        this.id = str;
        this.type = customerType;
        this.accountId = str2;
        this.externalId = str3;
        this.name = customerName;
        this.photoUrl = str4;
        this.addresses = list;
        this.emails = list2;
        this.phoneNumbers = list3;
        this.description = str5;
        this.isFavorite = z;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$business_customers_api_prodRelease(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.type);
        output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.accountId);
        output.encodeNullableSerializableElement(serialDesc, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.externalId);
        output.encodeNullableSerializableElement(serialDesc, 4, com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName$$serializer.INSTANCE, self.name);
        output.encodeNullableSerializableElement(serialDesc, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.photoUrl);
        output.encodeSerializableElement(serialDesc, 6, lazyArr[6].getValue(), self.addresses);
        output.encodeSerializableElement(serialDesc, 7, lazyArr[7].getValue(), self.emails);
        output.encodeSerializableElement(serialDesc, 8, lazyArr[8].getValue(), self.phoneNumbers);
        output.encodeNullableSerializableElement(serialDesc, 9, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.description);
        output.encodeBooleanElement(serialDesc, 10, self.isFavorite);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType getType() {
        return this.type;
    }

    public final java.lang.String getAccountId() {
        return this.accountId;
    }

    public final java.lang.String getExternalId() {
        return this.externalId;
    }

    public final com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName getName() {
        return this.name;
    }

    public final java.lang.String getPhotoUrl() {
        return this.photoUrl;
    }

    public final java.util.List<com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress> getAddresses() {
        return this.addresses;
    }

    public final java.util.List<java.lang.String> getEmails() {
        return this.emails;
    }

    public final java.util.List<com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPhoneNumber> getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$4_LD3XNpsR7_sEsxVUhaLs5VFwg() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress$$serializer.INSTANCE);
    }

    /* renamed from: $r8$lambda$DVUrHgl7tlwcxH5Wv-HY8omPdDY, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m12720$r8$lambda$DVUrHgl7tlwcxH5WvHY8omPdDY() {
        return new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE);
    }

    /* renamed from: $r8$lambda$eFtBNJlb_KgfyATa-YuHriWax4E, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m12721$r8$lambda$eFtBNJlb_KgfyATaYuHriWax4E() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPhoneNumber$$serializer.INSTANCE);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType customerType = this.type;
        java.lang.String str2 = this.accountId;
        java.lang.String str3 = this.externalId;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName customerName = this.name;
        java.lang.String str4 = this.photoUrl;
        java.util.List<com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress> list = this.addresses;
        java.util.List<java.lang.String> list2 = this.emails;
        java.util.List<com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPhoneNumber> list3 = this.phoneNumbers;
        java.lang.String str5 = this.description;
        boolean z = this.isFavorite;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Customer(id=");
        sb.append(str);
        sb.append(", type=");
        sb.append(customerType);
        sb.append(", accountId=");
        sb.append(str2);
        sb.append(", externalId=");
        sb.append(str3);
        sb.append(", name=");
        sb.append(customerName);
        sb.append(", photoUrl=");
        sb.append(str4);
        sb.append(", addresses=");
        sb.append(list);
        sb.append(", emails=");
        sb.append(list2);
        sb.append(", phoneNumbers=");
        sb.append(list3);
        sb.append(", description=");
        sb.append(str5);
        sb.append(", isFavorite=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.type.hashCode();
        java.lang.String str = this.accountId;
        int hashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.externalId;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName customerName = this.name;
        int hashCode5 = customerName == null ? 0 : customerName.hashCode();
        java.lang.String str3 = this.photoUrl;
        int hashCode6 = str3 == null ? 0 : str3.hashCode();
        int hashCode7 = this.addresses.hashCode();
        int hashCode8 = this.emails.hashCode();
        int hashCode9 = this.phoneNumbers.hashCode();
        java.lang.String str4 = this.description;
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.isFavorite);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer)) {
            return false;
        }
        com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer = (com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, customer.id) && this.type == customer.type && kotlin.jvm.internal.Intrinsics.areEqual(this.accountId, customer.accountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.externalId, customer.externalId) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, customer.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.photoUrl, customer.photoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.addresses, customer.addresses) && kotlin.jvm.internal.Intrinsics.areEqual(this.emails, customer.emails) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumbers, customer.phoneNumbers) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, customer.description) && this.isFavorite == customer.isFavorite;
    }

    public final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer copy(java.lang.String id, com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType type, java.lang.String accountId, java.lang.String externalId, com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName name2, java.lang.String photoUrl, java.util.List<com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress> addresses, java.util.List<java.lang.String> emails, java.util.List<com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPhoneNumber> phoneNumbers, java.lang.String description, boolean isFavorite) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addresses, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emails, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumbers, "");
        return new com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer(id, type, accountId, externalId, name2, photoUrl, addresses, emails, phoneNumbers, description, isFavorite);
    }

    public final java.util.List<com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPhoneNumber> component9() {
        return this.phoneNumbers;
    }

    public final java.util.List<java.lang.String> component8() {
        return this.emails;
    }

    public final java.util.List<com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress> component7() {
        return this.addresses;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getPhotoUrl() {
        return this.photoUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getExternalId() {
        return this.externalId;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getAccountId() {
        return this.accountId;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType getType() {
        return this.type;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
