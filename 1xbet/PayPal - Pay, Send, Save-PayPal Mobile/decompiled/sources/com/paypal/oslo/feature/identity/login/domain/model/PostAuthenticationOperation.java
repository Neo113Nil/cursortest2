package com.paypal.oslo.feature.identity.login.domain.model;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0081\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b)\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/PostAuthenticationOperation;", "", "Lcom/paypal/oslo/feature/identity/login/domain/model/PostAuthOperationType;", "type", "", "mandatory", com.datadog.android.rum.internal.metric.SessionEndedMetric.VIEW_COUNTS_BG_KEY, "<init>", "(Lcom/paypal/oslo/feature/identity/login/domain/model/PostAuthOperationType;ZZ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/identity/login/domain/model/PostAuthOperationType;ZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/identity/login/domain/model/PostAuthOperationType;", "component2", "()Z", "component3", "copy", "(Lcom/paypal/oslo/feature/identity/login/domain/model/PostAuthOperationType;ZZ)Lcom/paypal/oslo/feature/identity/login/domain/model/PostAuthenticationOperation;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_prodRelease", "(Lcom/paypal/oslo/feature/identity/login/domain/model/PostAuthenticationOperation;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/identity/login/domain/model/PostAuthOperationType;", "getType", "Z", "getMandatory", "getBackground", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class PostAuthenticationOperation {
    public static final int $stable = 0;
    private final boolean background;
    private final boolean mandatory;
    private final com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation.Companion INSTANCE = new com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType", com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType.values());
            return createSimpleEnumSerializer;
        }
    }), null, null};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/PostAuthenticationOperation$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/login/domain/model/PostAuthenticationOperation;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> serializer() {
            return com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PostAuthenticationOperation(int i, com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType postAuthOperationType, boolean z, boolean z2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation$$serializer.INSTANCE.getDescriptor());
        }
        this.type = postAuthOperationType;
        this.mandatory = z;
        this.background = z2;
    }

    public PostAuthenticationOperation(com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType postAuthOperationType, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postAuthOperationType, "");
        this.type = postAuthOperationType;
        this.mandatory = z;
        this.background = z2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$identity_prodRelease(com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, $childSerializers[0].getValue(), self.type);
        output.encodeBooleanElement(serialDesc, 1, self.mandatory);
        output.encodeBooleanElement(serialDesc, 2, self.background);
    }

    public final com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType getType() {
        return this.type;
    }

    public final boolean getMandatory() {
        return this.mandatory;
    }

    public final boolean getBackground() {
        return this.background;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType postAuthOperationType = this.type;
        boolean z = this.mandatory;
        boolean z2 = this.background;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PostAuthenticationOperation(type=");
        sb.append(postAuthOperationType);
        sb.append(", mandatory=");
        sb.append(z);
        sb.append(", background=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.type.hashCode() * 31) + java.lang.Boolean.hashCode(this.mandatory)) * 31) + java.lang.Boolean.hashCode(this.background);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation)) {
            return false;
        }
        com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation postAuthenticationOperation = (com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation) other;
        return this.type == postAuthenticationOperation.type && this.mandatory == postAuthenticationOperation.mandatory && this.background == postAuthenticationOperation.background;
    }

    public final com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation copy(com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType type, boolean mandatory, boolean background) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation(type, mandatory, background);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getBackground() {
        return this.background;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getMandatory() {
        return this.mandatory;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType getType() {
        return this.type;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation copy$default(com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation postAuthenticationOperation, com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType postAuthOperationType, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            postAuthOperationType = postAuthenticationOperation.type;
        }
        if ((i & 2) != 0) {
            z = postAuthenticationOperation.mandatory;
        }
        if ((i & 4) != 0) {
            z2 = postAuthenticationOperation.background;
        }
        return postAuthenticationOperation.copy(postAuthOperationType, z, z2);
    }
}
