package org.betup.ui.fragment.matches;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LeaguesByDateFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class LeaguesByDateFragment$onCreateView$1$1$1$1 implements PointerInputEventHandler {
    final /* synthetic */ LocalDate $currentDate;
    final /* synthetic */ MutableState<Boolean> $hasSwiped$delegate;
    final /* synthetic */ MutableState<Float> $swipeStartX$delegate;
    final /* synthetic */ LeaguesByDateFragment this$0;

    LeaguesByDateFragment$onCreateView$1$1$1$1(MutableState<Float> mutableState, MutableState<Boolean> mutableState2, LocalDate localDate, LeaguesByDateFragment leaguesByDateFragment) {
        this.$swipeStartX$delegate = mutableState;
        this.$hasSwiped$delegate = mutableState2;
        this.$currentDate = localDate;
        this.this$0 = leaguesByDateFragment;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final MutableState<Float> mutableState = this.$swipeStartX$delegate;
        final MutableState<Boolean> mutableState2 = this.$hasSwiped$delegate;
        Function1 function1 = new Function1() { // from class: org.betup.ui.fragment.matches.LeaguesByDateFragment$onCreateView$1$1$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$0;
                invoke$lambda$0 = LeaguesByDateFragment$onCreateView$1$1$1$1.invoke$lambda$0(MutableState.this, mutableState2, (Offset) obj);
                return invoke$lambda$0;
            }
        };
        final MutableState<Boolean> mutableState3 = this.$hasSwiped$delegate;
        Function0 function0 = new Function0() { // from class: org.betup.ui.fragment.matches.LeaguesByDateFragment$onCreateView$1$1$1$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$1;
                invoke$lambda$1 = LeaguesByDateFragment$onCreateView$1$1$1$1.invoke$lambda$1(MutableState.this);
                return invoke$lambda$1;
            }
        };
        final MutableState<Boolean> mutableState4 = this.$hasSwiped$delegate;
        Function0 function02 = new Function0() { // from class: org.betup.ui.fragment.matches.LeaguesByDateFragment$onCreateView$1$1$1$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$2;
                invoke$lambda$2 = LeaguesByDateFragment$onCreateView$1$1$1$1.invoke$lambda$2(MutableState.this);
                return invoke$lambda$2;
            }
        };
        final LocalDate localDate = this.$currentDate;
        final LeaguesByDateFragment leaguesByDateFragment = this.this$0;
        final MutableState<Boolean> mutableState5 = this.$hasSwiped$delegate;
        Object detectHorizontalDragGestures = DragGestureDetectorKt.detectHorizontalDragGestures(pointerInputScope, function1, function0, function02, new Function2() { // from class: org.betup.ui.fragment.matches.LeaguesByDateFragment$onCreateView$1$1$1$1$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit invoke$lambda$3;
                invoke$lambda$3 = LeaguesByDateFragment$onCreateView$1$1$1$1.invoke$lambda$3(localDate, leaguesByDateFragment, mutableState5, (PointerInputChange) obj, ((Float) obj2).floatValue());
                return invoke$lambda$3;
            }
        }, continuation);
        return detectHorizontalDragGestures == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectHorizontalDragGestures : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(MutableState mutableState, MutableState mutableState2, Offset offset) {
        LeaguesByDateFragment$onCreateView$1$1.invoke$lambda$10(mutableState, Float.intBitsToFloat((int) (offset.m4937unboximpl() >> 32)));
        LeaguesByDateFragment$onCreateView$1$1.invoke$lambda$13(mutableState2, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(MutableState mutableState) {
        boolean invoke$lambda$12;
        invoke$lambda$12 = LeaguesByDateFragment$onCreateView$1$1.invoke$lambda$12(mutableState);
        if (invoke$lambda$12) {
            LeaguesByDateFragment$onCreateView$1$1.invoke$lambda$13(mutableState, false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2(MutableState mutableState) {
        LeaguesByDateFragment$onCreateView$1$1.invoke$lambda$13(mutableState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3(LocalDate localDate, LeaguesByDateFragment leaguesByDateFragment, MutableState mutableState, PointerInputChange change, float f) {
        boolean invoke$lambda$12;
        LocalDate plusDays;
        Intrinsics.checkNotNullParameter(change, "change");
        invoke$lambda$12 = LeaguesByDateFragment$onCreateView$1$1.invoke$lambda$12(mutableState);
        if (!invoke$lambda$12 && Math.abs(f) > 100.0f) {
            LeaguesByDateFragment$onCreateView$1$1.invoke$lambda$13(mutableState, true);
            if (f > 0.0f) {
                plusDays = localDate.minusDays(1L);
            } else {
                plusDays = localDate.plusDays(1L);
            }
            LeaguesByDateController controller = leaguesByDateFragment.getController();
            String localDate2 = plusDays.toString();
            Intrinsics.checkNotNullExpressionValue(localDate2, "toString(...)");
            controller.performDateChange(localDate2);
        }
        return Unit.INSTANCE;
    }
}
