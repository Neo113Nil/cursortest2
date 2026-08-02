package com.paypal.oslo.feature.wallet.fifo.transfer.ui.model;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/CurrencySelectorConfig;", "", "", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/SelectedCurrency;", "availableCurrencies", "selectedCurrency", "<init>", "(Ljava/util/List;Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/SelectedCurrency;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/SelectedCurrency;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/SelectedCurrency;", "copy", "(Ljava/util/List;Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/SelectedCurrency;)Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/CurrencySelectorConfig;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/CurrencySelectorConfig;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/util/List;", "getAvailableCurrencies", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/SelectedCurrency;", "getSelectedCurrency", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class CurrencySelectorConfig {
    private final java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency> availableCurrencies;
    private final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency selectedCurrency;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig.Companion INSTANCE = new com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig.$r8$lambda$k9Gq_3l6fHsEdThRgBxXZPz2aSg();
        }
    }), null};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/CurrencySelectorConfig$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/CurrencySelectorConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig> serializer() {
            return com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CurrencySelectorConfig(int i, java.util.List list, com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency selectedCurrency, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.availableCurrencies = list;
        this.selectedCurrency = selectedCurrency;
    }

    public CurrencySelectorConfig(java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency> list, com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency selectedCurrency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedCurrency, "");
        this.availableCurrencies = list;
        this.selectedCurrency = selectedCurrency;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$wallet_prodRelease(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, $childSerializers[0].getValue(), self.availableCurrencies);
        output.encodeSerializableElement(serialDesc, 1, com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency$$serializer.INSTANCE, self.selectedCurrency);
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency> getAvailableCurrencies() {
        return this.availableCurrencies;
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency getSelectedCurrency() {
        return this.selectedCurrency;
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$k9Gq_3l6fHsEdThRgBxXZPz2aSg() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency$$serializer.INSTANCE);
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency> list = this.availableCurrencies;
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency selectedCurrency = this.selectedCurrency;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrencySelectorConfig(availableCurrencies=");
        sb.append(list);
        sb.append(", selectedCurrency=");
        sb.append(selectedCurrency);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.availableCurrencies.hashCode() * 31) + this.selectedCurrency.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig currencySelectorConfig = (com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.availableCurrencies, currencySelectorConfig.availableCurrencies) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedCurrency, currencySelectorConfig.selectedCurrency);
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig copy(java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency> availableCurrencies, com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency selectedCurrency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableCurrencies, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedCurrency, "");
        return new com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig(availableCurrencies, selectedCurrency);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency getSelectedCurrency() {
        return this.selectedCurrency;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency> component1() {
        return this.availableCurrencies;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig copy$default(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig currencySelectorConfig, java.util.List list, com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency selectedCurrency, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = currencySelectorConfig.availableCurrencies;
        }
        if ((i & 2) != 0) {
            selectedCurrency = currencySelectorConfig.selectedCurrency;
        }
        return currencySelectorConfig.copy(list, selectedCurrency);
    }
}
