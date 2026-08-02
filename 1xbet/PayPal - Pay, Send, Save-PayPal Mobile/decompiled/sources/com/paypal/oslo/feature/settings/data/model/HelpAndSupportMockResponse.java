package com.paypal.oslo.feature.settings.data.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/settings/data/model/HelpAndSupportMockResponse;", "", "Lcom/paypal/oslo/feature/settings/data/model/SettingsItemMockResponse;", "messageCenter", "helpCenter", "paypalAssistant", "<init>", "(Lcom/paypal/oslo/feature/settings/data/model/SettingsItemMockResponse;Lcom/paypal/oslo/feature/settings/data/model/SettingsItemMockResponse;Lcom/paypal/oslo/feature/settings/data/model/SettingsItemMockResponse;)V", "component1", "()Lcom/paypal/oslo/feature/settings/data/model/SettingsItemMockResponse;", "component2", "component3", "copy", "(Lcom/paypal/oslo/feature/settings/data/model/SettingsItemMockResponse;Lcom/paypal/oslo/feature/settings/data/model/SettingsItemMockResponse;Lcom/paypal/oslo/feature/settings/data/model/SettingsItemMockResponse;)Lcom/paypal/oslo/feature/settings/data/model/HelpAndSupportMockResponse;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/settings/data/model/SettingsItemMockResponse;", "getMessageCenter", "getHelpCenter", "getPaypalAssistant"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class HelpAndSupportMockResponse {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse helpCenter;
    private final com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse messageCenter;
    private final com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse paypalAssistant;

    public HelpAndSupportMockResponse(com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse settingsItemMockResponse, com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse settingsItemMockResponse2, com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse settingsItemMockResponse3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsItemMockResponse, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsItemMockResponse2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsItemMockResponse3, "");
        this.messageCenter = settingsItemMockResponse;
        this.helpCenter = settingsItemMockResponse2;
        this.paypalAssistant = settingsItemMockResponse3;
    }

    public final com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse getMessageCenter() {
        return this.messageCenter;
    }

    public final com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse getHelpCenter() {
        return this.helpCenter;
    }

    public final com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse getPaypalAssistant() {
        return this.paypalAssistant;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse settingsItemMockResponse = this.messageCenter;
        com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse settingsItemMockResponse2 = this.helpCenter;
        com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse settingsItemMockResponse3 = this.paypalAssistant;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HelpAndSupportMockResponse(messageCenter=");
        sb.append(settingsItemMockResponse);
        sb.append(", helpCenter=");
        sb.append(settingsItemMockResponse2);
        sb.append(", paypalAssistant=");
        sb.append(settingsItemMockResponse3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.messageCenter.hashCode() * 31) + this.helpCenter.hashCode()) * 31) + this.paypalAssistant.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.settings.data.model.HelpAndSupportMockResponse)) {
            return false;
        }
        com.paypal.oslo.feature.settings.data.model.HelpAndSupportMockResponse helpAndSupportMockResponse = (com.paypal.oslo.feature.settings.data.model.HelpAndSupportMockResponse) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.messageCenter, helpAndSupportMockResponse.messageCenter) && kotlin.jvm.internal.Intrinsics.areEqual(this.helpCenter, helpAndSupportMockResponse.helpCenter) && kotlin.jvm.internal.Intrinsics.areEqual(this.paypalAssistant, helpAndSupportMockResponse.paypalAssistant);
    }

    public final com.paypal.oslo.feature.settings.data.model.HelpAndSupportMockResponse copy(com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse messageCenter, com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse helpCenter, com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse paypalAssistant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageCenter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(helpCenter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paypalAssistant, "");
        return new com.paypal.oslo.feature.settings.data.model.HelpAndSupportMockResponse(messageCenter, helpCenter, paypalAssistant);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse getPaypalAssistant() {
        return this.paypalAssistant;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse getHelpCenter() {
        return this.helpCenter;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse getMessageCenter() {
        return this.messageCenter;
    }

    public static /* synthetic */ com.paypal.oslo.feature.settings.data.model.HelpAndSupportMockResponse copy$default(com.paypal.oslo.feature.settings.data.model.HelpAndSupportMockResponse helpAndSupportMockResponse, com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse settingsItemMockResponse, com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse settingsItemMockResponse2, com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse settingsItemMockResponse3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            settingsItemMockResponse = helpAndSupportMockResponse.messageCenter;
        }
        if ((i & 2) != 0) {
            settingsItemMockResponse2 = helpAndSupportMockResponse.helpCenter;
        }
        if ((i & 4) != 0) {
            settingsItemMockResponse3 = helpAndSupportMockResponse.paypalAssistant;
        }
        return helpAndSupportMockResponse.copy(settingsItemMockResponse, settingsItemMockResponse2, settingsItemMockResponse3);
    }
}
