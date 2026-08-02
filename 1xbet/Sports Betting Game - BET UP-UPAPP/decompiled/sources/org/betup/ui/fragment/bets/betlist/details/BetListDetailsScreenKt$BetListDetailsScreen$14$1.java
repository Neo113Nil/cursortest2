package org.betup.ui.fragment.bets.betlist.details;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.State;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.betup.model.remote.api.rest.user.bets.models.BetsListModel;
import org.betup.model.remote.entity.bets.BetState;
import org.betup.ui.common.compose.HapticFeedbackType;

/* compiled from: BetListDetailsScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$BetListDetailsScreen$14$1", f = "BetListDetailsScreen.kt", i = {}, l = {281}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class BetListDetailsScreenKt$BetListDetailsScreen$14$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $currentPage;
    final /* synthetic */ State<List<BetsListModel>> $items$delegate;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ Function1<Integer, Unit> $onPageChanged;
    final /* synthetic */ Function1<HapticFeedbackType, Unit> $performHaptic;
    int label;

    /* compiled from: BetListDetailsScreen.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BetState.values().length];
            try {
                iArr[BetState.WON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BetState.LOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BetListDetailsScreenKt$BetListDetailsScreen$14$1(int i, Function1<? super Integer, Unit> function1, Function1<? super HapticFeedbackType, Unit> function12, LazyListState lazyListState, State<? extends List<? extends BetsListModel>> state, Continuation<? super BetListDetailsScreenKt$BetListDetailsScreen$14$1> continuation) {
        super(2, continuation);
        this.$currentPage = i;
        this.$onPageChanged = function1;
        this.$performHaptic = function12;
        this.$listState = lazyListState;
        this.$items$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BetListDetailsScreenKt$BetListDetailsScreen$14$1(this.$currentPage, this.$onPageChanged, this.$performHaptic, this.$listState, this.$items$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BetListDetailsScreenKt$BetListDetailsScreen$14$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List BetListDetailsScreen$lambda$16;
        List BetListDetailsScreen$lambda$162;
        List BetListDetailsScreen$lambda$163;
        List BetListDetailsScreen$lambda$164;
        List BetListDetailsScreen$lambda$165;
        List BetListDetailsScreen$lambda$166;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            BetListDetailsScreen$lambda$16 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$16(this.$items$delegate);
            if (!BetListDetailsScreen$lambda$16.isEmpty()) {
                int i2 = this.$currentPage;
                BetListDetailsScreen$lambda$162 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$16(this.$items$delegate);
                if (i2 < BetListDetailsScreen$lambda$162.size()) {
                    BetListDetailsScreen$lambda$163 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$16(this.$items$delegate);
                    Integer id = ((BetsListModel) BetListDetailsScreen$lambda$163.get(this.$currentPage)).getId();
                    Function1<Integer, Unit> function1 = this.$onPageChanged;
                    Intrinsics.checkNotNull(id);
                    function1.invoke(id);
                    BetListDetailsScreen$lambda$164 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$16(this.$items$delegate);
                    BetState state = ((BetsListModel) BetListDetailsScreen$lambda$164.get(this.$currentPage)).getState();
                    int i3 = state == null ? -1 : WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                    if (i3 == 1) {
                        this.$performHaptic.invoke(HapticFeedbackType.Win);
                    } else if (i3 == 2) {
                        this.$performHaptic.invoke(HapticFeedbackType.Loss);
                    }
                    int i4 = this.$currentPage;
                    int i5 = 0;
                    if (i4 != 0) {
                        BetListDetailsScreen$lambda$165 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$16(this.$items$delegate);
                        i5 = i4 >= BetListDetailsScreen$lambda$165.size() - 1 ? Math.max(0, this.$currentPage - 1) : Math.max(0, this.$currentPage - 1);
                    }
                    int i6 = i5;
                    if (i6 >= 0) {
                        BetListDetailsScreen$lambda$166 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$16(this.$items$delegate);
                        if (i6 < BetListDetailsScreen$lambda$166.size()) {
                            this.label = 1;
                            if (LazyListState.animateScrollToItem$default(this.$listState, i6, 0, this, 2, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                }
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
