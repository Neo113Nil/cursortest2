package org.betup.ui.fragment.balance;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.betup.model.remote.entity.user.balance.BalanceDataModel;
import org.betup.ui.fragment.balance.compose.BalanceHistoryScreenKt;

/* compiled from: BalanceHistoryFragmentK.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class BalanceHistoryFragmentK$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ BalanceHistoryFragmentK this$0;

    BalanceHistoryFragmentK$onCreateView$1$1(BalanceHistoryFragmentK balanceHistoryFragmentK) {
        this.this$0 = balanceHistoryFragmentK;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        MutableStateFlow mutableStateFlow3;
        MutableStateFlow mutableStateFlow4;
        MutableStateFlow mutableStateFlow5;
        MutableStateFlow mutableStateFlow6;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1946981244, i, -1, "org.betup.ui.fragment.balance.BalanceHistoryFragmentK.onCreateView.<anonymous>.<anonymous> (BalanceHistoryFragmentK.kt:69)");
        }
        mutableStateFlow = this.this$0.balanceHistoryFlow;
        State collectAsState = SnapshotStateKt.collectAsState(mutableStateFlow, null, composer, 0, 1);
        mutableStateFlow2 = this.this$0.gameNamesByCodeFlow;
        State collectAsState2 = SnapshotStateKt.collectAsState(mutableStateFlow2, null, composer, 0, 1);
        mutableStateFlow3 = this.this$0.isLoadingFlow;
        State collectAsState3 = SnapshotStateKt.collectAsState(mutableStateFlow3, null, composer, 0, 1);
        mutableStateFlow4 = this.this$0.isLoadingMoreFlow;
        State collectAsState4 = SnapshotStateKt.collectAsState(mutableStateFlow4, null, composer, 0, 1);
        mutableStateFlow5 = this.this$0.hasMoreFlow;
        State collectAsState5 = SnapshotStateKt.collectAsState(mutableStateFlow5, null, composer, 0, 1);
        mutableStateFlow6 = this.this$0.errorMessageFlow;
        State collectAsState6 = SnapshotStateKt.collectAsState(mutableStateFlow6, null, composer, 0, 1);
        List<BalanceDataModel> invoke$lambda$0 = invoke$lambda$0(collectAsState);
        Map<String, String> invoke$lambda$1 = invoke$lambda$1(collectAsState2);
        boolean invoke$lambda$2 = invoke$lambda$2(collectAsState3);
        boolean invoke$lambda$3 = invoke$lambda$3(collectAsState4);
        boolean invoke$lambda$4 = invoke$lambda$4(collectAsState5);
        String invoke$lambda$5 = invoke$lambda$5(collectAsState6);
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final BalanceHistoryFragmentK balanceHistoryFragmentK = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.balance.BalanceHistoryFragmentK$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$7$lambda$6;
                    invoke$lambda$7$lambda$6 = BalanceHistoryFragmentK$onCreateView$1$1.invoke$lambda$7$lambda$6(BalanceHistoryFragmentK.this);
                    return invoke$lambda$7$lambda$6;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final BalanceHistoryFragmentK balanceHistoryFragmentK2 = this.this$0;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.balance.BalanceHistoryFragmentK$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$9$lambda$8;
                    invoke$lambda$9$lambda$8 = BalanceHistoryFragmentK$onCreateView$1$1.invoke$lambda$9$lambda$8(BalanceHistoryFragmentK.this);
                    return invoke$lambda$9$lambda$8;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        Function0 function02 = (Function0) rememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance3 = composer.changedInstance(this.this$0);
        final BalanceHistoryFragmentK balanceHistoryFragmentK3 = this.this$0;
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.balance.BalanceHistoryFragmentK$onCreateView$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$11$lambda$10;
                    invoke$lambda$11$lambda$10 = BalanceHistoryFragmentK$onCreateView$1$1.invoke$lambda$11$lambda$10(BalanceHistoryFragmentK.this);
                    return invoke$lambda$11$lambda$10;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceGroup();
        BalanceHistoryScreenKt.BalanceHistoryScreen(invoke$lambda$0, invoke$lambda$1, invoke$lambda$2, invoke$lambda$3, invoke$lambda$4, invoke$lambda$5, function0, function02, (Function0) rememberedValue3, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer, 805306368, 0, 1024);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6(BalanceHistoryFragmentK balanceHistoryFragmentK) {
        balanceHistoryFragmentK.requireActivity().getOnBackPressedDispatcher().onBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8(BalanceHistoryFragmentK balanceHistoryFragmentK) {
        balanceHistoryFragmentK.refresh();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$11$lambda$10(BalanceHistoryFragmentK balanceHistoryFragmentK) {
        balanceHistoryFragmentK.loadNextPage();
        return Unit.INSTANCE;
    }

    private static final List<BalanceDataModel> invoke$lambda$0(State<? extends List<? extends BalanceDataModel>> state) {
        return (List) state.getValue();
    }

    private static final Map<String, String> invoke$lambda$1(State<? extends Map<String, String>> state) {
        return state.getValue();
    }

    private static final boolean invoke$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean invoke$lambda$3(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean invoke$lambda$4(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final String invoke$lambda$5(State<String> state) {
        return state.getValue();
    }
}
