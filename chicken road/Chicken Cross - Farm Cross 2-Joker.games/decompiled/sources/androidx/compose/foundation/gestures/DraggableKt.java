package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Velocity;
import androidx.constraintlayout.solver.widgets.Optimizer;
import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.SendChannel;

/* compiled from: Draggable.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u001a!\u0010\u0006\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0007¢\u0006\u0002\u0010\u0007\u001aa\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t*\u00020\u000b2\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\u00030\r2\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00100\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001aO\u0010\u0016\u001a\u00020\u000e*\u00020\u000b2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001aô\u0001\u0010\u001d\u001a\u00020\u001e*\u00020\u001e2\u0011\u0010\u001f\u001a\r\u0012\u0004\u0012\u00020 0\u0010¢\u0006\u0002\b!2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\"\u001a\u00020\u000e2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102>\b\u0002\u0010%\u001a8\b\u0001\u0012\u0004\u0012\u00020'\u0012\u0013\u0012\u00110(¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050,\u0012\u0006\u0012\u0004\u0018\u00010-0&¢\u0006\u0002\b.2>\b\u0002\u0010/\u001a8\b\u0001\u0012\u0004\u0012\u00020'\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(0\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050,\u0012\u0006\u0012\u0004\u0018\u00010-0&¢\u0006\u0002\b.2\b\b\u0002\u0010\u001b\u001a\u00020\u000eH\u0000ø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u00101\u001aÏ\u0001\u0010\u001d\u001a\u00020\u001e*\u00020\u001e2\u0006\u00102\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\"\u001a\u00020\u000e2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2>\b\u0002\u0010%\u001a8\b\u0001\u0012\u0004\u0012\u00020'\u0012\u0013\u0012\u00110(¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050,\u0012\u0006\u0012\u0004\u0018\u00010-0&¢\u0006\u0002\b.2>\b\u0002\u0010/\u001a8\b\u0001\u0012\u0004\u0012\u00020'\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(0\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050,\u0012\u0006\u0012\u0004\u0018\u00010-0&¢\u0006\u0002\b.2\b\b\u0002\u0010\u001b\u001a\u00020\u000eø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u00103\u001a!\u00104\u001a\u00020\u0004*\u00020(2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00106\u001a!\u00104\u001a\u00020\u0004*\u0002072\u0006\u0010\u0013\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b8\u00106\u001a\u001c\u00109\u001a\u00020(*\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0002ø\u0001\u0000¢\u0006\u0002\u0010:\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006;"}, d2 = {"DraggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "onDelta", "Lkotlin/Function1;", "", "", "rememberDraggableState", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/DraggableState;", "awaitDownAndSlop", "Lkotlin/Pair;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "canDrag", "Landroidx/compose/runtime/State;", "", "startDragImmediately", "Lkotlin/Function0;", "velocityTracker", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", U3.i.n, "Landroidx/compose/foundation/gestures/Orientation;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitDrag", "dragStart", "channel", "Lkotlinx/coroutines/channels/SendChannel;", "Landroidx/compose/foundation/gestures/DragEvent;", "reverseDirection", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/Pair;Landroidx/compose/ui/input/pointer/util/VelocityTracker;Lkotlinx/coroutines/channels/SendChannel;ZLandroidx/compose/foundation/gestures/Orientation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "draggable", "Landroidx/compose/ui/Modifier;", "stateFactory", "Landroidx/compose/foundation/gestures/PointerAwareDraggableState;", "Landroidx/compose/runtime/Composable;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "onDragStarted", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "name", "startedPosition", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "onDragStopped", "velocity", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)Landroidx/compose/ui/Modifier;", "state", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)Landroidx/compose/ui/Modifier;", "toFloat", "toFloat-3MmeM6k", "(JLandroidx/compose/foundation/gestures/Orientation;)F", "Landroidx/compose/ui/unit/Velocity;", "toFloat-sF-c-tU", "toOffset", "(FLandroidx/compose/foundation/gestures/Orientation;)J", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DraggableKt {
    public static final DraggableState DraggableState(Function1<? super Float, Unit> onDelta) {
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        return new DefaultDraggableState(onDelta);
    }

    public static final DraggableState rememberDraggableState(Function1<? super Float, Unit> onDelta, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        composer.startReplaceableGroup(-183245213);
        ComposerKt.sourceInformation(composer, "C(rememberDraggableState)136@5769L29,137@5810L61:Draggable.kt#8bwon0");
        final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onDelta, composer, i & 14);
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = DraggableState(new Function1<Float, Unit>() { // from class: androidx.compose.foundation.gestures.DraggableKt$rememberDraggableState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                    invoke(f.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(float f) {
                    rememberUpdatedState.getValue().invoke(Float.valueOf(f));
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DraggableState draggableState = (DraggableState) rememberedValue;
        composer.endReplaceableGroup();
        return draggableState;
    }

    public static final Modifier draggable(Modifier modifier, final DraggableState state, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, final boolean z2, Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> onDragStarted, Function3<? super CoroutineScope, ? super Float, ? super Continuation<? super Unit>, ? extends Object> onDragStopped, boolean z3) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(onDragStarted, "onDragStarted");
        Intrinsics.checkNotNullParameter(onDragStopped, "onDragStopped");
        return draggable(modifier, new Function2<Composer, Integer, PointerAwareDraggableState>() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$3
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ PointerAwareDraggableState invoke(Composer composer, Integer num) {
                return invoke(composer, num.intValue());
            }

            public final PointerAwareDraggableState invoke(Composer composer, int i) {
                composer.startReplaceableGroup(830271906);
                ComposerKt.sourceInformation(composer, "C183@8441L54:Draggable.kt#8bwon0");
                DraggableState draggableState = DraggableState.this;
                composer.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composer, "C(remember)P(1):Composables.kt#9igjgp");
                boolean changed = composer.changed(draggableState);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new IgnorePointerDraggableState(draggableState);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                return (IgnorePointerDraggableState) rememberedValue;
            }
        }, new Function1<PointerInputChange, Boolean>() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$4
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(PointerInputChange it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return true;
            }
        }, orientation, z, mutableInteractionSource, new Function0<Boolean>() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(z2);
            }
        }, onDragStarted, onDragStopped, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitDownAndSlop(AwaitPointerEventScope awaitPointerEventScope, State<? extends Function1<? super PointerInputChange, Boolean>> state, State<? extends Function0<Boolean>> state2, VelocityTracker velocityTracker, Orientation orientation, Continuation<? super Pair<PointerInputChange, Float>> continuation) {
        DraggableKt$awaitDownAndSlop$1 draggableKt$awaitDownAndSlop$1;
        int i;
        PointerInputChange pointerInputChange;
        AwaitPointerEventScope awaitPointerEventScope2;
        final VelocityTracker velocityTracker2;
        Orientation orientation2;
        Ref.FloatRef floatRef;
        PointerInputChange pointerInputChange2;
        if (continuation instanceof DraggableKt$awaitDownAndSlop$1) {
            draggableKt$awaitDownAndSlop$1 = (DraggableKt$awaitDownAndSlop$1) continuation;
            if ((draggableKt$awaitDownAndSlop$1.label & Integer.MIN_VALUE) != 0) {
                draggableKt$awaitDownAndSlop$1.label -= Integer.MIN_VALUE;
                DraggableKt$awaitDownAndSlop$1 draggableKt$awaitDownAndSlop$12 = draggableKt$awaitDownAndSlop$1;
                Object obj = draggableKt$awaitDownAndSlop$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = draggableKt$awaitDownAndSlop$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    PointerEventPass pointerEventPass = PointerEventPass.Initial;
                    draggableKt$awaitDownAndSlop$12.L$0 = awaitPointerEventScope;
                    draggableKt$awaitDownAndSlop$12.L$1 = state;
                    draggableKt$awaitDownAndSlop$12.L$2 = state2;
                    draggableKt$awaitDownAndSlop$12.L$3 = velocityTracker;
                    draggableKt$awaitDownAndSlop$12.L$4 = orientation;
                    draggableKt$awaitDownAndSlop$12.label = 1;
                    obj = TapGestureDetectorKt.awaitFirstDownOnPass(awaitPointerEventScope, pointerEventPass, false, draggableKt$awaitDownAndSlop$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 1) {
                    orientation = (Orientation) draggableKt$awaitDownAndSlop$12.L$4;
                    velocityTracker = (VelocityTracker) draggableKt$awaitDownAndSlop$12.L$3;
                    state2 = (State) draggableKt$awaitDownAndSlop$12.L$2;
                    state = (State) draggableKt$awaitDownAndSlop$12.L$1;
                    awaitPointerEventScope = (AwaitPointerEventScope) draggableKt$awaitDownAndSlop$12.L$0;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    orientation2 = (Orientation) draggableKt$awaitDownAndSlop$12.L$2;
                    velocityTracker2 = (VelocityTracker) draggableKt$awaitDownAndSlop$12.L$1;
                    awaitPointerEventScope2 = (AwaitPointerEventScope) draggableKt$awaitDownAndSlop$12.L$0;
                    ResultKt.throwOnFailure(obj);
                    PointerInputChange pointerInputChange3 = (PointerInputChange) obj;
                    VelocityTrackerKt.addPointerInputChange(velocityTracker2, pointerInputChange3);
                    final Ref.FloatRef floatRef2 = new Ref.FloatRef();
                    Function2<PointerInputChange, Float, Unit> function2 = new Function2<PointerInputChange, Float, Unit>() { // from class: androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$postPointerSlop$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange4, Float f) {
                            invoke(pointerInputChange4, f.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PointerInputChange event, float f) {
                            Intrinsics.checkNotNullParameter(event, "event");
                            VelocityTrackerKt.addPointerInputChange(VelocityTracker.this, event);
                            event.consume();
                            floatRef2.element = f;
                        }
                    };
                    if (orientation2 != Orientation.Vertical) {
                        long id = pointerInputChange3.getId();
                        int type = pointerInputChange3.getType();
                        draggableKt$awaitDownAndSlop$12.L$0 = floatRef2;
                        draggableKt$awaitDownAndSlop$12.L$1 = null;
                        draggableKt$awaitDownAndSlop$12.L$2 = null;
                        draggableKt$awaitDownAndSlop$12.label = 3;
                        obj = DragGestureDetectorKt.m262awaitVerticalPointerSlopOrCancellationgDDlDlE(awaitPointerEventScope2, id, type, function2, draggableKt$awaitDownAndSlop$12);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        floatRef = floatRef2;
                        pointerInputChange2 = (PointerInputChange) obj;
                        if (pointerInputChange2 == null) {
                        }
                    } else {
                        long id2 = pointerInputChange3.getId();
                        int type2 = pointerInputChange3.getType();
                        draggableKt$awaitDownAndSlop$12.L$0 = floatRef2;
                        draggableKt$awaitDownAndSlop$12.L$1 = null;
                        draggableKt$awaitDownAndSlop$12.L$2 = null;
                        draggableKt$awaitDownAndSlop$12.label = 4;
                        obj = DragGestureDetectorKt.m256awaitHorizontalPointerSlopOrCancellationgDDlDlE(awaitPointerEventScope2, id2, type2, function2, draggableKt$awaitDownAndSlop$12);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        floatRef = floatRef2;
                        pointerInputChange2 = (PointerInputChange) obj;
                        if (pointerInputChange2 == null) {
                        }
                    }
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        floatRef = (Ref.FloatRef) draggableKt$awaitDownAndSlop$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        pointerInputChange2 = (PointerInputChange) obj;
                        if (pointerInputChange2 == null) {
                            return TuplesKt.to(pointerInputChange2, Boxing.boxFloat(floatRef.element));
                        }
                        return null;
                    }
                    floatRef = (Ref.FloatRef) draggableKt$awaitDownAndSlop$12.L$0;
                    ResultKt.throwOnFailure(obj);
                    pointerInputChange2 = (PointerInputChange) obj;
                    if (pointerInputChange2 == null) {
                    }
                }
                pointerInputChange = (PointerInputChange) obj;
                if (state.getValue().invoke(pointerInputChange).booleanValue()) {
                    return null;
                }
                if (state2.getValue().invoke().booleanValue()) {
                    pointerInputChange.consume();
                    VelocityTrackerKt.addPointerInputChange(velocityTracker, pointerInputChange);
                    return TuplesKt.to(pointerInputChange, Boxing.boxFloat(0.0f));
                }
                draggableKt$awaitDownAndSlop$12.L$0 = awaitPointerEventScope;
                draggableKt$awaitDownAndSlop$12.L$1 = velocityTracker;
                draggableKt$awaitDownAndSlop$12.L$2 = orientation;
                draggableKt$awaitDownAndSlop$12.L$3 = null;
                draggableKt$awaitDownAndSlop$12.L$4 = null;
                draggableKt$awaitDownAndSlop$12.label = 2;
                obj = TapGestureDetectorKt.awaitFirstDown(awaitPointerEventScope, false, draggableKt$awaitDownAndSlop$12);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                awaitPointerEventScope2 = awaitPointerEventScope;
                velocityTracker2 = velocityTracker;
                orientation2 = orientation;
                PointerInputChange pointerInputChange32 = (PointerInputChange) obj;
                VelocityTrackerKt.addPointerInputChange(velocityTracker2, pointerInputChange32);
                final Ref.FloatRef floatRef22 = new Ref.FloatRef();
                Function2<PointerInputChange, Float, Unit> function22 = new Function2<PointerInputChange, Float, Unit>() { // from class: androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$postPointerSlop$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange4, Float f) {
                        invoke(pointerInputChange4, f.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PointerInputChange event, float f) {
                        Intrinsics.checkNotNullParameter(event, "event");
                        VelocityTrackerKt.addPointerInputChange(VelocityTracker.this, event);
                        event.consume();
                        floatRef22.element = f;
                    }
                };
                if (orientation2 != Orientation.Vertical) {
                }
            }
        }
        draggableKt$awaitDownAndSlop$1 = new DraggableKt$awaitDownAndSlop$1(continuation);
        DraggableKt$awaitDownAndSlop$1 draggableKt$awaitDownAndSlop$122 = draggableKt$awaitDownAndSlop$1;
        Object obj2 = draggableKt$awaitDownAndSlop$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = draggableKt$awaitDownAndSlop$122.label;
        if (i != 0) {
        }
        pointerInputChange = (PointerInputChange) obj2;
        if (state.getValue().invoke(pointerInputChange).booleanValue()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object awaitDrag(AwaitPointerEventScope awaitPointerEventScope, Pair<PointerInputChange, Float> pair, final VelocityTracker velocityTracker, final SendChannel<? super DragEvent> sendChannel, final boolean z, final Orientation orientation, Continuation<? super Boolean> continuation) {
        float floatValue = pair.getSecond().floatValue();
        PointerInputChange first = pair.getFirst();
        long m1396minusMKHz9U = Offset.m1396minusMKHz9U(first.getPosition(), Offset.m1399timestuRUvjQ(toOffset(floatValue, orientation), Math.signum(m277toFloat3MmeM6k(first.getPosition(), orientation))));
        sendChannel.mo7997trySendJP2dKIU(new DragEvent.DragStarted(m1396minusMKHz9U, null));
        if (z) {
            floatValue *= -1;
        }
        sendChannel.mo7997trySendJP2dKIU(new DragEvent.DragDelta(floatValue, m1396minusMKHz9U, null));
        Function1<PointerInputChange, Unit> function1 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.gestures.DraggableKt$awaitDrag$dragTick$1
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
            public final void invoke2(PointerInputChange event) {
                float m277toFloat3MmeM6k;
                Intrinsics.checkNotNullParameter(event, "event");
                VelocityTrackerKt.addPointerInputChange(VelocityTracker.this, event);
                m277toFloat3MmeM6k = DraggableKt.m277toFloat3MmeM6k(PointerEventKt.positionChange(event), orientation);
                event.consume();
                SendChannel<DragEvent> sendChannel2 = sendChannel;
                if (z) {
                    m277toFloat3MmeM6k *= -1;
                }
                sendChannel2.mo7997trySendJP2dKIU(new DragEvent.DragDelta(m277toFloat3MmeM6k, event.getPosition(), null));
            }
        };
        if (orientation == Orientation.Vertical) {
            return DragGestureDetectorKt.m269verticalDragjO51t88(awaitPointerEventScope, first.getId(), function1, continuation);
        }
        return DragGestureDetectorKt.m266horizontalDragjO51t88(awaitPointerEventScope, first.getId(), function1, continuation);
    }

    private static final long toOffset(float f, Orientation orientation) {
        return orientation == Orientation.Vertical ? OffsetKt.Offset(0.0f, f) : OffsetKt.Offset(f, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-3MmeM6k, reason: not valid java name */
    public static final float m277toFloat3MmeM6k(long j, Orientation orientation) {
        return orientation == Orientation.Vertical ? Offset.m1393getYimpl(j) : Offset.m1392getXimpl(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-sF-c-tU, reason: not valid java name */
    public static final float m278toFloatsFctU(long j, Orientation orientation) {
        return orientation == Orientation.Vertical ? Velocity.m4066getYimpl(j) : Velocity.m4065getXimpl(j);
    }

    public static final Modifier draggable(Modifier modifier, final Function2<? super Composer, ? super Integer, ? extends PointerAwareDraggableState> stateFactory, final Function1<? super PointerInputChange, Boolean> canDrag, final Orientation orientation, final boolean z, final MutableInteractionSource mutableInteractionSource, final Function0<Boolean> startDragImmediately, final Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> onDragStarted, final Function3<? super CoroutineScope, ? super Float, ? super Continuation<? super Unit>, ? extends Object> onDragStopped, final boolean z2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(stateFactory, "stateFactory");
        Intrinsics.checkNotNullParameter(canDrag, "canDrag");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(startDragImmediately, "startDragImmediately");
        Intrinsics.checkNotNullParameter(onDragStarted, "onDragStarted");
        Intrinsics.checkNotNullParameter(onDragStopped, "onDragStopped");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("draggable");
                inspectorInfo.getProperties().set("canDrag", Function1.this);
                inspectorInfo.getProperties().set(U3.i.n, orientation);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("reverseDirection", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("startDragImmediately", startDragImmediately);
                inspectorInfo.getProperties().set("onDragStarted", onDragStarted);
                inspectorInfo.getProperties().set("onDragStopped", onDragStopped);
                inspectorInfo.getProperties().set("stateFactory", stateFactory);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-1487259950);
                ComposerKt.sourceInformation(composer, "C218@9877L8,219@9915L57,220@9977L274,228@10270L61,229@10364L42,230@10430L29,231@10481L114,234@10600L1017:Draggable.kt#8bwon0");
                PointerAwareDraggableState invoke = stateFactory.invoke(composer, 0);
                composer.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
                Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                final MutableState mutableState = (MutableState) rememberedValue;
                MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                EffectsKt.DisposableEffect(mutableInteractionSource2, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$9.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final MutableState<DragInteraction.Start> mutableState2 = mutableState;
                        final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$9$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                DragInteraction.Start start = (DragInteraction.Start) MutableState.this.getValue();
                                if (start != null) {
                                    MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                    if (mutableInteractionSource5 != null) {
                                        mutableInteractionSource5.tryEmit(new DragInteraction.Cancel(start));
                                    }
                                    MutableState.this.setValue(null);
                                }
                            }
                        };
                    }
                }, composer, 0);
                composer.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
                Object rememberedValue2 = composer.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceableGroup();
                Channel channel = (Channel) rememberedValue2;
                State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(startDragImmediately, composer, 0);
                State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(canDrag, composer, 0);
                EffectsKt.LaunchedEffect(invoke, new AnonymousClass2(channel, invoke, SnapshotStateKt.rememberUpdatedState(new DragLogic(onDragStarted, onDragStopped, mutableState, mutableInteractionSource), composer, 0), null), composer, 0);
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput((Modifier) Modifier.INSTANCE, new Object[]{orientation, Boolean.valueOf(z), Boolean.valueOf(z2)}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new AnonymousClass3(z, rememberUpdatedState2, rememberUpdatedState, orientation, channel, z2, null));
                composer.endReplaceableGroup();
                return pointerInput;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: invoke$lambda-2, reason: not valid java name */
            public static final DragLogic m282invoke$lambda2(State<DragLogic> state) {
                return state.getValue();
            }

            /* compiled from: Draggable.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3", f = "Draggable.kt", i = {}, l = {Optimizer.OPTIMIZATION_STANDARD}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$3, reason: invalid class name */
            static final class AnonymousClass3 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ State<Function1<PointerInputChange, Boolean>> $canDragState;
                final /* synthetic */ Channel<DragEvent> $channel;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ Orientation $orientation;
                final /* synthetic */ boolean $reverseDirection;
                final /* synthetic */ State<Function0<Boolean>> $startImmediatelyState;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass3(boolean z, State<? extends Function1<? super PointerInputChange, Boolean>> state, State<? extends Function0<Boolean>> state2, Orientation orientation, Channel<DragEvent> channel, boolean z2, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.$enabled = z;
                    this.$canDragState = state;
                    this.$startImmediatelyState = state2;
                    this.$orientation = orientation;
                    this.$channel = channel;
                    this.$reverseDirection = z2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$enabled, this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: Draggable.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1", f = "Draggable.kt", i = {0}, l = {265}, m = "invokeSuspend", n = {"$this$coroutineScope"}, s = {"L$0"})
                /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ PointerInputScope $$this$pointerInput;
                    final /* synthetic */ State<Function1<PointerInputChange, Boolean>> $canDragState;
                    final /* synthetic */ Channel<DragEvent> $channel;
                    final /* synthetic */ Orientation $orientation;
                    final /* synthetic */ boolean $reverseDirection;
                    final /* synthetic */ State<Function0<Boolean>> $startImmediatelyState;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(PointerInputScope pointerInputScope, State<? extends Function1<? super PointerInputChange, Boolean>> state, State<? extends Function0<Boolean>> state2, Orientation orientation, Channel<DragEvent> channel, boolean z, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$$this$pointerInput = pointerInputScope;
                        this.$canDragState = state;
                        this.$startImmediatelyState = state2;
                        this.$orientation = orientation;
                        this.$channel = channel;
                        this.$reverseDirection = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$pointerInput, this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* compiled from: Draggable.kt */
                    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1", f = "Draggable.kt", i = {0, 0, 1, 1, 1}, l = {268, 276}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "velocityTracker", "$this$awaitPointerEventScope", "velocityTracker", "isDragSuccessful"}, s = {"L$0", "L$1", "L$0", "L$1", "I$0"})
                    /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C00111 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ CoroutineScope $$this$coroutineScope;
                        final /* synthetic */ State<Function1<PointerInputChange, Boolean>> $canDragState;
                        final /* synthetic */ Channel<DragEvent> $channel;
                        final /* synthetic */ Orientation $orientation;
                        final /* synthetic */ boolean $reverseDirection;
                        final /* synthetic */ State<Function0<Boolean>> $startImmediatelyState;
                        int I$0;
                        private /* synthetic */ Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        Object L$4;
                        boolean Z$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        C00111(CoroutineScope coroutineScope, State<? extends Function1<? super PointerInputChange, Boolean>> state, State<? extends Function0<Boolean>> state2, Orientation orientation, Channel<DragEvent> channel, boolean z, Continuation<? super C00111> continuation) {
                            super(2, continuation);
                            this.$$this$coroutineScope = coroutineScope;
                            this.$canDragState = state;
                            this.$startImmediatelyState = state2;
                            this.$orientation = orientation;
                            this.$channel = channel;
                            this.$reverseDirection = z;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C00111 c00111 = new C00111(this.$$this$coroutineScope, this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, continuation);
                            c00111.L$0 = obj;
                            return c00111;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                            return ((C00111) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        /* JADX WARN: Can't wrap try/catch for region: R(7:26|(1:27)|28|29|30|31|(1:33)(7:34|9|(0)(0)|15|16|17|(2:61|62)(0))) */
                        /* JADX WARN: Code restructure failed: missing block: B:36:0x00f6, code lost:
                        
                            r0 = e;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:37:0x0110, code lost:
                        
                            r7 = r14;
                            r6 = r15;
                            r3 = r16;
                            r4 = r17;
                            r2 = r18;
                            r5 = r19;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:41:0x0120, code lost:
                        
                            r5.mo7997trySendJP2dKIU(androidx.compose.foundation.gestures.DragEvent.DragCancelled.INSTANCE);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:42:0x012a, code lost:
                        
                            throw r0;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:53:0x00f4, code lost:
                        
                            r0 = th;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:54:0x00ff, code lost:
                        
                            r6 = r15;
                            r4 = r17;
                            r2 = r18;
                            r5 = r19;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:11:0x00d4  */
                        /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
                        /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
                        /* JADX WARN: Removed duplicated region for block: B:41:0x0120  */
                        /* JADX WARN: Removed duplicated region for block: B:42:0x012a A[Catch: all -> 0x012b, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x012b, blocks: (B:39:0x011a, B:42:0x012a), top: B:38:0x011a }] */
                        /* JADX WARN: Removed duplicated region for block: B:46:0x012e  */
                        /* JADX WARN: Removed duplicated region for block: B:52:0x0144  */
                        /* JADX WARN: Removed duplicated region for block: B:60:0x014d  */
                        /* JADX WARN: Removed duplicated region for block: B:61:0x0150  */
                        /* JADX WARN: Removed duplicated region for block: B:64:0x00eb  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00c1 -> B:9:0x00cc). Please report as a decompilation issue!!! */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0120 -> B:16:0x0127). Please report as a decompilation issue!!! */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x014d -> B:17:0x005c). Please report as a decompilation issue!!! */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invokeSuspend(Object obj) {
                            AwaitPointerEventScope awaitPointerEventScope;
                            DragEvent.DragCancelled dragCancelled;
                            float m278toFloatsFctU;
                            VelocityTracker velocityTracker;
                            AwaitPointerEventScope awaitPointerEventScope2;
                            Object obj2;
                            Pair pair;
                            Orientation orientation;
                            boolean z;
                            Channel<DragEvent> channel;
                            CoroutineScope coroutineScope;
                            Object awaitDrag;
                            DragEvent.DragCancelled dragCancelled2;
                            float m278toFloatsFctU2;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            int i2 = 0;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                                if (CoroutineScopeKt.isActive(this.$$this$coroutineScope)) {
                                }
                            } else if (i == 1) {
                                VelocityTracker velocityTracker2 = (VelocityTracker) this.L$1;
                                AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                                ResultKt.throwOnFailure(obj);
                                velocityTracker = velocityTracker2;
                                awaitPointerEventScope2 = awaitPointerEventScope3;
                                obj2 = obj;
                                pair = (Pair) obj2;
                                if (pair != null) {
                                }
                            } else if (i == 2) {
                                int i3 = this.I$0;
                                boolean z2 = this.Z$0;
                                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$4;
                                Orientation orientation2 = (Orientation) this.L$3;
                                Channel<DragEvent> channel2 = (Channel) this.L$2;
                                VelocityTracker velocityTracker3 = (VelocityTracker) this.L$1;
                                AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) this.L$0;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    awaitDrag = obj;
                                } catch (CancellationException e) {
                                    e = e;
                                    try {
                                        if (!CoroutineScopeKt.isActive(coroutineScope2)) {
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        if (i2 != 0) {
                                            m278toFloatsFctU = DraggableKt.m278toFloatsFctU(velocityTracker3.m3097calculateVelocity9UxMQ8M(), orientation2);
                                            dragCancelled = new DragEvent.DragStopped(m278toFloatsFctU * (z2 ? -1 : 1));
                                        } else {
                                            dragCancelled = DragEvent.DragCancelled.INSTANCE;
                                        }
                                        channel2.mo7997trySendJP2dKIU(dragCancelled);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    i2 = i3;
                                    if (i2 != 0) {
                                    }
                                    channel2.mo7997trySendJP2dKIU(dragCancelled);
                                    throw th;
                                }
                                if (!((Boolean) awaitDrag).booleanValue()) {
                                    m278toFloatsFctU2 = DraggableKt.m278toFloatsFctU(velocityTracker3.m3097calculateVelocity9UxMQ8M(), orientation2);
                                    dragCancelled2 = new DragEvent.DragStopped(m278toFloatsFctU2 * (z2 ? -1 : 1));
                                } else {
                                    dragCancelled2 = DragEvent.DragCancelled.INSTANCE;
                                }
                                channel2.mo7997trySendJP2dKIU(dragCancelled2);
                                awaitPointerEventScope = awaitPointerEventScope4;
                                if (CoroutineScopeKt.isActive(this.$$this$coroutineScope)) {
                                    VelocityTracker velocityTracker4 = new VelocityTracker();
                                    this.L$0 = awaitPointerEventScope;
                                    this.L$1 = velocityTracker4;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.label = 1;
                                    obj2 = DraggableKt.awaitDownAndSlop(awaitPointerEventScope, this.$canDragState, this.$startImmediatelyState, velocityTracker4, this.$orientation, this);
                                    if (obj2 == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    awaitPointerEventScope2 = awaitPointerEventScope;
                                    velocityTracker = velocityTracker4;
                                    pair = (Pair) obj2;
                                    if (pair != null) {
                                        awaitPointerEventScope = awaitPointerEventScope2;
                                        if (CoroutineScopeKt.isActive(this.$$this$coroutineScope)) {
                                        }
                                    } else {
                                        Channel<DragEvent> channel3 = this.$channel;
                                        boolean z3 = this.$reverseDirection;
                                        Orientation orientation3 = this.$orientation;
                                        CoroutineScope coroutineScope3 = this.$$this$coroutineScope;
                                        try {
                                        } catch (CancellationException e2) {
                                            e = e2;
                                            coroutineScope = coroutineScope3;
                                            orientation = orientation3;
                                            z = z3;
                                            channel = channel3;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            orientation = orientation3;
                                            z = z3;
                                            channel = channel3;
                                        }
                                        Channel<DragEvent> channel4 = channel3;
                                        this.L$0 = awaitPointerEventScope2;
                                        this.L$1 = velocityTracker;
                                        this.L$2 = channel3;
                                        this.L$3 = orientation3;
                                        this.L$4 = coroutineScope3;
                                        this.Z$0 = z3;
                                        this.I$0 = 0;
                                        this.label = 2;
                                        coroutineScope = coroutineScope3;
                                        orientation = orientation3;
                                        z = z3;
                                        channel = channel3;
                                        awaitDrag = DraggableKt.awaitDrag(awaitPointerEventScope2, pair, velocityTracker, channel4, z3, orientation, this);
                                        if (awaitDrag == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        i3 = 0;
                                        awaitPointerEventScope4 = awaitPointerEventScope2;
                                        velocityTracker3 = velocityTracker;
                                        coroutineScope2 = coroutineScope;
                                        orientation2 = orientation;
                                        z2 = z;
                                        channel2 = channel;
                                        if (!((Boolean) awaitDrag).booleanValue()) {
                                        }
                                        channel2.mo7997trySendJP2dKIU(dragCancelled2);
                                        awaitPointerEventScope = awaitPointerEventScope4;
                                        if (CoroutineScopeKt.isActive(this.$$this$coroutineScope)) {
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invokeSuspend(Object obj) {
                        CoroutineScope coroutineScope;
                        CancellationException e;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                            try {
                                this.L$0 = coroutineScope2;
                                this.label = 1;
                                if (this.$$this$pointerInput.awaitPointerEventScope(new C00111(coroutineScope2, this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, null), this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } catch (CancellationException e2) {
                                coroutineScope = coroutineScope2;
                                e = e2;
                                if (!CoroutineScopeKt.isActive(coroutineScope)) {
                                    throw e;
                                }
                                return Unit.INSTANCE;
                            }
                        } else if (i == 1) {
                            coroutineScope = (CoroutineScope) this.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                            } catch (CancellationException e3) {
                                e = e3;
                                if (!CoroutineScopeKt.isActive(coroutineScope)) {
                                }
                                return Unit.INSTANCE;
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
                        PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                        if (!this.$enabled) {
                            return Unit.INSTANCE;
                        }
                        this.label = 1;
                        if (CoroutineScopeKt.coroutineScope(new AnonymousClass1(pointerInputScope, this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, null), this) == coroutine_suspended) {
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

            /* compiled from: Draggable.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2", f = "Draggable.kt", i = {0, 0, 1, 1, 2, 2, 3, 4, 5}, l = {237, 239, 241, 251, 253, 257}, m = "invokeSuspend", n = {"$this$LaunchedEffect", NotificationCompat.CATEGORY_EVENT, "$this$LaunchedEffect", NotificationCompat.CATEGORY_EVENT, "$this$LaunchedEffect", NotificationCompat.CATEGORY_EVENT, "$this$LaunchedEffect", "$this$LaunchedEffect", "$this$LaunchedEffect"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0"})
            /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$2, reason: invalid class name */
            static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Channel<DragEvent> $channel;
                final /* synthetic */ State<DragLogic> $dragLogic$delegate;
                final /* synthetic */ PointerAwareDraggableState $state;
                private /* synthetic */ Object L$0;
                Object L$1;
                Object L$2;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(Channel<DragEvent> channel, PointerAwareDraggableState pointerAwareDraggableState, State<DragLogic> state, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$channel = channel;
                    this.$state = pointerAwareDraggableState;
                    this.$dragLogic$delegate = state;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$channel, this.$state, this.$dragLogic$delegate, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: Draggable.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2$2", f = "Draggable.kt", i = {0}, l = {246}, m = "invokeSuspend", n = {"$this$drag"}, s = {"L$0"})
                /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$2$2, reason: invalid class name and collision with other inner class name */
                static final class C00102 extends SuspendLambda implements Function2<PointerAwareDragScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ Channel<DragEvent> $channel;
                    final /* synthetic */ Ref.ObjectRef<DragEvent> $event;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00102(Ref.ObjectRef<DragEvent> objectRef, Channel<DragEvent> channel, Continuation<? super C00102> continuation) {
                        super(2, continuation);
                        this.$event = objectRef;
                        this.$channel = channel;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C00102 c00102 = new C00102(this.$event, this.$channel, continuation);
                        c00102.L$0 = obj;
                        return c00102;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(PointerAwareDragScope pointerAwareDragScope, Continuation<? super Unit> continuation) {
                        return ((C00102) create(pointerAwareDragScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0061 -> B:5:0x0064). Please report as a decompilation issue!!! */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invokeSuspend(Object obj) {
                        PointerAwareDragScope pointerAwareDragScope;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            pointerAwareDragScope = (PointerAwareDragScope) this.L$0;
                            if (this.$event.element instanceof DragEvent.DragStopped) {
                            }
                            return Unit.INSTANCE;
                        }
                        if (i == 1) {
                            Ref.ObjectRef<DragEvent> objectRef = (Ref.ObjectRef) this.L$1;
                            pointerAwareDragScope = (PointerAwareDragScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            T t = obj;
                            objectRef.element = t;
                            if ((this.$event.element instanceof DragEvent.DragStopped) && !(this.$event.element instanceof DragEvent.DragCancelled)) {
                                DragEvent dragEvent = this.$event.element;
                                DragEvent.DragDelta dragDelta = dragEvent instanceof DragEvent.DragDelta ? (DragEvent.DragDelta) dragEvent : null;
                                if (dragDelta != null) {
                                    pointerAwareDragScope.mo283dragByUv8p0NA(dragDelta.getDelta(), dragDelta.getPointerPosition());
                                }
                                objectRef = this.$event;
                                this.L$0 = pointerAwareDragScope;
                                this.L$1 = objectRef;
                                this.label = 1;
                                Object receive = this.$channel.receive(this);
                                t = receive;
                                if (receive == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                objectRef.element = t;
                                if (this.$event.element instanceof DragEvent.DragStopped) {
                                }
                                return Unit.INSTANCE;
                            }
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:34:0x00e0, code lost:
                
                    r1 = r3;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0062  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x00c0 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:25:0x00cd A[Catch: CancellationException -> 0x0036, TryCatch #1 {CancellationException -> 0x0036, blocks: (B:20:0x00a3, B:23:0x00c1, B:25:0x00cd, B:29:0x00e3, B:31:0x00e9, B:52:0x0031), top: B:51:0x0031 }] */
                /* JADX WARN: Removed duplicated region for block: B:29:0x00e3 A[Catch: CancellationException -> 0x0036, TryCatch #1 {CancellationException -> 0x0036, blocks: (B:20:0x00a3, B:23:0x00c1, B:25:0x00cd, B:29:0x00e3, B:31:0x00e9, B:52:0x0031), top: B:51:0x0031 }] */
                /* JADX WARN: Removed duplicated region for block: B:40:0x010d A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:41:0x010e  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x0111  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00f7 -> B:8:0x005c). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x010b -> B:7:0x00e0). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x010e -> B:8:0x005c). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    CoroutineScope coroutineScope;
                    Ref.ObjectRef objectRef;
                    Ref.ObjectRef objectRef2;
                    CoroutineScope coroutineScope2;
                    Ref.ObjectRef objectRef3;
                    CoroutineScope coroutineScope3;
                    CoroutineScope coroutineScope4;
                    DragLogic m282invoke$lambda2;
                    T t;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch (this.label) {
                        case 0:
                            ResultKt.throwOnFailure(obj);
                            coroutineScope = (CoroutineScope) this.L$0;
                            if (CoroutineScopeKt.isActive(coroutineScope)) {
                                objectRef = new Ref.ObjectRef();
                                this.L$0 = coroutineScope;
                                this.L$1 = objectRef;
                                this.L$2 = objectRef;
                                this.label = 1;
                                Object receive = this.$channel.receive(this);
                                if (receive == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                coroutineScope2 = coroutineScope;
                                t = receive;
                                objectRef2 = objectRef;
                                objectRef.element = t;
                                if (!(objectRef2.element instanceof DragEvent.DragStarted)) {
                                    DragLogic m282invoke$lambda22 = DraggableKt$draggable$9.m282invoke$lambda2(this.$dragLogic$delegate);
                                    DragEvent.DragStarted dragStarted = (DragEvent.DragStarted) objectRef2.element;
                                    this.L$0 = coroutineScope2;
                                    this.L$1 = objectRef2;
                                    this.L$2 = null;
                                    this.label = 2;
                                    if (m282invoke$lambda22.processDragStart(coroutineScope2, dragStarted, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    objectRef3 = objectRef2;
                                    coroutineScope3 = coroutineScope2;
                                    this.L$0 = coroutineScope3;
                                    this.L$1 = objectRef3;
                                    this.label = 3;
                                    if (this.$state.drag(MutatePriority.UserInput, new C00102(objectRef3, this.$channel, null), this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    DragLogic m282invoke$lambda23 = DraggableKt$draggable$9.m282invoke$lambda2(this.$dragLogic$delegate);
                                    if (objectRef3.element instanceof DragEvent.DragStopped) {
                                        DragEvent.DragStopped dragStopped = (DragEvent.DragStopped) objectRef3.element;
                                        this.L$0 = coroutineScope3;
                                        this.L$1 = null;
                                        this.label = 4;
                                        if (m282invoke$lambda23.processDragStop(coroutineScope3, dragStopped, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        coroutineScope4 = coroutineScope3;
                                    } else if (!(objectRef3.element instanceof DragEvent.DragCancelled)) {
                                        coroutineScope = coroutineScope3;
                                        if (CoroutineScopeKt.isActive(coroutineScope)) {
                                            return Unit.INSTANCE;
                                        }
                                    } else {
                                        this.L$0 = coroutineScope3;
                                        this.L$1 = null;
                                        this.label = 5;
                                        if (m282invoke$lambda23.processDragCancel(coroutineScope3, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        coroutineScope4 = coroutineScope3;
                                    }
                                    coroutineScope = coroutineScope4;
                                    if (CoroutineScopeKt.isActive(coroutineScope)) {
                                    }
                                } else {
                                    coroutineScope = coroutineScope2;
                                    if (CoroutineScopeKt.isActive(coroutineScope)) {
                                    }
                                }
                            }
                            break;
                        case 1:
                            objectRef = (Ref.ObjectRef) this.L$2;
                            objectRef2 = (Ref.ObjectRef) this.L$1;
                            coroutineScope2 = (CoroutineScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            t = obj;
                            objectRef.element = t;
                            if (!(objectRef2.element instanceof DragEvent.DragStarted)) {
                            }
                            break;
                        case 2:
                            objectRef3 = (Ref.ObjectRef) this.L$1;
                            coroutineScope3 = (CoroutineScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            this.L$0 = coroutineScope3;
                            this.L$1 = objectRef3;
                            this.label = 3;
                            if (this.$state.drag(MutatePriority.UserInput, new C00102(objectRef3, this.$channel, null), this) == coroutine_suspended) {
                            }
                            DragLogic m282invoke$lambda232 = DraggableKt$draggable$9.m282invoke$lambda2(this.$dragLogic$delegate);
                            if (objectRef3.element instanceof DragEvent.DragStopped) {
                            }
                            coroutineScope = coroutineScope4;
                            if (CoroutineScopeKt.isActive(coroutineScope)) {
                            }
                            break;
                        case 3:
                            objectRef3 = (Ref.ObjectRef) this.L$1;
                            coroutineScope3 = (CoroutineScope) this.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                            } catch (CancellationException unused) {
                                coroutineScope4 = coroutineScope3;
                                m282invoke$lambda2 = DraggableKt$draggable$9.m282invoke$lambda2(this.$dragLogic$delegate);
                                this.L$0 = coroutineScope4;
                                this.L$1 = null;
                                this.label = 6;
                                if (m282invoke$lambda2.processDragCancel(coroutineScope4, this) == coroutine_suspended) {
                                }
                                coroutineScope = coroutineScope4;
                                if (CoroutineScopeKt.isActive(coroutineScope)) {
                                }
                            }
                            DragLogic m282invoke$lambda2322 = DraggableKt$draggable$9.m282invoke$lambda2(this.$dragLogic$delegate);
                            if (objectRef3.element instanceof DragEvent.DragStopped) {
                            }
                            coroutineScope = coroutineScope4;
                            if (CoroutineScopeKt.isActive(coroutineScope)) {
                            }
                            break;
                        case 4:
                            coroutineScope4 = (CoroutineScope) this.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                            } catch (CancellationException unused2) {
                                m282invoke$lambda2 = DraggableKt$draggable$9.m282invoke$lambda2(this.$dragLogic$delegate);
                                this.L$0 = coroutineScope4;
                                this.L$1 = null;
                                this.label = 6;
                                if (m282invoke$lambda2.processDragCancel(coroutineScope4, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                coroutineScope = coroutineScope4;
                                if (CoroutineScopeKt.isActive(coroutineScope)) {
                                }
                            }
                            coroutineScope = coroutineScope4;
                            if (CoroutineScopeKt.isActive(coroutineScope)) {
                            }
                            break;
                        case 5:
                            coroutineScope4 = (CoroutineScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            coroutineScope = coroutineScope4;
                            if (CoroutineScopeKt.isActive(coroutineScope)) {
                            }
                            break;
                        case 6:
                            coroutineScope4 = (CoroutineScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            coroutineScope = coroutineScope4;
                            if (CoroutineScopeKt.isActive(coroutineScope)) {
                            }
                            break;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
        });
    }
}
