package com.paypal.oslo.feature.settings.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemStatus;", "status", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemStatus;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemStatus;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemStatus;)Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemStatus;", "getStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SettingsItemData {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status;
    private final java.lang.String value;

    public SettingsItemData(java.lang.String str, com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus settingsItemStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.value = str;
        this.status = settingsItemStatus;
    }

    public /* synthetic */ SettingsItemData(java.lang.String str, com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus settingsItemStatus, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : settingsItemStatus);
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus getStatus() {
        return this.status;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.value;
        com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus settingsItemStatus = this.status;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SettingsItemData(value=");
        sb.append(str);
        sb.append(", status=");
        sb.append(settingsItemStatus);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.value.hashCode();
        com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus settingsItemStatus = this.status;
        return (hashCode * 31) + (settingsItemStatus == null ? 0 : settingsItemStatus.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.settings.domain.model.SettingsItemData)) {
            return false;
        }
        com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData = (com.paypal.oslo.feature.settings.domain.model.SettingsItemData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.value, settingsItemData.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, settingsItemData.status);
    }

    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData copy(java.lang.String value, com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return new com.paypal.oslo.feature.settings.domain.model.SettingsItemData(value, status);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus getStatus() {
        return this.status;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    public static /* synthetic */ com.paypal.oslo.feature.settings.domain.model.SettingsItemData copy$default(com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData, java.lang.String str, com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus settingsItemStatus, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = settingsItemData.value;
        }
        if ((i & 2) != 0) {
            settingsItemStatus = settingsItemData.status;
        }
        return settingsItemData.copy(str, settingsItemStatus);
    }
}
