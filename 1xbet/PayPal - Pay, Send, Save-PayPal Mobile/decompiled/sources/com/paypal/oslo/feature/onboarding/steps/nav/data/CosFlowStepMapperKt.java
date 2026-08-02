package com.paypal.oslo.feature.onboarding.steps.nav.data;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0007*\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\n*\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\u0012H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\b*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\bH\u0000¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/mapper/ErrorMapper;", "errorMapper", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/StepError;", "mapToStepError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/mapper/ErrorMapper;)Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/StepError;", "Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$Data;", "Lkotlin/Pair;", "", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;", "", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/StepKey;", "mapToSteps", "(Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$Data;)Lkotlin/Pair;", "Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$Progress;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/Progress;", "mapProgress", "(Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$Progress;)Lcom/paypal/oslo/feature/oneonboarding/api/domain/Progress;", "Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$SupportedTransition;", "Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Transition;", "mapSupportedTransitions", "(Ljava/util/List;)Ljava/util/Set;", "mapSupportedTransition", "(Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$SupportedTransition;)Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Transition;", "Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$FlowDatum;", "Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/FlowData;", "mapFlowData", "(Ljava/util/List;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CosFlowStepMapperKt {
    public static final com.paypal.oslo.feature.onboarding.steps.nav.domain.StepError mapToStepError(com.paypal.oslo.core.network.graphql.error.CallError callError, com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper.ErrorMapper errorMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMapper, "");
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError mapToApiCallError = errorMapper.mapToApiCallError(callError);
        return new com.paypal.oslo.feature.onboarding.steps.nav.domain.StepError(com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallErrorKt.toErrorDetails(mapToApiCallError), mapToApiCallError);
    }

    public static final kotlin.Pair<java.util.List<com.paypal.oslo.feature.onboarding.steps.nav.domain.Step>, java.util.Set<com.paypal.oslo.feature.onboarding.steps.nav.domain.StepKey>> mapToSteps(com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Data data) {
        java.util.List<com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnboardingFlowStep> onboardingFlowSteps;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        if (data != null && (onboardingFlowSteps = data.getOnboardingFlowSteps()) != null) {
            for (com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnboardingFlowStep onboardingFlowStep : onboardingFlowSteps) {
                java.lang.String m16021constructorimpl = com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16021constructorimpl(onboardingFlowStep.getFlowId());
                com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step = new com.paypal.oslo.feature.onboarding.steps.nav.domain.Step(m16021constructorimpl, m16021constructorimpl, com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16030constructorimpl(onboardingFlowStep.getPageId()), mapSupportedTransitions(onboardingFlowStep.getSupportedTransitions()), mapFlowData(onboardingFlowStep.getFlowData()), mapProgress(onboardingFlowStep.getProgress()), (kotlin.jvm.internal.DefaultConstructorMarker) null);
                arrayList.add(step);
                java.util.List<com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.SupportedTransition> supportedTransitions = onboardingFlowStep.getSupportedTransitions();
                java.util.LinkedHashSet linkedHashSet2 = null;
                if (supportedTransitions != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj : supportedTransitions) {
                        if (((com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.SupportedTransition) obj).getPrefetchable()) {
                            arrayList2.add(obj);
                        }
                    }
                    java.util.LinkedHashSet linkedHashSet3 = new java.util.LinkedHashSet();
                    java.util.Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition mapSupportedTransition = mapSupportedTransition((com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.SupportedTransition) it.next());
                        com.paypal.oslo.feature.onboarding.steps.nav.domain.StepKey stepKey = mapSupportedTransition != null ? new com.paypal.oslo.feature.onboarding.steps.nav.domain.StepKey(step.m16522getFlowId8NcbBzM(), step.m16524getStepIdeVUBM90(), mapSupportedTransition, null) : null;
                        if (stepKey != null) {
                            linkedHashSet3.add(stepKey);
                        }
                    }
                    linkedHashSet2 = linkedHashSet3;
                }
                if (linkedHashSet2 == null) {
                    linkedHashSet2 = kotlin.collections.SetsKt.emptySet();
                }
                linkedHashSet.addAll(linkedHashSet2);
            }
        }
        return new kotlin.Pair<>(arrayList, linkedHashSet);
    }

    public static final com.paypal.oslo.feature.oneonboarding.api.domain.Progress mapProgress(com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Progress progress) {
        int intValue;
        if (progress != null) {
            com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnOnboardingContinuousProgress onOnboardingContinuousProgress = progress.getOnOnboardingContinuousProgress();
            com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnOnboardingSegmentedProgress onOnboardingSegmentedProgress = progress.getOnOnboardingSegmentedProgress();
            if (onOnboardingContinuousProgress != null) {
                java.lang.Integer currentProgress = onOnboardingContinuousProgress.getCurrentProgress();
                intValue = currentProgress != null ? currentProgress.intValue() : 0;
                com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Range range = onOnboardingContinuousProgress.getRange();
                return new com.paypal.oslo.feature.oneonboarding.api.domain.Progress(intValue, range != null ? new com.paypal.oslo.feature.oneonboarding.api.domain.Range(range.getStart(), range.getEnd()) : null, com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.ContinuousProgress.INSTANCE);
            }
            if (onOnboardingSegmentedProgress != null) {
                java.lang.Integer currentProgress2 = onOnboardingSegmentedProgress.getCurrentProgress();
                intValue = currentProgress2 != null ? currentProgress2.intValue() : 0;
                com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Range1 range2 = onOnboardingSegmentedProgress.getRange();
                return new com.paypal.oslo.feature.oneonboarding.api.domain.Progress(intValue, range2 != null ? new com.paypal.oslo.feature.oneonboarding.api.domain.Range(range2.getStart(), range2.getEnd()) : null, new com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.SegmentedProgress(onOnboardingSegmentedProgress.getCurrentSegment(), onOnboardingSegmentedProgress.getTotalSegments()));
            }
        }
        return null;
    }

    public static final java.util.Set<com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition> mapSupportedTransitions(java.util.List<com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.SupportedTransition> list) {
        java.util.Set createSetBuilder = kotlin.collections.SetsKt.createSetBuilder();
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition mapSupportedTransition = mapSupportedTransition((com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.SupportedTransition) it.next());
                if (mapSupportedTransition != null) {
                    createSetBuilder.add(mapSupportedTransition);
                }
            }
        }
        return kotlin.collections.SetsKt.build(createSetBuilder);
    }

    public static final com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition mapSupportedTransition(com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.SupportedTransition supportedTransition) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedTransition, "");
        int i = com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepMapperKt.WhenMappings.$EnumSwitchMapping$0[supportedTransition.getTransition().ordinal()];
        if (i == 1) {
            return new com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Next(null, supportedTransition.getPrefetchable(), 1, null);
        }
        if (i == 2) {
            return new com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Skip(supportedTransition.getPrefetchable());
        }
        if (i == 3) {
            return new com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Close(supportedTransition.getPrefetchable());
        }
        if (i == 4) {
            return new com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Fail(supportedTransition.getPrefetchable());
        }
        if (i == 5) {
            return null;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final java.util.List<com.paypal.oslo.feature.onboarding.api.steps.nav.domain.FlowData> mapFlowData(java.util.List<com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.FlowDatum> list) {
        java.util.List<com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.FlowDatum> filterNotNull;
        java.util.ArrayList arrayList = null;
        if (list != null && (filterNotNull = kotlin.collections.CollectionsKt.filterNotNull(list)) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.FlowDatum flowDatum : filterNotNull) {
                com.paypal.oslo.feature.onboarding.api.steps.nav.domain.FlowData flowData = (flowDatum.getKey() == null || flowDatum.getValue() == null) ? null : new com.paypal.oslo.feature.onboarding.api.steps.nav.domain.FlowData(flowDatum.getKey(), flowDatum.getValue());
                if (flowData != null) {
                    arrayList2.add(flowData);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.OnboardingTransition.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.OnboardingTransition.NEXT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.OnboardingTransition.SKIP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.OnboardingTransition.CLOSE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.OnboardingTransition.FAIL.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.OnboardingTransition.UNKNOWN__.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
