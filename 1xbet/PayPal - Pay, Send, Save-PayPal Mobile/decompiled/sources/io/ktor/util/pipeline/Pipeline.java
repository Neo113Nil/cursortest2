package io.ktor.util.pipeline;

@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\b\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bd\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012Q\u0010\u0010\u001aM\u0012I\u0012G\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0010\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000e¢\u0006\u0002\b\u000f0\t¢\u0006\u0004\b\u0006\u0010\u0011J \u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0013\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001aJb\u0010\u001d\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00042K\u0010\u001c\u001aG\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0010\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000e¢\u0006\u0002\b\u000f¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001f\u0010 J`\u0010!\u001aM\u0012I\u0012G\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0010\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000e¢\u0006\u0002\b\u000f0\t2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"J!\u0010$\u001a\u00020\r2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\u0004\b$\u0010%J!\u0010&\u001a\u00020\r2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\u0004\b&\u0010%J!\u0010'\u001a\u00020\r2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\u0004\b'\u0010%J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*Jb\u0010+\u001aM\u0012I\u0012G\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0010\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000e¢\u0006\u0002\b\u000f0\t2\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b+\u0010\"JZ\u0010,\u001aM\u0012I\u0012G\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0010\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000e¢\u0006\u0002\b\u000f0\tH\u0000¢\u0006\u0004\b,\u0010-J%\u00100\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010/2\u0006\u0010.\u001a\u00020\u0004H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u0002022\u0006\u0010.\u001a\u00020\u0004H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u0002052\u0006\u0010.\u001a\u00020\u0004H\u0002¢\u0006\u0004\b6\u00107JZ\u00106\u001aM\u0012I\u0012G\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0010\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000e¢\u0006\u0002\b\u000f0\tH\u0002¢\u0006\u0004\b6\u0010-J#\u00100\u001a\u0002052\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\b0\u00108R\u0017\u0010:\u001a\u0002098\u0007¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010>\u001a\u0002058\u0017X\u0097D¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u00010B8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u0010CR\u0016\u00100\u001a\u0002028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00040\t8G¢\u0006\u0006\u001a\u0004\bF\u0010-R\u0011\u0010H\u001a\u0002058G¢\u0006\u0006\u001a\u0004\bH\u0010AR\u0016\u0010I\u001a\u0002058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bI\u0010?R\u0018\u0010D\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b6\u0010J"}, d2 = {"Lio/ktor/util/pipeline/Pipeline;", "", "TSubject", "TContext", "Lio/ktor/util/pipeline/PipelinePhase;", "phases", "<init>", "([Lio/ktor/util/pipeline/PipelinePhase;)V", androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_PHASE, "", "Lkotlin/Function3;", "Lio/ktor/util/pipeline/PipelineContext;", "Lkotlin/coroutines/Continuation;", "", "Lio/ktor/util/pipeline/PipelineInterceptor;", "Lkotlin/ExtensionFunctionType;", "interceptors", "(Lio/ktor/util/pipeline/PipelinePhase;Ljava/util/List;)V", "context", "subject", "execute", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addPhase", "(Lio/ktor/util/pipeline/PipelinePhase;)V", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_REFERENCE, "insertPhaseAfter", "(Lio/ktor/util/pipeline/PipelinePhase;Lio/ktor/util/pipeline/PipelinePhase;)V", "insertPhaseBefore", "block", "intercept", "(Lio/ktor/util/pipeline/PipelinePhase;Lkotlin/jvm/functions/Function3;)V", "afterIntercepted", "()V", "interceptorsForPhase", "(Lio/ktor/util/pipeline/PipelinePhase;)Ljava/util/List;", "from", "mergePhases", "(Lio/ktor/util/pipeline/Pipeline;)V", "merge", "resetFrom", "", "toString", "()Ljava/lang/String;", "phaseInterceptors$ktor_utils", "interceptorsForTests$ktor_utils", "()Ljava/util/List;", "p0", "Lio/ktor/util/pipeline/PhaseContent;", "getHighResolutionOutputSizeshNQ4ISI", "(Lio/ktor/util/pipeline/PipelinePhase;)Lio/ktor/util/pipeline/PhaseContent;", "", "Camera2StreamConfigurationMap", "(Lio/ktor/util/pipeline/PipelinePhase;)I", "", "getHighSpeedVideoSizes", "(Lio/ktor/util/pipeline/PipelinePhase;)Z", "(Lio/ktor/util/pipeline/Pipeline;)Z", "Lio/ktor/util/Attributes;", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "Lio/ktor/util/Attributes;", "getAttributes", "()Lio/ktor/util/Attributes;", "developmentMode", "Z", "getDevelopmentMode", "()Z", "", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getItems", "items", "isEmpty", "getHighSpeedVideoFpsRanges", "Lio/ktor/util/pipeline/PipelinePhase;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public class Pipeline<TSubject, TContext> {
    private final io.ktor.util.Attributes attributes;
    private final boolean developmentMode;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.List<java.lang.Object> getHighSpeedVideoSizes;
    private boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private io.ktor.util.pipeline.PipelinePhase getHighSpeedVideoFpsRangesFor;
    private volatile /* synthetic */ java.lang.Object interceptors$delegate;

    public void afterIntercepted() {
    }

    public Pipeline(io.ktor.util.pipeline.PipelinePhase... pipelinePhaseArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pipelinePhaseArr, "");
        this.attributes = io.ktor.util.AttributesJvmKt.Attributes(true);
        this.getHighSpeedVideoSizes = kotlin.collections.CollectionsKt.mutableListOf(java.util.Arrays.copyOf(pipelinePhaseArr, pipelinePhaseArr.length));
        this.interceptors$delegate = null;
    }

    public final io.ktor.util.Attributes getAttributes() {
        return this.attributes;
    }

    public boolean getDevelopmentMode() {
        return this.developmentMode;
    }

    public final java.util.List<io.ktor.util.pipeline.PipelinePhase> getItems() {
        java.util.List<java.lang.Object> list = this.getHighSpeedVideoSizes;
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
        return this.getHighResolutionOutputSizeshNQ4ISI == 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Pipeline(io.ktor.util.pipeline.PipelinePhase pipelinePhase, java.util.List<? extends kotlin.jvm.functions.Function3<? super io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, ? super TSubject, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> list) {
        this(pipelinePhase);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pipelinePhase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            intercept(pipelinePhase, (kotlin.jvm.functions.Function3) it.next());
        }
    }

    public final java.lang.Object execute(TContext tcontext, TSubject tsubject, kotlin.coroutines.Continuation<? super TSubject> continuation) {
        kotlin.coroutines.CoroutineContext context = continuation.getContext();
        if (((java.util.List) this.interceptors$delegate) == null) {
            getHighSpeedVideoSizes();
        }
        this.getHighSpeedVideoFpsRanges = true;
        java.util.List list = (java.util.List) this.interceptors$delegate;
        kotlin.jvm.internal.Intrinsics.checkNotNull(list);
        return io.ktor.util.pipeline.PipelineContextKt.pipelineContextFor(tcontext, list, tsubject, context, getDevelopmentMode()).execute$ktor_utils(tsubject, continuation);
    }

    public final void addPhase(io.ktor.util.pipeline.PipelinePhase phase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phase, "");
        if (getHighSpeedVideoSizes(phase)) {
            return;
        }
        this.getHighSpeedVideoSizes.add(phase);
    }

    public final void insertPhaseAfter(io.ktor.util.pipeline.PipelinePhase reference, io.ktor.util.pipeline.PipelinePhase phase) {
        io.ktor.util.pipeline.PipelinePhaseRelation relation;
        io.ktor.util.pipeline.PipelinePhase relativeTo;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phase, "");
        if (getHighSpeedVideoSizes(phase)) {
            return;
        }
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(reference);
        if (Camera2StreamConfigurationMap == -1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Phase ");
            sb.append(reference);
            sb.append(" was not registered for this pipeline");
            throw new io.ktor.util.pipeline.InvalidPhaseException(sb.toString());
        }
        int i = Camera2StreamConfigurationMap + 1;
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(this.getHighSpeedVideoSizes);
        if (i <= lastIndex) {
            while (true) {
                java.lang.Object obj = this.getHighSpeedVideoSizes.get(i);
                io.ktor.util.pipeline.PhaseContent phaseContent = obj instanceof io.ktor.util.pipeline.PhaseContent ? (io.ktor.util.pipeline.PhaseContent) obj : null;
                if (phaseContent != null && (relation = phaseContent.getRelation()) != null) {
                    io.ktor.util.pipeline.PipelinePhaseRelation.After after = relation instanceof io.ktor.util.pipeline.PipelinePhaseRelation.After ? (io.ktor.util.pipeline.PipelinePhaseRelation.After) relation : null;
                    if (after != null && (relativeTo = after.getRelativeTo()) != null && kotlin.jvm.internal.Intrinsics.areEqual(relativeTo, reference)) {
                        Camera2StreamConfigurationMap = i;
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
        this.getHighSpeedVideoSizes.add(Camera2StreamConfigurationMap + 1, new io.ktor.util.pipeline.PhaseContent(phase, new io.ktor.util.pipeline.PipelinePhaseRelation.After(reference)));
    }

    public final void insertPhaseBefore(io.ktor.util.pipeline.PipelinePhase reference, io.ktor.util.pipeline.PipelinePhase phase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phase, "");
        if (getHighSpeedVideoSizes(phase)) {
            return;
        }
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(reference);
        if (Camera2StreamConfigurationMap == -1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Phase ");
            sb.append(reference);
            sb.append(" was not registered for this pipeline");
            throw new io.ktor.util.pipeline.InvalidPhaseException(sb.toString());
        }
        this.getHighSpeedVideoSizes.add(Camera2StreamConfigurationMap, new io.ktor.util.pipeline.PhaseContent(phase, new io.ktor.util.pipeline.PipelinePhaseRelation.Before(reference)));
    }

    public final void intercept(io.ktor.util.pipeline.PipelinePhase phase, kotlin.jvm.functions.Function3<? super io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, ? super TSubject, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        io.ktor.util.pipeline.PhaseContent<TSubject, TContext> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(phase);
        if (highResolutionOutputSizeshNQ4ISI == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Phase ");
            sb.append(phase);
            sb.append(" was not registered for this pipeline");
            throw new io.ktor.util.pipeline.InvalidPhaseException(sb.toString());
        }
        java.util.List list = (java.util.List) this.interceptors$delegate;
        if (!this.getHighSpeedVideoSizes.isEmpty() && list != null && !this.getHighSpeedVideoFpsRanges && kotlin.jvm.internal.TypeIntrinsics.isMutableList(list)) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, phase)) {
                list.add(block);
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(phase, kotlin.collections.CollectionsKt.last((java.util.List) this.getHighSpeedVideoSizes)) || Camera2StreamConfigurationMap(phase) == kotlin.collections.CollectionsKt.getLastIndex(this.getHighSpeedVideoSizes)) {
                io.ktor.util.pipeline.PhaseContent<TSubject, TContext> highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(phase);
                kotlin.jvm.internal.Intrinsics.checkNotNull(highResolutionOutputSizeshNQ4ISI2);
                highResolutionOutputSizeshNQ4ISI2.addInterceptor(block);
                list.add(block);
            }
            this.getHighResolutionOutputSizeshNQ4ISI++;
            return;
        }
        highResolutionOutputSizeshNQ4ISI.addInterceptor(block);
        this.getHighResolutionOutputSizeshNQ4ISI++;
        this.interceptors$delegate = null;
        this.getHighSpeedVideoFpsRanges = false;
        this.getHighSpeedVideoFpsRangesFor = null;
        afterIntercepted();
    }

    public final java.util.List<kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, TSubject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> interceptorsForPhase(io.ktor.util.pipeline.PipelinePhase phase) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phase, "");
        java.util.List<java.lang.Object> list = this.getHighSpeedVideoSizes;
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
        io.ktor.util.pipeline.PipelinePhaseRelation.Last relation;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        java.util.List mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) from.getHighSpeedVideoSizes);
        while (!mutableList.isEmpty()) {
            java.util.Iterator it = mutableList.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                io.ktor.util.pipeline.PipelinePhase pipelinePhase = next instanceof io.ktor.util.pipeline.PipelinePhase ? (io.ktor.util.pipeline.PipelinePhase) next : null;
                if (pipelinePhase == null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(next, "");
                    pipelinePhase = ((io.ktor.util.pipeline.PhaseContent) next).getPhase();
                }
                if (getHighSpeedVideoSizes(pipelinePhase)) {
                    it.remove();
                } else {
                    if (next == pipelinePhase) {
                        relation = io.ktor.util.pipeline.PipelinePhaseRelation.Last.INSTANCE;
                    } else {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(next, "");
                        relation = ((io.ktor.util.pipeline.PhaseContent) next).getRelation();
                    }
                    if (relation instanceof io.ktor.util.pipeline.PipelinePhaseRelation.Last) {
                        addPhase(pipelinePhase);
                    } else {
                        if (relation instanceof io.ktor.util.pipeline.PipelinePhaseRelation.Before) {
                            io.ktor.util.pipeline.PipelinePhaseRelation.Before before = (io.ktor.util.pipeline.PipelinePhaseRelation.Before) relation;
                            if (getHighSpeedVideoSizes(before.getRelativeTo())) {
                                insertPhaseBefore(before.getRelativeTo(), pipelinePhase);
                            }
                        }
                        if (relation instanceof io.ktor.util.pipeline.PipelinePhaseRelation.After) {
                            insertPhaseAfter(((io.ktor.util.pipeline.PipelinePhaseRelation.After) relation).getRelativeTo(), pipelinePhase);
                        }
                    }
                    it.remove();
                }
            }
        }
    }

    public final void merge(io.ktor.util.pipeline.Pipeline<TSubject, TContext> from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        if (getHighResolutionOutputSizeshNQ4ISI(from)) {
            return;
        }
        mergePhases(from);
        if (this.getHighResolutionOutputSizeshNQ4ISI == 0) {
            if (((java.util.List) from.interceptors$delegate) == null) {
                from.getHighSpeedVideoSizes();
            }
            from.getHighSpeedVideoFpsRanges = true;
            java.util.List list = (java.util.List) from.interceptors$delegate;
            kotlin.jvm.internal.Intrinsics.checkNotNull(list);
            this.interceptors$delegate = list;
            this.getHighSpeedVideoFpsRanges = true;
            this.getHighSpeedVideoFpsRangesFor = null;
        } else {
            this.interceptors$delegate = null;
            this.getHighSpeedVideoFpsRanges = false;
            this.getHighSpeedVideoFpsRangesFor = null;
        }
        for (java.lang.Object obj : from.getHighSpeedVideoSizes) {
            io.ktor.util.pipeline.PipelinePhase pipelinePhase = obj instanceof io.ktor.util.pipeline.PipelinePhase ? (io.ktor.util.pipeline.PipelinePhase) obj : null;
            if (pipelinePhase == null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                pipelinePhase = ((io.ktor.util.pipeline.PhaseContent) obj).getPhase();
            }
            if (obj instanceof io.ktor.util.pipeline.PhaseContent) {
                io.ktor.util.pipeline.PhaseContent phaseContent = (io.ktor.util.pipeline.PhaseContent) obj;
                if (!phaseContent.isEmpty()) {
                    io.ktor.util.pipeline.PhaseContent<TSubject, TContext> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(pipelinePhase);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(highResolutionOutputSizeshNQ4ISI);
                    phaseContent.addTo(highResolutionOutputSizeshNQ4ISI);
                    this.getHighResolutionOutputSizeshNQ4ISI += phaseContent.getSize();
                }
            }
        }
    }

    public final void resetFrom(io.ktor.util.pipeline.Pipeline<TSubject, TContext> from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        this.getHighSpeedVideoSizes.clear();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        getHighResolutionOutputSizeshNQ4ISI(from);
    }

    public java.lang.String toString() {
        return super.toString();
    }

    public final java.util.List<kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, TSubject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> phaseInterceptors$ktor_utils(io.ktor.util.pipeline.PipelinePhase phase) {
        java.util.List<kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, TSubject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> sharedInterceptors;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phase, "");
        io.ktor.util.pipeline.PhaseContent<TSubject, TContext> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(phase);
        return (highResolutionOutputSizeshNQ4ISI == null || (sharedInterceptors = highResolutionOutputSizeshNQ4ISI.sharedInterceptors()) == null) ? kotlin.collections.CollectionsKt.emptyList() : sharedInterceptors;
    }

    private final io.ktor.util.pipeline.PhaseContent<TSubject, TContext> getHighResolutionOutputSizeshNQ4ISI(io.ktor.util.pipeline.PipelinePhase p0) {
        java.util.List<java.lang.Object> list = this.getHighSpeedVideoSizes;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            java.lang.Object obj = list.get(i);
            if (obj == p0) {
                io.ktor.util.pipeline.PhaseContent<TSubject, TContext> phaseContent = new io.ktor.util.pipeline.PhaseContent<>(p0, io.ktor.util.pipeline.PipelinePhaseRelation.Last.INSTANCE);
                list.set(i, phaseContent);
                return phaseContent;
            }
            if (obj instanceof io.ktor.util.pipeline.PhaseContent) {
                io.ktor.util.pipeline.PhaseContent<TSubject, TContext> phaseContent2 = (io.ktor.util.pipeline.PhaseContent) obj;
                if (phaseContent2.getPhase() == p0) {
                    return phaseContent2;
                }
            }
        }
        return null;
    }

    private final int Camera2StreamConfigurationMap(io.ktor.util.pipeline.PipelinePhase p0) {
        java.util.List<java.lang.Object> list = this.getHighSpeedVideoSizes;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            java.lang.Object obj = list.get(i);
            if (obj == p0 || ((obj instanceof io.ktor.util.pipeline.PhaseContent) && ((io.ktor.util.pipeline.PhaseContent) obj).getPhase() == p0)) {
                return i;
            }
        }
        return -1;
    }

    private final boolean getHighSpeedVideoSizes(io.ktor.util.pipeline.PipelinePhase p0) {
        java.util.List<java.lang.Object> list = this.getHighSpeedVideoSizes;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            java.lang.Object obj = list.get(i);
            if (obj == p0) {
                return true;
            }
            if ((obj instanceof io.ktor.util.pipeline.PhaseContent) && ((io.ktor.util.pipeline.PhaseContent) obj).getPhase() == p0) {
                return true;
            }
        }
        return false;
    }

    private final java.util.List<kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, TSubject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> getHighSpeedVideoSizes() {
        int lastIndex;
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
            java.util.List<java.lang.Object> list = this.getHighSpeedVideoSizes;
            if (i == 1 && (lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list)) >= 0) {
                int i2 = 0;
                while (true) {
                    java.lang.Object obj = list.get(i2);
                    io.ktor.util.pipeline.PhaseContent phaseContent = obj instanceof io.ktor.util.pipeline.PhaseContent ? (io.ktor.util.pipeline.PhaseContent) obj : null;
                    if (phaseContent != null && !phaseContent.isEmpty()) {
                        java.util.List<kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, TSubject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> sharedInterceptors = phaseContent.sharedInterceptors();
                        this.interceptors$delegate = phaseContent.sharedInterceptors();
                        this.getHighSpeedVideoFpsRanges = false;
                        this.getHighSpeedVideoFpsRangesFor = phaseContent.getPhase();
                        return sharedInterceptors;
                    }
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2++;
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int lastIndex2 = kotlin.collections.CollectionsKt.getLastIndex(list);
            if (lastIndex2 >= 0) {
                int i3 = 0;
                while (true) {
                    java.lang.Object obj2 = list.get(i3);
                    io.ktor.util.pipeline.PhaseContent phaseContent2 = obj2 instanceof io.ktor.util.pipeline.PhaseContent ? (io.ktor.util.pipeline.PhaseContent) obj2 : null;
                    if (phaseContent2 != null) {
                        phaseContent2.addTo(arrayList);
                    }
                    if (i3 == lastIndex2) {
                        break;
                    }
                    i3++;
                }
            }
            this.interceptors$delegate = arrayList;
            this.getHighSpeedVideoFpsRanges = false;
            this.getHighSpeedVideoFpsRangesFor = null;
            return arrayList;
        }
        this.interceptors$delegate = kotlin.collections.CollectionsKt.emptyList();
        this.getHighSpeedVideoFpsRanges = false;
        this.getHighSpeedVideoFpsRangesFor = null;
        return kotlin.collections.CollectionsKt.emptyList();
    }

    private final boolean getHighResolutionOutputSizeshNQ4ISI(io.ktor.util.pipeline.Pipeline<TSubject, TContext> p0) {
        if (p0.getHighSpeedVideoSizes.isEmpty()) {
            return true;
        }
        int i = 0;
        if (!this.getHighSpeedVideoSizes.isEmpty()) {
            return false;
        }
        java.util.List<java.lang.Object> list = p0.getHighSpeedVideoSizes;
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
        if (lastIndex >= 0) {
            while (true) {
                java.lang.Object obj = list.get(i);
                if (obj instanceof io.ktor.util.pipeline.PipelinePhase) {
                    this.getHighSpeedVideoSizes.add(obj);
                } else if (obj instanceof io.ktor.util.pipeline.PhaseContent) {
                    io.ktor.util.pipeline.PhaseContent phaseContent = (io.ktor.util.pipeline.PhaseContent) obj;
                    this.getHighSpeedVideoSizes.add(new io.ktor.util.pipeline.PhaseContent(phaseContent.getPhase(), phaseContent.getRelation(), phaseContent.sharedInterceptors()));
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        this.getHighResolutionOutputSizeshNQ4ISI += p0.getHighResolutionOutputSizeshNQ4ISI;
        if (((java.util.List) p0.interceptors$delegate) == null) {
            p0.getHighSpeedVideoSizes();
        }
        p0.getHighSpeedVideoFpsRanges = true;
        java.util.List list2 = (java.util.List) p0.interceptors$delegate;
        kotlin.jvm.internal.Intrinsics.checkNotNull(list2);
        this.interceptors$delegate = list2;
        this.getHighSpeedVideoFpsRanges = true;
        this.getHighSpeedVideoFpsRangesFor = null;
        return true;
    }

    public final java.util.List<kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, TSubject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> interceptorsForTests$ktor_utils() {
        java.util.List<kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, TSubject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> list = (java.util.List) this.interceptors$delegate;
        return list == null ? getHighSpeedVideoSizes() : list;
    }
}
