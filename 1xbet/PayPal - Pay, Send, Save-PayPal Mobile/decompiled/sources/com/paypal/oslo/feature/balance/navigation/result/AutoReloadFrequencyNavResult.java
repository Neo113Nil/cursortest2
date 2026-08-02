package com.paypal.oslo.feature.balance.navigation.result;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/balance/navigation/result/AutoReloadFrequencyNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "Ljava/time/LocalDate;", "startDate", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency;", "frequency", "<init>", "(Ljava/time/LocalDate;Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/time/LocalDate;Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/time/LocalDate;", "component2", "()Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency;", "copy", "(Ljava/time/LocalDate;Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency;)Lcom/paypal/oslo/feature/balance/navigation/result/AutoReloadFrequencyNavResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$balance_prodRelease", "(Lcom/paypal/oslo/feature/balance/navigation/result/AutoReloadFrequencyNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/time/LocalDate;", "getStartDate", "getStartDate$annotations", "()V", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency;", "getFrequency", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class AutoReloadFrequencyNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    private final com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency frequency;
    private final java.time.LocalDate startDate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.balance.navigation.result.AutoReloadFrequencyNavResult.Companion INSTANCE = new com.paypal.oslo.feature.balance.navigation.result.AutoReloadFrequencyNavResult.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.navigation.result.AutoReloadFrequencyNavResult$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.balance.navigation.result.AutoReloadFrequencyNavResult.m12032$r8$lambda$HxHpwR1OKykbLzKvONZG9EnJoo();
        }
    })};

    @kotlinx.serialization.Serializable(with = com.paypal.oslo.feature.balance.common.serializer.LocalDateSerializer.class)
    public static /* synthetic */ void getStartDate$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/navigation/result/AutoReloadFrequencyNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/balance/navigation/result/AutoReloadFrequencyNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.balance.navigation.result.AutoReloadFrequencyNavResult> serializer() {
            return com.paypal.oslo.feature.balance.navigation.result.AutoReloadFrequencyNavResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AutoReloadFrequencyNavResult(int i, java.time.LocalDate localDate, com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency autoReloadFrequency, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.balance.navigation.result.AutoReloadFrequencyNavResult$$serializer.INSTANCE.getDescriptor());
        }
        this.startDate = localDate;
        this.frequency = autoReloadFrequency;
    }

    public AutoReloadFrequencyNavResult(java.time.LocalDate localDate, com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency autoReloadFrequency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadFrequency, "");
        this.startDate = localDate;
        this.frequency = autoReloadFrequency;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$balance_prodRelease(com.paypal.oslo.feature.balance.navigation.result.AutoReloadFrequencyNavResult self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.feature.balance.common.serializer.LocalDateSerializer.INSTANCE, self.startDate);
        output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.frequency);
    }

    public final java.time.LocalDate getStartDate() {
        return this.startDate;
    }

    public final com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency getFrequency() {
        return this.frequency;
    }

    /* renamed from: $r8$lambda$HxHpwR1OKykbLz-KvONZG9EnJoo, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m12032$r8$lambda$HxHpwR1OKykbLzKvONZG9EnJoo() {
        return new kotlinx.serialization.PolymorphicSerializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.class), new java.lang.annotation.Annotation[0]);
    }

    public final java.lang.String toString() {
        java.time.LocalDate localDate = this.startDate;
        com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency autoReloadFrequency = this.frequency;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AutoReloadFrequencyNavResult(startDate=");
        sb.append(localDate);
        sb.append(", frequency=");
        sb.append(autoReloadFrequency);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.startDate.hashCode() * 31) + this.frequency.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.balance.navigation.result.AutoReloadFrequencyNavResult)) {
            return false;
        }
        com.paypal.oslo.feature.balance.navigation.result.AutoReloadFrequencyNavResult autoReloadFrequencyNavResult = (com.paypal.oslo.feature.balance.navigation.result.AutoReloadFrequencyNavResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.startDate, autoReloadFrequencyNavResult.startDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.frequency, autoReloadFrequencyNavResult.frequency);
    }

    public final com.paypal.oslo.feature.balance.navigation.result.AutoReloadFrequencyNavResult copy(java.time.LocalDate startDate, com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency frequency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startDate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frequency, "");
        return new com.paypal.oslo.feature.balance.navigation.result.AutoReloadFrequencyNavResult(startDate, frequency);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency getFrequency() {
        return this.frequency;
    }

    /* renamed from: component1, reason: from getter */
    public final java.time.LocalDate getStartDate() {
        return this.startDate;
    }

    public static /* synthetic */ com.paypal.oslo.feature.balance.navigation.result.AutoReloadFrequencyNavResult copy$default(com.paypal.oslo.feature.balance.navigation.result.AutoReloadFrequencyNavResult autoReloadFrequencyNavResult, java.time.LocalDate localDate, com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency autoReloadFrequency, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            localDate = autoReloadFrequencyNavResult.startDate;
        }
        if ((i & 2) != 0) {
            autoReloadFrequency = autoReloadFrequencyNavResult.frequency;
        }
        return autoReloadFrequencyNavResult.copy(localDate, autoReloadFrequency);
    }
}
