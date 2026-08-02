package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$13", f = "DragGestureDetector.kt", i = {0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, 1116, 1158, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, 1197, 1240, 1252}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "initialDown", "awaitTouchSlop", "$this$awaitEachGesture", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_DOWN, "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "$this$awaitEachGesture", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_DOWN, "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv", "$this$awaitEachGesture", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_DOWN, "drag", "$this$awaitEachGesture", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_DOWN, "$this$awaitPointerSlopOrCancellation_u2d6ksA65w$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "$this$awaitEachGesture", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_DOWN, "$this$awaitPointerSlopOrCancellation_u2d6ksA65w$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv", "$this$drag_u2dVnAYq1g$iv", "$this$awaitDragOrUp_u2djO51t88$iv$iv", "pointer$iv$iv"}, s = {"L$0", "L$0", "L$1", "Z$0", "L$0", "L$1", "L$2", "L$4", "L$5", "F$0", "L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "F$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$4", "L$5", "F$0", "L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "F$0", "L$0", "L$2", "L$3"}, v = 1)
/* loaded from: classes6.dex */
final class DragGestureDetectorKt$detectDragGestures$13 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.gestures.Orientation getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function3<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ kotlin.jvm.functions.Function0<java.lang.Boolean> getInputFormats;
    final /* synthetic */ kotlin.jvm.internal.Ref.LongRef getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    float getOutputMinFrameDuration;
    boolean getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    int getValidOutputFormatsForInputhNQ4ISI;
    private /* synthetic */ java.lang.Object isOutputSupportedForhNQ4ISI;

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0285, code lost:
    
        r5 = r3;
        r3 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x015a, code lost:
    
        if (r2 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0551, code lost:
    
        if (androidx.compose.ui.geometry.Offset.m5750getDistanceimpl(androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r7)) == 0.0f) goto L149;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0300 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x050c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x04f1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x0458 -> B:45:0x045b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x0479 -> B:48:0x0285). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:149:0x020e -> B:128:0x0272). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:161:0x0176 -> B:168:0x0276). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:162:0x0178 -> B:129:0x018d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:163:0x0242 -> B:128:0x0272). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:166:0x0268 -> B:125:0x026a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x04dd -> B:7:0x04e1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x02f8 -> B:54:0x02a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x034d -> B:47:0x0461). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope;
        java.lang.Object awaitFirstDown;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        boolean booleanValue;
        java.lang.Object awaitFirstDown$default;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        kotlin.jvm.internal.Ref.LongRef longRef;
        kotlin.jvm.internal.Ref.LongRef longRef2;
        float f;
        androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector;
        long id;
        androidx.compose.ui.input.pointer.PointerEvent pointerEvent;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange5;
        androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange6;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange7;
        java.lang.Object obj2;
        float f2;
        kotlin.jvm.internal.Ref.LongRef longRef3;
        kotlin.jvm.internal.Ref.LongRef longRef4;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope4;
        java.lang.Object obj3;
        androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector2;
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes;
        int size;
        int i;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange8;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange9;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange10;
        androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector3;
        kotlin.jvm.internal.Ref.LongRef longRef5;
        kotlin.jvm.internal.Ref.LongRef longRef6;
        kotlin.jvm.internal.Ref.LongRef longRef7;
        androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass2;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange11;
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> list;
        int i2;
        int size2;
        int i3;
        int size3;
        int i4;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope5;
        kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, kotlin.Unit> function2;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope6;
        kotlin.jvm.internal.Ref.LongRef longRef8;
        java.lang.Object awaitPointerEvent$default;
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2;
        int size4;
        int i5;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange12;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange13;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange14;
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> list2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = 1;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange15 = null;
        switch (this.getValidOutputFormatsForInputhNQ4ISI) {
            case 0:
                kotlin.ResultKt.throwOnFailure(obj);
                awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.isOutputSupportedForhNQ4ISI;
                this.isOutputSupportedForhNQ4ISI = awaitPointerEventScope;
                this.getValidOutputFormatsForInputhNQ4ISI = 1;
                awaitFirstDown = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown(awaitPointerEventScope, false, androidx.compose.ui.input.pointer.PointerEventPass.Initial, this);
                if (awaitFirstDown == coroutine_suspended) {
                    return coroutine_suspended;
                }
                awaitPointerEventScope2 = awaitPointerEventScope;
                pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) awaitFirstDown;
                booleanValue = this.getInputFormats.invoke().booleanValue();
                if (!booleanValue) {
                    pointerInputChange.consume();
                }
                this.isOutputSupportedForhNQ4ISI = awaitPointerEventScope2;
                this.getOutputFormats = pointerInputChange;
                this.getOutputMinFrameDurationlomOqCM = booleanValue;
                this.getValidOutputFormatsForInputhNQ4ISI = 2;
                awaitFirstDown$default = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope2, false, null, this, 2, null);
                if (awaitFirstDown$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pointerInputChange2 = (androidx.compose.ui.input.pointer.PointerInputChange) awaitFirstDown$default;
                this.getInputSizeshNQ4ISI.element = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
                break;
            case 1:
                awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.isOutputSupportedForhNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                awaitFirstDown = obj;
                awaitPointerEventScope2 = awaitPointerEventScope;
                pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) awaitFirstDown;
                booleanValue = this.getInputFormats.invoke().booleanValue();
                if (!booleanValue) {
                }
                this.isOutputSupportedForhNQ4ISI = awaitPointerEventScope2;
                this.getOutputFormats = pointerInputChange;
                this.getOutputMinFrameDurationlomOqCM = booleanValue;
                this.getValidOutputFormatsForInputhNQ4ISI = 2;
                awaitFirstDown$default = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope2, false, null, this, 2, null);
                if (awaitFirstDown$default == coroutine_suspended) {
                }
                pointerInputChange2 = (androidx.compose.ui.input.pointer.PointerInputChange) awaitFirstDown$default;
                this.getInputSizeshNQ4ISI.element = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
                break;
            case 2:
                booleanValue = this.getOutputMinFrameDurationlomOqCM;
                pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) this.getOutputFormats;
                awaitPointerEventScope2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.isOutputSupportedForhNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                awaitFirstDown$default = obj;
                pointerInputChange2 = (androidx.compose.ui.input.pointer.PointerInputChange) awaitFirstDown$default;
                this.getInputSizeshNQ4ISI.element = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
                break;
            case 3:
                float f3 = this.getOutputMinFrameDuration;
                androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector4 = (androidx.compose.foundation.gestures.TouchSlopDetector) this.getOutputSizes;
                kotlin.jvm.internal.Ref.LongRef longRef9 = (kotlin.jvm.internal.Ref.LongRef) this.getOutputStallDuration;
                kotlin.jvm.internal.Ref.LongRef longRef10 = (kotlin.jvm.internal.Ref.LongRef) this.getOutputStallDurationlomOqCM;
                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getHighSpeedVideoSizesFor;
                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange16 = (androidx.compose.ui.input.pointer.PointerInputChange) this.getOutputFormats;
                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.isOutputSupportedForhNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                longRef = longRef9;
                awaitPointerEventScope2 = awaitPointerEventScope8;
                longRef2 = longRef10;
                pointerInputChange2 = pointerInputChange16;
                java.lang.Object obj4 = obj;
                f = f3;
                touchSlopDetector = touchSlopDetector4;
                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope9 = awaitPointerEventScope7;
                androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj4;
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes3 = pointerEvent2.getChanges();
                int size5 = changes3.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size5) {
                        pointerInputChange3 = changes3.get(i7);
                        pointerEvent = pointerEvent2;
                        if (!androidx.compose.ui.input.pointer.PointerId.m7213equalsimpl0(pointerInputChange3.getId(), longRef.element)) {
                            i7++;
                            pointerEvent2 = pointerEvent;
                        }
                    } else {
                        pointerEvent = pointerEvent2;
                        pointerInputChange3 = null;
                    }
                }
                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange17 = pointerInputChange3;
                if (pointerInputChange17 != null && !pointerInputChange17.isConsumed()) {
                    if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange17)) {
                        long m1543addPositionsakrDWew = touchSlopDetector.m1543addPositionsakrDWew(pointerInputChange17.getPosition(), pointerInputChange17.getPreviousPosition(), f);
                        if ((m1543addPositionsakrDWew & 9223372034707292159L) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                            pointerInputChange17.consume();
                            longRef2.element = m1543addPositionsakrDWew;
                            if (pointerInputChange17.isConsumed()) {
                                pointerInputChange = pointerInputChange17;
                                if (pointerInputChange != null && !pointerInputChange.isConsumed()) {
                                    i6 = 1;
                                    defaultConstructorMarker = null;
                                    id = pointerInputChange2.getId();
                                    int type = pointerInputChange2.getType();
                                    androidx.compose.foundation.gestures.Orientation orientation = this.getHighSpeedVideoFpsRanges;
                                    longRef2 = this.getInputSizeshNQ4ISI;
                                    long m5768getZeroF1C5BW0 = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
                                    if (!androidx.compose.foundation.gestures.DragGestureDetectorKt.getHighSpeedVideoFpsRanges(awaitPointerEventScope2.getCurrentEvent(), id)) {
                                        f = androidx.compose.foundation.gestures.DragGestureDetectorKt.m1469pointerSlopE8SPZFQ(awaitPointerEventScope2.getViewConfiguration(), type);
                                        longRef = new kotlin.jvm.internal.Ref.LongRef();
                                        longRef.element = id;
                                        touchSlopDetector = new androidx.compose.foundation.gestures.TouchSlopDetector(orientation, m5768getZeroF1C5BW0, defaultConstructorMarker);
                                        awaitPointerEventScope9 = awaitPointerEventScope2;
                                        pointerEventPass = defaultConstructorMarker;
                                        this.isOutputSupportedForhNQ4ISI = awaitPointerEventScope2;
                                        this.getOutputFormats = pointerInputChange2;
                                        this.getHighSpeedVideoSizesFor = awaitPointerEventScope9;
                                        this.getOutputStallDurationlomOqCM = longRef2;
                                        this.getOutputStallDuration = longRef;
                                        this.getOutputSizes = touchSlopDetector;
                                        this.getOutputSizeshNQ4ISI = pointerEventPass;
                                        this.getOutputMinFrameDuration = f;
                                        this.getValidOutputFormatsForInputhNQ4ISI = 3;
                                        obj4 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope9, pointerEventPass, this, i6, pointerEventPass);
                                        if (obj4 == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        androidx.compose.ui.input.pointer.PointerEvent pointerEvent22 = (androidx.compose.ui.input.pointer.PointerEvent) obj4;
                                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes32 = pointerEvent22.getChanges();
                                        int size52 = changes32.size();
                                        int i72 = 0;
                                        while (true) {
                                            if (i72 < size52) {
                                            }
                                            i72++;
                                            pointerEvent22 = pointerEvent;
                                        }
                                        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange172 = pointerInputChange3;
                                        if (pointerInputChange172 != null) {
                                            if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange172)) {
                                            }
                                        }
                                    }
                                }
                                if (pointerInputChange == null) {
                                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes4 = awaitPointerEventScope2.getCurrentEvent().getChanges();
                                    int size6 = changes4.size();
                                    for (int i8 = 0; i8 < size6; i8++) {
                                        if (changes4.get(i8).getPressed()) {
                                            pointerInputChange6 = pointerInputChange;
                                            pointerInputChange7 = pointerInputChange2;
                                            this.isOutputSupportedForhNQ4ISI = awaitPointerEventScope2;
                                            this.getOutputFormats = pointerInputChange7;
                                            this.getHighSpeedVideoSizesFor = pointerInputChange6;
                                            this.getOutputStallDurationlomOqCM = null;
                                            this.getOutputStallDuration = null;
                                            this.getOutputSizes = null;
                                            this.getOutputSizeshNQ4ISI = null;
                                            this.getValidOutputFormatsForInputhNQ4ISI = 5;
                                            obj2 = awaitPointerEventScope2.awaitPointerEvent(androidx.compose.ui.input.pointer.PointerEventPass.Final, this);
                                            if (obj2 == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            androidx.compose.ui.input.pointer.PointerEvent pointerEvent3 = (androidx.compose.ui.input.pointer.PointerEvent) obj2;
                                            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes5 = pointerEvent3.getChanges();
                                            size2 = changes5.size();
                                            i3 = 0;
                                            while (true) {
                                                if (i3 < size2) {
                                                    if (changes5.get(i3).isConsumed()) {
                                                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes6 = pointerEvent3.getChanges();
                                                        int size7 = changes6.size();
                                                        for (int i9 = 0; i9 < size7; i9++) {
                                                            if (!changes6.get(i9).getPressed()) {
                                                            }
                                                        }
                                                    } else {
                                                        i3++;
                                                    }
                                                }
                                            }
                                            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes7 = pointerEvent3.getChanges();
                                            size3 = changes7.size();
                                            for (i4 = 0; i4 < size3; i4++) {
                                                if (changes7.get(i4).getPressed()) {
                                                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange18 = (androidx.compose.ui.input.pointer.PointerInputChange) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) pointerEvent3.getChanges());
                                                    long m5756minusMKHz9U = androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(pointerInputChange18 != null ? pointerInputChange18.getPosition() : androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0(), pointerInputChange7.getPosition());
                                                    long id2 = pointerInputChange7.getId();
                                                    int type2 = pointerInputChange7.getType();
                                                    androidx.compose.foundation.gestures.Orientation orientation2 = this.getHighSpeedVideoFpsRanges;
                                                    longRef5 = this.getInputSizeshNQ4ISI;
                                                    if (!androidx.compose.foundation.gestures.DragGestureDetectorKt.getHighSpeedVideoFpsRanges(awaitPointerEventScope2.getCurrentEvent(), id2)) {
                                                        f2 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m1469pointerSlopE8SPZFQ(awaitPointerEventScope2.getViewConfiguration(), type2);
                                                        longRef7 = new kotlin.jvm.internal.Ref.LongRef();
                                                        longRef7.element = id2;
                                                        pointerEventPass2 = null;
                                                        touchSlopDetector3 = new androidx.compose.foundation.gestures.TouchSlopDetector(orientation2, m5756minusMKHz9U, null);
                                                        awaitPointerEventScope4 = awaitPointerEventScope2;
                                                        this.isOutputSupportedForhNQ4ISI = awaitPointerEventScope2;
                                                        this.getOutputFormats = pointerInputChange7;
                                                        this.getHighSpeedVideoSizesFor = awaitPointerEventScope4;
                                                        this.getOutputStallDurationlomOqCM = longRef5;
                                                        this.getOutputStallDuration = longRef7;
                                                        this.getOutputSizes = touchSlopDetector3;
                                                        this.getOutputSizeshNQ4ISI = pointerEventPass2;
                                                        this.getOutputMinFrameDuration = f2;
                                                        this.getValidOutputFormatsForInputhNQ4ISI = 6;
                                                        obj3 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope4, pointerEventPass2, this, 1, pointerEventPass2);
                                                        if (obj3 == coroutine_suspended) {
                                                            touchSlopDetector2 = touchSlopDetector3;
                                                            longRef4 = longRef5;
                                                            longRef3 = longRef7;
                                                            androidx.compose.ui.input.pointer.PointerEvent pointerEvent4 = (androidx.compose.ui.input.pointer.PointerEvent) obj3;
                                                            changes = pointerEvent4.getChanges();
                                                            size = changes.size();
                                                            i = 0;
                                                            while (true) {
                                                                if (i >= size) {
                                                                    pointerInputChange8 = changes.get(i);
                                                                    list = changes;
                                                                    i2 = size;
                                                                    if (!androidx.compose.ui.input.pointer.PointerId.m7213equalsimpl0(pointerInputChange8.getId(), longRef3.element)) {
                                                                        i++;
                                                                        changes = list;
                                                                        size = i2;
                                                                    }
                                                                } else {
                                                                    pointerInputChange8 = null;
                                                                }
                                                            }
                                                            pointerInputChange9 = pointerInputChange8;
                                                            if (pointerInputChange9 != null && !pointerInputChange9.isConsumed()) {
                                                                if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange9)) {
                                                                    pointerInputChange10 = pointerInputChange9;
                                                                    if ((touchSlopDetector2.m1543addPositionsakrDWew(pointerInputChange9.getPosition(), pointerInputChange9.getPreviousPosition(), f2) & 9223372034707292159L) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                                                                        pointerInputChange10.consume();
                                                                        longRef4.element = androidx.compose.ui.input.pointer.PointerEventKt.positionChange(pointerInputChange10);
                                                                        if (!pointerInputChange10.isConsumed()) {
                                                                            androidx.compose.foundation.gestures.TouchSlopDetector.m1542resetk4lQ0M$default(touchSlopDetector2, 0L, 1, null);
                                                                        }
                                                                        pointerInputChange2 = pointerInputChange7;
                                                                        pointerInputChange = null;
                                                                        if (pointerInputChange == null) {
                                                                        }
                                                                    } else {
                                                                        this.isOutputSupportedForhNQ4ISI = awaitPointerEventScope2;
                                                                        this.getOutputFormats = pointerInputChange7;
                                                                        this.getHighSpeedVideoSizesFor = awaitPointerEventScope4;
                                                                        this.getOutputStallDurationlomOqCM = longRef4;
                                                                        this.getOutputStallDuration = longRef3;
                                                                        this.getOutputSizes = touchSlopDetector2;
                                                                        this.getOutputSizeshNQ4ISI = pointerInputChange10;
                                                                        this.getOutputMinFrameDuration = f2;
                                                                        this.getValidOutputFormatsForInputhNQ4ISI = 7;
                                                                        if (awaitPointerEventScope4.awaitPointerEvent(androidx.compose.ui.input.pointer.PointerEventPass.Final, this) == coroutine_suspended) {
                                                                            return coroutine_suspended;
                                                                        }
                                                                        touchSlopDetector3 = touchSlopDetector2;
                                                                        longRef5 = longRef4;
                                                                        longRef6 = longRef3;
                                                                        if (!pointerInputChange10.isConsumed()) {
                                                                            longRef7 = longRef6;
                                                                            pointerEventPass2 = null;
                                                                            this.isOutputSupportedForhNQ4ISI = awaitPointerEventScope2;
                                                                            this.getOutputFormats = pointerInputChange7;
                                                                            this.getHighSpeedVideoSizesFor = awaitPointerEventScope4;
                                                                            this.getOutputStallDurationlomOqCM = longRef5;
                                                                            this.getOutputStallDuration = longRef7;
                                                                            this.getOutputSizes = touchSlopDetector3;
                                                                            this.getOutputSizeshNQ4ISI = pointerEventPass2;
                                                                            this.getOutputMinFrameDuration = f2;
                                                                            this.getValidOutputFormatsForInputhNQ4ISI = 6;
                                                                            obj3 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope4, pointerEventPass2, this, 1, pointerEventPass2);
                                                                            if (obj3 == coroutine_suspended) {
                                                                                return coroutine_suspended;
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes8 = pointerEvent4.getChanges();
                                                                    int size8 = changes8.size();
                                                                    int i10 = 0;
                                                                    while (true) {
                                                                        if (i10 < size8) {
                                                                            pointerInputChange11 = changes8.get(i10);
                                                                            if (!pointerInputChange11.getPressed()) {
                                                                                i10++;
                                                                            }
                                                                        } else {
                                                                            pointerInputChange11 = null;
                                                                        }
                                                                    }
                                                                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange19 = pointerInputChange11;
                                                                    if (pointerInputChange19 != null) {
                                                                        longRef3.element = pointerInputChange19.getId();
                                                                    }
                                                                }
                                                                touchSlopDetector3 = touchSlopDetector2;
                                                                longRef5 = longRef4;
                                                                longRef7 = longRef3;
                                                                pointerEventPass2 = null;
                                                                this.isOutputSupportedForhNQ4ISI = awaitPointerEventScope2;
                                                                this.getOutputFormats = pointerInputChange7;
                                                                this.getHighSpeedVideoSizesFor = awaitPointerEventScope4;
                                                                this.getOutputStallDurationlomOqCM = longRef5;
                                                                this.getOutputStallDuration = longRef7;
                                                                this.getOutputSizes = touchSlopDetector3;
                                                                this.getOutputSizeshNQ4ISI = pointerEventPass2;
                                                                this.getOutputMinFrameDuration = f2;
                                                                this.getValidOutputFormatsForInputhNQ4ISI = 6;
                                                                obj3 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope4, pointerEventPass2, this, 1, pointerEventPass2);
                                                                if (obj3 == coroutine_suspended) {
                                                                }
                                                            }
                                                            pointerInputChange2 = pointerInputChange7;
                                                            pointerInputChange = null;
                                                            if (pointerInputChange == null) {
                                                            }
                                                        }
                                                    }
                                                    pointerInputChange2 = pointerInputChange7;
                                                    pointerInputChange = null;
                                                    if (pointerInputChange == null) {
                                                    }
                                                }
                                            }
                                            pointerInputChange2 = pointerInputChange7;
                                            pointerInputChange = pointerInputChange6;
                                            if (pointerInputChange == null) {
                                            }
                                        }
                                    }
                                }
                                if (pointerInputChange != null) {
                                    this.getHighSpeedVideoFpsRangesFor.invoke(pointerInputChange2, pointerInputChange, androidx.compose.ui.geometry.Offset.m5741boximpl(this.getInputSizeshNQ4ISI.element));
                                    this.Camera2StreamConfigurationMap.invoke(pointerInputChange, androidx.compose.ui.geometry.Offset.m5741boximpl(this.getInputSizeshNQ4ISI.element));
                                    long id3 = pointerInputChange.getId();
                                    kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, kotlin.Unit> function22 = this.Camera2StreamConfigurationMap;
                                    if (androidx.compose.foundation.gestures.DragGestureDetectorKt.getHighSpeedVideoFpsRanges(awaitPointerEventScope2.getCurrentEvent(), id3)) {
                                        pointerInputChange15 = null;
                                        if (pointerInputChange15 == null) {
                                            this.getHighSpeedVideoSizes.invoke();
                                        } else {
                                            this.getHighResolutionOutputSizeshNQ4ISI.invoke(pointerInputChange15);
                                        }
                                    }
                                    kotlin.jvm.internal.Ref.LongRef longRef11 = new kotlin.jvm.internal.Ref.LongRef();
                                    longRef11.element = id3;
                                    awaitPointerEventScope6 = awaitPointerEventScope2;
                                    longRef8 = longRef11;
                                    function2 = function22;
                                    awaitPointerEventScope5 = awaitPointerEventScope6;
                                    this.isOutputSupportedForhNQ4ISI = awaitPointerEventScope5;
                                    this.getOutputFormats = function2;
                                    this.getHighSpeedVideoSizesFor = awaitPointerEventScope6;
                                    this.getOutputStallDurationlomOqCM = longRef8;
                                    pointerInputChange15 = null;
                                    this.getOutputStallDuration = null;
                                    this.getOutputSizes = null;
                                    this.getOutputSizeshNQ4ISI = null;
                                    this.getValidOutputFormatsForInputhNQ4ISI = 8;
                                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope6, null, this, 1, null);
                                    if (awaitPointerEvent$default == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent5 = (androidx.compose.ui.input.pointer.PointerEvent) awaitPointerEvent$default;
                                    changes2 = pointerEvent5.getChanges();
                                    size4 = changes2.size();
                                    i5 = 0;
                                    while (true) {
                                        if (i5 >= size4) {
                                            pointerInputChange12 = changes2.get(i5);
                                            list2 = changes2;
                                            if (!androidx.compose.ui.input.pointer.PointerId.m7213equalsimpl0(pointerInputChange12.getId(), longRef8.element)) {
                                                i5++;
                                                changes2 = list2;
                                            }
                                        } else {
                                            pointerInputChange12 = pointerInputChange15;
                                        }
                                    }
                                    pointerInputChange13 = pointerInputChange12;
                                    if (pointerInputChange13 == null) {
                                        if (!androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange13)) {
                                            break;
                                        } else {
                                            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes9 = pointerEvent5.getChanges();
                                            int size9 = changes9.size();
                                            int i11 = 0;
                                            while (true) {
                                                if (i11 < size9) {
                                                    pointerInputChange14 = changes9.get(i11);
                                                    if (!pointerInputChange14.getPressed()) {
                                                        i11++;
                                                    }
                                                } else {
                                                    pointerInputChange14 = pointerInputChange15;
                                                }
                                            }
                                            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange20 = pointerInputChange14;
                                            if (pointerInputChange20 != null) {
                                                longRef8.element = pointerInputChange20.getId();
                                                this.isOutputSupportedForhNQ4ISI = awaitPointerEventScope5;
                                                this.getOutputFormats = function2;
                                                this.getHighSpeedVideoSizesFor = awaitPointerEventScope6;
                                                this.getOutputStallDurationlomOqCM = longRef8;
                                                pointerInputChange15 = null;
                                                this.getOutputStallDuration = null;
                                                this.getOutputSizes = null;
                                                this.getOutputSizeshNQ4ISI = null;
                                                this.getValidOutputFormatsForInputhNQ4ISI = 8;
                                                awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope6, null, this, 1, null);
                                                if (awaitPointerEvent$default == coroutine_suspended) {
                                                }
                                            }
                                        }
                                        androidx.compose.ui.input.pointer.PointerEvent pointerEvent52 = (androidx.compose.ui.input.pointer.PointerEvent) awaitPointerEvent$default;
                                        changes2 = pointerEvent52.getChanges();
                                        size4 = changes2.size();
                                        i5 = 0;
                                        while (true) {
                                            if (i5 >= size4) {
                                            }
                                            i5++;
                                            changes2 = list2;
                                        }
                                        pointerInputChange13 = pointerInputChange12;
                                        if (pointerInputChange13 == null) {
                                            pointerInputChange13 = pointerInputChange15;
                                        }
                                    }
                                    if (pointerInputChange13 != null && !pointerInputChange13.isConsumed()) {
                                        if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange13)) {
                                            function2.invoke(pointerInputChange13, androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.ui.input.pointer.PointerEventKt.positionChange(pointerInputChange13)));
                                            pointerInputChange13.consume();
                                            id3 = pointerInputChange13.getId();
                                            androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope10 = awaitPointerEventScope5;
                                            function22 = function2;
                                            awaitPointerEventScope2 = awaitPointerEventScope10;
                                            kotlin.jvm.internal.Ref.LongRef longRef112 = new kotlin.jvm.internal.Ref.LongRef();
                                            longRef112.element = id3;
                                            awaitPointerEventScope6 = awaitPointerEventScope2;
                                            longRef8 = longRef112;
                                            function2 = function22;
                                            awaitPointerEventScope5 = awaitPointerEventScope6;
                                            this.isOutputSupportedForhNQ4ISI = awaitPointerEventScope5;
                                            this.getOutputFormats = function2;
                                            this.getHighSpeedVideoSizesFor = awaitPointerEventScope6;
                                            this.getOutputStallDurationlomOqCM = longRef8;
                                            pointerInputChange15 = null;
                                            this.getOutputStallDuration = null;
                                            this.getOutputSizes = null;
                                            this.getOutputSizeshNQ4ISI = null;
                                            this.getValidOutputFormatsForInputhNQ4ISI = 8;
                                            awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope6, null, this, 1, null);
                                            if (awaitPointerEvent$default == coroutine_suspended) {
                                            }
                                            androidx.compose.ui.input.pointer.PointerEvent pointerEvent522 = (androidx.compose.ui.input.pointer.PointerEvent) awaitPointerEvent$default;
                                            changes2 = pointerEvent522.getChanges();
                                            size4 = changes2.size();
                                            i5 = 0;
                                            while (true) {
                                                if (i5 >= size4) {
                                                }
                                                i5++;
                                                changes2 = list2;
                                            }
                                            pointerInputChange13 = pointerInputChange12;
                                            if (pointerInputChange13 == null) {
                                            }
                                            if (pointerInputChange13 != null) {
                                                if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange13)) {
                                                }
                                            }
                                        } else {
                                            pointerInputChange15 = pointerInputChange13;
                                        }
                                    }
                                    if (pointerInputChange15 == null) {
                                    }
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                            androidx.compose.foundation.gestures.TouchSlopDetector.m1542resetk4lQ0M$default(touchSlopDetector, 0L, 1, null);
                        } else {
                            this.isOutputSupportedForhNQ4ISI = awaitPointerEventScope2;
                            this.getOutputFormats = pointerInputChange2;
                            this.getHighSpeedVideoSizesFor = awaitPointerEventScope9;
                            this.getOutputStallDurationlomOqCM = longRef2;
                            this.getOutputStallDuration = longRef;
                            this.getOutputSizes = touchSlopDetector;
                            this.getOutputSizeshNQ4ISI = pointerInputChange172;
                            this.getOutputMinFrameDuration = f;
                            this.getValidOutputFormatsForInputhNQ4ISI = 4;
                            if (awaitPointerEventScope9.awaitPointerEvent(androidx.compose.ui.input.pointer.PointerEventPass.Final, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            awaitPointerEventScope3 = awaitPointerEventScope9;
                            pointerInputChange4 = pointerInputChange172;
                            if (!pointerInputChange4.isConsumed()) {
                                awaitPointerEventScope9 = awaitPointerEventScope3;
                            }
                        }
                    } else {
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes10 = pointerEvent.getChanges();
                        int size10 = changes10.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 < size10) {
                                pointerInputChange5 = changes10.get(i12);
                                if (!pointerInputChange5.getPressed()) {
                                    i12++;
                                }
                            } else {
                                pointerInputChange5 = null;
                            }
                        }
                        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange21 = pointerInputChange5;
                        if (pointerInputChange21 != null) {
                            longRef.element = pointerInputChange21.getId();
                        }
                    }
                    i6 = 1;
                    pointerEventPass = 0;
                    this.isOutputSupportedForhNQ4ISI = awaitPointerEventScope2;
                    this.getOutputFormats = pointerInputChange2;
                    this.getHighSpeedVideoSizesFor = awaitPointerEventScope9;
                    this.getOutputStallDurationlomOqCM = longRef2;
                    this.getOutputStallDuration = longRef;
                    this.getOutputSizes = touchSlopDetector;
                    this.getOutputSizeshNQ4ISI = pointerEventPass;
                    this.getOutputMinFrameDuration = f;
                    this.getValidOutputFormatsForInputhNQ4ISI = 3;
                    obj4 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope9, pointerEventPass, this, i6, pointerEventPass);
                    if (obj4 == coroutine_suspended) {
                    }
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent222 = (androidx.compose.ui.input.pointer.PointerEvent) obj4;
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes322 = pointerEvent222.getChanges();
                    int size522 = changes322.size();
                    int i722 = 0;
                    while (true) {
                        if (i722 < size522) {
                        }
                        i722++;
                        pointerEvent222 = pointerEvent;
                    }
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange1722 = pointerInputChange3;
                    if (pointerInputChange1722 != null) {
                    }
                }
                pointerInputChange = null;
                if (pointerInputChange != null) {
                    i6 = 1;
                    defaultConstructorMarker = null;
                    id = pointerInputChange2.getId();
                    int type3 = pointerInputChange2.getType();
                    androidx.compose.foundation.gestures.Orientation orientation3 = this.getHighSpeedVideoFpsRanges;
                    longRef2 = this.getInputSizeshNQ4ISI;
                    long m5768getZeroF1C5BW02 = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
                    if (!androidx.compose.foundation.gestures.DragGestureDetectorKt.getHighSpeedVideoFpsRanges(awaitPointerEventScope2.getCurrentEvent(), id)) {
                    }
                    pointerInputChange = null;
                    if (pointerInputChange != null) {
                    }
                }
                if (pointerInputChange == null) {
                }
                if (pointerInputChange != null) {
                }
                return kotlin.Unit.INSTANCE;
            case 4:
                float f4 = this.getOutputMinFrameDuration;
                pointerInputChange4 = (androidx.compose.ui.input.pointer.PointerInputChange) this.getOutputSizeshNQ4ISI;
                androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector5 = (androidx.compose.foundation.gestures.TouchSlopDetector) this.getOutputSizes;
                kotlin.jvm.internal.Ref.LongRef longRef12 = (kotlin.jvm.internal.Ref.LongRef) this.getOutputStallDuration;
                kotlin.jvm.internal.Ref.LongRef longRef13 = (kotlin.jvm.internal.Ref.LongRef) this.getOutputStallDurationlomOqCM;
                awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getHighSpeedVideoSizesFor;
                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange22 = (androidx.compose.ui.input.pointer.PointerInputChange) this.getOutputFormats;
                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope11 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.isOutputSupportedForhNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                longRef = longRef12;
                pointerInputChange2 = pointerInputChange22;
                longRef2 = longRef13;
                f = f4;
                touchSlopDetector = touchSlopDetector5;
                awaitPointerEventScope2 = awaitPointerEventScope11;
                if (!pointerInputChange4.isConsumed()) {
                }
                pointerInputChange = null;
                if (pointerInputChange != null) {
                }
                if (pointerInputChange == null) {
                }
                if (pointerInputChange != null) {
                }
                return kotlin.Unit.INSTANCE;
            case 5:
                pointerInputChange6 = (androidx.compose.ui.input.pointer.PointerInputChange) this.getHighSpeedVideoSizesFor;
                pointerInputChange7 = (androidx.compose.ui.input.pointer.PointerInputChange) this.getOutputFormats;
                awaitPointerEventScope2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.isOutputSupportedForhNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                obj2 = obj;
                androidx.compose.ui.input.pointer.PointerEvent pointerEvent32 = (androidx.compose.ui.input.pointer.PointerEvent) obj2;
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes52 = pointerEvent32.getChanges();
                size2 = changes52.size();
                i3 = 0;
                while (true) {
                    if (i3 < size2) {
                    }
                    i3++;
                }
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes72 = pointerEvent32.getChanges();
                size3 = changes72.size();
                while (i4 < size3) {
                }
                pointerInputChange2 = pointerInputChange7;
                pointerInputChange = pointerInputChange6;
                if (pointerInputChange == null) {
                }
                if (pointerInputChange != null) {
                }
                return kotlin.Unit.INSTANCE;
            case 6:
                f2 = this.getOutputMinFrameDuration;
                androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector6 = (androidx.compose.foundation.gestures.TouchSlopDetector) this.getOutputSizes;
                kotlin.jvm.internal.Ref.LongRef longRef14 = (kotlin.jvm.internal.Ref.LongRef) this.getOutputStallDuration;
                kotlin.jvm.internal.Ref.LongRef longRef15 = (kotlin.jvm.internal.Ref.LongRef) this.getOutputStallDurationlomOqCM;
                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope12 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getHighSpeedVideoSizesFor;
                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange23 = (androidx.compose.ui.input.pointer.PointerInputChange) this.getOutputFormats;
                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope13 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.isOutputSupportedForhNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                longRef3 = longRef14;
                longRef4 = longRef15;
                awaitPointerEventScope4 = awaitPointerEventScope12;
                awaitPointerEventScope2 = awaitPointerEventScope13;
                obj3 = obj;
                touchSlopDetector2 = touchSlopDetector6;
                pointerInputChange7 = pointerInputChange23;
                androidx.compose.ui.input.pointer.PointerEvent pointerEvent42 = (androidx.compose.ui.input.pointer.PointerEvent) obj3;
                changes = pointerEvent42.getChanges();
                size = changes.size();
                i = 0;
                while (true) {
                    if (i >= size) {
                    }
                    i++;
                    changes = list;
                    size = i2;
                }
                pointerInputChange9 = pointerInputChange8;
                if (pointerInputChange9 != null) {
                    if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange9)) {
                    }
                    touchSlopDetector3 = touchSlopDetector2;
                    longRef5 = longRef4;
                    longRef7 = longRef3;
                    pointerEventPass2 = null;
                    this.isOutputSupportedForhNQ4ISI = awaitPointerEventScope2;
                    this.getOutputFormats = pointerInputChange7;
                    this.getHighSpeedVideoSizesFor = awaitPointerEventScope4;
                    this.getOutputStallDurationlomOqCM = longRef5;
                    this.getOutputStallDuration = longRef7;
                    this.getOutputSizes = touchSlopDetector3;
                    this.getOutputSizeshNQ4ISI = pointerEventPass2;
                    this.getOutputMinFrameDuration = f2;
                    this.getValidOutputFormatsForInputhNQ4ISI = 6;
                    obj3 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope4, pointerEventPass2, this, 1, pointerEventPass2);
                    if (obj3 == coroutine_suspended) {
                    }
                    break;
                }
                pointerInputChange2 = pointerInputChange7;
                pointerInputChange = null;
                if (pointerInputChange == null) {
                }
                if (pointerInputChange != null) {
                }
                return kotlin.Unit.INSTANCE;
            case 7:
                f2 = this.getOutputMinFrameDuration;
                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange24 = (androidx.compose.ui.input.pointer.PointerInputChange) this.getOutputSizeshNQ4ISI;
                androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector7 = (androidx.compose.foundation.gestures.TouchSlopDetector) this.getOutputSizes;
                longRef6 = (kotlin.jvm.internal.Ref.LongRef) this.getOutputStallDuration;
                kotlin.jvm.internal.Ref.LongRef longRef16 = (kotlin.jvm.internal.Ref.LongRef) this.getOutputStallDurationlomOqCM;
                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope14 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getHighSpeedVideoSizesFor;
                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange25 = (androidx.compose.ui.input.pointer.PointerInputChange) this.getOutputFormats;
                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope15 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.isOutputSupportedForhNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                pointerInputChange10 = pointerInputChange24;
                touchSlopDetector3 = touchSlopDetector7;
                longRef5 = longRef16;
                awaitPointerEventScope4 = awaitPointerEventScope14;
                pointerInputChange7 = pointerInputChange25;
                awaitPointerEventScope2 = awaitPointerEventScope15;
                if (!pointerInputChange10.isConsumed()) {
                }
                pointerInputChange2 = pointerInputChange7;
                pointerInputChange = null;
                if (pointerInputChange == null) {
                }
                if (pointerInputChange != null) {
                }
                return kotlin.Unit.INSTANCE;
            case 8:
                longRef8 = (kotlin.jvm.internal.Ref.LongRef) this.getOutputStallDurationlomOqCM;
                awaitPointerEventScope6 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getHighSpeedVideoSizesFor;
                function2 = (kotlin.jvm.functions.Function2) this.getOutputFormats;
                awaitPointerEventScope5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.isOutputSupportedForhNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                awaitPointerEvent$default = obj;
                androidx.compose.ui.input.pointer.PointerEvent pointerEvent5222 = (androidx.compose.ui.input.pointer.PointerEvent) awaitPointerEvent$default;
                changes2 = pointerEvent5222.getChanges();
                size4 = changes2.size();
                i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                    }
                    i5++;
                    changes2 = list2;
                }
                pointerInputChange13 = pointerInputChange12;
                if (pointerInputChange13 == null) {
                }
                if (pointerInputChange13 != null) {
                }
                if (pointerInputChange15 == null) {
                }
                return kotlin.Unit.INSTANCE;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$13) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$13 dragGestureDetectorKt$detectDragGestures$13 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$13(this.getInputFormats, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        dragGestureDetectorKt$detectDragGestures$13.isOutputSupportedForhNQ4ISI = obj;
        return dragGestureDetectorKt$detectDragGestures$13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DragGestureDetectorKt$detectDragGestures$13(kotlin.jvm.functions.Function0<java.lang.Boolean> function0, kotlin.jvm.internal.Ref.LongRef longRef, androidx.compose.foundation.gestures.Orientation orientation, kotlin.jvm.functions.Function3<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function3, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function2, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$13> continuation) {
        super(2, continuation);
        this.getInputFormats = function0;
        this.getInputSizeshNQ4ISI = longRef;
        this.getHighSpeedVideoFpsRanges = orientation;
        this.getHighSpeedVideoFpsRangesFor = function3;
        this.Camera2StreamConfigurationMap = function2;
        this.getHighSpeedVideoSizes = function02;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
    }
}
