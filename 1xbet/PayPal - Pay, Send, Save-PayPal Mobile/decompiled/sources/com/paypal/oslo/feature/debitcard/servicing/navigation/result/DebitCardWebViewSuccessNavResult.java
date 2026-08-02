package com.paypal.oslo.feature.debitcard.servicing.navigation.result;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b1\u0018\u0000 \u00112\u00020\u0001:\u0005\u0012\u0013\u0014\u0015\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0004\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/navigation/result/DebitCardWebViewSuccessNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/feature/debitcard/servicing/navigation/result/DebitCardWebViewSuccessNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "CardholderAdded", "AddressAdded", "CardActivated", "UserEnrolled", "Lcom/paypal/oslo/feature/debitcard/servicing/navigation/result/DebitCardWebViewSuccessNavResult$AddressAdded;", "Lcom/paypal/oslo/feature/debitcard/servicing/navigation/result/DebitCardWebViewSuccessNavResult$CardActivated;", "Lcom/paypal/oslo/feature/debitcard/servicing/navigation/result/DebitCardWebViewSuccessNavResult$CardholderAdded;", "Lcom/paypal/oslo/feature/debitcard/servicing/navigation/result/DebitCardWebViewSuccessNavResult$UserEnrolled;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class DebitCardWebViewSuccessNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.$r8$lambda$8cHBLbsrM2L3KaK0niiBo9wQkO4();
        }
    });

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self(com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/navigation/result/DebitCardWebViewSuccessNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/servicing/navigation/result/DebitCardWebViewSuccessNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private DebitCardWebViewSuccessNavResult() {
    }

    public /* synthetic */ DebitCardWebViewSuccessNavResult(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/navigation/result/DebitCardWebViewSuccessNavResult$CardholderAdded;", "Lcom/paypal/oslo/feature/debitcard/servicing/navigation/result/DebitCardWebViewSuccessNavResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes12.dex */
    public static final /* data */ class CardholderAdded extends com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.CardholderAdded INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.CardholderAdded();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult$CardholderAdded$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.CardholderAdded.$r8$lambda$QhsRdfsQeb7HFJ8z4QErSHvMUeo();
            }
        });

        public final int hashCode() {
            return -2096937530;
        }

        private CardholderAdded() {
            super(null);
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$QhsRdfsQeb7HFJ8z4QErSHvMUeo() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.CardholderAdded", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.CardholderAdded> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "CardholderAdded";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.CardholderAdded)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/navigation/result/DebitCardWebViewSuccessNavResult$AddressAdded;", "Lcom/paypal/oslo/feature/debitcard/servicing/navigation/result/DebitCardWebViewSuccessNavResult;", "", "newlyAddedAddressId", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/navigation/result/DebitCardWebViewSuccessNavResult$AddressAdded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$debit_card_prodRelease", "(Lcom/paypal/oslo/feature/debitcard/servicing/navigation/result/DebitCardWebViewSuccessNavResult$AddressAdded;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getNewlyAddedAddressId", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class AddressAdded extends com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.AddressAdded.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.AddressAdded.Companion(null);
        private final java.lang.String newlyAddedAddressId;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/navigation/result/DebitCardWebViewSuccessNavResult$AddressAdded$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/servicing/navigation/result/DebitCardWebViewSuccessNavResult$AddressAdded;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes12.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.AddressAdded> serializer() {
                return com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult$AddressAdded$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AddressAdded(int i, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult$AddressAdded$$serializer.INSTANCE.getDescriptor());
            }
            this.newlyAddedAddressId = str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddressAdded(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.newlyAddedAddressId = str;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$debit_card_prodRelease(com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.AddressAdded self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.write$Self(self, output, serialDesc);
            output.encodeStringElement(serialDesc, 0, self.newlyAddedAddressId);
        }

        public final java.lang.String getNewlyAddedAddressId() {
            return this.newlyAddedAddressId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.newlyAddedAddressId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressAdded(newlyAddedAddressId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.newlyAddedAddressId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.AddressAdded) && kotlin.jvm.internal.Intrinsics.areEqual(this.newlyAddedAddressId, ((com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.AddressAdded) other).newlyAddedAddressId);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.AddressAdded copy(java.lang.String newlyAddedAddressId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newlyAddedAddressId, "");
            return new com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.AddressAdded(newlyAddedAddressId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getNewlyAddedAddressId() {
            return this.newlyAddedAddressId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.AddressAdded copy$default(com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.AddressAdded addressAdded, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = addressAdded.newlyAddedAddressId;
            }
            return addressAdded.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/navigation/result/DebitCardWebViewSuccessNavResult$CardActivated;", "Lcom/paypal/oslo/feature/debitcard/servicing/navigation/result/DebitCardWebViewSuccessNavResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes12.dex */
    public static final /* data */ class CardActivated extends com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.CardActivated INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.CardActivated();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult$CardActivated$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.CardActivated.$r8$lambda$8qJTLtVyJ17DcpYN8Cqjqm80f4o();
            }
        });

        public final int hashCode() {
            return 145030467;
        }

        private CardActivated() {
            super(null);
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$8qJTLtVyJ17DcpYN8Cqjqm80f4o() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.CardActivated", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.CardActivated> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "CardActivated";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.CardActivated)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/navigation/result/DebitCardWebViewSuccessNavResult$UserEnrolled;", "Lcom/paypal/oslo/feature/debitcard/servicing/navigation/result/DebitCardWebViewSuccessNavResult;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardPostEnrollmentAction;", "action", "<init>", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardPostEnrollmentAction;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/debitcard/api/model/DebitCardPostEnrollmentAction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardPostEnrollmentAction;", "copy", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardPostEnrollmentAction;)Lcom/paypal/oslo/feature/debitcard/servicing/navigation/result/DebitCardWebViewSuccessNavResult$UserEnrolled;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$debit_card_prodRelease", "(Lcom/paypal/oslo/feature/debitcard/servicing/navigation/result/DebitCardWebViewSuccessNavResult$UserEnrolled;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardPostEnrollmentAction;", "getAction", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class UserEnrolled extends com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction action;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.UserEnrolled.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.UserEnrolled.Companion(null);
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult$UserEnrolled$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer serializer;
                serializer = com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction.INSTANCE.serializer();
                return serializer;
            }
        })};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/navigation/result/DebitCardWebViewSuccessNavResult$UserEnrolled$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/servicing/navigation/result/DebitCardWebViewSuccessNavResult$UserEnrolled;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes12.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.UserEnrolled> serializer() {
                return com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult$UserEnrolled$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ UserEnrolled(int i, com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction debitCardPostEnrollmentAction, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult$UserEnrolled$$serializer.INSTANCE.getDescriptor());
            }
            this.action = debitCardPostEnrollmentAction;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserEnrolled(com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction debitCardPostEnrollmentAction) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardPostEnrollmentAction, "");
            this.action = debitCardPostEnrollmentAction;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$debit_card_prodRelease(com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.UserEnrolled self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.write$Self(self, output, serialDesc);
            output.encodeSerializableElement(serialDesc, 0, $childSerializers[0].getValue(), self.action);
        }

        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction getAction() {
            return this.action;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction debitCardPostEnrollmentAction = this.action;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UserEnrolled(action=");
            sb.append(debitCardPostEnrollmentAction);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.action.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.UserEnrolled) && this.action == ((com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.UserEnrolled) other).action;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.UserEnrolled copy(com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction action) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
            return new com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.UserEnrolled(action);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction getAction() {
            return this.action;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.UserEnrolled copy$default(com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.UserEnrolled userEnrolled, com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction debitCardPostEnrollmentAction, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitCardPostEnrollmentAction = userEnrolled.action;
            }
            return userEnrolled.copy(debitCardPostEnrollmentAction);
        }
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$8cHBLbsrM2L3KaK0niiBo9wQkO4() {
        return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.AddressAdded.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.CardActivated.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.CardholderAdded.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.UserEnrolled.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult$AddressAdded$$serializer.INSTANCE, new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.CardActivated", com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.CardActivated.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.CardholderAdded", com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.CardholderAdded.INSTANCE, new java.lang.annotation.Annotation[0]), com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult$UserEnrolled$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
    }

    public /* synthetic */ DebitCardWebViewSuccessNavResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
