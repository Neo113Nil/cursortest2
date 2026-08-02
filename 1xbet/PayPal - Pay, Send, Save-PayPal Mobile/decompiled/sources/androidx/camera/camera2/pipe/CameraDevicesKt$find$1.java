package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Landroidx/camera/camera2/pipe/CameraMetadata;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.CameraDevicesKt$find$1", f = "CameraDevices.kt", i = {0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4}, l = {197, 203, 206, 215, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "visited", "emitted", "$this$flow", "visited", "emitted", "$this$flow", "visited", "physicalId", "$this$flow", "visited"}, s = {"L$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$4", "L$0", "L$1"}, v = 1)
/* loaded from: classes6.dex */
final class CameraDevicesKt$find$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super androidx.camera.camera2.pipe.CameraMetadata>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.camera.camera2.pipe.CameraDevices Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ boolean getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0143, code lost:
    
        r16.getInputSizeshNQ4ISI = r8;
        r16.getHighSpeedVideoFpsRanges = r6;
        r16.getHighResolutionOutputSizeshNQ4ISI = r5;
        r16.getOutputFormats = r2;
        r16.getHighSpeedVideoSizesFor = r9;
        r16.getInputFormats = 4;
        r10 = r16.Camera2StreamConfigurationMap.mo302getCameraMetadata_mltaTw(r9, r16.getHighSpeedVideoFpsRangesFor, r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x015a, code lost:
    
        if (r10 == r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x015c, code lost:
    
        r15 = r5;
        r5 = r2;
        r2 = r9;
        r9 = r8;
        r8 = r6;
        r6 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010f  */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.util.Set] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x011b -> B:9:0x0129). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0190 -> B:9:0x0129). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ee -> B:35:0x0106). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0104 -> B:35:0x0106). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        java.lang.Object m288getCameraIdsiAq86To$default;
        java.util.LinkedHashSet linkedHashSet;
        java.util.LinkedHashSet linkedHashSet2;
        java.util.Iterator it;
        java.lang.Object obj2;
        kotlinx.coroutines.flow.FlowCollector flowCollector2;
        java.util.LinkedHashSet linkedHashSet3;
        java.util.Iterator it2;
        androidx.camera.camera2.pipe.CameraMetadata cameraMetadata;
        java.util.Iterator it3;
        kotlinx.coroutines.flow.FlowCollector flowCollector3;
        java.util.Set set;
        java.util.LinkedHashSet linkedHashSet4;
        java.util.Iterator<androidx.camera.camera2.pipe.CameraId> it4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getInputSizeshNQ4ISI;
            this.getInputSizeshNQ4ISI = flowCollector;
            this.getInputFormats = 1;
            m288getCameraIdsiAq86To$default = androidx.camera.camera2.pipe.CameraDevices.m288getCameraIdsiAq86To$default(this.Camera2StreamConfigurationMap, null, this, 1, null);
            if (m288getCameraIdsiAq86To$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    it2 = (java.util.Iterator) this.getOutputFormats;
                    ?? r8 = (java.util.Set) this.getHighResolutionOutputSizeshNQ4ISI;
                    linkedHashSet = (java.util.Set) this.getHighSpeedVideoFpsRanges;
                    flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.getInputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    obj2 = obj;
                    linkedHashSet3 = r8;
                    cameraMetadata = (androidx.camera.camera2.pipe.CameraMetadata) obj2;
                    linkedHashSet4 = linkedHashSet3;
                    if (cameraMetadata != null) {
                    }
                    java.util.LinkedHashSet linkedHashSet5 = linkedHashSet4;
                    it = it2;
                    flowCollector = flowCollector2;
                    linkedHashSet2 = linkedHashSet5;
                    while (it.hasNext()) {
                    }
                    if (this.getHighSpeedVideoSizes) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it4 = (java.util.Iterator) this.getOutputFormats;
                        it3 = (java.util.Iterator) this.getHighResolutionOutputSizeshNQ4ISI;
                        set = (java.util.Set) this.getHighSpeedVideoFpsRanges;
                        flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) this.getInputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        while (it4.hasNext()) {
                            java.lang.String m399unboximpl = it4.next().m399unboximpl();
                            if (!set.contains(androidx.camera.camera2.pipe.CameraId.m392boximpl(m399unboximpl))) {
                                break;
                            }
                        }
                        if (it3.hasNext()) {
                            it4 = ((androidx.camera.camera2.pipe.CameraMetadata) it3.next()).getPhysicalCameraIds().iterator();
                            while (it4.hasNext()) {
                            }
                            if (it3.hasNext()) {
                            }
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    java.lang.String str = (java.lang.String) this.getHighSpeedVideoSizesFor;
                    java.util.Iterator<androidx.camera.camera2.pipe.CameraId> it5 = (java.util.Iterator) this.getOutputFormats;
                    java.util.Iterator it6 = (java.util.Iterator) this.getHighResolutionOutputSizeshNQ4ISI;
                    java.util.Set set2 = (java.util.Set) this.getHighSpeedVideoFpsRanges;
                    kotlinx.coroutines.flow.FlowCollector flowCollector4 = (kotlinx.coroutines.flow.FlowCollector) this.getInputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.Object obj3 = obj;
                    androidx.camera.camera2.pipe.CameraMetadata cameraMetadata2 = (androidx.camera.camera2.pipe.CameraMetadata) obj3;
                    if (cameraMetadata2 != null && androidx.camera.camera2.pipe.CameraId.m395equalsimpl0(cameraMetadata2.getCamera(), str) && set2.add(androidx.camera.camera2.pipe.CameraId.m392boximpl(str))) {
                        this.getInputSizeshNQ4ISI = flowCollector4;
                        this.getHighSpeedVideoFpsRanges = set2;
                        this.getHighResolutionOutputSizeshNQ4ISI = it6;
                        this.getOutputFormats = it5;
                        this.getHighSpeedVideoSizesFor = null;
                        this.getInputFormats = 5;
                        if (flowCollector4.emit(cameraMetadata2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    it4 = it5;
                    it3 = it6;
                    set = set2;
                    flowCollector3 = flowCollector4;
                    while (it4.hasNext()) {
                    }
                    if (it3.hasNext()) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
                it2 = (java.util.Iterator) this.getOutputFormats;
                ?? r82 = (java.util.Set) this.getHighResolutionOutputSizeshNQ4ISI;
                linkedHashSet = (java.util.Set) this.getHighSpeedVideoFpsRanges;
                flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.getInputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                linkedHashSet4 = r82;
                java.util.LinkedHashSet linkedHashSet52 = linkedHashSet4;
                it = it2;
                flowCollector = flowCollector2;
                linkedHashSet2 = linkedHashSet52;
                while (it.hasNext()) {
                    java.lang.String m399unboximpl2 = ((androidx.camera.camera2.pipe.CameraId) it.next()).m399unboximpl();
                    if (linkedHashSet.add(androidx.camera.camera2.pipe.CameraId.m392boximpl(m399unboximpl2))) {
                        this.getInputSizeshNQ4ISI = flowCollector;
                        this.getHighSpeedVideoFpsRanges = linkedHashSet;
                        this.getHighResolutionOutputSizeshNQ4ISI = linkedHashSet2;
                        this.getOutputFormats = it;
                        this.getInputFormats = 2;
                        obj2 = this.Camera2StreamConfigurationMap.mo302getCameraMetadata_mltaTw(m399unboximpl2, this.getHighSpeedVideoFpsRangesFor, this);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        java.util.LinkedHashSet linkedHashSet6 = linkedHashSet2;
                        flowCollector2 = flowCollector;
                        it2 = it;
                        linkedHashSet3 = linkedHashSet6;
                        cameraMetadata = (androidx.camera.camera2.pipe.CameraMetadata) obj2;
                        linkedHashSet4 = linkedHashSet3;
                        if (cameraMetadata != null) {
                            linkedHashSet3.add(cameraMetadata);
                            this.getInputSizeshNQ4ISI = flowCollector2;
                            this.getHighSpeedVideoFpsRanges = linkedHashSet;
                            this.getHighResolutionOutputSizeshNQ4ISI = linkedHashSet3;
                            this.getOutputFormats = it2;
                            this.getInputFormats = 3;
                            linkedHashSet4 = linkedHashSet3;
                            if (flowCollector2.emit(cameraMetadata, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        java.util.LinkedHashSet linkedHashSet522 = linkedHashSet4;
                        it = it2;
                        flowCollector = flowCollector2;
                        linkedHashSet2 = linkedHashSet522;
                        while (it.hasNext()) {
                        }
                    }
                }
                if (this.getHighSpeedVideoSizes) {
                    it3 = linkedHashSet2.iterator();
                    flowCollector3 = flowCollector;
                    set = linkedHashSet;
                    if (it3.hasNext()) {
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
            flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getInputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
            m288getCameraIdsiAq86To$default = obj;
        }
        java.util.List list = (java.util.List) m288getCameraIdsiAq86To$default;
        if (list == null) {
            return kotlin.Unit.INSTANCE;
        }
        linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet2 = new java.util.LinkedHashSet();
        it = list.iterator();
        while (it.hasNext()) {
        }
        if (this.getHighSpeedVideoSizes) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super androidx.camera.camera2.pipe.CameraMetadata> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.pipe.CameraDevicesKt$find$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.camera.camera2.pipe.CameraDevicesKt$find$1 cameraDevicesKt$find$1 = new androidx.camera.camera2.pipe.CameraDevicesKt$find$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
        cameraDevicesKt$find$1.getInputSizeshNQ4ISI = obj;
        return cameraDevicesKt$find$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraDevicesKt$find$1(androidx.camera.camera2.pipe.CameraDevices cameraDevices, java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.CameraDevicesKt$find$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = cameraDevices;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoSizes = z;
    }
}
