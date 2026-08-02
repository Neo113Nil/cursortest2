package com.paypal.oslo.feature.savings.domain.model.savingshub.dto;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ*\u0010\n\u001a\u00020\u00002\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R'\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalZoneDTO;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/SavingsHubTileDTO;", "Ljava/util/ArrayList;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "Lkotlin/collections/getHighSpeedVideoFpsRanges;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityAvatarIconConstants.KEY_GENERIC_GOALS_VALUE, "<init>", "(Ljava/util/ArrayList;)V", "component1", "()Ljava/util/ArrayList;", "copy", "(Ljava/util/ArrayList;)Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalZoneDTO;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/ArrayList;", "getGoals"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GoalZoneDTO implements com.paypal.oslo.feature.savings.domain.model.savingshub.dto.SavingsHubTileDTO {
    public static final int $stable = 8;
    private final java.util.ArrayList<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> goals;

    public GoalZoneDTO(java.util.ArrayList<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> arrayList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "");
        this.goals = arrayList;
    }

    public final java.util.ArrayList<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> getGoals() {
        return this.goals;
    }

    public final java.lang.String toString() {
        java.util.ArrayList<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> arrayList = this.goals;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GoalZoneDTO(goals=");
        sb.append(arrayList);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.goals.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO) && kotlin.jvm.internal.Intrinsics.areEqual(this.goals, ((com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO) other).goals);
    }

    public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO copy(java.util.ArrayList<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> goals) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goals, "");
        return new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO(goals);
    }

    public final java.util.ArrayList<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> component1() {
        return this.goals;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO copy$default(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO goalZoneDTO, java.util.ArrayList arrayList, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            arrayList = goalZoneDTO.goals;
        }
        return goalZoneDTO.copy(arrayList);
    }
}
