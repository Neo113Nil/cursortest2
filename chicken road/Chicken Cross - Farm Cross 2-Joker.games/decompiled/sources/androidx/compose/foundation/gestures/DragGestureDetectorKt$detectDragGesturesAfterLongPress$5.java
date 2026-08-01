package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DragGestureDetector.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", f = "DragGestureDetector.kt", i = {0, 1}, l = {276, 280, 284}, m = "invokeSuspend", n = {"$this$forEachGesture", "$this$forEachGesture"}, s = {"L$0", "L$0"})
/* loaded from: classes.dex */
final class DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<PointerInputChange, Offset, Unit> $onDrag;
    final /* synthetic */ Function0<Unit> $onDragCancel;
    final /* synthetic */ Function0<Unit> $onDragEnd;
    final /* synthetic */ Function1<Offset, Unit> $onDragStart;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(Function1<? super Offset, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super DragGestureDetectorKt$detectDragGesturesAfterLongPress$5> continuation) {
        super(2, continuation);
        this.$onDragStart = function1;
        this.$onDragCancel = function0;
        this.$onDragEnd = function02;
        this.$onDrag = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 dragGestureDetectorKt$detectDragGesturesAfterLongPress$5 = new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(this.$onDragStart, this.$onDragCancel, this.$onDragEnd, this.$onDrag, continuation);
        dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.L$0 = obj;
        return dragGestureDetectorKt$detectDragGesturesAfterLongPress$5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((DragGestureDetectorKt$detectDragGesturesAfterLongPress$5) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066 A[Catch: CancellationException -> 0x0017, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0017, blocks: (B:7:0x0012, B:14:0x0026, B:15:0x0061, B:17:0x0066, B:22:0x0053), top: B:2:0x000a }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PointerInputScope pointerInputScope;
        PointerInputChange pointerInputChange;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope2 = (PointerInputScope) this.L$0;
                this.L$0 = pointerInputScope2;
                this.label = 1;
                Object awaitPointerEventScope = pointerInputScope2.awaitPointerEventScope(new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1(null), this);
                if (awaitPointerEventScope == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pointerInputScope = pointerInputScope2;
                obj = awaitPointerEventScope;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    pointerInputScope = (PointerInputScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange != null) {
                        this.$onDragStart.invoke(Offset.m1381boximpl(pointerInputChange.getPosition()));
                        this.L$0 = null;
                        this.label = 3;
                        if (pointerInputScope.awaitPointerEventScope(new AnonymousClass1(pointerInputChange, this.$onDragEnd, this.$onDragCancel, this.$onDrag, null), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                pointerInputScope = (PointerInputScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            PointerInputChange pointerInputChange2 = (PointerInputChange) obj;
            this.L$0 = pointerInputScope;
            this.label = 2;
            obj = DragGestureDetectorKt.awaitLongPressOrCancellation(pointerInputScope, pointerInputChange2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange != null) {
            }
            return Unit.INSTANCE;
        } catch (CancellationException e) {
            this.$onDragCancel.invoke();
            throw e;
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1", f = "DragGestureDetector.kt", i = {0}, l = {286}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1, reason: invalid class name */
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PointerInputChange $drag;
        final /* synthetic */ Function2<PointerInputChange, Offset, Unit> $onDrag;
        final /* synthetic */ Function0<Unit> $onDragCancel;
        final /* synthetic */ Function0<Unit> $onDragEnd;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(PointerInputChange pointerInputChange, Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$drag = pointerInputChange;
            this.$onDragEnd = function0;
            this.$onDragCancel = function02;
            this.$onDrag = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$drag, this.$onDragEnd, this.$onDragCancel, this.$onDrag, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AwaitPointerEventScope awaitPointerEventScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                long id = this.$drag.getId();
                final Function2<PointerInputChange, Offset, Unit> function2 = this.$onDrag;
                this.L$0 = awaitPointerEventScope2;
                this.label = 1;
                Object m265dragjO51t88 = DragGestureDetectorKt.m265dragjO51t88(awaitPointerEventScope2, id, new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.5.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange) {
                        invoke2(pointerInputChange);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(PointerInputChange it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        function2.invoke(it, Offset.m1381boximpl(PointerEventKt.positionChange(it)));
                        it.consume();
                    }
                }, this);
                if (m265dragjO51t88 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                awaitPointerEventScope = awaitPointerEventScope2;
                obj = m265dragjO51t88;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                List<PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
                int size = changes.size();
                for (int i2 = 0; i2 < size; i2++) {
                    PointerInputChange pointerInputChange = changes.get(i2);
                    if (PointerEventKt.changedToUp(pointerInputChange)) {
                        pointerInputChange.consume();
                    }
                }
                this.$onDragEnd.invoke();
            } else {
                this.$onDragCancel.invoke();
            }
            return Unit.INSTANCE;
        }
    }
}
