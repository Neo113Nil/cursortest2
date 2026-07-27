package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Draggable.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B¡\u0001\u0012<\u0010\u0002\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\u0002\b\u000b\u0012<\u0010\f\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\u0002\b\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013ø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u0015\u0010\u001d\u001a\u00020\n*\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\n*\u00020\u00042\u0006\u0010 \u001a\u00020!H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\"J\u001d\u0010#\u001a\u00020\n*\u00020\u00042\u0006\u0010 \u001a\u00020$H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010%R\u0019\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018RO\u0010\u0002\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\u0002\b\u000bø\u0001\u0000ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aRL\u0010\f\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Landroidx/compose/foundation/gestures/DragLogic;", "", "onDragStarted", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "name", "startedPosition", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "onDragStopped", "", "velocity", "dragStartInteraction", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/interaction/DragInteraction$Start;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "getDragStartInteraction", "()Landroidx/compose/runtime/MutableState;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getOnDragStarted", "()Lkotlin/jvm/functions/Function3;", "Lkotlin/jvm/functions/Function3;", "getOnDragStopped", "processDragCancel", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processDragStart", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/foundation/gestures/DragEvent$DragStarted;", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/gestures/DragEvent$DragStarted;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processDragStop", "Landroidx/compose/foundation/gestures/DragEvent$DragStopped;", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/gestures/DragEvent$DragStopped;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class DragLogic {
    private final MutableState<DragInteraction.Start> dragStartInteraction;
    private final MutableInteractionSource interactionSource;
    private final Function3<CoroutineScope, Offset, Continuation<? super Unit>, Object> onDragStarted;
    private final Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> onDragStopped;

    /* JADX WARN: Multi-variable type inference failed */
    public DragLogic(Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> onDragStarted, Function3<? super CoroutineScope, ? super Float, ? super Continuation<? super Unit>, ? extends Object> onDragStopped, MutableState<DragInteraction.Start> dragStartInteraction, MutableInteractionSource mutableInteractionSource) {
        Intrinsics.checkNotNullParameter(onDragStarted, "onDragStarted");
        Intrinsics.checkNotNullParameter(onDragStopped, "onDragStopped");
        Intrinsics.checkNotNullParameter(dragStartInteraction, "dragStartInteraction");
        this.onDragStarted = onDragStarted;
        this.onDragStopped = onDragStopped;
        this.dragStartInteraction = dragStartInteraction;
        this.interactionSource = mutableInteractionSource;
    }

    public final Function3<CoroutineScope, Offset, Continuation<? super Unit>, Object> getOnDragStarted() {
        return this.onDragStarted;
    }

    public final Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> getOnDragStopped() {
        return this.onDragStopped;
    }

    public final MutableState<DragInteraction.Start> getDragStartInteraction() {
        return this.dragStartInteraction;
    }

    public final MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processDragStart(CoroutineScope coroutineScope, DragEvent.DragStarted dragStarted, Continuation<? super Unit> continuation) {
        DragLogic$processDragStart$1 dragLogic$processDragStart$1;
        Object coroutine_suspended;
        int i;
        DragLogic dragLogic;
        MutableInteractionSource mutableInteractionSource;
        DragInteraction.Start start;
        MutableInteractionSource mutableInteractionSource2;
        DragLogic dragLogic2;
        CoroutineScope coroutineScope2;
        DragInteraction.Start start2;
        Function3<CoroutineScope, Offset, Continuation<? super Unit>, Object> function3;
        Offset m1381boximpl;
        if (continuation instanceof DragLogic$processDragStart$1) {
            dragLogic$processDragStart$1 = (DragLogic$processDragStart$1) continuation;
            if ((dragLogic$processDragStart$1.label & Integer.MIN_VALUE) != 0) {
                dragLogic$processDragStart$1.label -= Integer.MIN_VALUE;
                Object obj = dragLogic$processDragStart$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragLogic$processDragStart$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    DragInteraction.Start value = this.dragStartInteraction.getValue();
                    if (value != null && (mutableInteractionSource = this.interactionSource) != null) {
                        DragInteraction.Cancel cancel = new DragInteraction.Cancel(value);
                        dragLogic$processDragStart$1.L$0 = this;
                        dragLogic$processDragStart$1.L$1 = coroutineScope;
                        dragLogic$processDragStart$1.L$2 = dragStarted;
                        dragLogic$processDragStart$1.label = 1;
                        if (mutableInteractionSource.emit(cancel, dragLogic$processDragStart$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    dragLogic = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                ResultKt.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        start2 = (DragInteraction.Start) dragLogic$processDragStart$1.L$3;
                        dragStarted = (DragEvent.DragStarted) dragLogic$processDragStart$1.L$2;
                        coroutineScope2 = (CoroutineScope) dragLogic$processDragStart$1.L$1;
                        dragLogic2 = (DragLogic) dragLogic$processDragStart$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        start = start2;
                        coroutineScope = coroutineScope2;
                        dragLogic = dragLogic2;
                        dragLogic.dragStartInteraction.setValue(start);
                        function3 = dragLogic.onDragStarted;
                        m1381boximpl = Offset.m1381boximpl(dragStarted.getStartPoint());
                        dragLogic$processDragStart$1.L$0 = null;
                        dragLogic$processDragStart$1.L$1 = null;
                        dragLogic$processDragStart$1.L$2 = null;
                        dragLogic$processDragStart$1.L$3 = null;
                        dragLogic$processDragStart$1.label = 3;
                        if (function3.invoke(coroutineScope, m1381boximpl, dragLogic$processDragStart$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    DragEvent.DragStarted dragStarted2 = (DragEvent.DragStarted) dragLogic$processDragStart$1.L$2;
                    CoroutineScope coroutineScope3 = (CoroutineScope) dragLogic$processDragStart$1.L$1;
                    dragLogic = (DragLogic) dragLogic$processDragStart$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    dragStarted = dragStarted2;
                    coroutineScope = coroutineScope3;
                }
                start = new DragInteraction.Start();
                mutableInteractionSource2 = dragLogic.interactionSource;
                if (mutableInteractionSource2 != null) {
                    dragLogic$processDragStart$1.L$0 = dragLogic;
                    dragLogic$processDragStart$1.L$1 = coroutineScope;
                    dragLogic$processDragStart$1.L$2 = dragStarted;
                    dragLogic$processDragStart$1.L$3 = start;
                    dragLogic$processDragStart$1.label = 2;
                    if (mutableInteractionSource2.emit(start, dragLogic$processDragStart$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    dragLogic2 = dragLogic;
                    coroutineScope2 = coroutineScope;
                    start2 = start;
                    start = start2;
                    coroutineScope = coroutineScope2;
                    dragLogic = dragLogic2;
                }
                dragLogic.dragStartInteraction.setValue(start);
                function3 = dragLogic.onDragStarted;
                m1381boximpl = Offset.m1381boximpl(dragStarted.getStartPoint());
                dragLogic$processDragStart$1.L$0 = null;
                dragLogic$processDragStart$1.L$1 = null;
                dragLogic$processDragStart$1.L$2 = null;
                dragLogic$processDragStart$1.L$3 = null;
                dragLogic$processDragStart$1.label = 3;
                if (function3.invoke(coroutineScope, m1381boximpl, dragLogic$processDragStart$1) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
        }
        dragLogic$processDragStart$1 = new DragLogic$processDragStart$1(this, continuation);
        Object obj2 = dragLogic$processDragStart$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragLogic$processDragStart$1.label;
        if (i != 0) {
        }
        start = new DragInteraction.Start();
        mutableInteractionSource2 = dragLogic.interactionSource;
        if (mutableInteractionSource2 != null) {
        }
        dragLogic.dragStartInteraction.setValue(start);
        function3 = dragLogic.onDragStarted;
        m1381boximpl = Offset.m1381boximpl(dragStarted.getStartPoint());
        dragLogic$processDragStart$1.L$0 = null;
        dragLogic$processDragStart$1.L$1 = null;
        dragLogic$processDragStart$1.L$2 = null;
        dragLogic$processDragStart$1.L$3 = null;
        dragLogic$processDragStart$1.label = 3;
        if (function3.invoke(coroutineScope, m1381boximpl, dragLogic$processDragStart$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processDragStop(CoroutineScope coroutineScope, DragEvent.DragStopped dragStopped, Continuation<? super Unit> continuation) {
        DragLogic$processDragStop$1 dragLogic$processDragStop$1;
        Object coroutine_suspended;
        int i;
        DragLogic dragLogic;
        Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> function3;
        Float boxFloat;
        if (continuation instanceof DragLogic$processDragStop$1) {
            dragLogic$processDragStop$1 = (DragLogic$processDragStop$1) continuation;
            if ((dragLogic$processDragStop$1.label & Integer.MIN_VALUE) != 0) {
                dragLogic$processDragStop$1.label -= Integer.MIN_VALUE;
                Object obj = dragLogic$processDragStop$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragLogic$processDragStop$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    DragInteraction.Start value = this.dragStartInteraction.getValue();
                    if (value != null) {
                        MutableInteractionSource mutableInteractionSource = this.interactionSource;
                        if (mutableInteractionSource != null) {
                            DragInteraction.Stop stop = new DragInteraction.Stop(value);
                            dragLogic$processDragStop$1.L$0 = this;
                            dragLogic$processDragStop$1.L$1 = coroutineScope;
                            dragLogic$processDragStop$1.L$2 = dragStopped;
                            dragLogic$processDragStop$1.label = 1;
                            if (mutableInteractionSource.emit(stop, dragLogic$processDragStop$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        dragLogic = this;
                    } else {
                        dragLogic = this;
                        function3 = dragLogic.onDragStopped;
                        boxFloat = Boxing.boxFloat(dragStopped.getVelocity());
                        dragLogic$processDragStop$1.L$0 = null;
                        dragLogic$processDragStop$1.L$1 = null;
                        dragLogic$processDragStop$1.L$2 = null;
                        dragLogic$processDragStop$1.label = 2;
                        if (function3.invoke(coroutineScope, boxFloat, dragLogic$processDragStop$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    DragEvent.DragStopped dragStopped2 = (DragEvent.DragStopped) dragLogic$processDragStop$1.L$2;
                    CoroutineScope coroutineScope2 = (CoroutineScope) dragLogic$processDragStop$1.L$1;
                    dragLogic = (DragLogic) dragLogic$processDragStop$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    dragStopped = dragStopped2;
                    coroutineScope = coroutineScope2;
                }
                dragLogic.dragStartInteraction.setValue(null);
                function3 = dragLogic.onDragStopped;
                boxFloat = Boxing.boxFloat(dragStopped.getVelocity());
                dragLogic$processDragStop$1.L$0 = null;
                dragLogic$processDragStop$1.L$1 = null;
                dragLogic$processDragStop$1.L$2 = null;
                dragLogic$processDragStop$1.label = 2;
                if (function3.invoke(coroutineScope, boxFloat, dragLogic$processDragStop$1) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
        }
        dragLogic$processDragStop$1 = new DragLogic$processDragStop$1(this, continuation);
        Object obj2 = dragLogic$processDragStop$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragLogic$processDragStop$1.label;
        if (i != 0) {
        }
        dragLogic.dragStartInteraction.setValue(null);
        function3 = dragLogic.onDragStopped;
        boxFloat = Boxing.boxFloat(dragStopped.getVelocity());
        dragLogic$processDragStop$1.L$0 = null;
        dragLogic$processDragStop$1.L$1 = null;
        dragLogic$processDragStop$1.L$2 = null;
        dragLogic$processDragStop$1.label = 2;
        if (function3.invoke(coroutineScope, boxFloat, dragLogic$processDragStop$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processDragCancel(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        DragLogic$processDragCancel$1 dragLogic$processDragCancel$1;
        Object coroutine_suspended;
        int i;
        DragLogic dragLogic;
        Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> function3;
        Float boxFloat;
        if (continuation instanceof DragLogic$processDragCancel$1) {
            dragLogic$processDragCancel$1 = (DragLogic$processDragCancel$1) continuation;
            if ((dragLogic$processDragCancel$1.label & Integer.MIN_VALUE) != 0) {
                dragLogic$processDragCancel$1.label -= Integer.MIN_VALUE;
                Object obj = dragLogic$processDragCancel$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragLogic$processDragCancel$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    DragInteraction.Start value = this.dragStartInteraction.getValue();
                    if (value != null) {
                        MutableInteractionSource mutableInteractionSource = this.interactionSource;
                        if (mutableInteractionSource != null) {
                            DragInteraction.Cancel cancel = new DragInteraction.Cancel(value);
                            dragLogic$processDragCancel$1.L$0 = this;
                            dragLogic$processDragCancel$1.L$1 = coroutineScope;
                            dragLogic$processDragCancel$1.label = 1;
                            if (mutableInteractionSource.emit(cancel, dragLogic$processDragCancel$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        dragLogic = this;
                    } else {
                        dragLogic = this;
                        function3 = dragLogic.onDragStopped;
                        boxFloat = Boxing.boxFloat(0.0f);
                        dragLogic$processDragCancel$1.L$0 = null;
                        dragLogic$processDragCancel$1.L$1 = null;
                        dragLogic$processDragCancel$1.label = 2;
                        if (function3.invoke(coroutineScope, boxFloat, dragLogic$processDragCancel$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    coroutineScope = (CoroutineScope) dragLogic$processDragCancel$1.L$1;
                    dragLogic = (DragLogic) dragLogic$processDragCancel$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                dragLogic.dragStartInteraction.setValue(null);
                function3 = dragLogic.onDragStopped;
                boxFloat = Boxing.boxFloat(0.0f);
                dragLogic$processDragCancel$1.L$0 = null;
                dragLogic$processDragCancel$1.L$1 = null;
                dragLogic$processDragCancel$1.label = 2;
                if (function3.invoke(coroutineScope, boxFloat, dragLogic$processDragCancel$1) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
        }
        dragLogic$processDragCancel$1 = new DragLogic$processDragCancel$1(this, continuation);
        Object obj2 = dragLogic$processDragCancel$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragLogic$processDragCancel$1.label;
        if (i != 0) {
        }
        dragLogic.dragStartInteraction.setValue(null);
        function3 = dragLogic.onDragStopped;
        boxFloat = Boxing.boxFloat(0.0f);
        dragLogic$processDragCancel$1.L$0 = null;
        dragLogic$processDragCancel$1.L$1 = null;
        dragLogic$processDragCancel$1.label = 2;
        if (function3.invoke(coroutineScope, boxFloat, dragLogic$processDragCancel$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }
}
