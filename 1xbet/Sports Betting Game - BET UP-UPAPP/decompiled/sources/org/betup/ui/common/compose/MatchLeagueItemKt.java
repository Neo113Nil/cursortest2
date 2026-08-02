package org.betup.ui.common.compose;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
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
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import coil3.compose.SingletonAsyncImageKt;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.views.ComposeUtils;

/* compiled from: MatchLeagueItem.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aW\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"MatchLeagueItem", "", "modifier", "Landroidx/compose/ui/Modifier;", "image", "", "label", "compact", "", "dense", "centerHorizontally", "onClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;ZZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MatchLeagueItemKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchLeagueItem$lambda$1(Modifier modifier, String str, String str2, boolean z, boolean z2, boolean z3, Function0 function0, int i, int i2, Composer composer, int i3) {
        MatchLeagueItem(modifier, str, str2, z, z2, z3, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MatchLeagueItem(Modifier modifier, final String image, final String label, boolean z, boolean z2, boolean z3, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        boolean z6;
        int i6;
        Function0<Unit> function02;
        boolean z7;
        float m7774constructorimpl;
        long sp;
        float m7774constructorimpl2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Modifier modifier3;
        Composer composer2;
        final boolean z8;
        final boolean z9;
        final boolean z10;
        final Function0<Unit> function03;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(label, "label");
        Composer startRestartGroup = composer.startRestartGroup(1096058406);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(image) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(label) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z4 = z;
            i3 |= startRestartGroup.changed(z4) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z5 = z2;
                i3 |= startRestartGroup.changed(z5) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    z6 = z3;
                    i3 |= startRestartGroup.changed(z6) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        function02 = function0;
                    } else {
                        function02 = function0;
                        if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                        }
                    }
                    if ((i3 & 599187) == 599186 || !startRestartGroup.getSkipping()) {
                        Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                        boolean z11 = i8 == 0 ? false : z4;
                        z7 = i4 == 0 ? false : z5;
                        boolean z12 = i5 == 0 ? false : z6;
                        Function0<Unit> function04 = i6 == 0 ? null : function02;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1096058406, i3, -1, "org.betup.ui.common.compose.MatchLeagueItem (MatchLeagueItem.kt:31)");
                        }
                        if (!z7) {
                            m7774constructorimpl = Dp.m7774constructorimpl(11);
                        } else if (z11) {
                            m7774constructorimpl = Dp.m7774constructorimpl(16);
                        } else {
                            m7774constructorimpl = Dp.m7774constructorimpl(24);
                        }
                        if (!z7) {
                            sp = TextUnitKt.getSp(8);
                        } else if (z11) {
                            sp = TextUnitKt.getSp(11);
                        } else {
                            sp = TextUnitKt.getSp(12);
                        }
                        long j = sp;
                        if (!z7) {
                            m7774constructorimpl2 = Dp.m7774constructorimpl(3);
                        } else if (z11) {
                            m7774constructorimpl2 = Dp.m7774constructorimpl(4);
                        } else {
                            m7774constructorimpl2 = Dp.m7774constructorimpl(6);
                        }
                        float f = m7774constructorimpl2;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier then = modifier4.then(function04 == null ? ClickableKt.m1059clickableXHw0xAI$default(companion, false, null, null, function04, 7, null) : companion);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.HorizontalOrVertical center = !z12 ? arrangement.getCenter() : arrangement.getStart();
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, startRestartGroup, 48);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
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
                        Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        int i9 = i3;
                        modifier3 = modifier4;
                        SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(image, "league image", SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, m7774constructorimpl), null, null, null, null, 0.0f, null, 0, false, startRestartGroup, ((i3 >> 3) & 14) | 48, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
                        composer2 = startRestartGroup;
                        TextKt.m2642Text4IGK_g(label, PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, (!z11 || z7) ? TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8() : TextOverflow.INSTANCE.m7709getClipgIe3tQ8(), false, (!z11 || z7) ? 1 : Integer.MAX_VALUE, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), j, new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer2, (i9 >> 6) & 14, 0, 55292);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z8 = z11;
                        z9 = z7;
                        z10 = z12;
                        function03 = function04;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z8 = z4;
                        z9 = z5;
                        z10 = z6;
                        composer2 = startRestartGroup;
                        function03 = function02;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        final Modifier modifier5 = modifier3;
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.common.compose.MatchLeagueItemKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit MatchLeagueItem$lambda$1;
                                MatchLeagueItem$lambda$1 = MatchLeagueItemKt.MatchLeagueItem$lambda$1(Modifier.this, image, label, z8, z9, z10, function03, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return MatchLeagueItem$lambda$1;
                            }
                        });
                        return;
                    }
                    return;
                }
                z6 = z3;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i3 & 599187) == 599186) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (!z7) {
                }
                if (!z7) {
                }
                long j2 = sp;
                if (!z7) {
                }
                float f2 = m7774constructorimpl2;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier then2 = modifier4.then(function04 == null ? ClickableKt.m1059clickableXHw0xAI$default(companion2, false, null, null, function04, 7, null) : companion2);
                Arrangement arrangement2 = Arrangement.INSTANCE;
                if (!z12) {
                }
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(center, centerVertically2, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, then2);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                int i92 = i3;
                modifier3 = modifier4;
                SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(image, "league image", SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, m7774constructorimpl), null, null, null, null, 0.0f, null, 0, false, startRestartGroup, ((i3 >> 3) & 14) | 48, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
                composer2 = startRestartGroup;
                TextKt.m2642Text4IGK_g(label, PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, f2, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, (!z11 || z7) ? TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8() : TextOverflow.INSTANCE.m7709getClipgIe3tQ8(), false, (!z11 || z7) ? 1 : Integer.MAX_VALUE, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), j2, new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer2, (i92 >> 6) & 14, 0, 55292);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                }
                z8 = z11;
                z9 = z7;
                z10 = z12;
                function03 = function04;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z5 = z2;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            z6 = z3;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i3 & 599187) == 599186) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!z7) {
            }
            if (!z7) {
            }
            long j22 = sp;
            if (!z7) {
            }
            float f22 = m7774constructorimpl2;
            Modifier.Companion companion22 = Modifier.INSTANCE;
            Modifier then22 = modifier4.then(function04 == null ? ClickableKt.m1059clickableXHw0xAI$default(companion22, false, null, null, function04, 7, null) : companion22);
            Arrangement arrangement22 = Arrangement.INSTANCE;
            if (!z12) {
            }
            Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(center, centerVertically22, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, then22);
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
            int i922 = i3;
            modifier3 = modifier4;
            SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(image, "league image", SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, m7774constructorimpl), null, null, null, null, 0.0f, null, 0, false, startRestartGroup, ((i3 >> 3) & 14) | 48, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
            composer2 = startRestartGroup;
            TextKt.m2642Text4IGK_g(label, PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, f22, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, (!z11 || z7) ? TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8() : TextOverflow.INSTANCE.m7709getClipgIe3tQ8(), false, (!z11 || z7) ? 1 : Integer.MAX_VALUE, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), j22, new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer2, (i922 >> 6) & 14, 0, 55292);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            z8 = z11;
            z9 = z7;
            z10 = z12;
            function03 = function04;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        z4 = z;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z5 = z2;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        z6 = z3;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i3 & 599187) == 599186) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        if (!z7) {
        }
        if (!z7) {
        }
        long j222 = sp;
        if (!z7) {
        }
        float f222 = m7774constructorimpl2;
        Modifier.Companion companion222 = Modifier.INSTANCE;
        Modifier then222 = modifier4.then(function04 == null ? ClickableKt.m1059clickableXHw0xAI$default(companion222, false, null, null, function04, 7, null) : companion222);
        Arrangement arrangement222 = Arrangement.INSTANCE;
        if (!z12) {
        }
        Alignment.Vertical centerVertically222 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(center, centerVertically222, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, then222);
        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
        int i9222 = i3;
        modifier3 = modifier4;
        SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(image, "league image", SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, m7774constructorimpl), null, null, null, null, 0.0f, null, 0, false, startRestartGroup, ((i3 >> 3) & 14) | 48, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
        composer2 = startRestartGroup;
        TextKt.m2642Text4IGK_g(label, PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, f222, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, (!z11 || z7) ? TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8() : TextOverflow.INSTANCE.m7709getClipgIe3tQ8(), false, (!z11 || z7) ? 1 : Integer.MAX_VALUE, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), j222, new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer2, (i9222 >> 6) & 14, 0, 55292);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        z8 = z11;
        z9 = z7;
        z10 = z12;
        function03 = function04;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
