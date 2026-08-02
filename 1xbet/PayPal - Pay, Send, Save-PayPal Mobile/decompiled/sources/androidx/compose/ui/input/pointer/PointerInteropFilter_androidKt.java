package androidx.compose.ui.input.pointer;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a1\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0007\u0010\u000b\u001a*\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u000e\u001a\u0013\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\f\u0012\u0004\u0012\u00020\r0\u0003¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/input/pointer/RequestDisallowInterceptTouchEvent;", "requestDisallowInterceptTouchEvent", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "onTouchEvent", "pointerInteropFilter", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/input/pointer/RequestDisallowInterceptTouchEvent;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "view", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/viewinterop/AndroidViewHolder;)Landroidx/compose/ui/Modifier;", "Lkotlin/ParameterName;", "", "watcher", "motionEventSpy", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PointerInteropFilter_androidKt {
    public static /* synthetic */ androidx.compose.ui.Modifier pointerInteropFilter$default(androidx.compose.ui.Modifier modifier, androidx.compose.ui.input.pointer.RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            requestDisallowInterceptTouchEvent = null;
        }
        return pointerInteropFilter(modifier, requestDisallowInterceptTouchEvent, function1);
    }

    public static final androidx.compose.ui.Modifier pointerInteropFilter(androidx.compose.ui.Modifier modifier, final androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder) {
        androidx.compose.ui.input.pointer.PointerInteropFilter pointerInteropFilter = new androidx.compose.ui.input.pointer.PointerInteropFilter();
        pointerInteropFilter.setOnTouchEvent(new kotlin.jvm.functions.Function1<android.view.MotionEvent, java.lang.Boolean>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$pointerInteropFilter$3
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(android.view.MotionEvent motionEvent) {
                boolean dispatchTouchEvent;
                switch (motionEvent.getActionMasked()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        dispatchTouchEvent = androidx.compose.ui.viewinterop.AndroidViewHolder.this.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        dispatchTouchEvent = androidx.compose.ui.viewinterop.AndroidViewHolder.this.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return java.lang.Boolean.valueOf(dispatchTouchEvent);
            }

            {
                super(1);
            }
        });
        androidx.compose.ui.input.pointer.RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent = new androidx.compose.ui.input.pointer.RequestDisallowInterceptTouchEvent();
        pointerInteropFilter.setRequestDisallowInterceptTouchEvent(requestDisallowInterceptTouchEvent);
        androidViewHolder.setOnRequestDisallowInterceptTouchEvent$ui(requestDisallowInterceptTouchEvent);
        return modifier.then(pointerInteropFilter);
    }

    public static final androidx.compose.ui.Modifier motionEventSpy(androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function1<? super android.view.MotionEvent, kotlin.Unit> function1) {
        return androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(modifier, function1, new androidx.compose.ui.input.pointer.PointerInputEventHandler() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1

            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1$1", f = "PointerInteropFilter.android.kt", i = {0}, l = {389}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"}, v = 1)
            /* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                int Camera2StreamConfigurationMap;
                final /* synthetic */ kotlin.jvm.functions.Function1<android.view.MotionEvent, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
                private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
                /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[RETURN] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0030 -> B:5:0x0033). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                    /*
                        r4 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r1 = r4.Camera2StreamConfigurationMap
                        r2 = 1
                        if (r1 == 0) goto L1b
                        if (r1 != r2) goto L13
                        java.lang.Object r1 = r4.getHighSpeedVideoFpsRangesFor
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                        kotlin.ResultKt.throwOnFailure(r5)
                        goto L33
                    L13:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r0)
                        throw r5
                    L1b:
                        kotlin.ResultKt.throwOnFailure(r5)
                        java.lang.Object r5 = r4.getHighSpeedVideoFpsRangesFor
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
                        r1 = r5
                    L23:
                        androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                        r3 = r4
                        kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                        r4.getHighSpeedVideoFpsRangesFor = r1
                        r4.Camera2StreamConfigurationMap = r2
                        java.lang.Object r5 = r1.awaitPointerEvent(r5, r3)
                        if (r5 != r0) goto L33
                        return r0
                    L33:
                        androidx.compose.ui.input.pointer.PointerEvent r5 = (androidx.compose.ui.input.pointer.PointerEvent) r5
                        android.view.MotionEvent r5 = r5.getMotionEvent()
                        if (r5 == 0) goto L23
                        kotlin.jvm.functions.Function1<android.view.MotionEvent, kotlin.Unit> r3 = r4.getHighResolutionOutputSizeshNQ4ISI
                        r3.invoke(r5)
                        goto L23
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // kotlin.jvm.functions.Function2
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1.AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1.AnonymousClass1 anonymousClass1 = new androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
                    anonymousClass1.getHighSpeedVideoFpsRangesFor = obj;
                    return anonymousClass1;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(kotlin.jvm.functions.Function1<? super android.view.MotionEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1.AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.getHighResolutionOutputSizeshNQ4ISI = function1;
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                pointerInputScope.setInterceptOutOfBoundsChildEvents(true);
                java.lang.Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1.AnonymousClass1(function1, null), continuation);
                return awaitPointerEventScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitPointerEventScope : kotlin.Unit.INSTANCE;
            }
        });
    }

    public static final androidx.compose.ui.Modifier pointerInteropFilter(androidx.compose.ui.Modifier modifier, final androidx.compose.ui.input.pointer.RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent, final kotlin.jvm.functions.Function1<? super android.view.MotionEvent, java.lang.Boolean> function1) {
        return androidx.compose.ui.ComposedModifierKt.composed(modifier, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$pointerInteropFilter$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("pointerInteropFilter");
                inspectorInfo.getProperties().set("requestDisallowInterceptTouchEvent", androidx.compose.ui.input.pointer.RequestDisallowInterceptTouchEvent.this);
                inspectorInfo.getProperties().set("onTouchEvent", function1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), new kotlin.jvm.functions.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.ui.Modifier>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$pointerInteropFilter$2
            @Override // kotlin.jvm.functions.Function3
            public final /* synthetic */ androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                return Camera2StreamConfigurationMap(modifier2, composer, num.intValue());
            }

            public final androidx.compose.ui.Modifier Camera2StreamConfigurationMap(androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer, int i) {
                composer.startReplaceGroup(374375707);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(374375707, i, -1, "androidx.compose.ui.input.pointer.pointerInteropFilter.<anonymous> (PointerInteropFilter.android.kt:78)");
                }
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new androidx.compose.ui.input.pointer.PointerInteropFilter();
                    composer.updateRememberedValue(rememberedValue);
                }
                androidx.compose.ui.input.pointer.PointerInteropFilter pointerInteropFilter = (androidx.compose.ui.input.pointer.PointerInteropFilter) rememberedValue;
                pointerInteropFilter.setOnTouchEvent(function1);
                pointerInteropFilter.setRequestDisallowInterceptTouchEvent(requestDisallowInterceptTouchEvent);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return pointerInteropFilter;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }
        });
    }
}
