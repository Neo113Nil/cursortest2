package org.betup.ui.dialogs;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
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
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import coil3.compose.SingletonAsyncImageKt;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.betup.R;
import org.betup.ui.common.compose.CommonButtonKt;
import org.betup.ui.common.compose.TicketDarkKt;
import org.betup.ui.fragment.bets.sheet.compose.items.TopActionButtonsKt;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.FormatHelper;

/* compiled from: VideoRewardCollectDialogFragment.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aK\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"VideoRewardCollectContent", "", "amount", "", "title", "", "description", "imageResourceId", "onCollectClick", "Lkotlin/Function0;", "onDismiss", "(ILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "PreviewVideoRewardCollectContent", "(Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoRewardCollectDialogFragmentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewVideoRewardCollectContent$lambda$6(int i, Composer composer, int i2) {
        PreviewVideoRewardCollectContent(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VideoRewardCollectContent$lambda$1(int i, String str, String str2, int i2, Function0 function0, Function0 function02, int i3, int i4, Composer composer, int i5) {
        VideoRewardCollectContent(i, str, str2, i2, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VideoRewardCollectContent(final int i, final String title, final String description, int i2, final Function0<Unit> onCollectClick, final Function0<Unit> onDismiss, Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Composer composer2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(onCollectClick, "onCollectClick");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer startRestartGroup = composer.startRestartGroup(1735563760);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= startRestartGroup.changed(description) ? 256 : 128;
        }
        int i7 = i4 & 8;
        if (i7 != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i6 = i2;
            i5 |= startRestartGroup.changed(i6) ? 2048 : 1024;
            if ((i4 & 16) == 0) {
                i5 |= 24576;
            } else if ((i3 & 24576) == 0) {
                i5 |= startRestartGroup.changedInstance(onCollectClick) ? 16384 : 8192;
            }
            if ((i4 & 32) == 0) {
                i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i5 |= startRestartGroup.changedInstance(onDismiss) ? 131072 : 65536;
            }
            if ((74883 & i5) == 74882 || !startRestartGroup.getSkipping()) {
                int i8 = i7 == 0 ? 2131235583 : i6;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1735563760, i5, -1, "org.betup.ui.dialogs.VideoRewardCollectContent (VideoRewardCollectDialogFragment.kt:172)");
                }
                float f = 32;
                Modifier verticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m1520paddingqDBjuR0$default(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f), 0.0f, 2, null), 0.0f, Dp.m7774constructorimpl(f), 0.0f, Dp.m7774constructorimpl(63), 5, null), ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                final int i9 = i8;
                TopActionButtonsKt.TopActionButtons(ColumnScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally()), onDismiss, null, null, false, false, false, startRestartGroup, ((i5 >> 12) & 112) | 24576, 108);
                SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(100)), startRestartGroup, 6);
                TicketDarkKt.TicketDark(SizeKt.wrapContentHeight$default(Modifier.INSTANCE, null, false, 3, null), ComposableSingletons$VideoRewardCollectDialogFragmentKt.INSTANCE.m13025getLambda$1657785078$app_release(), ComposableLambdaKt.rememberComposableLambda(-1792367767, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.VideoRewardCollectDialogFragmentKt$VideoRewardCollectContent$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i10) {
                        if ((i10 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1792367767, i10, -1, "org.betup.ui.dialogs.VideoRewardCollectContent.<anonymous>.<anonymous> (VideoRewardCollectDialogFragment.kt:209)");
                        }
                        Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null);
                        Alignment center = Alignment.INSTANCE.getCenter();
                        final String str = description;
                        final int i11 = i9;
                        final int i12 = i;
                        BoxWithConstraintsKt.BoxWithConstraints(wrapContentHeight$default, center, false, ComposableLambdaKt.rememberComposableLambda(-930888237, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.VideoRewardCollectDialogFragmentKt$VideoRewardCollectContent$1$1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer4, Integer num) {
                                invoke(boxWithConstraintsScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer4, int i13) {
                                int i14;
                                float f2;
                                String str2;
                                int i15;
                                int i16;
                                String str3;
                                float f3;
                                float f4;
                                Object obj;
                                Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                                if ((i13 & 6) == 0) {
                                    i14 = i13 | (composer4.changed(BoxWithConstraints) ? 4 : 2);
                                } else {
                                    i14 = i13;
                                }
                                if ((i14 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-930888237, i14, -1, "org.betup.ui.dialogs.VideoRewardCollectContent.<anonymous>.<anonymous>.<anonymous> (VideoRewardCollectDialogFragment.kt:215)");
                                }
                                float mo1423getMaxWidthD9Ej5fM = BoxWithConstraints.mo1423getMaxWidthD9Ej5fM();
                                float f5 = 0.08f * mo1423getMaxWidthD9Ej5fM;
                                float m7788unboximpl = ((Dp) RangesKt.coerceIn(Dp.m7772boximpl(Dp.m7774constructorimpl(f5)), Dp.m7772boximpl(Dp.m7774constructorimpl(20)), Dp.m7772boximpl(Dp.m7774constructorimpl(32)))).m7788unboximpl();
                                long sp = TextUnitKt.getSp(RangesKt.coerceIn(f5, 18.0f, 32.0f));
                                float f6 = 8;
                                Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(f6));
                                Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                                Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f6));
                                String str4 = str;
                                int i17 = i11;
                                int i18 = i12;
                                ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4, centerHorizontally2, composer4, 54);
                                ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer4, m1517paddingVpY3zN4);
                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                if (!(composer4.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor2);
                                } else {
                                    composer4.useNode();
                                }
                                Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer4);
                                Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer4, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                composer4.startReplaceGroup(1996064015);
                                if (str4.length() > 0) {
                                    i15 = i17;
                                    f3 = f6;
                                    i16 = i18;
                                    obj = null;
                                    str3 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                                    f4 = m7788unboximpl;
                                    str2 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                                    f2 = mo1423getMaxWidthD9Ej5fM;
                                    TextKt.m3621Text4IGK_g(str4, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 199728, 0, 130512);
                                } else {
                                    f2 = mo1423getMaxWidthD9Ej5fM;
                                    str2 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                                    i15 = i17;
                                    i16 = i18;
                                    str3 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                                    f3 = f6;
                                    f4 = m7788unboximpl;
                                    obj = null;
                                }
                                composer4.endReplaceGroup();
                                float f7 = f2;
                                SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(Integer.valueOf(i15), "Video Reward", SizeKt.m1551heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, obj), 0.0f, f7, 1, obj), null, null, null, ContentScale.INSTANCE.getFit(), 0.0f, null, FilterQuality.INSTANCE.m5267getHighfv9h1I(), false, composer4, 1572912, 0, 1464);
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, obj);
                                ComposerKt.sourceInformationMarkerStart(composer4, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center2, centerVertically, composer4, 54);
                                ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, str2);
                                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer4, fillMaxWidth$default);
                                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer4, -692256719, str3);
                                if (!(composer4.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor3);
                                } else {
                                    composer4.useNode();
                                }
                                Composer m4610constructorimpl3 = Updater.m4610constructorimpl(composer4);
                                Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer4, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                float f8 = f4;
                                TextKt.m3621Text4IGK_g("+" + FormatHelper.getShopBetcoinsFormated(i16), SizeKt.m1570widthInVpY3zN4$default(RowScopeInstance.INSTANCE.weight(Modifier.INSTANCE, 1.0f, false), 0.0f, Dp.m7774constructorimpl(Dp.m7774constructorimpl(f7 - f8) - Dp.m7774constructorimpl(f3)), 1, obj), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), sp, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 3120, 120272);
                                SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(4)), composer4, 6);
                                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer4, 6), "Betcoin", SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, f8), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, 48, 120);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                composer4.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                composer4.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 3126, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1926950456, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.VideoRewardCollectDialogFragmentKt$VideoRewardCollectContent$1$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i10) {
                        if ((i10 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1926950456, i10, -1, "org.betup.ui.dialogs.VideoRewardCollectContent.<anonymous>.<anonymous> (VideoRewardCollectDialogFragment.kt:195)");
                        }
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(8), 0.0f, Dp.m7774constructorimpl(20), 5, null), 0.0f, 1, null);
                        Alignment center = Alignment.INSTANCE.getCenter();
                        Function0<Unit> function0 = onCollectClick;
                        ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer3);
                        Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        CommonButtonKt.m12915CommonButtonUPEs2M4(null, false, StringResources_androidKt.stringResource(R.string.collect, composer3, 6), false, false, false, function0, false, true, false, false, false, null, null, false, false, null, null, null, null, null, composer3, 100663296, 0, 0, 2096827);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), false, true, null, false, startRestartGroup, 224694, 192);
                composer2 = startRestartGroup;
                SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(0), Dp.m7774constructorimpl(65)), composer2, 6);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i6 = i9;
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                final int i10 = i6;
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.VideoRewardCollectDialogFragmentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit VideoRewardCollectContent$lambda$1;
                        VideoRewardCollectContent$lambda$1 = VideoRewardCollectDialogFragmentKt.VideoRewardCollectContent$lambda$1(i, title, description, i10, onCollectClick, onDismiss, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                        return VideoRewardCollectContent$lambda$1;
                    }
                });
                return;
            }
            return;
        }
        i6 = i2;
        if ((i4 & 16) == 0) {
        }
        if ((i4 & 32) == 0) {
        }
        if ((74883 & i5) == 74882) {
        }
        if (i7 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        float f2 = 32;
        Modifier verticalScroll$default2 = ScrollKt.verticalScroll$default(PaddingKt.m1520paddingqDBjuR0$default(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f2), 0.0f, 2, null), 0.0f, Dp.m7774constructorimpl(f2), 0.0f, Dp.m7774constructorimpl(63), 5, null), ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
        Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default2);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        final int i92 = i8;
        TopActionButtonsKt.TopActionButtons(ColumnScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally()), onDismiss, null, null, false, false, false, startRestartGroup, ((i5 >> 12) & 112) | 24576, 108);
        SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(100)), startRestartGroup, 6);
        TicketDarkKt.TicketDark(SizeKt.wrapContentHeight$default(Modifier.INSTANCE, null, false, 3, null), ComposableSingletons$VideoRewardCollectDialogFragmentKt.INSTANCE.m13025getLambda$1657785078$app_release(), ComposableLambdaKt.rememberComposableLambda(-1792367767, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.VideoRewardCollectDialogFragmentKt$VideoRewardCollectContent$1$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i102) {
                if ((i102 & 3) == 2 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1792367767, i102, -1, "org.betup.ui.dialogs.VideoRewardCollectContent.<anonymous>.<anonymous> (VideoRewardCollectDialogFragment.kt:209)");
                }
                Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null);
                Alignment center = Alignment.INSTANCE.getCenter();
                final String str = description;
                final int i11 = i92;
                final int i12 = i;
                BoxWithConstraintsKt.BoxWithConstraints(wrapContentHeight$default, center, false, ComposableLambdaKt.rememberComposableLambda(-930888237, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.VideoRewardCollectDialogFragmentKt$VideoRewardCollectContent$1$1.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer4, Integer num) {
                        invoke(boxWithConstraintsScope, composer4, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer4, int i13) {
                        int i14;
                        float f22;
                        String str2;
                        int i15;
                        int i16;
                        String str3;
                        float f3;
                        float f4;
                        Object obj;
                        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                        if ((i13 & 6) == 0) {
                            i14 = i13 | (composer4.changed(BoxWithConstraints) ? 4 : 2);
                        } else {
                            i14 = i13;
                        }
                        if ((i14 & 19) == 18 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-930888237, i14, -1, "org.betup.ui.dialogs.VideoRewardCollectContent.<anonymous>.<anonymous>.<anonymous> (VideoRewardCollectDialogFragment.kt:215)");
                        }
                        float mo1423getMaxWidthD9Ej5fM = BoxWithConstraints.mo1423getMaxWidthD9Ej5fM();
                        float f5 = 0.08f * mo1423getMaxWidthD9Ej5fM;
                        float m7788unboximpl = ((Dp) RangesKt.coerceIn(Dp.m7772boximpl(Dp.m7774constructorimpl(f5)), Dp.m7772boximpl(Dp.m7774constructorimpl(20)), Dp.m7772boximpl(Dp.m7774constructorimpl(32)))).m7788unboximpl();
                        long sp = TextUnitKt.getSp(RangesKt.coerceIn(f5, 18.0f, 32.0f));
                        float f6 = 8;
                        Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(f6));
                        Alignment.Horizontal centerHorizontally22 = Alignment.INSTANCE.getCenterHorizontally();
                        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f6));
                        String str4 = str;
                        int i17 = i11;
                        int i18 = i12;
                        ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4, centerHorizontally22, composer4, 54);
                        ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composer4.getCurrentCompositionLocalMap();
                        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(composer4, m1517paddingVpY3zN4);
                        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(composer4.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor22);
                        } else {
                            composer4.useNode();
                        }
                        Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer4);
                        Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                        }
                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer4, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composer4.startReplaceGroup(1996064015);
                        if (str4.length() > 0) {
                            i15 = i17;
                            f3 = f6;
                            i16 = i18;
                            obj = null;
                            str3 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                            f4 = m7788unboximpl;
                            str2 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                            f22 = mo1423getMaxWidthD9Ej5fM;
                            TextKt.m3621Text4IGK_g(str4, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 199728, 0, 130512);
                        } else {
                            f22 = mo1423getMaxWidthD9Ej5fM;
                            str2 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                            i15 = i17;
                            i16 = i18;
                            str3 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                            f3 = f6;
                            f4 = m7788unboximpl;
                            obj = null;
                        }
                        composer4.endReplaceGroup();
                        float f7 = f22;
                        SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(Integer.valueOf(i15), "Video Reward", SizeKt.m1551heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, obj), 0.0f, f7, 1, obj), null, null, null, ContentScale.INSTANCE.getFit(), 0.0f, null, FilterQuality.INSTANCE.m5267getHighfv9h1I(), false, composer4, 1572912, 0, 1464);
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, obj);
                        ComposerKt.sourceInformationMarkerStart(composer4, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center2, centerVertically, composer4, 54);
                        ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, str2);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer4, fillMaxWidth$default);
                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer4, -692256719, str3);
                        if (!(composer4.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor3);
                        } else {
                            composer4.useNode();
                        }
                        Composer m4610constructorimpl3 = Updater.m4610constructorimpl(composer4);
                        Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer4, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        float f8 = f4;
                        TextKt.m3621Text4IGK_g("+" + FormatHelper.getShopBetcoinsFormated(i16), SizeKt.m1570widthInVpY3zN4$default(RowScopeInstance.INSTANCE.weight(Modifier.INSTANCE, 1.0f, false), 0.0f, Dp.m7774constructorimpl(Dp.m7774constructorimpl(f7 - f8) - Dp.m7774constructorimpl(f3)), 1, obj), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), sp, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 3120, 120272);
                        SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(4)), composer4, 6);
                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer4, 6), "Betcoin", SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, f8), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, 48, 120);
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        composer4.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        composer4.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer3, 54), composer3, 3126, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1926950456, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.VideoRewardCollectDialogFragmentKt$VideoRewardCollectContent$1$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i102) {
                if ((i102 & 3) == 2 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1926950456, i102, -1, "org.betup.ui.dialogs.VideoRewardCollectContent.<anonymous>.<anonymous> (VideoRewardCollectDialogFragment.kt:195)");
                }
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(8), 0.0f, Dp.m7774constructorimpl(20), 5, null), 0.0f, 1, null);
                Alignment center = Alignment.INSTANCE.getCenter();
                Function0<Unit> function0 = onCollectClick;
                ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composer3.getCurrentCompositionLocalMap();
                Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default);
                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor22);
                } else {
                    composer3.useNode();
                }
                Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer3);
                Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                }
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer3, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                CommonButtonKt.m12915CommonButtonUPEs2M4(null, false, StringResources_androidKt.stringResource(R.string.collect, composer3, 6), false, false, false, function0, false, true, false, false, false, null, null, false, false, null, null, null, null, null, composer3, 100663296, 0, 0, 2096827);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), false, true, null, false, startRestartGroup, 224694, 192);
        composer2 = startRestartGroup;
        SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(0), Dp.m7774constructorimpl(65)), composer2, 6);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        i6 = i92;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void PreviewVideoRewardCollectContent(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1006116660);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1006116660, i, -1, "org.betup.ui.dialogs.PreviewVideoRewardCollectContent (VideoRewardCollectDialogFragment.kt:385)");
            }
            String stringResource = StringResources_androidKt.stringResource(R.string.shop_video_reward_title, startRestartGroup, 6);
            String stringResource2 = StringResources_androidKt.stringResource(R.string.home_daily_bonus_got, startRestartGroup, 6);
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.VideoRewardCollectDialogFragmentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.VideoRewardCollectDialogFragmentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            VideoRewardCollectContent(500, stringResource, stringResource2, R.drawable.watched_video_prize_img, function0, (Function0) rememberedValue2, startRestartGroup, 224262, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.VideoRewardCollectDialogFragmentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewVideoRewardCollectContent$lambda$6;
                    PreviewVideoRewardCollectContent$lambda$6 = VideoRewardCollectDialogFragmentKt.PreviewVideoRewardCollectContent$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewVideoRewardCollectContent$lambda$6;
                }
            });
        }
    }
}
