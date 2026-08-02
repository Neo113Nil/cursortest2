package com.paypal.oslo.feature.identity.unifiedalert.domain.model;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertDestination;", "Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "alertData", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertSource;", "source", "<init>", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertSource;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertSource;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "component2", "()Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertSource;", "copy", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertSource;)Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_prodRelease", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "getAlertData", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertSource;", "getSource", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class UnifiedAlertDestination implements androidx.navigation3.runtime.NavKey {
    private final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert alertData;
    private final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource source;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertDestination.Companion INSTANCE = new com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertDestination.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertDestination$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource.INSTANCE.serializer();
            return serializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertDestination> serializer() {
            return com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ UnifiedAlertDestination(int i, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource unifiedAlertSource, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertDestination$$serializer.INSTANCE.getDescriptor());
        }
        this.alertData = unifiedAlert;
        this.source = unifiedAlertSource;
    }

    public UnifiedAlertDestination(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource unifiedAlertSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unifiedAlert, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unifiedAlertSource, "");
        this.alertData = unifiedAlert;
        this.source = unifiedAlertSource;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$identity_prodRelease(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertDestination self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert$$serializer.INSTANCE, self.alertData);
        output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.source);
    }

    public final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert getAlertData() {
        return this.alertData;
    }

    public final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource getSource() {
        return this.source;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert = this.alertData;
        com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource unifiedAlertSource = this.source;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UnifiedAlertDestination(alertData=");
        sb.append(unifiedAlert);
        sb.append(", source=");
        sb.append(unifiedAlertSource);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.alertData.hashCode() * 31) + this.source.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertDestination)) {
            return false;
        }
        com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertDestination unifiedAlertDestination = (com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertDestination) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.alertData, unifiedAlertDestination.alertData) && this.source == unifiedAlertDestination.source;
    }

    public final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertDestination copy(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert alertData, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alertData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        return new com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertDestination(alertData, source);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource getSource() {
        return this.source;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert getAlertData() {
        return this.alertData;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertDestination copy$default(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertDestination unifiedAlertDestination, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource unifiedAlertSource, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            unifiedAlert = unifiedAlertDestination.alertData;
        }
        if ((i & 2) != 0) {
            unifiedAlertSource = unifiedAlertDestination.source;
        }
        return unifiedAlertDestination.copy(unifiedAlert, unifiedAlertSource);
    }
}
