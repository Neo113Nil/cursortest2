package io.ktor.client.request;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lio/ktor/client/request/HttpSendPipeline;", "Lio/ktor/util/pipeline/Pipeline;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "", "developmentMode", "<init>", "(Z)V", "Z", "getDevelopmentMode", "()Z", "Phases"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HttpSendPipeline extends io.ktor.util.pipeline.Pipeline<java.lang.Object, io.ktor.client.request.HttpRequestBuilder> {
    private final boolean developmentMode;

    /* renamed from: Phases, reason: from kotlin metadata */
    public static final io.ktor.client.request.HttpSendPipeline.Companion INSTANCE = new io.ktor.client.request.HttpSendPipeline.Companion(null);
    private static final io.ktor.util.pipeline.PipelinePhase Before = new io.ktor.util.pipeline.PipelinePhase("Before");
    private static final io.ktor.util.pipeline.PipelinePhase State = new io.ktor.util.pipeline.PipelinePhase("State");
    private static final io.ktor.util.pipeline.PipelinePhase Monitoring = new io.ktor.util.pipeline.PipelinePhase("Monitoring");
    private static final io.ktor.util.pipeline.PipelinePhase Engine = new io.ktor.util.pipeline.PipelinePhase("Engine");
    private static final io.ktor.util.pipeline.PipelinePhase Receive = new io.ktor.util.pipeline.PipelinePhase("Receive");

    public /* synthetic */ HttpSendPipeline(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    @Override // io.ktor.util.pipeline.Pipeline
    public final boolean getDevelopmentMode() {
        return this.developmentMode;
    }

    public HttpSendPipeline(boolean z) {
        super(Before, State, Monitoring, Engine, Receive);
        this.developmentMode = z;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b"}, d2 = {"Lio/ktor/client/request/HttpSendPipeline$Phases;", "", "<init>", "()V", "Lio/ktor/util/pipeline/PipelinePhase;", "Before", "Lio/ktor/util/pipeline/PipelinePhase;", "getBefore", "()Lio/ktor/util/pipeline/PipelinePhase;", "State", "getState", "Monitoring", "getMonitoring", "Engine", "getEngine", "Receive", "getReceive"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.request.HttpSendPipeline$Phases, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final io.ktor.util.pipeline.PipelinePhase getBefore() {
            return io.ktor.client.request.HttpSendPipeline.Before;
        }

        public final io.ktor.util.pipeline.PipelinePhase getState() {
            return io.ktor.client.request.HttpSendPipeline.State;
        }

        public final io.ktor.util.pipeline.PipelinePhase getMonitoring() {
            return io.ktor.client.request.HttpSendPipeline.Monitoring;
        }

        public final io.ktor.util.pipeline.PipelinePhase getEngine() {
            return io.ktor.client.request.HttpSendPipeline.Engine;
        }

        public final io.ktor.util.pipeline.PipelinePhase getReceive() {
            return io.ktor.client.request.HttpSendPipeline.Receive;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public HttpSendPipeline() {
        this(false, 1, null);
    }
}
