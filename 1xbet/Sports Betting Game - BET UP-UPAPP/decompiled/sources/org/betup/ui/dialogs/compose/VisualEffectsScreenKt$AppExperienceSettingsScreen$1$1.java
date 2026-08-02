package org.betup.ui.dialogs.compose;

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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;

/* compiled from: VisualEffectsScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class VisualEffectsScreenKt$AppExperienceSettingsScreen$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MutableState<Boolean> $hapticFeedbackEnabled$delegate;
    final /* synthetic */ MutableState<Boolean> $inAppMessagesEnabled$delegate;
    final /* synthetic */ MutableState<Boolean> $visualEffectsEnabled$delegate;

    VisualEffectsScreenKt$AppExperienceSettingsScreen$1$1(MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3) {
        this.$visualEffectsEnabled$delegate = mutableState;
        this.$hapticFeedbackEnabled$delegate = mutableState2;
        this.$inAppMessagesEnabled$delegate = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$1$lambda$0(MutableState mutableState) {
        VisualEffectsScreenKt.AppExperienceSettingsScreen$lambda$2(mutableState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$3$lambda$2(MutableState mutableState) {
        VisualEffectsScreenKt.AppExperienceSettingsScreen$lambda$2(mutableState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$5$lambda$4(MutableState mutableState) {
        VisualEffectsScreenKt.AppExperienceSettingsScreen$lambda$5(mutableState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$7$lambda$6(MutableState mutableState) {
        VisualEffectsScreenKt.AppExperienceSettingsScreen$lambda$5(mutableState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$9$lambda$8(MutableState mutableState) {
        VisualEffectsScreenKt.AppExperienceSettingsScreen$lambda$8(mutableState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$11$lambda$10(MutableState mutableState) {
        VisualEffectsScreenKt.AppExperienceSettingsScreen$lambda$8(mutableState, false);
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        boolean AppExperienceSettingsScreen$lambda$1;
        boolean AppExperienceSettingsScreen$lambda$4;
        boolean AppExperienceSettingsScreen$lambda$7;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(148729760, i, -1, "org.betup.ui.dialogs.compose.AppExperienceSettingsScreen.<anonymous>.<anonymous> (VisualEffectsScreen.kt:66)");
        }
        float f = 16;
        Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f));
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(20));
        final MutableState<Boolean> mutableState = this.$visualEffectsEnabled$delegate;
        final MutableState<Boolean> mutableState2 = this.$hapticFeedbackEnabled$delegate;
        final MutableState<Boolean> mutableState3 = this.$inAppMessagesEnabled$delegate;
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
        String stringResource = StringResources_androidKt.stringResource(R.string.visual_effects_settings, composer, 6);
        String stringResource2 = StringResources_androidKt.stringResource(R.string.enable_visual_effects, composer, 6);
        String stringResource3 = StringResources_androidKt.stringResource(R.string.disable_visual_effects, composer, 6);
        AppExperienceSettingsScreen$lambda$1 = VisualEffectsScreenKt.AppExperienceSettingsScreen$lambda$1(mutableState);
        composer.startReplaceGroup(5004770);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.compose.VisualEffectsScreenKt$AppExperienceSettingsScreen$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$12$lambda$1$lambda$0;
                    invoke$lambda$12$lambda$1$lambda$0 = VisualEffectsScreenKt$AppExperienceSettingsScreen$1$1.invoke$lambda$12$lambda$1$lambda$0(MutableState.this);
                    return invoke$lambda$12$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.compose.VisualEffectsScreenKt$AppExperienceSettingsScreen$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$12$lambda$3$lambda$2;
                    invoke$lambda$12$lambda$3$lambda$2 = VisualEffectsScreenKt$AppExperienceSettingsScreen$1$1.invoke$lambda$12$lambda$3$lambda$2(MutableState.this);
                    return invoke$lambda$12$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        VisualEffectsScreenKt.ExperienceSettingGroup(stringResource, stringResource2, stringResource3, AppExperienceSettingsScreen$lambda$1, function0, (Function0) rememberedValue2, composer, 221184);
        String stringResource4 = StringResources_androidKt.stringResource(R.string.haptic_feedback_settings, composer, 6);
        String stringResource5 = StringResources_androidKt.stringResource(R.string.enable_haptic_feedback, composer, 6);
        String stringResource6 = StringResources_androidKt.stringResource(R.string.disable_haptic_feedback, composer, 6);
        AppExperienceSettingsScreen$lambda$4 = VisualEffectsScreenKt.AppExperienceSettingsScreen$lambda$4(mutableState2);
        composer.startReplaceGroup(5004770);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function0() { // from class: org.betup.ui.dialogs.compose.VisualEffectsScreenKt$AppExperienceSettingsScreen$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$12$lambda$5$lambda$4;
                    invoke$lambda$12$lambda$5$lambda$4 = VisualEffectsScreenKt$AppExperienceSettingsScreen$1$1.invoke$lambda$12$lambda$5$lambda$4(MutableState.this);
                    return invoke$lambda$12$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        Function0 function02 = (Function0) rememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function0() { // from class: org.betup.ui.dialogs.compose.VisualEffectsScreenKt$AppExperienceSettingsScreen$1$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$12$lambda$7$lambda$6;
                    invoke$lambda$12$lambda$7$lambda$6 = VisualEffectsScreenKt$AppExperienceSettingsScreen$1$1.invoke$lambda$12$lambda$7$lambda$6(MutableState.this);
                    return invoke$lambda$12$lambda$7$lambda$6;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceGroup();
        VisualEffectsScreenKt.ExperienceSettingGroup(stringResource4, stringResource5, stringResource6, AppExperienceSettingsScreen$lambda$4, function02, (Function0) rememberedValue4, composer, 221184);
        String stringResource7 = StringResources_androidKt.stringResource(R.string.in_app_messages_settings, composer, 6);
        String stringResource8 = StringResources_androidKt.stringResource(R.string.enable_in_app_messages, composer, 6);
        String stringResource9 = StringResources_androidKt.stringResource(R.string.disable_in_app_messages, composer, 6);
        AppExperienceSettingsScreen$lambda$7 = VisualEffectsScreenKt.AppExperienceSettingsScreen$lambda$7(mutableState3);
        composer.startReplaceGroup(5004770);
        Object rememberedValue5 = composer.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new Function0() { // from class: org.betup.ui.dialogs.compose.VisualEffectsScreenKt$AppExperienceSettingsScreen$1$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$12$lambda$9$lambda$8;
                    invoke$lambda$12$lambda$9$lambda$8 = VisualEffectsScreenKt$AppExperienceSettingsScreen$1$1.invoke$lambda$12$lambda$9$lambda$8(MutableState.this);
                    return invoke$lambda$12$lambda$9$lambda$8;
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        }
        Function0 function03 = (Function0) rememberedValue5;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        Object rememberedValue6 = composer.rememberedValue();
        if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            rememberedValue6 = new Function0() { // from class: org.betup.ui.dialogs.compose.VisualEffectsScreenKt$AppExperienceSettingsScreen$1$1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$12$lambda$11$lambda$10;
                    invoke$lambda$12$lambda$11$lambda$10 = VisualEffectsScreenKt$AppExperienceSettingsScreen$1$1.invoke$lambda$12$lambda$11$lambda$10(MutableState.this);
                    return invoke$lambda$12$lambda$11$lambda$10;
                }
            };
            composer.updateRememberedValue(rememberedValue6);
        }
        composer.endReplaceGroup();
        VisualEffectsScreenKt.ExperienceSettingGroup(stringResource7, stringResource8, stringResource9, AppExperienceSettingsScreen$lambda$7, function03, (Function0) rememberedValue6, composer, 221184);
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
