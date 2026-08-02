package org.betup.ui.fragment.settings.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.CheckboxDefaults;
import androidx.compose.material3.CheckboxKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.mediarouter.media.MediaRouterJellybean;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.ui.fragment.settings.controller.SettingsController;
import org.betup.ui.views.ComposeUtils;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: SettingsContent.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\b\u001a+\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0003¢\u0006\u0002\u0010\u000e\u001a9\u0010\u000f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0013H\u0003¢\u0006\u0002\u0010\u0014¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0011X\u008a\u0084\u0002"}, d2 = {"SettingsContent", "", "controller", "Lorg/betup/ui/fragment/settings/controller/SettingsController;", "(Lorg/betup/ui/fragment/settings/controller/SettingsController;Landroidx/compose/runtime/Composer;I)V", "SectionHeader", "text", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "SettingsItem", "title", "subtitle", "onClick", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "NotificationCheckboxItem", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "app_release", "isBetPushEnabled", "isMatchPushEnabled", "showInviteCode"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SettingsContentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NotificationCheckboxItem$lambda$42(String str, String str2, boolean z, Function1 function1, int i, Composer composer, int i2) {
        NotificationCheckboxItem(str, str2, z, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SectionHeader$lambda$34(String str, int i, Composer composer, int i2) {
        SectionHeader(str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsContent$lambda$32(SettingsController settingsController, int i, Composer composer, int i2) {
        SettingsContent(settingsController, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsItem$lambda$37(String str, String str2, Function0 function0, int i, Composer composer, int i2) {
        SettingsItem(str, str2, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void SettingsContent(final SettingsController controller, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Composer startRestartGroup = composer.startRestartGroup(-462556036);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(controller) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-462556036, i2, -1, "org.betup.ui.fragment.settings.compose.SettingsContent (SettingsContent.kt:40)");
            }
            State collectAsState = SnapshotStateKt.collectAsState(controller.isBetPushEnabled(), null, startRestartGroup, 0, 1);
            State collectAsState2 = SnapshotStateKt.collectAsState(controller.isMatchPushEnabled(), null, startRestartGroup, 0, 1);
            State collectAsState3 = SnapshotStateKt.collectAsState(controller.getShowInviteCode(), null, startRestartGroup, 0, 1);
            Modifier verticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default);
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
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            SectionHeader(StringResources_androidKt.stringResource(R.string.lay_preferences, startRestartGroup, 6), startRestartGroup, 0);
            float f = 4;
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
            String stringResource = StringResources_androidKt.stringResource(R.string.balance_history, startRestartGroup, 6);
            String stringResource2 = StringResources_androidKt.stringResource(R.string.balance_history_desc, startRestartGroup, 6);
            startRestartGroup.startReplaceGroup(5004770);
            boolean changedInstance = startRestartGroup.changedInstance(controller);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.settings.compose.SettingsContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit SettingsContent$lambda$31$lambda$4$lambda$3;
                        SettingsContent$lambda$31$lambda$4$lambda$3 = SettingsContentKt.SettingsContent$lambda$31$lambda$4$lambda$3(SettingsController.this);
                        return SettingsContent$lambda$31$lambda$4$lambda$3;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            SettingsItem(stringResource, stringResource2, (Function0) rememberedValue, startRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
            String stringResource3 = StringResources_androidKt.stringResource(R.string.lay_odds_format, startRestartGroup, 6);
            String stringResource4 = StringResources_androidKt.stringResource(R.string.lay_odds_format_descr, startRestartGroup, 6);
            startRestartGroup.startReplaceGroup(5004770);
            boolean changedInstance2 = startRestartGroup.changedInstance(controller);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.settings.compose.SettingsContentKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit SettingsContent$lambda$31$lambda$6$lambda$5;
                        SettingsContent$lambda$31$lambda$6$lambda$5 = SettingsContentKt.SettingsContent$lambda$31$lambda$6$lambda$5(SettingsController.this);
                        return SettingsContent$lambda$31$lambda$6$lambda$5;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            SettingsItem(stringResource3, stringResource4, (Function0) rememberedValue2, startRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
            String stringResource5 = StringResources_androidKt.stringResource(R.string.default_bet_amount_title, startRestartGroup, 6);
            String stringResource6 = StringResources_androidKt.stringResource(R.string.default_bet_amount_settings_subtitle, startRestartGroup, 6);
            startRestartGroup.startReplaceGroup(5004770);
            boolean changedInstance3 = startRestartGroup.changedInstance(controller);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.settings.compose.SettingsContentKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit SettingsContent$lambda$31$lambda$8$lambda$7;
                        SettingsContent$lambda$31$lambda$8$lambda$7 = SettingsContentKt.SettingsContent$lambda$31$lambda$8$lambda$7(SettingsController.this);
                        return SettingsContent$lambda$31$lambda$8$lambda$7;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceGroup();
            SettingsItem(stringResource5, stringResource6, (Function0) rememberedValue3, startRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
            startRestartGroup.startReplaceGroup(-1117554006);
            if (SettingsContent$lambda$2(collectAsState3)) {
                String stringResource7 = StringResources_androidKt.stringResource(R.string.enter_invite_code, startRestartGroup, 6);
                String stringResource8 = StringResources_androidKt.stringResource(R.string.enter_code_desc, startRestartGroup, 6);
                startRestartGroup.startReplaceGroup(5004770);
                boolean changedInstance4 = startRestartGroup.changedInstance(controller);
                Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changedInstance4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new Function0() { // from class: org.betup.ui.fragment.settings.compose.SettingsContentKt$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit SettingsContent$lambda$31$lambda$10$lambda$9;
                            SettingsContent$lambda$31$lambda$10$lambda$9 = SettingsContentKt.SettingsContent$lambda$31$lambda$10$lambda$9(SettingsController.this);
                            return SettingsContent$lambda$31$lambda$10$lambda$9;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                startRestartGroup.endReplaceGroup();
                SettingsItem(stringResource7, stringResource8, (Function0) rememberedValue4, startRestartGroup, 0);
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
            }
            startRestartGroup.endReplaceGroup();
            String stringResource9 = StringResources_androidKt.stringResource(R.string.change_display_name, startRestartGroup, 6);
            String stringResource10 = StringResources_androidKt.stringResource(R.string.change_name_desc, startRestartGroup, 6);
            startRestartGroup.startReplaceGroup(5004770);
            boolean changedInstance5 = startRestartGroup.changedInstance(controller);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance5 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new Function0() { // from class: org.betup.ui.fragment.settings.compose.SettingsContentKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit SettingsContent$lambda$31$lambda$12$lambda$11;
                        SettingsContent$lambda$31$lambda$12$lambda$11 = SettingsContentKt.SettingsContent$lambda$31$lambda$12$lambda$11(SettingsController.this);
                        return SettingsContent$lambda$31$lambda$12$lambda$11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            startRestartGroup.endReplaceGroup();
            SettingsItem(stringResource9, stringResource10, (Function0) rememberedValue5, startRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
            String stringResource11 = StringResources_androidKt.stringResource(R.string.change_display_language, startRestartGroup, 6);
            String stringResource12 = StringResources_androidKt.stringResource(R.string.change_interface_language, startRestartGroup, 6);
            startRestartGroup.startReplaceGroup(5004770);
            boolean changedInstance6 = startRestartGroup.changedInstance(controller);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (changedInstance6 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new Function0() { // from class: org.betup.ui.fragment.settings.compose.SettingsContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit SettingsContent$lambda$31$lambda$14$lambda$13;
                        SettingsContent$lambda$31$lambda$14$lambda$13 = SettingsContentKt.SettingsContent$lambda$31$lambda$14$lambda$13(SettingsController.this);
                        return SettingsContent$lambda$31$lambda$14$lambda$13;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            startRestartGroup.endReplaceGroup();
            SettingsItem(stringResource11, stringResource12, (Function0) rememberedValue6, startRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
            String stringResource13 = StringResources_androidKt.stringResource(R.string.configure_app_experience, startRestartGroup, 6);
            String stringResource14 = StringResources_androidKt.stringResource(R.string.app_experience_desc, startRestartGroup, 6);
            startRestartGroup.startReplaceGroup(5004770);
            boolean changedInstance7 = startRestartGroup.changedInstance(controller);
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (changedInstance7 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new Function0() { // from class: org.betup.ui.fragment.settings.compose.SettingsContentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit SettingsContent$lambda$31$lambda$16$lambda$15;
                        SettingsContent$lambda$31$lambda$16$lambda$15 = SettingsContentKt.SettingsContent$lambda$31$lambda$16$lambda$15(SettingsController.this);
                        return SettingsContent$lambda$31$lambda$16$lambda$15;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            startRestartGroup.endReplaceGroup();
            SettingsItem(stringResource13, stringResource14, (Function0) rememberedValue7, startRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
            String stringResource15 = StringResources_androidKt.stringResource(R.string.change_country, startRestartGroup, 6);
            String stringResource16 = StringResources_androidKt.stringResource(R.string.change_country_desc, startRestartGroup, 6);
            startRestartGroup.startReplaceGroup(5004770);
            boolean changedInstance8 = startRestartGroup.changedInstance(controller);
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (changedInstance8 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new Function0() { // from class: org.betup.ui.fragment.settings.compose.SettingsContentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit SettingsContent$lambda$31$lambda$18$lambda$17;
                        SettingsContent$lambda$31$lambda$18$lambda$17 = SettingsContentKt.SettingsContent$lambda$31$lambda$18$lambda$17(SettingsController.this);
                        return SettingsContent$lambda$31$lambda$18$lambda$17;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            startRestartGroup.endReplaceGroup();
            SettingsItem(stringResource15, stringResource16, (Function0) rememberedValue8, startRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
            String stringResource17 = StringResources_androidKt.stringResource(R.string.lay_photo_name, startRestartGroup, 6);
            String stringResource18 = StringResources_androidKt.stringResource(R.string.lay_photo_descr, startRestartGroup, 6);
            startRestartGroup.startReplaceGroup(5004770);
            boolean changedInstance9 = startRestartGroup.changedInstance(controller);
            Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (changedInstance9 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = new Function0() { // from class: org.betup.ui.fragment.settings.compose.SettingsContentKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit SettingsContent$lambda$31$lambda$20$lambda$19;
                        SettingsContent$lambda$31$lambda$20$lambda$19 = SettingsContentKt.SettingsContent$lambda$31$lambda$20$lambda$19(SettingsController.this);
                        return SettingsContent$lambda$31$lambda$20$lambda$19;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            startRestartGroup.endReplaceGroup();
            SettingsItem(stringResource17, stringResource18, (Function0) rememberedValue9, startRestartGroup, 0);
            float f2 = 16;
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), startRestartGroup, 6);
            SectionHeader(StringResources_androidKt.stringResource(R.string.lay_notifications, startRestartGroup, 6), startRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
            String stringResource19 = StringResources_androidKt.stringResource(R.string.lay_notify_for_matches, startRestartGroup, 6);
            String stringResource20 = StringResources_androidKt.stringResource(R.string.lay_notify_for_matches, startRestartGroup, 6);
            startRestartGroup.startReplaceGroup(5004770);
            boolean changedInstance10 = startRestartGroup.changedInstance(controller);
            Object rememberedValue10 = startRestartGroup.rememberedValue();
            if (changedInstance10 || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = new Function0() { // from class: org.betup.ui.fragment.settings.compose.SettingsContentKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit SettingsContent$lambda$31$lambda$22$lambda$21;
                        SettingsContent$lambda$31$lambda$22$lambda$21 = SettingsContentKt.SettingsContent$lambda$31$lambda$22$lambda$21(SettingsController.this);
                        return SettingsContent$lambda$31$lambda$22$lambda$21;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue10);
            }
            startRestartGroup.endReplaceGroup();
            SettingsItem(stringResource19, stringResource20, (Function0) rememberedValue10, startRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
            String stringResource21 = StringResources_androidKt.stringResource(R.string.lay_on_off_bet_won, startRestartGroup, 6);
            String stringResource22 = StringResources_androidKt.stringResource(R.string.lay_check_notification, startRestartGroup, 6);
            boolean SettingsContent$lambda$0 = SettingsContent$lambda$0(collectAsState);
            startRestartGroup.startReplaceGroup(5004770);
            boolean changedInstance11 = startRestartGroup.changedInstance(controller);
            Object rememberedValue11 = startRestartGroup.rememberedValue();
            if (changedInstance11 || rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                rememberedValue11 = new Function1() { // from class: org.betup.ui.fragment.settings.compose.SettingsContentKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit SettingsContent$lambda$31$lambda$24$lambda$23;
                        SettingsContent$lambda$31$lambda$24$lambda$23 = SettingsContentKt.SettingsContent$lambda$31$lambda$24$lambda$23(SettingsController.this, ((Boolean) obj).booleanValue());
                        return SettingsContent$lambda$31$lambda$24$lambda$23;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue11);
            }
            startRestartGroup.endReplaceGroup();
            NotificationCheckboxItem(stringResource21, stringResource22, SettingsContent$lambda$0, (Function1) rememberedValue11, startRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
            String stringResource23 = StringResources_androidKt.stringResource(R.string.lay_on_off_favor_team, startRestartGroup, 6);
            String stringResource24 = StringResources_androidKt.stringResource(R.string.lay_notif_when_playng, startRestartGroup, 6);
            boolean SettingsContent$lambda$1 = SettingsContent$lambda$1(collectAsState2);
            startRestartGroup.startReplaceGroup(5004770);
            boolean changedInstance12 = startRestartGroup.changedInstance(controller);
            Object rememberedValue12 = startRestartGroup.rememberedValue();
            if (changedInstance12 || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                rememberedValue12 = new Function1() { // from class: org.betup.ui.fragment.settings.compose.SettingsContentKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit SettingsContent$lambda$31$lambda$26$lambda$25;
                        SettingsContent$lambda$31$lambda$26$lambda$25 = SettingsContentKt.SettingsContent$lambda$31$lambda$26$lambda$25(SettingsController.this, ((Boolean) obj).booleanValue());
                        return SettingsContent$lambda$31$lambda$26$lambda$25;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue12);
            }
            startRestartGroup.endReplaceGroup();
            NotificationCheckboxItem(stringResource23, stringResource24, SettingsContent$lambda$1, (Function1) rememberedValue12, startRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), startRestartGroup, 6);
            SectionHeader(StringResources_androidKt.stringResource(R.string.lay_logout_setting, startRestartGroup, 6), startRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
            String stringResource25 = StringResources_androidKt.stringResource(R.string.lay_logout, startRestartGroup, 6);
            startRestartGroup.startReplaceGroup(5004770);
            boolean changedInstance13 = startRestartGroup.changedInstance(controller);
            Object rememberedValue13 = startRestartGroup.rememberedValue();
            if (changedInstance13 || rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                rememberedValue13 = new Function0() { // from class: org.betup.ui.fragment.settings.compose.SettingsContentKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit SettingsContent$lambda$31$lambda$28$lambda$27;
                        SettingsContent$lambda$31$lambda$28$lambda$27 = SettingsContentKt.SettingsContent$lambda$31$lambda$28$lambda$27(SettingsController.this);
                        return SettingsContent$lambda$31$lambda$28$lambda$27;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue13);
            }
            startRestartGroup.endReplaceGroup();
            SettingsItem(stringResource25, "", (Function0) rememberedValue13, startRestartGroup, 48);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
            String stringResource26 = StringResources_androidKt.stringResource(R.string.delete_my_account, startRestartGroup, 6);
            startRestartGroup.startReplaceGroup(5004770);
            boolean changedInstance14 = startRestartGroup.changedInstance(controller);
            Object rememberedValue14 = startRestartGroup.rememberedValue();
            if (changedInstance14 || rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                rememberedValue14 = new Function0() { // from class: org.betup.ui.fragment.settings.compose.SettingsContentKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit SettingsContent$lambda$31$lambda$30$lambda$29;
                        SettingsContent$lambda$31$lambda$30$lambda$29 = SettingsContentKt.SettingsContent$lambda$31$lambda$30$lambda$29(SettingsController.this);
                        return SettingsContent$lambda$31$lambda$30$lambda$29;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue14);
            }
            startRestartGroup.endReplaceGroup();
            SettingsItem(stringResource26, "", (Function0) rememberedValue14, startRestartGroup, 48);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), startRestartGroup, 6);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.settings.compose.SettingsContentKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SettingsContent$lambda$32;
                    SettingsContent$lambda$32 = SettingsContentKt.SettingsContent$lambda$32(SettingsController.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return SettingsContent$lambda$32;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsContent$lambda$31$lambda$4$lambda$3(SettingsController settingsController) {
        settingsController.onBalanceHistory();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsContent$lambda$31$lambda$6$lambda$5(SettingsController settingsController) {
        settingsController.onOddsFormatClick();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsContent$lambda$31$lambda$8$lambda$7(SettingsController settingsController) {
        settingsController.onDefaultBetAmountClick();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsContent$lambda$31$lambda$10$lambda$9(SettingsController settingsController) {
        settingsController.onEnterInviteCode();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsContent$lambda$31$lambda$12$lambda$11(SettingsController settingsController) {
        settingsController.onChangeName();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsContent$lambda$31$lambda$14$lambda$13(SettingsController settingsController) {
        settingsController.onChangeLanguage();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsContent$lambda$31$lambda$16$lambda$15(SettingsController settingsController) {
        settingsController.onVisualEffects();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsContent$lambda$31$lambda$18$lambda$17(SettingsController settingsController) {
        settingsController.onChangeCountry();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsContent$lambda$31$lambda$20$lambda$19(SettingsController settingsController) {
        settingsController.onChangeProfilePhoto();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsContent$lambda$31$lambda$22$lambda$21(SettingsController settingsController) {
        settingsController.onNotificationForMatches();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsContent$lambda$31$lambda$24$lambda$23(SettingsController settingsController, boolean z) {
        settingsController.onBetPushChanged(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsContent$lambda$31$lambda$26$lambda$25(SettingsController settingsController, boolean z) {
        settingsController.onMatchPushChanged(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsContent$lambda$31$lambda$28$lambda$27(SettingsController settingsController) {
        settingsController.onLogout();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsContent$lambda$31$lambda$30$lambda$29(SettingsController settingsController) {
        settingsController.onDeleteAccount();
        return Unit.INSTANCE;
    }

    private static final void SectionHeader(final String str, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1329842318);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1329842318, i2, -1, "org.betup.ui.fragment.settings.compose.SectionHeader (SettingsContent.kt:184)");
            }
            float f = 10;
            Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), null, 2, null), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = startRestartGroup;
            TextKt.m3621Text4IGK_g(str, (Modifier) null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(20), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i2 & 14) | 199680, 0, 131026);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.settings.compose.SettingsContentKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SectionHeader$lambda$34;
                    SectionHeader$lambda$34 = SettingsContentKt.SectionHeader$lambda$34(str, i, (Composer) obj, ((Integer) obj2).intValue());
                    return SectionHeader$lambda$34;
                }
            });
        }
    }

    private static final void SettingsItem(final String str, final String str2, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composer3;
        Composer startRestartGroup = composer.startRestartGroup(-1522690447);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & Opcodes.I2S) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1522690447, i3, -1, "org.betup.ui.fragment.settings.compose.SettingsItem (SettingsContent.kt:205)");
            }
            float f = 15;
            Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(ClickableKt.m1059clickableXHw0xAI$default(BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), null, 2, null), false, null, null, function0, 7, null), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f));
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 54);
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
            Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            Modifier weight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m3621Text4IGK_g(str, (Modifier) null, ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(18), (FontStyle) null, FontWeight.INSTANCE.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, (i3 & 14) | 199680, 0, 131026);
            startRestartGroup.startReplaceGroup(-549256886);
            if (str2.length() > 0) {
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(4)), startRestartGroup, 6);
                composer2 = startRestartGroup;
                TextKt.m3621Text4IGK_g(str2, (Modifier) null, ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(13), (FontStyle) null, FontWeight.INSTANCE.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, ((i3 >> 3) & 14) | 199680, 0, 131026);
            } else {
                composer2 = startRestartGroup;
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer3 = composer2;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.arrow_light_right, composer3, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(24)), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m5209tintxETnrds$default(ColorFilter.INSTANCE, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0, 2, null), composer3, 432, 56);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer3 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.settings.compose.SettingsContentKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SettingsItem$lambda$37;
                    SettingsItem$lambda$37 = SettingsContentKt.SettingsItem$lambda$37(str, str2, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                    return SettingsItem$lambda$37;
                }
            });
        }
    }

    private static final void NotificationCheckboxItem(final String str, final String str2, final boolean z, final Function1<? super Boolean, Unit> function1, Composer composer, final int i) {
        int i2;
        int i3;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-486555399);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        int i4 = i2;
        if ((i4 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-486555399, i4, -1, "org.betup.ui.fragment.settings.compose.NotificationCheckboxItem (SettingsContent.kt:251)");
            }
            Modifier m1025backgroundbw27NRU$default = BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), null, 2, null);
            startRestartGroup.startReplaceGroup(-1633490746);
            boolean z2 = ((i4 & 7168) == 2048) | ((i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.settings.compose.SettingsContentKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit NotificationCheckboxItem$lambda$39$lambda$38;
                        NotificationCheckboxItem$lambda$39$lambda$38 = SettingsContentKt.NotificationCheckboxItem$lambda$39$lambda$38(Function1.this, z);
                        return NotificationCheckboxItem$lambda$39$lambda$38;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            Modifier m1059clickableXHw0xAI$default = ClickableKt.m1059clickableXHw0xAI$default(m1025backgroundbw27NRU$default, false, null, null, (Function0) rememberedValue, 7, null);
            float f = 15;
            Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(m1059clickableXHw0xAI$default, Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f));
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 54);
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
            Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            Modifier weight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m3621Text4IGK_g(str, (Modifier) null, ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(18), (FontStyle) null, FontWeight.INSTANCE.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, (i4 & 14) | 199680, 0, 131026);
            startRestartGroup.startReplaceGroup(-275989806);
            if (str2.length() > 0) {
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(4)), startRestartGroup, 6);
                i3 = i4;
                composer2 = startRestartGroup;
                TextKt.m3621Text4IGK_g(str2, (Modifier) null, ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(13), (FontStyle) null, FontWeight.INSTANCE.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, ((i4 >> 3) & 14) | 199680, 0, 131026);
            } else {
                i3 = i4;
                composer2 = startRestartGroup;
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            CheckboxKt.Checkbox(z, function1, null, false, CheckboxDefaults.INSTANCE.m2777colors5tl4gsc(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), 0L, 0L, 0L, 0L, composer2, CheckboxDefaults.$stable << 18, 60), null, composer2, (i3 >> 6) & 126, 44);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.settings.compose.SettingsContentKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit NotificationCheckboxItem$lambda$42;
                    NotificationCheckboxItem$lambda$42 = SettingsContentKt.NotificationCheckboxItem$lambda$42(str, str2, z, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                    return NotificationCheckboxItem$lambda$42;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NotificationCheckboxItem$lambda$39$lambda$38(Function1 function1, boolean z) {
        function1.invoke(Boolean.valueOf(!z));
        return Unit.INSTANCE;
    }

    private static final boolean SettingsContent$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean SettingsContent$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean SettingsContent$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
