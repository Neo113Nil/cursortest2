package io.ktor.util.pipeline;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lio/ktor/util/pipeline/PipelinePhaseRelation;", "", "<init>", "()V", "After", "Before", "Last", "Lio/ktor/util/pipeline/PipelinePhaseRelation$After;", "Lio/ktor/util/pipeline/PipelinePhaseRelation$Before;", "Lio/ktor/util/pipeline/PipelinePhaseRelation$Last;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class PipelinePhaseRelation {
    private PipelinePhaseRelation() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lio/ktor/util/pipeline/PipelinePhaseRelation$After;", "Lio/ktor/util/pipeline/PipelinePhaseRelation;", "Lio/ktor/util/pipeline/PipelinePhase;", "relativeTo", "<init>", "(Lio/ktor/util/pipeline/PipelinePhase;)V", "Lio/ktor/util/pipeline/PipelinePhase;", "getRelativeTo", "()Lio/ktor/util/pipeline/PipelinePhase;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class After extends io.ktor.util.pipeline.PipelinePhaseRelation {
        private final io.ktor.util.pipeline.PipelinePhase relativeTo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public After(io.ktor.util.pipeline.PipelinePhase pipelinePhase) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pipelinePhase, "");
            this.relativeTo = pipelinePhase;
        }

        public final io.ktor.util.pipeline.PipelinePhase getRelativeTo() {
            return this.relativeTo;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lio/ktor/util/pipeline/PipelinePhaseRelation$Before;", "Lio/ktor/util/pipeline/PipelinePhaseRelation;", "Lio/ktor/util/pipeline/PipelinePhase;", "relativeTo", "<init>", "(Lio/ktor/util/pipeline/PipelinePhase;)V", "Lio/ktor/util/pipeline/PipelinePhase;", "getRelativeTo", "()Lio/ktor/util/pipeline/PipelinePhase;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Before extends io.ktor.util.pipeline.PipelinePhaseRelation {
        private final io.ktor.util.pipeline.PipelinePhase relativeTo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Before(io.ktor.util.pipeline.PipelinePhase pipelinePhase) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pipelinePhase, "");
            this.relativeTo = pipelinePhase;
        }

        public final io.ktor.util.pipeline.PipelinePhase getRelativeTo() {
            return this.relativeTo;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lio/ktor/util/pipeline/PipelinePhaseRelation$Last;", "Lio/ktor/util/pipeline/PipelinePhaseRelation;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Last extends io.ktor.util.pipeline.PipelinePhaseRelation {
        public static final io.ktor.util.pipeline.PipelinePhaseRelation.Last INSTANCE = new io.ktor.util.pipeline.PipelinePhaseRelation.Last();

        public final int hashCode() {
            return 967869129;
        }

        private Last() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Last";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof io.ktor.util.pipeline.PipelinePhaseRelation.Last)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ PipelinePhaseRelation(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
