package org.betup.ui.common.compose;

import android.view.View;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.extractor.ts.PsExtractor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.ui.views.ComposeUtils;

/* compiled from: TicketDark.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\u008a\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0015\b\u0002\u0010\u0004\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u0010\u001a7\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001au\u0010\u0019\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00132\b\b\u0002\u0010\u001d\u001a\u00020\u00132\b\b\u0002\u0010\u001e\u001a\u00020\u00132\b\b\u0002\u0010\u001f\u001a\u00020\u00132\b\b\u0002\u0010 \u001a\u00020\u00132\b\b\u0002\u0010!\u001a\u00020\u00132\b\b\u0002\u0010\"\u001a\u00020\u00132\b\b\u0002\u0010#\u001a\u00020\u00132\b\b\u0002\u0010$\u001a\u00020\u0013¢\u0006\u0004\b%\u0010&\u001a\r\u0010'\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010(¨\u0006)²\u0006\n\u0010*\u001a\u00020\u0013X\u008a\u008e\u0002"}, d2 = {"TicketDark", "", "modifier", "Landroidx/compose/ui/Modifier;", "header", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "contentBottom", "isLocked", "", "isInDialog", "onShareBoundsPositioned", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "useTightShareBounds", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZLkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "AutoDotsRow", "dotSize", "Landroidx/compose/ui/unit/Dp;", "dotSpacing", "dotColor", "Landroidx/compose/ui/graphics/Color;", "AutoDotsRow-Zi-j2fk", "(Landroidx/compose/ui/Modifier;FFJLandroidx/compose/runtime/Composer;II)V", "drawTicketBorderWithSideDots", "borderBrush", "Landroidx/compose/ui/graphics/Brush;", "strokeWidth", "cornerRadius", "topNotchWidth", "topNotchHeight", "bottomNotchWidth", "bottomNotchHeight", "leftDotCenterY", "rightDotCenterY", "sideDotRadius", "drawTicketBorderWithSideDots--1HiNMM", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Brush;FFFFFFFFF)Landroidx/compose/ui/Modifier;", "PreviewTicketDark", "(Landroidx/compose/runtime/Composer;I)V", "app_release", "finalDotY"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TicketDarkKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AutoDotsRow_Zi_j2fk$lambda$24(Modifier modifier, float f, float f2, long j, int i, int i2, Composer composer, int i3) {
        m12962AutoDotsRowZij2fk(modifier, f, f2, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewTicketDark$lambda$26(int i, Composer composer, int i2) {
        PreviewTicketDark(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketDark$lambda$23(Modifier modifier, Function2 function2, Function2 function22, Function2 function23, boolean z, boolean z2, Function1 function1, boolean z3, int i, int i2, Composer composer, int i3) {
        TicketDark(modifier, function2, function22, function23, z, z2, function1, z3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x058c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x080a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x08ab  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x08b7  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x09ab  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x09ff  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0a0b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0a34  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0a97  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0b11  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0c38  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0a0f  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0c47  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0492  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TicketDark(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> content, final Function2<? super Composer, ? super Integer, Unit> contentBottom, boolean z, boolean z2, Function1<? super LayoutCoordinates, Unit> function1, boolean z3, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Function2<? super Composer, ? super Integer, Unit> function22;
        int i4;
        boolean z4;
        int i5;
        int i6;
        int i7;
        boolean z5;
        boolean z6;
        boolean z7;
        Object rememberedValue;
        int currentCompositeKeyHash;
        Modifier modifier3;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        Object rememberedValue2;
        int currentCompositeKeyHash3;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Composer m4610constructorimpl3;
        int currentCompositeKeyHash4;
        Composer m4610constructorimpl4;
        Modifier fillMaxSize$default;
        int currentCompositeKeyHash5;
        Composer m4610constructorimpl5;
        Modifier.Companion companion;
        int currentCompositeKeyHash6;
        Composer m4610constructorimpl6;
        Modifier fillMaxSize$default2;
        int currentCompositeKeyHash7;
        Composer m4610constructorimpl7;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int currentCompositeKeyHash8;
        Composer m4610constructorimpl8;
        int currentCompositeKeyHash9;
        Composer m4610constructorimpl9;
        Function1<? super LayoutCoordinates, Unit> function12;
        boolean changed;
        Object rememberedValue3;
        int currentCompositeKeyHash10;
        Composer m4610constructorimpl10;
        final boolean z8;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final boolean z9;
        final boolean z10;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(contentBottom, "contentBottom");
        Composer startRestartGroup = composer.startRestartGroup(-124048058);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function22 = function2;
            i3 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i3 |= startRestartGroup.changedInstance(content) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(contentBottom) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z4 = z;
                i3 |= startRestartGroup.changed(z4) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i3 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changedInstance(function1) ? 1048576 : 524288;
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changed(z3) ? 8388608 : 4194304;
                }
                if ((i3 & 4793491) == 4793490 || !startRestartGroup.getSkipping()) {
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    Function2<? super Composer, ? super Integer, Unit> function26 = i9 != 0 ? null : function22;
                    z5 = i4 != 0 ? false : z4;
                    z6 = i5 != 0 ? false : z2;
                    final Function1<? super LayoutCoordinates, Unit> function13 = i6 != 0 ? null : function1;
                    z7 = i7 != 0 ? false : z3;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-124048058, i3, -1, "org.betup.ui.common.compose.TicketDark (TicketDark.kt:65)");
                    }
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final Density density = (Density) consume;
                    ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume2 = startRestartGroup.consume(localView);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final View view = (View) consume2;
                    Modifier background$default = BackgroundKt.background$default(modifier2, ComposeUtils.AppBrushPalette.ButtonBackgroundGrayDouble.INSTANCE.getBrush(), null, 0.0f, 6, null);
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: org.betup.ui.common.compose.TicketDarkKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit unit;
                                unit = Unit.INSTANCE;
                                return unit;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceGroup();
                    Modifier m1059clickableXHw0xAI$default = ClickableKt.m1059clickableXHw0xAI$default(background$default, false, null, null, (Function0) rememberedValue, 7, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    modifier3 = modifier2;
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
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
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
                    m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m7772boximpl(Dp.m7774constructorimpl(104)), null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    final MutableState mutableState = (MutableState) rememberedValue2;
                    startRestartGroup.endReplaceGroup();
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, companion3);
                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    function23 = function26;
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
                    m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    float f = 38;
                    float f2 = 8;
                    float f3 = 5;
                    Modifier m12964drawTicketBorderWithSideDots1HiNMM$default = m12964drawTicketBorderWithSideDots1HiNMM$default(ClipKt.clipToBounds(Modifier.INSTANCE), null, Dp.m7774constructorimpl(1), Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f2), TicketDark$lambda$22$lambda$20$lambda$3(mutableState), TicketDark$lambda$22$lambda$20$lambda$3(mutableState), Dp.m7774constructorimpl(f3), 1, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, m12964drawTicketBorderWithSideDots1HiNMM$default);
                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
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
                    m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    if (z6) {
                        fillMaxSize$default = SizeKt.fillMaxWidth$default(SizeKt.wrapContentHeight$default(Modifier.INSTANCE, null, false, 3, null), 0.0f, 1, null);
                    } else {
                        fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
                    Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor5);
                    } else {
                        startRestartGroup.useNode();
                    }
                    m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl5, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    Updater.m4617setimpl(m4610constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceGroup(-530426686);
                    if (!z7 && function13 != null) {
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        startRestartGroup.startReplaceGroup(5004770);
                        boolean z11 = (3670016 & i3) == 1048576;
                        Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if (z11 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new Function1() { // from class: org.betup.ui.common.compose.TicketDarkKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit TicketDark$lambda$22$lambda$20$lambda$19$lambda$18$lambda$16$lambda$6$lambda$5;
                                    TicketDark$lambda$22$lambda$20$lambda$19$lambda$18$lambda$16$lambda$6$lambda$5 = TicketDarkKt.TicketDark$lambda$22$lambda$20$lambda$19$lambda$18$lambda$16$lambda$6$lambda$5(Function1.this, (LayoutCoordinates) obj);
                                    return TicketDark$lambda$22$lambda$20$lambda$19$lambda$18$lambda$16$lambda$6$lambda$5;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        startRestartGroup.endReplaceGroup();
                        companion = OnGloballyPositionedModifierKt.onGloballyPositioned(companion4, (Function1) rememberedValue4);
                    } else {
                        companion = Modifier.INSTANCE;
                    }
                    startRestartGroup.endReplaceGroup();
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    Modifier then = fillMaxWidth$default.then(!z6 ? ColumnScope.weight$default(columnScopeInstance2, companion5, 1.0f, false, 2, null) : companion5).then(companion);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(startRestartGroup, then);
                    Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor6);
                    } else {
                        startRestartGroup.useNode();
                    }
                    m4610constructorimpl6 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl6, maybeCachedBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl6.getInserting() || !Intrinsics.areEqual(m4610constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                        m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                        m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                    }
                    Updater.m4617setimpl(m4610constructorimpl6, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                    if (z6) {
                        fillMaxSize$default2 = SizeKt.fillMaxWidth$default(SizeKt.wrapContentHeight$default(Modifier.INSTANCE, null, false, 3, null), 0.0f, 1, null);
                    } else {
                        fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
                    Function0<ComposeUiNode> constructor7 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor7);
                    } else {
                        startRestartGroup.useNode();
                    }
                    m4610constructorimpl7 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl7, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl7, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl7.getInserting() || !Intrinsics.areEqual(m4610constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                        m4610constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                        m4610constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                    }
                    Updater.m4617setimpl(m4610constructorimpl7, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceGroup(-1469768056);
                    if (function23 == null) {
                        function24 = function23;
                    } else {
                        function24 = function23;
                        function24.invoke(startRestartGroup, Integer.valueOf((i3 >> 3) & 14));
                        Unit unit = Unit.INSTANCE;
                    }
                    startRestartGroup.endReplaceGroup();
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    Modifier.Companion companion7 = Modifier.INSTANCE;
                    Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion6.then(z6 ? SizeKt.wrapContentHeight$default(companion7, null, false, 3, null) : ColumnScope.weight$default(columnScopeInstance3, companion7, 1.0f, false, 2, null)), 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap8 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier8 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
                    Function0<ComposeUiNode> constructor8 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor8);
                    } else {
                        startRestartGroup.useNode();
                    }
                    m4610constructorimpl8 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl8, columnMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl8, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl8.getInserting() || !Intrinsics.areEqual(m4610constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                        m4610constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                        m4610constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                    }
                    Updater.m4617setimpl(m4610constructorimpl8, materializeModifier8, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                    content.invoke(startRestartGroup, Integer.valueOf((i3 >> 6) & 14));
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    float f4 = 4;
                    Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(f4), 0.0f, 0.0f, 13, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap9 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier9 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default);
                    Function0<ComposeUiNode> constructor9 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor9);
                    } else {
                        startRestartGroup.useNode();
                    }
                    m4610constructorimpl9 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl9, maybeCachedBoxMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl9, currentCompositionLocalMap9, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl9.getInserting() || !Intrinsics.areEqual(m4610constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                        m4610constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
                        m4610constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
                    }
                    Updater.m4617setimpl(m4610constructorimpl9, materializeModifier9, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    function12 = function13;
                    m12962AutoDotsRowZij2fk(PaddingKt.m1518paddingVpY3zN4$default(BoxScopeInstance.INSTANCE.align(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenter()), Dp.m7774constructorimpl(f4), 0.0f, 2, null), 0.0f, 0.0f, 0L, startRestartGroup, 0, 14);
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
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier m1520paddingqDBjuR0$default2 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(f4), 0.0f, 0.0f, 13, null);
                    startRestartGroup.startReplaceGroup(-1746271574);
                    changed = startRestartGroup.changed(density) | startRestartGroup.changedInstance(view);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new Function1() { // from class: org.betup.ui.common.compose.TicketDarkKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit TicketDark$lambda$22$lambda$20$lambda$19$lambda$18$lambda$16$lambda$14$lambda$13;
                                TicketDark$lambda$22$lambda$20$lambda$19$lambda$18$lambda$16$lambda$14$lambda$13 = TicketDarkKt.TicketDark$lambda$22$lambda$20$lambda$19$lambda$18$lambda$16$lambda$14$lambda$13(Density.this, view, mutableState, (LayoutCoordinates) obj);
                                return TicketDark$lambda$22$lambda$20$lambda$19$lambda$18$lambda$16$lambda$14$lambda$13;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    startRestartGroup.endReplaceGroup();
                    Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(m1520paddingqDBjuR0$default2, (Function1) rememberedValue3);
                    Alignment center = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap10 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier10 = ComposedModifierKt.materializeModifier(startRestartGroup, onGloballyPositioned);
                    Function0<ComposeUiNode> constructor10 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor10);
                    } else {
                        startRestartGroup.useNode();
                    }
                    m4610constructorimpl10 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl10, maybeCachedBoxMeasurePolicy6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl10, currentCompositionLocalMap10, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash10 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl10.getInserting() || !Intrinsics.areEqual(m4610constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                        m4610constructorimpl10.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash10));
                        m4610constructorimpl10.apply(Integer.valueOf(currentCompositeKeyHash10), setCompositeKeyHash10);
                    }
                    Updater.m4617setimpl(m4610constructorimpl10, materializeModifier10, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                    contentBottom.invoke(startRestartGroup, Integer.valueOf((i3 >> 9) & 14));
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
                    startRestartGroup.startReplaceGroup(-397507047);
                    if (function24 != null) {
                        BoxKt.Box(BackgroundKt.m1024backgroundbw27NRU(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(boxScopeInstance3.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), Dp.m7774constructorimpl(f)), Dp.m7774constructorimpl(f2)), ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), RoundedCornerShapeKt.m1812RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, Dp.m7774constructorimpl(f4), Dp.m7774constructorimpl(f4), 3, null)), startRestartGroup, 0);
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
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.startReplaceGroup(1895593023);
                    if (z5) {
                        Modifier m1025backgroundbw27NRU$default = BackgroundKt.m1025backgroundbw27NRU$default(boxScopeInstance.align(boxScopeInstance.matchParentSize(Modifier.INSTANCE), Alignment.INSTANCE.getCenter()), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        int currentCompositeKeyHash11 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap11 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier11 = ComposedModifierKt.materializeModifier(startRestartGroup, m1025backgroundbw27NRU$default);
                        Function0<ComposeUiNode> constructor11 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor11);
                        } else {
                            startRestartGroup.useNode();
                        }
                        Composer m4610constructorimpl11 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl11, maybeCachedBoxMeasurePolicy7, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl11, currentCompositionLocalMap11, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash11 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl11.getInserting() || !Intrinsics.areEqual(m4610constructorimpl11.rememberedValue(), Integer.valueOf(currentCompositeKeyHash11))) {
                            m4610constructorimpl11.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash11));
                            m4610constructorimpl11.apply(Integer.valueOf(currentCompositeKeyHash11), setCompositeKeyHash11);
                        }
                        Updater.m4617setimpl(m4610constructorimpl11, materializeModifier11, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.lock_item, startRestartGroup, 6), "lock image", BoxScopeInstance.INSTANCE.align(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(24)), Alignment.INSTANCE.getCenter()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    }
                    startRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z8 = z7;
                    function25 = function24;
                    z9 = z5;
                    z10 = z6;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    z10 = z2;
                    function12 = function1;
                    z8 = z3;
                    modifier3 = modifier2;
                    function25 = function22;
                    z9 = z4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier4 = modifier3;
                    final Function1<? super LayoutCoordinates, Unit> function14 = function12;
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.common.compose.TicketDarkKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit TicketDark$lambda$23;
                            TicketDark$lambda$23 = TicketDarkKt.TicketDark$lambda$23(Modifier.this, function25, content, contentBottom, z9, z10, function14, z8, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return TicketDark$lambda$23;
                        }
                    });
                    return;
                }
                return;
            }
            z4 = z;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if ((i3 & 4793491) == 4793490) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(localDensity2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Density density2 = (Density) consume3;
            ProvidableCompositionLocal<View> localView2 = AndroidCompositionLocals_androidKt.getLocalView();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(localView2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final View view2 = (View) consume22;
            Modifier background$default2 = BackgroundKt.background$default(modifier2, ComposeUtils.AppBrushPalette.ButtonBackgroundGrayDouble.INSTANCE.getBrush(), null, 0.0f, 6, null);
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceGroup();
            Modifier m1059clickableXHw0xAI$default2 = ClickableKt.m1059clickableXHw0xAI$default(background$default2, false, null, null, (Function0) rememberedValue, 7, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy8 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap12 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier12 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default2);
            Function0<ComposeUiNode> constructor12 = ComposeUiNode.INSTANCE.getConstructor();
            modifier3 = modifier2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy8, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap12, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash12 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash12);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier12, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion22 = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, companion22);
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            final MutableState mutableState2 = (MutableState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            Modifier.Companion companion32 = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, companion32);
            Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
            function23 = function26;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl3.getInserting()) {
            }
            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32);
            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
            float f5 = 38;
            float f22 = 8;
            float f32 = 5;
            Modifier m12964drawTicketBorderWithSideDots1HiNMM$default2 = m12964drawTicketBorderWithSideDots1HiNMM$default(ClipKt.clipToBounds(Modifier.INSTANCE), null, Dp.m7774constructorimpl(1), Dp.m7774constructorimpl(f32), Dp.m7774constructorimpl(f5), Dp.m7774constructorimpl(f22), Dp.m7774constructorimpl(f5), Dp.m7774constructorimpl(f22), TicketDark$lambda$22$lambda$20$lambda$3(mutableState2), TicketDark$lambda$22$lambda$20$lambda$3(mutableState2), Dp.m7774constructorimpl(f32), 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap42 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(startRestartGroup, m12964drawTicketBorderWithSideDots1HiNMM$default2);
            Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl4.getInserting()) {
            }
            m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash42);
            Updater.m4617setimpl(m4610constructorimpl4, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance32 = BoxScopeInstance.INSTANCE;
            if (z6) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap52 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier52 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
            Function0<ComposeUiNode> constructor52 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl5, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap52, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash52 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl5.getInserting()) {
            }
            m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
            m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash52);
            Updater.m4617setimpl(m4610constructorimpl5, materializeModifier52, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(-530426686);
            if (!z7) {
            }
            companion = Modifier.INSTANCE;
            startRestartGroup.endReplaceGroup();
            Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Modifier.Companion companion52 = Modifier.INSTANCE;
            Modifier then2 = fillMaxWidth$default3.then(!z6 ? ColumnScope.weight$default(columnScopeInstance22, companion52, 1.0f, false, 2, null) : companion52).then(companion);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy42 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap62 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier62 = ComposedModifierKt.materializeModifier(startRestartGroup, then2);
            Function0<ComposeUiNode> constructor62 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl6 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl6, maybeCachedBoxMeasurePolicy42, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap62, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash62 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl6.getInserting()) {
            }
            m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
            m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash62);
            Updater.m4617setimpl(m4610constructorimpl6, materializeModifier62, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance42 = BoxScopeInstance.INSTANCE;
            if (z6) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy32 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap72 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier72 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
            Function0<ComposeUiNode> constructor72 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl7 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl7, columnMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl7, currentCompositionLocalMap72, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash72 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl7.getInserting()) {
            }
            m4610constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
            m4610constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash72);
            Updater.m4617setimpl(m4610constructorimpl7, materializeModifier72, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance32 = ColumnScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(-1469768056);
            if (function23 == null) {
            }
            startRestartGroup.endReplaceGroup();
            Modifier.Companion companion62 = Modifier.INSTANCE;
            Modifier.Companion companion72 = Modifier.INSTANCE;
            Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(companion62.then(z6 ? SizeKt.wrapContentHeight$default(companion72, null, false, 3, null) : ColumnScope.weight$default(columnScopeInstance32, companion72, 1.0f, false, 2, null)), 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy42 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap82 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier82 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default22);
            Function0<ComposeUiNode> constructor82 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl8 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl8, columnMeasurePolicy42, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl8, currentCompositionLocalMap82, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash82 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl8.getInserting()) {
            }
            m4610constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
            m4610constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash82);
            Updater.m4617setimpl(m4610constructorimpl8, materializeModifier82, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance42 = ColumnScopeInstance.INSTANCE;
            content.invoke(startRestartGroup, Integer.valueOf((i3 >> 6) & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float f42 = 4;
            Modifier m1520paddingqDBjuR0$default3 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(f42), 0.0f, 0.0f, 13, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy52 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap92 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier92 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default3);
            Function0<ComposeUiNode> constructor92 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl9 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl9, maybeCachedBoxMeasurePolicy52, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl9, currentCompositionLocalMap92, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash92 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl9.getInserting()) {
            }
            m4610constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
            m4610constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash92);
            Updater.m4617setimpl(m4610constructorimpl9, materializeModifier92, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            function12 = function13;
            m12962AutoDotsRowZij2fk(PaddingKt.m1518paddingVpY3zN4$default(BoxScopeInstance.INSTANCE.align(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenter()), Dp.m7774constructorimpl(f42), 0.0f, 2, null), 0.0f, 0.0f, 0L, startRestartGroup, 0, 14);
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
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier m1520paddingqDBjuR0$default22 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(f42), 0.0f, 0.0f, 13, null);
            startRestartGroup.startReplaceGroup(-1746271574);
            changed = startRestartGroup.changed(density2) | startRestartGroup.changedInstance(view2);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue3 = new Function1() { // from class: org.betup.ui.common.compose.TicketDarkKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit TicketDark$lambda$22$lambda$20$lambda$19$lambda$18$lambda$16$lambda$14$lambda$13;
                    TicketDark$lambda$22$lambda$20$lambda$19$lambda$18$lambda$16$lambda$14$lambda$13 = TicketDarkKt.TicketDark$lambda$22$lambda$20$lambda$19$lambda$18$lambda$16$lambda$14$lambda$13(Density.this, view2, mutableState2, (LayoutCoordinates) obj);
                    return TicketDark$lambda$22$lambda$20$lambda$19$lambda$18$lambda$16$lambda$14$lambda$13;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceGroup();
            Modifier onGloballyPositioned2 = OnGloballyPositionedModifierKt.onGloballyPositioned(m1520paddingqDBjuR0$default22, (Function1) rememberedValue3);
            Alignment center2 = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy62 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap102 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier102 = ComposedModifierKt.materializeModifier(startRestartGroup, onGloballyPositioned2);
            Function0<ComposeUiNode> constructor102 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl10 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl10, maybeCachedBoxMeasurePolicy62, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl10, currentCompositionLocalMap102, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash102 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl10.getInserting()) {
            }
            m4610constructorimpl10.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash10));
            m4610constructorimpl10.apply(Integer.valueOf(currentCompositeKeyHash10), setCompositeKeyHash102);
            Updater.m4617setimpl(m4610constructorimpl10, materializeModifier102, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance52 = BoxScopeInstance.INSTANCE;
            contentBottom.invoke(startRestartGroup, Integer.valueOf((i3 >> 9) & 14));
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
            startRestartGroup.startReplaceGroup(-397507047);
            if (function24 != null) {
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
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.startReplaceGroup(1895593023);
            if (z5) {
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            z8 = z7;
            function25 = function24;
            z9 = z5;
            z10 = z6;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function22 = function2;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z4 = z;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume32 = startRestartGroup.consume(localDensity22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Density density22 = (Density) consume32;
        ProvidableCompositionLocal<View> localView22 = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume222 = startRestartGroup.consume(localView22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final View view22 = (View) consume222;
        Modifier background$default22 = BackgroundKt.background$default(modifier2, ComposeUtils.AppBrushPalette.ButtonBackgroundGrayDouble.INSTANCE.getBrush(), null, 0.0f, 6, null);
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        Modifier m1059clickableXHw0xAI$default22 = ClickableKt.m1059clickableXHw0xAI$default(background$default22, false, null, null, (Function0) rememberedValue, 7, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy82 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap122 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier122 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default22);
        Function0<ComposeUiNode> constructor122 = ComposeUiNode.INSTANCE.getConstructor();
        modifier3 = modifier2;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy82, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap122, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash122 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash122);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier122, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance62 = BoxScopeInstance.INSTANCE;
        Modifier.Companion companion222 = Modifier.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion222);
        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        final MutableState mutableState22 = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        Modifier.Companion companion322 = Modifier.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy52 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, companion322);
        Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
        function23 = function26;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy52, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl3.getInserting()) {
        }
        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash322);
        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance52 = ColumnScopeInstance.INSTANCE;
        float f52 = 38;
        float f222 = 8;
        float f322 = 5;
        Modifier m12964drawTicketBorderWithSideDots1HiNMM$default22 = m12964drawTicketBorderWithSideDots1HiNMM$default(ClipKt.clipToBounds(Modifier.INSTANCE), null, Dp.m7774constructorimpl(1), Dp.m7774constructorimpl(f322), Dp.m7774constructorimpl(f52), Dp.m7774constructorimpl(f222), Dp.m7774constructorimpl(f52), Dp.m7774constructorimpl(f222), TicketDark$lambda$22$lambda$20$lambda$3(mutableState22), TicketDark$lambda$22$lambda$20$lambda$3(mutableState22), Dp.m7774constructorimpl(f322), 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy322 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap422 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier422 = ComposedModifierKt.materializeModifier(startRestartGroup, m12964drawTicketBorderWithSideDots1HiNMM$default22);
        Function0<ComposeUiNode> constructor422 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap422, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash422 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl4.getInserting()) {
        }
        m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
        m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash422);
        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier422, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance322 = BoxScopeInstance.INSTANCE;
        if (z6) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap522 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier522 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
        Function0<ComposeUiNode> constructor522 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl5, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap522, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash522 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl5.getInserting()) {
        }
        m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
        m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash522);
        Updater.m4617setimpl(m4610constructorimpl5, materializeModifier522, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(-530426686);
        if (!z7) {
        }
        companion = Modifier.INSTANCE;
        startRestartGroup.endReplaceGroup();
        Modifier fillMaxWidth$default32 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        Modifier.Companion companion522 = Modifier.INSTANCE;
        Modifier then22 = fillMaxWidth$default32.then(!z6 ? ColumnScope.weight$default(columnScopeInstance222, companion522, 1.0f, false, 2, null) : companion522).then(companion);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy422 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap622 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier622 = ComposedModifierKt.materializeModifier(startRestartGroup, then22);
        Function0<ComposeUiNode> constructor622 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl6 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl6, maybeCachedBoxMeasurePolicy422, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap622, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash622 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl6.getInserting()) {
        }
        m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
        m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash622);
        Updater.m4617setimpl(m4610constructorimpl6, materializeModifier622, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance422 = BoxScopeInstance.INSTANCE;
        if (z6) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy322 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap722 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier722 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
        Function0<ComposeUiNode> constructor722 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl7 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl7, columnMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl7, currentCompositionLocalMap722, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash722 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl7.getInserting()) {
        }
        m4610constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
        m4610constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash722);
        Updater.m4617setimpl(m4610constructorimpl7, materializeModifier722, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance322 = ColumnScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(-1469768056);
        if (function23 == null) {
        }
        startRestartGroup.endReplaceGroup();
        Modifier.Companion companion622 = Modifier.INSTANCE;
        Modifier.Companion companion722 = Modifier.INSTANCE;
        Modifier fillMaxWidth$default222 = SizeKt.fillMaxWidth$default(companion622.then(z6 ? SizeKt.wrapContentHeight$default(companion722, null, false, 3, null) : ColumnScope.weight$default(columnScopeInstance322, companion722, 1.0f, false, 2, null)), 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy422 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap822 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier822 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default222);
        Function0<ComposeUiNode> constructor822 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl8 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl8, columnMeasurePolicy422, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl8, currentCompositionLocalMap822, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash822 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl8.getInserting()) {
        }
        m4610constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
        m4610constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash822);
        Updater.m4617setimpl(m4610constructorimpl8, materializeModifier822, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance422 = ColumnScopeInstance.INSTANCE;
        content.invoke(startRestartGroup, Integer.valueOf((i3 >> 6) & 14));
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        float f422 = 4;
        Modifier m1520paddingqDBjuR0$default32 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(f422), 0.0f, 0.0f, 13, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy522 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap922 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier922 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default32);
        Function0<ComposeUiNode> constructor922 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl9 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl9, maybeCachedBoxMeasurePolicy522, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl9, currentCompositionLocalMap922, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash922 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl9.getInserting()) {
        }
        m4610constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
        m4610constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash922);
        Updater.m4617setimpl(m4610constructorimpl9, materializeModifier922, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        function12 = function13;
        m12962AutoDotsRowZij2fk(PaddingKt.m1518paddingVpY3zN4$default(BoxScopeInstance.INSTANCE.align(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenter()), Dp.m7774constructorimpl(f422), 0.0f, 2, null), 0.0f, 0.0f, 0L, startRestartGroup, 0, 14);
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
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier m1520paddingqDBjuR0$default222 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(f422), 0.0f, 0.0f, 13, null);
        startRestartGroup.startReplaceGroup(-1746271574);
        changed = startRestartGroup.changed(density22) | startRestartGroup.changedInstance(view22);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue3 = new Function1() { // from class: org.betup.ui.common.compose.TicketDarkKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit TicketDark$lambda$22$lambda$20$lambda$19$lambda$18$lambda$16$lambda$14$lambda$13;
                TicketDark$lambda$22$lambda$20$lambda$19$lambda$18$lambda$16$lambda$14$lambda$13 = TicketDarkKt.TicketDark$lambda$22$lambda$20$lambda$19$lambda$18$lambda$16$lambda$14$lambda$13(Density.this, view22, mutableState22, (LayoutCoordinates) obj);
                return TicketDark$lambda$22$lambda$20$lambda$19$lambda$18$lambda$16$lambda$14$lambda$13;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceGroup();
        Modifier onGloballyPositioned22 = OnGloballyPositionedModifierKt.onGloballyPositioned(m1520paddingqDBjuR0$default222, (Function1) rememberedValue3);
        Alignment center22 = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy622 = BoxKt.maybeCachedBoxMeasurePolicy(center22, false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap1022 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier1022 = ComposedModifierKt.materializeModifier(startRestartGroup, onGloballyPositioned22);
        Function0<ComposeUiNode> constructor1022 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl10 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl10, maybeCachedBoxMeasurePolicy622, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl10, currentCompositionLocalMap1022, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash1022 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl10.getInserting()) {
        }
        m4610constructorimpl10.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash10));
        m4610constructorimpl10.apply(Integer.valueOf(currentCompositeKeyHash10), setCompositeKeyHash1022);
        Updater.m4617setimpl(m4610constructorimpl10, materializeModifier1022, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance522 = BoxScopeInstance.INSTANCE;
        contentBottom.invoke(startRestartGroup, Integer.valueOf((i3 >> 9) & 14));
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
        startRestartGroup.startReplaceGroup(-397507047);
        if (function24 != null) {
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
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.startReplaceGroup(1895593023);
        if (z5) {
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        z8 = z7;
        function25 = function24;
        z9 = z5;
        z10 = z6;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final float TicketDark$lambda$22$lambda$20$lambda$3(MutableState<Dp> mutableState) {
        return mutableState.getValue().m7788unboximpl();
    }

    private static final void TicketDark$lambda$22$lambda$20$lambda$4(MutableState<Dp> mutableState, float f) {
        mutableState.setValue(Dp.m7772boximpl(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketDark$lambda$22$lambda$20$lambda$19$lambda$18$lambda$16$lambda$6$lambda$5(Function1 function1, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketDark$lambda$22$lambda$20$lambda$19$lambda$18$lambda$16$lambda$14$lambda$13(Density density, View view, final MutableState mutableState, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        final float m7774constructorimpl = Dp.m7774constructorimpl(density.mo1163toDpu2uoSUM(LayoutCoordinatesKt.boundsInParent(coordinates).getTop()) - Dp.m7774constructorimpl(14));
        view.post(new Runnable() { // from class: org.betup.ui.common.compose.TicketDarkKt$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                TicketDarkKt.TicketDark$lambda$22$lambda$20$lambda$19$lambda$18$lambda$16$lambda$14$lambda$13$lambda$12(m7774constructorimpl, mutableState);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TicketDark$lambda$22$lambda$20$lambda$19$lambda$18$lambda$16$lambda$14$lambda$13$lambda$12(float f, MutableState mutableState) {
        if (Dp.m7779equalsimpl0(TicketDark$lambda$22$lambda$20$lambda$3(mutableState), f)) {
            return;
        }
        TicketDark$lambda$22$lambda$20$lambda$4(mutableState, f);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004d  */
    /* renamed from: AutoDotsRow-Zi-j2fk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m12962AutoDotsRowZij2fk(Modifier modifier, float f, float f2, long j, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        float f3;
        int i4;
        float f4;
        int i5;
        long j2;
        Modifier.Companion companion;
        final float f5;
        final long j3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(798282076);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f3 = f;
            i3 |= startRestartGroup.changed(f3) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                f4 = f2;
                i3 |= startRestartGroup.changed(f4) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    j2 = j;
                    i3 |= startRestartGroup.changed(j2) ? 2048 : 1024;
                    if ((i3 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                        companion = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        float m7774constructorimpl = i7 == 0 ? Dp.m7774constructorimpl(4) : f3;
                        float m7774constructorimpl2 = i4 == 0 ? Dp.m7774constructorimpl(8) : f4;
                        long m5197getDarkGray0d7_KjU = i5 == 0 ? Color.INSTANCE.m5197getDarkGray0d7_KjU() : j2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(798282076, i3, -1, "org.betup.ui.common.compose.AutoDotsRow (TicketDark.kt:222)");
                        }
                        BoxWithConstraintsKt.BoxWithConstraints(companion, null, false, ComposableLambdaKt.rememberComposableLambda(-1341441466, true, new TicketDarkKt$AutoDotsRow$1(m7774constructorimpl, m7774constructorimpl2, m5197getDarkGray0d7_KjU), startRestartGroup, 54), startRestartGroup, (i3 & 14) | 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f3 = m7774constructorimpl;
                        f5 = m7774constructorimpl2;
                        j3 = m5197getDarkGray0d7_KjU;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        companion = modifier2;
                        f5 = f4;
                        j3 = j2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final Modifier modifier3 = companion;
                        final float f6 = f3;
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.common.compose.TicketDarkKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit AutoDotsRow_Zi_j2fk$lambda$24;
                                AutoDotsRow_Zi_j2fk$lambda$24 = TicketDarkKt.AutoDotsRow_Zi_j2fk$lambda$24(Modifier.this, f6, f5, j3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return AutoDotsRow_Zi_j2fk$lambda$24;
                            }
                        });
                        return;
                    }
                    return;
                }
                j2 = j;
                if ((i3 & 1171) == 1170) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                BoxWithConstraintsKt.BoxWithConstraints(companion, null, false, ComposableLambdaKt.rememberComposableLambda(-1341441466, true, new TicketDarkKt$AutoDotsRow$1(m7774constructorimpl, m7774constructorimpl2, m5197getDarkGray0d7_KjU), startRestartGroup, 54), startRestartGroup, (i3 & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                }
                f3 = m7774constructorimpl;
                f5 = m7774constructorimpl2;
                j3 = m5197getDarkGray0d7_KjU;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f4 = f2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            j2 = j;
            if ((i3 & 1171) == 1170) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BoxWithConstraintsKt.BoxWithConstraints(companion, null, false, ComposableLambdaKt.rememberComposableLambda(-1341441466, true, new TicketDarkKt$AutoDotsRow$1(m7774constructorimpl, m7774constructorimpl2, m5197getDarkGray0d7_KjU), startRestartGroup, 54), startRestartGroup, (i3 & 14) | 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
            f3 = m7774constructorimpl;
            f5 = m7774constructorimpl2;
            j3 = m5197getDarkGray0d7_KjU;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        f3 = f;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f4 = f2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        j2 = j;
        if ((i3 & 1171) == 1170) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        BoxWithConstraintsKt.BoxWithConstraints(companion, null, false, ComposableLambdaKt.rememberComposableLambda(-1341441466, true, new TicketDarkKt$AutoDotsRow$1(m7774constructorimpl, m7774constructorimpl2, m5197getDarkGray0d7_KjU), startRestartGroup, 54), startRestartGroup, (i3 & 14) | 3072, 6);
        if (ComposerKt.isTraceInProgress()) {
        }
        f3 = m7774constructorimpl;
        f5 = m7774constructorimpl2;
        j3 = m5197getDarkGray0d7_KjU;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: drawTicketBorderWithSideDots--1HiNMM$default, reason: not valid java name */
    public static /* synthetic */ Modifier m12964drawTicketBorderWithSideDots1HiNMM$default(Modifier modifier, Brush brush, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, Object obj) {
        return m12963drawTicketBorderWithSideDots1HiNMM(modifier, (i & 1) != 0 ? ComposeUtils.AppBrushPalette.BorderGray.INSTANCE.getBrush() : brush, (i & 2) != 0 ? Dp.m7774constructorimpl(1) : f, (i & 4) != 0 ? Dp.m7774constructorimpl(4) : f2, (i & 8) != 0 ? Dp.m7774constructorimpl(38) : f3, (i & 16) != 0 ? Dp.m7774constructorimpl(8) : f4, (i & 32) != 0 ? Dp.m7774constructorimpl(38) : f5, (i & 64) != 0 ? Dp.m7774constructorimpl(8) : f6, (i & 128) != 0 ? Dp.m7774constructorimpl(20) : f7, (i & 256) != 0 ? Dp.m7774constructorimpl(20) : f8, (i & 512) != 0 ? Dp.m7774constructorimpl(4) : f9);
    }

    /* renamed from: drawTicketBorderWithSideDots--1HiNMM, reason: not valid java name */
    public static final Modifier m12963drawTicketBorderWithSideDots1HiNMM(Modifier drawTicketBorderWithSideDots, final Brush borderBrush, final float f, final float f2, final float f3, final float f4, final float f5, final float f6, final float f7, final float f8, final float f9) {
        Intrinsics.checkNotNullParameter(drawTicketBorderWithSideDots, "$this$drawTicketBorderWithSideDots");
        Intrinsics.checkNotNullParameter(borderBrush, "borderBrush");
        return drawTicketBorderWithSideDots.then(DrawModifierKt.drawBehind(Modifier.INSTANCE, new Function1() { // from class: org.betup.ui.common.compose.TicketDarkKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit drawTicketBorderWithSideDots__1HiNMM$lambda$25;
                drawTicketBorderWithSideDots__1HiNMM$lambda$25 = TicketDarkKt.drawTicketBorderWithSideDots__1HiNMM$lambda$25(f, f2, f3, f4, f5, f6, f7, f8, f9, borderBrush, (DrawScope) obj);
                return drawTicketBorderWithSideDots__1HiNMM$lambda$25;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit drawTicketBorderWithSideDots__1HiNMM$lambda$25(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, Brush brush, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        float f10 = drawBehind.mo1167toPx0680j_4(f);
        float f11 = drawBehind.mo1167toPx0680j_4(f2);
        float f12 = drawBehind.mo1167toPx0680j_4(f3);
        float f13 = drawBehind.mo1167toPx0680j_4(f4);
        float f14 = drawBehind.mo1167toPx0680j_4(f5);
        float f15 = drawBehind.mo1167toPx0680j_4(f6);
        float f16 = drawBehind.mo1167toPx0680j_4(f7);
        float f17 = drawBehind.mo1167toPx0680j_4(f8);
        float f18 = drawBehind.mo1167toPx0680j_4(f9);
        float intBitsToFloat = Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() & 4294967295L));
        Path Path = AndroidPath_androidKt.Path();
        Path.moveTo(0.0f, intBitsToFloat2);
        float f19 = f16 + f18;
        Path.lineTo(0.0f, f19);
        float f20 = f16 - f18;
        Path.moveTo(0.0f, f20);
        Path.arcTo(new Rect(-f18, f20, f18, f19), 90.0f, -180.0f, false);
        Path.lineTo(0.0f, f11);
        Path.quadraticTo(0.0f, 0.0f, f11, 0.0f);
        float f21 = (-f13) * 0.25f;
        Path.lineTo((intBitsToFloat - f12) / 2.0f, 0.0f);
        Path.moveTo((intBitsToFloat + f12) / 2.0f, 0.0f);
        float f22 = intBitsToFloat - f11;
        Path.lineTo(f22, 0.0f);
        Path.quadraticTo(intBitsToFloat, 0.0f, intBitsToFloat, f11);
        float f23 = f17 - f18;
        Path.lineTo(intBitsToFloat, f23);
        float f24 = f17 + f18;
        Path.moveTo(intBitsToFloat, f24);
        Path.arcTo(new Rect(intBitsToFloat - f18, f23, intBitsToFloat + f18, f24), 90.0f, 180.0f, false);
        float f25 = intBitsToFloat2 - f11;
        Path.lineTo(intBitsToFloat, f25);
        Path.quadraticTo(intBitsToFloat, intBitsToFloat2, f22, intBitsToFloat2);
        float f26 = intBitsToFloat2 + (0.25f * f15);
        Path.lineTo((intBitsToFloat + f14) / 2.0f, intBitsToFloat2);
        Path.moveTo((intBitsToFloat - f14) / 2.0f, intBitsToFloat2);
        Path.lineTo(f11, intBitsToFloat2);
        Path.quadraticTo(0.0f, intBitsToFloat2, 0.0f, f25);
        DrawScope.m5719drawPathGBMwjPU$default(drawBehind, Path, brush, 0.0f, new Stroke(f10, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
        DrawScope.m5711drawCircleVaOC9Bg$default(drawBehind, ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), f18, Offset.m4919constructorimpl((Float.floatToRawIntBits(f17) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32)), 0.0f, null, null, 0, 120, null);
        DrawScope.m5711drawCircleVaOC9Bg$default(drawBehind, ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), f18, Offset.m4919constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f16) & 4294967295L)), 0.0f, null, null, 0, 120, null);
        DrawScope.m5726drawRoundRectuAw5IA$default(drawBehind, ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), Offset.m4919constructorimpl((Float.floatToRawIntBits(r10) << 32) | (Float.floatToRawIntBits(f21) & 4294967295L)), Size.m4987constructorimpl((Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L)), CornerRadius.m4881constructorimpl((Float.floatToRawIntBits(8.0f) << 32) | (Float.floatToRawIntBits(8.0f) & 4294967295L)), null, 0.0f, null, 0, PsExtractor.VIDEO_STREAM_MASK, null);
        DrawScope.m5726drawRoundRectuAw5IA$default(drawBehind, ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor(), Offset.m4919constructorimpl((Float.floatToRawIntBits(r10) << 32) | (Float.floatToRawIntBits(f21) & 4294967295L)), Size.m4987constructorimpl((Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L)), CornerRadius.m4881constructorimpl((Float.floatToRawIntBits(8.0f) << 32) | (Float.floatToRawIntBits(8.0f) & 4294967295L)), new Stroke(f10, 0.0f, 0, 0, null, 30, null), 0.0f, null, 0, 224, null);
        float f27 = f26 - f15;
        DrawScope.m5726drawRoundRectuAw5IA$default(drawBehind, ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), Offset.m4919constructorimpl((Float.floatToRawIntBits(r11) << 32) | (Float.floatToRawIntBits(f27) & 4294967295L)), Size.m4987constructorimpl((Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L)), CornerRadius.m4881constructorimpl((Float.floatToRawIntBits(8.0f) << 32) | (Float.floatToRawIntBits(8.0f) & 4294967295L)), null, 0.0f, null, 0, PsExtractor.VIDEO_STREAM_MASK, null);
        DrawScope.m5726drawRoundRectuAw5IA$default(drawBehind, ComposeUtils.AppColorPalette.ScreenBackground.INSTANCE.getColor(), Offset.m4919constructorimpl((Float.floatToRawIntBits(r11) << 32) | (Float.floatToRawIntBits(f27) & 4294967295L)), Size.m4987constructorimpl((Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L)), CornerRadius.m4881constructorimpl((Float.floatToRawIntBits(8.0f) << 32) | (Float.floatToRawIntBits(8.0f) & 4294967295L)), new Stroke(f10, 0.0f, 0, 0, null, 30, null), 0.0f, null, 0, 224, null);
        return Unit.INSTANCE;
    }

    public static final void PreviewTicketDark(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(749746021);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(749746021, i, -1, "org.betup.ui.common.compose.PreviewTicketDark (TicketDark.kt:383)");
            }
            TicketDark(Modifier.INSTANCE, ComposableSingletons$TicketDarkKt.INSTANCE.m12921getLambda$2039175627$app_release(), ComposableSingletons$TicketDarkKt.INSTANCE.getLambda$1727426068$app_release(), ComposableSingletons$TicketDarkKt.INSTANCE.getLambda$1199060467$app_release(), false, false, null, false, startRestartGroup, 3510, PsExtractor.VIDEO_STREAM_MASK);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.common.compose.TicketDarkKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewTicketDark$lambda$26;
                    PreviewTicketDark$lambda$26 = TicketDarkKt.PreviewTicketDark$lambda$26(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewTicketDark$lambda$26;
                }
            });
        }
    }
}
