package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import com.google.zxing.pdf417.PDF417Common;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextSelectionMouseDetector.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2", f = "TextSelectionMouseDetector.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class TextSelectionMouseDetectorKt$mouseSelectionDetector$2 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MouseSelectionObserver $observer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextSelectionMouseDetectorKt$mouseSelectionDetector$2(MouseSelectionObserver mouseSelectionObserver, Continuation<? super TextSelectionMouseDetectorKt$mouseSelectionDetector$2> continuation) {
        super(2, continuation);
        this.$observer = mouseSelectionObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TextSelectionMouseDetectorKt$mouseSelectionDetector$2 textSelectionMouseDetectorKt$mouseSelectionDetector$2 = new TextSelectionMouseDetectorKt$mouseSelectionDetector$2(this.$observer, continuation);
        textSelectionMouseDetectorKt$mouseSelectionDetector$2.L$0 = obj;
        return textSelectionMouseDetectorKt$mouseSelectionDetector$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((TextSelectionMouseDetectorKt$mouseSelectionDetector$2) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: TextSelectionMouseDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$1", f = "TextSelectionMouseDetector.kt", i = {0, 0, 1, 1, 2, 2}, l = {PDF417Common.MAX_ROWS_IN_BARCODE, 97, 112}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "clicksCounter", "$this$awaitPointerEventScope", "clicksCounter", "$this$awaitPointerEventScope", "clicksCounter"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MouseSelectionObserver $observer;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MouseSelectionObserver mouseSelectionObserver, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$observer = mouseSelectionObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$observer, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0052 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0076 -> B:10:0x00e0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0095 -> B:10:0x00e0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00be -> B:10:0x00e0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00dd -> B:10:0x00e0). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AwaitPointerEventScope awaitPointerEventScope;
            ClicksCounter clicksCounter;
            AwaitPointerEventScope awaitPointerEventScope2;
            PointerEvent pointerEvent;
            final SelectionAdjustment none;
            Object awaitMouseEventDown;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                clicksCounter = new ClicksCounter(awaitPointerEventScope.getViewConfiguration());
                this.L$0 = awaitPointerEventScope;
                this.L$1 = clicksCounter;
                this.label = 1;
                awaitMouseEventDown = TextSelectionMouseDetectorKt.awaitMouseEventDown(awaitPointerEventScope, this);
                if (awaitMouseEventDown != coroutine_suspended) {
                }
            } else if (i == 1) {
                clicksCounter = (ClicksCounter) this.L$1;
                awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                pointerEvent = (PointerEvent) obj;
                clicksCounter.update(pointerEvent);
                PointerInputChange pointerInputChange = pointerEvent.getChanges().get(0);
                if (TextFieldSelectionManager_androidKt.isShiftPressed(pointerEvent)) {
                }
                awaitPointerEventScope = awaitPointerEventScope2;
                this.L$0 = awaitPointerEventScope;
                this.L$1 = clicksCounter;
                this.label = 1;
                awaitMouseEventDown = TextSelectionMouseDetectorKt.awaitMouseEventDown(awaitPointerEventScope, this);
                if (awaitMouseEventDown != coroutine_suspended) {
                }
            } else if (i == 2 || i == 3) {
                clicksCounter = (ClicksCounter) this.L$1;
                awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                awaitPointerEventScope = awaitPointerEventScope2;
                this.L$0 = awaitPointerEventScope;
                this.L$1 = clicksCounter;
                this.label = 1;
                awaitMouseEventDown = TextSelectionMouseDetectorKt.awaitMouseEventDown(awaitPointerEventScope, this);
                if (awaitMouseEventDown != coroutine_suspended) {
                    return coroutine_suspended;
                }
                awaitPointerEventScope2 = awaitPointerEventScope;
                obj = awaitMouseEventDown;
                pointerEvent = (PointerEvent) obj;
                clicksCounter.update(pointerEvent);
                PointerInputChange pointerInputChange2 = pointerEvent.getChanges().get(0);
                if (TextFieldSelectionManager_androidKt.isShiftPressed(pointerEvent)) {
                    if (this.$observer.mo737onExtendk4lQ0M(pointerInputChange2.getPosition())) {
                        pointerInputChange2.consume();
                        long id = pointerInputChange2.getId();
                        final MouseSelectionObserver mouseSelectionObserver = this.$observer;
                        this.L$0 = awaitPointerEventScope2;
                        this.L$1 = clicksCounter;
                        this.label = 2;
                        if (DragGestureDetectorKt.m265dragjO51t88(awaitPointerEventScope2, id, new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt.mouseSelectionDetector.2.1.1
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
                                if (MouseSelectionObserver.this.mo738onExtendDragk4lQ0M(it.getPosition())) {
                                    it.consume();
                                }
                            }
                        }, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    int clicks = clicksCounter.getClicks();
                    if (clicks == 1) {
                        none = SelectionAdjustment.INSTANCE.getNone();
                    } else if (clicks == 2) {
                        none = SelectionAdjustment.INSTANCE.getWord();
                    } else {
                        none = SelectionAdjustment.INSTANCE.getParagraph();
                    }
                    if (this.$observer.mo739onStart3MmeM6k(pointerInputChange2.getPosition(), none)) {
                        pointerInputChange2.consume();
                        long id2 = pointerInputChange2.getId();
                        final MouseSelectionObserver mouseSelectionObserver2 = this.$observer;
                        this.L$0 = awaitPointerEventScope2;
                        this.L$1 = clicksCounter;
                        this.label = 3;
                        if (DragGestureDetectorKt.m265dragjO51t88(awaitPointerEventScope2, id2, new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt.mouseSelectionDetector.2.1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                if (MouseSelectionObserver.this.mo736onDrag3MmeM6k(it.getPosition(), none)) {
                                    it.consume();
                                }
                            }
                        }, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                awaitPointerEventScope = awaitPointerEventScope2;
                this.L$0 = awaitPointerEventScope;
                this.L$1 = clicksCounter;
                this.label = 1;
                awaitMouseEventDown = TextSelectionMouseDetectorKt.awaitMouseEventDown(awaitPointerEventScope, this);
                if (awaitMouseEventDown != coroutine_suspended) {
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
            if (((PointerInputScope) this.L$0).awaitPointerEventScope(new AnonymousClass1(this.$observer, null), this) == coroutine_suspended) {
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
