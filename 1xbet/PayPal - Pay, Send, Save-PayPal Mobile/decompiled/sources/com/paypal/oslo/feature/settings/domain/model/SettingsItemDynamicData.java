package com.paypal.oslo.feature.settings.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ6\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000eJ\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\fR\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\"\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemDynamicData;", "", "", "itemId", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemStatus;", "conditionalFlow", "", "indexInList", "<init>", "(Ljava/lang/String;Lkotlinx/coroutines/flow/Flow;I)V", "component1", "()Ljava/lang/String;", "component3", "()I", "copy", "(Ljava/lang/String;Lkotlinx/coroutines/flow/Flow;I)Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemDynamicData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getItemId", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/Flow;", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getIndexInList", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "getFlow", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SettingsItemDynamicData {
    public static final int $stable = 8;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus> flow;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus> Camera2StreamConfigurationMap;
    private final int indexInList;
    private final java.lang.String itemId;

    /* JADX WARN: Multi-variable type inference failed */
    public SettingsItemDynamicData(java.lang.String str, kotlinx.coroutines.flow.Flow<? extends com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus> flow, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        this.itemId = str;
        this.Camera2StreamConfigurationMap = flow;
        this.indexInList = i;
        this.flow = i == -1 ? kotlinx.coroutines.flow.FlowKt.flowOf((java.lang.Object) null) : flow;
    }

    public final java.lang.String getItemId() {
        return this.itemId;
    }

    public final int getIndexInList() {
        return this.indexInList;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus> getFlow() {
        return this.flow;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.itemId;
        kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus> flow = this.Camera2StreamConfigurationMap;
        int i = this.indexInList;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SettingsItemDynamicData(itemId=");
        sb.append(str);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(flow);
        sb.append(", indexInList=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.itemId.hashCode() * 31) + this.Camera2StreamConfigurationMap.hashCode()) * 31) + java.lang.Integer.hashCode(this.indexInList);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.settings.domain.model.SettingsItemDynamicData)) {
            return false;
        }
        com.paypal.oslo.feature.settings.domain.model.SettingsItemDynamicData settingsItemDynamicData = (com.paypal.oslo.feature.settings.domain.model.SettingsItemDynamicData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.itemId, settingsItemDynamicData.itemId) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, settingsItemDynamicData.Camera2StreamConfigurationMap) && this.indexInList == settingsItemDynamicData.indexInList;
    }

    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemDynamicData copy(java.lang.String itemId, kotlinx.coroutines.flow.Flow<? extends com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus> conditionalFlow, int indexInList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conditionalFlow, "");
        return new com.paypal.oslo.feature.settings.domain.model.SettingsItemDynamicData(itemId, conditionalFlow, indexInList);
    }

    /* renamed from: component3, reason: from getter */
    public final int getIndexInList() {
        return this.indexInList;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getItemId() {
        return this.itemId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.settings.domain.model.SettingsItemDynamicData copy$default(com.paypal.oslo.feature.settings.domain.model.SettingsItemDynamicData settingsItemDynamicData, java.lang.String str, kotlinx.coroutines.flow.Flow flow, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = settingsItemDynamicData.itemId;
        }
        if ((i2 & 2) != 0) {
            flow = settingsItemDynamicData.Camera2StreamConfigurationMap;
        }
        if ((i2 & 4) != 0) {
            i = settingsItemDynamicData.indexInList;
        }
        return settingsItemDynamicData.copy(str, flow, i);
    }
}
