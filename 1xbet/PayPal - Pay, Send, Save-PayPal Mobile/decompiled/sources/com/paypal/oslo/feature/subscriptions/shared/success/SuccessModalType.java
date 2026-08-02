package com.paypal.oslo.feature.subscriptions.shared.success;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bw\u0018\u0000 \u00062\u00020\u0001:\u0003\u0007\b\u0006R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\t\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/success/SuccessModalType;", "", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "getAgreementType", "()Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "Companion", "AgreementUnlink", "AgreementCancel", "Lcom/paypal/oslo/feature/subscriptions/shared/success/SuccessModalType$AgreementCancel;", "Lcom/paypal/oslo/feature/subscriptions/shared/success/SuccessModalType$AgreementUnlink;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public interface SuccessModalType {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.Companion INSTANCE = com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.Companion.Camera2StreamConfigurationMap;

    com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getAgreementType();

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/success/SuccessModalType$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/subscriptions/shared/success/SuccessModalType;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.Companion Camera2StreamConfigurationMap = new com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.Companion();

        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType> serializer() {
            return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.AgreementCancel.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.AgreementUnlink.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType$AgreementCancel$$serializer.INSTANCE, com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType$AgreementUnlink$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000eJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/success/SuccessModalType$AgreementUnlink;", "Lcom/paypal/oslo/feature/subscriptions/shared/success/SuccessModalType;", "", "merchantName", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)Lcom/paypal/oslo/feature/subscriptions/shared/success/SuccessModalType$AgreementUnlink;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$subscriptions_prodRelease", "(Lcom/paypal/oslo/feature/subscriptions/shared/success/SuccessModalType$AgreementUnlink;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getMerchantName", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "getAgreementType", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class AgreementUnlink implements com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType {
        private final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType;
        private final java.lang.String merchantName;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.AgreementUnlink.Companion INSTANCE = new com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.AgreementUnlink.Companion(null);
        public static final int $stable = 8;
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType$AgreementUnlink$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.AgreementUnlink.m19969$r8$lambda$rxXa5DIV6dZBTc0vjgf8rYobck();
            }
        })};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/success/SuccessModalType$AgreementUnlink$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/subscriptions/shared/success/SuccessModalType$AgreementUnlink;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.AgreementUnlink> serializer() {
                return com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType$AgreementUnlink$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ AgreementUnlink(int i, java.lang.String str, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType$AgreementUnlink$$serializer.INSTANCE.getDescriptor());
            }
            this.merchantName = str;
            this.agreementType = agreementType;
        }

        public AgreementUnlink(java.lang.String str, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
            this.merchantName = str;
            this.agreementType = agreementType;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$subscriptions_prodRelease(com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.AgreementUnlink self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.merchantName);
            output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.getAgreementType());
        }

        public final java.lang.String getMerchantName() {
            return this.merchantName;
        }

        @Override // com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType
        public final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getAgreementType() {
            return this.agreementType;
        }

        /* renamed from: $r8$lambda$rxXa5DIV6dZBTc0vj-gf8rYobck, reason: not valid java name */
        public static /* synthetic */ kotlinx.serialization.KSerializer m19969$r8$lambda$rxXa5DIV6dZBTc0vjgf8rYobck() {
            return new kotlinx.serialization.PolymorphicSerializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.class), new java.lang.annotation.Annotation[0]);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.merchantName;
            com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType = this.agreementType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AgreementUnlink(merchantName=");
            sb.append(str);
            sb.append(", agreementType=");
            sb.append(agreementType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.merchantName.hashCode() * 31) + this.agreementType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.AgreementUnlink)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.AgreementUnlink agreementUnlink = (com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.AgreementUnlink) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.merchantName, agreementUnlink.merchantName) && kotlin.jvm.internal.Intrinsics.areEqual(this.agreementType, agreementUnlink.agreementType);
        }

        public final com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.AgreementUnlink copy(java.lang.String merchantName, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
            return new com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.AgreementUnlink(merchantName, agreementType);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getAgreementType() {
            return this.agreementType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMerchantName() {
            return this.merchantName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.AgreementUnlink copy$default(com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.AgreementUnlink agreementUnlink, java.lang.String str, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = agreementUnlink.merchantName;
            }
            if ((i & 2) != 0) {
                agreementType = agreementUnlink.agreementType;
            }
            return agreementUnlink.copy(str, agreementType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000eJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/success/SuccessModalType$AgreementCancel;", "Lcom/paypal/oslo/feature/subscriptions/shared/success/SuccessModalType;", "", "merchantName", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)Lcom/paypal/oslo/feature/subscriptions/shared/success/SuccessModalType$AgreementCancel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$subscriptions_prodRelease", "(Lcom/paypal/oslo/feature/subscriptions/shared/success/SuccessModalType$AgreementCancel;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getMerchantName", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "getAgreementType", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class AgreementCancel implements com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType {
        private final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType;
        private final java.lang.String merchantName;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.AgreementCancel.Companion INSTANCE = new com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.AgreementCancel.Companion(null);
        public static final int $stable = 8;
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType$AgreementCancel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.AgreementCancel.$r8$lambda$U_ALO0p9ZWBv2TKpQ8H0CA1utNI();
            }
        })};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/success/SuccessModalType$AgreementCancel$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/subscriptions/shared/success/SuccessModalType$AgreementCancel;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.AgreementCancel> serializer() {
                return com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType$AgreementCancel$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ AgreementCancel(int i, java.lang.String str, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType$AgreementCancel$$serializer.INSTANCE.getDescriptor());
            }
            this.merchantName = str;
            this.agreementType = agreementType;
        }

        public AgreementCancel(java.lang.String str, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
            this.merchantName = str;
            this.agreementType = agreementType;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$subscriptions_prodRelease(com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.AgreementCancel self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.merchantName);
            output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.getAgreementType());
        }

        public final java.lang.String getMerchantName() {
            return this.merchantName;
        }

        @Override // com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType
        public final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getAgreementType() {
            return this.agreementType;
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$U_ALO0p9ZWBv2TKpQ8H0CA1utNI() {
            return new kotlinx.serialization.PolymorphicSerializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.class), new java.lang.annotation.Annotation[0]);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.merchantName;
            com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType = this.agreementType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AgreementCancel(merchantName=");
            sb.append(str);
            sb.append(", agreementType=");
            sb.append(agreementType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.merchantName.hashCode() * 31) + this.agreementType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.AgreementCancel)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.AgreementCancel agreementCancel = (com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.AgreementCancel) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.merchantName, agreementCancel.merchantName) && kotlin.jvm.internal.Intrinsics.areEqual(this.agreementType, agreementCancel.agreementType);
        }

        public final com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.AgreementCancel copy(java.lang.String merchantName, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
            return new com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.AgreementCancel(merchantName, agreementType);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getAgreementType() {
            return this.agreementType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMerchantName() {
            return this.merchantName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.AgreementCancel copy$default(com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.AgreementCancel agreementCancel, java.lang.String str, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = agreementCancel.merchantName;
            }
            if ((i & 2) != 0) {
                agreementType = agreementCancel.agreementType;
            }
            return agreementCancel.copy(str, agreementType);
        }
    }
}
