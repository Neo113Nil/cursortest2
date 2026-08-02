package com.paypal.oslo.feature.oneonboarding.api.domain;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \u00172\u00020\u0001:\b\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u0017B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0001\u0007\u001f !\"#$%"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "seen0", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentConstants.SECTION_CRYPTO, "AccountCreation", "AccountCreationSignupWithGoogle", "CryptoPro", "BankingBundle", com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentConstants.SECTION_SAVINGS, "AddFunds", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$AccountCreation;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$AccountCreationSignupWithGoogle;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$AddFunds;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$BankingBundle;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$Crypto;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$CryptoPro;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$Savings;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class IntentId {
    private final java.lang.String value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Companion INSTANCE = new com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.api.domain.IntentId$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.m16644$r8$lambda$FkqF1dFcLM1TRGgcTLOgntMYWM();
        }
    });

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.oneonboarding.api.domain.IntentId> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ IntentId(int i, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        this.value = str;
    }

    private IntentId(java.lang.String str) {
        this.value = str;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.value);
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$Crypto;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/JourneyContext;", "journeyContext", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/JourneyContext;)V", "", "seen0", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/api/domain/JourneyContext;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/oneonboarding/api/domain/JourneyContext;", "copy", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/JourneyContext;)Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$Crypto;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$one_onboarding_api_prodRelease", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$Crypto;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/JourneyContext;", "getJourneyContext", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Crypto extends com.paypal.oslo.feature.oneonboarding.api.domain.IntentId {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Crypto.Companion INSTANCE = new com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Crypto.Companion(null);
        private final com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$Crypto$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$Crypto;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes13.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Crypto> serializer() {
                return com.paypal.oslo.feature.oneonboarding.api.domain.IntentId$Crypto$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Crypto(int i, java.lang.String str, com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, str, serializationConstructorMarker);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId$Crypto$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 2) == 0) {
                this.journeyContext = null;
            } else {
                this.journeyContext = journeyContext;
            }
        }

        public Crypto(com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext) {
            super(com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO, null);
            this.journeyContext = journeyContext;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$one_onboarding_api_prodRelease(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Crypto self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.write$Self(self, output, serialDesc);
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.journeyContext != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext$$serializer.INSTANCE, self.journeyContext);
            }
        }

        public /* synthetic */ Crypto(com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : journeyContext);
        }

        public final com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext getJourneyContext() {
            return this.journeyContext;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext = this.journeyContext;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Crypto(journeyContext=");
            sb.append(journeyContext);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext = this.journeyContext;
            if (journeyContext == null) {
                return 0;
            }
            return journeyContext.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Crypto) && kotlin.jvm.internal.Intrinsics.areEqual(this.journeyContext, ((com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Crypto) other).journeyContext);
        }

        public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Crypto copy(com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext) {
            return new com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Crypto(journeyContext);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext getJourneyContext() {
            return this.journeyContext;
        }

        public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Crypto copy$default(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Crypto crypto, com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                journeyContext = crypto.journeyContext;
            }
            return crypto.copy(journeyContext);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Crypto() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\n\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b&\u0010\u0014J'\u0010-\u001a\u00020,2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0001¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b1\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010\u0019R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$AccountCreation;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "Lcom/paypal/oslo/feature/oneonboarding/api/domain/Email;", "email", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/Phone;", "phone", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/AccountCreationEntryPoint;", "entryPoint", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/api/domain/Phone;Lcom/paypal/oslo/feature/oneonboarding/api/domain/AccountCreationEntryPoint;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/api/domain/Phone;Lcom/paypal/oslo/feature/oneonboarding/api/domain/AccountCreationEntryPoint;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-ALGuh4w", "()Ljava/lang/String;", "component1", "component2-poA_XDo", "component2", "component3", "()Lcom/paypal/oslo/feature/oneonboarding/api/domain/Phone;", "component4", "()Lcom/paypal/oslo/feature/oneonboarding/api/domain/AccountCreationEntryPoint;", "copy-HzXUjCc", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/api/domain/Phone;Lcom/paypal/oslo/feature/oneonboarding/api/domain/AccountCreationEntryPoint;)Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$AccountCreation;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$one_onboarding_api_prodRelease", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$AccountCreation;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getCountry-ALGuh4w", "getEmail-poA_XDo", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/Phone;", "getPhone", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/AccountCreationEntryPoint;", "getEntryPoint", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class AccountCreation extends com.paypal.oslo.feature.oneonboarding.api.domain.IntentId {
        private final java.lang.String country;
        private final java.lang.String email;
        private final com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint entryPoint;
        private final com.paypal.oslo.feature.oneonboarding.api.domain.Phone phone;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreation.Companion INSTANCE = new com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreation.Companion(null);
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.api.domain.IntentId$AccountCreation$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer serializer;
                serializer = com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint.INSTANCE.serializer();
                return serializer;
            }
        })};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$AccountCreation$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$AccountCreation;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes13.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreation> serializer() {
                return com.paypal.oslo.feature.oneonboarding.api.domain.IntentId$AccountCreation$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private /* synthetic */ AccountCreation(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.oneonboarding.api.domain.Phone phone, com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint accountCreationEntryPoint, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, str, serializationConstructorMarker);
            if (15 != (i & 15)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 15, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId$AccountCreation$$serializer.INSTANCE.getDescriptor());
            }
            this.country = str2;
            this.email = str3;
            this.phone = phone;
            if ((i & 16) == 0) {
                this.entryPoint = com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint.Organic;
            } else {
                this.entryPoint = accountCreationEntryPoint;
            }
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$one_onboarding_api_prodRelease(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreation self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.write$Self(self, output, serialDesc);
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            output.encodeSerializableElement(serialDesc, 1, com.paypal.oslo.core.i18n.domain.model.CountryCode$$serializer.INSTANCE, com.paypal.oslo.core.i18n.domain.model.CountryCode.m11363boximpl(self.country));
            output.encodeSerializableElement(serialDesc, 2, com.paypal.oslo.feature.oneonboarding.api.domain.Email$$serializer.INSTANCE, com.paypal.oslo.feature.oneonboarding.api.domain.Email.m16626boximpl(self.email));
            output.encodeNullableSerializableElement(serialDesc, 3, com.paypal.oslo.feature.oneonboarding.api.domain.Phone$$serializer.INSTANCE, self.phone);
            if (output.shouldEncodeElementDefault(serialDesc, 4) || self.entryPoint != com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint.Organic) {
                output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.entryPoint);
            }
        }

        /* renamed from: getCountry-ALGuh4w, reason: not valid java name */
        public final java.lang.String m16649getCountryALGuh4w() {
            return this.country;
        }

        /* renamed from: getEmail-poA_XDo, reason: not valid java name */
        public final java.lang.String m16650getEmailpoA_XDo() {
            return this.email;
        }

        public final com.paypal.oslo.feature.oneonboarding.api.domain.Phone getPhone() {
            return this.phone;
        }

        public /* synthetic */ AccountCreation(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.oneonboarding.api.domain.Phone phone, com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint accountCreationEntryPoint, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, phone, (i & 8) != 0 ? com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint.Organic : accountCreationEntryPoint, null);
        }

        public final com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private AccountCreation(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.oneonboarding.api.domain.Phone phone, com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint accountCreationEntryPoint) {
            super("ACCOUNT_CREATION".concat(java.lang.String.valueOf(accountCreationEntryPoint.getIntentSuffix())), null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountCreationEntryPoint, "");
            this.country = str;
            this.email = str2;
            this.phone = phone;
            this.entryPoint = accountCreationEntryPoint;
        }

        public final java.lang.String toString() {
            java.lang.String m11368toStringimpl = com.paypal.oslo.core.i18n.domain.model.CountryCode.m11368toStringimpl(this.country);
            java.lang.String m16631toStringimpl = com.paypal.oslo.feature.oneonboarding.api.domain.Email.m16631toStringimpl(this.email);
            com.paypal.oslo.feature.oneonboarding.api.domain.Phone phone = this.phone;
            com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint accountCreationEntryPoint = this.entryPoint;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AccountCreation(country=");
            sb.append(m11368toStringimpl);
            sb.append(", email=");
            sb.append(m16631toStringimpl);
            sb.append(", phone=");
            sb.append(phone);
            sb.append(", entryPoint=");
            sb.append(accountCreationEntryPoint);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int m11367hashCodeimpl = com.paypal.oslo.core.i18n.domain.model.CountryCode.m11367hashCodeimpl(this.country);
            int m16630hashCodeimpl = com.paypal.oslo.feature.oneonboarding.api.domain.Email.m16630hashCodeimpl(this.email);
            com.paypal.oslo.feature.oneonboarding.api.domain.Phone phone = this.phone;
            return (((((m11367hashCodeimpl * 31) + m16630hashCodeimpl) * 31) + (phone == null ? 0 : phone.hashCode())) * 31) + this.entryPoint.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreation)) {
                return false;
            }
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreation accountCreation = (com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreation) other;
            return com.paypal.oslo.core.i18n.domain.model.CountryCode.m11366equalsimpl0(this.country, accountCreation.country) && com.paypal.oslo.feature.oneonboarding.api.domain.Email.m16629equalsimpl0(this.email, accountCreation.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.phone, accountCreation.phone) && this.entryPoint == accountCreation.entryPoint;
        }

        /* renamed from: copy-HzXUjCc, reason: not valid java name */
        public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreation m16648copyHzXUjCc(java.lang.String country, java.lang.String email, com.paypal.oslo.feature.oneonboarding.api.domain.Phone phone, com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint entryPoint) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryPoint, "");
            return new com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreation(country, email, phone, entryPoint, null);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.api.domain.Phone getPhone() {
            return this.phone;
        }

        /* renamed from: component2-poA_XDo, reason: not valid java name and from getter */
        public final java.lang.String getEmail() {
            return this.email;
        }

        /* renamed from: component1-ALGuh4w, reason: not valid java name and from getter */
        public final java.lang.String getCountry() {
            return this.country;
        }

        /* renamed from: copy-HzXUjCc$default, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreation m16645copyHzXUjCc$default(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreation accountCreation, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.oneonboarding.api.domain.Phone phone, com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint accountCreationEntryPoint, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = accountCreation.country;
            }
            if ((i & 2) != 0) {
                str2 = accountCreation.email;
            }
            if ((i & 4) != 0) {
                phone = accountCreation.phone;
            }
            if ((i & 8) != 0) {
                accountCreationEntryPoint = accountCreation.entryPoint;
            }
            return accountCreation.m16648copyHzXUjCc(str, str2, phone, accountCreationEntryPoint);
        }

        public /* synthetic */ AccountCreation(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.oneonboarding.api.domain.Phone phone, com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint accountCreationEntryPoint, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, phone, accountCreationEntryPoint);
        }

        public /* synthetic */ AccountCreation(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.oneonboarding.api.domain.Phone phone, com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint accountCreationEntryPoint, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, str2, str3, phone, accountCreationEntryPoint, serializationConstructorMarker);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\b\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\"\u0010\u0012J'\u0010)\u001a\u00020(2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0001¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b-\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$AccountCreationSignupWithGoogle;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "Lcom/paypal/oslo/feature/oneonboarding/api/domain/GoogleToken;", "googleToken", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/AccountCreationEntryPoint;", "entryPoint", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/api/domain/AccountCreationEntryPoint;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/api/domain/AccountCreationEntryPoint;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-ALGuh4w", "()Ljava/lang/String;", "component1", "component2-xfBUY5w", "component2", "component3", "()Lcom/paypal/oslo/feature/oneonboarding/api/domain/AccountCreationEntryPoint;", "copy-TiRZOh0", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/api/domain/AccountCreationEntryPoint;)Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$AccountCreationSignupWithGoogle;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$one_onboarding_api_prodRelease", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$AccountCreationSignupWithGoogle;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getCountry-ALGuh4w", "getGoogleToken-xfBUY5w", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/AccountCreationEntryPoint;", "getEntryPoint", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class AccountCreationSignupWithGoogle extends com.paypal.oslo.feature.oneonboarding.api.domain.IntentId {
        private final java.lang.String country;
        private final com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint entryPoint;
        private final java.lang.String googleToken;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreationSignupWithGoogle.Companion INSTANCE = new com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreationSignupWithGoogle.Companion(null);
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.api.domain.IntentId$AccountCreationSignupWithGoogle$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer serializer;
                serializer = com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint.INSTANCE.serializer();
                return serializer;
            }
        })};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$AccountCreationSignupWithGoogle$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$AccountCreationSignupWithGoogle;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes13.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreationSignupWithGoogle> serializer() {
                return com.paypal.oslo.feature.oneonboarding.api.domain.IntentId$AccountCreationSignupWithGoogle$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private /* synthetic */ AccountCreationSignupWithGoogle(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint accountCreationEntryPoint, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, str, serializationConstructorMarker);
            if (7 != (i & 7)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId$AccountCreationSignupWithGoogle$$serializer.INSTANCE.getDescriptor());
            }
            this.country = str2;
            this.googleToken = str3;
            if ((i & 8) == 0) {
                this.entryPoint = com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint.Organic;
            } else {
                this.entryPoint = accountCreationEntryPoint;
            }
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$one_onboarding_api_prodRelease(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreationSignupWithGoogle self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.write$Self(self, output, serialDesc);
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            output.encodeSerializableElement(serialDesc, 1, com.paypal.oslo.core.i18n.domain.model.CountryCode$$serializer.INSTANCE, com.paypal.oslo.core.i18n.domain.model.CountryCode.m11363boximpl(self.country));
            output.encodeSerializableElement(serialDesc, 2, com.paypal.oslo.feature.oneonboarding.api.domain.GoogleToken$$serializer.INSTANCE, com.paypal.oslo.feature.oneonboarding.api.domain.GoogleToken.m16635boximpl(self.googleToken));
            if (output.shouldEncodeElementDefault(serialDesc, 3) || self.entryPoint != com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint.Organic) {
                output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.entryPoint);
            }
        }

        /* renamed from: getCountry-ALGuh4w, reason: not valid java name */
        public final java.lang.String m16655getCountryALGuh4w() {
            return this.country;
        }

        /* renamed from: getGoogleToken-xfBUY5w, reason: not valid java name */
        public final java.lang.String m16656getGoogleTokenxfBUY5w() {
            return this.googleToken;
        }

        public /* synthetic */ AccountCreationSignupWithGoogle(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint accountCreationEntryPoint, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint.Organic : accountCreationEntryPoint, null);
        }

        public final com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private AccountCreationSignupWithGoogle(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint accountCreationEntryPoint) {
            super(r1.toString(), null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountCreationEntryPoint, "");
            java.lang.String intentSuffix = accountCreationEntryPoint.getIntentSuffix();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ACCOUNT_CREATION");
            sb.append(intentSuffix);
            sb.append("_SIGNUP_WITH_GOOGLE");
            this.country = str;
            this.googleToken = str2;
            this.entryPoint = accountCreationEntryPoint;
        }

        public final java.lang.String toString() {
            java.lang.String m11368toStringimpl = com.paypal.oslo.core.i18n.domain.model.CountryCode.m11368toStringimpl(this.country);
            java.lang.String m16640toStringimpl = com.paypal.oslo.feature.oneonboarding.api.domain.GoogleToken.m16640toStringimpl(this.googleToken);
            com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint accountCreationEntryPoint = this.entryPoint;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AccountCreationSignupWithGoogle(country=");
            sb.append(m11368toStringimpl);
            sb.append(", googleToken=");
            sb.append(m16640toStringimpl);
            sb.append(", entryPoint=");
            sb.append(accountCreationEntryPoint);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((com.paypal.oslo.core.i18n.domain.model.CountryCode.m11367hashCodeimpl(this.country) * 31) + com.paypal.oslo.feature.oneonboarding.api.domain.GoogleToken.m16639hashCodeimpl(this.googleToken)) * 31) + this.entryPoint.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreationSignupWithGoogle)) {
                return false;
            }
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreationSignupWithGoogle accountCreationSignupWithGoogle = (com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreationSignupWithGoogle) other;
            return com.paypal.oslo.core.i18n.domain.model.CountryCode.m11366equalsimpl0(this.country, accountCreationSignupWithGoogle.country) && com.paypal.oslo.feature.oneonboarding.api.domain.GoogleToken.m16638equalsimpl0(this.googleToken, accountCreationSignupWithGoogle.googleToken) && this.entryPoint == accountCreationSignupWithGoogle.entryPoint;
        }

        /* renamed from: copy-TiRZOh0, reason: not valid java name */
        public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreationSignupWithGoogle m16654copyTiRZOh0(java.lang.String country, java.lang.String googleToken, com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint entryPoint) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleToken, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryPoint, "");
            return new com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreationSignupWithGoogle(country, googleToken, entryPoint, null);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        /* renamed from: component2-xfBUY5w, reason: not valid java name and from getter */
        public final java.lang.String getGoogleToken() {
            return this.googleToken;
        }

        /* renamed from: component1-ALGuh4w, reason: not valid java name and from getter */
        public final java.lang.String getCountry() {
            return this.country;
        }

        /* renamed from: copy-TiRZOh0$default, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreationSignupWithGoogle m16651copyTiRZOh0$default(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreationSignupWithGoogle accountCreationSignupWithGoogle, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint accountCreationEntryPoint, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = accountCreationSignupWithGoogle.country;
            }
            if ((i & 2) != 0) {
                str2 = accountCreationSignupWithGoogle.googleToken;
            }
            if ((i & 4) != 0) {
                accountCreationEntryPoint = accountCreationSignupWithGoogle.entryPoint;
            }
            return accountCreationSignupWithGoogle.m16654copyTiRZOh0(str, str2, accountCreationEntryPoint);
        }

        public /* synthetic */ AccountCreationSignupWithGoogle(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint accountCreationEntryPoint, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, accountCreationEntryPoint);
        }

        public /* synthetic */ AccountCreationSignupWithGoogle(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint accountCreationEntryPoint, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, str2, str3, accountCreationEntryPoint, serializationConstructorMarker);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$CryptoPro;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/JourneyContext;", "journeyContext", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/JourneyContext;)V", "", "seen0", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/api/domain/JourneyContext;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/oneonboarding/api/domain/JourneyContext;", "copy", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/JourneyContext;)Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$CryptoPro;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$one_onboarding_api_prodRelease", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$CryptoPro;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/JourneyContext;", "getJourneyContext", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class CryptoPro extends com.paypal.oslo.feature.oneonboarding.api.domain.IntentId {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.CryptoPro.Companion INSTANCE = new com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.CryptoPro.Companion(null);
        private final com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$CryptoPro$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$CryptoPro;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes13.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.CryptoPro> serializer() {
                return com.paypal.oslo.feature.oneonboarding.api.domain.IntentId$CryptoPro$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ CryptoPro(int i, java.lang.String str, com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, str, serializationConstructorMarker);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId$CryptoPro$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 2) == 0) {
                this.journeyContext = null;
            } else {
                this.journeyContext = journeyContext;
            }
        }

        public CryptoPro(com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext) {
            super(com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO_PRO, null);
            this.journeyContext = journeyContext;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$one_onboarding_api_prodRelease(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.CryptoPro self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.write$Self(self, output, serialDesc);
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.journeyContext != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext$$serializer.INSTANCE, self.journeyContext);
            }
        }

        public /* synthetic */ CryptoPro(com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : journeyContext);
        }

        public final com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext getJourneyContext() {
            return this.journeyContext;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext = this.journeyContext;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoPro(journeyContext=");
            sb.append(journeyContext);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext = this.journeyContext;
            if (journeyContext == null) {
                return 0;
            }
            return journeyContext.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.CryptoPro) && kotlin.jvm.internal.Intrinsics.areEqual(this.journeyContext, ((com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.CryptoPro) other).journeyContext);
        }

        public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.CryptoPro copy(com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext) {
            return new com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.CryptoPro(journeyContext);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext getJourneyContext() {
            return this.journeyContext;
        }

        public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.CryptoPro copy$default(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.CryptoPro cryptoPro, com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                journeyContext = cryptoPro.journeyContext;
            }
            return cryptoPro.copy(journeyContext);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CryptoPro() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$BankingBundle;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/JourneyContext;", "journeyContext", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/JourneyContext;)V", "", "seen0", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/api/domain/JourneyContext;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/oneonboarding/api/domain/JourneyContext;", "copy", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/JourneyContext;)Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$BankingBundle;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$one_onboarding_api_prodRelease", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$BankingBundle;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/JourneyContext;", "getJourneyContext", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class BankingBundle extends com.paypal.oslo.feature.oneonboarding.api.domain.IntentId {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.BankingBundle.Companion INSTANCE = new com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.BankingBundle.Companion(null);
        private final com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$BankingBundle$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$BankingBundle;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes13.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.BankingBundle> serializer() {
                return com.paypal.oslo.feature.oneonboarding.api.domain.IntentId$BankingBundle$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ BankingBundle(int i, java.lang.String str, com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, str, serializationConstructorMarker);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId$BankingBundle$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 2) == 0) {
                this.journeyContext = null;
            } else {
                this.journeyContext = journeyContext;
            }
        }

        public BankingBundle(com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext) {
            super("BANKING_BUNDLE", null);
            this.journeyContext = journeyContext;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$one_onboarding_api_prodRelease(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.BankingBundle self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.write$Self(self, output, serialDesc);
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.journeyContext != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext$$serializer.INSTANCE, self.journeyContext);
            }
        }

        public /* synthetic */ BankingBundle(com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : journeyContext);
        }

        public final com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext getJourneyContext() {
            return this.journeyContext;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext = this.journeyContext;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BankingBundle(journeyContext=");
            sb.append(journeyContext);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext = this.journeyContext;
            if (journeyContext == null) {
                return 0;
            }
            return journeyContext.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.BankingBundle) && kotlin.jvm.internal.Intrinsics.areEqual(this.journeyContext, ((com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.BankingBundle) other).journeyContext);
        }

        public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.BankingBundle copy(com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext) {
            return new com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.BankingBundle(journeyContext);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext getJourneyContext() {
            return this.journeyContext;
        }

        public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.BankingBundle copy$default(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.BankingBundle bankingBundle, com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                journeyContext = bankingBundle.journeyContext;
            }
            return bankingBundle.copy(journeyContext);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BankingBundle() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$Savings;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/JourneyContext;", "journeyContext", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/JourneyContext;)V", "", "seen0", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/api/domain/JourneyContext;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/oneonboarding/api/domain/JourneyContext;", "copy", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/JourneyContext;)Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$Savings;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$one_onboarding_api_prodRelease", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$Savings;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/JourneyContext;", "getJourneyContext", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Savings extends com.paypal.oslo.feature.oneonboarding.api.domain.IntentId {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Savings.Companion INSTANCE = new com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Savings.Companion(null);
        private final com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$Savings$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$Savings;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes13.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Savings> serializer() {
                return com.paypal.oslo.feature.oneonboarding.api.domain.IntentId$Savings$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Savings(int i, java.lang.String str, com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, str, serializationConstructorMarker);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId$Savings$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 2) == 0) {
                this.journeyContext = null;
            } else {
                this.journeyContext = journeyContext;
            }
        }

        public Savings(com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext) {
            super("SAVINGS", null);
            this.journeyContext = journeyContext;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$one_onboarding_api_prodRelease(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Savings self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.write$Self(self, output, serialDesc);
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.journeyContext != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext$$serializer.INSTANCE, self.journeyContext);
            }
        }

        public /* synthetic */ Savings(com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : journeyContext);
        }

        public final com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext getJourneyContext() {
            return this.journeyContext;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext = this.journeyContext;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Savings(journeyContext=");
            sb.append(journeyContext);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext = this.journeyContext;
            if (journeyContext == null) {
                return 0;
            }
            return journeyContext.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Savings) && kotlin.jvm.internal.Intrinsics.areEqual(this.journeyContext, ((com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Savings) other).journeyContext);
        }

        public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Savings copy(com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext) {
            return new com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Savings(journeyContext);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext getJourneyContext() {
            return this.journeyContext;
        }

        public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Savings copy$default(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Savings savings, com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                journeyContext = savings.journeyContext;
            }
            return savings.copy(journeyContext);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Savings() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$AddFunds;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/JourneyContext;", "journeyContext", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/JourneyContext;)V", "", "seen0", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/api/domain/JourneyContext;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/oneonboarding/api/domain/JourneyContext;", "copy", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/JourneyContext;)Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$AddFunds;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$one_onboarding_api_prodRelease", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$AddFunds;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/JourneyContext;", "getJourneyContext", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class AddFunds extends com.paypal.oslo.feature.oneonboarding.api.domain.IntentId {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AddFunds.Companion INSTANCE = new com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AddFunds.Companion(null);
        private final com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$AddFunds$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId$AddFunds;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes13.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AddFunds> serializer() {
                return com.paypal.oslo.feature.oneonboarding.api.domain.IntentId$AddFunds$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AddFunds(int i, java.lang.String str, com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, str, serializationConstructorMarker);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId$AddFunds$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 2) == 0) {
                this.journeyContext = null;
            } else {
                this.journeyContext = journeyContext;
            }
        }

        public AddFunds(com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext) {
            super("ADD_FUNDS", null);
            this.journeyContext = journeyContext;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$one_onboarding_api_prodRelease(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AddFunds self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.write$Self(self, output, serialDesc);
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.journeyContext != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext$$serializer.INSTANCE, self.journeyContext);
            }
        }

        public /* synthetic */ AddFunds(com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : journeyContext);
        }

        public final com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext getJourneyContext() {
            return this.journeyContext;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext = this.journeyContext;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddFunds(journeyContext=");
            sb.append(journeyContext);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext = this.journeyContext;
            if (journeyContext == null) {
                return 0;
            }
            return journeyContext.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AddFunds) && kotlin.jvm.internal.Intrinsics.areEqual(this.journeyContext, ((com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AddFunds) other).journeyContext);
        }

        public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AddFunds copy(com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext) {
            return new com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AddFunds(journeyContext);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext getJourneyContext() {
            return this.journeyContext;
        }

        public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AddFunds copy$default(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AddFunds addFunds, com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                journeyContext = addFunds.journeyContext;
            }
            return addFunds.copy(journeyContext);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AddFunds() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* renamed from: $r8$lambda$FkqF1dFcLM1TRGgcTLOg-ntMYWM, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m16644$r8$lambda$FkqF1dFcLM1TRGgcTLOgntMYWM() {
        return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.oneonboarding.api.domain.IntentId", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreation.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreationSignupWithGoogle.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AddFunds.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.BankingBundle.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Crypto.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.CryptoPro.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Savings.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.oneonboarding.api.domain.IntentId$AccountCreation$$serializer.INSTANCE, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId$AccountCreationSignupWithGoogle$$serializer.INSTANCE, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId$AddFunds$$serializer.INSTANCE, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId$BankingBundle$$serializer.INSTANCE, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId$Crypto$$serializer.INSTANCE, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId$CryptoPro$$serializer.INSTANCE, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId$Savings$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
    }

    public /* synthetic */ IntentId(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
