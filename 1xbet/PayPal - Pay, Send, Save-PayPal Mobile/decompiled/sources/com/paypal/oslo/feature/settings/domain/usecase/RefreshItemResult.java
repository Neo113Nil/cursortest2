package com.paypal.oslo.feature.settings.domain.usecase;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/usecase/RefreshItemResult;", "", "Lcom/paypal/oslo/feature/settings/domain/model/SettingSection;", "section", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemStatus;", "statusFlow", "<init>", "(Lcom/paypal/oslo/feature/settings/domain/model/SettingSection;Lkotlinx/coroutines/flow/Flow;)V", "component1", "()Lcom/paypal/oslo/feature/settings/domain/model/SettingSection;", "component2", "()Lkotlinx/coroutines/flow/Flow;", "copy", "(Lcom/paypal/oslo/feature/settings/domain/model/SettingSection;Lkotlinx/coroutines/flow/Flow;)Lcom/paypal/oslo/feature/settings/domain/usecase/RefreshItemResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingSection;", "getSection", "Lkotlinx/coroutines/flow/Flow;", "getStatusFlow"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RefreshItemResult {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.settings.domain.model.SettingSection section;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus> statusFlow;

    /* JADX WARN: Multi-variable type inference failed */
    public RefreshItemResult(com.paypal.oslo.feature.settings.domain.model.SettingSection settingSection, kotlinx.coroutines.flow.Flow<? extends com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus> flow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingSection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        this.section = settingSection;
        this.statusFlow = flow;
    }

    public final com.paypal.oslo.feature.settings.domain.model.SettingSection getSection() {
        return this.section;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus> getStatusFlow() {
        return this.statusFlow;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.settings.domain.model.SettingSection settingSection = this.section;
        kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus> flow = this.statusFlow;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RefreshItemResult(section=");
        sb.append(settingSection);
        sb.append(", statusFlow=");
        sb.append(flow);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.section.hashCode() * 31) + this.statusFlow.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.settings.domain.usecase.RefreshItemResult)) {
            return false;
        }
        com.paypal.oslo.feature.settings.domain.usecase.RefreshItemResult refreshItemResult = (com.paypal.oslo.feature.settings.domain.usecase.RefreshItemResult) other;
        return this.section == refreshItemResult.section && kotlin.jvm.internal.Intrinsics.areEqual(this.statusFlow, refreshItemResult.statusFlow);
    }

    public final com.paypal.oslo.feature.settings.domain.usecase.RefreshItemResult copy(com.paypal.oslo.feature.settings.domain.model.SettingSection section, kotlinx.coroutines.flow.Flow<? extends com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus> statusFlow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusFlow, "");
        return new com.paypal.oslo.feature.settings.domain.usecase.RefreshItemResult(section, statusFlow);
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus> component2() {
        return this.statusFlow;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.settings.domain.model.SettingSection getSection() {
        return this.section;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.settings.domain.usecase.RefreshItemResult copy$default(com.paypal.oslo.feature.settings.domain.usecase.RefreshItemResult refreshItemResult, com.paypal.oslo.feature.settings.domain.model.SettingSection settingSection, kotlinx.coroutines.flow.Flow flow, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            settingSection = refreshItemResult.section;
        }
        if ((i & 2) != 0) {
            flow = refreshItemResult.statusFlow;
        }
        return refreshItemResult.copy(settingSection, flow);
    }
}
