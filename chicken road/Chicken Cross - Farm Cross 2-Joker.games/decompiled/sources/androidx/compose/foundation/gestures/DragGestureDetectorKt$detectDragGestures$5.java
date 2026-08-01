package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import com.vungle.ads.internal.protos.Sdk;
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
import kotlin.jvm.internal.Ref;

/* compiled from: DragGestureDetector.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5", f = "DragGestureDetector.kt", i = {}, l = {224}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class DragGestureDetectorKt$detectDragGestures$5 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<PointerInputChange, Offset, Unit> $onDrag;
    final /* synthetic */ Function0<Unit> $onDragCancel;
    final /* synthetic */ Function0<Unit> $onDragEnd;
    final /* synthetic */ Function1<Offset, Unit> $onDragStart;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DragGestureDetectorKt$detectDragGestures$5(Function1<? super Offset, Unit> function1, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Function0<Unit> function0, Function0<Unit> function02, Continuation<? super DragGestureDetectorKt$detectDragGestures$5> continuation) {
        super(2, continuation);
        this.$onDragStart = function1;
        this.$onDrag = function2;
        this.$onDragCancel = function0;
        this.$onDragEnd = function02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DragGestureDetectorKt$detectDragGestures$5 dragGestureDetectorKt$detectDragGestures$5 = new DragGestureDetectorKt$detectDragGestures$5(this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, continuation);
        dragGestureDetectorKt$detectDragGestures$5.L$0 = obj;
        return dragGestureDetectorKt$detectDragGestures$5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((DragGestureDetectorKt$detectDragGestures$5) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5$1", f = "DragGestureDetector.kt", i = {0, 1, 1, 1}, l = {Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 229, 241}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "down", "overSlop"}, s = {"L$0", "L$0", "L$1", "L$2"})
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5$1, reason: invalid class name */
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<PointerInputChange, Offset, Unit> $onDrag;
        final /* synthetic */ Function0<Unit> $onDragCancel;
        final /* synthetic */ Function0<Unit> $onDragEnd;
        final /* synthetic */ Function1<Offset, Unit> $onDragStart;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function1<? super Offset, Unit> function1, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Function0<Unit> function0, Function0<Unit> function02, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$onDragStart = function1;
            this.$onDrag = function2;
            this.$onDragCancel = function0;
            this.$onDragEnd = function02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x00db  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0082 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x00d5  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0083 -> B:17:0x0086). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AwaitPointerEventScope awaitPointerEventScope;
            PointerInputChange pointerInputChange;
            AwaitPointerEventScope awaitPointerEventScope2;
            final Ref.LongRef longRef;
            Object m258awaitPointerSlopOrCancellationgDDlDlE;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                this.L$0 = awaitPointerEventScope;
                this.label = 1;
                obj = TapGestureDetectorKt.awaitFirstDown(awaitPointerEventScope, false, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        if (((Boolean) obj).booleanValue()) {
                            this.$onDragCancel.invoke();
                        } else {
                            this.$onDragEnd.invoke();
                        }
                        return Unit.INSTANCE;
                    }
                    longRef = (Ref.LongRef) this.L$2;
                    pointerInputChange = (PointerInputChange) this.L$1;
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    PointerInputChange pointerInputChange2 = (PointerInputChange) obj;
                    if (pointerInputChange2 != null || pointerInputChange2.isConsumed()) {
                        if (pointerInputChange2 != null) {
                            this.$onDragStart.invoke(Offset.m1381boximpl(pointerInputChange2.getPosition()));
                            this.$onDrag.invoke(pointerInputChange2, Offset.m1381boximpl(longRef.element));
                            long id = pointerInputChange2.getId();
                            final Function2<PointerInputChange, Offset, Unit> function2 = this.$onDrag;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 3;
                            obj = DragGestureDetectorKt.m265dragjO51t88(awaitPointerEventScope3, id, new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.5.1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange3) {
                                    invoke2(pointerInputChange3);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(PointerInputChange it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    function2.invoke(it, Offset.m1381boximpl(PointerEventKt.positionChange(it)));
                                    it.consume();
                                }
                            }, this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            if (((Boolean) obj).booleanValue()) {
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    this.L$0 = awaitPointerEventScope2;
                    this.L$1 = pointerInputChange;
                    this.L$2 = longRef;
                    this.label = 2;
                    m258awaitPointerSlopOrCancellationgDDlDlE = DragGestureDetectorKt.m258awaitPointerSlopOrCancellationgDDlDlE(awaitPointerEventScope2, pointerInputChange.getId(), pointerInputChange.getType(), new Function2<PointerInputChange, Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.5.1.1
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange3, Offset offset) {
                            m271invokeUv8p0NA(pointerInputChange3, offset.getPackedValue());
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                        public final void m271invokeUv8p0NA(PointerInputChange change, long j) {
                            Intrinsics.checkNotNullParameter(change, "change");
                            change.consume();
                            Ref.LongRef.this.element = j;
                        }
                    }, this);
                    if (m258awaitPointerSlopOrCancellationgDDlDlE != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    obj = m258awaitPointerSlopOrCancellationgDDlDlE;
                    PointerInputChange pointerInputChange22 = (PointerInputChange) obj;
                    if (pointerInputChange22 != null) {
                    }
                    if (pointerInputChange22 != null) {
                    }
                    return Unit.INSTANCE;
                }
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            Ref.LongRef longRef2 = new Ref.LongRef();
            longRef2.element = Offset.INSTANCE.m1408getZeroF1C5BW0();
            pointerInputChange = (PointerInputChange) obj;
            awaitPointerEventScope2 = awaitPointerEventScope;
            longRef = longRef2;
            this.L$0 = awaitPointerEventScope2;
            this.L$1 = pointerInputChange;
            this.L$2 = longRef;
            this.label = 2;
            m258awaitPointerSlopOrCancellationgDDlDlE = DragGestureDetectorKt.m258awaitPointerSlopOrCancellationgDDlDlE(awaitPointerEventScope2, pointerInputChange.getId(), pointerInputChange.getType(), new Function2<PointerInputChange, Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.5.1.1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange3, Offset offset) {
                    m271invokeUv8p0NA(pointerInputChange3, offset.getPackedValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                public final void m271invokeUv8p0NA(PointerInputChange change, long j) {
                    Intrinsics.checkNotNullParameter(change, "change");
                    change.consume();
                    Ref.LongRef.this.element = j;
                }
            }, this);
            if (m258awaitPointerSlopOrCancellationgDDlDlE != coroutine_suspended) {
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
            if (((PointerInputScope) this.L$0).awaitPointerEventScope(new AnonymousClass1(this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, null), this) == coroutine_suspended) {
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
