package com.paypal.oslo.feature.debitcard.shared.navigation.result;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/navigation/result/FundingSourceSelectorNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "", "selectedFundingSourceId", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/shared/navigation/result/FundingSourceSelectorNavResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$debit_card_prodRelease", "(Lcom/paypal/oslo/feature/debitcard/shared/navigation/result/FundingSourceSelectorNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getSelectedFundingSourceId", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class FundingSourceSelectorNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.shared.navigation.result.FundingSourceSelectorNavResult.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.shared.navigation.result.FundingSourceSelectorNavResult.Companion(null);
    private final java.lang.String selectedFundingSourceId;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/navigation/result/FundingSourceSelectorNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/shared/navigation/result/FundingSourceSelectorNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.shared.navigation.result.FundingSourceSelectorNavResult> serializer() {
            return com.paypal.oslo.feature.debitcard.shared.navigation.result.FundingSourceSelectorNavResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FundingSourceSelectorNavResult(int i, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.debitcard.shared.navigation.result.FundingSourceSelectorNavResult$$serializer.INSTANCE.getDescriptor());
        }
        this.selectedFundingSourceId = str;
    }

    public FundingSourceSelectorNavResult(java.lang.String str) {
        this.selectedFundingSourceId = str;
    }

    public final java.lang.String getSelectedFundingSourceId() {
        return this.selectedFundingSourceId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.selectedFundingSourceId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingSourceSelectorNavResult(selectedFundingSourceId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.selectedFundingSourceId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.debitcard.shared.navigation.result.FundingSourceSelectorNavResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFundingSourceId, ((com.paypal.oslo.feature.debitcard.shared.navigation.result.FundingSourceSelectorNavResult) other).selectedFundingSourceId);
    }

    public final com.paypal.oslo.feature.debitcard.shared.navigation.result.FundingSourceSelectorNavResult copy(java.lang.String selectedFundingSourceId) {
        return new com.paypal.oslo.feature.debitcard.shared.navigation.result.FundingSourceSelectorNavResult(selectedFundingSourceId);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSelectedFundingSourceId() {
        return this.selectedFundingSourceId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.navigation.result.FundingSourceSelectorNavResult copy$default(com.paypal.oslo.feature.debitcard.shared.navigation.result.FundingSourceSelectorNavResult fundingSourceSelectorNavResult, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = fundingSourceSelectorNavResult.selectedFundingSourceId;
        }
        return fundingSourceSelectorNavResult.copy(str);
    }
}
