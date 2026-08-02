package com.paypal.oslo.feature.oneonboarding.ui.mvi.reducers;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState$Submitting;", "state", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent;", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiEffect;", "reduceSubmittingState", "(Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState$Submitting;Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent;)Larrow/core/Either;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SubmittingStateReducerKt {
    public static final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState, com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect>> reduceSubmittingState(com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Submitting submitting, com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent oneOnboardingEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(submitting, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingEvent, "");
        if (oneOnboardingEvent instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.CloseFlow) {
            com.paypal.oslo.feature.oneonboarding.api.domain.Status status = ((com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.CloseFlow) oneOnboardingEvent).getStatus();
            if (status == null) {
                status = com.paypal.oslo.feature.oneonboarding.api.domain.Status.CANCELED;
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.TerminalStatus(status), new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.CompleteFlow(new com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult(status, submitting.getFlow().getStatusDetails())));
        }
        if (!(oneOnboardingEvent instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.SystemEvent.FlowLoaded)) {
            if (oneOnboardingEvent instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.SystemEvent.FlowLoadFailed) {
                com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.SystemEvent.FlowLoadFailed flowLoadFailed = (com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.SystemEvent.FlowLoadFailed) oneOnboardingEvent;
                com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError error = flowLoadFailed.getError();
                if (error instanceof com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.CollectedItemsError) {
                    java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo> contextualInfo = ((com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.CollectedItemsError) error).getContextualInfo();
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    for (java.lang.Object obj : contextualInfo) {
                        com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId m16607boximpl = com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16607boximpl(((com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo) obj).m16706getComponentIdfHLlpbY());
                        java.lang.Object obj2 = linkedHashMap.get(m16607boximpl);
                        if (obj2 == null) {
                            obj2 = (java.util.List) new java.util.ArrayList();
                            linkedHashMap.put(m16607boximpl, obj2);
                        }
                        ((java.util.List) obj2).add(obj);
                    }
                    com.paypal.oslo.feature.oneonboarding.domain.Flow copy$default = com.paypal.oslo.feature.oneonboarding.domain.Flow.copy$default(submitting.getFlow(), null, null, null, null, linkedHashMap, 15, null);
                    com.paypal.oslo.feature.oneonboarding.domain.Flow flow = submitting.getFlow();
                    java.util.Set keySet = linkedHashMap.keySet();
                    java.util.Iterator<com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig> it = flow.getSteps().iterator();
                    int i = 0;
                    loop1: while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                            break;
                        }
                        com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig next = it.next();
                        if (keySet.contains(com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16607boximpl(next.mo16702getIdfHLlpbY()))) {
                            break;
                        }
                        java.util.Set<com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId> keySet2 = next.getComponentMap().keySet();
                        if (!(keySet2 instanceof java.util.Collection) || !keySet2.isEmpty()) {
                            java.util.Iterator<T> it2 = keySet2.iterator();
                            while (it2.hasNext()) {
                                if (keySet.contains(com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16607boximpl(((com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId) it2.next()).m16614unboximpl()))) {
                                    break loop1;
                                }
                            }
                        }
                        i++;
                    }
                    int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(i, 0);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Content(copy$default, coerceAtLeast), new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.HandleStepBack(flowLoadFailed.getIntentId(), copy$default.getSteps().get(coerceAtLeast), kotlin.collections.CollectionsKt.getLastIndex(submitting.getFlow().getSteps()) - coerceAtLeast));
                }
                com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.Submit submit = new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.Submit(submitting.getFlow().getIntentId(), submitting.getCollectedItems());
                com.paypal.oslo.feature.oneonboarding.domain.Flow flow2 = submitting.getFlow();
                int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(flow2.getSteps()) - 1;
                com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig stepComponentConfig = (com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig) kotlin.collections.CollectionsKt.getOrNull(flow2.getSteps(), lastIndex);
                if (stepComponentConfig != null && !(stepComponentConfig instanceof com.paypal.oslo.feature.oneonboarding.inventory.steps.modulelauncher.domain.ModuleLauncherStepComponentConfig)) {
                    com.paypal.oslo.feature.oneonboarding.domain.Flow copy$default2 = com.paypal.oslo.feature.oneonboarding.domain.Flow.copy$default(flow2, null, null, null, null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16607boximpl(stepComponentConfig.mo16702getIdfHLlpbY()), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo(stepComponentConfig.mo16702getIdfHLlpbY(), flowLoadFailed.getError().getIssue(), null, 4, null)))), 15, null);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Content(copy$default2, lastIndex), new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.HandleStepBack(flowLoadFailed.getIntentId(), copy$default2.getSteps().get(lastIndex), 1));
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Error(flowLoadFailed.getIntentId(), flowLoadFailed.getError(), submit), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(submitting, oneOnboardingEvent);
        }
        com.paypal.oslo.feature.oneonboarding.domain.Flow flow3 = ((com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.SystemEvent.FlowLoaded) oneOnboardingEvent).getFlow();
        if (flow3.getSteps().isEmpty()) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.TerminalStatus(flow3.getStatus()), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Content(flow3, 0), new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.HandleStepForward(flow3.getIntentId(), (com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig) kotlin.collections.CollectionsKt.first((java.util.List) flow3.getSteps()), true));
    }
}
