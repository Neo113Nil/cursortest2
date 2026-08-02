package com.paypal.oslo.feature.savings.api.navigation.result;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002'(B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/savings/api/navigation/result/SavingsAutoSaveNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "Lcom/paypal/oslo/feature/savings/api/navigation/result/AutoSaveResultType;", "type", "", "message", "<init>", "(Lcom/paypal/oslo/feature/savings/api/navigation/result/AutoSaveResultType;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/savings/api/navigation/result/AutoSaveResultType;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/savings/api/navigation/result/AutoSaveResultType;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/savings/api/navigation/result/AutoSaveResultType;Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/api/navigation/result/SavingsAutoSaveNavResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$savings_api_prodRelease", "(Lcom/paypal/oslo/feature/savings/api/navigation/result/SavingsAutoSaveNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/savings/api/navigation/result/AutoSaveResultType;", "getType", "Ljava/lang/String;", "getMessage", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class SavingsAutoSaveNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    private final java.lang.String message;
    private final com.paypal.oslo.feature.savings.api.navigation.result.AutoSaveResultType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult.Companion INSTANCE = new com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.savings.api.navigation.result.AutoSaveResultType.INSTANCE.serializer();
            return serializer;
        }
    }), null};

    public /* synthetic */ SavingsAutoSaveNavResult(int i, com.paypal.oslo.feature.savings.api.navigation.result.AutoSaveResultType autoSaveResultType, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult$$serializer.INSTANCE.getDescriptor());
        }
        this.type = autoSaveResultType;
        if ((i & 2) == 0) {
            this.message = "";
        } else {
            this.message = str;
        }
    }

    public SavingsAutoSaveNavResult(com.paypal.oslo.feature.savings.api.navigation.result.AutoSaveResultType autoSaveResultType, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoSaveResultType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.type = autoSaveResultType;
        this.message = str;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$savings_api_prodRelease(com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, $childSerializers[0].getValue(), self.type);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !kotlin.jvm.internal.Intrinsics.areEqual(self.message, "")) {
            output.encodeStringElement(serialDesc, 1, self.message);
        }
    }

    public final com.paypal.oslo.feature.savings.api.navigation.result.AutoSaveResultType getType() {
        return this.type;
    }

    public /* synthetic */ SavingsAutoSaveNavResult(com.paypal.oslo.feature.savings.api.navigation.result.AutoSaveResultType autoSaveResultType, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(autoSaveResultType, (i & 2) != 0 ? "" : str);
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/api/navigation/result/SavingsAutoSaveNavResult$Companion;", "", "<init>", "()V", "", "message", "Lcom/paypal/oslo/feature/savings/api/navigation/result/SavingsAutoSaveNavResult;", "success", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/api/navigation/result/SavingsAutoSaveNavResult;", "error", com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.FlowOutcome.CANCELLED, "()Lcom/paypal/oslo/feature/savings/api/navigation/result/SavingsAutoSaveNavResult;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult> serializer() {
            return com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult$$serializer.INSTANCE;
        }

        public final com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult success(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult(com.paypal.oslo.feature.savings.api.navigation.result.AutoSaveResultType.SUCCESS, message);
        }

        public final com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult error(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult(com.paypal.oslo.feature.savings.api.navigation.result.AutoSaveResultType.ERROR, message);
        }

        public final com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult cancelled() {
            return new com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult(com.paypal.oslo.feature.savings.api.navigation.result.AutoSaveResultType.CANCELLED, "");
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.savings.api.navigation.result.AutoSaveResultType autoSaveResultType = this.type;
        java.lang.String str = this.message;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SavingsAutoSaveNavResult(type=");
        sb.append(autoSaveResultType);
        sb.append(", message=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.type.hashCode() * 31) + this.message.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult)) {
            return false;
        }
        com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult savingsAutoSaveNavResult = (com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult) other;
        return this.type == savingsAutoSaveNavResult.type && kotlin.jvm.internal.Intrinsics.areEqual(this.message, savingsAutoSaveNavResult.message);
    }

    public final com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult copy(com.paypal.oslo.feature.savings.api.navigation.result.AutoSaveResultType type, java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        return new com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult(type, message);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.savings.api.navigation.result.AutoSaveResultType getType() {
        return this.type;
    }

    public static /* synthetic */ com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult copy$default(com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult savingsAutoSaveNavResult, com.paypal.oslo.feature.savings.api.navigation.result.AutoSaveResultType autoSaveResultType, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            autoSaveResultType = savingsAutoSaveNavResult.type;
        }
        if ((i & 2) != 0) {
            str = savingsAutoSaveNavResult.message;
        }
        return savingsAutoSaveNavResult.copy(autoSaveResultType, str);
    }
}
