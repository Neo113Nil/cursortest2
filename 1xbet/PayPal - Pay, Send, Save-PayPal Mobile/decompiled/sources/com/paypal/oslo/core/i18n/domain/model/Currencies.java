package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R,\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/Currencies;", "", "", "", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyDetail;", "currencies", "<init>", "(Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/paypal/oslo/core/i18n/domain/model/Currencies;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$i18n_release", "(Lcom/paypal/oslo/core/i18n/domain/model/Currencies;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/util/Map;", "getCurrencies", "getCurrencies$annotations", "()V", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class Currencies {
    private final java.util.Map<java.lang.String, com.paypal.oslo.core.i18n.domain.model.CurrencyDetail> currencies;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.i18n.domain.model.Currencies.Companion INSTANCE = new com.paypal.oslo.core.i18n.domain.model.Currencies.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.i18n.domain.model.Currencies$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.core.i18n.domain.model.Currencies.m11382$r8$lambda$G0JF0sgj5HpyGCsmtsp18lhD24();
        }
    })};

    @kotlinx.serialization.SerialName("currencies")
    public static /* synthetic */ void getCurrencies$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/Currencies$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/core/i18n/domain/model/Currencies;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.core.i18n.domain.model.Currencies> serializer() {
            return com.paypal.oslo.core.i18n.domain.model.Currencies$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Currencies(int i, java.util.Map map, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.core.i18n.domain.model.Currencies$$serializer.INSTANCE.getDescriptor());
        }
        this.currencies = map;
    }

    public Currencies(java.util.Map<java.lang.String, com.paypal.oslo.core.i18n.domain.model.CurrencyDetail> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.currencies = map;
    }

    public final java.util.Map<java.lang.String, com.paypal.oslo.core.i18n.domain.model.CurrencyDetail> getCurrencies() {
        return this.currencies;
    }

    /* renamed from: $r8$lambda$G0JF0sgj5H-pyGCsmtsp18lhD24, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m11382$r8$lambda$G0JF0sgj5HpyGCsmtsp18lhD24() {
        return new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, com.paypal.oslo.core.i18n.domain.model.CurrencyDetail$$serializer.INSTANCE);
    }

    public final java.lang.String toString() {
        java.util.Map<java.lang.String, com.paypal.oslo.core.i18n.domain.model.CurrencyDetail> map = this.currencies;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Currencies(currencies=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.currencies.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.core.i18n.domain.model.Currencies) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencies, ((com.paypal.oslo.core.i18n.domain.model.Currencies) other).currencies);
    }

    public final com.paypal.oslo.core.i18n.domain.model.Currencies copy(java.util.Map<java.lang.String, com.paypal.oslo.core.i18n.domain.model.CurrencyDetail> currencies) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencies, "");
        return new com.paypal.oslo.core.i18n.domain.model.Currencies(currencies);
    }

    public final java.util.Map<java.lang.String, com.paypal.oslo.core.i18n.domain.model.CurrencyDetail> component1() {
        return this.currencies;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.Currencies copy$default(com.paypal.oslo.core.i18n.domain.model.Currencies currencies, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = currencies.currencies;
        }
        return currencies.copy(map);
    }
}
