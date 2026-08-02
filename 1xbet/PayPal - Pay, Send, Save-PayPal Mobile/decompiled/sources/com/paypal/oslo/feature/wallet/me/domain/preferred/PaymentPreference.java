package com.paypal.oslo.feature.wallet.me.domain.preferred;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001fB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/preferred/PaymentPreference;", "", "Lcom/paypal/oslo/feature/wallet/me/domain/preferred/PaymentPreference$Type;", "type", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "title", "instrument", "<init>", "(Lcom/paypal/oslo/feature/wallet/me/domain/preferred/PaymentPreference$Type;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/me/domain/preferred/PaymentPreference$Type;", "component2", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component3", "copy", "(Lcom/paypal/oslo/feature/wallet/me/domain/preferred/PaymentPreference$Type;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/wallet/me/domain/preferred/PaymentPreference;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/me/domain/preferred/PaymentPreference$Type;", "getType", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getTitle", "getInstrument", com.miteksystems.misnap.core.MibiData.KEY_MICROPHONE_TYPE}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class PaymentPreference {
    public static final int $stable;
    private final com.paypal.oslo.core.commonui.utils.RefText instrument;
    private final com.paypal.oslo.core.commonui.utils.RefText title;
    private final com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference.Type type;

    public PaymentPreference(com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference.Type type, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
        this.type = type;
        this.title = refText;
        this.instrument = refText2;
    }

    public /* synthetic */ PaymentPreference(com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference.Type type, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(type, refText, (i & 4) != 0 ? null : refText2);
    }

    public final com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference.Type getType() {
        return this.type;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
        return this.title;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getInstrument() {
        return this.instrument;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/preferred/PaymentPreference$Type;", "", "<init>", "(Ljava/lang/String;I)V", "IN_STORE", "ONLINE"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
        public static final com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference.Type IN_STORE;
        public static final com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference.Type ONLINE;
        private static final /* synthetic */ com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference.Type[] getHighSpeedVideoSizes;

        private Type(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference.Type type = new com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference.Type("IN_STORE", 0);
            IN_STORE = type;
            com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference.Type type2 = new com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference.Type("ONLINE", 1);
            ONLINE = type2;
            com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference.Type[] typeArr = {type, type2};
            getHighSpeedVideoSizes = typeArr;
            Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(typeArr);
        }

        public static com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference.Type[] values() {
            return (com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference.Type[]) getHighSpeedVideoSizes.clone();
        }

        public static com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference.Type valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference.Type) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference.Type.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference.Type> getEntries() {
            return Camera2StreamConfigurationMap;
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference.Type type = this.type;
        com.paypal.oslo.core.commonui.utils.RefText refText = this.title;
        com.paypal.oslo.core.commonui.utils.RefText refText2 = this.instrument;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentPreference(type=");
        sb.append(type);
        sb.append(", title=");
        sb.append(refText);
        sb.append(", instrument=");
        sb.append(refText2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode();
        int hashCode2 = this.title.hashCode();
        com.paypal.oslo.core.commonui.utils.RefText refText = this.instrument;
        return (((hashCode * 31) + hashCode2) * 31) + (refText == null ? 0 : refText.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference paymentPreference = (com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference) other;
        return this.type == paymentPreference.type && kotlin.jvm.internal.Intrinsics.areEqual(this.title, paymentPreference.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.instrument, paymentPreference.instrument);
    }

    public final com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference copy(com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference.Type type, com.paypal.oslo.core.commonui.utils.RefText title, com.paypal.oslo.core.commonui.utils.RefText instrument) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        return new com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference(type, title, instrument);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getInstrument() {
        return this.instrument;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
        return this.title;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference.Type getType() {
        return this.type;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference copy$default(com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference paymentPreference, com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference.Type type, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            type = paymentPreference.type;
        }
        if ((i & 2) != 0) {
            refText = paymentPreference.title;
        }
        if ((i & 4) != 0) {
            refText2 = paymentPreference.instrument;
        }
        return paymentPreference.copy(type, refText, refText2);
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i;
    }
}
