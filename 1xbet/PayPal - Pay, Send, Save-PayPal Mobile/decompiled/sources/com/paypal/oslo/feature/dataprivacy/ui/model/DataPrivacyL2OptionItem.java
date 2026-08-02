package com.paypal.oslo.feature.dataprivacy.ui.model;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/ui/model/DataPrivacyL2OptionItem;", "", "", "id", "", "titleResId", "Lcom/paypal/oslo/feature/dataprivacy/ui/model/DataPrivacyL2Settings;", "settingType", "Landroidx/navigation3/runtime/NavKey;", "destination", "<init>", "(Ljava/lang/String;ILcom/paypal/oslo/feature/dataprivacy/ui/model/DataPrivacyL2Settings;Landroidx/navigation3/runtime/NavKey;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Lcom/paypal/oslo/feature/dataprivacy/ui/model/DataPrivacyL2Settings;", "component4", "()Landroidx/navigation3/runtime/NavKey;", "copy", "(Ljava/lang/String;ILcom/paypal/oslo/feature/dataprivacy/ui/model/DataPrivacyL2Settings;Landroidx/navigation3/runtime/NavKey;)Lcom/paypal/oslo/feature/dataprivacy/ui/model/DataPrivacyL2OptionItem;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getId", com.visa.cbp.getEncExpo.warmup, "getTitleResId", "Lcom/paypal/oslo/feature/dataprivacy/ui/model/DataPrivacyL2Settings;", "getSettingType", "Landroidx/navigation3/runtime/NavKey;", "getDestination"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DataPrivacyL2OptionItem {
    public static final int $stable = 8;
    private final androidx.navigation3.runtime.NavKey destination;
    private final java.lang.String id;
    private final com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings settingType;
    private final int titleResId;

    public DataPrivacyL2OptionItem(java.lang.String str, int i, com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings dataPrivacyL2Settings, androidx.navigation3.runtime.NavKey navKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataPrivacyL2Settings, "");
        this.id = str;
        this.titleResId = i;
        this.settingType = dataPrivacyL2Settings;
        this.destination = navKey;
    }

    public /* synthetic */ DataPrivacyL2OptionItem(java.lang.String str, int i, com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings dataPrivacyL2Settings, androidx.navigation3.runtime.NavKey navKey, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, dataPrivacyL2Settings, (i2 & 8) != 0 ? null : navKey);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final int getTitleResId() {
        return this.titleResId;
    }

    public final com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings getSettingType() {
        return this.settingType;
    }

    public final androidx.navigation3.runtime.NavKey getDestination() {
        return this.destination;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        int i = this.titleResId;
        com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings dataPrivacyL2Settings = this.settingType;
        androidx.navigation3.runtime.NavKey navKey = this.destination;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DataPrivacyL2OptionItem(id=");
        sb.append(str);
        sb.append(", titleResId=");
        sb.append(i);
        sb.append(", settingType=");
        sb.append(dataPrivacyL2Settings);
        sb.append(", destination=");
        sb.append(navKey);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = java.lang.Integer.hashCode(this.titleResId);
        int hashCode3 = this.settingType.hashCode();
        androidx.navigation3.runtime.NavKey navKey = this.destination;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (navKey == null ? 0 : navKey.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2OptionItem)) {
            return false;
        }
        com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2OptionItem dataPrivacyL2OptionItem = (com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2OptionItem) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, dataPrivacyL2OptionItem.id) && this.titleResId == dataPrivacyL2OptionItem.titleResId && this.settingType == dataPrivacyL2OptionItem.settingType && kotlin.jvm.internal.Intrinsics.areEqual(this.destination, dataPrivacyL2OptionItem.destination);
    }

    public final com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2OptionItem copy(java.lang.String id, int titleResId, com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings settingType, androidx.navigation3.runtime.NavKey destination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingType, "");
        return new com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2OptionItem(id, titleResId, settingType, destination);
    }

    /* renamed from: component4, reason: from getter */
    public final androidx.navigation3.runtime.NavKey getDestination() {
        return this.destination;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings getSettingType() {
        return this.settingType;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTitleResId() {
        return this.titleResId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2OptionItem copy$default(com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2OptionItem dataPrivacyL2OptionItem, java.lang.String str, int i, com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings dataPrivacyL2Settings, androidx.navigation3.runtime.NavKey navKey, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = dataPrivacyL2OptionItem.id;
        }
        if ((i2 & 2) != 0) {
            i = dataPrivacyL2OptionItem.titleResId;
        }
        if ((i2 & 4) != 0) {
            dataPrivacyL2Settings = dataPrivacyL2OptionItem.settingType;
        }
        if ((i2 & 8) != 0) {
            navKey = dataPrivacyL2OptionItem.destination;
        }
        return dataPrivacyL2OptionItem.copy(str, i, dataPrivacyL2Settings, navKey);
    }
}
