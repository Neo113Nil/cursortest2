package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* compiled from: TransformGestureDetector.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2", f = "TransformGestureDetector.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class TransformGestureDetectorKt$detectTransformGestures$2 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function4<Offset, Offset, Float, Float, Unit> $onGesture;
    final /* synthetic */ boolean $panZoomLock;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TransformGestureDetectorKt$detectTransformGestures$2(boolean z, Function4<? super Offset, ? super Offset, ? super Float, ? super Float, Unit> function4, Continuation<? super TransformGestureDetectorKt$detectTransformGestures$2> continuation) {
        super(2, continuation);
        this.$panZoomLock = z;
        this.$onGesture = function4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TransformGestureDetectorKt$detectTransformGestures$2 transformGestureDetectorKt$detectTransformGestures$2 = new TransformGestureDetectorKt$detectTransformGestures$2(this.$panZoomLock, this.$onGesture, continuation);
        transformGestureDetectorKt$detectTransformGestures$2.L$0 = obj;
        return transformGestureDetectorKt$detectTransformGestures$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((TransformGestureDetectorKt$detectTransformGestures$2) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: TransformGestureDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2$1", f = "TransformGestureDetector.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {60, 62}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$awaitPointerEventScope", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom"}, s = {"L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1"})
    /* renamed from: androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function4<Offset, Offset, Float, Float, Unit> $onGesture;
        final /* synthetic */ boolean $panZoomLock;
        float F$0;
        float F$1;
        float F$2;
        int I$0;
        int I$1;
        long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(boolean z, Function4<? super Offset, ? super Offset, ? super Float, ? super Float, Unit> function4, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$panZoomLock = z;
            this.$onGesture = function4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$panZoomLock, this.$onGesture, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x012c, code lost:
        
            if (androidx.compose.ui.geometry.Offset.m1389equalsimpl0(r7, androidx.compose.ui.geometry.Offset.INSTANCE.m1408getZeroF1C5BW0()) == false) goto L54;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x017c  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0171  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x00b3 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x00a2  */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v13 */
        /* JADX WARN: Type inference failed for: r5v2, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0092 -> B:6:0x0095). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AwaitPointerEventScope awaitPointerEventScope;
            long m1408getZeroF1C5BW0;
            float touchSlop;
            float f;
            float f2;
            int i;
            int i2;
            Object awaitPointerEvent$default;
            int size;
            ?? r5;
            boolean z;
            Object obj2;
            boolean z2;
            float f3;
            char c;
            boolean z3;
            int i3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.label;
            int i5 = 2;
            boolean z4 = false;
            boolean z5 = true;
            z5 = true;
            z5 = true;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        i = this.I$1;
                        touchSlop = this.F$2;
                        i2 = this.I$0;
                        m1408getZeroF1C5BW0 = this.J$0;
                        f = this.F$1;
                        f2 = this.F$0;
                        awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        awaitPointerEvent$default = obj;
                        PointerEvent pointerEvent = (PointerEvent) awaitPointerEvent$default;
                        List<PointerInputChange> changes = pointerEvent.getChanges();
                        size = changes.size();
                        r5 = z4;
                        while (true) {
                            if (r5 >= size) {
                                z = z4;
                                break;
                            }
                            if (changes.get(r5).isConsumed()) {
                                z = z5;
                                break;
                            }
                            r5++;
                        }
                        if (z) {
                            float calculateZoom = TransformGestureDetectorKt.calculateZoom(pointerEvent);
                            float calculateRotation = TransformGestureDetectorKt.calculateRotation(pointerEvent);
                            f3 = touchSlop;
                            long calculatePan = TransformGestureDetectorKt.calculatePan(pointerEvent);
                            if (i2 == 0) {
                                f *= calculateZoom;
                                f2 += calculateRotation;
                                m1408getZeroF1C5BW0 = Offset.m1397plusMKHz9U(m1408getZeroF1C5BW0, calculatePan);
                                float calculateCentroidSize = TransformGestureDetectorKt.calculateCentroidSize(pointerEvent, z4);
                                obj2 = coroutine_suspended;
                                z2 = true;
                                float abs = Math.abs(1 - f) * calculateCentroidSize;
                                float abs2 = Math.abs(((3.1415927f * f2) * calculateCentroidSize) / 180.0f);
                                float m1390getDistanceimpl = Offset.m1390getDistanceimpl(m1408getZeroF1C5BW0);
                                if (abs > f3 || abs2 > f3 || m1390getDistanceimpl > f3) {
                                    i = (!this.$panZoomLock || abs2 >= f3) ? 0 : 1;
                                    i2 = 1;
                                }
                            } else {
                                obj2 = coroutine_suspended;
                                z2 = true;
                            }
                            if (i2 != 0) {
                                long calculateCentroid = TransformGestureDetectorKt.calculateCentroid(pointerEvent, false);
                                if (i != 0) {
                                    calculateRotation = 0.0f;
                                }
                                z3 = false;
                                if (calculateRotation == 0.0f) {
                                    c = 0;
                                    if (calculateZoom == 1.0f) {
                                        i3 = i;
                                    } else {
                                        i3 = i;
                                    }
                                } else {
                                    i3 = i;
                                    c = 0;
                                }
                                this.$onGesture.invoke(Offset.m1381boximpl(calculateCentroid), Offset.m1381boximpl(calculatePan), Boxing.boxFloat(calculateZoom), Boxing.boxFloat(calculateRotation));
                                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                                int size2 = changes2.size();
                                for (int i6 = 0; i6 < size2; i6++) {
                                    PointerInputChange pointerInputChange = changes2.get(i6);
                                    if (PointerEventKt.positionChanged(pointerInputChange)) {
                                        pointerInputChange.consume();
                                    }
                                }
                            } else {
                                i3 = i;
                                c = 0;
                                z3 = false;
                            }
                            i = i3;
                        } else {
                            obj2 = coroutine_suspended;
                            z2 = z5;
                            f3 = touchSlop;
                            c = 0;
                            z3 = false;
                        }
                        if (!z) {
                            List<PointerInputChange> changes3 = pointerEvent.getChanges();
                            int size3 = changes3.size();
                            for (int i7 = 0; i7 < size3; i7++) {
                                if (changes3.get(i7).getPressed()) {
                                    touchSlop = f3;
                                    z5 = z2;
                                    coroutine_suspended = obj2;
                                    i5 = 2;
                                    z4 = false;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$1;
                touchSlop = this.F$2;
                i2 = this.I$0;
                m1408getZeroF1C5BW0 = this.J$0;
                f = this.F$1;
                f2 = this.F$0;
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                m1408getZeroF1C5BW0 = Offset.INSTANCE.m1408getZeroF1C5BW0();
                touchSlop = awaitPointerEventScope.getViewConfiguration().getTouchSlop();
                this.L$0 = awaitPointerEventScope;
                this.F$0 = 0.0f;
                this.F$1 = 1.0f;
                this.J$0 = m1408getZeroF1C5BW0;
                this.I$0 = 0;
                this.F$2 = touchSlop;
                this.I$1 = 0;
                this.label = 1;
                if (TapGestureDetectorKt.awaitFirstDown(awaitPointerEventScope, false, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                f = 1.0f;
                f2 = 0.0f;
                i = 0;
                i2 = 0;
            }
            this.L$0 = awaitPointerEventScope;
            this.F$0 = f2;
            this.F$1 = f;
            this.J$0 = m1408getZeroF1C5BW0;
            this.I$0 = i2;
            this.F$2 = touchSlop;
            this.I$1 = i;
            this.label = i5;
            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, this, z5 ? 1 : 0, null);
            if (awaitPointerEvent$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            PointerEvent pointerEvent2 = (PointerEvent) awaitPointerEvent$default;
            List<PointerInputChange> changes4 = pointerEvent2.getChanges();
            size = changes4.size();
            r5 = z4;
            while (true) {
                if (r5 >= size) {
                }
                r5++;
            }
            if (z) {
            }
            if (!z) {
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (((PointerInputScope) this.L$0).awaitPointerEventScope(new AnonymousClass1(this.$panZoomLock, this.$onGesture, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
