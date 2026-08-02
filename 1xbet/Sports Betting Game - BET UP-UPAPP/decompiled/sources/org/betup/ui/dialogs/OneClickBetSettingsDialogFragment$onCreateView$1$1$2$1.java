package org.betup.ui.dialogs;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OneClickBetSettingsDialogFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.OneClickBetSettingsDialogFragment$onCreateView$1$1$2$1", f = "OneClickBetSettingsDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class OneClickBetSettingsDialogFragment$onCreateView$1$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Long> $amount$delegate;
    final /* synthetic */ long $maxSlider;
    final /* synthetic */ long $minStakeCfg;
    final /* synthetic */ MutableState<Boolean> $settingsLoaded$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OneClickBetSettingsDialogFragment$onCreateView$1$1$2$1(long j, long j2, MutableState<Boolean> mutableState, MutableState<Long> mutableState2, Continuation<? super OneClickBetSettingsDialogFragment$onCreateView$1$1$2$1> continuation) {
        super(2, continuation);
        this.$minStakeCfg = j;
        this.$maxSlider = j2;
        this.$settingsLoaded$delegate = mutableState;
        this.$amount$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OneClickBetSettingsDialogFragment$onCreateView$1$1$2$1(this.$minStakeCfg, this.$maxSlider, this.$settingsLoaded$delegate, this.$amount$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OneClickBetSettingsDialogFragment$onCreateView$1$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean invoke$lambda$4;
        long invoke$lambda$31;
        long invoke$lambda$312;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            invoke$lambda$4 = OneClickBetSettingsDialogFragment$onCreateView$1$1.invoke$lambda$4(this.$settingsLoaded$delegate);
            if (!invoke$lambda$4) {
                return Unit.INSTANCE;
            }
            invoke$lambda$31 = OneClickBetSettingsDialogFragment$onCreateView$1$1.invoke$lambda$31(this.$amount$delegate);
            long coerceIn = RangesKt.coerceIn(invoke$lambda$31, this.$minStakeCfg, this.$maxSlider);
            invoke$lambda$312 = OneClickBetSettingsDialogFragment$onCreateView$1$1.invoke$lambda$31(this.$amount$delegate);
            if (coerceIn != invoke$lambda$312) {
                OneClickBetSettingsDialogFragment$onCreateView$1$1.invoke$lambda$32(this.$amount$delegate, coerceIn);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
