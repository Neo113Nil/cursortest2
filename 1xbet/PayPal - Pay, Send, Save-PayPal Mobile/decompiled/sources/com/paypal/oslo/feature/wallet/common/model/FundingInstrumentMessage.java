package com.paypal.oslo.feature.wallet.common.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u001cB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentMessage;", "", "Lcom/paypal/oslo/feature/wallet/common/ui/UiText;", "text", "Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentMessage$Type;", "type", "<init>", "(Lcom/paypal/oslo/feature/wallet/common/ui/UiText;Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentMessage$Type;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/common/ui/UiText;", "component2", "()Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentMessage$Type;", "copy", "(Lcom/paypal/oslo/feature/wallet/common/ui/UiText;Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentMessage$Type;)Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentMessage;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/common/ui/UiText;", "getText", "Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentMessage$Type;", "getType", com.miteksystems.misnap.core.MibiData.KEY_MICROPHONE_TYPE}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class FundingInstrumentMessage {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.wallet.common.ui.UiText text;
    private final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentMessage.Type type;

    public FundingInstrumentMessage(com.paypal.oslo.feature.wallet.common.ui.UiText uiText, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentMessage.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        this.text = uiText;
        this.type = type;
    }

    public final com.paypal.oslo.feature.wallet.common.ui.UiText getText() {
        return this.text;
    }

    public /* synthetic */ FundingInstrumentMessage(com.paypal.oslo.feature.wallet.common.ui.UiText uiText, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentMessage.Type type, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(uiText, (i & 2) != 0 ? com.paypal.oslo.feature.wallet.common.model.FundingInstrumentMessage.Type.WARNING : type);
    }

    public final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentMessage.Type getType() {
        return this.type;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentMessage$Type;", "", "<init>", "(Ljava/lang/String;I)V", "WARNING", "ERROR"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
        public static final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentMessage.Type ERROR;
        public static final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentMessage.Type WARNING;
        private static final /* synthetic */ com.paypal.oslo.feature.wallet.common.model.FundingInstrumentMessage.Type[] getHighResolutionOutputSizeshNQ4ISI;

        private Type(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.wallet.common.model.FundingInstrumentMessage.Type type = new com.paypal.oslo.feature.wallet.common.model.FundingInstrumentMessage.Type("WARNING", 0);
            WARNING = type;
            com.paypal.oslo.feature.wallet.common.model.FundingInstrumentMessage.Type type2 = new com.paypal.oslo.feature.wallet.common.model.FundingInstrumentMessage.Type("ERROR", 1);
            ERROR = type2;
            com.paypal.oslo.feature.wallet.common.model.FundingInstrumentMessage.Type[] typeArr = {type, type2};
            getHighResolutionOutputSizeshNQ4ISI = typeArr;
            Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(typeArr);
        }

        public static com.paypal.oslo.feature.wallet.common.model.FundingInstrumentMessage.Type[] values() {
            return (com.paypal.oslo.feature.wallet.common.model.FundingInstrumentMessage.Type[]) getHighResolutionOutputSizeshNQ4ISI.clone();
        }

        public static com.paypal.oslo.feature.wallet.common.model.FundingInstrumentMessage.Type valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.wallet.common.model.FundingInstrumentMessage.Type) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.common.model.FundingInstrumentMessage.Type.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.common.model.FundingInstrumentMessage.Type> getEntries() {
            return Camera2StreamConfigurationMap;
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.common.ui.UiText uiText = this.text;
        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentMessage.Type type = this.type;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingInstrumentMessage(text=");
        sb.append(uiText);
        sb.append(", type=");
        sb.append(type);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.text.hashCode() * 31) + this.type.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.common.model.FundingInstrumentMessage)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentMessage fundingInstrumentMessage = (com.paypal.oslo.feature.wallet.common.model.FundingInstrumentMessage) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.text, fundingInstrumentMessage.text) && this.type == fundingInstrumentMessage.type;
    }

    public final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentMessage copy(com.paypal.oslo.feature.wallet.common.ui.UiText text, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentMessage.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.wallet.common.model.FundingInstrumentMessage(text, type);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentMessage.Type getType() {
        return this.type;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.common.ui.UiText getText() {
        return this.text;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.common.model.FundingInstrumentMessage copy$default(com.paypal.oslo.feature.wallet.common.model.FundingInstrumentMessage fundingInstrumentMessage, com.paypal.oslo.feature.wallet.common.ui.UiText uiText, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentMessage.Type type, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            uiText = fundingInstrumentMessage.text;
        }
        if ((i & 2) != 0) {
            type = fundingInstrumentMessage.type;
        }
        return fundingInstrumentMessage.copy(uiText, type);
    }
}
