package org.betup.ui.fragment.achievements.compose.components;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MissionProgressComponent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.achievements.compose.components.MissionProgressComponentKt$MissionProgressComponent$1$1", f = "MissionProgressComponent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class MissionProgressComponentKt$MissionProgressComponent$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableFloatState $animatedProgress$delegate;
    final /* synthetic */ State<Float> $animatedProgressValue$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MissionProgressComponentKt$MissionProgressComponent$1$1(State<Float> state, MutableFloatState mutableFloatState, Continuation<? super MissionProgressComponentKt$MissionProgressComponent$1$1> continuation) {
        super(2, continuation);
        this.$animatedProgressValue$delegate = state;
        this.$animatedProgress$delegate = mutableFloatState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MissionProgressComponentKt$MissionProgressComponent$1$1(this.$animatedProgressValue$delegate, this.$animatedProgress$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MissionProgressComponentKt$MissionProgressComponent$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float MissionProgressComponent$lambda$3;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MutableFloatState mutableFloatState = this.$animatedProgress$delegate;
        MissionProgressComponent$lambda$3 = MissionProgressComponentKt.MissionProgressComponent$lambda$3(this.$animatedProgressValue$delegate);
        mutableFloatState.setFloatValue(MissionProgressComponent$lambda$3);
        return Unit.INSTANCE;
    }
}
