package com.paypal.oslo.feature.oneonboarding.data.parser;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J?\u0010\u000e\u001a&\u0012\u0004\u0012\u00020\n\u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00060\u000b0\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/data/parser/OneOnboardingComponentParser;", "", "Lcom/paypal/oslo/feature/oneonboarding/data/parser/registry/StepComponentParserRegistry;", "stepParserRegistry", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/data/parser/registry/StepComponentParserRegistry;)V", "", "Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$Step;", "gqlSteps", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/oneonboarding/domain/error/FlowStepError;", "Lkotlin/Pair;", "Lcom/paypal/oslo/feature/oneonboarding/domain/StepComponentConfig;", "Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;", "parseSteps", "(Ljava/util/List;)Larrow/core/Either;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/oneonboarding/data/parser/registry/StepComponentParserRegistry;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OneOnboardingComponentParser {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.oneonboarding.data.parser.registry.StepComponentParserRegistry getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public OneOnboardingComponentParser(com.paypal.oslo.feature.oneonboarding.data.parser.registry.StepComponentParserRegistry stepComponentParserRegistry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepComponentParserRegistry, "");
        this.getHighResolutionOutputSizeshNQ4ISI = stepComponentParserRegistry;
    }

    public final arrow.core.Either<com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError, kotlin.Pair<java.util.List<com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig>, java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>>> parseSteps(java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Step> gqlSteps) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gqlSteps, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Step step : gqlSteps) {
                kotlin.Pair<com.paypal.oslo.feature.oneonboarding.data.parser.StepComponentParser<?, com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig>, java.lang.Object> parserWithFragment = this.getHighResolutionOutputSizeshNQ4ISI.getParserWithFragment(step);
                if (parserWithFragment != null) {
                    com.paypal.oslo.feature.oneonboarding.data.parser.StepComponentParser<?, com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig> component1 = parserWithFragment.component1();
                    java.lang.Object component2 = parserWithFragment.component2();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(component1, "");
                    kotlin.Pair<com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig, java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> parse = component1.parse(component2);
                    if (parse != null) {
                        com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig component12 = parse.component1();
                        java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo> component22 = parse.component2();
                        arrayList.add(component12);
                        arrayList2.addAll(component22);
                    } else {
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.oneonboarding.LoggerKt.log, "Failed to parse component", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TYPENAME, step.get__typename())), null, null, 12, null);
                        defaultRaise2.raise(new com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GenericError(step.get__typename()));
                        throw new kotlin.KotlinNothingValueException();
                    }
                } else {
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.oneonboarding.LoggerKt.log, "Unknown component", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TYPENAME, step.get__typename())), null, null, 12, null);
                    defaultRaise2.raise(new com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GenericError(step.get__typename()));
                    throw new kotlin.KotlinNothingValueException();
                }
            }
            kotlin.Pair pair = kotlin.TuplesKt.to(arrayList, arrayList2);
            defaultRaise.complete();
            return new arrow.core.Either.Right(pair);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }
}
