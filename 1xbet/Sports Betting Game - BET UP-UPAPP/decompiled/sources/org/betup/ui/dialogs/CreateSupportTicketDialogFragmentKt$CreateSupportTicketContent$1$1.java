package org.betup.ui.dialogs;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.ui.fragment.support.compose.SupportFeedbackTypeSelectorKt;
import org.betup.ui.views.ComposeUtils;

/* compiled from: CreateSupportTicketDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CreateSupportTicketDialogFragmentKt$CreateSupportTicketContent$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ List<String> $categoryNames;
    final /* synthetic */ MutableState<String> $details$delegate;
    final /* synthetic */ MutableState<String> $detailsError$delegate;
    final /* synthetic */ MutableState<Integer> $selectedCategoryIndex$delegate;

    CreateSupportTicketDialogFragmentKt$CreateSupportTicketContent$1$1(List<String> list, MutableState<Integer> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3) {
        this.$categoryNames = list;
        this.$selectedCategoryIndex$delegate = mutableState;
        this.$details$delegate = mutableState2;
        this.$detailsError$delegate = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$1$lambda$0(MutableState mutableState, int i) {
        CreateSupportTicketDialogFragmentKt.CreateSupportTicketContent$lambda$7(mutableState, i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$3$lambda$2(MutableState mutableState, MutableState mutableState2, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        mutableState2.setValue(null);
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        int CreateSupportTicketContent$lambda$6;
        String CreateSupportTicketContent$lambda$2;
        String CreateSupportTicketContent$lambda$9;
        String CreateSupportTicketContent$lambda$92;
        final MutableState<String> mutableState;
        String CreateSupportTicketContent$lambda$93;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2022243169, i, -1, "org.betup.ui.dialogs.CreateSupportTicketContent.<anonymous>.<anonymous> (CreateSupportTicketDialogFragment.kt:169)");
        }
        float f = 24;
        Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f));
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(16));
        List<String> list = this.$categoryNames;
        final MutableState<Integer> mutableState2 = this.$selectedCategoryIndex$delegate;
        final MutableState<String> mutableState3 = this.$details$delegate;
        MutableState<String> mutableState4 = this.$detailsError$delegate;
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
        TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.category_selector, composer, 6), (Modifier) null, ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3072, 0, 131058);
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        CreateSupportTicketContent$lambda$6 = CreateSupportTicketDialogFragmentKt.CreateSupportTicketContent$lambda$6(mutableState2);
        composer.startReplaceGroup(5004770);
        boolean changed = composer.changed(mutableState2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: org.betup.ui.dialogs.CreateSupportTicketDialogFragmentKt$CreateSupportTicketContent$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$5$lambda$1$lambda$0;
                    invoke$lambda$5$lambda$1$lambda$0 = CreateSupportTicketDialogFragmentKt$CreateSupportTicketContent$1$1.invoke$lambda$5$lambda$1$lambda$0(MutableState.this, ((Integer) obj).intValue());
                    return invoke$lambda$5$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        SupportFeedbackTypeSelectorKt.SupportFeedbackTypeSelector(fillMaxWidth$default, list, CreateSupportTicketContent$lambda$6, true, (Function1) rememberedValue, composer, 3078, 0);
        TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.details, composer, 6), (Modifier) null, ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3072, 0, 131058);
        RoundedCornerShape m1810RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(12));
        Modifier m1549height3ABfNKs = SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(160));
        CreateSupportTicketContent$lambda$2 = CreateSupportTicketDialogFragmentKt.CreateSupportTicketContent$lambda$2(mutableState3);
        CreateSupportTicketContent$lambda$9 = CreateSupportTicketDialogFragmentKt.CreateSupportTicketContent$lambda$9(mutableState4);
        boolean z = CreateSupportTicketContent$lambda$9 != null;
        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
        long j = ComposeUtils.AppColorPalette.BackgroundListBetsItem.INSTANCE.getColor();
        long j2 = ComposeUtils.AppColorPalette.BackgroundListBetsItem.INSTANCE.getColor();
        CreateSupportTicketContent$lambda$92 = CreateSupportTicketDialogFragmentKt.CreateSupportTicketContent$lambda$9(mutableState4);
        TextFieldColors m3602colors0hiis_0 = textFieldDefaults.m3602colors0hiis_0(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), 0L, 0L, j2, j, 0L, 0L, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0L, null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), CreateSupportTicketContent$lambda$92 != null ? ComposeUtils.AppColorPalette.Red.INSTANCE.getColor() : ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 0, 0, 0, 0, 3072, 2147477196, 4095);
        composer.startReplaceGroup(-1633490746);
        boolean changed2 = composer.changed(mutableState3);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            mutableState = mutableState4;
            rememberedValue2 = new Function1() { // from class: org.betup.ui.dialogs.CreateSupportTicketDialogFragmentKt$CreateSupportTicketContent$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$5$lambda$3$lambda$2;
                    invoke$lambda$5$lambda$3$lambda$2 = CreateSupportTicketDialogFragmentKt$CreateSupportTicketContent$1$1.invoke$lambda$5$lambda$3$lambda$2(MutableState.this, mutableState, (String) obj);
                    return invoke$lambda$5$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        } else {
            mutableState = mutableState4;
        }
        composer.endReplaceGroup();
        OutlinedTextFieldKt.OutlinedTextField(CreateSupportTicketContent$lambda$2, (Function1<? super String, Unit>) rememberedValue2, m1549height3ABfNKs, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$CreateSupportTicketDialogFragmentKt.INSTANCE.m13020getLambda$1204981550$app_release(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, z, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 6, 0, (MutableInteractionSource) null, (Shape) m1810RoundedCornerShape0680j_4, m3602colors0hiis_0, composer, 12583296, 100663296, 0, 1826680);
        CreateSupportTicketContent$lambda$93 = CreateSupportTicketDialogFragmentKt.CreateSupportTicketContent$lambda$9(mutableState);
        composer.startReplaceGroup(2019446698);
        if (CreateSupportTicketContent$lambda$93 != null) {
            TextKt.m3621Text4IGK_g(CreateSupportTicketContent$lambda$93, (Modifier) null, ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3072, 0, 131058);
            Unit unit = Unit.INSTANCE;
            Unit unit2 = Unit.INSTANCE;
        }
        composer.endReplaceGroup();
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
