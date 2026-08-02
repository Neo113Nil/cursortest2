package org.betup.ui.dialogs.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ProgressIndicatorKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.country.CountryModel;
import org.betup.ui.views.ComposeUtils;

/* compiled from: ChangeCountryDialogScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ChangeCountryDialogScreenKt$ChangeCountryDialogScreen$2$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MutableState<List<CountryModel>> $countries$delegate;
    final /* synthetic */ MutableState<String> $errorMessage$delegate;
    final /* synthetic */ MutableState<Boolean> $isLoading$delegate;
    final /* synthetic */ MutableState<CountryModel> $selectedCountry$delegate;

    ChangeCountryDialogScreenKt$ChangeCountryDialogScreen$2$1(MutableState<Boolean> mutableState, MutableState<String> mutableState2, MutableState<List<CountryModel>> mutableState3, MutableState<CountryModel> mutableState4) {
        this.$isLoading$delegate = mutableState;
        this.$errorMessage$delegate = mutableState2;
        this.$countries$delegate = mutableState3;
        this.$selectedCountry$delegate = mutableState4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(MutableState mutableState, CountryModel country) {
        Intrinsics.checkNotNullParameter(country, "country");
        mutableState.setValue(country);
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        boolean ChangeCountryDialogScreen$lambda$7;
        String ChangeCountryDialogScreen$lambda$13;
        List ChangeCountryDialogScreen$lambda$1;
        CountryModel ChangeCountryDialogScreen$lambda$4;
        String ChangeCountryDialogScreen$lambda$132;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1857090790, i, -1, "org.betup.ui.dialogs.compose.ChangeCountryDialogScreen.<anonymous>.<anonymous> (ChangeCountryDialogScreen.kt:164)");
        }
        Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(24));
        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
        MutableState<Boolean> mutableState = this.$isLoading$delegate;
        MutableState<String> mutableState2 = this.$errorMessage$delegate;
        MutableState<List<CountryModel>> mutableState3 = this.$countries$delegate;
        final MutableState<CountryModel> mutableState4 = this.$selectedCountry$delegate;
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
        ChangeCountryDialogScreen$lambda$7 = ChangeCountryDialogScreenKt.ChangeCountryDialogScreen$lambda$7(mutableState);
        if (ChangeCountryDialogScreen$lambda$7) {
            composer.startReplaceGroup(1949755030);
            ProgressIndicatorKt.m3295CircularProgressIndicatorLxG7B9w(PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(32)), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0.0f, 0L, 0, composer, 6, 28);
            composer.endReplaceGroup();
        } else {
            ChangeCountryDialogScreen$lambda$13 = ChangeCountryDialogScreenKt.ChangeCountryDialogScreen$lambda$13(mutableState2);
            if (ChangeCountryDialogScreen$lambda$13 != null) {
                composer.startReplaceGroup(1950031023);
                ChangeCountryDialogScreen$lambda$132 = ChangeCountryDialogScreenKt.ChangeCountryDialogScreen$lambda$13(mutableState2);
                if (ChangeCountryDialogScreen$lambda$132 == null) {
                    ChangeCountryDialogScreen$lambda$132 = "";
                }
                TextKt.m3621Text4IGK_g(ChangeCountryDialogScreen$lambda$132, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 199728, 0, 130512);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1950470014);
                ChangeCountryDialogScreen$lambda$1 = ChangeCountryDialogScreenKt.ChangeCountryDialogScreen$lambda$1(mutableState3);
                ChangeCountryDialogScreen$lambda$4 = ChangeCountryDialogScreenKt.ChangeCountryDialogScreen$lambda$4(mutableState4);
                composer.startReplaceGroup(5004770);
                Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: org.betup.ui.dialogs.compose.ChangeCountryDialogScreenKt$ChangeCountryDialogScreen$2$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$2$lambda$1$lambda$0;
                            invoke$lambda$2$lambda$1$lambda$0 = ChangeCountryDialogScreenKt$ChangeCountryDialogScreen$2$1.invoke$lambda$2$lambda$1$lambda$0(MutableState.this, (CountryModel) obj);
                            return invoke$lambda$2$lambda$1$lambda$0;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                CountryDropdownElementKt.CountryDropdownElement(ChangeCountryDialogScreen$lambda$1, ChangeCountryDialogScreen$lambda$4, (Function1) rememberedValue, null, composer, RendererCapabilities.DECODER_SUPPORT_MASK, 8);
                composer.endReplaceGroup();
            }
        }
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
