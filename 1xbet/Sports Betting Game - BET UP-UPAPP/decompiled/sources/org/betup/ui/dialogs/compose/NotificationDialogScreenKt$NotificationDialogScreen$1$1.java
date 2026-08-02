package org.betup.ui.dialogs.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.model.remote.entity.subscription.SubscriptionType;
import org.betup.ui.views.ComposeUtils;

/* compiled from: NotificationDialogScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class NotificationDialogScreenKt$NotificationDialogScreen$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MatchState $matchState;
    final /* synthetic */ MutableState<Set<SubscriptionType>> $selectedSubscriptions$delegate;

    NotificationDialogScreenKt$NotificationDialogScreen$1$1(MatchState matchState, MutableState<Set<SubscriptionType>> mutableState) {
        this.$matchState = matchState;
        this.$selectedSubscriptions$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$9$lambda$2$lambda$1(MutableState mutableState) {
        Set NotificationDialogScreen$lambda$1;
        NotificationDialogScreen$lambda$1 = NotificationDialogScreenKt.NotificationDialogScreen$lambda$1(mutableState);
        Set mutableSet = CollectionsKt.toMutableSet(NotificationDialogScreen$lambda$1);
        if (mutableSet.contains(SubscriptionType.START)) {
            mutableSet.remove(SubscriptionType.START);
        } else {
            mutableSet.add(SubscriptionType.START);
        }
        mutableState.setValue(mutableSet);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$9$lambda$5$lambda$4(MutableState mutableState) {
        Set NotificationDialogScreen$lambda$1;
        NotificationDialogScreen$lambda$1 = NotificationDialogScreenKt.NotificationDialogScreen$lambda$1(mutableState);
        Set mutableSet = CollectionsKt.toMutableSet(NotificationDialogScreen$lambda$1);
        if (mutableSet.contains(SubscriptionType.SCORE)) {
            mutableSet.remove(SubscriptionType.SCORE);
        } else {
            mutableSet.add(SubscriptionType.SCORE);
        }
        mutableState.setValue(mutableSet);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$9$lambda$8$lambda$7(MutableState mutableState) {
        Set NotificationDialogScreen$lambda$1;
        NotificationDialogScreen$lambda$1 = NotificationDialogScreenKt.NotificationDialogScreen$lambda$1(mutableState);
        Set mutableSet = CollectionsKt.toMutableSet(NotificationDialogScreen$lambda$1);
        if (mutableSet.contains(SubscriptionType.FINISH)) {
            mutableSet.remove(SubscriptionType.FINISH);
        } else {
            mutableSet.add(SubscriptionType.FINISH);
        }
        mutableState.setValue(mutableSet);
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        final MutableState<Set<SubscriptionType>> mutableState;
        Set NotificationDialogScreen$lambda$1;
        Set NotificationDialogScreen$lambda$12;
        Set NotificationDialogScreen$lambda$13;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-832279523, i, -1, "org.betup.ui.dialogs.compose.NotificationDialogScreen.<anonymous>.<anonymous> (NotificationDialogScreen.kt:102)");
        }
        float f = 16;
        Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(24));
        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
        MatchState matchState = this.$matchState;
        MutableState<Set<SubscriptionType>> mutableState2 = this.$selectedSubscriptions$delegate;
        ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
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
        TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.notify_me_when, composer, 6), PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(f), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(20), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer, 48, 0, 65020);
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), composer, 6);
        Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f), 0.0f, 2, null);
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(12));
        Alignment.Horizontal start = Alignment.INSTANCE.getStart();
        ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4, start, composer, 54);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, m1518paddingVpY3zN4$default);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor2);
        } else {
            composer.useNode();
        }
        Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer);
        Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        composer.startReplaceGroup(1143485142);
        if (matchState != MatchState.LIVE) {
            String stringResource = StringResources_androidKt.stringResource(R.string.notification_match_started, composer, 6);
            NotificationDialogScreen$lambda$13 = NotificationDialogScreenKt.NotificationDialogScreen$lambda$1(mutableState2);
            boolean contains = NotificationDialogScreen$lambda$13.contains(SubscriptionType.START);
            composer.startReplaceGroup(5004770);
            mutableState = mutableState2;
            boolean changed = composer.changed(mutableState);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.compose.NotificationDialogScreenKt$NotificationDialogScreen$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$10$lambda$9$lambda$2$lambda$1;
                        invoke$lambda$10$lambda$9$lambda$2$lambda$1 = NotificationDialogScreenKt$NotificationDialogScreen$1$1.invoke$lambda$10$lambda$9$lambda$2$lambda$1(MutableState.this);
                        return invoke$lambda$10$lambda$9$lambda$2$lambda$1;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            NotificationDialogScreenKt.NotificationCheckboxItem(stringResource, contains, (Function0) rememberedValue, composer, 0);
        } else {
            mutableState = mutableState2;
        }
        composer.endReplaceGroup();
        String stringResource2 = StringResources_androidKt.stringResource(R.string.notification_score_changed, composer, 6);
        NotificationDialogScreen$lambda$1 = NotificationDialogScreenKt.NotificationDialogScreen$lambda$1(mutableState);
        boolean contains2 = NotificationDialogScreen$lambda$1.contains(SubscriptionType.SCORE);
        composer.startReplaceGroup(5004770);
        boolean changed2 = composer.changed(mutableState);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.compose.NotificationDialogScreenKt$NotificationDialogScreen$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$10$lambda$9$lambda$5$lambda$4;
                    invoke$lambda$10$lambda$9$lambda$5$lambda$4 = NotificationDialogScreenKt$NotificationDialogScreen$1$1.invoke$lambda$10$lambda$9$lambda$5$lambda$4(MutableState.this);
                    return invoke$lambda$10$lambda$9$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        NotificationDialogScreenKt.NotificationCheckboxItem(stringResource2, contains2, (Function0) rememberedValue2, composer, 0);
        String stringResource3 = StringResources_androidKt.stringResource(R.string.notification_match_finished, composer, 6);
        NotificationDialogScreen$lambda$12 = NotificationDialogScreenKt.NotificationDialogScreen$lambda$1(mutableState);
        boolean contains3 = NotificationDialogScreen$lambda$12.contains(SubscriptionType.FINISH);
        composer.startReplaceGroup(5004770);
        boolean changed3 = composer.changed(mutableState);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function0() { // from class: org.betup.ui.dialogs.compose.NotificationDialogScreenKt$NotificationDialogScreen$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$10$lambda$9$lambda$8$lambda$7;
                    invoke$lambda$10$lambda$9$lambda$8$lambda$7 = NotificationDialogScreenKt$NotificationDialogScreen$1$1.invoke$lambda$10$lambda$9$lambda$8$lambda$7(MutableState.this);
                    return invoke$lambda$10$lambda$9$lambda$8$lambda$7;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceGroup();
        NotificationDialogScreenKt.NotificationCheckboxItem(stringResource3, contains3, (Function0) rememberedValue3, composer, 0);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
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
