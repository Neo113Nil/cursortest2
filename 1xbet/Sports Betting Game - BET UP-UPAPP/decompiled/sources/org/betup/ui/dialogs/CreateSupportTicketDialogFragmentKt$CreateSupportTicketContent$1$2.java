package org.betup.ui.dialogs;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.R;
import org.betup.ui.common.compose.CommonButtonKt;

/* compiled from: CreateSupportTicketDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CreateSupportTicketDialogFragmentKt$CreateSupportTicketContent$1$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ List<String> $categoryIds;
    final /* synthetic */ MutableState<String> $details$delegate;
    final /* synthetic */ MutableState<String> $detailsError$delegate;
    final /* synthetic */ Function2<String, String, Unit> $onCreateTicket;
    final /* synthetic */ String $pleaseEnterDetails;
    final /* synthetic */ MutableState<Integer> $selectedCategoryIndex$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    CreateSupportTicketDialogFragmentKt$CreateSupportTicketContent$1$2(MutableState<String> mutableState, String str, List<String> list, MutableState<Integer> mutableState2, Function2<? super String, ? super String, Unit> function2, MutableState<String> mutableState3) {
        this.$details$delegate = mutableState;
        this.$pleaseEnterDetails = str;
        this.$categoryIds = list;
        this.$selectedCategoryIndex$delegate = mutableState2;
        this.$onCreateTicket = function2;
        this.$detailsError$delegate = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(String str, List list, Function2 function2, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        String CreateSupportTicketContent$lambda$2;
        String str2;
        String CreateSupportTicketContent$lambda$22;
        int CreateSupportTicketContent$lambda$6;
        int CreateSupportTicketContent$lambda$62;
        mutableState.setValue(null);
        CreateSupportTicketContent$lambda$2 = CreateSupportTicketDialogFragmentKt.CreateSupportTicketContent$lambda$2(mutableState2);
        if (!StringsKt.isBlank(CreateSupportTicketContent$lambda$2)) {
            if (!list.isEmpty()) {
                CreateSupportTicketContent$lambda$6 = CreateSupportTicketDialogFragmentKt.CreateSupportTicketContent$lambda$6(mutableState3);
                if (CreateSupportTicketContent$lambda$6 < list.size()) {
                    CreateSupportTicketContent$lambda$62 = CreateSupportTicketDialogFragmentKt.CreateSupportTicketContent$lambda$6(mutableState3);
                    str2 = (String) list.get(CreateSupportTicketContent$lambda$62);
                    CreateSupportTicketContent$lambda$22 = CreateSupportTicketDialogFragmentKt.CreateSupportTicketContent$lambda$2(mutableState2);
                    function2.invoke(CreateSupportTicketContent$lambda$22, str2);
                    return Unit.INSTANCE;
                }
            }
            str2 = "";
            CreateSupportTicketContent$lambda$22 = CreateSupportTicketDialogFragmentKt.CreateSupportTicketContent$lambda$2(mutableState2);
            function2.invoke(CreateSupportTicketContent$lambda$22, str2);
            return Unit.INSTANCE;
        }
        mutableState.setValue(str);
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-561445760, i, -1, "org.betup.ui.dialogs.CreateSupportTicketContent.<anonymous>.<anonymous> (CreateSupportTicketDialogFragment.kt:139)");
        }
        Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(20), Dp.m7774constructorimpl(16));
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(12));
        final MutableState<String> mutableState = this.$details$delegate;
        final String str = this.$pleaseEnterDetails;
        final List<String> list = this.$categoryIds;
        final MutableState<Integer> mutableState2 = this.$selectedCategoryIndex$delegate;
        final Function2<String, String, Unit> function2 = this.$onCreateTicket;
        final MutableState<String> mutableState3 = this.$detailsError$delegate;
        ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer, 6);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1517paddingVpY3zN4);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m4610constructorimpl = Updater.m4610constructorimpl(composer);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        String stringResource = StringResources_androidKt.stringResource(R.string.send, composer, 6);
        composer.startReplaceGroup(-1224400529);
        boolean changed = composer.changed(mutableState) | composer.changed(str) | composer.changedInstance(list) | composer.changed(mutableState2) | composer.changed(function2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.CreateSupportTicketDialogFragmentKt$CreateSupportTicketContent$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$2$lambda$1$lambda$0;
                    invoke$lambda$2$lambda$1$lambda$0 = CreateSupportTicketDialogFragmentKt$CreateSupportTicketContent$1$2.invoke$lambda$2$lambda$1$lambda$0(str, list, function2, mutableState3, mutableState, mutableState2);
                    return invoke$lambda$2$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        CommonButtonKt.m12915CommonButtonUPEs2M4(fillMaxWidth$default, true, stringResource, false, false, false, (Function0) rememberedValue, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer, 54, 0, 0, 2097080);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
