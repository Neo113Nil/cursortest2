package com.paypal.oslo.feature.qrc.domain.model.session;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002'&B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ2\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u000fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b%\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/DefaultTipConfigs;", "", "", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;", "amountThresholdValues", "", "percentageThresholdValues", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/qrc/domain/model/session/DefaultTipConfigs;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$qrc_prodRelease", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/DefaultTipConfigs;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/util/List;", "getAmountThresholdValues", "getPercentageThresholdValues", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class DefaultTipConfigs {
    private final java.util.List<com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney> amountThresholdValues;
    private final java.util.List<java.lang.String> percentageThresholdValues;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.qrc.domain.model.session.DefaultTipConfigs.Companion INSTANCE = new com.paypal.oslo.feature.qrc.domain.model.session.DefaultTipConfigs.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.domain.model.session.DefaultTipConfigs$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.qrc.domain.model.session.DefaultTipConfigs.$r8$lambda$ceHQSB1xtCz_qjRFY0sFLjG9aok();
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.domain.model.session.DefaultTipConfigs$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.qrc.domain.model.session.DefaultTipConfigs.$r8$lambda$Niqd3nobOUJgVaMFJsWp6uzqBHc();
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/DefaultTipConfigs$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/DefaultTipConfigs;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.qrc.domain.model.session.DefaultTipConfigs> serializer() {
            return com.paypal.oslo.feature.qrc.domain.model.session.DefaultTipConfigs$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DefaultTipConfigs(int i, java.util.List list, java.util.List list2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.qrc.domain.model.session.DefaultTipConfigs$$serializer.INSTANCE.getDescriptor());
        }
        this.amountThresholdValues = list;
        if ((i & 2) == 0) {
            this.percentageThresholdValues = null;
        } else {
            this.percentageThresholdValues = list2;
        }
    }

    public DefaultTipConfigs(java.util.List<com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney> list, java.util.List<java.lang.String> list2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.amountThresholdValues = list;
        this.percentageThresholdValues = list2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$qrc_prodRelease(com.paypal.oslo.feature.qrc.domain.model.session.DefaultTipConfigs self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.amountThresholdValues);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.percentageThresholdValues != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.percentageThresholdValues);
        }
    }

    public /* synthetic */ DefaultTipConfigs(java.util.List list, java.util.List list2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : list2);
    }

    public final java.util.List<com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney> getAmountThresholdValues() {
        return this.amountThresholdValues;
    }

    public final java.util.List<java.lang.String> getPercentageThresholdValues() {
        return this.percentageThresholdValues;
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$Niqd3nobOUJgVaMFJsWp6uzqBHc() {
        return new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE);
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$ceHQSB1xtCz_qjRFY0sFLjG9aok() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney$$serializer.INSTANCE);
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney> list = this.amountThresholdValues;
        java.util.List<java.lang.String> list2 = this.percentageThresholdValues;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DefaultTipConfigs(amountThresholdValues=");
        sb.append(list);
        sb.append(", percentageThresholdValues=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.amountThresholdValues.hashCode();
        java.util.List<java.lang.String> list = this.percentageThresholdValues;
        return (hashCode * 31) + (list == null ? 0 : list.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.qrc.domain.model.session.DefaultTipConfigs)) {
            return false;
        }
        com.paypal.oslo.feature.qrc.domain.model.session.DefaultTipConfigs defaultTipConfigs = (com.paypal.oslo.feature.qrc.domain.model.session.DefaultTipConfigs) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.amountThresholdValues, defaultTipConfigs.amountThresholdValues) && kotlin.jvm.internal.Intrinsics.areEqual(this.percentageThresholdValues, defaultTipConfigs.percentageThresholdValues);
    }

    public final com.paypal.oslo.feature.qrc.domain.model.session.DefaultTipConfigs copy(java.util.List<com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney> amountThresholdValues, java.util.List<java.lang.String> percentageThresholdValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountThresholdValues, "");
        return new com.paypal.oslo.feature.qrc.domain.model.session.DefaultTipConfigs(amountThresholdValues, percentageThresholdValues);
    }

    public final java.util.List<java.lang.String> component2() {
        return this.percentageThresholdValues;
    }

    public final java.util.List<com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney> component1() {
        return this.amountThresholdValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.session.DefaultTipConfigs copy$default(com.paypal.oslo.feature.qrc.domain.model.session.DefaultTipConfigs defaultTipConfigs, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = defaultTipConfigs.amountThresholdValues;
        }
        if ((i & 2) != 0) {
            list2 = defaultTipConfigs.percentageThresholdValues;
        }
        return defaultTipConfigs.copy(list, list2);
    }
}
