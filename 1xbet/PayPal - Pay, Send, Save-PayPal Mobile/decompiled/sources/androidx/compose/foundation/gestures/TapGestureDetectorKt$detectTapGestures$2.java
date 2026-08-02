package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class TapGestureDetectorKt$detectTapGestures$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.ui.input.pointer.PointerInputScope Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function3<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getInputSizeshNQ4ISI;
            androidx.compose.foundation.gestures.PressGestureScopeImpl pressGestureScopeImpl = new androidx.compose.foundation.gestures.PressGestureScopeImpl(this.Camera2StreamConfigurationMap);
            this.getOutputMinFrameDuration = 1;
            if (androidx.compose.foundation.gestures.ForEachGestureKt.awaitEachGesture(this.Camera2StreamConfigurationMap, new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1(coroutineScope, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, pressGestureScopeImpl, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", i = {0, 1, 1, 2, 2, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6, 7}, l = {105, 116, 119, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, 149, 167, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "resetJob", "$this$awaitEachGesture", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_DOWN, "resetJob", "resetJob", "$this$awaitEachGesture", "upOrCancel", "cancelOrReleaseJob", "resetJob", "upOrCancel", "$this$awaitEachGesture", "resetJob", "upOrCancel", "secondDown", "resetJob"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0"}, v = 1)
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> Camera2StreamConfigurationMap;
        final /* synthetic */ kotlin.jvm.functions.Function3<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> getHighSpeedVideoSizes;
        java.lang.Object getHighSpeedVideoSizesFor;
        int getInputFormats;
        java.lang.Object getInputSizeshNQ4ISI;
        java.lang.Object getOutputFormats;
        final /* synthetic */ androidx.compose.foundation.gestures.PressGestureScopeImpl getOutputMinFrameDuration;
        private /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

        /* JADX WARN: Code restructure failed: missing block: B:93:0x00fb, code lost:
        
            if (r14 != r0) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x021a  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0250  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0264  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0283  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x019f  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x01b0  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x014c  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0170  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x00eb  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope;
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
            kotlinx.coroutines.CoroutineStart Camera2StreamConfigurationMap;
            kotlinx.coroutines.Job launch$default;
            kotlin.jvm.functions.Function3<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function3;
            kotlin.jvm.functions.Function3<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function32;
            androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
            kotlinx.coroutines.Job highSpeedVideoSizes;
            java.lang.Object Camera2StreamConfigurationMap2;
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3;
            androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3;
            java.lang.Object highSpeedVideoFpsRangesFor;
            kotlinx.coroutines.Job job;
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4;
            kotlinx.coroutines.CoroutineStart Camera2StreamConfigurationMap3;
            kotlinx.coroutines.Job launch$default2;
            kotlin.jvm.functions.Function3<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function33;
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange5;
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange6;
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange7;
            androidx.compose.foundation.gestures.LongPressResult longPressResult;
            java.lang.Object highSpeedVideoFpsRangesFor2;
            kotlinx.coroutines.Job job2;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.getInputFormats) {
                case 0:
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getOutputStallDurationlomOqCM;
                    this.getOutputStallDurationlomOqCM = awaitPointerEventScope4;
                    this.getInputFormats = 1;
                    java.lang.Object awaitFirstDown$default = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope4, false, null, this, 3, null);
                    if (awaitFirstDown$default != coroutine_suspended) {
                        awaitPointerEventScope = awaitPointerEventScope4;
                        obj = awaitFirstDown$default;
                        pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
                        pointerInputChange.consume();
                        kotlinx.coroutines.CoroutineScope coroutineScope = this.getHighSpeedVideoFpsRanges;
                        Camera2StreamConfigurationMap = androidx.compose.foundation.gestures.TapGestureDetectorKt.Camera2StreamConfigurationMap();
                        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, Camera2StreamConfigurationMap, new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$resetJob$1(this.getOutputMinFrameDuration, null), 1, null);
                        function3 = this.getHighResolutionOutputSizeshNQ4ISI;
                        function32 = androidx.compose.foundation.gestures.TapGestureDetectorKt.getHighSpeedVideoFpsRanges;
                        if (function3 != function32) {
                            androidx.compose.foundation.gestures.TapGestureDetectorKt.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, launch$default, androidx.compose.foundation.gestures.TapGestureDetectorKt.Camera2StreamConfigurationMap(), new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.C00151(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration, pointerInputChange, null));
                        }
                        if (this.Camera2StreamConfigurationMap == null) {
                            this.getOutputStallDurationlomOqCM = awaitPointerEventScope;
                            this.getHighSpeedVideoSizesFor = pointerInputChange;
                            this.getOutputFormats = launch$default;
                            this.getInputFormats = 3;
                            obj = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForLongPress$default(awaitPointerEventScope, null, this, 1, null);
                            break;
                        } else {
                            this.getOutputStallDurationlomOqCM = awaitPointerEventScope;
                            this.getHighSpeedVideoSizesFor = launch$default;
                            this.getInputFormats = 2;
                            obj = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation$default(awaitPointerEventScope, null, this, 1, null);
                            if (obj != coroutine_suspended) {
                                awaitPointerEventScope2 = awaitPointerEventScope;
                                pointerInputChange2 = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
                                if (pointerInputChange2 == null) {
                                    highSpeedVideoSizes = androidx.compose.foundation.gestures.TapGestureDetectorKt.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, launch$default, androidx.compose.foundation.gestures.TapGestureDetectorKt.Camera2StreamConfigurationMap(), new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass3(this.getOutputMinFrameDuration, null));
                                } else {
                                    pointerInputChange2.consume();
                                    highSpeedVideoSizes = androidx.compose.foundation.gestures.TapGestureDetectorKt.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, launch$default, androidx.compose.foundation.gestures.TapGestureDetectorKt.Camera2StreamConfigurationMap(), new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass4(this.getOutputMinFrameDuration, null));
                                }
                                if (pointerInputChange2 != null) {
                                    if (this.getHighSpeedVideoSizes == null) {
                                        kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> function1 = this.getHighSpeedVideoFpsRangesFor;
                                        if (function1 != null) {
                                            function1.invoke(androidx.compose.ui.geometry.Offset.m5741boximpl(pointerInputChange2.getPosition()));
                                        }
                                    } else {
                                        this.getOutputStallDurationlomOqCM = awaitPointerEventScope2;
                                        this.getHighSpeedVideoSizesFor = pointerInputChange2;
                                        this.getOutputFormats = highSpeedVideoSizes;
                                        this.getInputFormats = 5;
                                        Camera2StreamConfigurationMap2 = androidx.compose.foundation.gestures.TapGestureDetectorKt.Camera2StreamConfigurationMap(awaitPointerEventScope2, pointerInputChange2, (kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange>) this);
                                        if (Camera2StreamConfigurationMap2 != coroutine_suspended) {
                                            androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope5 = awaitPointerEventScope2;
                                            pointerInputChange3 = pointerInputChange2;
                                            obj = Camera2StreamConfigurationMap2;
                                            awaitPointerEventScope3 = awaitPointerEventScope5;
                                            pointerInputChange4 = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
                                            if (pointerInputChange4 != null) {
                                                kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> function12 = this.getHighSpeedVideoFpsRangesFor;
                                                if (function12 != null) {
                                                    function12.invoke(androidx.compose.ui.geometry.Offset.m5741boximpl(pointerInputChange3.getPosition()));
                                                }
                                            } else {
                                                kotlinx.coroutines.CoroutineScope coroutineScope2 = this.getHighSpeedVideoFpsRanges;
                                                Camera2StreamConfigurationMap3 = androidx.compose.foundation.gestures.TapGestureDetectorKt.Camera2StreamConfigurationMap();
                                                launch$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, Camera2StreamConfigurationMap3, new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass5(highSpeedVideoSizes, this.getOutputMinFrameDuration, null), 1, null);
                                                kotlin.jvm.functions.Function3<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function34 = this.getHighResolutionOutputSizeshNQ4ISI;
                                                function33 = androidx.compose.foundation.gestures.TapGestureDetectorKt.getHighSpeedVideoFpsRanges;
                                                if (function34 != function33) {
                                                    androidx.compose.foundation.gestures.TapGestureDetectorKt.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, launch$default2, androidx.compose.foundation.gestures.TapGestureDetectorKt.Camera2StreamConfigurationMap(), new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass6(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration, pointerInputChange4, null));
                                                }
                                                if (this.Camera2StreamConfigurationMap == null) {
                                                    this.getOutputStallDurationlomOqCM = launch$default2;
                                                    this.getHighSpeedVideoSizesFor = pointerInputChange3;
                                                    this.getOutputFormats = null;
                                                    this.getInputFormats = 6;
                                                    obj = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation$default(awaitPointerEventScope3, null, this, 1, null);
                                                    if (obj != coroutine_suspended) {
                                                        pointerInputChange6 = pointerInputChange3;
                                                        pointerInputChange7 = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
                                                        if (pointerInputChange7 != null) {
                                                            pointerInputChange7.consume();
                                                            androidx.compose.foundation.gestures.TapGestureDetectorKt.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, launch$default2, androidx.compose.foundation.gestures.TapGestureDetectorKt.Camera2StreamConfigurationMap(), new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass7(this.getOutputMinFrameDuration, null));
                                                            this.getHighSpeedVideoSizes.invoke(androidx.compose.ui.geometry.Offset.m5741boximpl(pointerInputChange7.getPosition()));
                                                        } else {
                                                            androidx.compose.foundation.gestures.TapGestureDetectorKt.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, launch$default2, androidx.compose.foundation.gestures.TapGestureDetectorKt.Camera2StreamConfigurationMap(), new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass8(this.getOutputMinFrameDuration, null));
                                                            kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> function13 = this.getHighSpeedVideoFpsRangesFor;
                                                            if (function13 != null) {
                                                                function13.invoke(androidx.compose.ui.geometry.Offset.m5741boximpl(pointerInputChange6.getPosition()));
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    this.getOutputStallDurationlomOqCM = awaitPointerEventScope3;
                                                    this.getHighSpeedVideoSizesFor = launch$default2;
                                                    this.getOutputFormats = pointerInputChange3;
                                                    this.getInputSizeshNQ4ISI = pointerInputChange4;
                                                    this.getInputFormats = 7;
                                                    java.lang.Object waitForLongPress$default = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForLongPress$default(awaitPointerEventScope3, null, this, 1, null);
                                                    if (waitForLongPress$default != coroutine_suspended) {
                                                        pointerInputChange5 = pointerInputChange4;
                                                        obj = waitForLongPress$default;
                                                        longPressResult = (androidx.compose.foundation.gestures.LongPressResult) obj;
                                                        if (kotlin.jvm.internal.Intrinsics.areEqual(longPressResult, androidx.compose.foundation.gestures.LongPressResult.Success.INSTANCE)) {
                                                            if (longPressResult instanceof androidx.compose.foundation.gestures.LongPressResult.Released) {
                                                                pointerInputChange7 = ((androidx.compose.foundation.gestures.LongPressResult.Released) longPressResult).getFinalUpChange();
                                                            } else {
                                                                if (!(longPressResult instanceof androidx.compose.foundation.gestures.LongPressResult.Canceled)) {
                                                                    throw new kotlin.NoWhenBranchMatchedException();
                                                                }
                                                                pointerInputChange7 = null;
                                                            }
                                                            pointerInputChange6 = pointerInputChange3;
                                                            if (pointerInputChange7 != null) {
                                                            }
                                                        } else {
                                                            this.Camera2StreamConfigurationMap.invoke(androidx.compose.ui.geometry.Offset.m5741boximpl(pointerInputChange5.getPosition()));
                                                            this.getOutputStallDurationlomOqCM = launch$default2;
                                                            this.getHighSpeedVideoSizesFor = null;
                                                            this.getOutputFormats = null;
                                                            this.getInputSizeshNQ4ISI = null;
                                                            this.getInputFormats = 8;
                                                            highSpeedVideoFpsRangesFor2 = androidx.compose.foundation.gestures.TapGestureDetectorKt.getHighSpeedVideoFpsRangesFor(awaitPointerEventScope3, this);
                                                            if (highSpeedVideoFpsRangesFor2 != coroutine_suspended) {
                                                                job2 = launch$default2;
                                                                androidx.compose.foundation.gestures.TapGestureDetectorKt.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, job2, androidx.compose.foundation.gestures.TapGestureDetectorKt.Camera2StreamConfigurationMap(), new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1(this.getOutputMinFrameDuration, null));
                                                                return kotlin.Unit.INSTANCE;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                        }
                    }
                    return coroutine_suspended;
                case 1:
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope6 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getOutputStallDurationlomOqCM;
                    kotlin.ResultKt.throwOnFailure(obj);
                    awaitPointerEventScope = awaitPointerEventScope6;
                    pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
                    pointerInputChange.consume();
                    kotlinx.coroutines.CoroutineScope coroutineScope3 = this.getHighSpeedVideoFpsRanges;
                    Camera2StreamConfigurationMap = androidx.compose.foundation.gestures.TapGestureDetectorKt.Camera2StreamConfigurationMap();
                    launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, Camera2StreamConfigurationMap, new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$resetJob$1(this.getOutputMinFrameDuration, null), 1, null);
                    function3 = this.getHighResolutionOutputSizeshNQ4ISI;
                    function32 = androidx.compose.foundation.gestures.TapGestureDetectorKt.getHighSpeedVideoFpsRanges;
                    if (function3 != function32) {
                    }
                    if (this.Camera2StreamConfigurationMap == null) {
                    }
                    return coroutine_suspended;
                case 2:
                    launch$default = (kotlinx.coroutines.Job) this.getHighSpeedVideoSizesFor;
                    awaitPointerEventScope2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getOutputStallDurationlomOqCM;
                    kotlin.ResultKt.throwOnFailure(obj);
                    pointerInputChange2 = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
                    if (pointerInputChange2 == null) {
                    }
                    if (pointerInputChange2 != null) {
                    }
                    return kotlin.Unit.INSTANCE;
                case 3:
                    launch$default = (kotlinx.coroutines.Job) this.getOutputFormats;
                    pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) this.getHighSpeedVideoSizesFor;
                    awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getOutputStallDurationlomOqCM;
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.foundation.gestures.LongPressResult longPressResult2 = (androidx.compose.foundation.gestures.LongPressResult) obj;
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(longPressResult2, androidx.compose.foundation.gestures.LongPressResult.Success.INSTANCE)) {
                        if (longPressResult2 instanceof androidx.compose.foundation.gestures.LongPressResult.Released) {
                            pointerInputChange2 = ((androidx.compose.foundation.gestures.LongPressResult.Released) longPressResult2).getFinalUpChange();
                        } else {
                            if (!(longPressResult2 instanceof androidx.compose.foundation.gestures.LongPressResult.Canceled)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            pointerInputChange2 = null;
                        }
                        awaitPointerEventScope2 = awaitPointerEventScope;
                        if (pointerInputChange2 == null) {
                        }
                        if (pointerInputChange2 != null) {
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    this.Camera2StreamConfigurationMap.invoke(androidx.compose.ui.geometry.Offset.m5741boximpl(pointerInputChange.getPosition()));
                    this.getOutputStallDurationlomOqCM = launch$default;
                    this.getHighSpeedVideoSizesFor = null;
                    this.getOutputFormats = null;
                    this.getInputFormats = 4;
                    highSpeedVideoFpsRangesFor = androidx.compose.foundation.gestures.TapGestureDetectorKt.getHighSpeedVideoFpsRangesFor(awaitPointerEventScope, this);
                    if (highSpeedVideoFpsRangesFor != coroutine_suspended) {
                        job = launch$default;
                        androidx.compose.foundation.gestures.TapGestureDetectorKt.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, job, androidx.compose.foundation.gestures.TapGestureDetectorKt.Camera2StreamConfigurationMap(), new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass2(this.getOutputMinFrameDuration, null));
                        return kotlin.Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                case 4:
                    job = (kotlinx.coroutines.Job) this.getOutputStallDurationlomOqCM;
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.foundation.gestures.TapGestureDetectorKt.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, job, androidx.compose.foundation.gestures.TapGestureDetectorKt.Camera2StreamConfigurationMap(), new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass2(this.getOutputMinFrameDuration, null));
                    return kotlin.Unit.INSTANCE;
                case 5:
                    highSpeedVideoSizes = (kotlinx.coroutines.Job) this.getOutputFormats;
                    pointerInputChange3 = (androidx.compose.ui.input.pointer.PointerInputChange) this.getHighSpeedVideoSizesFor;
                    awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getOutputStallDurationlomOqCM;
                    kotlin.ResultKt.throwOnFailure(obj);
                    pointerInputChange4 = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
                    if (pointerInputChange4 != null) {
                    }
                    break;
                case 6:
                    pointerInputChange6 = (androidx.compose.ui.input.pointer.PointerInputChange) this.getHighSpeedVideoSizesFor;
                    launch$default2 = (kotlinx.coroutines.Job) this.getOutputStallDurationlomOqCM;
                    kotlin.ResultKt.throwOnFailure(obj);
                    pointerInputChange7 = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
                    if (pointerInputChange7 != null) {
                    }
                    return kotlin.Unit.INSTANCE;
                case 7:
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange8 = (androidx.compose.ui.input.pointer.PointerInputChange) this.getInputSizeshNQ4ISI;
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange9 = (androidx.compose.ui.input.pointer.PointerInputChange) this.getOutputFormats;
                    kotlinx.coroutines.Job job3 = (kotlinx.coroutines.Job) this.getHighSpeedVideoSizesFor;
                    awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getOutputStallDurationlomOqCM;
                    kotlin.ResultKt.throwOnFailure(obj);
                    pointerInputChange5 = pointerInputChange8;
                    launch$default2 = job3;
                    pointerInputChange3 = pointerInputChange9;
                    longPressResult = (androidx.compose.foundation.gestures.LongPressResult) obj;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(longPressResult, androidx.compose.foundation.gestures.LongPressResult.Success.INSTANCE)) {
                    }
                    break;
                case 8:
                    job2 = (kotlinx.coroutines.Job) this.getOutputStallDurationlomOqCM;
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.foundation.gestures.TapGestureDetectorKt.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, job2, androidx.compose.foundation.gestures.TapGestureDetectorKt.Camera2StreamConfigurationMap(), new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1(this.getOutputMinFrameDuration, null));
                    return kotlin.Unit.INSTANCE;
                default:
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", f = "TapGestureDetector.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00151 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            int Camera2StreamConfigurationMap;
            final /* synthetic */ kotlin.jvm.functions.Function3<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRanges;
            final /* synthetic */ androidx.compose.ui.input.pointer.PointerInputChange getHighSpeedVideoFpsRangesFor;
            final /* synthetic */ androidx.compose.foundation.gestures.PressGestureScopeImpl getHighSpeedVideoSizes;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.Camera2StreamConfigurationMap;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.functions.Function3<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function3 = this.getHighSpeedVideoFpsRanges;
                    androidx.compose.foundation.gestures.PressGestureScopeImpl pressGestureScopeImpl = this.getHighSpeedVideoSizes;
                    androidx.compose.ui.geometry.Offset m5741boximpl = androidx.compose.ui.geometry.Offset.m5741boximpl(this.getHighSpeedVideoFpsRangesFor.getPosition());
                    this.Camera2StreamConfigurationMap = 1;
                    if (function3.invoke(pressGestureScopeImpl, m5741boximpl, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.jvm.functions.Function2
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.C00151) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.C00151(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00151(kotlin.jvm.functions.Function3<? super androidx.compose.foundation.gestures.PressGestureScope, ? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, androidx.compose.foundation.gestures.PressGestureScopeImpl pressGestureScopeImpl, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.C00151> continuation) {
                super(2, continuation);
                this.getHighSpeedVideoFpsRanges = function3;
                this.getHighSpeedVideoSizes = pressGestureScopeImpl;
                this.getHighSpeedVideoFpsRangesFor = pointerInputChange;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ androidx.compose.foundation.gestures.PressGestureScopeImpl getHighSpeedVideoFpsRanges;
            int getHighSpeedVideoSizes;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.getHighSpeedVideoSizes != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRanges.release();
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.jvm.functions.Function2
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass2(this.getHighSpeedVideoFpsRanges, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(androidx.compose.foundation.gestures.PressGestureScopeImpl pressGestureScopeImpl, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass2> continuation) {
                super(2, continuation);
                this.getHighSpeedVideoFpsRanges = pressGestureScopeImpl;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ androidx.compose.foundation.gestures.PressGestureScopeImpl getHighResolutionOutputSizeshNQ4ISI;
            int getHighSpeedVideoFpsRanges;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.getHighSpeedVideoFpsRanges != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighResolutionOutputSizeshNQ4ISI.cancel();
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.jvm.functions.Function2
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass3(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(androidx.compose.foundation.gestures.PressGestureScopeImpl pressGestureScopeImpl, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass3> continuation) {
                super(2, continuation);
                this.getHighResolutionOutputSizeshNQ4ISI = pressGestureScopeImpl;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            int getHighSpeedVideoFpsRanges;
            final /* synthetic */ androidx.compose.foundation.gestures.PressGestureScopeImpl getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.getHighSpeedVideoFpsRanges != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRangesFor.release();
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.jvm.functions.Function2
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass4(this.getHighSpeedVideoFpsRangesFor, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(androidx.compose.foundation.gestures.PressGestureScopeImpl pressGestureScopeImpl, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass4> continuation) {
                super(2, continuation);
                this.getHighSpeedVideoFpsRangesFor = pressGestureScopeImpl;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5", f = "TapGestureDetector.kt", i = {}, l = {157, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5, reason: invalid class name */
        static final class AnonymousClass5 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            int getHighResolutionOutputSizeshNQ4ISI;
            final /* synthetic */ kotlinx.coroutines.Job getHighSpeedVideoFpsRangesFor;
            final /* synthetic */ androidx.compose.foundation.gestures.PressGestureScopeImpl getHighSpeedVideoSizes;

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
            
                if (r4.getHighSpeedVideoSizes.reset(r4) == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
            
                if (r4.getHighSpeedVideoFpsRangesFor.join(r4) != r0) goto L12;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.getHighResolutionOutputSizeshNQ4ISI;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.getHighResolutionOutputSizeshNQ4ISI = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                this.getHighResolutionOutputSizeshNQ4ISI = 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.jvm.functions.Function2
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass5(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(kotlinx.coroutines.Job job, androidx.compose.foundation.gestures.PressGestureScopeImpl pressGestureScopeImpl, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass5> continuation) {
                super(2, continuation);
                this.getHighSpeedVideoFpsRangesFor = job;
                this.getHighSpeedVideoSizes = pressGestureScopeImpl;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6", f = "TapGestureDetector.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6, reason: invalid class name */
        static final class AnonymousClass6 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            int getHighResolutionOutputSizeshNQ4ISI;
            final /* synthetic */ androidx.compose.foundation.gestures.PressGestureScopeImpl getHighSpeedVideoFpsRanges;
            final /* synthetic */ kotlin.jvm.functions.Function3<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRangesFor;
            final /* synthetic */ androidx.compose.ui.input.pointer.PointerInputChange getHighSpeedVideoSizes;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.getHighResolutionOutputSizeshNQ4ISI;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.functions.Function3<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function3 = this.getHighSpeedVideoFpsRangesFor;
                    androidx.compose.foundation.gestures.PressGestureScopeImpl pressGestureScopeImpl = this.getHighSpeedVideoFpsRanges;
                    androidx.compose.ui.geometry.Offset m5741boximpl = androidx.compose.ui.geometry.Offset.m5741boximpl(this.getHighSpeedVideoSizes.getPosition());
                    this.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (function3.invoke(pressGestureScopeImpl, m5741boximpl, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.jvm.functions.Function2
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass6(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass6(kotlin.jvm.functions.Function3<? super androidx.compose.foundation.gestures.PressGestureScope, ? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, androidx.compose.foundation.gestures.PressGestureScopeImpl pressGestureScopeImpl, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass6> continuation) {
                super(2, continuation);
                this.getHighSpeedVideoFpsRangesFor = function3;
                this.getHighSpeedVideoFpsRanges = pressGestureScopeImpl;
                this.getHighSpeedVideoSizes = pointerInputChange;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7, reason: invalid class name */
        static final class AnonymousClass7 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ androidx.compose.foundation.gestures.PressGestureScopeImpl Camera2StreamConfigurationMap;
            int getHighSpeedVideoSizes;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.getHighSpeedVideoSizes != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                this.Camera2StreamConfigurationMap.release();
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.jvm.functions.Function2
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass7(this.Camera2StreamConfigurationMap, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass7(androidx.compose.foundation.gestures.PressGestureScopeImpl pressGestureScopeImpl, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass7> continuation) {
                super(2, continuation);
                this.Camera2StreamConfigurationMap = pressGestureScopeImpl;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8, reason: invalid class name */
        static final class AnonymousClass8 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ androidx.compose.foundation.gestures.PressGestureScopeImpl getHighResolutionOutputSizeshNQ4ISI;
            int getHighSpeedVideoSizes;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.getHighSpeedVideoSizes != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighResolutionOutputSizeshNQ4ISI.cancel();
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.jvm.functions.Function2
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass8) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass8(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass8(androidx.compose.foundation.gestures.PressGestureScopeImpl pressGestureScopeImpl, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass8> continuation) {
                super(2, continuation);
                this.getHighResolutionOutputSizeshNQ4ISI = pressGestureScopeImpl;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
        public java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1 anonymousClass1 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getOutputMinFrameDuration, continuation);
            anonymousClass1.getOutputStallDurationlomOqCM = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.gestures.PressGestureScope, ? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function13, androidx.compose.foundation.gestures.PressGestureScopeImpl pressGestureScopeImpl, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = coroutineScope;
            this.getHighResolutionOutputSizeshNQ4ISI = function3;
            this.Camera2StreamConfigurationMap = function1;
            this.getHighSpeedVideoSizes = function12;
            this.getHighSpeedVideoFpsRangesFor = function13;
            this.getOutputMinFrameDuration = pressGestureScopeImpl;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2 tapGestureDetectorKt$detectTapGestures$2 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
        tapGestureDetectorKt$detectTapGestures$2.getInputSizeshNQ4ISI = obj;
        return tapGestureDetectorKt$detectTapGestures$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TapGestureDetectorKt$detectTapGestures$2(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.gestures.PressGestureScope, ? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function13, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = pointerInputScope;
        this.getHighSpeedVideoFpsRanges = function3;
        this.getHighSpeedVideoSizes = function1;
        this.getHighResolutionOutputSizeshNQ4ISI = function12;
        this.getHighSpeedVideoFpsRangesFor = function13;
    }
}
