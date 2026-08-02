package com.paypal.oslo.feature.wallet.wallet.navigation.result;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/navigation/result/SelectCurrencyNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/SelectedCurrency;", "selectedCurrency", "<init>", "(Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/SelectedCurrency;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/SelectedCurrency;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/SelectedCurrency;", "copy", "(Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/SelectedCurrency;)Lcom/paypal/oslo/feature/wallet/wallet/navigation/result/SelectCurrencyNavResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/wallet/navigation/result/SelectCurrencyNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/SelectedCurrency;", "getSelectedCurrency", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class SelectCurrencyNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.wallet.navigation.result.SelectCurrencyNavResult.Companion INSTANCE = new com.paypal.oslo.feature.wallet.wallet.navigation.result.SelectCurrencyNavResult.Companion(null);
    private final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency selectedCurrency;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/navigation/result/SelectCurrencyNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/wallet/navigation/result/SelectCurrencyNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.wallet.navigation.result.SelectCurrencyNavResult> serializer() {
            return com.paypal.oslo.feature.wallet.wallet.navigation.result.SelectCurrencyNavResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SelectCurrencyNavResult(int i, com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency selectedCurrency, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.wallet.wallet.navigation.result.SelectCurrencyNavResult$$serializer.INSTANCE.getDescriptor());
        }
        this.selectedCurrency = selectedCurrency;
    }

    public SelectCurrencyNavResult(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency selectedCurrency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedCurrency, "");
        this.selectedCurrency = selectedCurrency;
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency getSelectedCurrency() {
        return this.selectedCurrency;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency selectedCurrency = this.selectedCurrency;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectCurrencyNavResult(selectedCurrency=");
        sb.append(selectedCurrency);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.selectedCurrency.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.wallet.wallet.navigation.result.SelectCurrencyNavResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedCurrency, ((com.paypal.oslo.feature.wallet.wallet.navigation.result.SelectCurrencyNavResult) other).selectedCurrency);
    }

    public final com.paypal.oslo.feature.wallet.wallet.navigation.result.SelectCurrencyNavResult copy(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency selectedCurrency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedCurrency, "");
        return new com.paypal.oslo.feature.wallet.wallet.navigation.result.SelectCurrencyNavResult(selectedCurrency);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency getSelectedCurrency() {
        return this.selectedCurrency;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.wallet.navigation.result.SelectCurrencyNavResult copy$default(com.paypal.oslo.feature.wallet.wallet.navigation.result.SelectCurrencyNavResult selectCurrencyNavResult, com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency selectedCurrency, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            selectedCurrency = selectCurrencyNavResult.selectedCurrency;
        }
        return selectCurrencyNavResult.copy(selectedCurrency);
    }
}
