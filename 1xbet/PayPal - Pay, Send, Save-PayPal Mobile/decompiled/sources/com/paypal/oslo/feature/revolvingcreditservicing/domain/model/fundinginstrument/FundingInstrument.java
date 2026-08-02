package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b1\u0018\u0000 \u00172\u00020\u0001:\u0004\u0018\u0019\u001a\u0017B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00118'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013\u0082\u0001\u0003\u001b\u001c\u001d"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;", "", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "getId", "()Ljava/lang/String;", "id", "getIcon", "icon", "Companion", "FundingInstrumentBalance", "FundingInstrumentBank", "FundingInstrumentCard", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument$FundingInstrumentBalance;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument$FundingInstrumentBank;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument$FundingInstrumentCard;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class FundingInstrument {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.$r8$lambda$L9PY5XKJ6NkSCFRzvBAiF5_hD50();
        }
    });

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }

    public abstract java.lang.String getIcon();

    public abstract java.lang.String getId();

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private FundingInstrument() {
    }

    public /* synthetic */ FundingInstrument(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument$FundingInstrumentBalance;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;", "", "id", "icon", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "balance", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument$FundingInstrumentBalance;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getIcon", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "getBalance", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final class FundingInstrumentBalance extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance.Companion(null);
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount balance;
        private final java.lang.String icon;
        private final java.lang.String id;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument$FundingInstrumentBalance$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument$FundingInstrumentBalance;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes14.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance> serializer() {
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument$FundingInstrumentBalance$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FundingInstrumentBalance(int i, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (7 != (i & 7)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument$FundingInstrumentBalance$$serializer.INSTANCE.getDescriptor());
            }
            this.id = str;
            this.icon = str2;
            this.balance = currencyAmount;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FundingInstrumentBalance(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
            this.icon = str2;
            this.balance = currencyAmount;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$revolvingcredit_servicing_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.write$Self(self, output, serialDesc);
            output.encodeStringElement(serialDesc, 0, self.getId());
            output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.getIcon());
            output.encodeNullableSerializableElement(serialDesc, 2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, self.balance);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument
        public final java.lang.String getId() {
            return this.id;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument
        public final java.lang.String getIcon() {
            return this.icon;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getBalance() {
            return this.balance;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0001\u0018\u0000 !2\u00020\u0001:\u0002\"!B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b \u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument$FundingInstrumentBank;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;", "", "id", "icon", "name", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/BankAccountType;", "type", "lastNChars", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/BankAccountType;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/BankAccountType;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument$FundingInstrumentBank;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getIcon", "getName", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/BankAccountType;", "getType", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/BankAccountType;", "getLastNChars", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final class FundingInstrumentBank extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument {
        public static final int $stable = 0;
        private final java.lang.String icon;
        private final java.lang.String id;
        private final java.lang.String lastNChars;
        private final java.lang.String name;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType type;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank.Companion(null);
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument$FundingInstrumentBank$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType.values());
                return createSimpleEnumSerializer;
            }
        }), null};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument$FundingInstrumentBank$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument$FundingInstrumentBank;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes14.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank> serializer() {
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument$FundingInstrumentBank$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FundingInstrumentBank(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType bankAccountType, java.lang.String str4, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (31 != (i & 31)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 31, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument$FundingInstrumentBank$$serializer.INSTANCE.getDescriptor());
            }
            this.id = str;
            this.icon = str2;
            this.name = str3;
            this.type = bankAccountType;
            this.lastNChars = str4;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FundingInstrumentBank(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType bankAccountType, java.lang.String str4) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
            this.icon = str2;
            this.name = str3;
            this.type = bankAccountType;
            this.lastNChars = str4;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$revolvingcredit_servicing_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.write$Self(self, output, serialDesc);
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.getId());
            output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.getIcon());
            output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.name);
            output.encodeNullableSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.type);
            output.encodeNullableSerializableElement(serialDesc, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.lastNChars);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument
        public final java.lang.String getId() {
            return this.id;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument
        public final java.lang.String getIcon() {
            return this.icon;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType getType() {
            return this.type;
        }

        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0001\u0018\u0000 !2\u00020\u0001:\u0002\"!B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument$FundingInstrumentCard;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;", "", "id", "icon", "name", "lastNChars", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/CardProductType;", "productClass", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/CardProductType;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/CardProductType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument$FundingInstrumentCard;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getIcon", "getName", "getLastNChars", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/CardProductType;", "getProductClass", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/CardProductType;", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final class FundingInstrumentCard extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument {
        public static final int $stable = 0;
        private final java.lang.String icon;
        private final java.lang.String id;
        private final java.lang.String lastNChars;
        private final java.lang.String name;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType productClass;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentCard.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentCard.Companion(null);
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument$FundingInstrumentCard$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType.values());
                return createSimpleEnumSerializer;
            }
        })};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument$FundingInstrumentCard$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument$FundingInstrumentCard;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes14.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentCard> serializer() {
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument$FundingInstrumentCard$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FundingInstrumentCard(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType cardProductType, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (31 != (i & 31)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 31, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument$FundingInstrumentCard$$serializer.INSTANCE.getDescriptor());
            }
            this.id = str;
            this.icon = str2;
            this.name = str3;
            this.lastNChars = str4;
            this.productClass = cardProductType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FundingInstrumentCard(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType cardProductType) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardProductType, "");
            this.id = str;
            this.icon = str2;
            this.name = str3;
            this.lastNChars = str4;
            this.productClass = cardProductType;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$revolvingcredit_servicing_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentCard self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.write$Self(self, output, serialDesc);
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.getId());
            output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.getIcon());
            output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.name);
            output.encodeStringElement(serialDesc, 3, self.lastNChars);
            output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.productClass);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument
        public final java.lang.String getId() {
            return this.id;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument
        public final java.lang.String getIcon() {
            return this.icon;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType getProductClass() {
            return this.productClass;
        }
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$L9PY5XKJ6NkSCFRzvBAiF5_hD50() {
        return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentCard.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument$FundingInstrumentBalance$$serializer.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument$FundingInstrumentBank$$serializer.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument$FundingInstrumentCard$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
    }

    public /* synthetic */ FundingInstrument(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
