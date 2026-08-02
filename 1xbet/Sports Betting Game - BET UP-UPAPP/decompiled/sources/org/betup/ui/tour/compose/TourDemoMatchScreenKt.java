package org.betup.ui.tour.compose;

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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.model.local.entity.OddType;
import org.betup.ui.common.compose.CommonButtonKt;
import org.betup.ui.common.compose.TicketDarkKt;

/* compiled from: TourDemoMatchScreen.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0081\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"TourDemoMatchScreen", "", "oddType", "Lorg/betup/model/local/entity/OddType;", "selectedBet", "", "coefficientWin1", "", "coefficientDraw", "coefficientWin2", "onBetSelected", "Lkotlin/Function1;", "currentStepIndex", "", "totalSteps", "onBack", "Lkotlin/Function0;", "onConfirm", "modifier", "Landroidx/compose/ui/Modifier;", "(Lorg/betup/model/local/entity/OddType;Ljava/lang/String;DDDLkotlin/jvm/functions/Function1;IILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TourDemoMatchScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourDemoMatchScreen$lambda$0(OddType oddType, String str, double d, double d2, double d3, Function1 function1, int i, int i2, Function0 function0, Function0 function02, Modifier modifier, int i3, int i4, int i5, Composer composer, int i6) {
        TourDemoMatchScreen(oddType, str, d, d2, d3, function1, i, i2, function0, function02, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TourDemoMatchScreen(final OddType oddType, final String str, final double d, final double d2, final double d3, final Function1<? super String, Unit> onBetSelected, final int i, final int i2, final Function0<Unit> onBack, final Function0<Unit> onConfirm, Modifier modifier, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        Modifier modifier2;
        Composer composer2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(oddType, "oddType");
        Intrinsics.checkNotNullParameter(onBetSelected, "onBetSelected");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onConfirm, "onConfirm");
        Composer startRestartGroup = composer.startRestartGroup(-1803931557);
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i6 = (startRestartGroup.changed(oddType.ordinal()) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            i6 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i6 |= startRestartGroup.changed(d) ? 256 : 128;
        }
        if ((i5 & 8) != 0) {
            i6 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i6 |= startRestartGroup.changed(d2) ? 2048 : 1024;
            if ((i5 & 16) == 0) {
                i6 |= 24576;
            } else if ((i3 & 24576) == 0) {
                i6 |= startRestartGroup.changed(d3) ? 16384 : 8192;
            }
            if ((i5 & 32) == 0) {
                i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i6 |= startRestartGroup.changedInstance(onBetSelected) ? 131072 : 65536;
            }
            if ((i5 & 256) == 0) {
                i6 |= 100663296;
            } else if ((i3 & 100663296) == 0) {
                i6 |= startRestartGroup.changedInstance(onBack) ? 67108864 : 33554432;
            }
            if ((i5 & 512) == 0) {
                i6 |= 805306368;
            } else if ((i3 & 805306368) == 0) {
                i6 |= startRestartGroup.changedInstance(onConfirm) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
            }
            i7 = i5 & 1024;
            if (i7 == 0) {
                i8 = i4 | 6;
            } else if ((i4 & 6) == 0) {
                i8 = i4 | (startRestartGroup.changed(modifier) ? 4 : 2);
            } else {
                i8 = i4;
            }
            if ((i6 & 302064787) == 302064786 || (i8 & 3) != 2 || !startRestartGroup.getSkipping()) {
                Modifier modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1803931557, i6, i8, "org.betup.ui.tour.compose.TourDemoMatchScreen (TourDemoMatchScreen.kt:52)");
                }
                modifier2 = modifier3;
                composer2 = startRestartGroup;
                TicketDarkKt.TicketDark(SizeKt.wrapContentHeight$default(modifier3, null, false, 3, null), ComposableSingletons$TourDemoMatchScreenKt.INSTANCE.getLambda$1092976523$app_release(), ComposableLambdaKt.rememberComposableLambda(-603046836, true, new TourDemoMatchScreenKt$TourDemoMatchScreen$1(oddType, d, str, onBetSelected, d2, d3), composer2, 54), ComposableLambdaKt.rememberComposableLambda(1995897101, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.tour.compose.TourDemoMatchScreenKt$TourDemoMatchScreen$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i9) {
                        if ((i9 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1995897101, i9, -1, "org.betup.ui.tour.compose.TourDemoMatchScreen.<anonymous> (TourDemoMatchScreen.kt:62)");
                        }
                        float f = 16;
                        Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f));
                        Arrangement.Horizontal m1398spacedByD5KLDUw = Arrangement.INSTANCE.m1398spacedByD5KLDUw(Dp.m7774constructorimpl(12), Alignment.INSTANCE.getCenterHorizontally());
                        Function0<Unit> function0 = onBack;
                        String str2 = str;
                        Function0<Unit> function02 = onConfirm;
                        ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1398spacedByD5KLDUw, Alignment.INSTANCE.getTop(), composer3, 6);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, m1517paddingVpY3zN4);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer m4610constructorimpl = Updater.m4610constructorimpl(composer3);
                        Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        CommonButtonKt.m12915CommonButtonUPEs2M4(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), false, StringResources_androidKt.stringResource(R.string.tour_back, composer3, 6), false, false, false, function0, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer3, 54, 0, 0, 2097080);
                        CommonButtonKt.m12915CommonButtonUPEs2M4(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), str2 != null, StringResources_androidKt.stringResource(R.string.confirm, composer3, 6), false, false, str2 != null, function02, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer3, 6, 0, 0, 2097048);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), false, true, null, false, composer2, 224688, 192);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier2 = modifier;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                final Modifier modifier4 = modifier2;
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.tour.compose.TourDemoMatchScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit TourDemoMatchScreen$lambda$0;
                        TourDemoMatchScreen$lambda$0 = TourDemoMatchScreenKt.TourDemoMatchScreen$lambda$0(OddType.this, str, d, d2, d3, onBetSelected, i, i2, onBack, onConfirm, modifier4, i3, i4, i5, (Composer) obj, ((Integer) obj2).intValue());
                        return TourDemoMatchScreen$lambda$0;
                    }
                });
                return;
            }
            return;
        }
        if ((i5 & 16) == 0) {
        }
        if ((i5 & 32) == 0) {
        }
        if ((i5 & 256) == 0) {
        }
        if ((i5 & 512) == 0) {
        }
        i7 = i5 & 1024;
        if (i7 == 0) {
        }
        if ((i6 & 302064787) == 302064786) {
        }
        if (i7 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier3;
        composer2 = startRestartGroup;
        TicketDarkKt.TicketDark(SizeKt.wrapContentHeight$default(modifier3, null, false, 3, null), ComposableSingletons$TourDemoMatchScreenKt.INSTANCE.getLambda$1092976523$app_release(), ComposableLambdaKt.rememberComposableLambda(-603046836, true, new TourDemoMatchScreenKt$TourDemoMatchScreen$1(oddType, d, str, onBetSelected, d2, d3), composer2, 54), ComposableLambdaKt.rememberComposableLambda(1995897101, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.tour.compose.TourDemoMatchScreenKt$TourDemoMatchScreen$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i9) {
                if ((i9 & 3) == 2 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1995897101, i9, -1, "org.betup.ui.tour.compose.TourDemoMatchScreen.<anonymous> (TourDemoMatchScreen.kt:62)");
                }
                float f = 16;
                Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f));
                Arrangement.Horizontal m1398spacedByD5KLDUw = Arrangement.INSTANCE.m1398spacedByD5KLDUw(Dp.m7774constructorimpl(12), Alignment.INSTANCE.getCenterHorizontally());
                Function0<Unit> function0 = onBack;
                String str2 = str;
                Function0<Unit> function02 = onConfirm;
                ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1398spacedByD5KLDUw, Alignment.INSTANCE.getTop(), composer3, 6);
                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, m1517paddingVpY3zN4);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor);
                } else {
                    composer3.useNode();
                }
                Composer m4610constructorimpl = Updater.m4610constructorimpl(composer3);
                Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                CommonButtonKt.m12915CommonButtonUPEs2M4(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), false, StringResources_androidKt.stringResource(R.string.tour_back, composer3, 6), false, false, false, function0, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer3, 54, 0, 0, 2097080);
                CommonButtonKt.m12915CommonButtonUPEs2M4(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), str2 != null, StringResources_androidKt.stringResource(R.string.confirm, composer3, 6), false, false, str2 != null, function02, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer3, 6, 0, 0, 2097048);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer2, 54), false, true, null, false, composer2, 224688, 192);
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
