package org.betup.ui.fragment.flashbet.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.exifinterface.media.ExifInterface;
import coil3.compose.SingletonAsyncImageKt;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.ui.common.compose.ClickAnimationModifierKt;
import org.betup.ui.views.ComposeUtils;

/* compiled from: FlashBetLeagueCardItem.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b¨\u0006\n"}, d2 = {"FlashBetLeagueCard", "", "item", "Lorg/betup/ui/fragment/flashbet/compose/FlashBetLeagueCardItem;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lorg/betup/ui/fragment/flashbet/compose/FlashBetLeagueCardItem;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewFlashBetLeagueCard", "(Landroidx/compose/runtime/Composer;I)V", "PreviewFlashBetLeagueCardNoPhoto", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashBetLeagueCardItemKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetLeagueCard$lambda$10(FlashBetLeagueCardItem flashBetLeagueCardItem, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FlashBetLeagueCard(flashBetLeagueCardItem, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewFlashBetLeagueCard$lambda$11(int i, Composer composer, int i2) {
        PreviewFlashBetLeagueCard(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewFlashBetLeagueCardNoPhoto$lambda$12(int i, Composer composer, int i2) {
        PreviewFlashBetLeagueCardNoPhoto(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x08fa  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0a58  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0a64  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0b60  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0a68  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x090a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0b6b  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x073a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FlashBetLeagueCard(final FlashBetLeagueCardItem item, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        int currentCompositeKeyHash3;
        Composer m4610constructorimpl3;
        String str;
        String str2;
        Composer composer2;
        String str3;
        String str4;
        float f;
        int i4;
        Composer composer3;
        int currentCompositeKeyHash4;
        Composer m4610constructorimpl4;
        int currentCompositeKeyHash5;
        Composer m4610constructorimpl5;
        int currentCompositeKeyHash6;
        Composer m4610constructorimpl6;
        Composer composer4;
        Composer composer5;
        int currentCompositeKeyHash7;
        Composer m4610constructorimpl7;
        int currentCompositeKeyHash8;
        Composer m4610constructorimpl8;
        int currentCompositeKeyHash9;
        Composer m4610constructorimpl9;
        int currentCompositeKeyHash10;
        Composer m4610constructorimpl10;
        Composer composer6;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(item, "item");
        Composer startRestartGroup = composer.startRestartGroup(-589234156);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(item) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i3 & 19) == 18 || !startRestartGroup.getSkipping()) {
                Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-589234156, i3, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetLeagueCard (FlashBetLeagueCardItem.kt:49)");
                }
                long j = ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor();
                long j2 = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
                long j3 = ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor();
                long j4 = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
                float f2 = 8;
                Modifier modifier4 = modifier3;
                float f3 = 12;
                Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(ClickAnimationModifierKt.subtleClickAnimation(BorderKt.m1038borderziNgDLE(BackgroundKt.m1024backgroundbw27NRU(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), j, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f2))), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f2))), item.getOnClick(), null, false, 0, false, false, 0.0f, false, 0.0f, null, startRestartGroup, 0, 0, 1022), Dp.m7774constructorimpl(f3));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs);
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
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment.Vertical top = Alignment.INSTANCE.getTop();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), top, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                Modifier m1024backgroundbw27NRU = BackgroundKt.m1024backgroundbw27NRU(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(100)), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f2)));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m1024backgroundbw27NRU);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceGroup(31205724);
                if (item.getPhotoUrl().length() <= 0) {
                    str = "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo";
                    str2 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                    composer2 = startRestartGroup;
                    str3 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                    f = f3;
                    str4 = "C101@5232L9:Row.kt#2w3rfo";
                    i4 = 12;
                    SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(item.getPhotoUrl(), null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f2))), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, composer2, 1572912, 0, 1976);
                } else {
                    str = "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo";
                    str2 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                    composer2 = startRestartGroup;
                    str3 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                    str4 = "C101@5232L9:Row.kt#2w3rfo";
                    f = f3;
                    i4 = 12;
                }
                composer2.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer3 = composer2;
                SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), composer3, 6);
                Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                String str5 = str2;
                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str5);
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer3, fillMaxHeight$default);
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                String str6 = str3;
                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str6);
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (!composer3.getInserting()) {
                    composer3.createNode(constructor4);
                } else {
                    composer3.useNode();
                }
                m4610constructorimpl4 = Updater.m4610constructorimpl(composer3);
                Updater.m4617setimpl(m4610constructorimpl4, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                Alignment.Vertical top2 = Alignment.INSTANCE.getTop();
                ComposerKt.sourceInformationMarkerStart(composer3, 693286680, str);
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween, top2, composer3, 54);
                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str5);
                currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default);
                Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str6);
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (!composer3.getInserting()) {
                    composer3.createNode(constructor5);
                } else {
                    composer3.useNode();
                }
                m4610constructorimpl5 = Updater.m4610constructorimpl(composer3);
                Updater.m4617setimpl(m4610constructorimpl5, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                Updater.m4617setimpl(m4610constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                String str7 = str4;
                ComposerKt.sourceInformationMarkerStart(composer3, -407735110, str7);
                Modifier weight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
                ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str5);
                currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(composer3, weight$default);
                Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str6);
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (!composer3.getInserting()) {
                    composer3.createNode(constructor6);
                } else {
                    composer3.useNode();
                }
                m4610constructorimpl6 = Updater.m4610constructorimpl(composer3);
                Updater.m4617setimpl(m4610constructorimpl6, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl6.getInserting() || !Intrinsics.areEqual(m4610constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                    m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                    m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                }
                Updater.m4617setimpl(m4610constructorimpl6, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                TextKt.m2642Text4IGK_g(item.getTitle(), (Modifier) null, j2, TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 199680, 0, 131026);
                composer3.startReplaceGroup(345414531);
                if (item.getSeason().length() <= 0) {
                    composer4 = composer3;
                    TextKt.m2642Text4IGK_g(item.getSeason(), PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(2), 0.0f, 0.0f, 13, null), j3, TextUnitKt.getSp(i4), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3120, 0, 131056);
                } else {
                    composer4 = composer3;
                }
                composer4.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer4);
                composer4.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                Composer composer7 = composer4;
                SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), composer7, 6);
                float f4 = 20;
                SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(item.getLeagueLogoUrl(), null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), null, null, null, null, 0.0f, null, 0, false, composer7, 432, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                composer4.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                Modifier fillMaxHeight$default2 = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                composer5 = composer4;
                ComposerKt.sourceInformationMarkerStart(composer5, 693286680, str);
                MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer5, 48);
                ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, str5);
                currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composer5.getCurrentCompositionLocalMap();
                Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(composer5, fillMaxHeight$default2);
                Function0<ComposeUiNode> constructor7 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer5, -692256719, str6);
                if (!(composer5.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer5.startReusableNode();
                if (!composer5.getInserting()) {
                    composer5.createNode(constructor7);
                } else {
                    composer5.useNode();
                }
                m4610constructorimpl7 = Updater.m4610constructorimpl(composer5);
                Updater.m4617setimpl(m4610constructorimpl7, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl7, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl7.getInserting() || !Intrinsics.areEqual(m4610constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                    m4610constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                    m4610constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                }
                Updater.m4617setimpl(m4610constructorimpl7, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer5, -407735110, str7);
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer5, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, str5);
                currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                CompositionLocalMap currentCompositionLocalMap8 = composer5.getCurrentCompositionLocalMap();
                Modifier materializeModifier8 = ComposedModifierKt.materializeModifier(composer5, companion);
                Function0<ComposeUiNode> constructor8 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer5, -692256719, str6);
                if (!(composer5.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer5.startReusableNode();
                if (!composer5.getInserting()) {
                    composer5.createNode(constructor8);
                } else {
                    composer5.useNode();
                }
                m4610constructorimpl8 = Updater.m4610constructorimpl(composer5);
                Updater.m4617setimpl(m4610constructorimpl8, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl8, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl8.getInserting() || !Intrinsics.areEqual(m4610constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                    m4610constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                    m4610constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                }
                Updater.m4617setimpl(m4610constructorimpl8, materializeModifier8, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer5, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.flash_bet_buy_in_for_each_bet, composer5, 6) + " ", PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(f2), 0.0f, 0.0f, 13, null), j2, TextUnitKt.getSp(i4), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer5, 3120, 0, 131056);
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(2), 0.0f, 0.0f, 13, null);
                ComposerKt.sourceInformationMarkerStart(composer5, 693286680, str);
                MeasurePolicy rowMeasurePolicy4 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer5, 48);
                ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, str5);
                currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                CompositionLocalMap currentCompositionLocalMap9 = composer5.getCurrentCompositionLocalMap();
                Modifier materializeModifier9 = ComposedModifierKt.materializeModifier(composer5, m1520paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor9 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer5, -692256719, str6);
                if (!(composer5.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer5.startReusableNode();
                if (!composer5.getInserting()) {
                    composer5.createNode(constructor9);
                } else {
                    composer5.useNode();
                }
                m4610constructorimpl9 = Updater.m4610constructorimpl(composer5);
                Updater.m4617setimpl(m4610constructorimpl9, rowMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl9, currentCompositionLocalMap9, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl9.getInserting() || !Intrinsics.areEqual(m4610constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                    m4610constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
                    m4610constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
                }
                Updater.m4617setimpl(m4610constructorimpl9, materializeModifier9, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer5, -407735110, str7);
                RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                TextKt.m2642Text4IGK_g(String.valueOf(item.getEntryFee()), (Modifier) null, j4, TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer5, 199680, 0, 131026);
                SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(4)), composer5, 6);
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.new_betcoin, composer5, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer5, 432, 120);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                composer5.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                composer5.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                Modifier m1520paddingqDBjuR0$default2 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(f2), 0.0f, 0.0f, 13, null);
                Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                ComposerKt.sourceInformationMarkerStart(composer5, 693286680, str);
                MeasurePolicy rowMeasurePolicy5 = RowKt.rowMeasurePolicy(end, Alignment.INSTANCE.getTop(), composer5, 6);
                ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, str5);
                currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                CompositionLocalMap currentCompositionLocalMap10 = composer5.getCurrentCompositionLocalMap();
                Modifier materializeModifier10 = ComposedModifierKt.materializeModifier(composer5, m1520paddingqDBjuR0$default2);
                Function0<ComposeUiNode> constructor10 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer5, -692256719, str6);
                if (!(composer5.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer5.startReusableNode();
                if (!composer5.getInserting()) {
                    composer5.createNode(constructor10);
                } else {
                    composer5.useNode();
                }
                m4610constructorimpl10 = Updater.m4610constructorimpl(composer5);
                Updater.m4617setimpl(m4610constructorimpl10, rowMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl10, currentCompositionLocalMap10, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash10 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl10.getInserting() || !Intrinsics.areEqual(m4610constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                    m4610constructorimpl10.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash10));
                    m4610constructorimpl10.apply(Integer.valueOf(currentCompositeKeyHash10), setCompositeKeyHash10);
                }
                Updater.m4617setimpl(m4610constructorimpl10, materializeModifier10, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer5, -407735110, str7);
                RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                composer6 = composer5;
                TextKt.m2642Text4IGK_g(item.getPlayedMatches() + " / " + item.getTotalMatches(), (Modifier) null, j2, TextUnitKt.getSp(i4), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer6, 199680, 0, 131026);
                ComposerKt.sourceInformationMarkerEnd(composer6);
                composer6.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer6);
                ComposerKt.sourceInformationMarkerEnd(composer6);
                ComposerKt.sourceInformationMarkerEnd(composer6);
                ComposerKt.sourceInformationMarkerEnd(composer6);
                composer6.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer6);
                ComposerKt.sourceInformationMarkerEnd(composer6);
                ComposerKt.sourceInformationMarkerEnd(composer6);
                ComposerKt.sourceInformationMarkerEnd(composer6);
                composer6.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer6);
                ComposerKt.sourceInformationMarkerEnd(composer6);
                ComposerKt.sourceInformationMarkerEnd(composer6);
                ComposerKt.sourceInformationMarkerEnd(composer6);
                composer6.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer6);
                ComposerKt.sourceInformationMarkerEnd(composer6);
                ComposerKt.sourceInformationMarkerEnd(composer6);
                ComposerKt.sourceInformationMarkerEnd(composer6);
                composer6.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer6);
                ComposerKt.sourceInformationMarkerEnd(composer6);
                ComposerKt.sourceInformationMarkerEnd(composer6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
                composer6 = startRestartGroup;
            }
            endRestartGroup = composer6.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetLeagueCardItemKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit FlashBetLeagueCard$lambda$10;
                        FlashBetLeagueCard$lambda$10 = FlashBetLeagueCardItemKt.FlashBetLeagueCard$lambda$10(FlashBetLeagueCardItem.this, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return FlashBetLeagueCard$lambda$10;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        long j5 = ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor();
        long j22 = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
        long j32 = ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor();
        long j42 = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
        float f22 = 8;
        Modifier modifier42 = modifier3;
        float f32 = 12;
        Modifier m1516padding3ABfNKs2 = PaddingKt.m1516padding3ABfNKs(ClickAnimationModifierKt.subtleClickAnimation(BorderKt.m1038borderziNgDLE(BackgroundKt.m1024backgroundbw27NRU(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), j5, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f22))), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f22))), item.getOnClick(), null, false, 0, false, false, 0.0f, false, 0.0f, null, startRestartGroup, 0, 0, 1022), Dp.m7774constructorimpl(f32));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap11 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier11 = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs2);
        Function0<ComposeUiNode> constructor11 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap11, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash11 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash11);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier11, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
        Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        Alignment.Vertical top3 = Alignment.INSTANCE.getTop();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy6 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), top3, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance5 = RowScopeInstance.INSTANCE;
        Modifier m1024backgroundbw27NRU2 = BackgroundKt.m1024backgroundbw27NRU(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(100)), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f22)));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, m1024backgroundbw27NRU2);
        Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl3.getInserting()) {
        }
        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32);
        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(31205724);
        if (item.getPhotoUrl().length() <= 0) {
        }
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer3 = composer2;
        SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), composer3, 6);
        Modifier fillMaxHeight$default3 = SizeKt.fillMaxHeight$default(RowScope.weight$default(rowScopeInstance5, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
        String str52 = str2;
        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str52);
        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
        CompositionLocalMap currentCompositionLocalMap42 = composer3.getCurrentCompositionLocalMap();
        Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(composer3, fillMaxHeight$default3);
        Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
        String str62 = str3;
        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str62);
        if (!(composer3.getApplier() instanceof Applier)) {
        }
        composer3.startReusableNode();
        if (!composer3.getInserting()) {
        }
        m4610constructorimpl4 = Updater.m4610constructorimpl(composer3);
        Updater.m4617setimpl(m4610constructorimpl4, columnMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl4.getInserting()) {
        }
        m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
        m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash42);
        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
        Alignment.Vertical top22 = Alignment.INSTANCE.getTop();
        ComposerKt.sourceInformationMarkerStart(composer3, 693286680, str);
        MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(spaceBetween2, top22, composer3, 54);
        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str52);
        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
        CompositionLocalMap currentCompositionLocalMap52 = composer3.getCurrentCompositionLocalMap();
        Modifier materializeModifier52 = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default2);
        Function0<ComposeUiNode> constructor52 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str62);
        if (!(composer3.getApplier() instanceof Applier)) {
        }
        composer3.startReusableNode();
        if (!composer3.getInserting()) {
        }
        m4610constructorimpl5 = Updater.m4610constructorimpl(composer3);
        Updater.m4617setimpl(m4610constructorimpl5, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap52, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash52 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl5.getInserting()) {
        }
        m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
        m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash52);
        Updater.m4617setimpl(m4610constructorimpl5, materializeModifier52, ComposeUiNode.INSTANCE.getSetModifier());
        String str72 = str4;
        ComposerKt.sourceInformationMarkerStart(composer3, -407735110, str72);
        Modifier weight$default2 = RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
        ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str52);
        currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
        CompositionLocalMap currentCompositionLocalMap62 = composer3.getCurrentCompositionLocalMap();
        Modifier materializeModifier62 = ComposedModifierKt.materializeModifier(composer3, weight$default2);
        Function0<ComposeUiNode> constructor62 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str62);
        if (!(composer3.getApplier() instanceof Applier)) {
        }
        composer3.startReusableNode();
        if (!composer3.getInserting()) {
        }
        m4610constructorimpl6 = Updater.m4610constructorimpl(composer3);
        Updater.m4617setimpl(m4610constructorimpl6, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap62, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash62 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl6.getInserting()) {
        }
        m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
        m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash62);
        Updater.m4617setimpl(m4610constructorimpl6, materializeModifier62, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
        TextKt.m2642Text4IGK_g(item.getTitle(), (Modifier) null, j22, TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 199680, 0, 131026);
        composer3.startReplaceGroup(345414531);
        if (item.getSeason().length() <= 0) {
        }
        composer4.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer4);
        composer4.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer4);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        Composer composer72 = composer4;
        SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), composer72, 6);
        float f42 = 20;
        SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(item.getLeagueLogoUrl(), null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f42)), null, null, null, null, 0.0f, null, 0, false, composer72, 432, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        composer4.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer4);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
        Modifier fillMaxHeight$default22 = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
        composer5 = composer4;
        ComposerKt.sourceInformationMarkerStart(composer5, 693286680, str);
        MeasurePolicy rowMeasurePolicy32 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3, composer5, 48);
        ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, str52);
        currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
        CompositionLocalMap currentCompositionLocalMap72 = composer5.getCurrentCompositionLocalMap();
        Modifier materializeModifier72 = ComposedModifierKt.materializeModifier(composer5, fillMaxHeight$default22);
        Function0<ComposeUiNode> constructor72 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer5, -692256719, str62);
        if (!(composer5.getApplier() instanceof Applier)) {
        }
        composer5.startReusableNode();
        if (!composer5.getInserting()) {
        }
        m4610constructorimpl7 = Updater.m4610constructorimpl(composer5);
        Updater.m4617setimpl(m4610constructorimpl7, rowMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl7, currentCompositionLocalMap72, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash72 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl7.getInserting()) {
        }
        m4610constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
        m4610constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash72);
        Updater.m4617setimpl(m4610constructorimpl7, materializeModifier72, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer5, -407735110, str72);
        RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer5, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        Modifier.Companion companion2 = Modifier.INSTANCE;
        MeasurePolicy columnMeasurePolicy32 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
        ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, str52);
        currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
        CompositionLocalMap currentCompositionLocalMap82 = composer5.getCurrentCompositionLocalMap();
        Modifier materializeModifier82 = ComposedModifierKt.materializeModifier(composer5, companion2);
        Function0<ComposeUiNode> constructor82 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer5, -692256719, str62);
        if (!(composer5.getApplier() instanceof Applier)) {
        }
        composer5.startReusableNode();
        if (!composer5.getInserting()) {
        }
        m4610constructorimpl8 = Updater.m4610constructorimpl(composer5);
        Updater.m4617setimpl(m4610constructorimpl8, columnMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl8, currentCompositionLocalMap82, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash82 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl8.getInserting()) {
        }
        m4610constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
        m4610constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash82);
        Updater.m4617setimpl(m4610constructorimpl8, materializeModifier82, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer5, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance32 = ColumnScopeInstance.INSTANCE;
        TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.flash_bet_buy_in_for_each_bet, composer5, 6) + " ", PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(f22), 0.0f, 0.0f, 13, null), j22, TextUnitKt.getSp(i4), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer5, 3120, 0, 131056);
        Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
        Modifier m1520paddingqDBjuR0$default3 = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(2), 0.0f, 0.0f, 13, null);
        ComposerKt.sourceInformationMarkerStart(composer5, 693286680, str);
        MeasurePolicy rowMeasurePolicy42 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22, composer5, 48);
        ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, str52);
        currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
        CompositionLocalMap currentCompositionLocalMap92 = composer5.getCurrentCompositionLocalMap();
        Modifier materializeModifier92 = ComposedModifierKt.materializeModifier(composer5, m1520paddingqDBjuR0$default3);
        Function0<ComposeUiNode> constructor92 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer5, -692256719, str62);
        if (!(composer5.getApplier() instanceof Applier)) {
        }
        composer5.startReusableNode();
        if (!composer5.getInserting()) {
        }
        m4610constructorimpl9 = Updater.m4610constructorimpl(composer5);
        Updater.m4617setimpl(m4610constructorimpl9, rowMeasurePolicy42, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl9, currentCompositionLocalMap92, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash92 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl9.getInserting()) {
        }
        m4610constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
        m4610constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash92);
        Updater.m4617setimpl(m4610constructorimpl9, materializeModifier92, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer5, -407735110, str72);
        RowScopeInstance rowScopeInstance32 = RowScopeInstance.INSTANCE;
        TextKt.m2642Text4IGK_g(String.valueOf(item.getEntryFee()), (Modifier) null, j42, TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer5, 199680, 0, 131026);
        SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(4)), composer5, 6);
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.new_betcoin, composer5, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f42)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer5, 432, 120);
        ComposerKt.sourceInformationMarkerEnd(composer5);
        composer5.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer5);
        ComposerKt.sourceInformationMarkerEnd(composer5);
        ComposerKt.sourceInformationMarkerEnd(composer5);
        ComposerKt.sourceInformationMarkerEnd(composer5);
        composer5.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer5);
        ComposerKt.sourceInformationMarkerEnd(composer5);
        ComposerKt.sourceInformationMarkerEnd(composer5);
        Modifier m1520paddingqDBjuR0$default22 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(f22), 0.0f, 0.0f, 13, null);
        Arrangement.Horizontal end2 = Arrangement.INSTANCE.getEnd();
        ComposerKt.sourceInformationMarkerStart(composer5, 693286680, str);
        MeasurePolicy rowMeasurePolicy52 = RowKt.rowMeasurePolicy(end2, Alignment.INSTANCE.getTop(), composer5, 6);
        ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, str52);
        currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
        CompositionLocalMap currentCompositionLocalMap102 = composer5.getCurrentCompositionLocalMap();
        Modifier materializeModifier102 = ComposedModifierKt.materializeModifier(composer5, m1520paddingqDBjuR0$default22);
        Function0<ComposeUiNode> constructor102 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer5, -692256719, str62);
        if (!(composer5.getApplier() instanceof Applier)) {
        }
        composer5.startReusableNode();
        if (!composer5.getInserting()) {
        }
        m4610constructorimpl10 = Updater.m4610constructorimpl(composer5);
        Updater.m4617setimpl(m4610constructorimpl10, rowMeasurePolicy52, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl10, currentCompositionLocalMap102, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash102 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl10.getInserting()) {
        }
        m4610constructorimpl10.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash10));
        m4610constructorimpl10.apply(Integer.valueOf(currentCompositeKeyHash10), setCompositeKeyHash102);
        Updater.m4617setimpl(m4610constructorimpl10, materializeModifier102, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer5, -407735110, str72);
        RowScopeInstance rowScopeInstance42 = RowScopeInstance.INSTANCE;
        composer6 = composer5;
        TextKt.m2642Text4IGK_g(item.getPlayedMatches() + " / " + item.getTotalMatches(), (Modifier) null, j22, TextUnitKt.getSp(i4), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer6, 199680, 0, 131026);
        ComposerKt.sourceInformationMarkerEnd(composer6);
        composer6.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer6);
        ComposerKt.sourceInformationMarkerEnd(composer6);
        ComposerKt.sourceInformationMarkerEnd(composer6);
        ComposerKt.sourceInformationMarkerEnd(composer6);
        composer6.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer6);
        ComposerKt.sourceInformationMarkerEnd(composer6);
        ComposerKt.sourceInformationMarkerEnd(composer6);
        ComposerKt.sourceInformationMarkerEnd(composer6);
        composer6.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer6);
        ComposerKt.sourceInformationMarkerEnd(composer6);
        ComposerKt.sourceInformationMarkerEnd(composer6);
        ComposerKt.sourceInformationMarkerEnd(composer6);
        composer6.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer6);
        ComposerKt.sourceInformationMarkerEnd(composer6);
        ComposerKt.sourceInformationMarkerEnd(composer6);
        ComposerKt.sourceInformationMarkerEnd(composer6);
        composer6.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer6);
        ComposerKt.sourceInformationMarkerEnd(composer6);
        ComposerKt.sourceInformationMarkerEnd(composer6);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier42;
        endRestartGroup = composer6.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void PreviewFlashBetLeagueCard(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(652115740);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(652115740, i, -1, "org.betup.ui.fragment.flashbet.compose.PreviewFlashBetLeagueCard (FlashBetLeagueCardItem.kt:180)");
            }
            FlashBetLeagueCard(new FlashBetLeagueCardItem("1", "Premier League", "2024/2025", "https://picsum.photos/200", "https://picsum.photos/64", 100L, 3, 10, null, 256, null), PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16)), startRestartGroup, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetLeagueCardItemKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewFlashBetLeagueCard$lambda$11;
                    PreviewFlashBetLeagueCard$lambda$11 = FlashBetLeagueCardItemKt.PreviewFlashBetLeagueCard$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewFlashBetLeagueCard$lambda$11;
                }
            });
        }
    }

    private static final void PreviewFlashBetLeagueCardNoPhoto(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(968336441);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(968336441, i, -1, "org.betup.ui.fragment.flashbet.compose.PreviewFlashBetLeagueCardNoPhoto (FlashBetLeagueCardItem.kt:202)");
            }
            FlashBetLeagueCard(new FlashBetLeagueCardItem(ExifInterface.GPS_MEASUREMENT_2D, "La Liga", "", "", null, 50L, 0, 5, null, 256, null), PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16)), startRestartGroup, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetLeagueCardItemKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewFlashBetLeagueCardNoPhoto$lambda$12;
                    PreviewFlashBetLeagueCardNoPhoto$lambda$12 = FlashBetLeagueCardItemKt.PreviewFlashBetLeagueCardNoPhoto$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewFlashBetLeagueCardNoPhoto$lambda$12;
                }
            });
        }
    }
}
