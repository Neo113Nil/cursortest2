package com.ingo.sdk.kotlin.common.features.history.model;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0011"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/history/model/TransactionHistoryResponse;", "", "Lcom/ingo/sdk/kotlin/common/features/history/model/PageInfo;", "pageInfo", "", "Lcom/ingo/sdk/kotlin/common/features/history/model/TransactionDetails;", "transactions", "<init>", "(Lcom/ingo/sdk/kotlin/common/features/history/model/PageInfo;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/ingo/sdk/kotlin/common/features/history/model/PageInfo;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/ingo/sdk/kotlin/common/features/history/model/PageInfo;", "component2", "()Ljava/util/List;", "copy", "(Lcom/ingo/sdk/kotlin/common/features/history/model/PageInfo;Ljava/util/List;)Lcom/ingo/sdk/kotlin/common/features/history/model/TransactionHistoryResponse;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sharedSdk_release", "(Lcom/ingo/sdk/kotlin/common/features/history/model/TransactionHistoryResponse;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingo/sdk/kotlin/common/features/history/model/PageInfo;", "getPageInfo", "Ljava/util/List;", "getTransactions", "Companion", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes.dex */
public final /* data */ class TransactionHistoryResponse {
    private final com.ingo.sdk.kotlin.common.features.history.model.PageInfo pageInfo;
    private final java.util.List<com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails> transactions;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.ingo.sdk.kotlin.common.features.history.model.TransactionHistoryResponse.Companion INSTANCE = new com.ingo.sdk.kotlin.common.features.history.model.TransactionHistoryResponse.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.kotlin.common.features.history.model.TransactionHistoryResponse$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.ingo.sdk.kotlin.common.features.history.model.TransactionHistoryResponse.$r8$lambda$wVKJRJzf6aOp5f4fkNQ75qgKPYQ();
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/history/model/TransactionHistoryResponse$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingo/sdk/kotlin/common/features/history/model/TransactionHistoryResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        public final kotlinx.serialization.KSerializer<com.ingo.sdk.kotlin.common.features.history.model.TransactionHistoryResponse> serializer() {
            return com.ingo.sdk.kotlin.common.features.history.model.TransactionHistoryResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ TransactionHistoryResponse(int i, com.ingo.sdk.kotlin.common.features.history.model.PageInfo pageInfo, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.ingo.sdk.kotlin.common.features.history.model.TransactionHistoryResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.pageInfo = pageInfo;
        this.transactions = list;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$sharedSdk_release(com.ingo.sdk.kotlin.common.features.history.model.TransactionHistoryResponse self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, com.ingo.sdk.kotlin.common.features.history.model.PageInfo$$serializer.INSTANCE, self.pageInfo);
        output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.transactions);
    }

    public TransactionHistoryResponse(com.ingo.sdk.kotlin.common.features.history.model.PageInfo pageInfo, java.util.List<com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.pageInfo = pageInfo;
        this.transactions = list;
    }

    public final com.ingo.sdk.kotlin.common.features.history.model.PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public final java.util.List<com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails> getTransactions() {
        return this.transactions;
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$wVKJRJzf6aOp5f4fkNQ75qgKPYQ() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails$$serializer.INSTANCE);
    }

    public final java.lang.String toString() {
        com.ingo.sdk.kotlin.common.features.history.model.PageInfo pageInfo = this.pageInfo;
        java.util.List<com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails> list = this.transactions;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionHistoryResponse(pageInfo=");
        sb.append(pageInfo);
        sb.append(", transactions=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.pageInfo.hashCode() * 31) + this.transactions.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.ingo.sdk.kotlin.common.features.history.model.TransactionHistoryResponse)) {
            return false;
        }
        com.ingo.sdk.kotlin.common.features.history.model.TransactionHistoryResponse transactionHistoryResponse = (com.ingo.sdk.kotlin.common.features.history.model.TransactionHistoryResponse) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.pageInfo, transactionHistoryResponse.pageInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactions, transactionHistoryResponse.transactions);
    }

    public final com.ingo.sdk.kotlin.common.features.history.model.TransactionHistoryResponse copy(com.ingo.sdk.kotlin.common.features.history.model.PageInfo pageInfo, java.util.List<com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails> transactions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactions, "");
        return new com.ingo.sdk.kotlin.common.features.history.model.TransactionHistoryResponse(pageInfo, transactions);
    }

    public final java.util.List<com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails> component2() {
        return this.transactions;
    }

    /* renamed from: component1, reason: from getter */
    public final com.ingo.sdk.kotlin.common.features.history.model.PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.ingo.sdk.kotlin.common.features.history.model.TransactionHistoryResponse copy$default(com.ingo.sdk.kotlin.common.features.history.model.TransactionHistoryResponse transactionHistoryResponse, com.ingo.sdk.kotlin.common.features.history.model.PageInfo pageInfo, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            pageInfo = transactionHistoryResponse.pageInfo;
        }
        if ((i & 2) != 0) {
            list = transactionHistoryResponse.transactions;
        }
        return transactionHistoryResponse.copy(pageInfo, list);
    }
}
