package org.betup.ui.dialogs;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.ui.common.compose.TicketDarkKt;
import org.betup.ui.fragment.bets.sheet.compose.items.TopActionButtonsKt;

/* compiled from: CreateSupportTicketDialogFragment.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\u001aQ\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\u0004X\u008a\u008e\u0002²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\f\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u008a\u008e\u0002"}, d2 = {"CreateSupportTicketContent", "", "categoryIds", "", "", "categoryNames", "onDismiss", "Lkotlin/Function0;", "onCreateTicket", "Lkotlin/Function2;", "(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "app_release", "details", "selectedCategoryIndex", "", "detailsError"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CreateSupportTicketDialogFragmentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateSupportTicketContent$lambda$12(List list, List list2, Function0 function0, Function2 function2, int i, Composer composer, int i2) {
        CreateSupportTicketContent(list, list2, function0, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CreateSupportTicketContent(final List<String> list, final List<String> list2, final Function0<Unit> function0, final Function2<? super String, ? super String, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-680321368);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(list2) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        int i3 = i2;
        if ((i3 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-680321368, i3, -1, "org.betup.ui.dialogs.CreateSupportTicketContent (CreateSupportTicketDialogFragment.kt:112)");
            }
            Object[] objArr = new Object[0];
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.CreateSupportTicketDialogFragmentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState CreateSupportTicketContent$lambda$1$lambda$0;
                        CreateSupportTicketContent$lambda$1$lambda$0 = CreateSupportTicketDialogFragmentKt.CreateSupportTicketContent$lambda$1$lambda$0();
                        return CreateSupportTicketContent$lambda$1$lambda$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            MutableState mutableState = (MutableState) RememberSaveableKt.m4725rememberSaveable(objArr, (Saver) null, (String) null, (Function0) rememberedValue, startRestartGroup, 3072, 6);
            Object[] objArr2 = new Object[0];
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.CreateSupportTicketDialogFragmentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState CreateSupportTicketContent$lambda$5$lambda$4;
                        CreateSupportTicketContent$lambda$5$lambda$4 = CreateSupportTicketDialogFragmentKt.CreateSupportTicketContent$lambda$5$lambda$4();
                        return CreateSupportTicketContent$lambda$5$lambda$4;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            MutableState mutableState2 = (MutableState) RememberSaveableKt.m4725rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) rememberedValue2, startRestartGroup, 3072, 6);
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState3 = (MutableState) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            String stringResource = StringResources_androidKt.stringResource(R.string.please_enter_details, startRestartGroup, 6);
            float f = 32;
            Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.wrapContentHeight$default(Modifier.INSTANCE, null, false, 3, null), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f));
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            TopActionButtonsKt.TopActionButtons(ColumnScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally()), function0, null, null, false, false, false, startRestartGroup, ((i3 >> 3) & 112) | 24576, 108);
            float f2 = 48;
            SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(f2)), startRestartGroup, 6);
            TicketDarkKt.TicketDark(SizeKt.wrapContentHeight$default(Modifier.INSTANCE, null, false, 3, null), ComposableSingletons$CreateSupportTicketDialogFragmentKt.INSTANCE.getLambda$310964802$app_release(), ComposableLambdaKt.rememberComposableLambda(2022243169, true, new CreateSupportTicketDialogFragmentKt$CreateSupportTicketContent$1$1(list2, mutableState2, mutableState, mutableState3), startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-561445760, true, new CreateSupportTicketDialogFragmentKt$CreateSupportTicketContent$1$2(mutableState, stringResource, list, mutableState2, function2, mutableState3), startRestartGroup, 54), false, true, null, false, startRestartGroup, 224694, 192);
            SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(0), Dp.m7774constructorimpl(f2)), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.CreateSupportTicketDialogFragmentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CreateSupportTicketContent$lambda$12;
                    CreateSupportTicketContent$lambda$12 = CreateSupportTicketDialogFragmentKt.CreateSupportTicketContent$lambda$12(list, list2, function0, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return CreateSupportTicketContent$lambda$12;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState CreateSupportTicketContent$lambda$1$lambda$0() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String CreateSupportTicketContent$lambda$2(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState CreateSupportTicketContent$lambda$5$lambda$4() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int CreateSupportTicketContent$lambda$6(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CreateSupportTicketContent$lambda$7(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String CreateSupportTicketContent$lambda$9(MutableState<String> mutableState) {
        return mutableState.getValue();
    }
}
