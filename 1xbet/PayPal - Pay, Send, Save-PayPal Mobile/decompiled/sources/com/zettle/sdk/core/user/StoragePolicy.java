package com.zettle.sdk.core.user;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B/\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dHÇ\u0001¢\u0006\u0004\b \u0010!R \u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u000fR \u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010&\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010\r"}, d2 = {"Lcom/zettle/sdk/core/user/StoragePolicy;", "", "", "seen1", "countLimit", "", "amountLimit", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(IIJLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(IJ)V", "component1", "()I", "component2", "()J", "copy", "(IJ)Lcom/zettle/sdk/core/user/StoragePolicy;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/zettle/sdk/core/user/StoragePolicy;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "J", "getAmountLimit", "getAmountLimit$annotations", "()V", com.visa.cbp.getEncExpo.warmup, "getCountLimit", "getCountLimit$annotations", "Companion", "$serializer"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes3.dex */
public final /* data */ class StoragePolicy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.core.user.StoragePolicy.Companion INSTANCE = new com.zettle.sdk.core.user.StoragePolicy.Companion(null);
    private final long amountLimit;
    private final int countLimit;

    @kotlinx.serialization.SerialName("amount_limit")
    public static /* synthetic */ void getAmountLimit$annotations() {
    }

    @kotlinx.serialization.SerialName("count_limit")
    public static /* synthetic */ void getCountLimit$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/core/user/StoragePolicy$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/zettle/sdk/core/user/StoragePolicy;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.zettle.sdk.core.user.StoragePolicy> serializer() {
            return com.zettle.sdk.core.user.StoragePolicy$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ StoragePolicy(int i, @kotlinx.serialization.SerialName("count_limit") int i2, @kotlinx.serialization.SerialName("amount_limit") long j, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.zettle.sdk.core.user.StoragePolicy$$serializer.INSTANCE.getDescriptor());
        }
        this.countLimit = i2;
        this.amountLimit = j;
    }

    public StoragePolicy(int i, long j) {
        this.countLimit = i;
        this.amountLimit = j;
    }

    @kotlin.jvm.JvmStatic
    public static final void write$Self(com.zettle.sdk.core.user.StoragePolicy self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
        output.encodeIntElement(serialDesc, 0, self.countLimit);
        output.encodeLongElement(serialDesc, 1, self.amountLimit);
    }

    public final int getCountLimit() {
        return this.countLimit;
    }

    public final long getAmountLimit() {
        return this.amountLimit;
    }

    public final java.lang.String toString() {
        int i = this.countLimit;
        long j = this.amountLimit;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StoragePolicy(countLimit=");
        sb.append(i);
        sb.append(", amountLimit=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Integer.hashCode(this.countLimit) * 31) + java.lang.Long.hashCode(this.amountLimit);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.core.user.StoragePolicy)) {
            return false;
        }
        com.zettle.sdk.core.user.StoragePolicy storagePolicy = (com.zettle.sdk.core.user.StoragePolicy) other;
        return this.countLimit == storagePolicy.countLimit && this.amountLimit == storagePolicy.amountLimit;
    }

    public final com.zettle.sdk.core.user.StoragePolicy copy(int countLimit, long amountLimit) {
        return new com.zettle.sdk.core.user.StoragePolicy(countLimit, amountLimit);
    }

    /* renamed from: component2, reason: from getter */
    public final long getAmountLimit() {
        return this.amountLimit;
    }

    /* renamed from: component1, reason: from getter */
    public final int getCountLimit() {
        return this.countLimit;
    }

    public static /* synthetic */ com.zettle.sdk.core.user.StoragePolicy copy$default(com.zettle.sdk.core.user.StoragePolicy storagePolicy, int i, long j, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = storagePolicy.countLimit;
        }
        if ((i2 & 2) != 0) {
            j = storagePolicy.amountLimit;
        }
        return storagePolicy.copy(i, j);
    }
}
