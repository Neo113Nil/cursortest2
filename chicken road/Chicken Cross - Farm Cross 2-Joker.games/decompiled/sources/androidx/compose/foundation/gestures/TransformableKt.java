package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: Transformable.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a1\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\tH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\f\u001a&\u0010\r\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"awaitTwoDowns", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "requireUnconsumed", "", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectZoom", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "panZoomLock", "Landroidx/compose/runtime/State;", "state", "Landroidx/compose/foundation/gestures/TransformableState;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transformable", "Landroidx/compose/ui/Modifier;", "lockRotationOnZoomPan", "enabled", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TransformableKt {
    public static /* synthetic */ Modifier transformable$default(Modifier modifier, TransformableState transformableState, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        return transformable(modifier, transformableState, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:(4:11|12|13|14)(2:17|18))(1:19))(2:23|(1:25)(1:26))|20|(1:22)|12|13|14))|28|6|7|(0)(0)|20|(0)|12|13|14) */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object detectZoom(PointerInputScope pointerInputScope, State<Boolean> state, State<? extends TransformableState> state2, Continuation<? super Unit> continuation) {
        TransformableKt$detectZoom$1 transformableKt$detectZoom$1;
        Object coroutine_suspended;
        int i;
        Ref.BooleanRef booleanRef;
        State<? extends TransformableState> state3;
        float f;
        Ref.LongRef longRef;
        Ref.FloatRef floatRef;
        Ref.FloatRef floatRef2;
        Ref.BooleanRef booleanRef2;
        State<Boolean> state4;
        PointerInputScope pointerInputScope2;
        TransformableState value;
        MutatePriority mutatePriority;
        TransformableKt$detectZoom$3 transformableKt$detectZoom$3;
        if (continuation instanceof TransformableKt$detectZoom$1) {
            transformableKt$detectZoom$1 = (TransformableKt$detectZoom$1) continuation;
            if ((transformableKt$detectZoom$1.label & Integer.MIN_VALUE) != 0) {
                transformableKt$detectZoom$1.label -= Integer.MIN_VALUE;
                Object obj = transformableKt$detectZoom$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = transformableKt$detectZoom$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.FloatRef floatRef3 = new Ref.FloatRef();
                    Ref.FloatRef floatRef4 = new Ref.FloatRef();
                    floatRef4.element = 1.0f;
                    Ref.LongRef longRef2 = new Ref.LongRef();
                    longRef2.element = Offset.INSTANCE.m1408getZeroF1C5BW0();
                    booleanRef = new Ref.BooleanRef();
                    float touchSlop = pointerInputScope.getViewConfiguration().getTouchSlop();
                    Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
                    TransformableKt$detectZoom$2 transformableKt$detectZoom$2 = new TransformableKt$detectZoom$2(null);
                    transformableKt$detectZoom$1.L$0 = pointerInputScope;
                    transformableKt$detectZoom$1.L$1 = state;
                    state3 = state2;
                    transformableKt$detectZoom$1.L$2 = state3;
                    transformableKt$detectZoom$1.L$3 = floatRef3;
                    transformableKt$detectZoom$1.L$4 = floatRef4;
                    transformableKt$detectZoom$1.L$5 = longRef2;
                    transformableKt$detectZoom$1.L$6 = booleanRef;
                    transformableKt$detectZoom$1.L$7 = booleanRef3;
                    transformableKt$detectZoom$1.F$0 = touchSlop;
                    transformableKt$detectZoom$1.label = 1;
                    if (pointerInputScope.awaitPointerEventScope(transformableKt$detectZoom$2, transformableKt$detectZoom$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    f = touchSlop;
                    longRef = longRef2;
                    floatRef = floatRef4;
                    floatRef2 = floatRef3;
                    booleanRef2 = booleanRef3;
                    state4 = state;
                    pointerInputScope2 = pointerInputScope;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    float f2 = transformableKt$detectZoom$1.F$0;
                    Ref.BooleanRef booleanRef4 = (Ref.BooleanRef) transformableKt$detectZoom$1.L$7;
                    Ref.BooleanRef booleanRef5 = (Ref.BooleanRef) transformableKt$detectZoom$1.L$6;
                    Ref.LongRef longRef3 = (Ref.LongRef) transformableKt$detectZoom$1.L$5;
                    Ref.FloatRef floatRef5 = (Ref.FloatRef) transformableKt$detectZoom$1.L$4;
                    Ref.FloatRef floatRef6 = (Ref.FloatRef) transformableKt$detectZoom$1.L$3;
                    State<? extends TransformableState> state5 = (State) transformableKt$detectZoom$1.L$2;
                    State<Boolean> state6 = (State) transformableKt$detectZoom$1.L$1;
                    pointerInputScope2 = (PointerInputScope) transformableKt$detectZoom$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    f = f2;
                    booleanRef2 = booleanRef4;
                    booleanRef = booleanRef5;
                    longRef = longRef3;
                    floatRef = floatRef5;
                    floatRef2 = floatRef6;
                    state3 = state5;
                    state4 = state6;
                }
                value = state3.getValue();
                mutatePriority = MutatePriority.UserInput;
                transformableKt$detectZoom$3 = new TransformableKt$detectZoom$3(pointerInputScope2, booleanRef, floatRef, floatRef2, longRef, f, booleanRef2, state4, null);
                transformableKt$detectZoom$1.L$0 = null;
                transformableKt$detectZoom$1.L$1 = null;
                transformableKt$detectZoom$1.L$2 = null;
                transformableKt$detectZoom$1.L$3 = null;
                transformableKt$detectZoom$1.L$4 = null;
                transformableKt$detectZoom$1.L$5 = null;
                transformableKt$detectZoom$1.L$6 = null;
                transformableKt$detectZoom$1.L$7 = null;
                transformableKt$detectZoom$1.label = 2;
                if (value.transform(mutatePriority, transformableKt$detectZoom$3, transformableKt$detectZoom$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        transformableKt$detectZoom$1 = new TransformableKt$detectZoom$1(continuation);
        Object obj2 = transformableKt$detectZoom$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = transformableKt$detectZoom$1.label;
        if (i != 0) {
        }
        value = state3.getValue();
        mutatePriority = MutatePriority.UserInput;
        transformableKt$detectZoom$3 = new TransformableKt$detectZoom$3(pointerInputScope2, booleanRef, floatRef, floatRef2, longRef, f, booleanRef2, state4, null);
        transformableKt$detectZoom$1.L$0 = null;
        transformableKt$detectZoom$1.L$1 = null;
        transformableKt$detectZoom$1.L$2 = null;
        transformableKt$detectZoom$1.L$3 = null;
        transformableKt$detectZoom$1.L$4 = null;
        transformableKt$detectZoom$1.L$5 = null;
        transformableKt$detectZoom$1.L$6 = null;
        transformableKt$detectZoom$1.L$7 = null;
        transformableKt$detectZoom$1.label = 2;
        if (value.transform(mutatePriority, transformableKt$detectZoom$3, transformableKt$detectZoom$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r5v6, types: [T, androidx.compose.ui.input.pointer.PointerId] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0061 -> B:10:0x0066). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitTwoDowns(AwaitPointerEventScope awaitPointerEventScope, boolean z, Continuation<? super Unit> continuation) {
        TransformableKt$awaitTwoDowns$1 transformableKt$awaitTwoDowns$1;
        int i;
        Ref.ObjectRef objectRef;
        TransformableKt$awaitTwoDowns$1 transformableKt$awaitTwoDowns$12;
        AwaitPointerEventScope awaitPointerEventScope2;
        boolean z2;
        Object awaitPointerEvent$default;
        int i2;
        if (continuation instanceof TransformableKt$awaitTwoDowns$1) {
            transformableKt$awaitTwoDowns$1 = (TransformableKt$awaitTwoDowns$1) continuation;
            if ((transformableKt$awaitTwoDowns$1.label & Integer.MIN_VALUE) != 0) {
                transformableKt$awaitTwoDowns$1.label -= Integer.MIN_VALUE;
                Object obj = transformableKt$awaitTwoDowns$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = transformableKt$awaitTwoDowns$1.label;
                PointerEventPass pointerEventPass = null;
                int i3 = 1;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    objectRef = new Ref.ObjectRef();
                    transformableKt$awaitTwoDowns$12 = transformableKt$awaitTwoDowns$1;
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    z2 = z;
                    transformableKt$awaitTwoDowns$12.L$0 = awaitPointerEventScope2;
                    transformableKt$awaitTwoDowns$12.L$1 = objectRef;
                    transformableKt$awaitTwoDowns$12.Z$0 = z2;
                    transformableKt$awaitTwoDowns$12.label = i3;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, transformableKt$awaitTwoDowns$12, i3, pointerEventPass);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                } else if (i == 1) {
                    boolean z3 = transformableKt$awaitTwoDowns$1.Z$0;
                    objectRef = (Ref.ObjectRef) transformableKt$awaitTwoDowns$1.L$1;
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) transformableKt$awaitTwoDowns$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    transformableKt$awaitTwoDowns$12 = transformableKt$awaitTwoDowns$1;
                    z2 = z3;
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    Ref.IntRef intRef = new Ref.IntRef();
                    intRef.element = objectRef.element == 0 ? i3 : 0;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    int size = changes.size();
                    int i4 = 0;
                    while (i4 < size) {
                        PointerInputChange pointerInputChange = changes.get(i4);
                        boolean changedToDown = z2 ? PointerEventKt.changedToDown(pointerInputChange) : PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange);
                        if (z2 ? PointerEventKt.changedToUp(pointerInputChange) : PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                            if (objectRef.element == 0 ? false : PointerId.m2981equalsimpl0(((PointerId) objectRef.element).m2984unboximpl(), pointerInputChange.getId())) {
                                pointerEventPass = null;
                                objectRef.element = null;
                                i2 = 1;
                                intRef.element--;
                            } else {
                                pointerEventPass = null;
                                i2 = 1;
                            }
                        } else {
                            i2 = i3;
                        }
                        if (changedToDown) {
                            objectRef.element = PointerId.m2978boximpl(pointerInputChange.getId());
                            intRef.element += i2;
                        }
                        i4++;
                        i3 = i2;
                    }
                    int i5 = i3;
                    if (intRef.element > i5) {
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        i3 = i5;
                        transformableKt$awaitTwoDowns$12.L$0 = awaitPointerEventScope2;
                        transformableKt$awaitTwoDowns$12.L$1 = objectRef;
                        transformableKt$awaitTwoDowns$12.Z$0 = z2;
                        transformableKt$awaitTwoDowns$12.label = i3;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, transformableKt$awaitTwoDowns$12, i3, pointerEventPass);
                        if (awaitPointerEvent$default != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        awaitPointerEventScope3 = awaitPointerEventScope2;
                        obj = awaitPointerEvent$default;
                        PointerEvent pointerEvent2 = (PointerEvent) obj;
                        Ref.IntRef intRef2 = new Ref.IntRef();
                        intRef2.element = objectRef.element == 0 ? i3 : 0;
                        List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                        int size2 = changes2.size();
                        int i42 = 0;
                        while (i42 < size2) {
                        }
                        int i52 = i3;
                        if (intRef2.element > i52) {
                        }
                    } else {
                        return Unit.INSTANCE;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        transformableKt$awaitTwoDowns$1 = new TransformableKt$awaitTwoDowns$1(continuation);
        Object obj2 = transformableKt$awaitTwoDowns$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = transformableKt$awaitTwoDowns$1.label;
        PointerEventPass pointerEventPass2 = null;
        int i32 = 1;
        if (i != 0) {
        }
    }

    static /* synthetic */ Object awaitTwoDowns$default(AwaitPointerEventScope awaitPointerEventScope, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return awaitTwoDowns(awaitPointerEventScope, z, continuation);
    }

    public static final Modifier transformable(Modifier modifier, final TransformableState state, final boolean z, final boolean z2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.gestures.TransformableKt$transformable$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("transformable");
                inspectorInfo.getProperties().set("state", TransformableState.this);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("lockRotationOnZoomPan", Boolean.valueOf(z));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.gestures.TransformableKt$transformable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(1509335853);
                ComposerKt.sourceInformation(composer, "C66@3002L27,67@3062L43,68@3164L163:Transformable.kt#8bwon0");
                State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(TransformableState.this, composer, 0);
                State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), composer, 0);
                composer.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
                TransformableKt$transformable$2$block$1$1 rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new TransformableKt$transformable$2$block$1$1(rememberUpdatedState2, rememberUpdatedState, null);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                Modifier.Companion pointerInput = z2 ? SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, Unit.INSTANCE, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue) : Modifier.INSTANCE;
                composer.endReplaceableGroup();
                return pointerInput;
            }
        });
    }
}
