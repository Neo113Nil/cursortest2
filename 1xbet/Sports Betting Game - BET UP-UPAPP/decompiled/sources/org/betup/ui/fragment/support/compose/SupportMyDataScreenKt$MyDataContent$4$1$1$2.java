package org.betup.ui.fragment.support.compose;

import android.content.Context;
import android.util.Patterns;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.R;
import org.betup.ui.common.compose.CommonButtonKt;
import org.betup.ui.views.ComposeUtils;

/* compiled from: SupportMyDataScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class SupportMyDataScreenKt$MyDataContent$4$1$1$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<String> $emailError$delegate;
    final /* synthetic */ MutableState<String> $messageError$delegate;
    final /* synthetic */ Function0<Unit> $onCancelDeletionRequest;
    final /* synthetic */ Function0<Unit> $onDeleteAccount;
    final /* synthetic */ MyDataState $state;

    SupportMyDataScreenKt$MyDataContent$4$1$1$2(MyDataState myDataState, Function0<Unit> function0, Context context, Function0<Unit> function02, MutableState<String> mutableState, MutableState<String> mutableState2) {
        this.$state = myDataState;
        this.$onCancelDeletionRequest = function0;
        this.$context = context;
        this.$onDeleteAccount = function02;
        this.$emailError$delegate = mutableState;
        this.$messageError$delegate = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$1$lambda$0(MyDataState myDataState, Context context, Function0 function0, MutableState mutableState, MutableState mutableState2) {
        mutableState.setValue(null);
        mutableState2.setValue(null);
        if (!StringsKt.isBlank(myDataState.getEmail())) {
            if (Patterns.EMAIL_ADDRESS.matcher(myDataState.getEmail()).matches()) {
                function0.invoke();
                return Unit.INSTANCE;
            }
            mutableState.setValue(context.getString(R.string.invalid_email));
            return Unit.INSTANCE;
        }
        mutableState.setValue(context.getString(R.string.please_enter_email_asterisk));
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        final MutableState<String> mutableState;
        final MutableState<String> mutableState2;
        int i2;
        String MyDataContent$lambda$1;
        String MyDataContent$lambda$4;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1510763903, i, -1, "org.betup.ui.fragment.support.compose.MyDataContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SupportMyDataScreen.kt:94)");
        }
        Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(20), Dp.m7774constructorimpl(16));
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(12));
        final MyDataState myDataState = this.$state;
        Function0<Unit> function0 = this.$onCancelDeletionRequest;
        final Context context = this.$context;
        final Function0<Unit> function02 = this.$onDeleteAccount;
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
        if (myDataState.getHasActiveRequest()) {
            composer.startReplaceGroup(-1907047223);
            mutableState = mutableState4;
            mutableState2 = mutableState3;
            i2 = 12;
            CommonButtonKt.m12915CommonButtonUPEs2M4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, StringResources_androidKt.stringResource(R.string.cancel_account_deletion_request, composer, 6), false, false, !myDataState.isCancelling(), function0, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer, 54, 0, 0, 2097048);
            composer.endReplaceGroup();
        } else {
            mutableState = mutableState4;
            mutableState2 = mutableState3;
            i2 = 12;
            composer.startReplaceGroup(-1906532902);
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            String stringResource = StringResources_androidKt.stringResource(R.string.send, composer, 6);
            boolean z = !myDataState.isSending();
            composer.startReplaceGroup(-1224400529);
            boolean changed = composer.changed(myDataState) | composer.changedInstance(context) | composer.changed(function02);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.support.compose.SupportMyDataScreenKt$MyDataContent$4$1$1$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$4$lambda$1$lambda$0;
                        invoke$lambda$4$lambda$1$lambda$0 = SupportMyDataScreenKt$MyDataContent$4$1$1$2.invoke$lambda$4$lambda$1$lambda$0(MyDataState.this, context, function02, mutableState2, mutableState);
                        return invoke$lambda$4$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            CommonButtonKt.m12915CommonButtonUPEs2M4(fillMaxWidth$default, true, stringResource, false, false, z, (Function0) rememberedValue, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer, 54, 0, 0, 2097048);
            composer.endReplaceGroup();
        }
        MyDataContent$lambda$1 = SupportMyDataScreenKt.MyDataContent$lambda$1(mutableState2);
        composer.startReplaceGroup(1462564472);
        if (MyDataContent$lambda$1 != null) {
            TextKt.m3621Text4IGK_g(MyDataContent$lambda$1, (Modifier) null, ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), TextUnitKt.getSp(i2), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3072, 0, 131058);
        }
        composer.endReplaceGroup();
        MyDataContent$lambda$4 = SupportMyDataScreenKt.MyDataContent$lambda$4(mutableState);
        composer.startReplaceGroup(1462575160);
        if (MyDataContent$lambda$4 != null) {
            TextKt.m3621Text4IGK_g(MyDataContent$lambda$4, (Modifier) null, ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), TextUnitKt.getSp(i2), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3072, 0, 131058);
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
