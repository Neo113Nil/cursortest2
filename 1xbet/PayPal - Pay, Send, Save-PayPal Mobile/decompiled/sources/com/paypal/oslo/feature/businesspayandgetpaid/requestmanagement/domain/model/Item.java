package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0081\b\u0018\u0000 ;2\u00020\u0001:\u0003<=;BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBW\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJX\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0015J'\u0010.\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b.\u0010/R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b:\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/Item;", "", "", "name", "quantity", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "unitAmount", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Tax;", "tax", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Discount;", "discount", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/Item$UnitOfMeasure;", "unitOfMeasure", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Tax;Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Discount;Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/Item$UnitOfMeasure;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Tax;Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Discount;Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/Item$UnitOfMeasure;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "component4", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Tax;", "component5", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Discount;", "component6", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/Item$UnitOfMeasure;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Tax;Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Discount;Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/Item$UnitOfMeasure;)Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$business_pay_and_get_paid_prodRelease", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/Item;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getName", "getQuantity", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "getUnitAmount", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Tax;", "getTax", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Discount;", "getDiscount", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/Item$UnitOfMeasure;", "getUnitOfMeasure", "Companion", "UnitOfMeasure", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class Item {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Discount discount;
    private final java.lang.String name;
    private final java.lang.String quantity;
    private final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Tax tax;
    private final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney unitAmount;
    private final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure unitOfMeasure;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.Companion INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure.INSTANCE.serializer();
            return serializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/Item$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/Item;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item> serializer() {
            return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Item(int i, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Tax tax, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Discount discount, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure unitOfMeasure, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 63, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item$$serializer.INSTANCE.getDescriptor());
        }
        this.name = str;
        this.quantity = str2;
        this.unitAmount = getPaidMoney;
        this.tax = tax;
        this.discount = discount;
        this.unitOfMeasure = unitOfMeasure;
    }

    public Item(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Tax tax, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Discount discount, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure unitOfMeasure) {
        this.name = str;
        this.quantity = str2;
        this.unitAmount = getPaidMoney;
        this.tax = tax;
        this.discount = discount;
        this.unitOfMeasure = unitOfMeasure;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$business_pay_and_get_paid_prodRelease(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.name);
        output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.quantity);
        output.encodeNullableSerializableElement(serialDesc, 2, com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney$$serializer.INSTANCE, self.unitAmount);
        output.encodeNullableSerializableElement(serialDesc, 3, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Tax$$serializer.INSTANCE, self.tax);
        output.encodeNullableSerializableElement(serialDesc, 4, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Discount$$serializer.INSTANCE, self.discount);
        output.encodeNullableSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.unitOfMeasure);
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getQuantity() {
        return this.quantity;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getUnitAmount() {
        return this.unitAmount;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Tax getTax() {
        return this.tax;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Discount getDiscount() {
        return this.discount;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure getUnitOfMeasure() {
        return this.unitOfMeasure;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0081\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/Item$UnitOfMeasure;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "QUANTITY", "HOURS", com.zettle.sdk.commons.network.JsonKt.KEY_PAYMENT_AMOUNT}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final class UnitOfMeasure {
        private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
        private static final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure[] $VALUES;
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure AMOUNT;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure.Companion INSTANCE;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure HOURS;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure QUANTITY;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/Item$UnitOfMeasure$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/Item$UnitOfMeasure;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure> serializer() {
                return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure.$cachedSerializer$delegate.getValue();
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private UnitOfMeasure(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure unitOfMeasure = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure("QUANTITY", 0);
            QUANTITY = unitOfMeasure;
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure unitOfMeasure2 = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure("HOURS", 1);
            HOURS = unitOfMeasure2;
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure unitOfMeasure3 = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure(com.zettle.sdk.commons.network.JsonKt.KEY_PAYMENT_AMOUNT, 2);
            AMOUNT = unitOfMeasure3;
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure[] unitOfMeasureArr = {unitOfMeasure, unitOfMeasure2, unitOfMeasure3};
            $VALUES = unitOfMeasureArr;
            $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(unitOfMeasureArr);
            INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure.Companion(null);
            $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item$UnitOfMeasure$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                    createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure", com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure.values());
                    return createSimpleEnumSerializer;
                }
            });
        }

        public static com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure[] values() {
            return (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure[]) $VALUES.clone();
        }

        public static com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure) java.lang.Enum.valueOf(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure> getEntries() {
            return $ENTRIES;
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        java.lang.String str2 = this.quantity;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney = this.unitAmount;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Tax tax = this.tax;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Discount discount = this.discount;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure unitOfMeasure = this.unitOfMeasure;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(name=");
        sb.append(str);
        sb.append(", quantity=");
        sb.append(str2);
        sb.append(", unitAmount=");
        sb.append(getPaidMoney);
        sb.append(", tax=");
        sb.append(tax);
        sb.append(", discount=");
        sb.append(discount);
        sb.append(", unitOfMeasure=");
        sb.append(unitOfMeasure);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.name;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.quantity;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney = this.unitAmount;
        int hashCode3 = getPaidMoney == null ? 0 : getPaidMoney.hashCode();
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Tax tax = this.tax;
        int hashCode4 = tax == null ? 0 : tax.hashCode();
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Discount discount = this.discount;
        int hashCode5 = discount == null ? 0 : discount.hashCode();
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure unitOfMeasure = this.unitOfMeasure;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (unitOfMeasure != null ? unitOfMeasure.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item)) {
            return false;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item item = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, item.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.quantity, item.quantity) && kotlin.jvm.internal.Intrinsics.areEqual(this.unitAmount, item.unitAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.tax, item.tax) && kotlin.jvm.internal.Intrinsics.areEqual(this.discount, item.discount) && this.unitOfMeasure == item.unitOfMeasure;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item copy(java.lang.String name2, java.lang.String quantity, com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney unitAmount, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Tax tax, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Discount discount, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure unitOfMeasure) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item(name2, quantity, unitAmount, tax, discount, unitOfMeasure);
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure getUnitOfMeasure() {
        return this.unitOfMeasure;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Discount getDiscount() {
        return this.discount;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Tax getTax() {
        return this.tax;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getUnitAmount() {
        return this.unitAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getQuantity() {
        return this.quantity;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item copy$default(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item item, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Tax tax, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Discount discount, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure unitOfMeasure, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = item.name;
        }
        if ((i & 2) != 0) {
            str2 = item.quantity;
        }
        java.lang.String str3 = str2;
        if ((i & 4) != 0) {
            getPaidMoney = item.unitAmount;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney2 = getPaidMoney;
        if ((i & 8) != 0) {
            tax = item.tax;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Tax tax2 = tax;
        if ((i & 16) != 0) {
            discount = item.discount;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Discount discount2 = discount;
        if ((i & 32) != 0) {
            unitOfMeasure = item.unitOfMeasure;
        }
        return item.copy(str, str3, getPaidMoney2, tax2, discount2, unitOfMeasure);
    }
}
