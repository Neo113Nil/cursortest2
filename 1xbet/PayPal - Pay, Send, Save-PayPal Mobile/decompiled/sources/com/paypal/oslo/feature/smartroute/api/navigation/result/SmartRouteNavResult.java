package com.paypal.oslo.feature.smartroute.api.navigation.result;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \u00112\u00020\u0001:\u0003\u0012\u0013\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/api/navigation/result/SmartRouteNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/feature/smartroute/api/navigation/result/SmartRouteNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "Updated", "Cancelled", "Lcom/paypal/oslo/feature/smartroute/api/navigation/result/SmartRouteNavResult$Cancelled;", "Lcom/paypal/oslo/feature/smartroute/api/navigation/result/SmartRouteNavResult$Updated;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class SmartRouteNavResult implements com.paypal.oslo.core.navigation.result.NavResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult.Companion INSTANCE = new com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult.m19671$r8$lambda$LXkEFgjtV1nDSZl6N_48Zh5_WE();
        }
    });

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self(com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/api/navigation/result/SmartRouteNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/smartroute/api/navigation/result/SmartRouteNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private SmartRouteNavResult() {
    }

    public /* synthetic */ SmartRouteNavResult(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
    }

    @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b \u0010\u0016J'\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0001¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b-\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/api/navigation/result/SmartRouteNavResult$Updated;", "Lcom/paypal/oslo/feature/smartroute/api/navigation/result/SmartRouteNavResult;", "Lcom/paypal/oslo/feature/smartroute/api/model/SmartRouteStatus;", "status", "", "savingsPercentage", "cryptoPercentage", "", "version", "<init>", "(Lcom/paypal/oslo/feature/smartroute/api/model/SmartRouteStatus;FFLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/smartroute/api/model/SmartRouteStatus;FFLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/smartroute/api/model/SmartRouteStatus;", "component2", "()F", "component3", "component4", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/smartroute/api/model/SmartRouteStatus;FFLjava/lang/String;)Lcom/paypal/oslo/feature/smartroute/api/navigation/result/SmartRouteNavResult$Updated;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$smart_route_api_prodRelease", "(Lcom/paypal/oslo/feature/smartroute/api/navigation/result/SmartRouteNavResult$Updated;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/smartroute/api/model/SmartRouteStatus;", "getStatus", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getSavingsPercentage", "getCryptoPercentage", "Ljava/lang/String;", "getVersion", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    @kotlinx.serialization.SerialName("updated")
    public static final /* data */ class Updated extends com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult {
        private final float cryptoPercentage;
        private final float savingsPercentage;
        private final com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus status;
        private final java.lang.String version;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult.Updated.Companion INSTANCE = new com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult.Updated.Companion(null);
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult$Updated$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer serializer;
                serializer = com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus.INSTANCE.serializer();
                return serializer;
            }
        }), null, null, null};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/api/navigation/result/SmartRouteNavResult$Updated$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/smartroute/api/navigation/result/SmartRouteNavResult$Updated;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult.Updated> serializer() {
                return com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult$Updated$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Updated(int i, com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus smartRouteStatus, float f, float f2, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (15 != (i & 15)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 15, com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult$Updated$$serializer.INSTANCE.getDescriptor());
            }
            this.status = smartRouteStatus;
            this.savingsPercentage = f;
            this.cryptoPercentage = f2;
            this.version = str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Updated(com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus smartRouteStatus, float f, float f2, java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smartRouteStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.status = smartRouteStatus;
            this.savingsPercentage = f;
            this.cryptoPercentage = f2;
            this.version = str;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$smart_route_api_prodRelease(com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult.Updated self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult.write$Self(self, output, serialDesc);
            output.encodeSerializableElement(serialDesc, 0, $childSerializers[0].getValue(), self.status);
            output.encodeFloatElement(serialDesc, 1, self.savingsPercentage);
            output.encodeFloatElement(serialDesc, 2, self.cryptoPercentage);
            output.encodeStringElement(serialDesc, 3, self.version);
        }

        public final com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus getStatus() {
            return this.status;
        }

        public final float getSavingsPercentage() {
            return this.savingsPercentage;
        }

        public final float getCryptoPercentage() {
            return this.cryptoPercentage;
        }

        public final java.lang.String getVersion() {
            return this.version;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus smartRouteStatus = this.status;
            float f = this.savingsPercentage;
            float f2 = this.cryptoPercentage;
            java.lang.String str = this.version;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Updated(status=");
            sb.append(smartRouteStatus);
            sb.append(", savingsPercentage=");
            sb.append(f);
            sb.append(", cryptoPercentage=");
            sb.append(f2);
            sb.append(", version=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.status.hashCode() * 31) + java.lang.Float.hashCode(this.savingsPercentage)) * 31) + java.lang.Float.hashCode(this.cryptoPercentage)) * 31) + this.version.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult.Updated)) {
                return false;
            }
            com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult.Updated updated = (com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult.Updated) other;
            return this.status == updated.status && java.lang.Float.compare(this.savingsPercentage, updated.savingsPercentage) == 0 && java.lang.Float.compare(this.cryptoPercentage, updated.cryptoPercentage) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.version, updated.version);
        }

        public final com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult.Updated copy(com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus status, float savingsPercentage, float cryptoPercentage, java.lang.String version) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
            return new com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult.Updated(status, savingsPercentage, cryptoPercentage, version);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getVersion() {
            return this.version;
        }

        /* renamed from: component3, reason: from getter */
        public final float getCryptoPercentage() {
            return this.cryptoPercentage;
        }

        /* renamed from: component2, reason: from getter */
        public final float getSavingsPercentage() {
            return this.savingsPercentage;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus getStatus() {
            return this.status;
        }

        public static /* synthetic */ com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult.Updated copy$default(com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult.Updated updated, com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus smartRouteStatus, float f, float f2, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                smartRouteStatus = updated.status;
            }
            if ((i & 2) != 0) {
                f = updated.savingsPercentage;
            }
            if ((i & 4) != 0) {
                f2 = updated.cryptoPercentage;
            }
            if ((i & 8) != 0) {
                str = updated.version;
            }
            return updated.copy(smartRouteStatus, f, f2, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/api/navigation/result/SmartRouteNavResult$Cancelled;", "Lcom/paypal/oslo/feature/smartroute/api/navigation/result/SmartRouteNavResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    @kotlinx.serialization.SerialName(com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.FlowOutcome.CANCELLED)
    /* loaded from: classes15.dex */
    public static final /* data */ class Cancelled extends com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult {
        public static final com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult.Cancelled INSTANCE = new com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult.Cancelled();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult$Cancelled$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult.Cancelled.$r8$lambda$KCIQy68Cx6HNrubJckufWaa3_vE();
            }
        });

        public final int hashCode() {
            return -1806948101;
        }

        private Cancelled() {
            super(null);
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$KCIQy68Cx6HNrubJckufWaa3_vE() {
            return new kotlinx.serialization.internal.ObjectSerializer(com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.FlowOutcome.CANCELLED, INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult.Cancelled> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "Cancelled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult.Cancelled)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: $r8$lambda$LXkEFgj-tV1nDSZl6N_48Zh5_WE, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m19671$r8$lambda$LXkEFgjtV1nDSZl6N_48Zh5_WE() {
        return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult.Cancelled.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult.Updated.class)}, new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.ObjectSerializer(com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.FlowOutcome.CANCELLED, com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult.Cancelled.INSTANCE, new java.lang.annotation.Annotation[0]), com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult$Updated$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
    }

    public /* synthetic */ SmartRouteNavResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
