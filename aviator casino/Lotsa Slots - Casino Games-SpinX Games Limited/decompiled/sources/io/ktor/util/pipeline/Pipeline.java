package io.ktor.util.pipeline;

/* compiled from: Pipeline.kt */
@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u000b\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bBb\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012O\u0010\u0011\u001aK\u0012G\u0012E\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000f¢\u0006\u0002\b\u00100\n¢\u0006\u0004\b\u0007\u0010\u0012J \u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00012\u0006\u0010\u0014\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001bJ`\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00052I\u0010\u001d\u001aE\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000f¢\u0006\u0002\b\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b \u0010!J^\u0010\"\u001aK\u0012G\u0012E\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000f¢\u0006\u0002\b\u00100\n2\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\"\u0010#J!\u0010%\u001a\u00020\u000e2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\u0004\b%\u0010&J#\u0010'\u001a\u00020\u000e2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\b'\u0010&J!\u0010(\u001a\u00020\u000e2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\u0004\b(\u0010&J!\u0010)\u001a\u00020\u000e2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\u0004\b)\u0010&J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J`\u0010.\u001aK\u0012G\u0012E\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000f¢\u0006\u0002\b\u00100\n2\u0006\u0010\t\u001a\u00020\u0005H\u0000¢\u0006\u0004\b-\u0010#JX\u00101\u001aK\u0012G\u0012E\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000f¢\u0006\u0002\b\u00100\nH\u0000¢\u0006\u0004\b/\u00100J3\u00104\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f2\u0006\u0010\u0013\u001a\u00028\u00012\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105J%\u00107\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u0001062\u0006\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u0002092\u0006\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020<2\u0006\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b=\u0010>JX\u0010?\u001aK\u0012G\u0012E\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000f¢\u0006\u0002\b\u00100\nH\u0002¢\u0006\u0004\b?\u00100J#\u0010@\u001a\u00020<2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\b@\u0010AJX\u0010B\u001aK\u0012G\u0012E\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000f¢\u0006\u0002\b\u00100\nH\u0002¢\u0006\u0004\bB\u00100J\u000f\u0010C\u001a\u00020\u000eH\u0002¢\u0006\u0004\bC\u0010!J`\u0010E\u001a\u00020\u000e2O\u0010D\u001aK\u0012G\u0012E\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000f¢\u0006\u0002\b\u00100\nH\u0002¢\u0006\u0004\bE\u0010FJ#\u0010H\u001a\u00020\u000e2\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000106H\u0002¢\u0006\u0004\bH\u0010IJ#\u0010K\u001a\u00020\u000e2\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\bK\u0010&Jb\u0010L\u001a\u00020<2\u0006\u0010\t\u001a\u00020\u00052I\u0010\u001d\u001aE\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000f¢\u0006\u0002\b\u0010H\u0002¢\u0006\u0004\bL\u0010MJ\u001f\u0010P\u001a\u00020<2\u0006\u0010N\u001a\u00020\u00012\u0006\u0010O\u001a\u00020\u0005H\u0002¢\u0006\u0004\bP\u0010QR\u0017\u0010S\u001a\u00020R8\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001a\u0010W\u001a\u00020<8\u0016X\u0096D¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00010[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010^\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0017\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00050\n8F¢\u0006\u0006\u001a\u0004\b`\u00100R\u0011\u0010b\u001a\u00020<8F¢\u0006\u0006\u001a\u0004\bb\u0010ZR\u0016\u0010c\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010XR\u0018\u0010d\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010e¨\u0006f"}, d2 = {"Lio/ktor/util/pipeline/Pipeline;", "", "TSubject", "TContext", "", "Lio/ktor/util/pipeline/PipelinePhase;", "phases", "<init>", "([Lio/ktor/util/pipeline/PipelinePhase;)V", "phase", "", "Lkotlin/Function3;", "Lio/ktor/util/pipeline/PipelineContext;", "Lkotlin/coroutines/Continuation;", "", "Lio/ktor/util/pipeline/PipelineInterceptor;", "Lkotlin/ExtensionFunctionType;", "interceptors", "(Lio/ktor/util/pipeline/PipelinePhase;Ljava/util/List;)V", "context", "subject", "execute", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addPhase", "(Lio/ktor/util/pipeline/PipelinePhase;)V", "reference", "insertPhaseAfter", "(Lio/ktor/util/pipeline/PipelinePhase;Lio/ktor/util/pipeline/PipelinePhase;)V", "insertPhaseBefore", "block", "intercept", "(Lio/ktor/util/pipeline/PipelinePhase;Lkotlin/jvm/functions/Function3;)V", "afterIntercepted", "()V", "interceptorsForPhase", "(Lio/ktor/util/pipeline/PipelinePhase;)Ljava/util/List;", com.google.firebase.messaging.Constants.MessagePayloadKeys.FROM, "mergePhases", "(Lio/ktor/util/pipeline/Pipeline;)V", "mergeInterceptors", "merge", "resetFrom", "", "toString", "()Ljava/lang/String;", "phaseInterceptors$ktor_utils", "phaseInterceptors", "interceptorsForTests$ktor_utils", "()Ljava/util/List;", "interceptorsForTests", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "createContext", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/util/pipeline/PhaseContent;", "findPhase", "(Lio/ktor/util/pipeline/PipelinePhase;)Lio/ktor/util/pipeline/PhaseContent;", "", "findPhaseIndex", "(Lio/ktor/util/pipeline/PipelinePhase;)I", "", "hasPhase", "(Lio/ktor/util/pipeline/PipelinePhase;)Z", "cacheInterceptors", "fastPathMerge", "(Lio/ktor/util/pipeline/Pipeline;)Z", "sharedInterceptorsList", "resetInterceptorsList", "list", "notSharedInterceptorsList", "(Ljava/util/List;)V", "phaseContent", "setInterceptorsListFromPhase", "(Lio/ktor/util/pipeline/PhaseContent;)V", "pipeline", "setInterceptorsListFromAnotherPipeline", "tryAddToPhaseFastPath", "(Lio/ktor/util/pipeline/PipelinePhase;Lkotlin/jvm/functions/Function3;)Z", "fromPhaseOrContent", "fromPhase", "insertRelativePhase", "(Ljava/lang/Object;Lio/ktor/util/pipeline/PipelinePhase;)Z", "Lio/ktor/util/Attributes;", "attributes", "Lio/ktor/util/Attributes;", "getAttributes", "()Lio/ktor/util/Attributes;", "developmentMode", "Z", "getDevelopmentMode", "()Z", "", "phasesRaw", "Ljava/util/List;", "interceptorsQuantity", "I", "getItems", com.google.firebase.analytics.FirebaseAnalytics.Param.ITEMS, "isEmpty", "interceptorsListShared", "interceptorsListSharedPhase", "Lio/ktor/util/pipeline/PipelinePhase;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public class Pipeline<TSubject, TContext> {
    private final io.ktor.util.Attributes attributes;
    private final boolean developmentMode;
    private volatile /* synthetic */ java.lang.Object interceptors$delegate;
    private boolean interceptorsListShared;
    private io.ktor.util.pipeline.PipelinePhase interceptorsListSharedPhase;
    private int interceptorsQuantity;
    private final java.util.List<java.lang.Object> phasesRaw;

    public void afterIntercepted() {
    }

    public Pipeline(io.ktor.util.pipeline.PipelinePhase... phases) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phases, "phases");
        this.attributes = io.ktor.util.AttributesJvmKt.Attributes(true);
        this.phasesRaw = kotlin.collections.CollectionsKt.mutableListOf(java.util.Arrays.copyOf(phases, phases.length));
        this.interceptors$delegate = null;
    }

    public final io.ktor.util.Attributes getAttributes() {
        return this.attributes;
    }

    public boolean getDevelopmentMode() {
        return this.developmentMode;
    }

    public final java.util.List<io.ktor.util.pipeline.PipelinePhase> getItems() {
        java.util.List<java.lang.Object> list = this.phasesRaw;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (java.lang.Object obj : list) {
            io.ktor.util.pipeline.PipelinePhase pipelinePhase = obj instanceof io.ktor.util.pipeline.PipelinePhase ? (io.ktor.util.pipeline.PipelinePhase) obj : null;
            if (pipelinePhase == null) {
                io.ktor.util.pipeline.PhaseContent phaseContent = obj instanceof io.ktor.util.pipeline.PhaseContent ? (io.ktor.util.pipeline.PhaseContent) obj : null;
                io.ktor.util.pipeline.PipelinePhase phase = phaseContent != null ? phaseContent.getPhase() : null;
                kotlin.jvm.internal.Intrinsics.checkNotNull(phase);
                pipelinePhase = phase;
            }
            arrayList.add(pipelinePhase);
        }
        return arrayList;
    }

    public final boolean isEmpty() {
        return this.interceptorsQuantity == 0;
    }

    private final java.util.List<kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, TSubject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> getInterceptors() {
        return (java.util.List) this.interceptors$delegate;
    }

    private final void setInterceptors(java.util.List<? extends kotlin.jvm.functions.Function3<? super io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, ? super TSubject, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> list) {
        this.interceptors$delegate = list;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Pipeline(io.ktor.util.pipeline.PipelinePhase phase, java.util.List<? extends kotlin.jvm.functions.Function3<? super io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, ? super TSubject, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> interceptors) {
        this(phase);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phase, "phase");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        java.util.Iterator<T> it = interceptors.iterator();
        while (it.hasNext()) {
            intercept(phase, (kotlin.jvm.functions.Function3) it.next());
        }
    }

    public final java.lang.Object execute(TContext tcontext, TSubject tsubject, kotlin.coroutines.Continuation<? super TSubject> continuation) {
        return createContext(tcontext, tsubject, continuation.getContext()).execute$ktor_utils(tsubject, continuation);
    }

    public final void addPhase(io.ktor.util.pipeline.PipelinePhase phase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phase, "phase");
        if (hasPhase(phase)) {
            return;
        }
        this.phasesRaw.add(phase);
    }

    public final void insertPhaseAfter(io.ktor.util.pipeline.PipelinePhase reference, io.ktor.util.pipeline.PipelinePhase phase) {
        io.ktor.util.pipeline.PipelinePhaseRelation relation;
        io.ktor.util.pipeline.PipelinePhase relativeTo;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reference, "reference");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phase, "phase");
        if (hasPhase(phase)) {
            return;
        }
        int findPhaseIndex = findPhaseIndex(reference);
        if (findPhaseIndex == -1) {
            throw new io.ktor.util.pipeline.InvalidPhaseException("Phase " + reference + " was not registered for this pipeline");
        }
        int i = findPhaseIndex + 1;
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(this.phasesRaw);
        if (i <= lastIndex) {
            while (true) {
                java.lang.Object obj = this.phasesRaw.get(i);
                io.ktor.util.pipeline.PhaseContent phaseContent = obj instanceof io.ktor.util.pipeline.PhaseContent ? (io.ktor.util.pipeline.PhaseContent) obj : null;
                if (phaseContent != null && (relation = phaseContent.getRelation()) != null) {
                    io.ktor.util.pipeline.PipelinePhaseRelation.After after = relation instanceof io.ktor.util.pipeline.PipelinePhaseRelation.After ? (io.ktor.util.pipeline.PipelinePhaseRelation.After) relation : null;
                    if (after != null && (relativeTo = after.getRelativeTo()) != null && kotlin.jvm.internal.Intrinsics.areEqual(relativeTo, reference)) {
                        findPhaseIndex = i;
                    }
                    if (i == lastIndex) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    break;
                }
            }
        }
        this.phasesRaw.add(findPhaseIndex + 1, new io.ktor.util.pipeline.PhaseContent(phase, new io.ktor.util.pipeline.PipelinePhaseRelation.After(reference)));
    }

    public final void insertPhaseBefore(io.ktor.util.pipeline.PipelinePhase reference, io.ktor.util.pipeline.PipelinePhase phase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reference, "reference");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phase, "phase");
        if (hasPhase(phase)) {
            return;
        }
        int findPhaseIndex = findPhaseIndex(reference);
        if (findPhaseIndex == -1) {
            throw new io.ktor.util.pipeline.InvalidPhaseException("Phase " + reference + " was not registered for this pipeline");
        }
        this.phasesRaw.add(findPhaseIndex, new io.ktor.util.pipeline.PhaseContent(phase, new io.ktor.util.pipeline.PipelinePhaseRelation.Before(reference)));
    }

    public final void intercept(io.ktor.util.pipeline.PipelinePhase phase, kotlin.jvm.functions.Function3<? super io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, ? super TSubject, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phase, "phase");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        io.ktor.util.pipeline.PhaseContent<TSubject, TContext> findPhase = findPhase(phase);
        if (findPhase == null) {
            throw new io.ktor.util.pipeline.InvalidPhaseException("Phase " + phase + " was not registered for this pipeline");
        }
        if (tryAddToPhaseFastPath(phase, block)) {
            this.interceptorsQuantity++;
            return;
        }
        findPhase.addInterceptor(block);
        this.interceptorsQuantity++;
        resetInterceptorsList();
        afterIntercepted();
    }

    public final java.util.List<kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, TSubject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> interceptorsForPhase(io.ktor.util.pipeline.PipelinePhase phase) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phase, "phase");
        java.util.List<java.lang.Object> list = this.phasesRaw;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            if (obj2 instanceof io.ktor.util.pipeline.PhaseContent) {
                arrayList.add(obj2);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((io.ktor.util.pipeline.PhaseContent) obj).getPhase(), phase)) {
                break;
            }
        }
        io.ktor.util.pipeline.PhaseContent phaseContent = (io.ktor.util.pipeline.PhaseContent) obj;
        java.util.List<kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, TSubject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> sharedInterceptors = phaseContent != null ? phaseContent.sharedInterceptors() : null;
        return sharedInterceptors == null ? kotlin.collections.CollectionsKt.emptyList() : sharedInterceptors;
    }

    public final void mergePhases(io.ktor.util.pipeline.Pipeline<TSubject, TContext> from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "from");
        java.util.List mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) from.phasesRaw);
        while (!mutableList.isEmpty()) {
            java.util.Iterator it = mutableList.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                io.ktor.util.pipeline.PipelinePhase pipelinePhase = next instanceof io.ktor.util.pipeline.PipelinePhase ? (io.ktor.util.pipeline.PipelinePhase) next : null;
                if (pipelinePhase == null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(next, "null cannot be cast to non-null type io.ktor.util.pipeline.PhaseContent<*, *>");
                    pipelinePhase = ((io.ktor.util.pipeline.PhaseContent) next).getPhase();
                }
                if (hasPhase(pipelinePhase)) {
                    it.remove();
                } else if (insertRelativePhase(next, pipelinePhase)) {
                    it.remove();
                }
            }
        }
    }

    private final void mergeInterceptors(io.ktor.util.pipeline.Pipeline<TSubject, TContext> from) {
        if (this.interceptorsQuantity == 0) {
            setInterceptorsListFromAnotherPipeline(from);
        } else {
            resetInterceptorsList();
        }
        for (java.lang.Object obj : from.phasesRaw) {
            io.ktor.util.pipeline.PipelinePhase pipelinePhase = obj instanceof io.ktor.util.pipeline.PipelinePhase ? (io.ktor.util.pipeline.PipelinePhase) obj : null;
            if (pipelinePhase == null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.util.pipeline.PhaseContent<*, *>");
                pipelinePhase = ((io.ktor.util.pipeline.PhaseContent) obj).getPhase();
            }
            if (obj instanceof io.ktor.util.pipeline.PhaseContent) {
                io.ktor.util.pipeline.PhaseContent phaseContent = (io.ktor.util.pipeline.PhaseContent) obj;
                if (!phaseContent.isEmpty()) {
                    io.ktor.util.pipeline.PhaseContent<TSubject, TContext> findPhase = findPhase(pipelinePhase);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(findPhase);
                    phaseContent.addTo(findPhase);
                    this.interceptorsQuantity += phaseContent.getSize();
                }
            }
        }
    }

    public final void merge(io.ktor.util.pipeline.Pipeline<TSubject, TContext> from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "from");
        if (fastPathMerge(from)) {
            return;
        }
        mergePhases(from);
        mergeInterceptors(from);
    }

    public final void resetFrom(io.ktor.util.pipeline.Pipeline<TSubject, TContext> from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "from");
        this.phasesRaw.clear();
        if (this.interceptorsQuantity != 0) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        fastPathMerge(from);
    }

    public java.lang.String toString() {
        return super.toString();
    }

    public final java.util.List<kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, TSubject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> phaseInterceptors$ktor_utils(io.ktor.util.pipeline.PipelinePhase phase) {
        java.util.List<kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, TSubject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> sharedInterceptors;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phase, "phase");
        io.ktor.util.pipeline.PhaseContent<TSubject, TContext> findPhase = findPhase(phase);
        return (findPhase == null || (sharedInterceptors = findPhase.sharedInterceptors()) == null) ? kotlin.collections.CollectionsKt.emptyList() : sharedInterceptors;
    }

    public final java.util.List<kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, TSubject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> interceptorsForTests$ktor_utils() {
        java.util.List<kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, TSubject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> interceptors = getInterceptors();
        return interceptors == null ? cacheInterceptors() : interceptors;
    }

    private final io.ktor.util.pipeline.PipelineContext<TSubject, TContext> createContext(TContext context, TSubject subject, kotlin.coroutines.CoroutineContext coroutineContext) {
        return io.ktor.util.pipeline.PipelineContextKt.pipelineContextFor(context, sharedInterceptorsList(), subject, coroutineContext, getDevelopmentMode());
    }

    private final io.ktor.util.pipeline.PhaseContent<TSubject, TContext> findPhase(io.ktor.util.pipeline.PipelinePhase phase) {
        java.util.List<java.lang.Object> list = this.phasesRaw;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            java.lang.Object obj = list.get(i);
            if (obj == phase) {
                io.ktor.util.pipeline.PhaseContent<TSubject, TContext> phaseContent = new io.ktor.util.pipeline.PhaseContent<>(phase, io.ktor.util.pipeline.PipelinePhaseRelation.Last.INSTANCE);
                list.set(i, phaseContent);
                return phaseContent;
            }
            if (obj instanceof io.ktor.util.pipeline.PhaseContent) {
                io.ktor.util.pipeline.PhaseContent<TSubject, TContext> phaseContent2 = (io.ktor.util.pipeline.PhaseContent) obj;
                if (phaseContent2.getPhase() == phase) {
                    return phaseContent2;
                }
            }
        }
        return null;
    }

    private final int findPhaseIndex(io.ktor.util.pipeline.PipelinePhase phase) {
        java.util.List<java.lang.Object> list = this.phasesRaw;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            java.lang.Object obj = list.get(i);
            if (obj == phase || ((obj instanceof io.ktor.util.pipeline.PhaseContent) && ((io.ktor.util.pipeline.PhaseContent) obj).getPhase() == phase)) {
                return i;
            }
        }
        return -1;
    }

    private final boolean hasPhase(io.ktor.util.pipeline.PipelinePhase phase) {
        java.util.List<java.lang.Object> list = this.phasesRaw;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            java.lang.Object obj = list.get(i);
            if (obj == phase) {
                return true;
            }
            if ((obj instanceof io.ktor.util.pipeline.PhaseContent) && ((io.ktor.util.pipeline.PhaseContent) obj).getPhase() == phase) {
                return true;
            }
        }
        return false;
    }

    private final java.util.List<kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, TSubject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> cacheInterceptors() {
        int lastIndex;
        int i = this.interceptorsQuantity;
        if (i == 0) {
            notSharedInterceptorsList(kotlin.collections.CollectionsKt.emptyList());
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List<java.lang.Object> list = this.phasesRaw;
        int i2 = 0;
        if (i == 1 && (lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list)) >= 0) {
            int i3 = 0;
            while (true) {
                java.lang.Object obj = list.get(i3);
                io.ktor.util.pipeline.PhaseContent<TSubject, TContext> phaseContent = obj instanceof io.ktor.util.pipeline.PhaseContent ? (io.ktor.util.pipeline.PhaseContent) obj : null;
                if (phaseContent != null && !phaseContent.isEmpty()) {
                    java.util.List<kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, TSubject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> sharedInterceptors = phaseContent.sharedInterceptors();
                    setInterceptorsListFromPhase(phaseContent);
                    return sharedInterceptors;
                }
                if (i3 == lastIndex) {
                    break;
                }
                i3++;
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int lastIndex2 = kotlin.collections.CollectionsKt.getLastIndex(list);
        if (lastIndex2 >= 0) {
            while (true) {
                java.lang.Object obj2 = list.get(i2);
                io.ktor.util.pipeline.PhaseContent phaseContent2 = obj2 instanceof io.ktor.util.pipeline.PhaseContent ? (io.ktor.util.pipeline.PhaseContent) obj2 : null;
                if (phaseContent2 != null) {
                    phaseContent2.addTo(arrayList);
                }
                if (i2 == lastIndex2) {
                    break;
                }
                i2++;
            }
        }
        notSharedInterceptorsList(arrayList);
        return arrayList;
    }

    private final boolean fastPathMerge(io.ktor.util.pipeline.Pipeline<TSubject, TContext> from) {
        if (from.phasesRaw.isEmpty()) {
            return true;
        }
        int i = 0;
        if (!this.phasesRaw.isEmpty()) {
            return false;
        }
        java.util.List<java.lang.Object> list = from.phasesRaw;
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
        if (lastIndex >= 0) {
            while (true) {
                java.lang.Object obj = list.get(i);
                if (obj instanceof io.ktor.util.pipeline.PipelinePhase) {
                    this.phasesRaw.add(obj);
                } else if (obj instanceof io.ktor.util.pipeline.PhaseContent) {
                    io.ktor.util.pipeline.PhaseContent phaseContent = (io.ktor.util.pipeline.PhaseContent) obj;
                    this.phasesRaw.add(new io.ktor.util.pipeline.PhaseContent(phaseContent.getPhase(), phaseContent.getRelation(), phaseContent.sharedInterceptors()));
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        this.interceptorsQuantity += from.interceptorsQuantity;
        setInterceptorsListFromAnotherPipeline(from);
        return true;
    }

    private final java.util.List<kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, TSubject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> sharedInterceptorsList() {
        if (getInterceptors() == null) {
            cacheInterceptors();
        }
        this.interceptorsListShared = true;
        java.util.List<kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, TSubject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> interceptors = getInterceptors();
        kotlin.jvm.internal.Intrinsics.checkNotNull(interceptors);
        return interceptors;
    }

    private final void resetInterceptorsList() {
        setInterceptors(null);
        this.interceptorsListShared = false;
        this.interceptorsListSharedPhase = null;
    }

    private final void notSharedInterceptorsList(java.util.List<? extends kotlin.jvm.functions.Function3<? super io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, ? super TSubject, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> list) {
        setInterceptors(list);
        this.interceptorsListShared = false;
        this.interceptorsListSharedPhase = null;
    }

    private final void setInterceptorsListFromPhase(io.ktor.util.pipeline.PhaseContent<TSubject, TContext> phaseContent) {
        setInterceptors(phaseContent.sharedInterceptors());
        this.interceptorsListShared = false;
        this.interceptorsListSharedPhase = phaseContent.getPhase();
    }

    private final void setInterceptorsListFromAnotherPipeline(io.ktor.util.pipeline.Pipeline<TSubject, TContext> pipeline) {
        setInterceptors(pipeline.sharedInterceptorsList());
        this.interceptorsListShared = true;
        this.interceptorsListSharedPhase = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean tryAddToPhaseFastPath(io.ktor.util.pipeline.PipelinePhase phase, kotlin.jvm.functions.Function3<? super io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, ? super TSubject, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
        java.util.List<kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, TSubject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> interceptors = getInterceptors();
        if (this.phasesRaw.isEmpty() || interceptors == null || this.interceptorsListShared || !kotlin.jvm.internal.TypeIntrinsics.isMutableList(interceptors)) {
            return false;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.interceptorsListSharedPhase, phase)) {
            interceptors.add(block);
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(phase, kotlin.collections.CollectionsKt.last((java.util.List) this.phasesRaw)) && findPhaseIndex(phase) != kotlin.collections.CollectionsKt.getLastIndex(this.phasesRaw)) {
            return false;
        }
        io.ktor.util.pipeline.PhaseContent<TSubject, TContext> findPhase = findPhase(phase);
        kotlin.jvm.internal.Intrinsics.checkNotNull(findPhase);
        findPhase.addInterceptor(block);
        interceptors.add(block);
        return true;
    }

    private final boolean insertRelativePhase(java.lang.Object fromPhaseOrContent, io.ktor.util.pipeline.PipelinePhase fromPhase) {
        io.ktor.util.pipeline.PipelinePhaseRelation.Last relation;
        if (fromPhaseOrContent == fromPhase) {
            relation = io.ktor.util.pipeline.PipelinePhaseRelation.Last.INSTANCE;
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNull(fromPhaseOrContent, "null cannot be cast to non-null type io.ktor.util.pipeline.PhaseContent<*, *>");
            relation = ((io.ktor.util.pipeline.PhaseContent) fromPhaseOrContent).getRelation();
        }
        if (relation instanceof io.ktor.util.pipeline.PipelinePhaseRelation.Last) {
            addPhase(fromPhase);
            return true;
        }
        if (relation instanceof io.ktor.util.pipeline.PipelinePhaseRelation.Before) {
            io.ktor.util.pipeline.PipelinePhaseRelation.Before before = (io.ktor.util.pipeline.PipelinePhaseRelation.Before) relation;
            if (hasPhase(before.getRelativeTo())) {
                insertPhaseBefore(before.getRelativeTo(), fromPhase);
                return true;
            }
        }
        if (!(relation instanceof io.ktor.util.pipeline.PipelinePhaseRelation.After)) {
            return false;
        }
        insertPhaseAfter(((io.ktor.util.pipeline.PipelinePhaseRelation.After) relation).getRelativeTo(), fromPhase);
        return true;
    }
}
