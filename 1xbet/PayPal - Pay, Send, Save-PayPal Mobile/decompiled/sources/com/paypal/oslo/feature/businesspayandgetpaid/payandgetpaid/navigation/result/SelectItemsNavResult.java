package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ \u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/navigation/result/SelectItemsNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/LineItem;", "selectedItems", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/navigation/result/SelectItemsNavResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$business_pay_and_get_paid_prodRelease", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/navigation/result/SelectItemsNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/util/List;", "getSelectedItems", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class SelectItemsNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    private final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> selectedItems;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.SelectItemsNavResult.Companion INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.SelectItemsNavResult.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.SelectItemsNavResult$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.SelectItemsNavResult.$r8$lambda$PzZWxBRq59iJUKJ5EfayTvefMf4();
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/navigation/result/SelectItemsNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/navigation/result/SelectItemsNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.SelectItemsNavResult> serializer() {
            return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.SelectItemsNavResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SelectItemsNavResult(int i, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.SelectItemsNavResult$$serializer.INSTANCE.getDescriptor());
        }
        this.selectedItems = list;
    }

    public SelectItemsNavResult(java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.selectedItems = list;
    }

    public final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> getSelectedItems() {
        return this.selectedItems;
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$PzZWxBRq59iJUKJ5EfayTvefMf4() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem$$serializer.INSTANCE);
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> list = this.selectedItems;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectItemsNavResult(selectedItems=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.selectedItems.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.SelectItemsNavResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedItems, ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.SelectItemsNavResult) other).selectedItems);
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.SelectItemsNavResult copy(java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> selectedItems) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedItems, "");
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.SelectItemsNavResult(selectedItems);
    }

    public final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> component1() {
        return this.selectedItems;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.SelectItemsNavResult copy$default(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.SelectItemsNavResult selectItemsNavResult, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = selectItemsNavResult.selectedItems;
        }
        return selectItemsNavResult.copy(list);
    }
}
