package androidx.camera.camera2.pipe.internal;

@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u000278B'\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00112\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000%¢\u0006\u0004\b&\u0010'J#\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u00112\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\u0014¢\u0006\u0004\b/\u00100J\"\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a022\f\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0003J,\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a022\u0006\u00104\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011H\u0002J\b\u00106\u001a\u00020\u001fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Landroidx/camera/camera2/pipe/internal/OutputDistributor;", "T", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "maximumCachedOutputs", "", "outputFinalizer", "Landroidx/camera/camera2/pipe/media/Finalizer;", "outputMatcher", "Landroidx/camera/camera2/pipe/internal/OutputMatcher;", "<init>", "(ILandroidx/camera/camera2/pipe/media/Finalizer;Landroidx/camera/camera2/pipe/internal/OutputMatcher;)V", "lock", "", com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED, "", "cameraOutputSequenceNumbers", "", "newestCameraOutputNumber", "newestFrameNumber", "Landroidx/camera/camera2/pipe/FrameNumber;", "J", "lastFailedFrameNumber", "lastFailedCameraOutputNumber", "startedOutputs", "", "Landroidx/camera/camera2/pipe/internal/OutputDistributor$StartedOutput;", "availableOutputs", "", "Landroidx/camera/camera2/pipe/internal/OutputResult;", "onOutputStarted", "", "cameraFrameNumber", "cameraTimestamp", "Landroidx/camera/camera2/pipe/CameraTimestamp;", "cameraOutputNumber", "outputListener", "Landroidx/camera/camera2/pipe/internal/OutputDistributor$OutputListener;", "onOutputStarted-qGubWw0", "(JJJLandroidx/camera/camera2/pipe/internal/OutputDistributor$OutputListener;)V", "onOutputResult", "outputNumber", "outputResult", "onOutputResult-DvZWqE8", "(JLjava/lang/Object;)V", "onOutputFailure", "frameNumber", "onOutputFailure-Vw7M1qk", "(J)V", "removeOutputsOlderThan", "", "output", "isOutOfOrder", "cameraOutputSequence", "close", "OutputListener", "StartedOutput", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OutputDistributor<T> implements java.lang.AutoCloseable {
    private long Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private long getHighSpeedVideoFpsRanges;
    private long getHighSpeedVideoFpsRangesFor;
    private final java.util.Map<java.lang.Long, androidx.camera.camera2.pipe.internal.OutputResult<T>> getHighSpeedVideoSizes;
    private long getHighSpeedVideoSizesFor;
    private final int getInputFormats;
    private final java.lang.Object getInputSizeshNQ4ISI;
    private final androidx.camera.camera2.pipe.media.Finalizer<T> getOutputFormats;
    private long getOutputMinFrameDuration;
    private final java.util.List<androidx.camera.camera2.pipe.internal.OutputDistributor.StartedOutput<T>> getOutputMinFrameDurationlomOqCM;
    private final androidx.camera.camera2.pipe.internal.OutputMatcher getOutputStallDuration;

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J=\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\nH&¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/internal/OutputDistributor$OutputListener;", "T", "", "Landroidx/camera/camera2/pipe/FrameNumber;", "cameraFrameNumber", "Landroidx/camera/camera2/pipe/CameraTimestamp;", "cameraTimestamp", "", "cameraOutputSequence", "outputNumber", "Landroidx/camera/camera2/pipe/internal/OutputResult;", "outputResult", "", "onOutputComplete-3ejhThk", "(JJJJLjava/lang/Object;)V", "onOutputComplete"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OutputListener<T> {
        /* renamed from: onOutputComplete-3ejhThk */
        void mo966onOutputComplete3ejhThk(long cameraFrameNumber, long cameraTimestamp, long cameraOutputSequence, long outputNumber, java.lang.Object outputResult);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OutputDistributor(int i, androidx.camera.camera2.pipe.media.Finalizer<? super T> finalizer, androidx.camera.camera2.pipe.internal.OutputMatcher outputMatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(finalizer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputMatcher, "");
        this.getInputFormats = i;
        this.getOutputFormats = finalizer;
        this.getOutputStallDuration = outputMatcher;
        this.getInputSizeshNQ4ISI = new java.lang.Object();
        this.Camera2StreamConfigurationMap = 1L;
        this.getHighSpeedVideoSizesFor = Long.MIN_VALUE;
        this.getOutputMinFrameDuration = androidx.camera.camera2.pipe.FrameNumber.m498constructorimpl(Long.MIN_VALUE);
        this.getHighSpeedVideoFpsRangesFor = Long.MIN_VALUE;
        this.getHighSpeedVideoFpsRanges = Long.MIN_VALUE;
        this.getOutputMinFrameDurationlomOqCM = new java.util.ArrayList();
        this.getHighSpeedVideoSizes = new java.util.LinkedHashMap();
    }

    public /* synthetic */ OutputDistributor(int i, androidx.camera.camera2.pipe.media.Finalizer finalizer, androidx.camera.camera2.pipe.internal.OutputMatcher outputMatcher, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 3 : i, finalizer, outputMatcher);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* renamed from: onOutputStarted-qGubWw0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m978onOutputStartedqGubWw0(long cameraFrameNumber, long cameraTimestamp, long cameraOutputNumber, androidx.camera.camera2.pipe.internal.OutputDistributor.OutputListener<T> outputListener) {
        java.lang.Object obj;
        T t;
        long j;
        boolean z;
        T t2;
        java.lang.Long l;
        T t3;
        java.util.List<androidx.camera.camera2.pipe.internal.OutputDistributor.StartedOutput<T>> list;
        androidx.camera.camera2.pipe.internal.OutputResult<T> outputResult;
        boolean z2;
        java.lang.Long l2;
        androidx.camera.camera2.pipe.internal.OutputResult outputResult2;
        java.lang.Object m979access$constructorimpl;
        T t4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputListener, "");
        kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        java.lang.Object obj2 = this.getInputSizeshNQ4ISI;
        synchronized (obj2) {
            try {
                java.util.Iterator<T> it = this.getOutputMinFrameDurationlomOqCM.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = (T) null;
                        break;
                    } else {
                        t = it.next();
                        if (androidx.camera.camera2.pipe.FrameNumber.m500equalsimpl0(((androidx.camera.camera2.pipe.internal.OutputDistributor.StartedOutput) t).getGetHighResolutionOutputSizeshNQ4ISI(), cameraFrameNumber)) {
                            break;
                        }
                    }
                }
                if (t == null) {
                    boolean z3 = this.getHighResolutionOutputSizeshNQ4ISI;
                    long j2 = this.Camera2StreamConfigurationMap;
                    this.Camera2StreamConfigurationMap = 1 + j2;
                    try {
                        if (!z3 && this.getHighSpeedVideoFpsRangesFor != cameraFrameNumber && this.getHighSpeedVideoFpsRanges != cameraOutputNumber) {
                            boolean z4 = cameraFrameNumber < this.getOutputMinFrameDuration;
                            if (!z4) {
                                this.getOutputMinFrameDuration = cameraFrameNumber;
                            }
                            boolean z5 = cameraOutputNumber < this.getHighSpeedVideoSizesFor;
                            if (!z5) {
                                this.getHighSpeedVideoSizesFor = cameraOutputNumber;
                            }
                            boolean z6 = z4 || z5;
                            java.util.Iterator<T> it2 = this.getHighSpeedVideoSizes.keySet().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    t4 = (T) null;
                                    break;
                                } else {
                                    t4 = it2.next();
                                    if (this.getOutputStallDuration.fuzzyEqual(cameraOutputNumber, ((java.lang.Number) t4).longValue())) {
                                        break;
                                    }
                                }
                            }
                            l = t4;
                            if (l != null) {
                                outputResult = this.getHighSpeedVideoSizes.remove(l);
                                list = getHighResolutionOutputSizeshNQ4ISI(z6, j2, cameraOutputNumber);
                                j = j2;
                                z = z3;
                                obj = obj2;
                                l2 = l;
                                z2 = true;
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                if (list != null) {
                                    java.util.Iterator<T> it3 = list.iterator();
                                    while (it3.hasNext()) {
                                        androidx.camera.camera2.pipe.internal.OutputDistributor.StartedOutput startedOutput = (androidx.camera.camera2.pipe.internal.OutputDistributor.StartedOutput) it3.next();
                                        int m554getERROR_OUTPUT_MISSINGU7r42EA = androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m554getERROR_OUTPUT_MISSINGU7r42EA();
                                        androidx.camera.camera2.pipe.internal.OutputResult.Companion companion = androidx.camera.camera2.pipe.internal.OutputResult.INSTANCE;
                                        startedOutput.getHighSpeedVideoFpsRangesFor(-1L, androidx.camera.camera2.pipe.internal.OutputResult.m979access$constructorimpl(androidx.camera.camera2.pipe.OutputStatus.m543boximpl(m554getERROR_OUTPUT_MISSINGU7r42EA)));
                                    }
                                }
                                outputResult2 = (androidx.camera.camera2.pipe.internal.OutputResult) objectRef.element;
                                if (outputResult2 != null) {
                                    java.lang.Object getHighSpeedVideoSizes = outputResult2.getGetHighSpeedVideoSizes();
                                    if (!androidx.camera.camera2.pipe.internal.OutputResult.m983getAvailableimpl(getHighSpeedVideoSizes)) {
                                        getHighSpeedVideoSizes = null;
                                    }
                                    if (getHighSpeedVideoSizes != null) {
                                        this.getOutputFormats.finalize(getHighSpeedVideoSizes);
                                    }
                                }
                                if (z2) {
                                    if (z) {
                                        androidx.camera.camera2.pipe.internal.OutputResult.Companion companion2 = androidx.camera.camera2.pipe.internal.OutputResult.INSTANCE;
                                        m979access$constructorimpl = androidx.camera.camera2.pipe.internal.OutputResult.m979access$constructorimpl(androidx.camera.camera2.pipe.OutputStatus.m543boximpl(androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m551getERROR_OUTPUT_ABORTEDU7r42EA()));
                                    } else {
                                        androidx.camera.camera2.pipe.internal.OutputResult<T> outputResult3 = outputResult;
                                        if (outputResult3 != null) {
                                            m979access$constructorimpl = outputResult3.getGetHighSpeedVideoSizes();
                                        } else {
                                            androidx.camera.camera2.pipe.internal.OutputResult.Companion companion3 = androidx.camera.camera2.pipe.internal.OutputResult.INSTANCE;
                                            m979access$constructorimpl = androidx.camera.camera2.pipe.internal.OutputResult.m979access$constructorimpl(androidx.camera.camera2.pipe.OutputStatus.m543boximpl(androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m553getERROR_OUTPUT_FAILEDU7r42EA()));
                                        }
                                    }
                                    outputListener.mo966onOutputComplete3ejhThk(cameraFrameNumber, cameraTimestamp, j, l2 != null ? l2.longValue() : -1L, m979access$constructorimpl);
                                    return;
                                }
                                return;
                            }
                            j = j2;
                            boolean z7 = z6;
                            z = z3;
                            obj = obj2;
                            this.getOutputMinFrameDurationlomOqCM.add(new androidx.camera.camera2.pipe.internal.OutputDistributor.StartedOutput<>(z7, cameraFrameNumber, cameraTimestamp, j, cameraOutputNumber, outputListener, null));
                            list = null;
                            l2 = null;
                            outputResult = null;
                            z2 = false;
                            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                            if (list != null) {
                            }
                            outputResult2 = (androidx.camera.camera2.pipe.internal.OutputResult) objectRef.element;
                            if (outputResult2 != null) {
                            }
                            if (z2) {
                            }
                        }
                        j = j2;
                        z = z3;
                        obj = obj2;
                        java.util.Iterator<T> it4 = this.getHighSpeedVideoSizes.keySet().iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                t2 = (T) null;
                                break;
                            } else {
                                t2 = it4.next();
                                if (this.getOutputStallDuration.fuzzyEqual(cameraOutputNumber, ((java.lang.Number) t2).longValue())) {
                                    break;
                                }
                            }
                        }
                        l = t2;
                        if (l != null) {
                            java.lang.Long l3 = l;
                            t3 = (T) this.getHighSpeedVideoSizes.remove(l);
                        } else {
                            t3 = null;
                        }
                        objectRef.element = t3;
                        list = null;
                        outputResult = null;
                        l2 = l;
                        z2 = true;
                        kotlin.Unit unit22 = kotlin.Unit.INSTANCE;
                        if (list != null) {
                        }
                        outputResult2 = (androidx.camera.camera2.pipe.internal.OutputResult) objectRef.element;
                        if (outputResult2 != null) {
                        }
                        if (z2) {
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        throw th;
                    }
                } else if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                    androidx.camera.camera2.pipe.FrameNumber.m502toStringimpl(cameraFrameNumber);
                    androidx.camera.camera2.pipe.CameraTimestamp.m432toStringimpl(cameraTimestamp);
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                obj = obj2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: onOutputResult-DvZWqE8, reason: not valid java name */
    public final void m977onOutputResultDvZWqE8(long outputNumber, java.lang.Object outputResult) {
        androidx.camera.camera2.pipe.internal.OutputResult<T> m980boximpl;
        java.util.List<androidx.camera.camera2.pipe.internal.OutputDistributor.StartedOutput<T>> list;
        T t;
        synchronized (this.getInputSizeshNQ4ISI) {
            if (!this.getHighResolutionOutputSizeshNQ4ISI && !this.getOutputStallDuration.fuzzyEqual(this.getHighSpeedVideoFpsRanges, outputNumber)) {
                java.util.Iterator<T> it = this.getOutputMinFrameDurationlomOqCM.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = (T) null;
                        break;
                    } else {
                        t = it.next();
                        if (this.getOutputStallDuration.fuzzyEqual(((androidx.camera.camera2.pipe.internal.OutputDistributor.StartedOutput) t).getGetHighSpeedVideoSizes(), outputNumber)) {
                            break;
                        }
                    }
                }
                androidx.camera.camera2.pipe.internal.OutputDistributor.StartedOutput startedOutput = t;
                if (startedOutput == null) {
                    this.getHighSpeedVideoSizes.put(java.lang.Long.valueOf(outputNumber), androidx.camera.camera2.pipe.internal.OutputResult.m980boximpl(outputResult));
                    if (this.getHighSpeedVideoSizes.size() > this.getInputFormats) {
                        m980boximpl = this.getHighSpeedVideoSizes.remove(java.lang.Long.valueOf(((java.lang.Number) kotlin.collections.CollectionsKt.first(this.getHighSpeedVideoSizes.keySet())).longValue()));
                        list = null;
                    } else {
                        m980boximpl = null;
                        list = null;
                    }
                } else {
                    list = getHighResolutionOutputSizeshNQ4ISI(startedOutput.getGetHighSpeedVideoFpsRangesFor(), startedOutput.getGetHighSpeedVideoFpsRanges(), startedOutput.getGetHighSpeedVideoSizes());
                    startedOutput.getHighSpeedVideoFpsRangesFor(outputNumber, outputResult);
                    this.getOutputMinFrameDurationlomOqCM.remove(startedOutput);
                    m980boximpl = null;
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            m980boximpl = androidx.camera.camera2.pipe.internal.OutputResult.m980boximpl(outputResult);
            list = null;
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        }
        androidx.camera.camera2.pipe.internal.OutputResult<T> outputResult2 = m980boximpl;
        if (outputResult2 != null) {
            java.lang.Object getHighSpeedVideoSizes = outputResult2.getGetHighSpeedVideoSizes();
            java.lang.Object obj = androidx.camera.camera2.pipe.internal.OutputResult.m983getAvailableimpl(getHighSpeedVideoSizes) ? getHighSpeedVideoSizes : null;
            if (obj != null) {
                this.getOutputFormats.finalize(obj);
            }
        }
        if (list != null) {
            java.util.Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                androidx.camera.camera2.pipe.internal.OutputDistributor.StartedOutput startedOutput2 = (androidx.camera.camera2.pipe.internal.OutputDistributor.StartedOutput) it2.next();
                int m554getERROR_OUTPUT_MISSINGU7r42EA = androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m554getERROR_OUTPUT_MISSINGU7r42EA();
                androidx.camera.camera2.pipe.internal.OutputResult.Companion companion = androidx.camera.camera2.pipe.internal.OutputResult.INSTANCE;
                startedOutput2.getHighSpeedVideoFpsRangesFor(-1L, androidx.camera.camera2.pipe.internal.OutputResult.m979access$constructorimpl(androidx.camera.camera2.pipe.OutputStatus.m543boximpl(m554getERROR_OUTPUT_MISSINGU7r42EA)));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0032, code lost:
    
        if (r3 == false) goto L16;
     */
    /* renamed from: onOutputFailure-Vw7M1qk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m976onOutputFailureVw7M1qk(long frameNumber) {
        synchronized (this.getInputSizeshNQ4ISI) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = frameNumber;
            java.util.Iterator<T> it = this.getOutputMinFrameDurationlomOqCM.iterator();
            androidx.camera.camera2.pipe.internal.OutputDistributor.StartedOutput startedOutput = null;
            boolean z = false;
            androidx.camera.camera2.pipe.internal.OutputDistributor.StartedOutput startedOutput2 = null;
            while (true) {
                if (it.hasNext()) {
                    T next = it.next();
                    if (androidx.camera.camera2.pipe.FrameNumber.m500equalsimpl0(((androidx.camera.camera2.pipe.internal.OutputDistributor.StartedOutput) next).getGetHighResolutionOutputSizeshNQ4ISI(), frameNumber)) {
                        if (z) {
                            break;
                        }
                        z = true;
                        startedOutput2 = next;
                    }
                }
            }
            startedOutput2 = null;
            androidx.camera.camera2.pipe.internal.OutputDistributor.StartedOutput startedOutput3 = startedOutput2;
            if (startedOutput3 != null) {
                this.getHighSpeedVideoFpsRanges = startedOutput3.getGetHighSpeedVideoSizes();
                this.getOutputMinFrameDurationlomOqCM.remove(startedOutput3);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                startedOutput = startedOutput3;
            }
            if (startedOutput != null) {
                int m553getERROR_OUTPUT_FAILEDU7r42EA = androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m553getERROR_OUTPUT_FAILEDU7r42EA();
                androidx.camera.camera2.pipe.internal.OutputResult.Companion companion = androidx.camera.camera2.pipe.internal.OutputResult.INSTANCE;
                startedOutput.getHighSpeedVideoFpsRangesFor(-1L, androidx.camera.camera2.pipe.internal.OutputResult.m979access$constructorimpl(androidx.camera.camera2.pipe.OutputStatus.m543boximpl(m553getERROR_OUTPUT_FAILEDU7r42EA)));
            }
        }
    }

    private final java.util.List<androidx.camera.camera2.pipe.internal.OutputDistributor.StartedOutput<T>> getHighResolutionOutputSizeshNQ4ISI(boolean z, long j, long j2) {
        java.util.List<androidx.camera.camera2.pipe.internal.OutputDistributor.StartedOutput<T>> list = this.getOutputMinFrameDurationlomOqCM;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (T t : list) {
            androidx.camera.camera2.pipe.internal.OutputDistributor.StartedOutput startedOutput = (androidx.camera.camera2.pipe.internal.OutputDistributor.StartedOutput) t;
            if (startedOutput.getGetHighSpeedVideoFpsRangesFor() == z && startedOutput.getGetHighSpeedVideoFpsRanges() < j && startedOutput.getGetHighSpeedVideoSizes() < j2) {
                arrayList.add(t);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        this.getOutputMinFrameDurationlomOqCM.removeAll(arrayList2);
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.getInputSizeshNQ4ISI) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            java.util.List mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) this.getHighSpeedVideoSizes.values());
            this.getHighSpeedVideoSizes.clear();
            java.util.List<androidx.camera.camera2.pipe.internal.OutputDistributor.StartedOutput> mutableList2 = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) this.getOutputMinFrameDurationlomOqCM);
            this.getOutputMinFrameDurationlomOqCM.clear();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            java.util.Iterator it = mutableList.iterator();
            while (it.hasNext()) {
                java.lang.Object getHighSpeedVideoSizes = ((androidx.camera.camera2.pipe.internal.OutputResult) it.next()).getGetHighSpeedVideoSizes();
                androidx.camera.camera2.pipe.media.Finalizer<T> finalizer = this.getOutputFormats;
                if (!androidx.camera.camera2.pipe.internal.OutputResult.m983getAvailableimpl(getHighSpeedVideoSizes)) {
                    getHighSpeedVideoSizes = null;
                }
                finalizer.finalize(getHighSpeedVideoSizes);
            }
            for (androidx.camera.camera2.pipe.internal.OutputDistributor.StartedOutput startedOutput : mutableList2) {
                int m551getERROR_OUTPUT_ABORTEDU7r42EA = androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m551getERROR_OUTPUT_ABORTEDU7r42EA();
                androidx.camera.camera2.pipe.internal.OutputResult.Companion companion = androidx.camera.camera2.pipe.internal.OutputResult.INSTANCE;
                startedOutput.getHighSpeedVideoFpsRangesFor(-1L, androidx.camera.camera2.pipe.internal.OutputResult.m979access$constructorimpl(androidx.camera.camera2.pipe.OutputStatus.m543boximpl(m551getERROR_OUTPUT_ABORTEDU7r42EA)));
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0012\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0014\u0010 \u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010!R\u001a\u0010\u001e\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\u0012\u0010\"R\u001a\u0010$\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010!\u001a\u0004\b$\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010)"}, d2 = {"Landroidx/camera/camera2/pipe/internal/OutputDistributor$StartedOutput;", "T", "", "", "p0", "Landroidx/camera/camera2/pipe/FrameNumber;", "p1", "Landroidx/camera/camera2/pipe/CameraTimestamp;", "p2", "", "p3", "p4", "Landroidx/camera/camera2/pipe/internal/OutputDistributor$OutputListener;", "p5", "<init>", "(ZJJJJLandroidx/camera/camera2/pipe/internal/OutputDistributor$OutputListener;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/camera/camera2/pipe/internal/OutputResult;", "", "getHighSpeedVideoFpsRangesFor", "(JLjava/lang/Object;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getInputSizeshNQ4ISI", "Z", "getHighSpeedVideoFpsRanges", "()Z", "Camera2StreamConfigurationMap", "J", "()J", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "getOutputMinFrameDuration", "Landroidx/camera/camera2/pipe/internal/OutputDistributor$OutputListener;", "getHighSpeedVideoSizesFor", "Lkotlinx/atomicfu/AtomicBoolean;", "Lkotlinx/atomicfu/AtomicBoolean;", "getInputFormats"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final /* data */ class StartedOutput<T> {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final long getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final kotlinx.atomicfu.AtomicBoolean getInputFormats;
        private final long getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final long getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final long Camera2StreamConfigurationMap;

        /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
        private final boolean getHighSpeedVideoFpsRangesFor;

        /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
        private final androidx.camera.camera2.pipe.internal.OutputDistributor.OutputListener<T> getHighSpeedVideoSizesFor;

        private StartedOutput(boolean z, long j, long j2, long j3, long j4, androidx.camera.camera2.pipe.internal.OutputDistributor.OutputListener<T> outputListener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputListener, "");
            this.getHighSpeedVideoFpsRangesFor = z;
            this.getHighResolutionOutputSizeshNQ4ISI = j;
            this.Camera2StreamConfigurationMap = j2;
            this.getHighSpeedVideoFpsRanges = j3;
            this.getHighSpeedVideoSizes = j4;
            this.getHighSpeedVideoSizesFor = outputListener;
            this.getInputFormats = kotlinx.atomicfu.AtomicFU.atomic(false);
        }

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from getter */
        public final boolean getGetHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        /* renamed from: Camera2StreamConfigurationMap, reason: from getter */
        public final long getGetHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from getter */
        public final long getGetHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoFpsRanges;
        }

        /* renamed from: getHighSpeedVideoSizes, reason: from getter */
        public final long getGetHighSpeedVideoSizes() {
            return this.getHighSpeedVideoSizes;
        }

        public final void getHighSpeedVideoFpsRangesFor(long p0, java.lang.Object p1) {
            if (!this.getInputFormats.compareAndSet(false, true)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Output ");
                sb.append(this.getHighSpeedVideoFpsRanges);
                sb.append(" at ");
                sb.append((java.lang.Object) androidx.camera.camera2.pipe.FrameNumber.m502toStringimpl(this.getHighResolutionOutputSizeshNQ4ISI));
                sb.append(" for ");
                sb.append(p0);
                sb.append(" was completed multiple times!");
                throw new java.lang.IllegalStateException(sb.toString().toString());
            }
            this.getHighSpeedVideoSizesFor.mo966onOutputComplete3ejhThk(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, p0, p1);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StartedOutput(getHighSpeedVideoFpsRangesFor=");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
            sb.append((java.lang.Object) androidx.camera.camera2.pipe.FrameNumber.m502toStringimpl(this.getHighResolutionOutputSizeshNQ4ISI));
            sb.append(", Camera2StreamConfigurationMap=");
            sb.append((java.lang.Object) androidx.camera.camera2.pipe.CameraTimestamp.m432toStringimpl(this.Camera2StreamConfigurationMap));
            sb.append(", getHighSpeedVideoFpsRanges=");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(", getHighSpeedVideoSizes=");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(", getHighSpeedVideoSizesFor=");
            sb.append(this.getHighSpeedVideoSizesFor);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((java.lang.Boolean.hashCode(this.getHighSpeedVideoFpsRangesFor) * 31) + androidx.camera.camera2.pipe.FrameNumber.m501hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI)) * 31) + androidx.camera.camera2.pipe.CameraTimestamp.m431hashCodeimpl(this.Camera2StreamConfigurationMap)) * 31) + java.lang.Long.hashCode(this.getHighSpeedVideoFpsRanges)) * 31) + java.lang.Long.hashCode(this.getHighSpeedVideoSizes)) * 31) + this.getHighSpeedVideoSizesFor.hashCode();
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof androidx.camera.camera2.pipe.internal.OutputDistributor.StartedOutput)) {
                return false;
            }
            androidx.camera.camera2.pipe.internal.OutputDistributor.StartedOutput startedOutput = (androidx.camera.camera2.pipe.internal.OutputDistributor.StartedOutput) p0;
            return this.getHighSpeedVideoFpsRangesFor == startedOutput.getHighSpeedVideoFpsRangesFor && androidx.camera.camera2.pipe.FrameNumber.m500equalsimpl0(this.getHighResolutionOutputSizeshNQ4ISI, startedOutput.getHighResolutionOutputSizeshNQ4ISI) && androidx.camera.camera2.pipe.CameraTimestamp.m430equalsimpl0(this.Camera2StreamConfigurationMap, startedOutput.Camera2StreamConfigurationMap) && this.getHighSpeedVideoFpsRanges == startedOutput.getHighSpeedVideoFpsRanges && this.getHighSpeedVideoSizes == startedOutput.getHighSpeedVideoSizes && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizesFor, startedOutput.getHighSpeedVideoSizesFor);
        }

        public /* synthetic */ StartedOutput(boolean z, long j, long j2, long j3, long j4, androidx.camera.camera2.pipe.internal.OutputDistributor.OutputListener outputListener, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(z, j, j2, j3, j4, outputListener);
        }
    }
}
