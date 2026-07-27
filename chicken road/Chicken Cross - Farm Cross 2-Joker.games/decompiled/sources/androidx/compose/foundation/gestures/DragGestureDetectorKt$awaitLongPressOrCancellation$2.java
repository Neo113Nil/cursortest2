package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DragGestureDetector.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", i = {}, l = {755}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class DragGestureDetectorKt$awaitLongPressOrCancellation$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<PointerInputChange> $currentDown;
    final /* synthetic */ Ref.ObjectRef<PointerInputChange> $longPress;
    final /* synthetic */ PointerInputScope $this_awaitLongPressOrCancellation;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DragGestureDetectorKt$awaitLongPressOrCancellation$2(PointerInputScope pointerInputScope, Ref.ObjectRef<PointerInputChange> objectRef, Ref.ObjectRef<PointerInputChange> objectRef2, Continuation<? super DragGestureDetectorKt$awaitLongPressOrCancellation$2> continuation) {
        super(2, continuation);
        this.$this_awaitLongPressOrCancellation = pointerInputScope;
        this.$currentDown = objectRef;
        this.$longPress = objectRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DragGestureDetectorKt$awaitLongPressOrCancellation$2(this.$this_awaitLongPressOrCancellation, this.$currentDown, this.$longPress, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DragGestureDetectorKt$awaitLongPressOrCancellation$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2$1", f = "DragGestureDetector.kt", i = {0, 0, 1, 1, 1}, l = {758, 775}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "finished", "$this$awaitPointerEventScope", NotificationCompat.CATEGORY_EVENT, "finished"}, s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<PointerInputChange> $currentDown;
        final /* synthetic */ Ref.ObjectRef<PointerInputChange> $longPress;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Ref.ObjectRef<PointerInputChange> objectRef, Ref.ObjectRef<PointerInputChange> objectRef2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$currentDown = objectRef;
            this.$longPress = objectRef2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentDown, this.$longPress, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x009d, code lost:
        
            r2 = r6;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x00e3  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00b1 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0072 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x00d3 A[EDGE_INSN: B:68:0x00d3->B:13:0x00d3 BREAK  A[LOOP:0: B:7:0x00c0->B:10:0x00d0], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x00c2  */
        /* JADX WARN: Type inference failed for: r11v6 */
        /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v5, types: [T] */
        /* JADX WARN: Type inference failed for: r7v7, types: [T, androidx.compose.ui.input.pointer.PointerInputChange] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00b2 -> B:6:0x00b5). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AwaitPointerEventScope awaitPointerEventScope;
            int i;
            Object obj2;
            int size;
            int i2;
            int size2;
            int i3;
            Object awaitPointerEvent;
            boolean m267isPointerUpDmW0f2w;
            PointerInputChange pointerInputChange;
            T t;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.label;
            Object obj3 = null;
            int i5 = 1;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                i = 0;
                if (i != 0) {
                }
            } else if (i4 == 1) {
                i = this.I$0;
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
                PointerEvent pointerEvent = (PointerEvent) obj2;
                List<PointerInputChange> changes = pointerEvent.getChanges();
                size = changes.size();
                i2 = 0;
                while (true) {
                    if (i2 >= size) {
                    }
                    i2++;
                }
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                size2 = changes2.size();
                while (i3 < size2) {
                }
                this.L$0 = awaitPointerEventScope;
                this.L$1 = pointerEvent;
                this.I$0 = i;
                this.label = 2;
                awaitPointerEvent = awaitPointerEventScope.awaitPointerEvent(PointerEventPass.Final, this);
                if (awaitPointerEvent != coroutine_suspended) {
                }
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$0;
                PointerEvent pointerEvent2 = (PointerEvent) this.L$1;
                AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                awaitPointerEvent = obj;
                List<PointerInputChange> changes3 = ((PointerEvent) awaitPointerEvent).getChanges();
                int size3 = changes3.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size3) {
                        break;
                    }
                    if (changes3.get(i6).isConsumed()) {
                        i = i5;
                        break;
                    }
                    i6++;
                }
                m267isPointerUpDmW0f2w = DragGestureDetectorKt.m267isPointerUpDmW0f2w(pointerEvent2, this.$currentDown.element.getId());
                if (m267isPointerUpDmW0f2w) {
                    Ref.ObjectRef<PointerInputChange> objectRef = this.$longPress;
                    List<PointerInputChange> changes4 = pointerEvent2.getChanges();
                    Ref.ObjectRef<PointerInputChange> objectRef2 = this.$currentDown;
                    int size4 = changes4.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size4) {
                            t = 0;
                            break;
                        }
                        t = changes4.get(i7);
                        Ref.ObjectRef<PointerInputChange> objectRef3 = objectRef2;
                        if (PointerId.m2981equalsimpl0(((PointerInputChange) t).getId(), objectRef2.element.getId())) {
                            break;
                        }
                        i7++;
                        objectRef2 = objectRef3;
                    }
                    objectRef.element = t;
                } else {
                    List<PointerInputChange> changes5 = pointerEvent2.getChanges();
                    int size5 = changes5.size();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size5) {
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes5.get(i8);
                        if (pointerInputChange.getPressed()) {
                            break;
                        }
                        i8++;
                    }
                    PointerInputChange pointerInputChange2 = pointerInputChange;
                    if (pointerInputChange2 != 0) {
                        this.$currentDown.element = pointerInputChange2;
                        this.$longPress.element = this.$currentDown.element;
                    } else {
                        awaitPointerEventScope = awaitPointerEventScope2;
                        i = 1;
                        obj3 = null;
                        i5 = 1;
                        if (i != 0) {
                            return Unit.INSTANCE;
                        }
                        this.L$0 = awaitPointerEventScope;
                        this.L$1 = obj3;
                        this.I$0 = i;
                        this.label = i5;
                        obj2 = awaitPointerEventScope.awaitPointerEvent(PointerEventPass.Main, this);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        PointerEvent pointerEvent3 = (PointerEvent) obj2;
                        List<PointerInputChange> changes6 = pointerEvent3.getChanges();
                        size = changes6.size();
                        i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                i = i5;
                                break;
                            }
                            if (!PointerEventKt.changedToUpIgnoreConsumed(changes6.get(i2))) {
                                break;
                            }
                            i2++;
                        }
                        List<PointerInputChange> changes22 = pointerEvent3.getChanges();
                        size2 = changes22.size();
                        for (i3 = 0; i3 < size2; i3++) {
                            PointerInputChange pointerInputChange3 = changes22.get(i3);
                            if (pointerInputChange3.isConsumed() || PointerEventKt.m2944isOutOfBoundsjwHxaWs(pointerInputChange3, awaitPointerEventScope.mo2912getSizeYbymL2g(), awaitPointerEventScope.mo2911getExtendedTouchPaddingNHjbRc())) {
                                break;
                            }
                        }
                        this.L$0 = awaitPointerEventScope;
                        this.L$1 = pointerEvent3;
                        this.I$0 = i;
                        this.label = 2;
                        awaitPointerEvent = awaitPointerEventScope.awaitPointerEvent(PointerEventPass.Final, this);
                        if (awaitPointerEvent != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        awaitPointerEventScope2 = awaitPointerEventScope;
                        pointerEvent2 = pointerEvent3;
                        List<PointerInputChange> changes32 = ((PointerEvent) awaitPointerEvent).getChanges();
                        int size32 = changes32.size();
                        int i62 = 0;
                        while (true) {
                            if (i62 >= size32) {
                            }
                            i62++;
                        }
                        m267isPointerUpDmW0f2w = DragGestureDetectorKt.m267isPointerUpDmW0f2w(pointerEvent2, this.$currentDown.element.getId());
                        if (m267isPointerUpDmW0f2w) {
                        }
                    }
                }
                awaitPointerEventScope = awaitPointerEventScope2;
                obj3 = null;
                i5 = 1;
                if (i != 0) {
                }
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (this.$this_awaitLongPressOrCancellation.awaitPointerEventScope(new AnonymousClass1(this.$currentDown, this.$longPress, null), this) == coroutine_suspended) {
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
