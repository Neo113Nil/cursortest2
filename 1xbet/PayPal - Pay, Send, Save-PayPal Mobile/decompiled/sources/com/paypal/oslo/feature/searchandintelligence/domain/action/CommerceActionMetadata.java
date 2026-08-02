package com.paypal.oslo.feature.searchandintelligence.domain.action;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ&\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\rR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/action/CommerceActionMetadata;", "", "", "id", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/searchandintelligence/domain/action/CommerceActionMetadata;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$search_and_intelligence_prodRelease", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/action/CommerceActionMetadata;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getId", "getType", "getType$annotations", "()V", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class CommerceActionMetadata {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.searchandintelligence.domain.action.CommerceActionMetadata.Companion INSTANCE = new com.paypal.oslo.feature.searchandintelligence.domain.action.CommerceActionMetadata.Companion(null);
    private final java.lang.String id;
    private final java.lang.String type;

    @kotlinx.serialization.SerialName(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ACTION_TYPE)
    public static /* synthetic */ void getType$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/action/CommerceActionMetadata$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/action/CommerceActionMetadata;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.searchandintelligence.domain.action.CommerceActionMetadata> serializer() {
            return com.paypal.oslo.feature.searchandintelligence.domain.action.CommerceActionMetadata$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CommerceActionMetadata(int i, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.searchandintelligence.domain.action.CommerceActionMetadata$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        if ((i & 2) == 0) {
            this.type = null;
        } else {
            this.type = str2;
        }
    }

    public CommerceActionMetadata(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
        this.type = str2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$search_and_intelligence_prodRelease(com.paypal.oslo.feature.searchandintelligence.domain.action.CommerceActionMetadata self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.type != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.type);
        }
    }

    public /* synthetic */ CommerceActionMetadata(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.type;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CommerceActionMetadata(id=");
        sb.append(str);
        sb.append(", type=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        java.lang.String str = this.type;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.domain.action.CommerceActionMetadata)) {
            return false;
        }
        com.paypal.oslo.feature.searchandintelligence.domain.action.CommerceActionMetadata commerceActionMetadata = (com.paypal.oslo.feature.searchandintelligence.domain.action.CommerceActionMetadata) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, commerceActionMetadata.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, commerceActionMetadata.type);
    }

    public final com.paypal.oslo.feature.searchandintelligence.domain.action.CommerceActionMetadata copy(java.lang.String id, java.lang.String type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        return new com.paypal.oslo.feature.searchandintelligence.domain.action.CommerceActionMetadata(id, type);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.domain.action.CommerceActionMetadata copy$default(com.paypal.oslo.feature.searchandintelligence.domain.action.CommerceActionMetadata commerceActionMetadata, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = commerceActionMetadata.id;
        }
        if ((i & 2) != 0) {
            str2 = commerceActionMetadata.type;
        }
        return commerceActionMetadata.copy(str, str2);
    }
}
