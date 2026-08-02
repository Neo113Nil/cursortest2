package com.paypal.oslo.feature.savings.domain.model.savingshub.dto;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/PromoTileDTO;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/PromoZoneBaseDTO;", "", "iconName", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/Action;", "action", "dismissAction", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/Action;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/Action;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/Action;", "component3", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/Action;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/Action;)Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/PromoTileDTO;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getIconName", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/Action;", "getAction", "getDismissAction"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PromoTileDTO implements com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoZoneBaseDTO {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action action;
    private final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action dismissAction;
    private final java.lang.String iconName;

    public PromoTileDTO(java.lang.String str, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action action, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action action2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.iconName = str;
        this.action = action;
        this.dismissAction = action2;
    }

    public final java.lang.String getIconName() {
        return this.iconName;
    }

    public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action getAction() {
        return this.action;
    }

    public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action getDismissAction() {
        return this.dismissAction;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.iconName;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action action = this.action;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action action2 = this.dismissAction;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PromoTileDTO(iconName=");
        sb.append(str);
        sb.append(", action=");
        sb.append(action);
        sb.append(", dismissAction=");
        sb.append(action2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.iconName.hashCode();
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action action = this.action;
        int hashCode2 = action == null ? 0 : action.hashCode();
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action action2 = this.dismissAction;
        return (((hashCode * 31) + hashCode2) * 31) + (action2 != null ? action2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoTileDTO)) {
            return false;
        }
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoTileDTO promoTileDTO = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoTileDTO) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.iconName, promoTileDTO.iconName) && kotlin.jvm.internal.Intrinsics.areEqual(this.action, promoTileDTO.action) && kotlin.jvm.internal.Intrinsics.areEqual(this.dismissAction, promoTileDTO.dismissAction);
    }

    public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoTileDTO copy(java.lang.String iconName, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action action, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action dismissAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iconName, "");
        return new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoTileDTO(iconName, action, dismissAction);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action getDismissAction() {
        return this.dismissAction;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action getAction() {
        return this.action;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getIconName() {
        return this.iconName;
    }

    public static /* synthetic */ com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoTileDTO copy$default(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoTileDTO promoTileDTO, java.lang.String str, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action action, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action action2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = promoTileDTO.iconName;
        }
        if ((i & 2) != 0) {
            action = promoTileDTO.action;
        }
        if ((i & 4) != 0) {
            action2 = promoTileDTO.dismissAction;
        }
        return promoTileDTO.copy(str, action, action2);
    }
}
