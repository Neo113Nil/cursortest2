package com.paypal.oslo.feature.settings.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/model/NotificationPreferencesSettingsData;", "", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;", "generalNotifications", "pushNotifications", "smsAndEmail", "marketing", "<init>", "(Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;)V", "component1", "()Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;", "component2", "component3", "component4", "copy", "(Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;)Lcom/paypal/oslo/feature/settings/domain/model/NotificationPreferencesSettingsData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;", "getGeneralNotifications", "getPushNotifications", "getSmsAndEmail", "getMarketing"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class NotificationPreferencesSettingsData {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.settings.domain.model.SettingsItemData generalNotifications;
    private final com.paypal.oslo.feature.settings.domain.model.SettingsItemData marketing;
    private final com.paypal.oslo.feature.settings.domain.model.SettingsItemData pushNotifications;
    private final com.paypal.oslo.feature.settings.domain.model.SettingsItemData smsAndEmail;

    public NotificationPreferencesSettingsData(com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData, com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData2, com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData3, com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsItemData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsItemData2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsItemData3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsItemData4, "");
        this.generalNotifications = settingsItemData;
        this.pushNotifications = settingsItemData2;
        this.smsAndEmail = settingsItemData3;
        this.marketing = settingsItemData4;
    }

    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getGeneralNotifications() {
        return this.generalNotifications;
    }

    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getPushNotifications() {
        return this.pushNotifications;
    }

    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getSmsAndEmail() {
        return this.smsAndEmail;
    }

    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getMarketing() {
        return this.marketing;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData = this.generalNotifications;
        com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData2 = this.pushNotifications;
        com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData3 = this.smsAndEmail;
        com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData4 = this.marketing;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NotificationPreferencesSettingsData(generalNotifications=");
        sb.append(settingsItemData);
        sb.append(", pushNotifications=");
        sb.append(settingsItemData2);
        sb.append(", smsAndEmail=");
        sb.append(settingsItemData3);
        sb.append(", marketing=");
        sb.append(settingsItemData4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.generalNotifications.hashCode() * 31) + this.pushNotifications.hashCode()) * 31) + this.smsAndEmail.hashCode()) * 31) + this.marketing.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.settings.domain.model.NotificationPreferencesSettingsData)) {
            return false;
        }
        com.paypal.oslo.feature.settings.domain.model.NotificationPreferencesSettingsData notificationPreferencesSettingsData = (com.paypal.oslo.feature.settings.domain.model.NotificationPreferencesSettingsData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.generalNotifications, notificationPreferencesSettingsData.generalNotifications) && kotlin.jvm.internal.Intrinsics.areEqual(this.pushNotifications, notificationPreferencesSettingsData.pushNotifications) && kotlin.jvm.internal.Intrinsics.areEqual(this.smsAndEmail, notificationPreferencesSettingsData.smsAndEmail) && kotlin.jvm.internal.Intrinsics.areEqual(this.marketing, notificationPreferencesSettingsData.marketing);
    }

    public final com.paypal.oslo.feature.settings.domain.model.NotificationPreferencesSettingsData copy(com.paypal.oslo.feature.settings.domain.model.SettingsItemData generalNotifications, com.paypal.oslo.feature.settings.domain.model.SettingsItemData pushNotifications, com.paypal.oslo.feature.settings.domain.model.SettingsItemData smsAndEmail, com.paypal.oslo.feature.settings.domain.model.SettingsItemData marketing) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(generalNotifications, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotifications, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smsAndEmail, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marketing, "");
        return new com.paypal.oslo.feature.settings.domain.model.NotificationPreferencesSettingsData(generalNotifications, pushNotifications, smsAndEmail, marketing);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getMarketing() {
        return this.marketing;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getSmsAndEmail() {
        return this.smsAndEmail;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getPushNotifications() {
        return this.pushNotifications;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getGeneralNotifications() {
        return this.generalNotifications;
    }

    public static /* synthetic */ com.paypal.oslo.feature.settings.domain.model.NotificationPreferencesSettingsData copy$default(com.paypal.oslo.feature.settings.domain.model.NotificationPreferencesSettingsData notificationPreferencesSettingsData, com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData, com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData2, com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData3, com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            settingsItemData = notificationPreferencesSettingsData.generalNotifications;
        }
        if ((i & 2) != 0) {
            settingsItemData2 = notificationPreferencesSettingsData.pushNotifications;
        }
        if ((i & 4) != 0) {
            settingsItemData3 = notificationPreferencesSettingsData.smsAndEmail;
        }
        if ((i & 8) != 0) {
            settingsItemData4 = notificationPreferencesSettingsData.marketing;
        }
        return notificationPreferencesSettingsData.copy(settingsItemData, settingsItemData2, settingsItemData3, settingsItemData4);
    }
}
