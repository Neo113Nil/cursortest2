package com.paypal.oslo.feature.settings.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/model/HelpAndSupportSettingsData;", "", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;", "helpCenter", "messageCenter", "paypalAssistant", "<init>", "(Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;)V", "component1", "()Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;", "component2", "component3", "copy", "(Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;)Lcom/paypal/oslo/feature/settings/domain/model/HelpAndSupportSettingsData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;", "getHelpCenter", "getMessageCenter", "getPaypalAssistant"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class HelpAndSupportSettingsData {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.settings.domain.model.SettingsItemData helpCenter;
    private final com.paypal.oslo.feature.settings.domain.model.SettingsItemData messageCenter;
    private final com.paypal.oslo.feature.settings.domain.model.SettingsItemData paypalAssistant;

    public HelpAndSupportSettingsData(com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData, com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData2, com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsItemData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsItemData2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsItemData3, "");
        this.helpCenter = settingsItemData;
        this.messageCenter = settingsItemData2;
        this.paypalAssistant = settingsItemData3;
    }

    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getHelpCenter() {
        return this.helpCenter;
    }

    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getMessageCenter() {
        return this.messageCenter;
    }

    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getPaypalAssistant() {
        return this.paypalAssistant;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData = this.helpCenter;
        com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData2 = this.messageCenter;
        com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData3 = this.paypalAssistant;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HelpAndSupportSettingsData(helpCenter=");
        sb.append(settingsItemData);
        sb.append(", messageCenter=");
        sb.append(settingsItemData2);
        sb.append(", paypalAssistant=");
        sb.append(settingsItemData3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.helpCenter.hashCode() * 31) + this.messageCenter.hashCode()) * 31) + this.paypalAssistant.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.settings.domain.model.HelpAndSupportSettingsData)) {
            return false;
        }
        com.paypal.oslo.feature.settings.domain.model.HelpAndSupportSettingsData helpAndSupportSettingsData = (com.paypal.oslo.feature.settings.domain.model.HelpAndSupportSettingsData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.helpCenter, helpAndSupportSettingsData.helpCenter) && kotlin.jvm.internal.Intrinsics.areEqual(this.messageCenter, helpAndSupportSettingsData.messageCenter) && kotlin.jvm.internal.Intrinsics.areEqual(this.paypalAssistant, helpAndSupportSettingsData.paypalAssistant);
    }

    public final com.paypal.oslo.feature.settings.domain.model.HelpAndSupportSettingsData copy(com.paypal.oslo.feature.settings.domain.model.SettingsItemData helpCenter, com.paypal.oslo.feature.settings.domain.model.SettingsItemData messageCenter, com.paypal.oslo.feature.settings.domain.model.SettingsItemData paypalAssistant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(helpCenter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageCenter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paypalAssistant, "");
        return new com.paypal.oslo.feature.settings.domain.model.HelpAndSupportSettingsData(helpCenter, messageCenter, paypalAssistant);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getPaypalAssistant() {
        return this.paypalAssistant;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getMessageCenter() {
        return this.messageCenter;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getHelpCenter() {
        return this.helpCenter;
    }

    public static /* synthetic */ com.paypal.oslo.feature.settings.domain.model.HelpAndSupportSettingsData copy$default(com.paypal.oslo.feature.settings.domain.model.HelpAndSupportSettingsData helpAndSupportSettingsData, com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData, com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData2, com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            settingsItemData = helpAndSupportSettingsData.helpCenter;
        }
        if ((i & 2) != 0) {
            settingsItemData2 = helpAndSupportSettingsData.messageCenter;
        }
        if ((i & 4) != 0) {
            settingsItemData3 = helpAndSupportSettingsData.paypalAssistant;
        }
        return helpAndSupportSettingsData.copy(settingsItemData, settingsItemData2, settingsItemData3);
    }
}
