package org.betup.ui.dialogs.compose;

import android.view.View;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
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
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.model.local.entity.OddType;
import org.betup.ui.common.compose.CommonButtonKt;

/* compiled from: OddsDialogScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class OddsDialogScreenKt$OddsDialogScreen$1$2$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MutableState<IntSize> $contentBottomSize$delegate;
    final /* synthetic */ MutableState<Float> $contentBottomY$delegate;
    final /* synthetic */ boolean $isContentBottomVisible;
    final /* synthetic */ boolean $isInTour;
    final /* synthetic */ Function1<OddType, Unit> $onDismiss;
    final /* synthetic */ MutableState<OddType> $selectedOddType$delegate;
    final /* synthetic */ View $view;

    /* JADX WARN: Multi-variable type inference failed */
    OddsDialogScreenKt$OddsDialogScreen$1$2$2(boolean z, View view, MutableState<IntSize> mutableState, MutableState<Float> mutableState2, boolean z2, Function1<? super OddType, Unit> function1, MutableState<OddType> mutableState3) {
        this.$isContentBottomVisible = z;
        this.$view = view;
        this.$contentBottomSize$delegate = mutableState;
        this.$contentBottomY$delegate = mutableState2;
        this.$isInTour = z2;
        this.$onDismiss = function1;
        this.$selectedOddType$delegate = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(View view, final MutableState mutableState, final MutableState mutableState2, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        final long mo6536getSizeYbymL2g = coordinates.mo6536getSizeYbymL2g();
        final float top = LayoutCoordinatesKt.boundsInParent(coordinates).getTop();
        view.post(new Runnable() { // from class: org.betup.ui.dialogs.compose.OddsDialogScreenKt$OddsDialogScreen$1$2$2$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                OddsDialogScreenKt$OddsDialogScreen$1$2$2.invoke$lambda$2$lambda$1$lambda$0(mo6536getSizeYbymL2g, top, mutableState, mutableState2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2$lambda$1$lambda$0(long j, float f, MutableState mutableState, MutableState mutableState2) {
        IntSize OddsDialogScreen_g3amZ_k$lambda$18;
        float OddsDialogScreen_g3amZ_k$lambda$21;
        OddsDialogScreen_g3amZ_k$lambda$18 = OddsDialogScreenKt.OddsDialogScreen_g3amZ_k$lambda$18(mutableState);
        if (!(OddsDialogScreen_g3amZ_k$lambda$18 == null ? false : IntSize.m7943equalsimpl0(OddsDialogScreen_g3amZ_k$lambda$18.m7949unboximpl(), j))) {
            mutableState.setValue(IntSize.m7937boximpl(j));
        }
        OddsDialogScreen_g3amZ_k$lambda$21 = OddsDialogScreenKt.OddsDialogScreen_g3amZ_k$lambda$21(mutableState2);
        if (OddsDialogScreen_g3amZ_k$lambda$21 == f) {
            return;
        }
        OddsDialogScreenKt.OddsDialogScreen_g3amZ_k$lambda$22(mutableState2, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4$lambda$3(Function1 function1, MutableState mutableState) {
        OddType OddsDialogScreen_g3amZ_k$lambda$4;
        OddsDialogScreen_g3amZ_k$lambda$4 = OddsDialogScreenKt.OddsDialogScreen_g3amZ_k$lambda$4(mutableState);
        if (OddsDialogScreen_g3amZ_k$lambda$4 == null) {
            OddsDialogScreen_g3amZ_k$lambda$4 = OddType.DECIMAL;
        }
        function1.invoke(OddsDialogScreen_g3amZ_k$lambda$4);
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-976395844, i, -1, "org.betup.ui.dialogs.compose.OddsDialogScreen.<anonymous>.<anonymous>.<anonymous> (OddsDialogScreen.kt:259)");
        }
        if (this.$isContentBottomVisible) {
            Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(10));
            composer.startReplaceGroup(-1746271574);
            boolean changedInstance = composer.changedInstance(this.$view);
            final View view = this.$view;
            final MutableState<IntSize> mutableState = this.$contentBottomSize$delegate;
            final MutableState<Float> mutableState2 = this.$contentBottomY$delegate;
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: org.betup.ui.dialogs.compose.OddsDialogScreenKt$OddsDialogScreen$1$2$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$2$lambda$1;
                        invoke$lambda$2$lambda$1 = OddsDialogScreenKt$OddsDialogScreen$1$2$2.invoke$lambda$2$lambda$1(view, mutableState, mutableState2, (LayoutCoordinates) obj);
                        return invoke$lambda$2$lambda$1;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(m1517paddingVpY3zN4, (Function1) rememberedValue);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            boolean z = this.$isInTour;
            final Function1<OddType, Unit> function1 = this.$onDismiss;
            final MutableState<OddType> mutableState3 = this.$selectedOddType$delegate;
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, Alignment.INSTANCE.getTop(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, onGloballyPositioned);
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
            Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String stringResource = StringResources_androidKt.stringResource(z ? R.string.tour_next : R.string.ok, composer, 0);
            Modifier wrapContentWidth$default = SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null);
            composer.startReplaceGroup(-1633490746);
            boolean changed = composer.changed(function1);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.compose.OddsDialogScreenKt$OddsDialogScreen$1$2$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$5$lambda$4$lambda$3;
                        invoke$lambda$5$lambda$4$lambda$3 = OddsDialogScreenKt$OddsDialogScreen$1$2$2.invoke$lambda$5$lambda$4$lambda$3(Function1.this, mutableState3);
                        return invoke$lambda$5$lambda$4$lambda$3;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceGroup();
            CommonButtonKt.m12915CommonButtonUPEs2M4(wrapContentWidth$default, true, stringResource, false, false, false, (Function0) rememberedValue2, true, false, true, false, false, null, null, false, false, null, null, null, null, null, composer, 817889334, 0, 0, 2096440);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
