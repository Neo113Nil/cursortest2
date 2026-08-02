package com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \u00152\u00020\u0001:\u0003\u0016\u0017\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0002\u0018\u0019"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/threeds/ThreeDsFlowArgs;", "", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/threeds/ThreeDsFlowArgs;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "getCardId", "()Ljava/lang/String;", "cardId", "Companion", "WithSupplementalData", "WithoutSupplementalData", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/threeds/ThreeDsFlowArgs$WithSupplementalData;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/threeds/ThreeDsFlowArgs$WithoutSupplementalData;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class ThreeDsFlowArgs {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs.$r8$lambda$lNz0650Xs9HZbgE7ar2tGXuufj4();
        }
    });

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self(com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }

    public abstract java.lang.String getCardId();

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/threeds/ThreeDsFlowArgs$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/threeds/ThreeDsFlowArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private ThreeDsFlowArgs() {
    }

    public /* synthetic */ ThreeDsFlowArgs(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\f\u0010\rBq\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJf\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0014J'\u0010-\u001a\u00020,2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0001¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b3\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b4\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b5\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b6\u0010\u0014R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/threeds/ThreeDsFlowArgs$WithSupplementalData;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/threeds/ThreeDsFlowArgs;", "", "cardId", "externalReferenceId", "authenticationRequestPayload", "acsUrl", "cardNetworkName", "cardNetworkUrl", "version", "", "allowedAuthenticationMethods", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/threeds/ThreeDsFlowArgs$WithSupplementalData;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/threeds/ThreeDsFlowArgs$WithSupplementalData;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getCardId", "getExternalReferenceId", "getAuthenticationRequestPayload", "getAcsUrl", "getCardNetworkName", "getCardNetworkUrl", "getVersion", "Ljava/util/List;", "getAllowedAuthenticationMethods", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class WithSupplementalData extends com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs {
        private final java.lang.String acsUrl;
        private final java.util.List<java.lang.String> allowedAuthenticationMethods;
        private final java.lang.String authenticationRequestPayload;
        private final java.lang.String cardId;
        private final java.lang.String cardNetworkName;
        private final java.lang.String cardNetworkUrl;
        private final java.lang.String externalReferenceId;
        private final java.lang.String version;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs.WithSupplementalData.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs.WithSupplementalData.Companion(null);
        public static final int $stable = 8;
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, null, null, null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs$WithSupplementalData$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs.WithSupplementalData.$r8$lambda$Tjpp6q3vJORn6LuLRugmMAQTxN4();
            }
        })};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/threeds/ThreeDsFlowArgs$WithSupplementalData$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/threeds/ThreeDsFlowArgs$WithSupplementalData;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs.WithSupplementalData> serializer() {
                return com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs$WithSupplementalData$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ WithSupplementalData(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (255 != (i & 255)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 255, com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs$WithSupplementalData$$serializer.INSTANCE.getDescriptor());
            }
            this.cardId = str;
            this.externalReferenceId = str2;
            this.authenticationRequestPayload = str3;
            this.acsUrl = str4;
            this.cardNetworkName = str5;
            this.cardNetworkUrl = str6;
            this.version = str7;
            this.allowedAuthenticationMethods = list;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithSupplementalData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.util.List<java.lang.String> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.cardId = str;
            this.externalReferenceId = str2;
            this.authenticationRequestPayload = str3;
            this.acsUrl = str4;
            this.cardNetworkName = str5;
            this.cardNetworkUrl = str6;
            this.version = str7;
            this.allowedAuthenticationMethods = list;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$wallet_api_prodRelease(com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs.WithSupplementalData self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs.write$Self(self, output, serialDesc);
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.getCardId());
            output.encodeStringElement(serialDesc, 1, self.externalReferenceId);
            output.encodeStringElement(serialDesc, 2, self.authenticationRequestPayload);
            output.encodeStringElement(serialDesc, 3, self.acsUrl);
            output.encodeStringElement(serialDesc, 4, self.cardNetworkName);
            output.encodeStringElement(serialDesc, 5, self.cardNetworkUrl);
            output.encodeStringElement(serialDesc, 6, self.version);
            output.encodeSerializableElement(serialDesc, 7, lazyArr[7].getValue(), self.allowedAuthenticationMethods);
        }

        @Override // com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs
        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public final java.lang.String getExternalReferenceId() {
            return this.externalReferenceId;
        }

        public final java.lang.String getAuthenticationRequestPayload() {
            return this.authenticationRequestPayload;
        }

        public final java.lang.String getAcsUrl() {
            return this.acsUrl;
        }

        public final java.lang.String getCardNetworkName() {
            return this.cardNetworkName;
        }

        public final java.lang.String getCardNetworkUrl() {
            return this.cardNetworkUrl;
        }

        public final java.lang.String getVersion() {
            return this.version;
        }

        public final java.util.List<java.lang.String> getAllowedAuthenticationMethods() {
            return this.allowedAuthenticationMethods;
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$Tjpp6q3vJORn6LuLRugmMAQTxN4() {
            return new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cardId;
            java.lang.String str2 = this.externalReferenceId;
            java.lang.String str3 = this.authenticationRequestPayload;
            java.lang.String str4 = this.acsUrl;
            java.lang.String str5 = this.cardNetworkName;
            java.lang.String str6 = this.cardNetworkUrl;
            java.lang.String str7 = this.version;
            java.util.List<java.lang.String> list = this.allowedAuthenticationMethods;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WithSupplementalData(cardId=");
            sb.append(str);
            sb.append(", externalReferenceId=");
            sb.append(str2);
            sb.append(", authenticationRequestPayload=");
            sb.append(str3);
            sb.append(", acsUrl=");
            sb.append(str4);
            sb.append(", cardNetworkName=");
            sb.append(str5);
            sb.append(", cardNetworkUrl=");
            sb.append(str6);
            sb.append(", version=");
            sb.append(str7);
            sb.append(", allowedAuthenticationMethods=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((((((this.cardId.hashCode() * 31) + this.externalReferenceId.hashCode()) * 31) + this.authenticationRequestPayload.hashCode()) * 31) + this.acsUrl.hashCode()) * 31) + this.cardNetworkName.hashCode()) * 31) + this.cardNetworkUrl.hashCode()) * 31) + this.version.hashCode()) * 31) + this.allowedAuthenticationMethods.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs.WithSupplementalData)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs.WithSupplementalData withSupplementalData = (com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs.WithSupplementalData) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, withSupplementalData.cardId) && kotlin.jvm.internal.Intrinsics.areEqual(this.externalReferenceId, withSupplementalData.externalReferenceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticationRequestPayload, withSupplementalData.authenticationRequestPayload) && kotlin.jvm.internal.Intrinsics.areEqual(this.acsUrl, withSupplementalData.acsUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardNetworkName, withSupplementalData.cardNetworkName) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardNetworkUrl, withSupplementalData.cardNetworkUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.version, withSupplementalData.version) && kotlin.jvm.internal.Intrinsics.areEqual(this.allowedAuthenticationMethods, withSupplementalData.allowedAuthenticationMethods);
        }

        public final com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs.WithSupplementalData copy(java.lang.String cardId, java.lang.String externalReferenceId, java.lang.String authenticationRequestPayload, java.lang.String acsUrl, java.lang.String cardNetworkName, java.lang.String cardNetworkUrl, java.lang.String version, java.util.List<java.lang.String> allowedAuthenticationMethods) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalReferenceId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationRequestPayload, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acsUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardNetworkName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardNetworkUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allowedAuthenticationMethods, "");
            return new com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs.WithSupplementalData(cardId, externalReferenceId, authenticationRequestPayload, acsUrl, cardNetworkName, cardNetworkUrl, version, allowedAuthenticationMethods);
        }

        public final java.util.List<java.lang.String> component8() {
            return this.allowedAuthenticationMethods;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getVersion() {
            return this.version;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getCardNetworkUrl() {
            return this.cardNetworkUrl;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getCardNetworkName() {
            return this.cardNetworkName;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getAcsUrl() {
            return this.acsUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getAuthenticationRequestPayload() {
            return this.authenticationRequestPayload;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getExternalReferenceId() {
            return this.externalReferenceId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCardId() {
            return this.cardId;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rJ'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/threeds/ThreeDsFlowArgs$WithoutSupplementalData;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/threeds/ThreeDsFlowArgs;", "", "cardId", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/threeds/ThreeDsFlowArgs$WithoutSupplementalData;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/threeds/ThreeDsFlowArgs$WithoutSupplementalData;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getCardId", "getCvv", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class WithoutSupplementalData extends com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs.WithoutSupplementalData.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs.WithoutSupplementalData.Companion(null);
        private final java.lang.String cardId;
        private final java.lang.String cvv;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/threeds/ThreeDsFlowArgs$WithoutSupplementalData$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/threeds/ThreeDsFlowArgs$WithoutSupplementalData;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs.WithoutSupplementalData> serializer() {
                return com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs$WithoutSupplementalData$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ WithoutSupplementalData(int i, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (3 != (i & 3)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs$WithoutSupplementalData$$serializer.INSTANCE.getDescriptor());
            }
            this.cardId = str;
            this.cvv = str2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithoutSupplementalData(java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.cardId = str;
            this.cvv = str2;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$wallet_api_prodRelease(com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs.WithoutSupplementalData self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs.write$Self(self, output, serialDesc);
            output.encodeStringElement(serialDesc, 0, self.getCardId());
            output.encodeStringElement(serialDesc, 1, self.cvv);
        }

        @Override // com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs
        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public final java.lang.String getCvv() {
            return this.cvv;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cardId;
            java.lang.String str2 = this.cvv;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WithoutSupplementalData(cardId=");
            sb.append(str);
            sb.append(", cvv=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.cardId.hashCode() * 31) + this.cvv.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs.WithoutSupplementalData)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs.WithoutSupplementalData withoutSupplementalData = (com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs.WithoutSupplementalData) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, withoutSupplementalData.cardId) && kotlin.jvm.internal.Intrinsics.areEqual(this.cvv, withoutSupplementalData.cvv);
        }

        public final com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs.WithoutSupplementalData copy(java.lang.String cardId, java.lang.String cvv) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cvv, "");
            return new com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs.WithoutSupplementalData(cardId, cvv);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCvv() {
            return this.cvv;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs.WithoutSupplementalData copy$default(com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs.WithoutSupplementalData withoutSupplementalData, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = withoutSupplementalData.cardId;
            }
            if ((i & 2) != 0) {
                str2 = withoutSupplementalData.cvv;
            }
            return withoutSupplementalData.copy(str, str2);
        }
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$lNz0650Xs9HZbgE7ar2tGXuufj4() {
        return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs.WithSupplementalData.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs.WithoutSupplementalData.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs$WithSupplementalData$$serializer.INSTANCE, com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs$WithoutSupplementalData$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
    }

    public /* synthetic */ ThreeDsFlowArgs(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
