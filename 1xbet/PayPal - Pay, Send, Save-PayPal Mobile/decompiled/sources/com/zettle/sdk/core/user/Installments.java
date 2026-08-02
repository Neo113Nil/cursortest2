package com.zettle.sdk.core.user;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B5\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ(\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fHÇ\u0001¢\u0006\u0004\b\"\u0010#R \u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u000eR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0010"}, d2 = {"Lcom/zettle/sdk/core/user/Installments;", "", "", "seen1", "", "minAmount", "", "options", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(IJLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(JLjava/util/List;)V", "component1", "()J", "component2", "()Ljava/util/List;", "copy", "(JLjava/util/List;)Lcom/zettle/sdk/core/user/Installments;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/zettle/sdk/core/user/Installments;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "J", "getMinAmount", "getMinAmount$annotations", "()V", "Ljava/util/List;", "getOptions", "Companion", "$serializer"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes3.dex */
public final /* data */ class Installments {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.core.user.Installments.Companion INSTANCE = new com.zettle.sdk.core.user.Installments.Companion(null);
    private final long minAmount;
    private final java.util.List<java.lang.Integer> options;

    @kotlinx.serialization.SerialName("min_amount")
    public static /* synthetic */ void getMinAmount$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/core/user/Installments$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/zettle/sdk/core/user/Installments;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.zettle.sdk.core.user.Installments> serializer() {
            return com.zettle.sdk.core.user.Installments$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Installments(int i, @kotlinx.serialization.SerialName("min_amount") long j, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.zettle.sdk.core.user.Installments$$serializer.INSTANCE.getDescriptor());
        }
        this.minAmount = j;
        if ((i & 2) == 0) {
            this.options = null;
        } else {
            this.options = list;
        }
    }

    public Installments(long j, java.util.List<java.lang.Integer> list) {
        this.minAmount = j;
        this.options = list;
    }

    @kotlin.jvm.JvmStatic
    public static final void write$Self(com.zettle.sdk.core.user.Installments self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
        output.encodeLongElement(serialDesc, 0, self.minAmount);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.options != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.IntSerializer.INSTANCE), self.options);
        }
    }

    public /* synthetic */ Installments(long j, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : list);
    }

    public final long getMinAmount() {
        return this.minAmount;
    }

    public final java.util.List<java.lang.Integer> getOptions() {
        return this.options;
    }

    public final java.lang.String toString() {
        long j = this.minAmount;
        java.util.List<java.lang.Integer> list = this.options;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Installments(minAmount=");
        sb.append(j);
        sb.append(", options=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.minAmount);
        java.util.List<java.lang.Integer> list = this.options;
        return (hashCode * 31) + (list == null ? 0 : list.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.core.user.Installments)) {
            return false;
        }
        com.zettle.sdk.core.user.Installments installments = (com.zettle.sdk.core.user.Installments) other;
        return this.minAmount == installments.minAmount && kotlin.jvm.internal.Intrinsics.areEqual(this.options, installments.options);
    }

    public final com.zettle.sdk.core.user.Installments copy(long minAmount, java.util.List<java.lang.Integer> options) {
        return new com.zettle.sdk.core.user.Installments(minAmount, options);
    }

    public final java.util.List<java.lang.Integer> component2() {
        return this.options;
    }

    /* renamed from: component1, reason: from getter */
    public final long getMinAmount() {
        return this.minAmount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.zettle.sdk.core.user.Installments copy$default(com.zettle.sdk.core.user.Installments installments, long j, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = installments.minAmount;
        }
        if ((i & 2) != 0) {
            list = installments.options;
        }
        return installments.copy(j, list);
    }
}
