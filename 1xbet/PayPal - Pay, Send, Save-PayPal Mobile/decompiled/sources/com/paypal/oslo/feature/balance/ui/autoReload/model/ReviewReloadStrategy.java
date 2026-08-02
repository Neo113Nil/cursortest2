package com.paypal.oslo.feature.balance.ui.autoReload.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bw\u0018\u0000 \n2\u00020\u0001:\u0003\u000b\f\nR\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\r\u000eÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewReloadStrategy;", "", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;", "getRechargeAmount", "()Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;", "rechargeAmount", "", "getFinancialInstrumentId", "()Ljava/lang/String;", "financialInstrumentId", "Companion", "LowBalance", "Scheduled", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewReloadStrategy$LowBalance;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewReloadStrategy$Scheduled;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public interface ReviewReloadStrategy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Companion INSTANCE = com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Companion.Camera2StreamConfigurationMap;

    java.lang.String getFinancialInstrumentId();

    com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi getRechargeAmount();

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewReloadStrategy$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewReloadStrategy;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Companion Camera2StreamConfigurationMap = new com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Companion();

        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy> serializer() {
            return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.LowBalance.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy$LowBalance$$serializer.INSTANCE, com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy$Scheduled$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewReloadStrategy$LowBalance;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewReloadStrategy;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;", "rechargeAmount", "thresholdAmount", "", "financialInstrumentId", "<init>", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;", "component2", "component3", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewReloadStrategy$LowBalance;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$balance_prodRelease", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewReloadStrategy$LowBalance;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;", "getRechargeAmount", "getThresholdAmount", "Ljava/lang/String;", "getFinancialInstrumentId", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class LowBalance implements com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.LowBalance.Companion INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.LowBalance.Companion(null);
        private final java.lang.String financialInstrumentId;
        private final com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi rechargeAmount;
        private final com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi thresholdAmount;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewReloadStrategy$LowBalance$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewReloadStrategy$LowBalance;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.LowBalance> serializer() {
                return com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy$LowBalance$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ LowBalance(int i, com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi, com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi2, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            this.rechargeAmount = (i & 1) == 0 ? new com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi((java.lang.String) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null) : reloadAmountUi;
            if ((i & 2) == 0) {
                this.thresholdAmount = new com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi((java.lang.String) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            } else {
                this.thresholdAmount = reloadAmountUi2;
            }
            if ((i & 4) == 0) {
                this.financialInstrumentId = null;
            } else {
                this.financialInstrumentId = str;
            }
        }

        public LowBalance(com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi, com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi2, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reloadAmountUi, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reloadAmountUi2, "");
            this.rechargeAmount = reloadAmountUi;
            this.thresholdAmount = reloadAmountUi2;
            this.financialInstrumentId = str;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$balance_prodRelease(com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.LowBalance self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            if (output.shouldEncodeElementDefault(serialDesc, 0) || !kotlin.jvm.internal.Intrinsics.areEqual(self.getRechargeAmount(), new com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi((java.lang.String) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null))) {
                output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi$$serializer.INSTANCE, self.getRechargeAmount());
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || !kotlin.jvm.internal.Intrinsics.areEqual(self.thresholdAmount, new com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi((java.lang.String) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null))) {
                output.encodeSerializableElement(serialDesc, 1, com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi$$serializer.INSTANCE, self.thresholdAmount);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.getFinancialInstrumentId() != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.getFinancialInstrumentId());
            }
        }

        public /* synthetic */ LowBalance(com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi, com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi2, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi((java.lang.String) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null) : reloadAmountUi, (i & 2) != 0 ? new com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi((java.lang.String) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null) : reloadAmountUi2, (i & 4) != 0 ? null : str);
        }

        @Override // com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy
        public final com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi getRechargeAmount() {
            return this.rechargeAmount;
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi getThresholdAmount() {
            return this.thresholdAmount;
        }

        @Override // com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy
        public final java.lang.String getFinancialInstrumentId() {
            return this.financialInstrumentId;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi = this.rechargeAmount;
            com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi2 = this.thresholdAmount;
            java.lang.String str = this.financialInstrumentId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LowBalance(rechargeAmount=");
            sb.append(reloadAmountUi);
            sb.append(", thresholdAmount=");
            sb.append(reloadAmountUi2);
            sb.append(", financialInstrumentId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.rechargeAmount.hashCode();
            int hashCode2 = this.thresholdAmount.hashCode();
            java.lang.String str = this.financialInstrumentId;
            return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.LowBalance)) {
                return false;
            }
            com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.LowBalance lowBalance = (com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.LowBalance) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.rechargeAmount, lowBalance.rechargeAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.thresholdAmount, lowBalance.thresholdAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.financialInstrumentId, lowBalance.financialInstrumentId);
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.LowBalance copy(com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi rechargeAmount, com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi thresholdAmount, java.lang.String financialInstrumentId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rechargeAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thresholdAmount, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.LowBalance(rechargeAmount, thresholdAmount, financialInstrumentId);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getFinancialInstrumentId() {
            return this.financialInstrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi getThresholdAmount() {
            return this.thresholdAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi getRechargeAmount() {
            return this.rechargeAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.LowBalance copy$default(com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.LowBalance lowBalance, com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi, com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi2, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                reloadAmountUi = lowBalance.rechargeAmount;
            }
            if ((i & 2) != 0) {
                reloadAmountUi2 = lowBalance.thresholdAmount;
            }
            if ((i & 4) != 0) {
                str = lowBalance.financialInstrumentId;
            }
            return lowBalance.copy(reloadAmountUi, reloadAmountUi2, str);
        }

        public LowBalance() {
            this((com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi) null, (com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi) null, (java.lang.String) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J:\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\"\u0010\u0018J'\u0010)\u001a\u00020(2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0001¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0014R \u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewReloadStrategy$Scheduled;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewReloadStrategy;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;", "rechargeAmount", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency;", "frequency", "Ljava/time/LocalDate;", "startDate", "", "financialInstrumentId", "<init>", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency;Ljava/time/LocalDate;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency;Ljava/time/LocalDate;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;", "component2", "()Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency;", "component3", "()Ljava/time/LocalDate;", "component4", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency;Ljava/time/LocalDate;Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewReloadStrategy$Scheduled;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$balance_prodRelease", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewReloadStrategy$Scheduled;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;", "getRechargeAmount", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency;", "getFrequency", "Ljava/time/LocalDate;", "getStartDate", "getStartDate$annotations", "()V", "Ljava/lang/String;", "getFinancialInstrumentId", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Scheduled implements com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy {
        private final java.lang.String financialInstrumentId;
        private final com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency frequency;
        private final com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi rechargeAmount;
        private final java.time.LocalDate startDate;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled.Companion INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled.Companion(null);
        public static final int $stable = 8;
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy$Scheduled$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled.$r8$lambda$BmuyjrVKD0d1Dj1r1YylGB_e5Xw();
            }
        }), null, null};

        @kotlinx.serialization.Serializable(with = com.paypal.oslo.feature.balance.common.serializer.LocalDateSerializer.class)
        public static /* synthetic */ void getStartDate$annotations() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewReloadStrategy$Scheduled$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewReloadStrategy$Scheduled;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled> serializer() {
                return com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy$Scheduled$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Scheduled(int i, com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi, com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency autoReloadFrequency, java.time.LocalDate localDate, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i & 7)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy$Scheduled$$serializer.INSTANCE.getDescriptor());
            }
            this.rechargeAmount = reloadAmountUi;
            this.frequency = autoReloadFrequency;
            this.startDate = localDate;
            if ((i & 8) == 0) {
                this.financialInstrumentId = null;
            } else {
                this.financialInstrumentId = str;
            }
        }

        public Scheduled(com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi, com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency autoReloadFrequency, java.time.LocalDate localDate, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reloadAmountUi, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadFrequency, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDate, "");
            this.rechargeAmount = reloadAmountUi;
            this.frequency = autoReloadFrequency;
            this.startDate = localDate;
            this.financialInstrumentId = str;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$balance_prodRelease(com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi$$serializer.INSTANCE, self.getRechargeAmount());
            output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.frequency);
            output.encodeSerializableElement(serialDesc, 2, com.paypal.oslo.feature.balance.common.serializer.LocalDateSerializer.INSTANCE, self.startDate);
            if (output.shouldEncodeElementDefault(serialDesc, 3) || self.getFinancialInstrumentId() != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.getFinancialInstrumentId());
            }
        }

        public /* synthetic */ Scheduled(com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi, com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency autoReloadFrequency, java.time.LocalDate localDate, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(reloadAmountUi, autoReloadFrequency, localDate, (i & 8) != 0 ? null : str);
        }

        @Override // com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy
        public final com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi getRechargeAmount() {
            return this.rechargeAmount;
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency getFrequency() {
            return this.frequency;
        }

        public final java.time.LocalDate getStartDate() {
            return this.startDate;
        }

        @Override // com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy
        public final java.lang.String getFinancialInstrumentId() {
            return this.financialInstrumentId;
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$BmuyjrVKD0d1Dj1r1YylGB_e5Xw() {
            return new kotlinx.serialization.PolymorphicSerializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.class), new java.lang.annotation.Annotation[0]);
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi = this.rechargeAmount;
            com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency autoReloadFrequency = this.frequency;
            java.time.LocalDate localDate = this.startDate;
            java.lang.String str = this.financialInstrumentId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Scheduled(rechargeAmount=");
            sb.append(reloadAmountUi);
            sb.append(", frequency=");
            sb.append(autoReloadFrequency);
            sb.append(", startDate=");
            sb.append(localDate);
            sb.append(", financialInstrumentId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.rechargeAmount.hashCode();
            int hashCode2 = this.frequency.hashCode();
            int hashCode3 = this.startDate.hashCode();
            java.lang.String str = this.financialInstrumentId;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled)) {
                return false;
            }
            com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled scheduled = (com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.rechargeAmount, scheduled.rechargeAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.frequency, scheduled.frequency) && kotlin.jvm.internal.Intrinsics.areEqual(this.startDate, scheduled.startDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.financialInstrumentId, scheduled.financialInstrumentId);
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled copy(com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi rechargeAmount, com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency frequency, java.time.LocalDate startDate, java.lang.String financialInstrumentId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rechargeAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frequency, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startDate, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled(rechargeAmount, frequency, startDate, financialInstrumentId);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getFinancialInstrumentId() {
            return this.financialInstrumentId;
        }

        /* renamed from: component3, reason: from getter */
        public final java.time.LocalDate getStartDate() {
            return this.startDate;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency getFrequency() {
            return this.frequency;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi getRechargeAmount() {
            return this.rechargeAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled copy$default(com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled scheduled, com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi, com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency autoReloadFrequency, java.time.LocalDate localDate, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                reloadAmountUi = scheduled.rechargeAmount;
            }
            if ((i & 2) != 0) {
                autoReloadFrequency = scheduled.frequency;
            }
            if ((i & 4) != 0) {
                localDate = scheduled.startDate;
            }
            if ((i & 8) != 0) {
                str = scheduled.financialInstrumentId;
            }
            return scheduled.copy(reloadAmountUi, autoReloadFrequency, localDate, str);
        }
    }
}
