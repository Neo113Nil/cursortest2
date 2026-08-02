package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "parentFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.ENROLLMENT_OS_UPGRADE_REQUIRED, androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_POLAR_RELATIVETO}, m = "invokeSuspend", n = {"parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "modifiedValuesSet", "alreadyComposed", "parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "modifiedValuesSet", "alreadyComposed"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"}, v = 1)
/* loaded from: classes.dex */
final class Recomposer$runRecomposeAndApplyChanges$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;
    final /* synthetic */ androidx.compose.runtime.Recomposer getOutputStallDurationlomOqCM;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c7  */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0147 -> B:6:0x014c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0164 -> B:7:0x00bf). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.runtime.MonotonicFrameClock monotonicFrameClock;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        androidx.collection.MutableScatterSet mutableScatterSetOf;
        androidx.collection.MutableScatterSet mutableScatterSetOf2;
        androidx.collection.MutableScatterSet mutableScatterSet;
        java.util.Set wrapIntoSet;
        androidx.collection.MutableScatterSet mutableScatterSetOf3;
        java.util.ArrayList arrayList4;
        java.util.ArrayList arrayList5;
        java.util.ArrayList arrayList6;
        androidx.collection.MutableScatterSet mutableScatterSet2;
        androidx.collection.MutableScatterSet mutableScatterSet3;
        java.util.Set set;
        androidx.collection.MutableScatterSet mutableScatterSet4;
        boolean outputSizes;
        boolean inputSizeshNQ4ISI;
        java.lang.Object highSpeedVideoFpsRangesFor;
        androidx.compose.runtime.NextFrameEndCallbackQueue nextFrameEndCallbackQueue;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        char c = 2;
        int i2 = 1;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            monotonicFrameClock = (androidx.compose.runtime.MonotonicFrameClock) this.Camera2StreamConfigurationMap;
            arrayList = new java.util.ArrayList();
            arrayList2 = new java.util.ArrayList();
            arrayList3 = new java.util.ArrayList();
            mutableScatterSetOf = androidx.collection.ScatterSetKt.mutableScatterSetOf();
            mutableScatterSetOf2 = androidx.collection.ScatterSetKt.mutableScatterSetOf();
            mutableScatterSet = new androidx.collection.MutableScatterSet(0, 1, null);
            wrapIntoSet = androidx.compose.runtime.collection.ScatterSetWrapperKt.wrapIntoSet(mutableScatterSet);
            mutableScatterSetOf3 = androidx.collection.ScatterSetKt.mutableScatterSetOf();
            inputSizeshNQ4ISI = this.getOutputStallDurationlomOqCM.getInputSizeshNQ4ISI();
            if (!inputSizeshNQ4ISI) {
            }
        } else if (i == 1) {
            androidx.collection.MutableScatterSet mutableScatterSet5 = (androidx.collection.MutableScatterSet) this.getOutputFormats;
            java.util.Set set2 = (java.util.Set) this.getInputSizeshNQ4ISI;
            androidx.collection.MutableScatterSet mutableScatterSet6 = (androidx.collection.MutableScatterSet) this.getHighSpeedVideoSizesFor;
            androidx.collection.MutableScatterSet mutableScatterSet7 = (androidx.collection.MutableScatterSet) this.getInputFormats;
            androidx.collection.MutableScatterSet mutableScatterSet8 = (androidx.collection.MutableScatterSet) this.getHighSpeedVideoSizes;
            ?? r9 = (java.util.List) this.getHighSpeedVideoFpsRangesFor;
            ?? r10 = (java.util.List) this.getHighSpeedVideoFpsRanges;
            ?? r11 = (java.util.List) this.getHighResolutionOutputSizeshNQ4ISI;
            androidx.compose.runtime.MonotonicFrameClock monotonicFrameClock2 = (androidx.compose.runtime.MonotonicFrameClock) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            arrayList6 = r9;
            arrayList5 = r10;
            arrayList4 = r11;
            set = set2;
            mutableScatterSet = mutableScatterSet6;
            mutableScatterSet3 = mutableScatterSet7;
            mutableScatterSet4 = mutableScatterSet5;
            monotonicFrameClock = monotonicFrameClock2;
            mutableScatterSet2 = mutableScatterSet8;
            outputSizes = this.getOutputStallDurationlomOqCM.getOutputSizes();
            if (outputSizes) {
            }
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.collection.MutableScatterSet mutableScatterSet9 = (androidx.collection.MutableScatterSet) this.getOutputFormats;
            java.util.Set set3 = (java.util.Set) this.getInputSizeshNQ4ISI;
            androidx.collection.MutableScatterSet mutableScatterSet10 = (androidx.collection.MutableScatterSet) this.getHighSpeedVideoSizesFor;
            androidx.collection.MutableScatterSet mutableScatterSet11 = (androidx.collection.MutableScatterSet) this.getInputFormats;
            androidx.collection.MutableScatterSet mutableScatterSet12 = (androidx.collection.MutableScatterSet) this.getHighSpeedVideoSizes;
            ?? r92 = (java.util.List) this.getHighSpeedVideoFpsRangesFor;
            ?? r102 = (java.util.List) this.getHighSpeedVideoFpsRanges;
            ?? r112 = (java.util.List) this.getHighResolutionOutputSizeshNQ4ISI;
            androidx.compose.runtime.MonotonicFrameClock monotonicFrameClock3 = (androidx.compose.runtime.MonotonicFrameClock) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.Object obj2 = coroutine_suspended;
            androidx.collection.MutableScatterSet mutableScatterSet13 = mutableScatterSet12;
            char c2 = 2;
            androidx.collection.MutableScatterSet mutableScatterSet14 = mutableScatterSet11;
            arrayList3 = r92;
            mutableScatterSetOf3 = mutableScatterSet9;
            monotonicFrameClock = monotonicFrameClock3;
            wrapIntoSet = set3;
            arrayList = r112;
            mutableScatterSet = mutableScatterSet10;
            arrayList2 = r102;
            this.getOutputStallDurationlomOqCM.Camera2StreamConfigurationMap();
            nextFrameEndCallbackQueue = this.getOutputStallDurationlomOqCM.CoroutineDebuggingKt;
            nextFrameEndCallbackQueue.markFrameComplete();
            i2 = 1;
            char c3 = c2;
            mutableScatterSetOf = mutableScatterSet13;
            coroutine_suspended = obj2;
            mutableScatterSetOf2 = mutableScatterSet14;
            c = c3;
            inputSizeshNQ4ISI = this.getOutputStallDurationlomOqCM.getInputSizeshNQ4ISI();
            if (!inputSizeshNQ4ISI) {
                this.Camera2StreamConfigurationMap = monotonicFrameClock;
                this.getHighResolutionOutputSizeshNQ4ISI = arrayList;
                this.getHighSpeedVideoFpsRanges = arrayList2;
                this.getHighSpeedVideoFpsRangesFor = arrayList3;
                this.getHighSpeedVideoSizes = mutableScatterSetOf;
                this.getInputFormats = mutableScatterSetOf2;
                this.getHighSpeedVideoSizesFor = mutableScatterSet;
                this.getInputSizeshNQ4ISI = wrapIntoSet;
                this.getOutputFormats = mutableScatterSetOf3;
                this.getOutputMinFrameDuration = i2;
                highSpeedVideoFpsRangesFor = this.getOutputStallDurationlomOqCM.getHighSpeedVideoFpsRangesFor((kotlin.coroutines.Continuation<? super kotlin.Unit>) this);
                if (highSpeedVideoFpsRangesFor == coroutine_suspended) {
                    return coroutine_suspended;
                }
                arrayList4 = arrayList;
                arrayList5 = arrayList2;
                arrayList6 = arrayList3;
                mutableScatterSet4 = mutableScatterSetOf3;
                mutableScatterSet2 = mutableScatterSetOf;
                java.util.Set set4 = wrapIntoSet;
                mutableScatterSet3 = mutableScatterSetOf2;
                set = set4;
                outputSizes = this.getOutputStallDurationlomOqCM.getOutputSizes();
                if (outputSizes) {
                    java.util.Set set5 = set;
                    java.lang.Object obj3 = coroutine_suspended;
                    androidx.collection.MutableScatterSet mutableScatterSet15 = mutableScatterSet2;
                    mutableScatterSetOf3 = mutableScatterSet4;
                    androidx.collection.MutableScatterSet mutableScatterSet16 = mutableScatterSet3;
                    wrapIntoSet = set5;
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    c = c;
                    mutableScatterSetOf = mutableScatterSet15;
                    coroutine_suspended = obj3;
                    mutableScatterSetOf2 = mutableScatterSet16;
                    arrayList3 = arrayList6;
                    i2 = 1;
                    inputSizeshNQ4ISI = this.getOutputStallDurationlomOqCM.getInputSizeshNQ4ISI();
                    if (!inputSizeshNQ4ISI) {
                    }
                } else {
                    final androidx.compose.runtime.Recomposer recomposer = this.getOutputStallDurationlomOqCM;
                    final androidx.collection.MutableScatterSet mutableScatterSet17 = mutableScatterSet4;
                    final androidx.collection.MutableScatterSet mutableScatterSet18 = mutableScatterSet;
                    final java.util.Set set6 = set;
                    final java.util.ArrayList arrayList7 = arrayList4;
                    androidx.collection.MutableScatterSet mutableScatterSet19 = mutableScatterSet;
                    final java.util.ArrayList arrayList8 = arrayList5;
                    final androidx.collection.MutableScatterSet mutableScatterSet20 = mutableScatterSet3;
                    final androidx.collection.MutableScatterSet mutableScatterSet21 = mutableScatterSet2;
                    java.lang.Object obj4 = coroutine_suspended;
                    mutableScatterSet13 = mutableScatterSet2;
                    final java.util.ArrayList arrayList9 = arrayList6;
                    java.util.ArrayList arrayList10 = arrayList6;
                    java.util.ArrayList arrayList11 = arrayList5;
                    this.Camera2StreamConfigurationMap = monotonicFrameClock;
                    this.getHighResolutionOutputSizeshNQ4ISI = arrayList4;
                    this.getHighSpeedVideoFpsRanges = arrayList11;
                    this.getHighSpeedVideoFpsRangesFor = arrayList10;
                    this.getHighSpeedVideoSizes = mutableScatterSet13;
                    this.getInputFormats = mutableScatterSet20;
                    this.getHighSpeedVideoSizesFor = mutableScatterSet19;
                    wrapIntoSet = set6;
                    this.getInputSizeshNQ4ISI = wrapIntoSet;
                    mutableScatterSetOf3 = mutableScatterSet17;
                    this.getOutputFormats = mutableScatterSetOf3;
                    c2 = 2;
                    this.getOutputMinFrameDuration = 2;
                    java.lang.Object withFrameNanos = monotonicFrameClock.withFrameNanos(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj5) {
                            kotlin.Unit Camera2StreamConfigurationMap;
                            Camera2StreamConfigurationMap = androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.Camera2StreamConfigurationMap(androidx.compose.runtime.Recomposer.this, mutableScatterSet18, mutableScatterSet17, arrayList7, arrayList8, mutableScatterSet21, arrayList9, mutableScatterSet20, set6, ((java.lang.Long) obj5).longValue());
                            return Camera2StreamConfigurationMap;
                        }
                    }, this);
                    obj2 = obj4;
                    if (withFrameNanos == obj2) {
                        return obj2;
                    }
                    mutableScatterSet = mutableScatterSet19;
                    arrayList = arrayList4;
                    arrayList2 = arrayList11;
                    mutableScatterSet14 = mutableScatterSet20;
                    arrayList3 = arrayList10;
                    this.getOutputStallDurationlomOqCM.Camera2StreamConfigurationMap();
                    nextFrameEndCallbackQueue = this.getOutputStallDurationlomOqCM.CoroutineDebuggingKt;
                    nextFrameEndCallbackQueue.markFrameComplete();
                    i2 = 1;
                    char c32 = c2;
                    mutableScatterSetOf = mutableScatterSet13;
                    coroutine_suspended = obj2;
                    mutableScatterSetOf2 = mutableScatterSet14;
                    c = c32;
                    inputSizeshNQ4ISI = this.getOutputStallDurationlomOqCM.getInputSizeshNQ4ISI();
                    if (!inputSizeshNQ4ISI) {
                        return kotlin.Unit.INSTANCE;
                    }
                }
            }
        }
    }

    private static final void getHighSpeedVideoFpsRanges(androidx.compose.runtime.Recomposer recomposer, java.util.List<androidx.compose.runtime.ControlledComposition> list, java.util.List<androidx.compose.runtime.MovableContentStateReference> list2, java.util.List<androidx.compose.runtime.ControlledComposition> list3, androidx.collection.MutableScatterSet<androidx.compose.runtime.ControlledComposition> mutableScatterSet, androidx.collection.MutableScatterSet<androidx.compose.runtime.ControlledComposition> mutableScatterSet2, androidx.collection.MutableScatterSet<java.lang.Object> mutableScatterSet3, androidx.collection.MutableScatterSet<androidx.compose.runtime.ControlledComposition> mutableScatterSet4) {
        synchronized (recomposer.b) {
            list.clear();
            list2.clear();
            int size = list3.size();
            for (int i = 0; i < size; i++) {
                androidx.compose.runtime.ControlledComposition controlledComposition = list3.get(i);
                controlledComposition.abandonChanges();
                recomposer.Camera2StreamConfigurationMap(controlledComposition);
            }
            list3.clear();
            androidx.collection.MutableScatterSet<androidx.compose.runtime.ControlledComposition> mutableScatterSet5 = mutableScatterSet;
            java.lang.Object[] objArr = mutableScatterSet5.elements;
            long[] jArr = mutableScatterSet5.metadata;
            int length = jArr.length - 2;
            char c = 7;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((j & 255) < 128) {
                                androidx.compose.runtime.ControlledComposition controlledComposition2 = (androidx.compose.runtime.ControlledComposition) objArr[(i2 << 3) + i4];
                                controlledComposition2.abandonChanges();
                                recomposer.Camera2StreamConfigurationMap(controlledComposition2);
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            mutableScatterSet.clear();
            androidx.collection.MutableScatterSet<androidx.compose.runtime.ControlledComposition> mutableScatterSet6 = mutableScatterSet2;
            java.lang.Object[] objArr2 = mutableScatterSet6.elements;
            long[] jArr2 = mutableScatterSet6.metadata;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i5 = 0;
                while (true) {
                    long j2 = jArr2[i5];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length2)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j2 & 255) < 128) {
                                ((androidx.compose.runtime.ControlledComposition) objArr2[(i5 << 3) + i7]).changesApplied();
                            }
                            j2 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        }
                    }
                    if (i5 == length2) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            mutableScatterSet2.clear();
            mutableScatterSet3.clear();
            androidx.collection.MutableScatterSet<androidx.compose.runtime.ControlledComposition> mutableScatterSet7 = mutableScatterSet4;
            java.lang.Object[] objArr3 = mutableScatterSet7.elements;
            long[] jArr3 = mutableScatterSet7.metadata;
            int length3 = jArr3.length - 2;
            if (length3 >= 0) {
                int i8 = 0;
                while (true) {
                    long j3 = jArr3[i8];
                    if ((((~j3) << c) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8 - ((~(i8 - length3)) >>> 31);
                        for (int i10 = 0; i10 < i9; i10++) {
                            if ((j3 & 255) < 128) {
                                androidx.compose.runtime.ControlledComposition controlledComposition3 = (androidx.compose.runtime.ControlledComposition) objArr3[(i8 << 3) + i10];
                                controlledComposition3.abandonChanges();
                                recomposer.Camera2StreamConfigurationMap(controlledComposition3);
                            }
                            j3 >>= 8;
                        }
                        if (i9 != 8) {
                            break;
                        }
                    }
                    if (i8 == length3) {
                        break;
                    }
                    i8++;
                    c = 7;
                }
            }
            mutableScatterSet4.clear();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(java.util.List<androidx.compose.runtime.MovableContentStateReference> list, androidx.compose.runtime.Recomposer recomposer) {
        java.util.List list2;
        java.util.List list3;
        list.clear();
        synchronized (recomposer.b) {
            list2 = recomposer.getValidOutputFormatsForInputhNQ4ISI;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                list.add((androidx.compose.runtime.MovableContentStateReference) list2.get(i));
            }
            list3 = recomposer.getValidOutputFormatsForInputhNQ4ISI;
            list3.clear();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0381  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.runtime.Recomposer recomposer, androidx.collection.MutableScatterSet mutableScatterSet, androidx.collection.MutableScatterSet mutableScatterSet2, java.util.List list, java.util.List list2, androidx.collection.MutableScatterSet mutableScatterSet3, java.util.List list3, androidx.collection.MutableScatterSet mutableScatterSet4, java.util.Set set, long j) {
        boolean highSpeedVideoFpsRanges;
        java.lang.Object beginSection;
        androidx.compose.runtime.collection.MutableVector mutableVector;
        boolean z;
        androidx.compose.runtime.collection.MutableVector mutableVector2;
        java.util.List outputSizeshNQ4ISI;
        androidx.compose.runtime.collection.MutableVector mutableVector3;
        java.util.List highResolutionOutputSizeshNQ4ISI;
        androidx.compose.runtime.collection.MutableVector mutableVector4;
        androidx.compose.runtime.ControlledComposition highSpeedVideoSizes;
        androidx.compose.runtime.BroadcastFrameClock broadcastFrameClock;
        java.util.List list4 = list2;
        androidx.collection.MutableScatterSet mutableScatterSet5 = mutableScatterSet3;
        java.util.List list5 = list3;
        highSpeedVideoFpsRanges = recomposer.getHighSpeedVideoFpsRanges();
        if (highSpeedVideoFpsRanges) {
            beginSection = androidx.compose.runtime.internal.Trace.INSTANCE.beginSection("Recomposer:animation");
            try {
                broadcastFrameClock = recomposer.getInputSizeshNQ4ISI;
                broadcastFrameClock.sendFrame(j);
                androidx.compose.runtime.snapshots.Snapshot.INSTANCE.sendApplyNotifications();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            } finally {
                androidx.compose.runtime.internal.Trace.INSTANCE.endSection(beginSection);
            }
        }
        beginSection = androidx.compose.runtime.internal.Trace.INSTANCE.beginSection("Recomposer:recompose");
        try {
            recomposer.getOutputSizes();
            synchronized (recomposer.b) {
                mutableVector = recomposer.getHighSpeedVideoSizesFor;
                java.lang.Object[] objArr = mutableVector.content;
                int size = mutableVector.getSize();
                z = 0;
                for (int i = 0; i < size; i++) {
                    list.add((androidx.compose.runtime.ControlledComposition) objArr[i]);
                }
                mutableVector2 = recomposer.getHighSpeedVideoSizesFor;
                mutableVector2.clear();
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            }
            mutableScatterSet.clear();
            mutableScatterSet2.clear();
            while (true) {
                if (list.isEmpty() && list4.isEmpty()) {
                    break;
                }
                int i2 = z;
                try {
                    int size2 = list.size();
                    for (int i3 = i2; i3 < size2; i3++) {
                        androidx.compose.runtime.ControlledComposition controlledComposition = (androidx.compose.runtime.ControlledComposition) list.get(i3);
                        highSpeedVideoSizes = recomposer.getHighSpeedVideoSizes(controlledComposition, mutableScatterSet);
                        if (highSpeedVideoSizes != null) {
                            list3.add(highSpeedVideoSizes);
                            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                            kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                        }
                        mutableScatterSet2.add(controlledComposition);
                    }
                    list.clear();
                    if (!mutableScatterSet.isNotEmpty()) {
                        mutableVector4 = recomposer.getHighSpeedVideoSizesFor;
                        if (mutableVector4.getSize() == 0) {
                            if (list.isEmpty()) {
                                list4 = list2;
                            } else {
                                list4 = list2;
                                try {
                                    getHighResolutionOutputSizeshNQ4ISI(list4, recomposer);
                                    while (!list4.isEmpty()) {
                                        highResolutionOutputSizeshNQ4ISI = recomposer.getHighResolutionOutputSizeshNQ4ISI((java.util.List<androidx.compose.runtime.MovableContentStateReference>) list4, (androidx.collection.MutableScatterSet<java.lang.Object>) mutableScatterSet);
                                        try {
                                            mutableScatterSet3.plusAssign((java.lang.Iterable) highResolutionOutputSizeshNQ4ISI);
                                            getHighResolutionOutputSizeshNQ4ISI(list4, recomposer);
                                        } catch (java.lang.Throwable th) {
                                            th = th;
                                            androidx.compose.runtime.Recomposer.getHighResolutionOutputSizeshNQ4ISI(recomposer, th, true, 2);
                                            getHighSpeedVideoFpsRanges(recomposer, list, list2, list3, mutableScatterSet3, mutableScatterSet4, mutableScatterSet, mutableScatterSet2);
                                            return kotlin.Unit.INSTANCE;
                                        }
                                    }
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                }
                            }
                            list5 = list3;
                            mutableScatterSet5 = mutableScatterSet3;
                            z = 0;
                        }
                    }
                    synchronized (recomposer.b) {
                        outputSizeshNQ4ISI = recomposer.getOutputSizeshNQ4ISI();
                        int size3 = outputSizeshNQ4ISI.size();
                        for (int i4 = i2; i4 < size3; i4++) {
                            androidx.compose.runtime.ControlledComposition controlledComposition2 = (androidx.compose.runtime.ControlledComposition) outputSizeshNQ4ISI.get(i4);
                            if (!mutableScatterSet2.contains(controlledComposition2) && controlledComposition2.observesAnyOf(set)) {
                                list.add(controlledComposition2);
                            }
                        }
                        mutableVector3 = recomposer.getHighSpeedVideoSizesFor;
                        int size4 = mutableVector3.getSize();
                        int i5 = i2;
                        int i6 = i5;
                        while (i5 < size4) {
                            androidx.compose.runtime.ControlledComposition controlledComposition3 = (androidx.compose.runtime.ControlledComposition) mutableVector3.content[i5];
                            if (!mutableScatterSet2.contains(controlledComposition3) && !list.contains(controlledComposition3)) {
                                list.add(controlledComposition3);
                                i6++;
                            } else if (i6 > 0) {
                                mutableVector3.content[i5 - i6] = mutableVector3.content[i5];
                            }
                            i5++;
                        }
                        int i7 = size4 - i6;
                        kotlin.collections.ArraysKt.fill(mutableVector3.content, (java.lang.Object) null, i7, size4);
                        mutableVector3.setSize(i7);
                        kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                    }
                    if (list.isEmpty()) {
                    }
                    list5 = list3;
                    mutableScatterSet5 = mutableScatterSet3;
                    z = 0;
                } catch (java.lang.Throwable th3) {
                    try {
                        androidx.compose.runtime.Recomposer.getHighResolutionOutputSizeshNQ4ISI(recomposer, th3, true, 2);
                        getHighSpeedVideoFpsRanges(recomposer, list, list2, list3, mutableScatterSet3, mutableScatterSet4, mutableScatterSet, mutableScatterSet2);
                        return kotlin.Unit.INSTANCE;
                    } finally {
                        list.clear();
                    }
                }
            }
            androidx.compose.runtime.snapshots.Snapshot current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
            androidx.compose.runtime.snapshots.Snapshot transparentObserverMutableSnapshot = current instanceof androidx.compose.runtime.snapshots.MutableSnapshot ? new androidx.compose.runtime.snapshots.TransparentObserverMutableSnapshot((androidx.compose.runtime.snapshots.MutableSnapshot) current, null, null, true, false) : new androidx.compose.runtime.snapshots.TransparentObserverSnapshot(current, null, true, z);
            try {
                androidx.compose.runtime.snapshots.Snapshot makeCurrent = transparentObserverMutableSnapshot.makeCurrent();
                try {
                    if (!list5.isEmpty()) {
                        recomposer.changeCount = recomposer.getChangeCount() + 1;
                        try {
                            int size5 = list5.size();
                            for (int i8 = z; i8 < size5; i8++) {
                                mutableScatterSet4.add((androidx.compose.runtime.ControlledComposition) list5.get(i8));
                            }
                            int size6 = list5.size();
                            for (int i9 = z; i9 < size6; i9++) {
                                ((androidx.compose.runtime.ControlledComposition) list5.get(i9)).applyChanges();
                            }
                        } catch (java.lang.Throwable th4) {
                            try {
                                androidx.compose.runtime.Recomposer.getHighResolutionOutputSizeshNQ4ISI(recomposer, th4, z, 6);
                                getHighSpeedVideoFpsRanges(recomposer, list, list2, list3, mutableScatterSet3, mutableScatterSet4, mutableScatterSet, mutableScatterSet2);
                                kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                                transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                                return unit6;
                            } finally {
                                list3.clear();
                            }
                        }
                    }
                    if (mutableScatterSet3.isNotEmpty()) {
                        try {
                            mutableScatterSet4.plusAssign((androidx.collection.ScatterSet) mutableScatterSet5);
                            androidx.collection.MutableScatterSet mutableScatterSet6 = mutableScatterSet5;
                            java.lang.Object[] objArr2 = mutableScatterSet6.elements;
                            long[] jArr = mutableScatterSet6.metadata;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i10 = 0;
                                while (true) {
                                    long j2 = jArr[i10];
                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                                        long j3 = j2;
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            if ((j3 & 255) < 128) {
                                                ((androidx.compose.runtime.ControlledComposition) objArr2[(i10 << 3) + i12]).applyLateChanges();
                                            }
                                            j3 >>= 8;
                                        }
                                        if (i11 != 8) {
                                            break;
                                        }
                                    }
                                    if (i10 == length) {
                                        break;
                                    }
                                    i10++;
                                }
                            }
                        } catch (java.lang.Throwable th5) {
                            try {
                                androidx.compose.runtime.Recomposer.getHighResolutionOutputSizeshNQ4ISI(recomposer, th5, false, 6);
                                getHighSpeedVideoFpsRanges(recomposer, list, list2, list3, mutableScatterSet3, mutableScatterSet4, mutableScatterSet, mutableScatterSet2);
                                kotlin.Unit unit7 = kotlin.Unit.INSTANCE;
                                transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                                return unit7;
                            } finally {
                                mutableScatterSet3.clear();
                            }
                        }
                    }
                    if (mutableScatterSet4.isNotEmpty()) {
                        try {
                            androidx.collection.MutableScatterSet mutableScatterSet7 = mutableScatterSet4;
                            java.lang.Object[] objArr3 = mutableScatterSet7.elements;
                            long[] jArr2 = mutableScatterSet7.metadata;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i13 = 0;
                                while (true) {
                                    long j4 = jArr2[i13];
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i14 = 8 - ((~(i13 - length2)) >>> 31);
                                        long j5 = j4;
                                        for (int i15 = 0; i15 < i14; i15++) {
                                            if ((j5 & 255) < 128) {
                                                ((androidx.compose.runtime.ControlledComposition) objArr3[(i13 << 3) + i15]).changesApplied();
                                            }
                                            j5 >>= 8;
                                        }
                                        if (i14 != 8) {
                                            break;
                                        }
                                    }
                                    if (i13 == length2) {
                                        break;
                                    }
                                    i13++;
                                }
                            }
                        } catch (java.lang.Throwable th6) {
                            try {
                                androidx.compose.runtime.Recomposer.getHighResolutionOutputSizeshNQ4ISI(recomposer, th6, false, 6);
                                getHighSpeedVideoFpsRanges(recomposer, list, list2, list3, mutableScatterSet3, mutableScatterSet4, mutableScatterSet, mutableScatterSet2);
                                kotlin.Unit unit8 = kotlin.Unit.INSTANCE;
                                transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                                return unit8;
                            } finally {
                                mutableScatterSet4.clear();
                            }
                        }
                    }
                    kotlin.Unit unit9 = kotlin.Unit.INSTANCE;
                    transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                    transparentObserverMutableSnapshot.dispose();
                    synchronized (recomposer.b) {
                        recomposer.getHighSpeedVideoFpsRangesFor();
                    }
                    androidx.compose.runtime.snapshots.Snapshot.INSTANCE.notifyObjectsInitialized();
                    mutableScatterSet2.clear();
                    mutableScatterSet.clear();
                    recomposer.getOutputMinFrameDuration = null;
                    kotlin.Unit unit10 = kotlin.Unit.INSTANCE;
                    androidx.compose.runtime.internal.Trace.INSTANCE.endSection(beginSection);
                    return kotlin.Unit.INSTANCE;
                } catch (java.lang.Throwable th7) {
                    transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                    throw th7;
                }
            } finally {
                transparentObserverMutableSnapshot.dispose();
            }
        } catch (java.lang.Throwable th8) {
            throw th8;
        }
    }

    private java.lang.Object Camera2StreamConfigurationMap(androidx.compose.runtime.MonotonicFrameClock monotonicFrameClock, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2(this.getOutputStallDurationlomOqCM, continuation);
        recomposer$runRecomposeAndApplyChanges$2.Camera2StreamConfigurationMap = monotonicFrameClock;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.runtime.MonotonicFrameClock monotonicFrameClock, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return Camera2StreamConfigurationMap(monotonicFrameClock, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Recomposer$runRecomposeAndApplyChanges$2(androidx.compose.runtime.Recomposer recomposer, kotlin.coroutines.Continuation<? super androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2> continuation) {
        super(3, continuation);
        this.getOutputStallDurationlomOqCM = recomposer;
    }
}
