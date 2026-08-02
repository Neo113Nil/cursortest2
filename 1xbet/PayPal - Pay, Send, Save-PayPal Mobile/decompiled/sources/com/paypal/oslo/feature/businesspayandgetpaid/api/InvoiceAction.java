package com.paypal.oslo.feature.businesspayandgetpaid.api;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bw\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0002\u0082\u0001\u0003\u0006\u0007\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/api/InvoiceAction;", "", "Companion", "Create", "Edit", "Duplicate", "Lcom/paypal/oslo/feature/businesspayandgetpaid/api/InvoiceAction$Create;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/api/InvoiceAction$Duplicate;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/api/InvoiceAction$Edit;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public interface InvoiceAction {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction.Companion INSTANCE = com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction.Companion.getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/api/InvoiceAction$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/api/InvoiceAction;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction.Companion getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction.Companion();

        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction> serializer() {
            return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction.Create.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction.Duplicate.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction.Edit.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction$Create$$serializer.INSTANCE, com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction$Duplicate$$serializer.INSTANCE, com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction$Edit$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/api/InvoiceAction$Create;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/api/InvoiceAction;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/api/domain/model/Customer;", "customer", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/api/domain/model/Customer;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/businesspayandgetpaid/api/domain/model/Customer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/api/domain/model/Customer;", "copy", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/api/domain/model/Customer;)Lcom/paypal/oslo/feature/businesspayandgetpaid/api/InvoiceAction$Create;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$business_pay_and_get_paid_api_prodRelease", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/api/InvoiceAction$Create;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/businesspayandgetpaid/api/domain/model/Customer;", "getCustomer", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Create implements com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction.Create.Companion INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction.Create.Companion(null);
        private final com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer customer;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/api/InvoiceAction$Create$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/api/InvoiceAction$Create;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction.Create> serializer() {
                return com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction$Create$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Create(int i, com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer customer, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.customer = null;
            } else {
                this.customer = customer;
            }
        }

        public Create(com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer customer) {
            this.customer = customer;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$business_pay_and_get_paid_api_prodRelease(com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction.Create self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.customer != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer$$serializer.INSTANCE, self.customer);
            }
        }

        public /* synthetic */ Create(com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer customer, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : customer);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer getCustomer() {
            return this.customer;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer customer = this.customer;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Create(customer=");
            sb.append(customer);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer customer = this.customer;
            if (customer == null) {
                return 0;
            }
            return customer.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction.Create) && kotlin.jvm.internal.Intrinsics.areEqual(this.customer, ((com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction.Create) other).customer);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction.Create copy(com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer customer) {
            return new com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction.Create(customer);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer getCustomer() {
            return this.customer;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction.Create copy$default(com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction.Create create, com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer customer, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                customer = create.customer;
            }
            return create.copy(customer);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Create() {
            this((com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/api/InvoiceAction$Edit;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/api/InvoiceAction;", "", "invoiceId", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/businesspayandgetpaid/api/InvoiceAction$Edit;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$business_pay_and_get_paid_api_prodRelease", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/api/InvoiceAction$Edit;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getInvoiceId", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Edit implements com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction.Edit.Companion INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction.Edit.Companion(null);
        private final java.lang.String invoiceId;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/api/InvoiceAction$Edit$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/api/InvoiceAction$Edit;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction.Edit> serializer() {
                return com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction$Edit$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Edit(int i, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction$Edit$$serializer.INSTANCE.getDescriptor());
            }
            this.invoiceId = str;
        }

        public Edit(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.invoiceId = str;
        }

        public final java.lang.String getInvoiceId() {
            return this.invoiceId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.invoiceId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Edit(invoiceId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.invoiceId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction.Edit) && kotlin.jvm.internal.Intrinsics.areEqual(this.invoiceId, ((com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction.Edit) other).invoiceId);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction.Edit copy(java.lang.String invoiceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceId, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction.Edit(invoiceId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getInvoiceId() {
            return this.invoiceId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction.Edit copy$default(com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction.Edit edit, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = edit.invoiceId;
            }
            return edit.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/api/InvoiceAction$Duplicate;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/api/InvoiceAction;", "", "sourceInvoiceId", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/businesspayandgetpaid/api/InvoiceAction$Duplicate;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$business_pay_and_get_paid_api_prodRelease", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/api/InvoiceAction$Duplicate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getSourceInvoiceId", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Duplicate implements com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction.Duplicate.Companion INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction.Duplicate.Companion(null);
        private final java.lang.String sourceInvoiceId;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/api/InvoiceAction$Duplicate$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/api/InvoiceAction$Duplicate;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction.Duplicate> serializer() {
                return com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction$Duplicate$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Duplicate(int i, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction$Duplicate$$serializer.INSTANCE.getDescriptor());
            }
            this.sourceInvoiceId = str;
        }

        public Duplicate(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.sourceInvoiceId = str;
        }

        public final java.lang.String getSourceInvoiceId() {
            return this.sourceInvoiceId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.sourceInvoiceId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Duplicate(sourceInvoiceId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.sourceInvoiceId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction.Duplicate) && kotlin.jvm.internal.Intrinsics.areEqual(this.sourceInvoiceId, ((com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction.Duplicate) other).sourceInvoiceId);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction.Duplicate copy(java.lang.String sourceInvoiceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceInvoiceId, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction.Duplicate(sourceInvoiceId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSourceInvoiceId() {
            return this.sourceInvoiceId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction.Duplicate copy$default(com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction.Duplicate duplicate, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = duplicate.sourceInvoiceId;
            }
            return duplicate.copy(str);
        }
    }
}
