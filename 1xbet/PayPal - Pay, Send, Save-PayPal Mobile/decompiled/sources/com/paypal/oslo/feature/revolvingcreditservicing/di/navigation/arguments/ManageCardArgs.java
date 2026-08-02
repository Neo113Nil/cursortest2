package com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bq\u0018\u0000 \u00062\u00020\u0001:\u0003\u0007\b\u0006R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\t\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ManageCardArgs;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCpi", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "Companion", "FromNavigation", "FromDeepLink", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ManageCardArgs$FromDeepLink;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ManageCardArgs$FromNavigation;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public interface ManageCardArgs {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs.Companion INSTANCE = com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs.Companion.Camera2StreamConfigurationMap;

    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCpi();

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ManageCardArgs$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ManageCardArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs.Companion Camera2StreamConfigurationMap = new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs.Companion();

        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs> serializer() {
            return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs.FromDeepLink.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs.FromNavigation.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs$FromDeepLink$$serializer.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs$FromNavigation$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ManageCardArgs$FromNavigation;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ManageCardArgs;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;", "manageCardDetail", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;)Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ManageCardArgs$FromNavigation;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ManageCardArgs$FromNavigation;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCpi", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;", "getManageCardDetail", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class FromNavigation implements com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs {
        private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetail;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs.FromNavigation.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs.FromNavigation.Companion(null);
        public static final int $stable = 8;
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs$FromNavigation$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer serializer;
                serializer = com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.INSTANCE.serializer();
                return serializer;
            }
        }), null};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ManageCardArgs$FromNavigation$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ManageCardArgs$FromNavigation;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes14.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs.FromNavigation> serializer() {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs$FromNavigation$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ FromNavigation(int i, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs$FromNavigation$$serializer.INSTANCE.getDescriptor());
            }
            this.cpi = creditProductIdentifier;
            this.manageCardDetail = manageCardDetails;
        }

        public FromNavigation(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardDetails, "");
            this.cpi = creditProductIdentifier;
            this.manageCardDetail = manageCardDetails;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$revolvingcredit_servicing_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs.FromNavigation self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            output.encodeSerializableElement(serialDesc, 0, $childSerializers[0].getValue(), self.getCpi());
            output.encodeSerializableElement(serialDesc, 1, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails$$serializer.INSTANCE, self.manageCardDetail);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs
        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCpi() {
            return this.cpi;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails getManageCardDetail() {
            return this.manageCardDetail;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.cpi;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails = this.manageCardDetail;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FromNavigation(cpi=");
            sb.append(creditProductIdentifier);
            sb.append(", manageCardDetail=");
            sb.append(manageCardDetails);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.cpi.hashCode() * 31) + this.manageCardDetail.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs.FromNavigation)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs.FromNavigation fromNavigation = (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs.FromNavigation) other;
            return this.cpi == fromNavigation.cpi && kotlin.jvm.internal.Intrinsics.areEqual(this.manageCardDetail, fromNavigation.manageCardDetail);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs.FromNavigation copy(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetail) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpi, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardDetail, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs.FromNavigation(cpi, manageCardDetail);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails getManageCardDetail() {
            return this.manageCardDetail;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCpi() {
            return this.cpi;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs.FromNavigation copy$default(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs.FromNavigation fromNavigation, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                creditProductIdentifier = fromNavigation.cpi;
            }
            if ((i & 2) != 0) {
                manageCardDetails = fromNavigation.manageCardDetail;
            }
            return fromNavigation.copy(creditProductIdentifier, manageCardDetails);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ManageCardArgs$FromDeepLink;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ManageCardArgs;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ManageCardArgs$FromDeepLink;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ManageCardArgs$FromDeepLink;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCpi", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class FromDeepLink implements com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs.FromDeepLink.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs.FromDeepLink.Companion(null);
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs$FromDeepLink$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer serializer;
                serializer = com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.INSTANCE.serializer();
                return serializer;
            }
        })};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ManageCardArgs$FromDeepLink$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ManageCardArgs$FromDeepLink;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes14.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs.FromDeepLink> serializer() {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs$FromDeepLink$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ FromDeepLink(int i, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs$FromDeepLink$$serializer.INSTANCE.getDescriptor());
            }
            this.cpi = creditProductIdentifier;
        }

        public FromDeepLink(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            this.cpi = creditProductIdentifier;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs
        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCpi() {
            return this.cpi;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.cpi;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FromDeepLink(cpi=");
            sb.append(creditProductIdentifier);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.cpi.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs.FromDeepLink) && this.cpi == ((com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs.FromDeepLink) other).cpi;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs.FromDeepLink copy(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpi, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs.FromDeepLink(cpi);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCpi() {
            return this.cpi;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs.FromDeepLink copy$default(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs.FromDeepLink fromDeepLink, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                creditProductIdentifier = fromDeepLink.cpi;
            }
            return fromDeepLink.copy(creditProductIdentifier);
        }
    }
}
