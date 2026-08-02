package com.paypal.oslo.feature.settings.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0011J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0011J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0011J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0011J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0011J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0011J~\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b-\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b.\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b/\u0010\u0011R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b0\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b1\u0010\u0011R\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b2\u0010\u0011R\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b3\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/model/PaymentPreferencesSettingsData;", "", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;", "onlinePayments", "yourSubscriptions", "linkedBusinesses", "inStorePayments", "moneyManagement", "paypalBalance", "paypalCredit", "paypalCashbackCard", "paypalSavings", "autoSave", "crypto", "<init>", "(Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;)V", "component1", "()Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;)Lcom/paypal/oslo/feature/settings/domain/model/PaymentPreferencesSettingsData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;", "getOnlinePayments", "getYourSubscriptions", "getLinkedBusinesses", "getInStorePayments", "getMoneyManagement", "getPaypalBalance", "getPaypalCredit", "getPaypalCashbackCard", "getPaypalSavings", "getAutoSave", "getCrypto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PaymentPreferencesSettingsData {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.settings.domain.model.SettingsItemData autoSave;
    private final com.paypal.oslo.feature.settings.domain.model.SettingsItemData crypto;
    private final com.paypal.oslo.feature.settings.domain.model.SettingsItemData inStorePayments;
    private final com.paypal.oslo.feature.settings.domain.model.SettingsItemData linkedBusinesses;
    private final com.paypal.oslo.feature.settings.domain.model.SettingsItemData moneyManagement;
    private final com.paypal.oslo.feature.settings.domain.model.SettingsItemData onlinePayments;
    private final com.paypal.oslo.feature.settings.domain.model.SettingsItemData paypalBalance;
    private final com.paypal.oslo.feature.settings.domain.model.SettingsItemData paypalCashbackCard;
    private final com.paypal.oslo.feature.settings.domain.model.SettingsItemData paypalCredit;
    private final com.paypal.oslo.feature.settings.domain.model.SettingsItemData paypalSavings;
    private final com.paypal.oslo.feature.settings.domain.model.SettingsItemData yourSubscriptions;

    public PaymentPreferencesSettingsData(com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData, com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData2, com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData3, com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData4, com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData5, com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData6, com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData7, com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData8, com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData9, com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData10, com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData11) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsItemData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsItemData2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsItemData3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsItemData4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsItemData5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsItemData6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsItemData7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsItemData8, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsItemData9, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsItemData10, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsItemData11, "");
        this.onlinePayments = settingsItemData;
        this.yourSubscriptions = settingsItemData2;
        this.linkedBusinesses = settingsItemData3;
        this.inStorePayments = settingsItemData4;
        this.moneyManagement = settingsItemData5;
        this.paypalBalance = settingsItemData6;
        this.paypalCredit = settingsItemData7;
        this.paypalCashbackCard = settingsItemData8;
        this.paypalSavings = settingsItemData9;
        this.autoSave = settingsItemData10;
        this.crypto = settingsItemData11;
    }

    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getOnlinePayments() {
        return this.onlinePayments;
    }

    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getYourSubscriptions() {
        return this.yourSubscriptions;
    }

    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getLinkedBusinesses() {
        return this.linkedBusinesses;
    }

    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getInStorePayments() {
        return this.inStorePayments;
    }

    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getMoneyManagement() {
        return this.moneyManagement;
    }

    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getPaypalBalance() {
        return this.paypalBalance;
    }

    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getPaypalCredit() {
        return this.paypalCredit;
    }

    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getPaypalCashbackCard() {
        return this.paypalCashbackCard;
    }

    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getPaypalSavings() {
        return this.paypalSavings;
    }

    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getAutoSave() {
        return this.autoSave;
    }

    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getCrypto() {
        return this.crypto;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData = this.onlinePayments;
        com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData2 = this.yourSubscriptions;
        com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData3 = this.linkedBusinesses;
        com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData4 = this.inStorePayments;
        com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData5 = this.moneyManagement;
        com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData6 = this.paypalBalance;
        com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData7 = this.paypalCredit;
        com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData8 = this.paypalCashbackCard;
        com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData9 = this.paypalSavings;
        com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData10 = this.autoSave;
        com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData11 = this.crypto;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentPreferencesSettingsData(onlinePayments=");
        sb.append(settingsItemData);
        sb.append(", yourSubscriptions=");
        sb.append(settingsItemData2);
        sb.append(", linkedBusinesses=");
        sb.append(settingsItemData3);
        sb.append(", inStorePayments=");
        sb.append(settingsItemData4);
        sb.append(", moneyManagement=");
        sb.append(settingsItemData5);
        sb.append(", paypalBalance=");
        sb.append(settingsItemData6);
        sb.append(", paypalCredit=");
        sb.append(settingsItemData7);
        sb.append(", paypalCashbackCard=");
        sb.append(settingsItemData8);
        sb.append(", paypalSavings=");
        sb.append(settingsItemData9);
        sb.append(", autoSave=");
        sb.append(settingsItemData10);
        sb.append(", crypto=");
        sb.append(settingsItemData11);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((((((((this.onlinePayments.hashCode() * 31) + this.yourSubscriptions.hashCode()) * 31) + this.linkedBusinesses.hashCode()) * 31) + this.inStorePayments.hashCode()) * 31) + this.moneyManagement.hashCode()) * 31) + this.paypalBalance.hashCode()) * 31) + this.paypalCredit.hashCode()) * 31) + this.paypalCashbackCard.hashCode()) * 31) + this.paypalSavings.hashCode()) * 31) + this.autoSave.hashCode()) * 31) + this.crypto.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.settings.domain.model.PaymentPreferencesSettingsData)) {
            return false;
        }
        com.paypal.oslo.feature.settings.domain.model.PaymentPreferencesSettingsData paymentPreferencesSettingsData = (com.paypal.oslo.feature.settings.domain.model.PaymentPreferencesSettingsData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.onlinePayments, paymentPreferencesSettingsData.onlinePayments) && kotlin.jvm.internal.Intrinsics.areEqual(this.yourSubscriptions, paymentPreferencesSettingsData.yourSubscriptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.linkedBusinesses, paymentPreferencesSettingsData.linkedBusinesses) && kotlin.jvm.internal.Intrinsics.areEqual(this.inStorePayments, paymentPreferencesSettingsData.inStorePayments) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyManagement, paymentPreferencesSettingsData.moneyManagement) && kotlin.jvm.internal.Intrinsics.areEqual(this.paypalBalance, paymentPreferencesSettingsData.paypalBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.paypalCredit, paymentPreferencesSettingsData.paypalCredit) && kotlin.jvm.internal.Intrinsics.areEqual(this.paypalCashbackCard, paymentPreferencesSettingsData.paypalCashbackCard) && kotlin.jvm.internal.Intrinsics.areEqual(this.paypalSavings, paymentPreferencesSettingsData.paypalSavings) && kotlin.jvm.internal.Intrinsics.areEqual(this.autoSave, paymentPreferencesSettingsData.autoSave) && kotlin.jvm.internal.Intrinsics.areEqual(this.crypto, paymentPreferencesSettingsData.crypto);
    }

    public final com.paypal.oslo.feature.settings.domain.model.PaymentPreferencesSettingsData copy(com.paypal.oslo.feature.settings.domain.model.SettingsItemData onlinePayments, com.paypal.oslo.feature.settings.domain.model.SettingsItemData yourSubscriptions, com.paypal.oslo.feature.settings.domain.model.SettingsItemData linkedBusinesses, com.paypal.oslo.feature.settings.domain.model.SettingsItemData inStorePayments, com.paypal.oslo.feature.settings.domain.model.SettingsItemData moneyManagement, com.paypal.oslo.feature.settings.domain.model.SettingsItemData paypalBalance, com.paypal.oslo.feature.settings.domain.model.SettingsItemData paypalCredit, com.paypal.oslo.feature.settings.domain.model.SettingsItemData paypalCashbackCard, com.paypal.oslo.feature.settings.domain.model.SettingsItemData paypalSavings, com.paypal.oslo.feature.settings.domain.model.SettingsItemData autoSave, com.paypal.oslo.feature.settings.domain.model.SettingsItemData crypto) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onlinePayments, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yourSubscriptions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedBusinesses, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inStorePayments, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyManagement, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paypalBalance, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paypalCredit, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paypalCashbackCard, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paypalSavings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoSave, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crypto, "");
        return new com.paypal.oslo.feature.settings.domain.model.PaymentPreferencesSettingsData(onlinePayments, yourSubscriptions, linkedBusinesses, inStorePayments, moneyManagement, paypalBalance, paypalCredit, paypalCashbackCard, paypalSavings, autoSave, crypto);
    }

    /* renamed from: component9, reason: from getter */
    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getPaypalSavings() {
        return this.paypalSavings;
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getPaypalCashbackCard() {
        return this.paypalCashbackCard;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getPaypalCredit() {
        return this.paypalCredit;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getPaypalBalance() {
        return this.paypalBalance;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getMoneyManagement() {
        return this.moneyManagement;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getInStorePayments() {
        return this.inStorePayments;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getLinkedBusinesses() {
        return this.linkedBusinesses;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getYourSubscriptions() {
        return this.yourSubscriptions;
    }

    /* renamed from: component11, reason: from getter */
    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getCrypto() {
        return this.crypto;
    }

    /* renamed from: component10, reason: from getter */
    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getAutoSave() {
        return this.autoSave;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getOnlinePayments() {
        return this.onlinePayments;
    }
}
