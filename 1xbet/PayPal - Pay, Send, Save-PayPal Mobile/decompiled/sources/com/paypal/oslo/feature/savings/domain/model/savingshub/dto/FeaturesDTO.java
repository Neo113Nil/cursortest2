package com.paypal.oslo.feature.savings.domain.model.savingshub.dto;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/FeaturesDTO;", "", "", "smartRoute", "", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/AutoSaveConfig;", "autoSave", "<init>", "(ZLjava/util/List;)V", "component1", "()Z", "component2", "()Ljava/util/List;", "copy", "(ZLjava/util/List;)Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/FeaturesDTO;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getSmartRoute", "Ljava/util/List;", "getAutoSave"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class FeaturesDTO {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.AutoSaveConfig> autoSave;
    private final boolean smartRoute;

    public FeaturesDTO(boolean z, java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.AutoSaveConfig> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.smartRoute = z;
        this.autoSave = list;
    }

    public final boolean getSmartRoute() {
        return this.smartRoute;
    }

    public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.AutoSaveConfig> getAutoSave() {
        return this.autoSave;
    }

    public final java.lang.String toString() {
        boolean z = this.smartRoute;
        java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.AutoSaveConfig> list = this.autoSave;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FeaturesDTO(smartRoute=");
        sb.append(z);
        sb.append(", autoSave=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Boolean.hashCode(this.smartRoute) * 31) + this.autoSave.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.savings.domain.model.savingshub.dto.FeaturesDTO)) {
            return false;
        }
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.FeaturesDTO featuresDTO = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.FeaturesDTO) other;
        return this.smartRoute == featuresDTO.smartRoute && kotlin.jvm.internal.Intrinsics.areEqual(this.autoSave, featuresDTO.autoSave);
    }

    public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.FeaturesDTO copy(boolean smartRoute, java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.AutoSaveConfig> autoSave) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoSave, "");
        return new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.FeaturesDTO(smartRoute, autoSave);
    }

    public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.AutoSaveConfig> component2() {
        return this.autoSave;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSmartRoute() {
        return this.smartRoute;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.savings.domain.model.savingshub.dto.FeaturesDTO copy$default(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.FeaturesDTO featuresDTO, boolean z, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = featuresDTO.smartRoute;
        }
        if ((i & 2) != 0) {
            list = featuresDTO.autoSave;
        }
        return featuresDTO.copy(z, list);
    }
}
