package org.betup.ui.fragment.support.compose;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.ui.views.ComposeUtils;

/* compiled from: SupportMyDataScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class SupportMyDataScreenKt$MyDataContent$4$1$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MutableState<String> $emailError$delegate;
    final /* synthetic */ MutableState<String> $messageError$delegate;
    final /* synthetic */ Function1<String, Unit> $onEmailChanged;
    final /* synthetic */ Function1<String, Unit> $onMessageChanged;
    final /* synthetic */ MyDataState $state;

    /* JADX WARN: Multi-variable type inference failed */
    SupportMyDataScreenKt$MyDataContent$4$1$1$1(MyDataState myDataState, Function1<? super String, Unit> function1, Function1<? super String, Unit> function12, MutableState<String> mutableState, MutableState<String> mutableState2) {
        this.$state = myDataState;
        this.$onEmailChanged = function1;
        this.$onMessageChanged = function12;
        this.$emailError$delegate = mutableState;
        this.$messageError$delegate = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$1$lambda$0(Function1 function1, MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it);
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$4$lambda$3(Function1 function1, MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it);
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        String MyDataContent$lambda$1;
        String MyDataContent$lambda$12;
        final MutableState<String> mutableState;
        String MyDataContent$lambda$13;
        String MyDataContent$lambda$4;
        String MyDataContent$lambda$42;
        final MutableState<String> mutableState2;
        String MyDataContent$lambda$43;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(288161278, i, -1, "org.betup.ui.fragment.support.compose.MyDataContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SupportMyDataScreen.kt:152)");
        }
        float f = 24;
        Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f));
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(16));
        MyDataState myDataState = this.$state;
        final Function1<String, Unit> function1 = this.$onEmailChanged;
        final Function1<String, Unit> function12 = this.$onMessageChanged;
        MutableState<String> mutableState3 = this.$emailError$delegate;
        MutableState<String> mutableState4 = this.$messageError$delegate;
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
        TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.account_deletion_info, composer, 6), (Modifier) null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(16), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3072, 6, 130034);
        float f2 = 4;
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), composer, 6);
        TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.email, composer, 6), (Modifier) null, ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3072, 0, 131058);
        RoundedCornerShape m1810RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(50));
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        String email = myDataState.getEmail();
        boolean z = (myDataState.getHasActiveRequest() || myDataState.isSending()) ? false : true;
        MyDataContent$lambda$1 = SupportMyDataScreenKt.MyDataContent$lambda$1(mutableState3);
        boolean z2 = MyDataContent$lambda$1 != null;
        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
        long j = ComposeUtils.AppColorPalette.BackgroundListBetsItem.INSTANCE.getColor();
        long j2 = ComposeUtils.AppColorPalette.BackgroundListBetsItem.INSTANCE.getColor();
        long j3 = ComposeUtils.AppColorPalette.BackgroundListBetsItem.INSTANCE.getColor();
        MyDataContent$lambda$12 = SupportMyDataScreenKt.MyDataContent$lambda$1(mutableState3);
        TextFieldColors m3602colors0hiis_0 = textFieldDefaults.m3602colors0hiis_0(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), 0L, j2, j, j3, 0L, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0L, null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), MyDataContent$lambda$12 != null ? ComposeUtils.AppColorPalette.Red.INSTANCE.getColor() : ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 0, 0, 0, 0, 3072, 2147468936, 4095);
        composer.startReplaceGroup(-1633490746);
        boolean changed = composer.changed(function1);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            mutableState = mutableState3;
            rememberedValue = new Function1() { // from class: org.betup.ui.fragment.support.compose.SupportMyDataScreenKt$MyDataContent$4$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$7$lambda$1$lambda$0;
                    invoke$lambda$7$lambda$1$lambda$0 = SupportMyDataScreenKt$MyDataContent$4$1$1$1.invoke$lambda$7$lambda$1$lambda$0(Function1.this, mutableState, (String) obj);
                    return invoke$lambda$7$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        } else {
            mutableState = mutableState3;
        }
        composer.endReplaceGroup();
        OutlinedTextFieldKt.OutlinedTextField(email, (Function1<? super String, Unit>) rememberedValue, fillMaxWidth$default, z, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$SupportMyDataScreenKt.INSTANCE.m14154getLambda$2089732627$app_release(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, z2, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) m1810RoundedCornerShape0680j_4, m3602colors0hiis_0, composer, 12583296, 12582912, 0, 1957744);
        MyDataContent$lambda$13 = SupportMyDataScreenKt.MyDataContent$lambda$1(mutableState);
        composer.startReplaceGroup(-932451726);
        if (MyDataContent$lambda$13 != null) {
            TextKt.m3621Text4IGK_g(MyDataContent$lambda$13, PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(f2), 0.0f, 0.0f, 12, null), ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3120, 0, 131056);
            Unit unit = Unit.INSTANCE;
            Unit unit2 = Unit.INSTANCE;
        }
        composer.endReplaceGroup();
        TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.details_explaining_request, composer, 6), (Modifier) null, ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3072, 0, 131058);
        RoundedCornerShape m1810RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(12));
        Modifier m1549height3ABfNKs = SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(160));
        String message = myDataState.getMessage();
        boolean z3 = (myDataState.getHasActiveRequest() || myDataState.isSending()) ? false : true;
        MyDataContent$lambda$4 = SupportMyDataScreenKt.MyDataContent$lambda$4(mutableState4);
        boolean z4 = MyDataContent$lambda$4 != null;
        TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.INSTANCE;
        long j4 = ComposeUtils.AppColorPalette.BackgroundListBetsItem.INSTANCE.getColor();
        long j5 = ComposeUtils.AppColorPalette.BackgroundListBetsItem.INSTANCE.getColor();
        long j6 = ComposeUtils.AppColorPalette.BackgroundListBetsItem.INSTANCE.getColor();
        MyDataContent$lambda$42 = SupportMyDataScreenKt.MyDataContent$lambda$4(mutableState4);
        TextFieldColors m3602colors0hiis_02 = textFieldDefaults2.m3602colors0hiis_0(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), 0L, j5, j4, j6, 0L, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0L, null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), MyDataContent$lambda$42 != null ? ComposeUtils.AppColorPalette.Red.INSTANCE.getColor() : ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 0, 0, 0, 0, 3072, 2147468936, 4095);
        composer.startReplaceGroup(-1633490746);
        boolean changed2 = composer.changed(function12);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            mutableState2 = mutableState4;
            rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.support.compose.SupportMyDataScreenKt$MyDataContent$4$1$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$7$lambda$4$lambda$3;
                    invoke$lambda$7$lambda$4$lambda$3 = SupportMyDataScreenKt$MyDataContent$4$1$1$1.invoke$lambda$7$lambda$4$lambda$3(Function1.this, mutableState2, (String) obj);
                    return invoke$lambda$7$lambda$4$lambda$3;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        } else {
            mutableState2 = mutableState4;
        }
        composer.endReplaceGroup();
        OutlinedTextFieldKt.OutlinedTextField(message, (Function1<? super String, Unit>) rememberedValue2, m1549height3ABfNKs, z3, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$SupportMyDataScreenKt.INSTANCE.getLambda$799959460$app_release(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, z4, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 6, 0, (MutableInteractionSource) null, (Shape) m1810RoundedCornerShape0680j_42, m3602colors0hiis_02, composer, 12583296, 100663296, 0, 1826672);
        MyDataContent$lambda$43 = SupportMyDataScreenKt.MyDataContent$lambda$4(mutableState2);
        composer.startReplaceGroup(-932352494);
        if (MyDataContent$lambda$43 != null) {
            TextKt.m3621Text4IGK_g(MyDataContent$lambda$43, PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(f2), 0.0f, 0.0f, 12, null), ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3120, 0, 131056);
            Unit unit3 = Unit.INSTANCE;
            Unit unit4 = Unit.INSTANCE;
        }
        composer.endReplaceGroup();
        String errorMessage = myDataState.getErrorMessage();
        composer.startReplaceGroup(-932336248);
        if (errorMessage != null) {
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(8)), composer, 6);
            TextKt.m3621Text4IGK_g(errorMessage, PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f2), 0.0f, 2, null), ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3120, 0, 130544);
            Unit unit5 = Unit.INSTANCE;
            Unit unit6 = Unit.INSTANCE;
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
