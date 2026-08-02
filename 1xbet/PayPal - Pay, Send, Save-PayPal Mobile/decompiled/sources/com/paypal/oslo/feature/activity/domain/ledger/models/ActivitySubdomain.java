package com.paypal.oslo.feature.activity.domain.ledger.models;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\u0007\u0010\bB/\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000fR\"\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivitySubdomain;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/ActivitySubdomainType;", "Lcom/paypal/oslo/feature/activity/graphql/type/ActivitySubdomainType;", "type", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ActivitySubdomainType;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ActivitySubdomainType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/ActivitySubdomainType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ActivitySubdomainType;)Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivitySubdomain;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivitySubdomain;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/ActivitySubdomainType;", "getType", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class ActivitySubdomain {
    public static final int $stable = 0;
    private final java.lang.String id;
    private final com.paypal.oslo.api.graphql.schema.type.ActivitySubdomainType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain.Companion INSTANCE = new com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.api.graphql.schema.type.ActivitySubdomainType", com.paypal.oslo.api.graphql.schema.type.ActivitySubdomainType.values());
            return createSimpleEnumSerializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivitySubdomain$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivitySubdomain;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain> serializer() {
            return com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ActivitySubdomain(int i, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.ActivitySubdomainType activitySubdomainType, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.type = null;
        } else {
            this.type = activitySubdomainType;
        }
    }

    public ActivitySubdomain(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.ActivitySubdomainType activitySubdomainType) {
        this.id = str;
        this.type = activitySubdomainType;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$activity_prodRelease(com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.id != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.type != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.type);
        }
    }

    public /* synthetic */ ActivitySubdomain(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.ActivitySubdomainType activitySubdomainType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : activitySubdomainType);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ActivitySubdomainType getType() {
        return this.type;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.api.graphql.schema.type.ActivitySubdomainType activitySubdomainType = this.type;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivitySubdomain(id=");
        sb.append(str);
        sb.append(", type=");
        sb.append(activitySubdomainType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.id;
        int hashCode = str == null ? 0 : str.hashCode();
        com.paypal.oslo.api.graphql.schema.type.ActivitySubdomainType activitySubdomainType = this.type;
        return (hashCode * 31) + (activitySubdomainType != null ? activitySubdomainType.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain)) {
            return false;
        }
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain activitySubdomain = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, activitySubdomain.id) && this.type == activitySubdomain.type;
    }

    public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.ActivitySubdomainType type) {
        return new com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain(id, type);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ActivitySubdomainType getType() {
        return this.type;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain copy$default(com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain activitySubdomain, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.ActivitySubdomainType activitySubdomainType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = activitySubdomain.id;
        }
        if ((i & 2) != 0) {
            activitySubdomainType = activitySubdomain.type;
        }
        return activitySubdomain.copy(str, activitySubdomainType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActivitySubdomain() {
        this((java.lang.String) null, (com.paypal.oslo.api.graphql.schema.type.ActivitySubdomainType) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
    }
}
