package com.paypal.oslo.feature.bnplservicing.data.mapper.plansOverview;

@kotlin.Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\n\u001a\u00060\bj\u0002`\t*\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0015\u0010\u000f\u001a\u00060\rj\u0002`\u000e*\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012*\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0015\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016*\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0011\u0010\u001b\u001a\u00020\u001a*\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001f\u001a\u00020\u001e*\u00020\u001d¢\u0006\u0004\b\u001f\u0010 \u001a\u0011\u0010#\u001a\u00020\"*\u00020!¢\u0006\u0004\b#\u0010$\u001a\u0011\u0010'\u001a\u00020&*\u00020%¢\u0006\u0004\b'\u0010(\u001a\u0011\u0010+\u001a\u00020**\u00020)¢\u0006\u0004\b+\u0010,\u001a\u0011\u0010/\u001a\u00020.*\u00020-¢\u0006\u0004\b/\u00100\u001a\u0011\u00103\u001a\u000202*\u000201¢\u0006\u0004\b3\u00104\u001a\u0011\u00107\u001a\u000206*\u000205¢\u0006\u0004\b7\u00108"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlansOverview;", "toPlansOverview", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlansOverview;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetPlansOverviewQuery$Data;", "toPlanList", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/GetPlansOverviewQuery$Data;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlansOverview;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/FilterOptions;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlansOverviewFilterOptionsInput;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/type/BNPLPlansOverviewFilterOptionsInput;", "toBNPLPlansOverviewFilterOptionsInput", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/FilterOptions;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlansOverviewFilterOptionsInput;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlanOverviewInput;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlansOverviewInput;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/type/BNPLPlansOverviewInput;", "toBNPLPlansOverviewInput", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlanOverviewInput;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlansOverviewInput;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlansFilterOptionsInput;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/type/BNPLPlansFilterOptionsInput;", "toBNPLPlansFilterOptionsInput", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/FilterOptions;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlansFilterOptionsInput;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlansInput;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/type/BNPLPlansInput;", "toBNPLPlansInput", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlanOverviewInput;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlansInput;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingAlmostCompletePlanFragment;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$AlmostCompletePlan;", "toAlmostCompletePlan", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingAlmostCompletePlanFragment;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$AlmostCompletePlan;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingDelinquentPlanFragment;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$DelinquentPlan;", "toDelinquentPlan", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingDelinquentPlanFragment;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$DelinquentPlan;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingOnTrackPlanFragment;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$OnTrackPlan;", "toOnTrackPlan", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingOnTrackPlanFragment;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$OnTrackPlan;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPastDuePlanFragment;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$PastDuePlan;", "toPastDuePlan", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPastDuePlanFragment;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$PastDuePlan;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPendingPlanFragment;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$PendingPlan;", "toPendingPlan", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPendingPlanFragment;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$PendingPlan;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingReadyToUsePlanFragment;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$ReadyToUsePlan;", "toReadyToUsePlan", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingReadyToUsePlanFragment;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$ReadyToUsePlan;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingCompletedPlanFragment;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$CompletedPlan;", "toCompletedPlan", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingCompletedPlanFragment;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$CompletedPlan;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMaturedPlanFragment;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$MaturedPlan;", "toMaturedPlan", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMaturedPlanFragment;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$MaturedPlan;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PlansOverviewMapperKt {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview toPlansOverview(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment bnplServicingPlansOverviewFragment) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Page1 page;
        java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Item1> items;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CompletedPlan completedPlan;
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Page page2;
        java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Item> items2;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.ReadyToUsePlan readyToUsePlan;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingPlansOverviewFragment, "");
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.BnplServicingActivePlans bnplServicingActivePlans = bnplServicingPlansOverviewFragment.getBnplServicingActivePlans();
        if (bnplServicingActivePlans == null || (page2 = bnplServicingActivePlans.getPage()) == null || (items2 = page2.getItems()) == null) {
            arrayList = null;
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Item item : items2) {
                if (item.getOnBNPLAlmostCompletePlan() != null) {
                    readyToUsePlan = toAlmostCompletePlan(item.getOnBNPLAlmostCompletePlan().getBnplServicingAlmostCompletePlanFragment());
                } else if (item.getOnBNPLCompletedPlan() != null) {
                    readyToUsePlan = toCompletedPlan(item.getOnBNPLCompletedPlan().getBnplServicingCompletedPlanFragment());
                } else if (item.getOnBNPLDelinquentPlan() != null) {
                    readyToUsePlan = toDelinquentPlan(item.getOnBNPLDelinquentPlan().getBnplServicingDelinquentPlanFragment());
                } else if (item.getOnBNPLOnTrackPlan() != null) {
                    readyToUsePlan = toOnTrackPlan(item.getOnBNPLOnTrackPlan().getBnplServicingOnTrackPlanFragment());
                } else if (item.getOnBNPLPastDuePlan() != null) {
                    readyToUsePlan = toPastDuePlan(item.getOnBNPLPastDuePlan().getBnplServicingPastDuePlanFragment());
                } else if (item.getOnBNPLPendingPlan() != null) {
                    readyToUsePlan = toPendingPlan(item.getOnBNPLPendingPlan().getBnplServicingPendingPlanFragment());
                } else if (item.getOnBNPLReadyToUsePlan() != null) {
                    readyToUsePlan = toReadyToUsePlan(item.getOnBNPLReadyToUsePlan().getBnplServicingReadyToUsePlanFragment());
                } else {
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.bnplservicing.LoggerKt.log;
                    java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(item.getClass()).getSimpleName();
                    if (simpleName == null) {
                        simpleName = "";
                    }
                    com.paypal.oslo.feature.bnplservicing.logger.BnplServLoggerUtilsKt.logUnknownMapping(logger, simpleName);
                    readyToUsePlan = null;
                }
                if (readyToUsePlan != null) {
                    arrayList3.add(readyToUsePlan);
                }
            }
            arrayList = arrayList3;
        }
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.BnplServicingHistoryPlans bnplServicingHistoryPlans = bnplServicingPlansOverviewFragment.getBnplServicingHistoryPlans();
        if (bnplServicingHistoryPlans == null || (page = bnplServicingHistoryPlans.getPage()) == null || (items = page.getItems()) == null) {
            arrayList2 = null;
        } else {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Item1 item1 : items) {
                if (item1.getOnBNPLMaturedPlan() != null) {
                    completedPlan = toMaturedPlan(item1.getOnBNPLMaturedPlan().getBnplServicingMaturedPlanFragment());
                } else if (item1.getOnBNPLCompletedPlan() != null) {
                    completedPlan = toCompletedPlan(item1.getOnBNPLCompletedPlan().getBnplServicingCompletedPlanFragment());
                } else {
                    com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.bnplservicing.LoggerKt.log;
                    java.lang.String simpleName2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(item1.getClass()).getSimpleName();
                    if (simpleName2 == null) {
                        simpleName2 = "";
                    }
                    com.paypal.oslo.feature.bnplservicing.logger.BnplServLoggerUtilsKt.logUnknownMapping(logger2, simpleName2);
                    completedPlan = null;
                }
                if (completedPlan != null) {
                    arrayList4.add(completedPlan);
                }
            }
            arrayList2 = arrayList4;
        }
        return new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview(new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanList(arrayList, arrayList2), false, 2, null);
    }

    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview toPlanList(com.paypal.oslo.feature.bnplservicing.graphql.GetPlansOverviewQuery.Data data) {
        if (data == null) {
            return null;
        }
        com.paypal.oslo.feature.bnplservicing.graphql.GetPlansOverviewQuery.BnplUsage bnplUsage = data.getBnplUsage();
        return com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview.copy$default(toPlansOverview(data.getBnplServicingPlansOverviewFragment()), null, bnplUsage != null ? bnplUsage.getHasEverUsed() : true, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewFilterOptionsInput toBNPLPlansOverviewFilterOptionsInput(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.FilterOptions filterOptions) {
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlansPresentmentCategory bNPLServicingPlansPresentmentCategory;
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus> withAnyOfThePlanStatuses;
        java.util.ArrayList arrayList;
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag> withAnyOfTheTags;
        java.util.ArrayList arrayList2;
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> withCreditProductIdentifiers;
        java.util.ArrayList arrayList3;
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag> withNoneOfTheTags;
        java.util.ArrayList arrayList4;
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus> withAccountStatuses;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterOptions, "");
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory plansPresentmentCategory = filterOptions.getPlansPresentmentCategory();
        java.util.ArrayList arrayList5 = null;
        if (plansPresentmentCategory != null) {
            int i = com.paypal.oslo.feature.bnplservicing.data.mapper.plansOverview.PlansOverviewMapperKt.WhenMappings.$EnumSwitchMapping$0[plansPresentmentCategory.ordinal()];
            if (i == 1) {
                bNPLServicingPlansPresentmentCategory = com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlansPresentmentCategory.ACTIVE;
            } else if (i == 2) {
                bNPLServicingPlansPresentmentCategory = com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlansPresentmentCategory.HISTORY;
            } else if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.apollographql.apollo.api.Optional presentIfNotNull = companion.presentIfNotNull(bNPLServicingPlansPresentmentCategory);
            com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
            withAnyOfThePlanStatuses = filterOptions.getWithAnyOfThePlanStatuses();
            if (withAnyOfThePlanStatuses == null) {
                java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus> list = withAnyOfThePlanStatuses;
                java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList6.add(com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanStatus.INSTANCE.safeValueOf(((com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus) it.next()).name()));
                }
                arrayList = arrayList6;
            } else {
                arrayList = null;
            }
            com.apollographql.apollo.api.Optional presentIfNotNull2 = companion2.presentIfNotNull(arrayList);
            com.apollographql.apollo.api.Optional.Companion companion3 = com.apollographql.apollo.api.Optional.INSTANCE;
            withAnyOfTheTags = filterOptions.getWithAnyOfTheTags();
            if (withAnyOfTheTags == null) {
                java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag> list2 = withAnyOfTheTags;
                java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                java.util.Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList7.add(com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags.INSTANCE.safeValueOf(((com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag) it2.next()).name()));
                }
                arrayList2 = arrayList7;
            } else {
                arrayList2 = null;
            }
            com.apollographql.apollo.api.Optional presentIfNotNull3 = companion3.presentIfNotNull(arrayList2);
            com.apollographql.apollo.api.Optional.Companion companion4 = com.apollographql.apollo.api.Optional.INSTANCE;
            withCreditProductIdentifiers = filterOptions.getWithCreditProductIdentifiers();
            if (withCreditProductIdentifiers == null) {
                java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> list3 = withCreditProductIdentifiers;
                java.util.ArrayList arrayList8 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                java.util.Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList8.add(com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier.INSTANCE.safeValueOf(((com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier) it3.next()).name()));
                }
                arrayList3 = arrayList8;
            } else {
                arrayList3 = null;
            }
            com.apollographql.apollo.api.Optional presentIfNotNull4 = companion4.presentIfNotNull(arrayList3);
            com.apollographql.apollo.api.Optional.Companion companion5 = com.apollographql.apollo.api.Optional.INSTANCE;
            withNoneOfTheTags = filterOptions.getWithNoneOfTheTags();
            if (withNoneOfTheTags == null) {
                java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag> list4 = withNoneOfTheTags;
                java.util.ArrayList arrayList9 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
                java.util.Iterator<T> it4 = list4.iterator();
                while (it4.hasNext()) {
                    arrayList9.add(com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags.INSTANCE.safeValueOf(((com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag) it4.next()).name()));
                }
                arrayList4 = arrayList9;
            } else {
                arrayList4 = null;
            }
            com.apollographql.apollo.api.Optional presentIfNotNull5 = companion5.presentIfNotNull(arrayList4);
            com.apollographql.apollo.api.Optional.Companion companion6 = com.apollographql.apollo.api.Optional.INSTANCE;
            withAccountStatuses = filterOptions.getWithAccountStatuses();
            if (withAccountStatuses != null) {
                java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus> list5 = withAccountStatuses;
                java.util.ArrayList arrayList10 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list5, 10));
                java.util.Iterator<T> it5 = list5.iterator();
                while (it5.hasNext()) {
                    arrayList10.add(com.paypal.oslo.api.graphql.schema.type.BNPLAccountStatus.INSTANCE.safeValueOf(((com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus) it5.next()).name()));
                }
                arrayList5 = arrayList10;
            }
            return new com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewFilterOptionsInput(presentIfNotNull, presentIfNotNull2, presentIfNotNull3, presentIfNotNull4, presentIfNotNull5, companion6.presentIfNotNull(arrayList5));
        }
        bNPLServicingPlansPresentmentCategory = null;
        com.apollographql.apollo.api.Optional presentIfNotNull6 = companion.presentIfNotNull(bNPLServicingPlansPresentmentCategory);
        com.apollographql.apollo.api.Optional.Companion companion22 = com.apollographql.apollo.api.Optional.INSTANCE;
        withAnyOfThePlanStatuses = filterOptions.getWithAnyOfThePlanStatuses();
        if (withAnyOfThePlanStatuses == null) {
        }
        com.apollographql.apollo.api.Optional presentIfNotNull22 = companion22.presentIfNotNull(arrayList);
        com.apollographql.apollo.api.Optional.Companion companion32 = com.apollographql.apollo.api.Optional.INSTANCE;
        withAnyOfTheTags = filterOptions.getWithAnyOfTheTags();
        if (withAnyOfTheTags == null) {
        }
        com.apollographql.apollo.api.Optional presentIfNotNull32 = companion32.presentIfNotNull(arrayList2);
        com.apollographql.apollo.api.Optional.Companion companion42 = com.apollographql.apollo.api.Optional.INSTANCE;
        withCreditProductIdentifiers = filterOptions.getWithCreditProductIdentifiers();
        if (withCreditProductIdentifiers == null) {
        }
        com.apollographql.apollo.api.Optional presentIfNotNull42 = companion42.presentIfNotNull(arrayList3);
        com.apollographql.apollo.api.Optional.Companion companion52 = com.apollographql.apollo.api.Optional.INSTANCE;
        withNoneOfTheTags = filterOptions.getWithNoneOfTheTags();
        if (withNoneOfTheTags == null) {
        }
        com.apollographql.apollo.api.Optional presentIfNotNull52 = companion52.presentIfNotNull(arrayList4);
        com.apollographql.apollo.api.Optional.Companion companion62 = com.apollographql.apollo.api.Optional.INSTANCE;
        withAccountStatuses = filterOptions.getWithAccountStatuses();
        if (withAccountStatuses != null) {
        }
        return new com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewFilterOptionsInput(presentIfNotNull6, presentIfNotNull22, presentIfNotNull32, presentIfNotNull42, presentIfNotNull52, companion62.presentIfNotNull(arrayList5));
    }

    public static final com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewInput toBNPLPlansOverviewInput(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanOverviewInput planOverviewInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planOverviewInput, "");
        return new com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewInput(new com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewFlowContextInput(com.paypal.oslo.api.graphql.schema.type.BNPLServicingFlowSpecifier.SELF_SERVICING, com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel.MOBILE_APP), toBNPLPlansOverviewFilterOptionsInput(planOverviewInput.getFilterOptions()), com.apollographql.apollo.api.Optional.Absent.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLPlansFilterOptionsInput toBNPLPlansFilterOptionsInput(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.FilterOptions filterOptions) {
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlansCategory bNPLServicingPlansCategory;
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus> withAnyOfThePlanStatuses;
        java.util.ArrayList arrayList;
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag> withAnyOfTheTags;
        java.util.ArrayList arrayList2;
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> withCreditProductIdentifiers;
        java.util.ArrayList arrayList3;
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag> withNoneOfTheTags;
        java.util.ArrayList arrayList4;
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus> withAccountStatuses;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterOptions, "");
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory plansPresentmentCategory = filterOptions.getPlansPresentmentCategory();
        java.util.ArrayList arrayList5 = null;
        if (plansPresentmentCategory != null) {
            int i = com.paypal.oslo.feature.bnplservicing.data.mapper.plansOverview.PlansOverviewMapperKt.WhenMappings.$EnumSwitchMapping$0[plansPresentmentCategory.ordinal()];
            if (i == 1) {
                bNPLServicingPlansCategory = com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlansCategory.ACTIVE;
            } else if (i == 2) {
                bNPLServicingPlansCategory = com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlansCategory.PLAN_HISTORY;
            } else if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.apollographql.apollo.api.Optional presentIfNotNull = companion.presentIfNotNull(bNPLServicingPlansCategory);
            com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
            withAnyOfThePlanStatuses = filterOptions.getWithAnyOfThePlanStatuses();
            if (withAnyOfThePlanStatuses == null) {
                java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus> list = withAnyOfThePlanStatuses;
                java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList6.add(com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanStatus.INSTANCE.safeValueOf(((com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus) it.next()).name()));
                }
                arrayList = arrayList6;
            } else {
                arrayList = null;
            }
            com.apollographql.apollo.api.Optional presentIfNotNull2 = companion2.presentIfNotNull(arrayList);
            com.apollographql.apollo.api.Optional.Companion companion3 = com.apollographql.apollo.api.Optional.INSTANCE;
            withAnyOfTheTags = filterOptions.getWithAnyOfTheTags();
            if (withAnyOfTheTags == null) {
                java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag> list2 = withAnyOfTheTags;
                java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                java.util.Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList7.add(com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags.INSTANCE.safeValueOf(((com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag) it2.next()).name()));
                }
                arrayList2 = arrayList7;
            } else {
                arrayList2 = null;
            }
            com.apollographql.apollo.api.Optional presentIfNotNull3 = companion3.presentIfNotNull(arrayList2);
            withCreditProductIdentifiers = filterOptions.getWithCreditProductIdentifiers();
            if (withCreditProductIdentifiers == null) {
                java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> list3 = withCreditProductIdentifiers;
                java.util.ArrayList arrayList8 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                java.util.Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList8.add(com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier.INSTANCE.safeValueOf(((com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier) it3.next()).name()));
                }
                arrayList3 = arrayList8;
            } else {
                arrayList3 = null;
            }
            java.util.List emptyList = arrayList3 != null ? kotlin.collections.CollectionsKt.emptyList() : arrayList3;
            com.apollographql.apollo.api.Optional.Companion companion4 = com.apollographql.apollo.api.Optional.INSTANCE;
            withNoneOfTheTags = filterOptions.getWithNoneOfTheTags();
            if (withNoneOfTheTags == null) {
                java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag> list4 = withNoneOfTheTags;
                java.util.ArrayList arrayList9 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
                java.util.Iterator<T> it4 = list4.iterator();
                while (it4.hasNext()) {
                    arrayList9.add(com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags.INSTANCE.safeValueOf(((com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag) it4.next()).name()));
                }
                arrayList4 = arrayList9;
            } else {
                arrayList4 = null;
            }
            com.apollographql.apollo.api.Optional presentIfNotNull4 = companion4.presentIfNotNull(arrayList4);
            com.apollographql.apollo.api.Optional.Companion companion5 = com.apollographql.apollo.api.Optional.INSTANCE;
            withAccountStatuses = filterOptions.getWithAccountStatuses();
            if (withAccountStatuses != null) {
                java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus> list5 = withAccountStatuses;
                java.util.ArrayList arrayList10 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list5, 10));
                java.util.Iterator<T> it5 = list5.iterator();
                while (it5.hasNext()) {
                    arrayList10.add(com.paypal.oslo.api.graphql.schema.type.BNPLAccountStatus.INSTANCE.safeValueOf(((com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus) it5.next()).name()));
                }
                arrayList5 = arrayList10;
            }
            return new com.paypal.oslo.api.graphql.schema.type.BNPLPlansFilterOptionsInput(presentIfNotNull, presentIfNotNull2, presentIfNotNull3, emptyList, presentIfNotNull4, companion5.presentIfNotNull(arrayList5));
        }
        bNPLServicingPlansCategory = null;
        com.apollographql.apollo.api.Optional presentIfNotNull5 = companion.presentIfNotNull(bNPLServicingPlansCategory);
        com.apollographql.apollo.api.Optional.Companion companion22 = com.apollographql.apollo.api.Optional.INSTANCE;
        withAnyOfThePlanStatuses = filterOptions.getWithAnyOfThePlanStatuses();
        if (withAnyOfThePlanStatuses == null) {
        }
        com.apollographql.apollo.api.Optional presentIfNotNull22 = companion22.presentIfNotNull(arrayList);
        com.apollographql.apollo.api.Optional.Companion companion32 = com.apollographql.apollo.api.Optional.INSTANCE;
        withAnyOfTheTags = filterOptions.getWithAnyOfTheTags();
        if (withAnyOfTheTags == null) {
        }
        com.apollographql.apollo.api.Optional presentIfNotNull32 = companion32.presentIfNotNull(arrayList2);
        withCreditProductIdentifiers = filterOptions.getWithCreditProductIdentifiers();
        if (withCreditProductIdentifiers == null) {
        }
        if (arrayList3 != null) {
        }
        com.apollographql.apollo.api.Optional.Companion companion42 = com.apollographql.apollo.api.Optional.INSTANCE;
        withNoneOfTheTags = filterOptions.getWithNoneOfTheTags();
        if (withNoneOfTheTags == null) {
        }
        com.apollographql.apollo.api.Optional presentIfNotNull42 = companion42.presentIfNotNull(arrayList4);
        com.apollographql.apollo.api.Optional.Companion companion52 = com.apollographql.apollo.api.Optional.INSTANCE;
        withAccountStatuses = filterOptions.getWithAccountStatuses();
        if (withAccountStatuses != null) {
        }
        return new com.paypal.oslo.api.graphql.schema.type.BNPLPlansFilterOptionsInput(presentIfNotNull5, presentIfNotNull22, presentIfNotNull32, emptyList, presentIfNotNull42, companion52.presentIfNotNull(arrayList5));
    }

    public static final com.paypal.oslo.api.graphql.schema.type.BNPLPlansInput toBNPLPlansInput(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanOverviewInput planOverviewInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planOverviewInput, "");
        return new com.paypal.oslo.api.graphql.schema.type.BNPLPlansInput(toBNPLPlansFilterOptionsInput(planOverviewInput.getFilterOptions()), com.apollographql.apollo.api.Optional.Absent.INSTANCE, com.apollographql.apollo.api.Optional.Absent.INSTANCE, null, 8, null);
    }

    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.AlmostCompletePlan toAlmostCompletePlan(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAlmostCompletePlanFragment bnplServicingAlmostCompletePlanFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingAlmostCompletePlanFragment, "");
        java.lang.String merchantName = bnplServicingAlmostCompletePlanFragment.getMerchantName();
        java.lang.Object creditAccountId = bnplServicingAlmostCompletePlanFragment.getCreditAccountId();
        java.lang.String str = creditAccountId instanceof java.lang.String ? (java.lang.String) creditAccountId : null;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier from = com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.INSTANCE.from(bnplServicingAlmostCompletePlanFragment.getProduct().getBnplServicingProductFragment().getCreditProductIdentifier().name());
        com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy variantPolicy = com.paypal.oslo.feature.bnplservicing.data.mapper.common.VariantPolicyMapperKt.toVariantPolicy(bnplServicingAlmostCompletePlanFragment.getVariantPolicy().getBnplServicingVariantPolicyFragment());
        java.lang.Object merchantLogoUrl = bnplServicingAlmostCompletePlanFragment.getMerchantLogoUrl();
        java.lang.String str2 = merchantLogoUrl instanceof java.lang.String ? (java.lang.String) merchantLogoUrl : null;
        java.lang.String name2 = bnplServicingAlmostCompletePlanFragment.getProduct().getBnplServicingProductFragment().getName();
        com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus from2 = com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.INSTANCE.from(bnplServicingAlmostCompletePlanFragment.getPlanStatus().name());
        com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.Companion companion = com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.INSTANCE;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanContextualLabel contextualLabel = bnplServicingAlmostCompletePlanFragment.getContextualLabel();
        return new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.AlmostCompletePlan(new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields(str, from, variantPolicy, str2, merchantName, name2, from2, com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(bnplServicingAlmostCompletePlanFragment.getCurrentBalanceAmount().getBnplServicingMoneyFragment()), companion.from(contextualLabel != null ? contextualLabel.name() : null)));
    }

    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.DelinquentPlan toDelinquentPlan(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingDelinquentPlanFragment bnplServicingDelinquentPlanFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingDelinquentPlanFragment, "");
        int totalInstallmentsPaid = bnplServicingDelinquentPlanFragment.getTotalInstallmentsPaid();
        int totalInstallmentsRemaining = bnplServicingDelinquentPlanFragment.getTotalInstallmentsRemaining();
        int totalInstallmentsOverdue = bnplServicingDelinquentPlanFragment.getTotalInstallmentsOverdue();
        int totalInstallmentsCount = bnplServicingDelinquentPlanFragment.getTotalInstallmentsCount();
        java.lang.String merchantName = bnplServicingDelinquentPlanFragment.getMerchantName();
        java.lang.Object creditAccountId = bnplServicingDelinquentPlanFragment.getCreditAccountId();
        java.lang.String str = creditAccountId instanceof java.lang.String ? (java.lang.String) creditAccountId : null;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier from = com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.INSTANCE.from(bnplServicingDelinquentPlanFragment.getProduct().getBnplServicingProductFragment().getCreditProductIdentifier().name());
        com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy variantPolicy = com.paypal.oslo.feature.bnplservicing.data.mapper.common.VariantPolicyMapperKt.toVariantPolicy(bnplServicingDelinquentPlanFragment.getVariantPolicy().getBnplServicingVariantPolicyFragment());
        java.lang.Object merchantLogoUrl = bnplServicingDelinquentPlanFragment.getMerchantLogoUrl();
        java.lang.String str2 = merchantLogoUrl instanceof java.lang.String ? (java.lang.String) merchantLogoUrl : null;
        java.lang.String name2 = bnplServicingDelinquentPlanFragment.getProduct().getBnplServicingProductFragment().getName();
        com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus from2 = com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.INSTANCE.from(bnplServicingDelinquentPlanFragment.getPlanStatus().name());
        com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.Companion companion = com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.INSTANCE;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanContextualLabel contextualLabel = bnplServicingDelinquentPlanFragment.getContextualLabel();
        return new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.DelinquentPlan(totalInstallmentsPaid, totalInstallmentsOverdue, totalInstallmentsRemaining, totalInstallmentsCount, new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields(str, from, variantPolicy, str2, merchantName, name2, from2, com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(bnplServicingDelinquentPlanFragment.getOverdueAmount().getBnplServicingMoneyFragment()), companion.from(contextualLabel != null ? contextualLabel.name() : null)));
    }

    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.OnTrackPlan toOnTrackPlan(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment bnplServicingOnTrackPlanFragment) {
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingOnTrackPlanFragment, "");
        int totalInstallmentsPaid = bnplServicingOnTrackPlanFragment.getTotalInstallmentsPaid();
        int totalInstallmentsRemaining = bnplServicingOnTrackPlanFragment.getTotalInstallmentsRemaining();
        int totalInstallmentsCount = bnplServicingOnTrackPlanFragment.getTotalInstallmentsCount();
        boolean isDueToday = bnplServicingOnTrackPlanFragment.isDueToday();
        java.lang.Object nextPaymentDueDate = bnplServicingOnTrackPlanFragment.getNextPaymentDueDate();
        java.lang.String str = nextPaymentDueDate instanceof java.lang.String ? (java.lang.String) nextPaymentDueDate : null;
        java.lang.String merchantName = bnplServicingOnTrackPlanFragment.getMerchantName();
        java.lang.Object creditAccountId = bnplServicingOnTrackPlanFragment.getCreditAccountId();
        java.lang.String str2 = creditAccountId instanceof java.lang.String ? (java.lang.String) creditAccountId : null;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier from = com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.INSTANCE.from(bnplServicingOnTrackPlanFragment.getProduct().getBnplServicingProductFragment().getCreditProductIdentifier().name());
        com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy variantPolicy = com.paypal.oslo.feature.bnplservicing.data.mapper.common.VariantPolicyMapperKt.toVariantPolicy(bnplServicingOnTrackPlanFragment.getVariantPolicy().getBnplServicingVariantPolicyFragment());
        java.lang.Object merchantLogoUrl = bnplServicingOnTrackPlanFragment.getMerchantLogoUrl();
        java.lang.String str3 = merchantLogoUrl instanceof java.lang.String ? (java.lang.String) merchantLogoUrl : null;
        java.lang.String name2 = bnplServicingOnTrackPlanFragment.getProduct().getBnplServicingProductFragment().getName();
        com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus from2 = com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.INSTANCE.from(bnplServicingOnTrackPlanFragment.getPlanStatus().name());
        com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.Companion companion = com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.INSTANCE;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanContextualLabel contextualLabel = bnplServicingOnTrackPlanFragment.getContextualLabel();
        com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel from3 = companion.from(contextualLabel != null ? contextualLabel.name() : null);
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment.CurrentPaymentDue currentPaymentDue = bnplServicingOnTrackPlanFragment.getCurrentPaymentDue();
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money = bnplServicingOnTrackPlanFragment.isDueToday() ? (currentPaymentDue == null || (bnplServicingMoneyFragment = currentPaymentDue.getBnplServicingMoneyFragment()) == null) ? null : com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(bnplServicingMoneyFragment) : null;
        return new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.OnTrackPlan(totalInstallmentsPaid, totalInstallmentsRemaining, totalInstallmentsCount, isDueToday, str, new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields(str2, from, variantPolicy, str3, merchantName, name2, from2, money == null ? com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(bnplServicingOnTrackPlanFragment.getNextPaymentDueAmount().getBnplServicingMoneyFragment()) : money, from3));
    }

    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PastDuePlan toPastDuePlan(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragment bnplServicingPastDuePlanFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingPastDuePlanFragment, "");
        int totalInstallmentsPaid = bnplServicingPastDuePlanFragment.getTotalInstallmentsPaid();
        int totalInstallmentsRemaining = bnplServicingPastDuePlanFragment.getTotalInstallmentsRemaining();
        int totalInstallmentsCount = bnplServicingPastDuePlanFragment.getTotalInstallmentsCount();
        int totalInstallmentsOverdue = bnplServicingPastDuePlanFragment.getTotalInstallmentsOverdue();
        java.lang.String merchantName = bnplServicingPastDuePlanFragment.getMerchantName();
        java.lang.Object creditAccountId = bnplServicingPastDuePlanFragment.getCreditAccountId();
        java.lang.String str = creditAccountId instanceof java.lang.String ? (java.lang.String) creditAccountId : null;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier from = com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.INSTANCE.from(bnplServicingPastDuePlanFragment.getProduct().getBnplServicingProductFragment().getCreditProductIdentifier().name());
        com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy variantPolicy = com.paypal.oslo.feature.bnplservicing.data.mapper.common.VariantPolicyMapperKt.toVariantPolicy(bnplServicingPastDuePlanFragment.getVariantPolicy().getBnplServicingVariantPolicyFragment());
        java.lang.Object merchantLogoUrl = bnplServicingPastDuePlanFragment.getMerchantLogoUrl();
        java.lang.String str2 = merchantLogoUrl instanceof java.lang.String ? (java.lang.String) merchantLogoUrl : null;
        java.lang.String name2 = bnplServicingPastDuePlanFragment.getProduct().getBnplServicingProductFragment().getName();
        com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus from2 = com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.INSTANCE.from(bnplServicingPastDuePlanFragment.getPlanStatus().name());
        com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.Companion companion = com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.INSTANCE;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanContextualLabel contextualLabel = bnplServicingPastDuePlanFragment.getContextualLabel();
        return new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PastDuePlan(totalInstallmentsPaid, totalInstallmentsRemaining, totalInstallmentsOverdue, totalInstallmentsCount, new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields(str, from, variantPolicy, str2, merchantName, name2, from2, com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(bnplServicingPastDuePlanFragment.getOverdueAmount().getBnplServicingMoneyFragment()), companion.from(contextualLabel != null ? contextualLabel.name() : null)));
    }

    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PendingPlan toPendingPlan(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPendingPlanFragment bnplServicingPendingPlanFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingPendingPlanFragment, "");
        int totalInstallmentsPaid = bnplServicingPendingPlanFragment.getTotalInstallmentsPaid();
        int totalInstallmentsRemaining = bnplServicingPendingPlanFragment.getTotalInstallmentsRemaining();
        int totalInstallmentsCount = bnplServicingPendingPlanFragment.getTotalInstallmentsCount();
        java.lang.String merchantName = bnplServicingPendingPlanFragment.getMerchantName();
        java.lang.Object creditAccountId = bnplServicingPendingPlanFragment.getCreditAccountId();
        java.lang.String str = creditAccountId instanceof java.lang.String ? (java.lang.String) creditAccountId : null;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier from = com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.INSTANCE.from(bnplServicingPendingPlanFragment.getProduct().getBnplServicingProductFragment().getCreditProductIdentifier().name());
        com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy variantPolicy = com.paypal.oslo.feature.bnplservicing.data.mapper.common.VariantPolicyMapperKt.toVariantPolicy(bnplServicingPendingPlanFragment.getVariantPolicy().getBnplServicingVariantPolicyFragment());
        java.lang.Object merchantLogoUrl = bnplServicingPendingPlanFragment.getMerchantLogoUrl();
        java.lang.String str2 = merchantLogoUrl instanceof java.lang.String ? (java.lang.String) merchantLogoUrl : null;
        java.lang.String name2 = bnplServicingPendingPlanFragment.getProduct().getBnplServicingProductFragment().getName();
        com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus from2 = com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.INSTANCE.from(bnplServicingPendingPlanFragment.getPlanStatus().name());
        com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.Companion companion = com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.INSTANCE;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanContextualLabel contextualLabel = bnplServicingPendingPlanFragment.getContextualLabel();
        return new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PendingPlan(totalInstallmentsPaid, totalInstallmentsRemaining, totalInstallmentsCount, new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields(str, from, variantPolicy, str2, merchantName, name2, from2, com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(bnplServicingPendingPlanFragment.getPurchaseAmount().getBnplServicingMoneyFragment()), companion.from(contextualLabel != null ? contextualLabel.name() : null)));
    }

    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.ReadyToUsePlan toReadyToUsePlan(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragment bnplServicingReadyToUsePlanFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingReadyToUsePlanFragment, "");
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money = com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(bnplServicingReadyToUsePlanFragment.getApprovedLoanAmount().getBnplServicingMoneyFragment());
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingVirtualCardFragment.CardArt cardArt = bnplServicingReadyToUsePlanFragment.getVirtualCard().getBnplServicingVirtualCardFragment().getCardArt();
        java.lang.Object validityDuration = bnplServicingReadyToUsePlanFragment.getValidityDuration();
        java.lang.String str = validityDuration instanceof java.lang.String ? (java.lang.String) validityDuration : null;
        java.lang.Object url = cardArt.getUrl();
        java.lang.String str2 = url instanceof java.lang.String ? (java.lang.String) url : null;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.Object thumbnailUrl = cardArt.getThumbnailUrl();
        java.lang.String str3 = thumbnailUrl instanceof java.lang.String ? (java.lang.String) thumbnailUrl : null;
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.VirtualCard.CardArt cardArt2 = new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.VirtualCard.CardArt(str2, str3 != null ? str3 : "");
        java.lang.Object creditAccountId = bnplServicingReadyToUsePlanFragment.getCreditAccountId();
        java.lang.String str4 = creditAccountId instanceof java.lang.String ? (java.lang.String) creditAccountId : null;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier from = com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.INSTANCE.from(bnplServicingReadyToUsePlanFragment.getProduct().getBnplServicingProductFragment().getCreditProductIdentifier().name());
        com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy variantPolicy = com.paypal.oslo.feature.bnplservicing.data.mapper.common.VariantPolicyMapperKt.toVariantPolicy(bnplServicingReadyToUsePlanFragment.getVariantPolicy().getBnplServicingVariantPolicyFragment());
        java.lang.Object merchantLogoUrl = bnplServicingReadyToUsePlanFragment.getMerchantLogoUrl();
        java.lang.String str5 = merchantLogoUrl instanceof java.lang.String ? (java.lang.String) merchantLogoUrl : null;
        java.lang.String name2 = bnplServicingReadyToUsePlanFragment.getProduct().getBnplServicingProductFragment().getName();
        com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus from2 = com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.INSTANCE.from(bnplServicingReadyToUsePlanFragment.getPlanStatus().name());
        com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.Companion companion = com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.INSTANCE;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanContextualLabel contextualLabel = bnplServicingReadyToUsePlanFragment.getContextualLabel();
        return new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.ReadyToUsePlan(cardArt2, str, new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields(str4, from, variantPolicy, str5, "", name2, from2, money, companion.from(contextualLabel != null ? contextualLabel.name() : null)));
    }

    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CompletedPlan toCompletedPlan(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragment bnplServicingCompletedPlanFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingCompletedPlanFragment, "");
        int totalInstallmentsPaid = bnplServicingCompletedPlanFragment.getTotalInstallmentsPaid();
        int totalInstallmentsRemaining = bnplServicingCompletedPlanFragment.getTotalInstallmentsRemaining();
        int totalInstallmentsCount = bnplServicingCompletedPlanFragment.getTotalInstallmentsCount();
        boolean isRefundPending = bnplServicingCompletedPlanFragment.isRefundPending();
        java.lang.Object planCompletedDateTime = bnplServicingCompletedPlanFragment.getPlanCompletedDateTime();
        java.lang.String str = planCompletedDateTime instanceof java.lang.String ? (java.lang.String) planCompletedDateTime : null;
        java.lang.String merchantName = bnplServicingCompletedPlanFragment.getMerchantName();
        java.lang.Object creditAccountId = bnplServicingCompletedPlanFragment.getCreditAccountId();
        java.lang.String str2 = creditAccountId instanceof java.lang.String ? (java.lang.String) creditAccountId : null;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier from = com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.INSTANCE.from(bnplServicingCompletedPlanFragment.getProduct().getBnplServicingProductFragment().getCreditProductIdentifier().name());
        com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy variantPolicy = com.paypal.oslo.feature.bnplservicing.data.mapper.common.VariantPolicyMapperKt.toVariantPolicy(bnplServicingCompletedPlanFragment.getVariantPolicy().getBnplServicingVariantPolicyFragment());
        java.lang.Object merchantLogoUrl = bnplServicingCompletedPlanFragment.getMerchantLogoUrl();
        java.lang.String str3 = merchantLogoUrl instanceof java.lang.String ? (java.lang.String) merchantLogoUrl : null;
        java.lang.String name2 = bnplServicingCompletedPlanFragment.getProduct().getBnplServicingProductFragment().getName();
        com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus from2 = com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.INSTANCE.from(bnplServicingCompletedPlanFragment.getPlanStatus().name());
        com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.Companion companion = com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.INSTANCE;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanContextualLabel contextualLabel = bnplServicingCompletedPlanFragment.getContextualLabel();
        return new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CompletedPlan(str, totalInstallmentsPaid, totalInstallmentsRemaining, totalInstallmentsCount, isRefundPending, new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields(str2, from, variantPolicy, str3, merchantName, name2, from2, com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(bnplServicingCompletedPlanFragment.getPurchaseAmount().getBnplServicingMoneyFragment()), companion.from(contextualLabel != null ? contextualLabel.name() : null)));
    }

    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.MaturedPlan toMaturedPlan(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMaturedPlanFragment bnplServicingMaturedPlanFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingMaturedPlanFragment, "");
        boolean isRefundPending = bnplServicingMaturedPlanFragment.isRefundPending();
        java.lang.Object planCompletedDateTime = bnplServicingMaturedPlanFragment.getPlanCompletedDateTime();
        java.lang.String str = planCompletedDateTime instanceof java.lang.String ? (java.lang.String) planCompletedDateTime : null;
        java.lang.String merchantName = bnplServicingMaturedPlanFragment.getMerchantName();
        java.lang.Object creditAccountId = bnplServicingMaturedPlanFragment.getCreditAccountId();
        java.lang.String str2 = creditAccountId instanceof java.lang.String ? (java.lang.String) creditAccountId : null;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier from = com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.INSTANCE.from(bnplServicingMaturedPlanFragment.getProduct().getBnplServicingProductFragment().getCreditProductIdentifier().name());
        com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy variantPolicy = com.paypal.oslo.feature.bnplservicing.data.mapper.common.VariantPolicyMapperKt.toVariantPolicy(bnplServicingMaturedPlanFragment.getVariantPolicy().getBnplServicingVariantPolicyFragment());
        java.lang.Object merchantLogoUrl = bnplServicingMaturedPlanFragment.getMerchantLogoUrl();
        java.lang.String str3 = merchantLogoUrl instanceof java.lang.String ? (java.lang.String) merchantLogoUrl : null;
        java.lang.String name2 = bnplServicingMaturedPlanFragment.getProduct().getBnplServicingProductFragment().getName();
        com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus from2 = com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.INSTANCE.from(bnplServicingMaturedPlanFragment.getPlanStatus().name());
        com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.Companion companion = com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.INSTANCE;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanContextualLabel contextualLabel = bnplServicingMaturedPlanFragment.getContextualLabel();
        return new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.MaturedPlan(str, isRefundPending, new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields(str2, from, variantPolicy, str3, merchantName, name2, from2, com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(bnplServicingMaturedPlanFragment.getPurchaseAmount().getBnplServicingMoneyFragment()), companion.from(contextualLabel != null ? contextualLabel.name() : null)));
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory.values().length];
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory.ACTIVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory.HISTORY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory.UNKNOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
