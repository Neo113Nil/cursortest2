package com.ingo.sdk.kotlin.common.features.customer.model;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b\u0005\u0010\u000f"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/customer/model/AccountFees;", "", "", "feeAmountInCents", "", "isWaived", "<init>", "(IZ)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()I", "component2", "()Z", "copy", "(IZ)Lcom/ingo/sdk/kotlin/common/features/customer/model/AccountFees;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sharedSdk_release", "(Lcom/ingo/sdk/kotlin/common/features/customer/model/AccountFees;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", com.visa.cbp.getEncExpo.warmup, "getFeeAmountInCents", "Z", "Companion", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes.dex */
public final /* data */ class AccountFees {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.ingo.sdk.kotlin.common.features.customer.model.AccountFees.Companion INSTANCE = new com.ingo.sdk.kotlin.common.features.customer.model.AccountFees.Companion(null);
    private final int feeAmountInCents;
    private final boolean isWaived;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/customer/model/AccountFees$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingo/sdk/kotlin/common/features/customer/model/AccountFees;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        public final kotlinx.serialization.KSerializer<com.ingo.sdk.kotlin.common.features.customer.model.AccountFees> serializer() {
            return com.ingo.sdk.kotlin.common.features.customer.model.AccountFees$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ AccountFees(int i, int i2, boolean z, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.ingo.sdk.kotlin.common.features.customer.model.AccountFees$$serializer.INSTANCE.getDescriptor());
        }
        this.feeAmountInCents = i2;
        this.isWaived = z;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$sharedSdk_release(com.ingo.sdk.kotlin.common.features.customer.model.AccountFees self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.feeAmountInCents);
        output.encodeBooleanElement(serialDesc, 1, self.isWaived);
    }

    public AccountFees(int i, boolean z) {
        this.feeAmountInCents = i;
        this.isWaived = z;
    }

    public final int getFeeAmountInCents() {
        return this.feeAmountInCents;
    }

    public final boolean isWaived() {
        return this.isWaived;
    }

    public final java.lang.String toString() {
        int i = this.feeAmountInCents;
        boolean z = this.isWaived;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AccountFees(feeAmountInCents=");
        sb.append(i);
        sb.append(", isWaived=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Integer.hashCode(this.feeAmountInCents) * 31) + java.lang.Boolean.hashCode(this.isWaived);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.ingo.sdk.kotlin.common.features.customer.model.AccountFees)) {
            return false;
        }
        com.ingo.sdk.kotlin.common.features.customer.model.AccountFees accountFees = (com.ingo.sdk.kotlin.common.features.customer.model.AccountFees) other;
        return this.feeAmountInCents == accountFees.feeAmountInCents && this.isWaived == accountFees.isWaived;
    }

    public final com.ingo.sdk.kotlin.common.features.customer.model.AccountFees copy(int feeAmountInCents, boolean isWaived) {
        return new com.ingo.sdk.kotlin.common.features.customer.model.AccountFees(feeAmountInCents, isWaived);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsWaived() {
        return this.isWaived;
    }

    /* renamed from: component1, reason: from getter */
    public final int getFeeAmountInCents() {
        return this.feeAmountInCents;
    }

    public static /* synthetic */ com.ingo.sdk.kotlin.common.features.customer.model.AccountFees copy$default(com.ingo.sdk.kotlin.common.features.customer.model.AccountFees accountFees, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = accountFees.feeAmountInCents;
        }
        if ((i2 & 2) != 0) {
            z = accountFees.isWaived;
        }
        return accountFees.copy(i, z);
    }
}
