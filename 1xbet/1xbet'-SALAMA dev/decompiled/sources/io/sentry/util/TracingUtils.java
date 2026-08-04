package io.sentry.util;

import R5.F;
import io.sentry.Baggage;
import io.sentry.BaggageHeader;
import io.sentry.FilterString;
import io.sentry.IScope;
import io.sentry.IScopes;
import io.sentry.ISpan;
import io.sentry.NoOpLogger;
import io.sentry.PropagationContext;
import io.sentry.SentryOptions;
import io.sentry.SentryTraceHeader;
import io.sentry.TracesSamplingDecision;
import java.util.Iterator;
import java.util.List;
import p056h4.i;

/* JADX INFO: loaded from: classes2.dex */
public final class TracingUtils {

    public static final class PropagationContextHolder {
        private PropagationContext propagationContext;

        private PropagationContextHolder() {
            this.propagationContext = null;
        }
    }

    public static final class TracingHeaders {
        private final BaggageHeader baggageHeader;
        private final SentryTraceHeader sentryTraceHeader;

        public TracingHeaders(SentryTraceHeader sentryTraceHeader, BaggageHeader baggageHeader) {
            this.sentryTraceHeader = sentryTraceHeader;
            this.baggageHeader = baggageHeader;
        }

        public BaggageHeader getBaggageHeader() {
            return this.baggageHeader;
        }

        public SentryTraceHeader getSentryTraceHeader() {
            return this.sentryTraceHeader;
        }
    }

    public static Baggage ensureBaggage(Baggage baggage, TracesSamplingDecision tracesSamplingDecision) {
        return ensureBaggage(baggage, tracesSamplingDecision == null ? null : tracesSamplingDecision.getSampled(), tracesSamplingDecision == null ? null : tracesSamplingDecision.getSampleRate(), tracesSamplingDecision != null ? tracesSamplingDecision.getSampleRand() : null);
    }

    public static boolean isIgnored(List<FilterString> list, String str) {
        if (str != null && list != null && !list.isEmpty()) {
            Iterator<FilterString> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().getFilterString().equalsIgnoreCase(str)) {
                    return true;
                }
            }
            Iterator<FilterString> it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    if (it2.next().matches(str)) {
                        return true;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$maybeUpdateBaggage$5(IScope iScope, SentryOptions sentryOptions, PropagationContext propagationContext) {
        Baggage baggage = propagationContext.getBaggage();
        if (baggage.isMutable()) {
            baggage.setValuesFromScope(iScope, sentryOptions);
            baggage.freeze();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setTrace$3(PropagationContext propagationContext, IScope iScope) {
        iScope.withPropagationContext(new a(1, iScope, propagationContext));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startNewTrace$0(IScope iScope, PropagationContext propagationContext) {
        iScope.setPropagationContext(new PropagationContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startNewTrace$1(IScope iScope) {
        iScope.withPropagationContext(new F(iScope, 14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$trace$4(PropagationContextHolder propagationContextHolder, SentryOptions sentryOptions, IScope iScope) {
        propagationContextHolder.propagationContext = maybeUpdateBaggage(iScope, sentryOptions);
    }

    public static PropagationContext maybeUpdateBaggage(IScope iScope, SentryOptions sentryOptions) {
        return iScope.withPropagationContext(new a(2, iScope, sentryOptions));
    }

    public static void setTrace(IScopes iScopes, PropagationContext propagationContext) {
        iScopes.configureScope(new F(propagationContext, 13));
    }

    private static boolean shouldAttachTracingHeaders(String str, SentryOptions sentryOptions) {
        return PropagationTargetsUtils.contain(sentryOptions.getTracePropagationTargets(), str);
    }

    public static void startNewTrace(IScopes iScopes) {
        iScopes.configureScope(new i(7));
    }

    public static TracingHeaders trace(IScopes iScopes, List<String> list, ISpan iSpan) {
        SentryOptions options = iScopes.getOptions();
        if (iSpan != null && !iSpan.isNoOp()) {
            return new TracingHeaders(iSpan.toSentryTrace(), iSpan.toBaggageHeader(list));
        }
        PropagationContextHolder propagationContextHolder = new PropagationContextHolder();
        iScopes.configureScope(new a(0, propagationContextHolder, options));
        if (propagationContextHolder.propagationContext == null) {
            return null;
        }
        PropagationContext propagationContext = propagationContextHolder.propagationContext;
        return new TracingHeaders(new SentryTraceHeader(propagationContext.getTraceId(), propagationContext.getSpanId(), propagationContext.isSampled()), BaggageHeader.fromBaggageAndOutgoingHeader(propagationContext.getBaggage(), list));
    }

    public static TracingHeaders traceIfAllowed(IScopes iScopes, String str, List<String> list, ISpan iSpan) {
        SentryOptions options = iScopes.getOptions();
        if (options.isTraceSampling() && shouldAttachTracingHeaders(str, options)) {
            return trace(iScopes, list, iSpan);
        }
        return null;
    }

    public static Baggage ensureBaggage(Baggage baggage, Boolean bool, Double d7, Double d8) {
        if (baggage == null) {
            baggage = new Baggage(NoOpLogger.getInstance());
        }
        if (baggage.getSampleRand() == null) {
            Double sampleRate = baggage.getSampleRate();
            if (sampleRate != null) {
                d7 = sampleRate;
            }
            baggage.setSampleRand(SampleRateUtils.backfilledSampleRand(d8, d7, bool));
        }
        if (baggage.isMutable() && baggage.isShouldFreeze()) {
            baggage.freeze();
        }
        return baggage;
    }
}
