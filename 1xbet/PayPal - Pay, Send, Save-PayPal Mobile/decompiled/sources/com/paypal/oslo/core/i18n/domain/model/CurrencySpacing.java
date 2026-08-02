package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\rR \u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010\r"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/CurrencySpacing;", "", "Lcom/paypal/oslo/core/i18n/domain/model/SpacingDetail;", "beforeCurrency", "afterCurrency", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/model/SpacingDetail;Lcom/paypal/oslo/core/i18n/domain/model/SpacingDetail;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/core/i18n/domain/model/SpacingDetail;Lcom/paypal/oslo/core/i18n/domain/model/SpacingDetail;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/core/i18n/domain/model/SpacingDetail;", "component2", "copy", "(Lcom/paypal/oslo/core/i18n/domain/model/SpacingDetail;Lcom/paypal/oslo/core/i18n/domain/model/SpacingDetail;)Lcom/paypal/oslo/core/i18n/domain/model/CurrencySpacing;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$i18n_release", "(Lcom/paypal/oslo/core/i18n/domain/model/CurrencySpacing;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/core/i18n/domain/model/SpacingDetail;", "getBeforeCurrency", "getBeforeCurrency$annotations", "()V", "getAfterCurrency", "getAfterCurrency$annotations", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class CurrencySpacing {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.i18n.domain.model.CurrencySpacing.Companion INSTANCE = new com.paypal.oslo.core.i18n.domain.model.CurrencySpacing.Companion(null);
    private final com.paypal.oslo.core.i18n.domain.model.SpacingDetail afterCurrency;
    private final com.paypal.oslo.core.i18n.domain.model.SpacingDetail beforeCurrency;

    @kotlinx.serialization.SerialName("afterCurrency")
    public static /* synthetic */ void getAfterCurrency$annotations() {
    }

    @kotlinx.serialization.SerialName("beforeCurrency")
    public static /* synthetic */ void getBeforeCurrency$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/CurrencySpacing$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencySpacing;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.core.i18n.domain.model.CurrencySpacing> serializer() {
            return com.paypal.oslo.core.i18n.domain.model.CurrencySpacing$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CurrencySpacing(int i, com.paypal.oslo.core.i18n.domain.model.SpacingDetail spacingDetail, com.paypal.oslo.core.i18n.domain.model.SpacingDetail spacingDetail2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.core.i18n.domain.model.CurrencySpacing$$serializer.INSTANCE.getDescriptor());
        }
        this.beforeCurrency = spacingDetail;
        this.afterCurrency = spacingDetail2;
    }

    public CurrencySpacing(com.paypal.oslo.core.i18n.domain.model.SpacingDetail spacingDetail, com.paypal.oslo.core.i18n.domain.model.SpacingDetail spacingDetail2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spacingDetail, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spacingDetail2, "");
        this.beforeCurrency = spacingDetail;
        this.afterCurrency = spacingDetail2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$i18n_release(com.paypal.oslo.core.i18n.domain.model.CurrencySpacing self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.core.i18n.domain.model.SpacingDetail$$serializer.INSTANCE, self.beforeCurrency);
        output.encodeSerializableElement(serialDesc, 1, com.paypal.oslo.core.i18n.domain.model.SpacingDetail$$serializer.INSTANCE, self.afterCurrency);
    }

    public final com.paypal.oslo.core.i18n.domain.model.SpacingDetail getBeforeCurrency() {
        return this.beforeCurrency;
    }

    public final com.paypal.oslo.core.i18n.domain.model.SpacingDetail getAfterCurrency() {
        return this.afterCurrency;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.i18n.domain.model.SpacingDetail spacingDetail = this.beforeCurrency;
        com.paypal.oslo.core.i18n.domain.model.SpacingDetail spacingDetail2 = this.afterCurrency;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrencySpacing(beforeCurrency=");
        sb.append(spacingDetail);
        sb.append(", afterCurrency=");
        sb.append(spacingDetail2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.beforeCurrency.hashCode() * 31) + this.afterCurrency.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.i18n.domain.model.CurrencySpacing)) {
            return false;
        }
        com.paypal.oslo.core.i18n.domain.model.CurrencySpacing currencySpacing = (com.paypal.oslo.core.i18n.domain.model.CurrencySpacing) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.beforeCurrency, currencySpacing.beforeCurrency) && kotlin.jvm.internal.Intrinsics.areEqual(this.afterCurrency, currencySpacing.afterCurrency);
    }

    public final com.paypal.oslo.core.i18n.domain.model.CurrencySpacing copy(com.paypal.oslo.core.i18n.domain.model.SpacingDetail beforeCurrency, com.paypal.oslo.core.i18n.domain.model.SpacingDetail afterCurrency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(beforeCurrency, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(afterCurrency, "");
        return new com.paypal.oslo.core.i18n.domain.model.CurrencySpacing(beforeCurrency, afterCurrency);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.i18n.domain.model.SpacingDetail getAfterCurrency() {
        return this.afterCurrency;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.i18n.domain.model.SpacingDetail getBeforeCurrency() {
        return this.beforeCurrency;
    }

    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.CurrencySpacing copy$default(com.paypal.oslo.core.i18n.domain.model.CurrencySpacing currencySpacing, com.paypal.oslo.core.i18n.domain.model.SpacingDetail spacingDetail, com.paypal.oslo.core.i18n.domain.model.SpacingDetail spacingDetail2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            spacingDetail = currencySpacing.beforeCurrency;
        }
        if ((i & 2) != 0) {
            spacingDetail2 = currencySpacing.afterCurrency;
        }
        return currencySpacing.copy(spacingDetail, spacingDetail2);
    }
}
