package com.datadog.trace.bootstrap.instrumentation.api;

/* loaded from: classes3.dex */
public interface ProfilingContextIntegration extends com.datadog.trace.api.profiling.Profiling {
    default int encode(java.lang.CharSequence charSequence) {
        return 0;
    }

    default int encodeOperationName(java.lang.CharSequence charSequence) {
        return 0;
    }

    default int encodeResourceName(java.lang.CharSequence charSequence) {
        return 0;
    }

    java.lang.String name();

    default void onAttach() {
    }

    default void onDetach() {
    }

    default void onStart() {
    }

    default com.datadog.trace.api.Stateful newScopeState(com.datadog.trace.bootstrap.instrumentation.api.ProfilerContext profilerContext) {
        return com.datadog.trace.api.Stateful.DEFAULT;
    }

    public static final class NoOp implements com.datadog.trace.bootstrap.instrumentation.api.ProfilingContextIntegration {
        public static final com.datadog.trace.bootstrap.instrumentation.api.ProfilingContextIntegration INSTANCE = new com.datadog.trace.bootstrap.instrumentation.api.ProfilingContextIntegration.NoOp();

        @Override // com.datadog.trace.bootstrap.instrumentation.api.ProfilingContextIntegration
        public final void onAttach() {
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.ProfilingContextIntegration
        public final void onDetach() {
        }

        @Override // com.datadog.trace.api.profiling.Profiling
        public final com.datadog.trace.api.profiling.ProfilingContextAttribute createContextAttribute(java.lang.String str) {
            return com.datadog.trace.api.profiling.ProfilingContextAttribute.NoOp.INSTANCE;
        }

        @Override // com.datadog.trace.api.profiling.Profiling
        public final com.datadog.trace.api.profiling.ProfilingScope newScope() {
            return com.datadog.trace.api.profiling.ProfilingScope.NO_OP;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.ProfilingContextIntegration
        public final java.lang.String name() {
            return "none";
        }
    }
}
