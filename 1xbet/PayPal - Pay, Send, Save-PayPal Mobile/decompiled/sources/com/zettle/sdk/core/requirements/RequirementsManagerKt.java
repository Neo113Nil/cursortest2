package com.zettle.sdk.core.requirements;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/zettle/sdk/core/requirements/RequirementsManagerDep$State;", "", "Lcom/zettle/sdk/core/requirements/RequirementDep;", "filterBy", com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER, "(Lcom/zettle/sdk/core/requirements/RequirementsManagerDep$State;Ljava/util/List;)Lcom/zettle/sdk/core/requirements/RequirementsManagerDep$State;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RequirementsManagerKt {
    public static final com.zettle.sdk.core.requirements.RequirementsManagerDep.State filter(com.zettle.sdk.core.requirements.RequirementsManagerDep.State state, java.util.List<? extends com.zettle.sdk.core.requirements.RequirementDep> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        if (state instanceof com.zettle.sdk.core.requirements.RequirementsManagerDep.State.Denied) {
            java.util.List<com.zettle.sdk.core.requirements.RequirementDep> requirements = ((com.zettle.sdk.core.requirements.RequirementsManagerDep.State.Denied) state).getRequirements();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : requirements) {
                if (list.contains((com.zettle.sdk.core.requirements.RequirementDep) obj)) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = arrayList;
            if (arrayList2.isEmpty()) {
                return com.zettle.sdk.core.requirements.RequirementsManagerDep.State.Granted.INSTANCE;
            }
            return new com.zettle.sdk.core.requirements.RequirementsManagerDep.State.Denied(arrayList2);
        }
        if (state instanceof com.zettle.sdk.core.requirements.RequirementsManagerDep.State.Granted) {
            return state;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
