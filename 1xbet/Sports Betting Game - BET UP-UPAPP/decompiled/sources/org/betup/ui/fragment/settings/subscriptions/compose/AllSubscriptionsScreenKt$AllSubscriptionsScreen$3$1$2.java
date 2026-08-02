package org.betup.ui.fragment.settings.subscriptions.compose;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
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
import org.betup.R;
import org.betup.model.remote.entity.subscription.MatchSubscriptionModel;
import org.betup.ui.common.compose.CommonButtonKt;
import org.betup.ui.fragment.settings.subscriptions.controller.AllSubscriptionsController;

/* compiled from: AllSubscriptionsScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class AllSubscriptionsScreenKt$AllSubscriptionsScreen$3$1$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ AllSubscriptionsController $controller;
    final /* synthetic */ State<Boolean> $isLoading$delegate;
    final /* synthetic */ State<List<MatchSubscriptionModel>> $subscriptions$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    AllSubscriptionsScreenKt$AllSubscriptionsScreen$3$1$2(AllSubscriptionsController allSubscriptionsController, State<? extends List<? extends MatchSubscriptionModel>> state, State<Boolean> state2) {
        this.$controller = allSubscriptionsController;
        this.$subscriptions$delegate = state;
        this.$isLoading$delegate = state2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(AllSubscriptionsController allSubscriptionsController) {
        allSubscriptionsController.deleteAllSubscriptions();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(Composer composer, int i) {
        List AllSubscriptionsScreen$lambda$4;
        boolean z;
        boolean changedInstance;
        Object rememberedValue;
        boolean AllSubscriptionsScreen$lambda$5;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-934642270, i, -1, "org.betup.ui.fragment.settings.subscriptions.compose.AllSubscriptionsScreen.<anonymous>.<anonymous>.<anonymous> (AllSubscriptionsScreen.kt:102)");
        }
        Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(8));
        Alignment center = Alignment.INSTANCE.getCenter();
        final AllSubscriptionsController allSubscriptionsController = this.$controller;
        State<List<MatchSubscriptionModel>> state = this.$subscriptions$delegate;
        State<Boolean> state2 = this.$isLoading$delegate;
        ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
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
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier.Companion companion = Modifier.INSTANCE;
        String stringResource = StringResources_androidKt.stringResource(R.string.delete_all, composer, 6);
        AllSubscriptionsScreen$lambda$4 = AllSubscriptionsScreenKt.AllSubscriptionsScreen$lambda$4(state);
        if (!AllSubscriptionsScreen$lambda$4.isEmpty()) {
            AllSubscriptionsScreen$lambda$5 = AllSubscriptionsScreenKt.AllSubscriptionsScreen$lambda$5(state2);
            if (!AllSubscriptionsScreen$lambda$5) {
                z = true;
                composer.startReplaceGroup(5004770);
                changedInstance = composer.changedInstance(allSubscriptionsController);
                rememberedValue = composer.rememberedValue();
                if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: org.betup.ui.fragment.settings.subscriptions.compose.AllSubscriptionsScreenKt$AllSubscriptionsScreen$3$1$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$2$lambda$1$lambda$0;
                            invoke$lambda$2$lambda$1$lambda$0 = AllSubscriptionsScreenKt$AllSubscriptionsScreen$3$1$2.invoke$lambda$2$lambda$1$lambda$0(AllSubscriptionsController.this);
                            return invoke$lambda$2$lambda$1$lambda$0;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                CommonButtonKt.m12915CommonButtonUPEs2M4(companion, true, stringResource, false, false, z, (Function0) rememberedValue, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer, 3126, 0, 0, 2097040);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (ComposerKt.isTraceInProgress()) {
                    return;
                }
                ComposerKt.traceEventEnd();
                return;
            }
        }
        z = false;
        composer.startReplaceGroup(5004770);
        changedInstance = composer.changedInstance(allSubscriptionsController);
        rememberedValue = composer.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.settings.subscriptions.compose.AllSubscriptionsScreenKt$AllSubscriptionsScreen$3$1$2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$2$lambda$1$lambda$0;
                invoke$lambda$2$lambda$1$lambda$0 = AllSubscriptionsScreenKt$AllSubscriptionsScreen$3$1$2.invoke$lambda$2$lambda$1$lambda$0(AllSubscriptionsController.this);
                return invoke$lambda$2$lambda$1$lambda$0;
            }
        };
        composer.updateRememberedValue(rememberedValue);
        composer.endReplaceGroup();
        CommonButtonKt.m12915CommonButtonUPEs2M4(companion, true, stringResource, false, false, z, (Function0) rememberedValue, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer, 3126, 0, 0, 2097040);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
        }
    }
}
