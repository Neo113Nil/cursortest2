package io.ktor.util.pipeline;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 4*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u00014Bj\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012Q\u0010\u000f\u001aM\u0012I\u0012G\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tj\u0010\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\r¢\u0006\u0002\b\u000e0\b¢\u0006\u0004\b\u0010\u0010\u0011B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0012JZ\u0010\u0014\u001a\u00020\f2K\u0010\u0013\u001aG\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tj\u0010\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\r¢\u0006\u0002\b\u000e¢\u0006\u0004\b\u0014\u0010\u0015J`\u0010\u0017\u001a\u00020\f2Q\u0010\u0016\u001aM\u0012I\u0012G\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tj\u0010\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\r¢\u0006\u0002\b\u000e0\b¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0017\u001a\u00020\f2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\u0004\b\u0017\u0010\u0019JX\u0010\u001a\u001aM\u0012I\u0012G\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tj\u0010\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\r¢\u0006\u0002\b\u000e0\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$Ra\u0010'\u001aM\u0012I\u0012G\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tj\u0010\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\r¢\u0006\u0002\b\u000e0\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010)\u001a\u00020(8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0011\u0010/\u001a\u00020(8G¢\u0006\u0006\u001a\u0004\b/\u0010,R\u0011\u00103\u001a\u0002008G¢\u0006\u0006\u001a\u0004\b1\u00102"}, d2 = {"Lio/ktor/util/pipeline/PhaseContent;", "", "TSubject", "Call", "Lio/ktor/util/pipeline/PipelinePhase;", androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_PHASE, "Lio/ktor/util/pipeline/PipelinePhaseRelation;", "relation", "", "Lkotlin/Function3;", "Lio/ktor/util/pipeline/PipelineContext;", "Lkotlin/coroutines/Continuation;", "", "Lio/ktor/util/pipeline/PipelineInterceptor;", "Lkotlin/ExtensionFunctionType;", "interceptors", "<init>", "(Lio/ktor/util/pipeline/PipelinePhase;Lio/ktor/util/pipeline/PipelinePhaseRelation;Ljava/util/List;)V", "(Lio/ktor/util/pipeline/PipelinePhase;Lio/ktor/util/pipeline/PipelinePhaseRelation;)V", "interceptor", "addInterceptor", "(Lkotlin/jvm/functions/Function3;)V", "destination", "addTo", "(Ljava/util/List;)V", "(Lio/ktor/util/pipeline/PhaseContent;)V", "sharedInterceptors", "()Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "Lio/ktor/util/pipeline/PipelinePhase;", "getPhase", "()Lio/ktor/util/pipeline/PipelinePhase;", "Lio/ktor/util/pipeline/PipelinePhaseRelation;", "getRelation", "()Lio/ktor/util/pipeline/PipelinePhaseRelation;", "getHighSpeedVideoSizes", "Ljava/util/List;", "getHighSpeedVideoFpsRanges", "", "shared", "Z", "getShared", "()Z", "setShared", "(Z)V", "isEmpty", "", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size, "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PhaseContent<TSubject, Call> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.util.pipeline.PhaseContent.Companion INSTANCE = new io.ktor.util.pipeline.PhaseContent.Companion(null);
    private static final java.util.List<java.lang.Object> SharedArrayList = new java.util.ArrayList();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.util.List<kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<TSubject, Call>, TSubject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> getHighSpeedVideoFpsRanges;
    private final io.ktor.util.pipeline.PipelinePhase phase;
    private final io.ktor.util.pipeline.PipelinePhaseRelation relation;
    private boolean shared;

    public PhaseContent(io.ktor.util.pipeline.PipelinePhase pipelinePhase, io.ktor.util.pipeline.PipelinePhaseRelation pipelinePhaseRelation, java.util.List<kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<TSubject, Call>, TSubject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pipelinePhase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pipelinePhaseRelation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.phase = pipelinePhase;
        this.relation = pipelinePhaseRelation;
        this.getHighSpeedVideoFpsRanges = list;
        this.shared = true;
    }

    public final io.ktor.util.pipeline.PipelinePhase getPhase() {
        return this.phase;
    }

    public final io.ktor.util.pipeline.PipelinePhaseRelation getRelation() {
        return this.relation;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PhaseContent(io.ktor.util.pipeline.PipelinePhase pipelinePhase, io.ktor.util.pipeline.PipelinePhaseRelation pipelinePhaseRelation) {
        this(pipelinePhase, pipelinePhaseRelation, kotlin.jvm.internal.TypeIntrinsics.asMutableList(r1));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pipelinePhase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pipelinePhaseRelation, "");
        java.util.List<java.lang.Object> list = SharedArrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNull(list, "");
        if (!list.isEmpty()) {
            throw new java.lang.IllegalStateException("The shared empty array list has been modified".toString());
        }
    }

    public final boolean getShared() {
        return this.shared;
    }

    public final void setShared(boolean z) {
        this.shared = z;
    }

    public final boolean isEmpty() {
        return this.getHighSpeedVideoFpsRanges.isEmpty();
    }

    public final int getSize() {
        return this.getHighSpeedVideoFpsRanges.size();
    }

    public final void addInterceptor(kotlin.jvm.functions.Function3<? super io.ktor.util.pipeline.PipelineContext<TSubject, Call>, ? super TSubject, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> interceptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interceptor, "");
        if (this.shared) {
            this.getHighSpeedVideoFpsRanges = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) this.getHighSpeedVideoFpsRanges);
            this.shared = false;
        }
        this.getHighSpeedVideoFpsRanges.add(interceptor);
    }

    public final void addTo(java.util.List<kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<TSubject, Call>, TSubject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> destination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        java.util.List<kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<TSubject, Call>, TSubject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> list = this.getHighSpeedVideoFpsRanges;
        if (destination instanceof java.util.ArrayList) {
            java.util.ArrayList arrayList = (java.util.ArrayList) destination;
            arrayList.ensureCapacity(arrayList.size() + list.size());
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            destination.add(list.get(i));
        }
    }

    public final void addTo(io.ktor.util.pipeline.PhaseContent<TSubject, Call> destination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        if (isEmpty()) {
            return;
        }
        if (destination.isEmpty()) {
            destination.getHighSpeedVideoFpsRanges = sharedInterceptors();
            destination.shared = true;
        } else {
            if (destination.shared) {
                destination.getHighSpeedVideoFpsRanges = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) destination.getHighSpeedVideoFpsRanges);
                destination.shared = false;
            }
            addTo(destination.getHighSpeedVideoFpsRanges);
        }
    }

    public final java.util.List<kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<TSubject, Call>, TSubject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> sharedInterceptors() {
        this.shared = true;
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Phase `");
        sb.append(this.phase.getName());
        sb.append("`, ");
        sb.append(getSize());
        sb.append(" handlers");
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lio/ktor/util/pipeline/PhaseContent$Companion;", "", "<init>", "()V", "", "SharedArrayList", "Ljava/util/List;", "getSharedArrayList", "()Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.util.List<java.lang.Object> getSharedArrayList() {
            return io.ktor.util.pipeline.PhaseContent.SharedArrayList;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
