package com.paypal.oslo.feature.savings.domain.model.savingshub.parser;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rJ'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\rR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/DocumentZoneSection;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/SavingsHubComponent;", "", "type", "", "rank", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/DocumentZoneSection;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$savings_prodRelease", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/DocumentZoneSection;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getType", "getType$annotations", "()V", "Ljava/lang/Integer;", "getRank", "getRank$annotations", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class DocumentZoneSection implements com.paypal.oslo.feature.savings.domain.model.savingshub.parser.SavingsHubComponent {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.parser.DocumentZoneSection.Companion INSTANCE = new com.paypal.oslo.feature.savings.domain.model.savingshub.parser.DocumentZoneSection.Companion(null);
    private final java.lang.Integer rank;
    private final java.lang.String type;

    @kotlinx.serialization.SerialName("rank")
    public static /* synthetic */ void getRank$annotations() {
    }

    @kotlinx.serialization.SerialName("type")
    public static /* synthetic */ void getType$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/DocumentZoneSection$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/DocumentZoneSection;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.savings.domain.model.savingshub.parser.DocumentZoneSection> serializer() {
            return com.paypal.oslo.feature.savings.domain.model.savingshub.parser.DocumentZoneSection$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DocumentZoneSection(int i, java.lang.String str, java.lang.Integer num, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.type = null;
        } else {
            this.type = str;
        }
        if ((i & 2) == 0) {
            this.rank = null;
        } else {
            this.rank = num;
        }
    }

    public DocumentZoneSection(java.lang.String str, java.lang.Integer num) {
        this.type = str;
        this.rank = num;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$savings_prodRelease(com.paypal.oslo.feature.savings.domain.model.savingshub.parser.DocumentZoneSection self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.type != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.type);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.rank != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.IntSerializer.INSTANCE, self.rank);
        }
    }

    public /* synthetic */ DocumentZoneSection(java.lang.String str, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num);
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final java.lang.Integer getRank() {
        return this.rank;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.type;
        java.lang.Integer num = this.rank;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DocumentZoneSection(type=");
        sb.append(str);
        sb.append(", rank=");
        sb.append(num);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.type;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.Integer num = this.rank;
        return (hashCode * 31) + (num != null ? num.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.savings.domain.model.savingshub.parser.DocumentZoneSection)) {
            return false;
        }
        com.paypal.oslo.feature.savings.domain.model.savingshub.parser.DocumentZoneSection documentZoneSection = (com.paypal.oslo.feature.savings.domain.model.savingshub.parser.DocumentZoneSection) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.type, documentZoneSection.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.rank, documentZoneSection.rank);
    }

    public final com.paypal.oslo.feature.savings.domain.model.savingshub.parser.DocumentZoneSection copy(java.lang.String type, java.lang.Integer rank) {
        return new com.paypal.oslo.feature.savings.domain.model.savingshub.parser.DocumentZoneSection(type, rank);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Integer getRank() {
        return this.rank;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    public static /* synthetic */ com.paypal.oslo.feature.savings.domain.model.savingshub.parser.DocumentZoneSection copy$default(com.paypal.oslo.feature.savings.domain.model.savingshub.parser.DocumentZoneSection documentZoneSection, java.lang.String str, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = documentZoneSection.type;
        }
        if ((i & 2) != 0) {
            num = documentZoneSection.rank;
        }
        return documentZoneSection.copy(str, num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DocumentZoneSection() {
        this((java.lang.String) null, (java.lang.Integer) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
    }
}
