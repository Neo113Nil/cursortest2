package com.paypal.oslo.feature.subscriptions.shared.navigation.result;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/navigation/result/AgreementUpdatedNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "", "refreshNeeded", "clearCacheNeeded", "<init>", "(ZZ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/paypal/oslo/feature/subscriptions/shared/navigation/result/AgreementUpdatedNavResult;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$subscriptions_prodRelease", "(Lcom/paypal/oslo/feature/subscriptions/shared/navigation/result/AgreementUpdatedNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Z", "getRefreshNeeded", "getClearCacheNeeded", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class AgreementUpdatedNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.subscriptions.shared.navigation.result.AgreementUpdatedNavResult.Companion INSTANCE = new com.paypal.oslo.feature.subscriptions.shared.navigation.result.AgreementUpdatedNavResult.Companion(null);
    private final boolean clearCacheNeeded;
    private final boolean refreshNeeded;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/navigation/result/AgreementUpdatedNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/subscriptions/shared/navigation/result/AgreementUpdatedNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.subscriptions.shared.navigation.result.AgreementUpdatedNavResult> serializer() {
            return com.paypal.oslo.feature.subscriptions.shared.navigation.result.AgreementUpdatedNavResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AgreementUpdatedNavResult(int i, boolean z, boolean z2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.subscriptions.shared.navigation.result.AgreementUpdatedNavResult$$serializer.INSTANCE.getDescriptor());
        }
        this.refreshNeeded = z;
        if ((i & 2) == 0) {
            this.clearCacheNeeded = false;
        } else {
            this.clearCacheNeeded = z2;
        }
    }

    public AgreementUpdatedNavResult(boolean z, boolean z2) {
        this.refreshNeeded = z;
        this.clearCacheNeeded = z2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$subscriptions_prodRelease(com.paypal.oslo.feature.subscriptions.shared.navigation.result.AgreementUpdatedNavResult self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.refreshNeeded);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.clearCacheNeeded) {
            output.encodeBooleanElement(serialDesc, 1, self.clearCacheNeeded);
        }
    }

    public /* synthetic */ AgreementUpdatedNavResult(boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? false : z2);
    }

    public final boolean getRefreshNeeded() {
        return this.refreshNeeded;
    }

    public final boolean getClearCacheNeeded() {
        return this.clearCacheNeeded;
    }

    public final java.lang.String toString() {
        boolean z = this.refreshNeeded;
        boolean z2 = this.clearCacheNeeded;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AgreementUpdatedNavResult(refreshNeeded=");
        sb.append(z);
        sb.append(", clearCacheNeeded=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Boolean.hashCode(this.refreshNeeded) * 31) + java.lang.Boolean.hashCode(this.clearCacheNeeded);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.subscriptions.shared.navigation.result.AgreementUpdatedNavResult)) {
            return false;
        }
        com.paypal.oslo.feature.subscriptions.shared.navigation.result.AgreementUpdatedNavResult agreementUpdatedNavResult = (com.paypal.oslo.feature.subscriptions.shared.navigation.result.AgreementUpdatedNavResult) other;
        return this.refreshNeeded == agreementUpdatedNavResult.refreshNeeded && this.clearCacheNeeded == agreementUpdatedNavResult.clearCacheNeeded;
    }

    public final com.paypal.oslo.feature.subscriptions.shared.navigation.result.AgreementUpdatedNavResult copy(boolean refreshNeeded, boolean clearCacheNeeded) {
        return new com.paypal.oslo.feature.subscriptions.shared.navigation.result.AgreementUpdatedNavResult(refreshNeeded, clearCacheNeeded);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getClearCacheNeeded() {
        return this.clearCacheNeeded;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getRefreshNeeded() {
        return this.refreshNeeded;
    }

    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.navigation.result.AgreementUpdatedNavResult copy$default(com.paypal.oslo.feature.subscriptions.shared.navigation.result.AgreementUpdatedNavResult agreementUpdatedNavResult, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = agreementUpdatedNavResult.refreshNeeded;
        }
        if ((i & 2) != 0) {
            z2 = agreementUpdatedNavResult.clearCacheNeeded;
        }
        return agreementUpdatedNavResult.copy(z, z2);
    }
}
