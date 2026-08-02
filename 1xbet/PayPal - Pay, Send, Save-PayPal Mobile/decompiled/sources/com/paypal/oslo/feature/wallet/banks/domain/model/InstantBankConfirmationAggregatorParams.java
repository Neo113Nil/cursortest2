package com.paypal.oslo.feature.wallet.banks.domain.model;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \u00112\u00020\u0001:\u0005\u0012\u0013\u0014\u0015\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0004\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams;", "", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "IBCFlowWithBankDetailsParams", "ReconsentFlowWithBankDetailsParams", "IBCFlowWithInstrumentIdParams", "ReconsentFlowWithInstrumentIdParams", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams$IBCFlowWithBankDetailsParams;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams$IBCFlowWithInstrumentIdParams;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams$ReconsentFlowWithBankDetailsParams;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams$ReconsentFlowWithInstrumentIdParams;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class InstantBankConfirmationAggregatorParams {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.Companion INSTANCE = new com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.$r8$lambda$fGceKy9ccnDpzHrVrOrEm7zEZws();
        }
    });

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self(com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private InstantBankConfirmationAggregatorParams() {
    }

    public /* synthetic */ InstantBankConfirmationAggregatorParams(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
    }

    @kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rB]\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJV\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0014J'\u0010,\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b2\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b3\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b4\u0010\u0014R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams$IBCFlowWithBankDetailsParams;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams;", "", "bankCode", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "productFlow", "branchCode", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Iban, "countryCode", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;", "excludeAggregators", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams$IBCFlowWithBankDetailsParams;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams$IBCFlowWithBankDetailsParams;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getBankCode", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "getProductFlow", "getBranchCode", "getIban", "getCountryCode", "Ljava/util/List;", "getExcludeAggregators", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class IBCFlowWithBankDetailsParams extends com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams {
        private final java.lang.String bankCode;
        private final java.lang.String branchCode;
        private final java.lang.String countryCode;
        private final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> excludeAggregators;
        private final java.lang.String iban;
        private final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow productFlow;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithBankDetailsParams.Companion INSTANCE = new com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithBankDetailsParams.Companion(null);
        public static final int $stable = 8;
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams$IBCFlowWithBankDetailsParams$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer serializer;
                serializer = com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.INSTANCE.serializer();
                return serializer;
            }
        }), null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams$IBCFlowWithBankDetailsParams$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithBankDetailsParams.m20779$r8$lambda$lI1YLzNU8ITyx4drtsx3ZROsU();
            }
        })};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams$IBCFlowWithBankDetailsParams$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams$IBCFlowWithBankDetailsParams;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithBankDetailsParams> serializer() {
                return com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams$IBCFlowWithBankDetailsParams$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ IBCFlowWithBankDetailsParams(int i, java.lang.String str, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (3 != (i & 3)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams$IBCFlowWithBankDetailsParams$$serializer.INSTANCE.getDescriptor());
            }
            this.bankCode = str;
            this.productFlow = addFIFlow;
            if ((i & 4) == 0) {
                this.branchCode = null;
            } else {
                this.branchCode = str2;
            }
            if ((i & 8) == 0) {
                this.iban = null;
            } else {
                this.iban = str3;
            }
            if ((i & 16) == 0) {
                this.countryCode = "US";
            } else {
                this.countryCode = str4;
            }
            if ((i & 32) == 0) {
                this.excludeAggregators = kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.YODLEE_FASTLINK);
            } else {
                this.excludeAggregators = list;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public IBCFlowWithBankDetailsParams(java.lang.String str, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List<? extends com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFIFlow, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.bankCode = str;
            this.productFlow = addFIFlow;
            this.branchCode = str2;
            this.iban = str3;
            this.countryCode = str4;
            this.excludeAggregators = list;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$wallet_prodRelease(com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithBankDetailsParams self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.write$Self(self, output, serialDesc);
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.bankCode);
            output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.productFlow);
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.branchCode != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.branchCode);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || self.iban != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.iban);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 4) || !kotlin.jvm.internal.Intrinsics.areEqual(self.countryCode, "US")) {
                output.encodeStringElement(serialDesc, 4, self.countryCode);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 5) || !kotlin.jvm.internal.Intrinsics.areEqual(self.excludeAggregators, kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.YODLEE_FASTLINK))) {
                output.encodeSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.excludeAggregators);
            }
        }

        public final java.lang.String getBankCode() {
            return this.bankCode;
        }

        public final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow getProductFlow() {
            return this.productFlow;
        }

        public final java.lang.String getBranchCode() {
            return this.branchCode;
        }

        public final java.lang.String getIban() {
            return this.iban;
        }

        public /* synthetic */ IBCFlowWithBankDetailsParams(java.lang.String str, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, addFIFlow, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? "US" : str4, (i & 32) != 0 ? kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.YODLEE_FASTLINK) : list);
        }

        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> getExcludeAggregators() {
            return this.excludeAggregators;
        }

        /* renamed from: $r8$lambda$lI-1YLzNU8ITyx4drtsx3Z-ROsU, reason: not valid java name */
        public static /* synthetic */ kotlinx.serialization.KSerializer m20779$r8$lambda$lI1YLzNU8ITyx4drtsx3ZROsU() {
            return new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator", com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.values()));
        }

        public final java.lang.String toString() {
            java.lang.String str = this.bankCode;
            com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow = this.productFlow;
            java.lang.String str2 = this.branchCode;
            java.lang.String str3 = this.iban;
            java.lang.String str4 = this.countryCode;
            java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> list = this.excludeAggregators;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("IBCFlowWithBankDetailsParams(bankCode=");
            sb.append(str);
            sb.append(", productFlow=");
            sb.append(addFIFlow);
            sb.append(", branchCode=");
            sb.append(str2);
            sb.append(", iban=");
            sb.append(str3);
            sb.append(", countryCode=");
            sb.append(str4);
            sb.append(", excludeAggregators=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.bankCode.hashCode();
            int hashCode2 = this.productFlow.hashCode();
            java.lang.String str = this.branchCode;
            int hashCode3 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.iban;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.countryCode.hashCode()) * 31) + this.excludeAggregators.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithBankDetailsParams)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithBankDetailsParams iBCFlowWithBankDetailsParams = (com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithBankDetailsParams) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.bankCode, iBCFlowWithBankDetailsParams.bankCode) && this.productFlow == iBCFlowWithBankDetailsParams.productFlow && kotlin.jvm.internal.Intrinsics.areEqual(this.branchCode, iBCFlowWithBankDetailsParams.branchCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.iban, iBCFlowWithBankDetailsParams.iban) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, iBCFlowWithBankDetailsParams.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.excludeAggregators, iBCFlowWithBankDetailsParams.excludeAggregators);
        }

        public final com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithBankDetailsParams copy(java.lang.String bankCode, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow productFlow, java.lang.String branchCode, java.lang.String iban, java.lang.String countryCode, java.util.List<? extends com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> excludeAggregators) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productFlow, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(excludeAggregators, "");
            return new com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithBankDetailsParams(bankCode, productFlow, branchCode, iban, countryCode, excludeAggregators);
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> component6() {
            return this.excludeAggregators;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getIban() {
            return this.iban;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getBranchCode() {
            return this.branchCode;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow getProductFlow() {
            return this.productFlow;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getBankCode() {
            return this.bankCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithBankDetailsParams copy$default(com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithBankDetailsParams iBCFlowWithBankDetailsParams, java.lang.String str, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = iBCFlowWithBankDetailsParams.bankCode;
            }
            if ((i & 2) != 0) {
                addFIFlow = iBCFlowWithBankDetailsParams.productFlow;
            }
            com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow2 = addFIFlow;
            if ((i & 4) != 0) {
                str2 = iBCFlowWithBankDetailsParams.branchCode;
            }
            java.lang.String str5 = str2;
            if ((i & 8) != 0) {
                str3 = iBCFlowWithBankDetailsParams.iban;
            }
            java.lang.String str6 = str3;
            if ((i & 16) != 0) {
                str4 = iBCFlowWithBankDetailsParams.countryCode;
            }
            java.lang.String str7 = str4;
            if ((i & 32) != 0) {
                list = iBCFlowWithBankDetailsParams.excludeAggregators;
            }
            return iBCFlowWithBankDetailsParams.copy(str, addFIFlow2, str5, str6, str7, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rB]\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJV\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0014J'\u0010,\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b2\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b3\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b4\u0010\u0014R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams$ReconsentFlowWithBankDetailsParams;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams;", "", "bankCode", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "productFlow", "branchCode", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Iban, "countryCode", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;", "excludeAggregators", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams$ReconsentFlowWithBankDetailsParams;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams$ReconsentFlowWithBankDetailsParams;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getBankCode", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "getProductFlow", "getBranchCode", "getIban", "getCountryCode", "Ljava/util/List;", "getExcludeAggregators", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class ReconsentFlowWithBankDetailsParams extends com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams {
        private final java.lang.String bankCode;
        private final java.lang.String branchCode;
        private final java.lang.String countryCode;
        private final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> excludeAggregators;
        private final java.lang.String iban;
        private final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow productFlow;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.ReconsentFlowWithBankDetailsParams.Companion INSTANCE = new com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.ReconsentFlowWithBankDetailsParams.Companion(null);
        public static final int $stable = 8;
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams$ReconsentFlowWithBankDetailsParams$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer serializer;
                serializer = com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.INSTANCE.serializer();
                return serializer;
            }
        }), null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams$ReconsentFlowWithBankDetailsParams$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.ReconsentFlowWithBankDetailsParams.$r8$lambda$Y5G7LcG1iX8Tgp_1qMX0lzSd0LM();
            }
        })};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams$ReconsentFlowWithBankDetailsParams$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams$ReconsentFlowWithBankDetailsParams;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.ReconsentFlowWithBankDetailsParams> serializer() {
                return com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams$ReconsentFlowWithBankDetailsParams$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ReconsentFlowWithBankDetailsParams(int i, java.lang.String str, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (3 != (i & 3)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams$ReconsentFlowWithBankDetailsParams$$serializer.INSTANCE.getDescriptor());
            }
            this.bankCode = str;
            this.productFlow = addFIFlow;
            if ((i & 4) == 0) {
                this.branchCode = null;
            } else {
                this.branchCode = str2;
            }
            if ((i & 8) == 0) {
                this.iban = null;
            } else {
                this.iban = str3;
            }
            if ((i & 16) == 0) {
                this.countryCode = "US";
            } else {
                this.countryCode = str4;
            }
            if ((i & 32) == 0) {
                this.excludeAggregators = kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.YODLEE_FASTLINK);
            } else {
                this.excludeAggregators = list;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ReconsentFlowWithBankDetailsParams(java.lang.String str, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List<? extends com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFIFlow, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.bankCode = str;
            this.productFlow = addFIFlow;
            this.branchCode = str2;
            this.iban = str3;
            this.countryCode = str4;
            this.excludeAggregators = list;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$wallet_prodRelease(com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.ReconsentFlowWithBankDetailsParams self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.write$Self(self, output, serialDesc);
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.bankCode);
            output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.productFlow);
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.branchCode != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.branchCode);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || self.iban != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.iban);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 4) || !kotlin.jvm.internal.Intrinsics.areEqual(self.countryCode, "US")) {
                output.encodeStringElement(serialDesc, 4, self.countryCode);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 5) || !kotlin.jvm.internal.Intrinsics.areEqual(self.excludeAggregators, kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.YODLEE_FASTLINK))) {
                output.encodeSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.excludeAggregators);
            }
        }

        public final java.lang.String getBankCode() {
            return this.bankCode;
        }

        public final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow getProductFlow() {
            return this.productFlow;
        }

        public final java.lang.String getBranchCode() {
            return this.branchCode;
        }

        public final java.lang.String getIban() {
            return this.iban;
        }

        public /* synthetic */ ReconsentFlowWithBankDetailsParams(java.lang.String str, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, addFIFlow, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? "US" : str4, (i & 32) != 0 ? kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.YODLEE_FASTLINK) : list);
        }

        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> getExcludeAggregators() {
            return this.excludeAggregators;
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$Y5G7LcG1iX8Tgp_1qMX0lzSd0LM() {
            return new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator", com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.values()));
        }

        public final java.lang.String toString() {
            java.lang.String str = this.bankCode;
            com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow = this.productFlow;
            java.lang.String str2 = this.branchCode;
            java.lang.String str3 = this.iban;
            java.lang.String str4 = this.countryCode;
            java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> list = this.excludeAggregators;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReconsentFlowWithBankDetailsParams(bankCode=");
            sb.append(str);
            sb.append(", productFlow=");
            sb.append(addFIFlow);
            sb.append(", branchCode=");
            sb.append(str2);
            sb.append(", iban=");
            sb.append(str3);
            sb.append(", countryCode=");
            sb.append(str4);
            sb.append(", excludeAggregators=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.bankCode.hashCode();
            int hashCode2 = this.productFlow.hashCode();
            java.lang.String str = this.branchCode;
            int hashCode3 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.iban;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.countryCode.hashCode()) * 31) + this.excludeAggregators.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.ReconsentFlowWithBankDetailsParams)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.ReconsentFlowWithBankDetailsParams reconsentFlowWithBankDetailsParams = (com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.ReconsentFlowWithBankDetailsParams) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.bankCode, reconsentFlowWithBankDetailsParams.bankCode) && this.productFlow == reconsentFlowWithBankDetailsParams.productFlow && kotlin.jvm.internal.Intrinsics.areEqual(this.branchCode, reconsentFlowWithBankDetailsParams.branchCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.iban, reconsentFlowWithBankDetailsParams.iban) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, reconsentFlowWithBankDetailsParams.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.excludeAggregators, reconsentFlowWithBankDetailsParams.excludeAggregators);
        }

        public final com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.ReconsentFlowWithBankDetailsParams copy(java.lang.String bankCode, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow productFlow, java.lang.String branchCode, java.lang.String iban, java.lang.String countryCode, java.util.List<? extends com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> excludeAggregators) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productFlow, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(excludeAggregators, "");
            return new com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.ReconsentFlowWithBankDetailsParams(bankCode, productFlow, branchCode, iban, countryCode, excludeAggregators);
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> component6() {
            return this.excludeAggregators;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getIban() {
            return this.iban;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getBranchCode() {
            return this.branchCode;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow getProductFlow() {
            return this.productFlow;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getBankCode() {
            return this.bankCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.ReconsentFlowWithBankDetailsParams copy$default(com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.ReconsentFlowWithBankDetailsParams reconsentFlowWithBankDetailsParams, java.lang.String str, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = reconsentFlowWithBankDetailsParams.bankCode;
            }
            if ((i & 2) != 0) {
                addFIFlow = reconsentFlowWithBankDetailsParams.productFlow;
            }
            com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow2 = addFIFlow;
            if ((i & 4) != 0) {
                str2 = reconsentFlowWithBankDetailsParams.branchCode;
            }
            java.lang.String str5 = str2;
            if ((i & 8) != 0) {
                str3 = reconsentFlowWithBankDetailsParams.iban;
            }
            java.lang.String str6 = str3;
            if ((i & 16) != 0) {
                str4 = reconsentFlowWithBankDetailsParams.countryCode;
            }
            java.lang.String str7 = str4;
            if ((i & 32) != 0) {
                list = reconsentFlowWithBankDetailsParams.excludeAggregators;
            }
            return reconsentFlowWithBankDetailsParams.copy(str, addFIFlow2, str5, str6, str7, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J>\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0012J'\u0010(\u001a\u00020'2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0001¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u0012R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams$IBCFlowWithInstrumentIdParams;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams;", "", "instrumentId", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "productFlow", "countryCode", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;", "excludeAggregators", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams$IBCFlowWithInstrumentIdParams;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams$IBCFlowWithInstrumentIdParams;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getInstrumentId", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "getProductFlow", "getCountryCode", "Ljava/util/List;", "getExcludeAggregators", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class IBCFlowWithInstrumentIdParams extends com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams {
        private final java.lang.String countryCode;
        private final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> excludeAggregators;
        private final java.lang.String instrumentId;
        private final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow productFlow;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithInstrumentIdParams.Companion INSTANCE = new com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithInstrumentIdParams.Companion(null);
        public static final int $stable = 8;
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams$IBCFlowWithInstrumentIdParams$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer serializer;
                serializer = com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.INSTANCE.serializer();
                return serializer;
            }
        }), null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams$IBCFlowWithInstrumentIdParams$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithInstrumentIdParams.$r8$lambda$uk6Kfuv3SAqzHNM7s2axefdlagk();
            }
        })};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams$IBCFlowWithInstrumentIdParams$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams$IBCFlowWithInstrumentIdParams;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithInstrumentIdParams> serializer() {
                return com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams$IBCFlowWithInstrumentIdParams$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ IBCFlowWithInstrumentIdParams(int i, java.lang.String str, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, java.lang.String str2, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (3 != (i & 3)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams$IBCFlowWithInstrumentIdParams$$serializer.INSTANCE.getDescriptor());
            }
            this.instrumentId = str;
            this.productFlow = addFIFlow;
            if ((i & 4) == 0) {
                this.countryCode = "US";
            } else {
                this.countryCode = str2;
            }
            if ((i & 8) == 0) {
                this.excludeAggregators = kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.YODLEE_FASTLINK);
            } else {
                this.excludeAggregators = list;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public IBCFlowWithInstrumentIdParams(java.lang.String str, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, java.lang.String str2, java.util.List<? extends com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFIFlow, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.instrumentId = str;
            this.productFlow = addFIFlow;
            this.countryCode = str2;
            this.excludeAggregators = list;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$wallet_prodRelease(com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithInstrumentIdParams self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.write$Self(self, output, serialDesc);
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.instrumentId);
            output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.productFlow);
            if (output.shouldEncodeElementDefault(serialDesc, 2) || !kotlin.jvm.internal.Intrinsics.areEqual(self.countryCode, "US")) {
                output.encodeStringElement(serialDesc, 2, self.countryCode);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || !kotlin.jvm.internal.Intrinsics.areEqual(self.excludeAggregators, kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.YODLEE_FASTLINK))) {
                output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.excludeAggregators);
            }
        }

        public final java.lang.String getInstrumentId() {
            return this.instrumentId;
        }

        public final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow getProductFlow() {
            return this.productFlow;
        }

        public /* synthetic */ IBCFlowWithInstrumentIdParams(java.lang.String str, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, java.lang.String str2, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, addFIFlow, (i & 4) != 0 ? "US" : str2, (i & 8) != 0 ? kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.YODLEE_FASTLINK) : list);
        }

        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> getExcludeAggregators() {
            return this.excludeAggregators;
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$uk6Kfuv3SAqzHNM7s2axefdlagk() {
            return new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator", com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.values()));
        }

        public final java.lang.String toString() {
            java.lang.String str = this.instrumentId;
            com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow = this.productFlow;
            java.lang.String str2 = this.countryCode;
            java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> list = this.excludeAggregators;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("IBCFlowWithInstrumentIdParams(instrumentId=");
            sb.append(str);
            sb.append(", productFlow=");
            sb.append(addFIFlow);
            sb.append(", countryCode=");
            sb.append(str2);
            sb.append(", excludeAggregators=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.instrumentId.hashCode() * 31) + this.productFlow.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + this.excludeAggregators.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithInstrumentIdParams)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithInstrumentIdParams iBCFlowWithInstrumentIdParams = (com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithInstrumentIdParams) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentId, iBCFlowWithInstrumentIdParams.instrumentId) && this.productFlow == iBCFlowWithInstrumentIdParams.productFlow && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, iBCFlowWithInstrumentIdParams.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.excludeAggregators, iBCFlowWithInstrumentIdParams.excludeAggregators);
        }

        public final com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithInstrumentIdParams copy(java.lang.String instrumentId, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow productFlow, java.lang.String countryCode, java.util.List<? extends com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> excludeAggregators) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productFlow, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(excludeAggregators, "");
            return new com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithInstrumentIdParams(instrumentId, productFlow, countryCode, excludeAggregators);
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> component4() {
            return this.excludeAggregators;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow getProductFlow() {
            return this.productFlow;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getInstrumentId() {
            return this.instrumentId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithInstrumentIdParams copy$default(com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithInstrumentIdParams iBCFlowWithInstrumentIdParams, java.lang.String str, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, java.lang.String str2, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = iBCFlowWithInstrumentIdParams.instrumentId;
            }
            if ((i & 2) != 0) {
                addFIFlow = iBCFlowWithInstrumentIdParams.productFlow;
            }
            if ((i & 4) != 0) {
                str2 = iBCFlowWithInstrumentIdParams.countryCode;
            }
            if ((i & 8) != 0) {
                list = iBCFlowWithInstrumentIdParams.excludeAggregators;
            }
            return iBCFlowWithInstrumentIdParams.copy(str, addFIFlow, str2, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J>\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0012J'\u0010(\u001a\u00020'2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0001¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u0012R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams$ReconsentFlowWithInstrumentIdParams;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams;", "", "instrumentId", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "productFlow", "countryCode", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;", "excludeAggregators", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams$ReconsentFlowWithInstrumentIdParams;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams$ReconsentFlowWithInstrumentIdParams;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getInstrumentId", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "getProductFlow", "getCountryCode", "Ljava/util/List;", "getExcludeAggregators", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class ReconsentFlowWithInstrumentIdParams extends com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams {
        private final java.lang.String countryCode;
        private final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> excludeAggregators;
        private final java.lang.String instrumentId;
        private final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow productFlow;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.ReconsentFlowWithInstrumentIdParams.Companion INSTANCE = new com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.ReconsentFlowWithInstrumentIdParams.Companion(null);
        public static final int $stable = 8;
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams$ReconsentFlowWithInstrumentIdParams$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer serializer;
                serializer = com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.INSTANCE.serializer();
                return serializer;
            }
        }), null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams$ReconsentFlowWithInstrumentIdParams$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.ReconsentFlowWithInstrumentIdParams.m20782$r8$lambda$sbN4NFOMgbigPF4cBlmf5gMQDY();
            }
        })};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams$ReconsentFlowWithInstrumentIdParams$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams$ReconsentFlowWithInstrumentIdParams;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.ReconsentFlowWithInstrumentIdParams> serializer() {
                return com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams$ReconsentFlowWithInstrumentIdParams$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ReconsentFlowWithInstrumentIdParams(int i, java.lang.String str, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, java.lang.String str2, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (3 != (i & 3)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams$ReconsentFlowWithInstrumentIdParams$$serializer.INSTANCE.getDescriptor());
            }
            this.instrumentId = str;
            this.productFlow = addFIFlow;
            if ((i & 4) == 0) {
                this.countryCode = "US";
            } else {
                this.countryCode = str2;
            }
            if ((i & 8) == 0) {
                this.excludeAggregators = kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.YODLEE_FASTLINK);
            } else {
                this.excludeAggregators = list;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ReconsentFlowWithInstrumentIdParams(java.lang.String str, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, java.lang.String str2, java.util.List<? extends com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFIFlow, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.instrumentId = str;
            this.productFlow = addFIFlow;
            this.countryCode = str2;
            this.excludeAggregators = list;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$wallet_prodRelease(com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.ReconsentFlowWithInstrumentIdParams self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.write$Self(self, output, serialDesc);
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.instrumentId);
            output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.productFlow);
            if (output.shouldEncodeElementDefault(serialDesc, 2) || !kotlin.jvm.internal.Intrinsics.areEqual(self.countryCode, "US")) {
                output.encodeStringElement(serialDesc, 2, self.countryCode);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || !kotlin.jvm.internal.Intrinsics.areEqual(self.excludeAggregators, kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.YODLEE_FASTLINK))) {
                output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.excludeAggregators);
            }
        }

        public final java.lang.String getInstrumentId() {
            return this.instrumentId;
        }

        public final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow getProductFlow() {
            return this.productFlow;
        }

        public /* synthetic */ ReconsentFlowWithInstrumentIdParams(java.lang.String str, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, java.lang.String str2, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, addFIFlow, (i & 4) != 0 ? "US" : str2, (i & 8) != 0 ? kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.YODLEE_FASTLINK) : list);
        }

        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> getExcludeAggregators() {
            return this.excludeAggregators;
        }

        /* renamed from: $r8$lambda$sbN4NFOMgbigPF4cBlmf5gMQ-DY, reason: not valid java name */
        public static /* synthetic */ kotlinx.serialization.KSerializer m20782$r8$lambda$sbN4NFOMgbigPF4cBlmf5gMQDY() {
            return new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator", com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.values()));
        }

        public final java.lang.String toString() {
            java.lang.String str = this.instrumentId;
            com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow = this.productFlow;
            java.lang.String str2 = this.countryCode;
            java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> list = this.excludeAggregators;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReconsentFlowWithInstrumentIdParams(instrumentId=");
            sb.append(str);
            sb.append(", productFlow=");
            sb.append(addFIFlow);
            sb.append(", countryCode=");
            sb.append(str2);
            sb.append(", excludeAggregators=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.instrumentId.hashCode() * 31) + this.productFlow.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + this.excludeAggregators.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.ReconsentFlowWithInstrumentIdParams)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.ReconsentFlowWithInstrumentIdParams reconsentFlowWithInstrumentIdParams = (com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.ReconsentFlowWithInstrumentIdParams) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentId, reconsentFlowWithInstrumentIdParams.instrumentId) && this.productFlow == reconsentFlowWithInstrumentIdParams.productFlow && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, reconsentFlowWithInstrumentIdParams.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.excludeAggregators, reconsentFlowWithInstrumentIdParams.excludeAggregators);
        }

        public final com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.ReconsentFlowWithInstrumentIdParams copy(java.lang.String instrumentId, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow productFlow, java.lang.String countryCode, java.util.List<? extends com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> excludeAggregators) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productFlow, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(excludeAggregators, "");
            return new com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.ReconsentFlowWithInstrumentIdParams(instrumentId, productFlow, countryCode, excludeAggregators);
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> component4() {
            return this.excludeAggregators;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow getProductFlow() {
            return this.productFlow;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getInstrumentId() {
            return this.instrumentId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.ReconsentFlowWithInstrumentIdParams copy$default(com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.ReconsentFlowWithInstrumentIdParams reconsentFlowWithInstrumentIdParams, java.lang.String str, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, java.lang.String str2, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = reconsentFlowWithInstrumentIdParams.instrumentId;
            }
            if ((i & 2) != 0) {
                addFIFlow = reconsentFlowWithInstrumentIdParams.productFlow;
            }
            if ((i & 4) != 0) {
                str2 = reconsentFlowWithInstrumentIdParams.countryCode;
            }
            if ((i & 8) != 0) {
                list = reconsentFlowWithInstrumentIdParams.excludeAggregators;
            }
            return reconsentFlowWithInstrumentIdParams.copy(str, addFIFlow, str2, list);
        }
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$fGceKy9ccnDpzHrVrOrEm7zEZws() {
        return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithBankDetailsParams.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithInstrumentIdParams.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.ReconsentFlowWithBankDetailsParams.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.ReconsentFlowWithInstrumentIdParams.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams$IBCFlowWithBankDetailsParams$$serializer.INSTANCE, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams$IBCFlowWithInstrumentIdParams$$serializer.INSTANCE, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams$ReconsentFlowWithBankDetailsParams$$serializer.INSTANCE, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams$ReconsentFlowWithInstrumentIdParams$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
    }

    public /* synthetic */ InstantBankConfirmationAggregatorParams(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
