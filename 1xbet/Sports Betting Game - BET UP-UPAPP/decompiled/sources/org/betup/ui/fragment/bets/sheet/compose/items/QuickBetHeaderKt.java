package org.betup.ui.fragment.bets.sheet.compose.items;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
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
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.extractor.WavUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.betup.R;
import org.betup.ui.dialogs.compose.BattleFlowDimens;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.DateHelper;
import org.betup.utils.UiExtensionsKt;

/* compiled from: QuickBetHeader.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u001ac\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0010¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\nX\u008a\u008e\u0002"}, d2 = {"QuickBetHeader", "", "modifier", "Landroidx/compose/ui/Modifier;", "name", "", "ticketNrString", "", "createdAt", "isInUnlockBet", "", "isInOddsFragment", "isCompactTitle", "isBattleFlow", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ZZZZLandroidx/compose/runtime/Composer;II)V", "PreviewQuickBetHeader", "(Landroidx/compose/runtime/Composer;I)V", "app_release", "isCopied"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QuickBetHeaderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewQuickBetHeader$lambda$11(int i, Composer composer, int i2) {
        PreviewQuickBetHeader(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickBetHeader$lambda$10(Modifier modifier, String str, Long l, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, Composer composer, int i3) {
        QuickBetHeader(modifier, str, l, str2, z, z2, z3, z4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0186, code lost:
    
        if (r12 == null) goto L128;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x097f  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x096b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void QuickBetHeader(Modifier modifier, String str, Long l, String str2, boolean z, boolean z2, boolean z3, boolean z4, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        String str3;
        int i4;
        Long l2;
        int i5;
        String str4;
        int i6;
        boolean z5;
        int i7;
        int i8;
        int i9;
        final Long l3;
        final String str5;
        boolean z6;
        String str6;
        Object rememberedValue;
        Object rememberedValue2;
        float m7774constructorimpl;
        float m7774constructorimpl2;
        boolean z7;
        Modifier modifier3;
        int i10;
        final MutableState mutableState;
        final String str7;
        final boolean z8;
        final boolean z9;
        final boolean z10;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1678448154);
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            str3 = str;
            i3 |= startRestartGroup.changed(str3) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                l2 = l;
                i3 |= startRestartGroup.changed(l2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    str4 = str2;
                    i3 |= startRestartGroup.changed(str4) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        z5 = z;
                        i3 |= startRestartGroup.changed(z5) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i3 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                        }
                        i8 = i2 & 64;
                        if (i8 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changed(z3) ? 1048576 : 524288;
                        }
                        i9 = i2 & 128;
                        if (i9 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changed(z4) ? 8388608 : 4194304;
                        }
                        if ((i3 & 4793491) == 4793490 || !startRestartGroup.getSkipping()) {
                            if (i11 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            Object obj = null;
                            if (i12 != 0) {
                                str3 = null;
                            }
                            l3 = i4 != 0 ? null : l2;
                            str5 = i5 != 0 ? null : str4;
                            boolean z11 = i6 != 0 ? false : z5;
                            z6 = i7 != 0 ? false : z2;
                            boolean z12 = i8 != 0 ? false : z3;
                            boolean z13 = i9 != 0 ? false : z4;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1678448154, i3, -1, "org.betup.ui.fragment.bets.sheet.compose.items.QuickBetHeader (QuickBetHeader.kt:54)");
                            }
                            startRestartGroup.startReplaceGroup(1919038640);
                            String stringResource = str3 == null ? StringResources_androidKt.stringResource(R.string.quick_bet, startRestartGroup, 6) : str3;
                            startRestartGroup.endReplaceGroup();
                            if (l3 != null) {
                                str6 = "# " + l3.longValue();
                            }
                            str6 = "";
                            String str8 = str6;
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            MutableState mutableState2 = (MutableState) rememberedValue;
                            startRestartGroup.endReplaceGroup();
                            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(localContext);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final Context context = (Context) consume;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue2;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            if (z6) {
                                startRestartGroup.startReplaceGroup(-638956089);
                                float f = 4;
                                Modifier background$default = BackgroundKt.background$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppBrushPalette.ButtonBackgroundGold.INSTANCE.getBrush(), RoundedCornerShapeKt.m1812RoundedCornerShapea9UjIt4$default(Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f), 0.0f, 0.0f, 12, null), 0.0f, 4, null);
                                Alignment center = Alignment.INSTANCE.getCenter();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, background$default);
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
                                TextKt.m2642Text4IGK_g(stringResource, PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, z12 ? Dp.m7774constructorimpl(10) : Dp.m7774constructorimpl(14), 0.0f, z12 ? Dp.m7774constructorimpl(6) : Dp.m7774constructorimpl(7), 5, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), TextUnitKt.getSp(z12 ? 12 : 14), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, 65532);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endNode();
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endReplaceGroup();
                                z7 = z13;
                                modifier3 = modifier2;
                            } else {
                                startRestartGroup.startReplaceGroup(-637929772);
                                if (z11) {
                                    startRestartGroup.startReplaceGroup(-638010372);
                                    float f2 = 4;
                                    Modifier background$default2 = BackgroundKt.background$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppBrushPalette.ButtonBackgroundGold.INSTANCE.getBrush(), RoundedCornerShapeKt.m1812RoundedCornerShapea9UjIt4$default(Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(f2), 0.0f, 0.0f, 12, null), 0.0f, 4, null);
                                    Alignment center2 = Alignment.INSTANCE.getCenter();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, background$default2);
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
                                    Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    TextKt.m2642Text4IGK_g(stringResource, PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(14), 0.0f, Dp.m7774constructorimpl(7), 5, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), TextUnitKt.getSp(24), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 48, 0, 65020);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    startRestartGroup.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    startRestartGroup.endReplaceGroup();
                                    z7 = z13;
                                    modifier3 = modifier2;
                                } else {
                                    startRestartGroup.startReplaceGroup(-637033345);
                                    if (z13) {
                                        m7774constructorimpl = BattleFlowDimens.INSTANCE.m13161getHeaderHeightD9Ej5fM();
                                    } else {
                                        m7774constructorimpl = Dp.m7774constructorimpl(48);
                                    }
                                    float f3 = m7774constructorimpl;
                                    long m13160getHeaderFontXSAIIZE = z13 ? BattleFlowDimens.INSTANCE.m13160getHeaderFontXSAIIZE() : TextUnitKt.getSp(18);
                                    if (z13) {
                                        m7774constructorimpl2 = BattleFlowDimens.INSTANCE.m13162getHeaderPaddingStartD9Ej5fM();
                                    } else {
                                        m7774constructorimpl2 = Dp.m7774constructorimpl(12);
                                        obj = null;
                                    }
                                    float f4 = 4;
                                    Modifier background$default3 = BackgroundKt.background$default(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, obj), f3), ComposeUtils.AppBrushPalette.ButtonBackgroundGold.INSTANCE.getBrush(), RoundedCornerShapeKt.m1812RoundedCornerShapea9UjIt4$default(Dp.m7774constructorimpl(f4), Dp.m7774constructorimpl(f4), 0.0f, 0.0f, 12, null), 0.0f, 4, null);
                                    Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 54);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, background$default3);
                                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                    z7 = z13;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    startRestartGroup.startReusableNode();
                                    if (startRestartGroup.getInserting()) {
                                        startRestartGroup.createNode(constructor3);
                                    } else {
                                        startRestartGroup.useNode();
                                    }
                                    Composer m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                                    Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    TextKt.m2642Text4IGK_g(stringResource, PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, m7774constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), m13160getHeaderFontXSAIIZE, FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, 65532);
                                    Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m7774constructorimpl(12), 0.0f, 11, null);
                                    Alignment.Horizontal end = Alignment.INSTANCE.getEnd();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end, startRestartGroup, 48);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default);
                                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                    modifier3 = modifier2;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    startRestartGroup.startReusableNode();
                                    if (startRestartGroup.getInserting()) {
                                        startRestartGroup.createNode(constructor4);
                                    } else {
                                        startRestartGroup.useNode();
                                    }
                                    Composer m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                                    Updater.m4617setimpl(m4610constructorimpl4, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                        m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                        m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                    }
                                    Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    startRestartGroup.startReplaceGroup(-61390984);
                                    if (l3 != null) {
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        startRestartGroup.startReplaceGroup(-1224400529);
                                        boolean changedInstance = startRestartGroup.changedInstance(context) | ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) | startRestartGroup.changedInstance(coroutineScope);
                                        Object rememberedValue3 = startRestartGroup.rememberedValue();
                                        if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            mutableState = mutableState2;
                                            rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.QuickBetHeaderKt$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    Unit QuickBetHeader$lambda$9$lambda$8$lambda$7$lambda$6;
                                                    QuickBetHeader$lambda$9$lambda$8$lambda$7$lambda$6 = QuickBetHeaderKt.QuickBetHeader$lambda$9$lambda$8$lambda$7$lambda$6(context, l3, coroutineScope, mutableState);
                                                    return QuickBetHeader$lambda$9$lambda$8$lambda$7$lambda$6;
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue3);
                                        } else {
                                            mutableState = mutableState2;
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        i10 = 6;
                                        TextKt.m2642Text4IGK_g(str8, ClickableKt.m1059clickableXHw0xAI$default(companion, false, null, null, (Function0) rememberedValue3, 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(QuickBetHeader$lambda$2(mutableState) ? ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor() : ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, 65532);
                                    } else {
                                        i10 = 6;
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    startRestartGroup.startReplaceGroup(-61348576);
                                    if (str5 != null) {
                                        TextKt.m2642Text4IGK_g(DateHelper.getTime(str5) + " / " + UiExtensionsKt.getFormattedDateWithoutYear(str5), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor(), TextUnitKt.getSp(8), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, i10), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    startRestartGroup.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    startRestartGroup.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    startRestartGroup.endReplaceGroup();
                                }
                                startRestartGroup.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str7 = str3;
                            z5 = z11;
                            z8 = z6;
                            z9 = z12;
                            modifier2 = modifier3;
                            z10 = z7;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            z8 = z2;
                            z9 = z3;
                            str7 = str3;
                            l3 = l2;
                            str5 = str4;
                            z10 = z4;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final Modifier modifier4 = modifier2;
                            final boolean z14 = z5;
                            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.QuickBetHeaderKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj2, Object obj3) {
                                    Unit QuickBetHeader$lambda$10;
                                    QuickBetHeader$lambda$10 = QuickBetHeaderKt.QuickBetHeader$lambda$10(Modifier.this, str7, l3, str5, z14, z8, z9, z10, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                                    return QuickBetHeader$lambda$10;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    z5 = z;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                    }
                    i9 = i2 & 128;
                    if (i9 != 0) {
                    }
                    if ((i3 & 4793491) == 4793490) {
                    }
                    if (i11 != 0) {
                    }
                    Object obj2 = null;
                    if (i12 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceGroup(1919038640);
                    if (str3 == null) {
                    }
                    startRestartGroup.endReplaceGroup();
                    if (l3 != null) {
                    }
                    str6 = "";
                    String str82 = str6;
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    MutableState mutableState22 = (MutableState) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume2 = startRestartGroup.consume(localContext2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final Context context2 = (Context) consume2;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    }
                    final CoroutineScope coroutineScope2 = (CoroutineScope) rememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (z6) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    str7 = str3;
                    z5 = z11;
                    z8 = z6;
                    z9 = z12;
                    modifier2 = modifier3;
                    z10 = z7;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                str4 = str2;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                z5 = z;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                }
                i9 = i2 & 128;
                if (i9 != 0) {
                }
                if ((i3 & 4793491) == 4793490) {
                }
                if (i11 != 0) {
                }
                Object obj22 = null;
                if (i12 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceGroup(1919038640);
                if (str3 == null) {
                }
                startRestartGroup.endReplaceGroup();
                if (l3 != null) {
                }
                str6 = "";
                String str822 = str6;
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                MutableState mutableState222 = (MutableState) rememberedValue;
                startRestartGroup.endReplaceGroup();
                ProvidableCompositionLocal<Context> localContext22 = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume22 = startRestartGroup.consume(localContext22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final Context context22 = (Context) consume22;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                final CoroutineScope coroutineScope22 = (CoroutineScope) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (z6) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                str7 = str3;
                z5 = z11;
                z8 = z6;
                z9 = z12;
                modifier2 = modifier3;
                z10 = z7;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            l2 = l;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            str4 = str2;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            z5 = z;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            i8 = i2 & 64;
            if (i8 != 0) {
            }
            i9 = i2 & 128;
            if (i9 != 0) {
            }
            if ((i3 & 4793491) == 4793490) {
            }
            if (i11 != 0) {
            }
            Object obj222 = null;
            if (i12 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceGroup(1919038640);
            if (str3 == null) {
            }
            startRestartGroup.endReplaceGroup();
            if (l3 != null) {
            }
            str6 = "";
            String str8222 = str6;
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            MutableState mutableState2222 = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            ProvidableCompositionLocal<Context> localContext222 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume222 = startRestartGroup.consume(localContext222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Context context222 = (Context) consume222;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            final CoroutineScope coroutineScope222 = (CoroutineScope) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (z6) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            str7 = str3;
            z5 = z11;
            z8 = z6;
            z9 = z12;
            modifier2 = modifier3;
            z10 = z7;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        str3 = str;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        l2 = l;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        str4 = str2;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        z5 = z;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        i8 = i2 & 64;
        if (i8 != 0) {
        }
        i9 = i2 & 128;
        if (i9 != 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        if (i11 != 0) {
        }
        Object obj2222 = null;
        if (i12 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(1919038640);
        if (str3 == null) {
        }
        startRestartGroup.endReplaceGroup();
        if (l3 != null) {
        }
        str6 = "";
        String str82222 = str6;
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        MutableState mutableState22222 = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        ProvidableCompositionLocal<Context> localContext2222 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2222 = startRestartGroup.consume(localContext2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Context context2222 = (Context) consume2222;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        final CoroutineScope coroutineScope2222 = (CoroutineScope) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (z6) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        str7 = str3;
        z5 = z11;
        z8 = z6;
        z9 = z12;
        modifier2 = modifier3;
        z10 = z7;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final boolean QuickBetHeader$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void QuickBetHeader$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickBetHeader$lambda$9$lambda$8$lambda$7$lambda$6(Context context, Long l, CoroutineScope coroutineScope, MutableState mutableState) {
        Object systemService = context.getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(context.getString(R.string.clipboard_bet_id_label), l.toString()));
        QuickBetHeader$lambda$3(mutableState, true);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new QuickBetHeaderKt$QuickBetHeader$3$1$1$1$1(mutableState, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final void PreviewQuickBetHeader(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1891928107);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1891928107, i, -1, "org.betup.ui.fragment.bets.sheet.compose.items.PreviewQuickBetHeader (QuickBetHeader.kt:192)");
            }
            QuickBetHeader(null, null, 123456L, null, false, false, false, false, startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 251);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.QuickBetHeaderKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewQuickBetHeader$lambda$11;
                    PreviewQuickBetHeader$lambda$11 = QuickBetHeaderKt.PreviewQuickBetHeader$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewQuickBetHeader$lambda$11;
                }
            });
        }
    }
}
