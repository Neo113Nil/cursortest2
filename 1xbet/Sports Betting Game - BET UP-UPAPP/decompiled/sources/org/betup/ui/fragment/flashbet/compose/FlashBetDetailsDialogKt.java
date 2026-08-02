package org.betup.ui.fragment.flashbet.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
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
import androidx.profileinstaller.ProfileVerifier;
import coil3.compose.SingletonAsyncImageKt;
import com.explorestack.protobuf.openrtb.LossReason;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.extractor.WavUtil;
import io.sentry.cache.EnvelopeCache;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.R;
import org.betup.games.flashbet.model.FlashBetGameMatchDetailsDto;
import org.betup.games.flashbet.model.FlashBetGameMatchTeamDetailsDto;
import org.betup.games.flashbet.model.FlashBetGameResult;
import org.betup.games.flashbet.model.FlashBetGameScoreUpdateDto;
import org.betup.games.flashbet.model.FlashBetGameSessionDto;
import org.betup.games.flashbet.model.FlashBetGameUserAnswerDto;
import org.betup.ui.common.compose.CommonButtonKt;
import org.betup.ui.common.compose.TicketDarkKt;
import org.betup.ui.fragment.bets.sheet.compose.items.QuickBetHeaderKt;
import org.betup.ui.fragment.bets.sheet.compose.items.TopActionButtonsKt;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.UiExtensionsKt;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;

/* compiled from: FlashBetDetailsDialog.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0006\u001aM\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0003¢\u0006\u0002\u0010\u0013\u001a!\u0010\u0014\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0003¢\u0006\u0002\u0010\u0017\u001a9\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001e\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u001f\u001a#\u0010 \u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0007¢\u0006\u0002\u0010!\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\""}, d2 = {"FLASH_BET_DETAILS_CONTENT_MAX_HEIGHT", "Landroidx/compose/ui/unit/Dp;", "F", "FlashBetDetailsDialog", "", EnvelopeCache.PREFIX_CURRENT_SESSION_FILE, "Lorg/betup/games/flashbet/model/FlashBetGameSessionDto;", "state", "Lorg/betup/ui/fragment/flashbet/compose/FlashBetDetailsDialogState;", "onDismiss", "Lkotlin/Function0;", "onCollectClick", "isCollectLoading", "", "showCollectForFinishedSession", "(Lorg/betup/games/flashbet/model/FlashBetGameSessionDto;Lorg/betup/ui/fragment/flashbet/compose/FlashBetDetailsDialogState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZZLandroidx/compose/runtime/Composer;II)V", "FlashBetDetailsTeamsRowSmall", "teamDetails", "Lorg/betup/games/flashbet/model/FlashBetGameMatchTeamDetailsDto;", "(Lorg/betup/games/flashbet/model/FlashBetGameMatchTeamDetailsDto;Landroidx/compose/runtime/Composer;I)V", "FlashBetDetailsTeamRow", "scoreDisplay", "", "(Lorg/betup/games/flashbet/model/FlashBetGameMatchTeamDetailsDto;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "FlashBetDetailsBetItem", "question", "answer", "coefficient", "", "isCorrect", "showResult", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;ZLandroidx/compose/runtime/Composer;I)V", "FlashBetAbandonedSessionContent", "(Lorg/betup/games/flashbet/model/FlashBetGameSessionDto;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashBetDetailsDialogKt {
    private static final float FLASH_BET_DETAILS_CONTENT_MAX_HEIGHT = Dp.m7774constructorimpl(460);

    /* compiled from: FlashBetDetailsDialog.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlashBetDetailsDialogState.values().length];
            try {
                iArr[FlashBetDetailsDialogState.Results.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlashBetDetailsDialogState.Preview.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FlashBetDetailsDialogState.Waiting.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetAbandonedSessionContent$lambda$22(FlashBetGameSessionDto flashBetGameSessionDto, Function0 function0, int i, Composer composer, int i2) {
        FlashBetAbandonedSessionContent(flashBetGameSessionDto, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetDetailsBetItem$lambda$20(String str, String str2, Double d, Boolean bool, boolean z, int i, Composer composer, int i2) {
        FlashBetDetailsBetItem(str, str2, d, bool, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetDetailsDialog$lambda$2(FlashBetGameSessionDto flashBetGameSessionDto, FlashBetDetailsDialogState flashBetDetailsDialogState, Function0 function0, Function0 function02, boolean z, boolean z2, int i, int i2, Composer composer, int i3) {
        FlashBetDetailsDialog(flashBetGameSessionDto, flashBetDetailsDialogState, function0, function02, z, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetDetailsTeamRow$lambda$10(FlashBetGameMatchTeamDetailsDto flashBetGameMatchTeamDetailsDto, String str, int i, Composer composer, int i2) {
        FlashBetDetailsTeamRow(flashBetGameMatchTeamDetailsDto, str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetDetailsTeamRow$lambda$15(FlashBetGameMatchTeamDetailsDto flashBetGameMatchTeamDetailsDto, String str, int i, Composer composer, int i2) {
        FlashBetDetailsTeamRow(flashBetGameMatchTeamDetailsDto, str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetDetailsTeamsRowSmall$lambda$3(FlashBetGameMatchTeamDetailsDto flashBetGameMatchTeamDetailsDto, int i, Composer composer, int i2) {
        FlashBetDetailsTeamsRowSmall(flashBetGameMatchTeamDetailsDto, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetDetailsTeamsRowSmall$lambda$9(FlashBetGameMatchTeamDetailsDto flashBetGameMatchTeamDetailsDto, int i, Composer composer, int i2) {
        FlashBetDetailsTeamsRowSmall(flashBetGameMatchTeamDetailsDto, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FlashBetDetailsDialog(final FlashBetGameSessionDto session, final FlashBetDetailsDialogState state, final Function0<Unit> onDismiss, final Function0<Unit> onCollectClick, boolean z, boolean z2, Composer composer, final int i, final int i2) {
        int i3;
        final boolean z3;
        int i4;
        boolean z4;
        int i5;
        final boolean z5;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        Composer composer2;
        int i6;
        int i7;
        final String stringResource;
        final boolean z6;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onCollectClick, "onCollectClick");
        Composer startRestartGroup = composer.startRestartGroup(1937901667);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(session) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(state.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(onDismiss) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(onCollectClick) ? 2048 : 1024;
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            z3 = z;
            i3 |= startRestartGroup.changed(z3) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                z4 = z2;
                i3 |= startRestartGroup.changed(z4) ? 131072 : 65536;
                if ((74899 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                    boolean z7 = i8 != 0 ? false : z3;
                    boolean z8 = i4 != 0 ? true : z4;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1937901667, i3, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetDetailsDialog (FlashBetDetailsDialog.kt:66)");
                    }
                    i5 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                    if (i5 == 1) {
                        z5 = z8;
                    } else {
                        if (i5 != 2 && i5 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        z5 = true;
                    }
                    final boolean z9 = z7;
                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Alignment center = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
                    Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(12), 0.0f, 2, null), 0.0f, Dp.m7774constructorimpl(22), 0.0f, Dp.m7774constructorimpl(43), 5, null);
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default);
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
                    Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    composer2 = startRestartGroup;
                    TopActionButtonsKt.TopActionButtons(ColumnScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally()), onDismiss, null, null, false, false, false, startRestartGroup, ((i3 >> 3) & 112) | 24576, 108);
                    SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(32), Dp.m7774constructorimpl(70)), composer2, 6);
                    i6 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                    if (i6 == 1) {
                        i7 = 3;
                        composer2.startReplaceGroup(-588519095);
                        stringResource = StringResources_androidKt.stringResource(R.string.flash_bet_results, composer2, 6);
                        composer2.endReplaceGroup();
                    } else if (i6 != 2) {
                        i7 = 3;
                        if (i6 != 3) {
                            composer2.startReplaceGroup(-588526676);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(-588521889);
                        stringResource = StringResources_androidKt.stringResource(R.string.waiting, composer2, 6);
                        composer2.endReplaceGroup();
                    } else {
                        i7 = 3;
                        composer2.startReplaceGroup(-588524735);
                        stringResource = StringResources_androidKt.stringResource(R.string.flash_bet, composer2, 6);
                        composer2.endReplaceGroup();
                    }
                    final boolean z10 = state == FlashBetDetailsDialogState.Waiting;
                    TicketDarkKt.TicketDark(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, i7, null), ComposableLambdaKt.rememberComposableLambda(422268303, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetDetailsDialogKt$FlashBetDetailsDialog$1$1$1
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
                                ComposerKt.traceEventStart(422268303, i9, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetDetailsDialog.<anonymous>.<anonymous>.<anonymous> (FlashBetDetailsDialog.kt:103)");
                            }
                            QuickBetHeaderKt.QuickBetHeader(null, stringResource, null, null, z10, false, false, false, composer3, 0, 237);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), ComposableLambdaKt.rememberComposableLambda(-1712142448, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetDetailsDialogKt$FlashBetDetailsDialog$1$1$2

                        /* compiled from: FlashBetDetailsDialog.kt */
                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[FlashBetDetailsDialogState.values().length];
                                try {
                                    iArr[FlashBetDetailsDialogState.Preview.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[FlashBetDetailsDialogState.Waiting.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                try {
                                    iArr[FlashBetDetailsDialogState.Results.ordinal()] = 3;
                                } catch (NoSuchFieldError unused3) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:49:0x0279, code lost:
                        
                            if (r11 != null) goto L65;
                         */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:156:0x09ea  */
                        /* JADX WARN: Removed duplicated region for block: B:159:0x0a02  */
                        /* JADX WARN: Removed duplicated region for block: B:161:0x0a09  */
                        /* JADX WARN: Removed duplicated region for block: B:162:0x09fa  */
                        /* JADX WARN: Removed duplicated region for block: B:165:0x09c6  */
                        /* JADX WARN: Removed duplicated region for block: B:166:0x09cd  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void invoke(Composer composer3, int i9) {
                            float f;
                            String str;
                            String str2;
                            FlashBetGameSessionDto flashBetGameSessionDto;
                            String str3;
                            FlashBetDetailsDialogState flashBetDetailsDialogState;
                            Composer composer4;
                            FlashBetDetailsDialogState flashBetDetailsDialogState2;
                            int i10;
                            int i11;
                            double betAmount;
                            double d;
                            long j;
                            String str4;
                            FlashBetGameScoreUpdateDto flashBetGameScoreUpdateDto;
                            if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1712142448, i9, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetDetailsDialog.<anonymous>.<anonymous>.<anonymous> (FlashBetDetailsDialog.kt:123)");
                            }
                            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            f = FlashBetDetailsDialogKt.FLASH_BET_DETAILS_CONTENT_MAX_HEIGHT;
                            Modifier verticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.m1551heightInVpY3zN4$default(fillMaxWidth$default, 0.0f, f, 1, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                            float f2 = 12;
                            Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(verticalScroll$default, Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(20));
                            Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                            Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f2));
                            FlashBetGameSessionDto flashBetGameSessionDto2 = FlashBetGameSessionDto.this;
                            FlashBetDetailsDialogState flashBetDetailsDialogState3 = state;
                            ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4, centerHorizontally2, composer3, 54);
                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, m1517paddingVpY3zN4);
                            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor3);
                            } else {
                                composer3.useNode();
                            }
                            Composer m4610constructorimpl3 = Updater.m4610constructorimpl(composer3);
                            Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            String matchStartDate = flashBetGameSessionDto2.getMatchStartDate();
                            if (matchStartDate == null) {
                                FlashBetGameMatchDetailsDto matchDetails = flashBetGameSessionDto2.getMatchDetails();
                                matchStartDate = matchDetails != null ? matchDetails.getStartDate() : null;
                            }
                            composer3.startReplaceGroup(5004770);
                            boolean changed = composer3.changed(matchStartDate);
                            Object rememberedValue = composer3.rememberedValue();
                            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                String str5 = matchStartDate;
                                if (str5 == null || StringsKt.isBlank(str5)) {
                                    matchStartDate = null;
                                } else {
                                    String formattedDateWithYear = UiExtensionsKt.getFormattedDateWithYear(matchStartDate);
                                    if (!StringsKt.isBlank(formattedDateWithYear)) {
                                        matchStartDate = formattedDateWithYear;
                                    }
                                }
                                composer3.updateRememberedValue(matchStartDate);
                                rememberedValue = matchStartDate;
                            }
                            String str6 = (String) rememberedValue;
                            composer3.endReplaceGroup();
                            composer3.startReplaceGroup(-726911585);
                            if (str6 != null) {
                                str = "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo";
                                str2 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                                flashBetDetailsDialogState = flashBetDetailsDialogState3;
                                flashBetGameSessionDto = flashBetGameSessionDto2;
                                str3 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                                TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.flash_bet_game_took_place_on, new Object[]{str6}, composer3, 6), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(12), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 48, 0, 65020);
                            } else {
                                str = "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo";
                                str2 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                                flashBetGameSessionDto = flashBetGameSessionDto2;
                                str3 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                                flashBetDetailsDialogState = flashBetDetailsDialogState3;
                            }
                            composer3.endReplaceGroup();
                            int i12 = WhenMappings.$EnumSwitchMapping$0[flashBetDetailsDialogState.ordinal()];
                            if (i12 == 1) {
                                composer4 = composer3;
                                flashBetDetailsDialogState2 = flashBetDetailsDialogState;
                                i10 = 0;
                                composer4.startReplaceGroup(-1058609833);
                                FlashBetDetailsDialogKt.FlashBetDetailsTeamsRowSmall(flashBetGameSessionDto.getTeamDetails(), composer4, 0);
                                composer3.endReplaceGroup();
                                Unit unit = Unit.INSTANCE;
                            } else {
                                if (i12 != 2 && i12 != 3) {
                                    composer3.startReplaceGroup(-726887208);
                                    composer3.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer4 = composer3;
                                composer4.startReplaceGroup(-1058273762);
                                FlashBetGameMatchTeamDetailsDto teamDetails = flashBetGameSessionDto.getTeamDetails();
                                flashBetDetailsDialogState2 = flashBetDetailsDialogState;
                                if (flashBetDetailsDialogState2 == FlashBetDetailsDialogState.Results) {
                                    List<FlashBetGameScoreUpdateDto> scores = flashBetGameSessionDto.getScores();
                                    if (scores != null && (flashBetGameScoreUpdateDto = (FlashBetGameScoreUpdateDto) CollectionsKt.lastOrNull((List) scores)) != null) {
                                        str4 = flashBetGameScoreUpdateDto.getScoreHome() + " - " + flashBetGameScoreUpdateDto.getScoreAway();
                                    }
                                    str4 = "- -";
                                    i10 = 0;
                                } else {
                                    i10 = 0;
                                    str4 = null;
                                }
                                FlashBetDetailsDialogKt.FlashBetDetailsTeamRow(teamDetails, str4, composer4, i10);
                                composer3.endReplaceGroup();
                                Unit unit2 = Unit.INSTANCE;
                            }
                            List<FlashBetGameUserAnswerDto> userAnswers = flashBetGameSessionDto.getUserAnswers();
                            composer4.startReplaceGroup(-726855918);
                            if (userAnswers != null) {
                                for (FlashBetGameUserAnswerDto flashBetGameUserAnswerDto : userAnswers) {
                                    FlashBetDetailsDialogKt.FlashBetDetailsBetItem(flashBetGameUserAnswerDto.getQuestion(), flashBetGameUserAnswerDto.getAnswer(), flashBetGameUserAnswerDto.getCoefficient(), flashBetGameUserAnswerDto.isCorrect(), flashBetDetailsDialogState2 == FlashBetDetailsDialogState.Results ? 1 : i10, composer3, 0);
                                }
                                Unit unit3 = Unit.INSTANCE;
                            }
                            composer3.endReplaceGroup();
                            float f3 = 4;
                            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3)), composer4, 6);
                            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Alignment.Horizontal centerHorizontally3 = Alignment.INSTANCE.getCenterHorizontally();
                            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                            ComposerKt.sourceInformationMarkerStart(composer4, -483455358, str);
                            MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(spaceBetween, centerHorizontally3, composer4, 54);
                            String str7 = str3;
                            ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, str7);
                            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer4, i10);
                            CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer4, fillMaxWidth$default2);
                            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                            String str8 = str2;
                            ComposerKt.sourceInformationMarkerStart(composer4, -692256719, str8);
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer4.createNode(constructor4);
                            } else {
                                composer3.useNode();
                            }
                            Composer m4610constructorimpl4 = Updater.m4610constructorimpl(composer3);
                            Updater.m4617setimpl(m4610constructorimpl4, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            }
                            Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer4, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            ComposerKt.sourceInformationMarkerStart(composer4, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer4, 48);
                            ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, str7);
                            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer4, i10);
                            CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                            Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer4, companion);
                            Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer4, -692256719, str8);
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer4.createNode(constructor5);
                            } else {
                                composer3.useNode();
                            }
                            Composer m4610constructorimpl5 = Updater.m4610constructorimpl(composer3);
                            Updater.m4617setimpl(m4610constructorimpl5, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                            }
                            Updater.m4617setimpl(m4610constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer4, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            FlashBetDetailsDialogState flashBetDetailsDialogState4 = flashBetDetailsDialogState2;
                            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.flash_bet_buy_in, composer4, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(13), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer4, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3)), composer3, 6);
                            TextKt.m2642Text4IGK_g(String.valueOf(flashBetGameSessionDto.getBetAmount()), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                            float f4 = 14;
                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer3, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 432, 120);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            if (flashBetDetailsDialogState4 == FlashBetDetailsDialogState.Preview) {
                                composer3.startReplaceGroup(-1498057250);
                                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                                Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer3, 48);
                                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str7);
                                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                                Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default3);
                                Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str8);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor6);
                                } else {
                                    composer3.useNode();
                                }
                                Composer m4610constructorimpl6 = Updater.m4610constructorimpl(composer3);
                                Updater.m4617setimpl(m4610constructorimpl6, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m4610constructorimpl6.getInserting() || !Intrinsics.areEqual(m4610constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                    m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                    m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                                }
                                Updater.m4617setimpl(m4610constructorimpl6, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.flash_bet_reward_all_correct, composer3, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(11), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3)), composer3, 6);
                                TextKt.m2642Text4IGK_g(String.valueOf(flashBetGameSessionDto.getBetAmount() * 3), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer3, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 432, 120);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endReplaceGroup();
                            } else if (flashBetDetailsDialogState4 == FlashBetDetailsDialogState.Results) {
                                composer3.startReplaceGroup(-1496059889);
                                Modifier fillMaxWidth$default4 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer3, 0);
                                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str7);
                                int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap7 = composer3.getCurrentCompositionLocalMap();
                                Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default4);
                                Function0<ComposeUiNode> constructor7 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str8);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor7);
                                } else {
                                    composer3.useNode();
                                }
                                Composer m4610constructorimpl7 = Updater.m4610constructorimpl(composer3);
                                Updater.m4617setimpl(m4610constructorimpl7, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl7, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m4610constructorimpl7.getInserting() || !Intrinsics.areEqual(m4610constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                                    m4610constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                                    m4610constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                                }
                                Updater.m4617setimpl(m4610constructorimpl7, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                                Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                                ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                MeasurePolicy rowMeasurePolicy4 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3, composer3, 48);
                                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str7);
                                int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap8 = composer3.getCurrentCompositionLocalMap();
                                Modifier materializeModifier8 = ComposedModifierKt.materializeModifier(composer3, companion2);
                                Function0<ComposeUiNode> constructor8 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str8);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor8);
                                } else {
                                    composer3.useNode();
                                }
                                Composer m4610constructorimpl8 = Updater.m4610constructorimpl(composer3);
                                Updater.m4617setimpl(m4610constructorimpl8, rowMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl8, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m4610constructorimpl8.getInserting() || !Intrinsics.areEqual(m4610constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                                    m4610constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                                    m4610constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                                }
                                Updater.m4617setimpl(m4610constructorimpl8, materializeModifier8, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                                TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.won, composer3, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(13), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3)), composer3, 6);
                                List<FlashBetGameUserAnswerDto> userAnswers2 = flashBetGameSessionDto.getUserAnswers();
                                if (userAnswers2 != null) {
                                    List<FlashBetGameUserAnswerDto> list = userAnswers2;
                                    if (!(list instanceof Collection) || !list.isEmpty()) {
                                        Iterator<T> it = list.iterator();
                                        i11 = 0;
                                        while (it.hasNext()) {
                                            if (Intrinsics.areEqual((Object) ((FlashBetGameUserAnswerDto) it.next()).isCorrect(), (Object) true) && (i11 = i11 + 1) < 0) {
                                                CollectionsKt.throwCountOverflow();
                                            }
                                        }
                                        if (Intrinsics.areEqual(flashBetGameSessionDto.getResult(), FlashBetGameResult.EXPIRED) || flashBetGameSessionDto.getReturnAmount() != 0) {
                                            if (i11 != 3) {
                                                j = flashBetGameSessionDto.getBetAmount() * 3;
                                            } else {
                                                if (i11 == 2) {
                                                    betAmount = flashBetGameSessionDto.getBetAmount();
                                                    d = 1.5d;
                                                } else if (i11 == 1) {
                                                    betAmount = flashBetGameSessionDto.getBetAmount();
                                                    d = 0.5d;
                                                }
                                                j = (long) (betAmount * d);
                                            }
                                            TextKt.m2642Text4IGK_g(j > 0 ? "+" + j : String.valueOf(j), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j > 0 ? ComposeUtils.AppColorPalette.Green.INSTANCE.getColor() : ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer3, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 432, 120);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            composer3.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            composer3.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            composer3.endReplaceGroup();
                                        }
                                        j = 0;
                                        TextKt.m2642Text4IGK_g(j > 0 ? "+" + j : String.valueOf(j), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j > 0 ? ComposeUtils.AppColorPalette.Green.INSTANCE.getColor() : ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer3, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 432, 120);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        composer3.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        composer3.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        composer3.endReplaceGroup();
                                    }
                                }
                                i11 = 0;
                                if (Intrinsics.areEqual(flashBetGameSessionDto.getResult(), FlashBetGameResult.EXPIRED)) {
                                }
                                if (i11 != 3) {
                                }
                                TextKt.m2642Text4IGK_g(j > 0 ? "+" + j : String.valueOf(j), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j > 0 ? ComposeUtils.AppColorPalette.Green.INSTANCE.getColor() : ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer3, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 432, 120);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endReplaceGroup();
                            } else {
                                composer3.startReplaceGroup(-1493270106);
                                composer3.endReplaceGroup();
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), ComposableLambdaKt.rememberComposableLambda(448414097, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetDetailsDialogKt$FlashBetDetailsDialog$1$1$3
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
                                ComposerKt.traceEventStart(448414097, i9, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetDetailsDialog.<anonymous>.<anonymous>.<anonymous> (FlashBetDetailsDialog.kt:109)");
                            }
                            if (z5) {
                                Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(24), Dp.m7774constructorimpl(12));
                                FlashBetDetailsDialogState flashBetDetailsDialogState = state;
                                Function0<Unit> function0 = onCollectClick;
                                boolean z11 = z9;
                                ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, m1517paddingVpY3zN4);
                                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor3);
                                } else {
                                    composer3.useNode();
                                }
                                Composer m4610constructorimpl3 = Updater.m4610constructorimpl(composer3);
                                Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer3, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                CommonButtonKt.m12915CommonButtonUPEs2M4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, StringResources_androidKt.stringResource(R.string.collect, composer3, 6), false, false, flashBetDetailsDialogState != FlashBetDetailsDialogState.Waiting, function0, false, false, false, z11, false, null, null, true, false, null, null, null, null, null, composer3, 6, 24576, 0, 2079642);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), false, true, null, false, composer2, 200118, LossReason.LOSS_REASON_CREATIVE_FILTERED_CATEGORY_EXCLUSIONS_VALUE);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z3 = z9;
                    z6 = z8;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    z6 = z4;
                    composer2 = startRestartGroup;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetDetailsDialogKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit FlashBetDetailsDialog$lambda$2;
                            FlashBetDetailsDialog$lambda$2 = FlashBetDetailsDialogKt.FlashBetDetailsDialog$lambda$2(FlashBetGameSessionDto.this, state, onDismiss, onCollectClick, z3, z6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return FlashBetDetailsDialog$lambda$2;
                        }
                    });
                    return;
                }
                return;
            }
            z4 = z2;
            if ((74899 & i3) == 74898) {
            }
            if (i8 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            i5 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i5 == 1) {
            }
            final boolean z92 = z7;
            Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment center2 = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            Modifier m1520paddingqDBjuR0$default2 = PaddingKt.m1520paddingqDBjuR0$default(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(12), 0.0f, 2, null), 0.0f, Dp.m7774constructorimpl(22), 0.0f, Dp.m7774constructorimpl(43), 5, null);
            Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default2);
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            composer2 = startRestartGroup;
            TopActionButtonsKt.TopActionButtons(ColumnScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally()), onDismiss, null, null, false, false, false, startRestartGroup, ((i3 >> 3) & 112) | 24576, 108);
            SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(32), Dp.m7774constructorimpl(70)), composer2, 6);
            i6 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i6 == 1) {
            }
            if (state == FlashBetDetailsDialogState.Waiting) {
            }
            TicketDarkKt.TicketDark(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, i7, null), ComposableLambdaKt.rememberComposableLambda(422268303, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetDetailsDialogKt$FlashBetDetailsDialog$1$1$1
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
                        ComposerKt.traceEventStart(422268303, i9, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetDetailsDialog.<anonymous>.<anonymous>.<anonymous> (FlashBetDetailsDialog.kt:103)");
                    }
                    QuickBetHeaderKt.QuickBetHeader(null, stringResource, null, null, z10, false, false, false, composer3, 0, 237);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), ComposableLambdaKt.rememberComposableLambda(-1712142448, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetDetailsDialogKt$FlashBetDetailsDialog$1$1$2

                /* compiled from: FlashBetDetailsDialog.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[FlashBetDetailsDialogState.values().length];
                        try {
                            iArr[FlashBetDetailsDialogState.Preview.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[FlashBetDetailsDialogState.Waiting.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[FlashBetDetailsDialogState.Results.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Code restructure failed: missing block: B:49:0x0279, code lost:
                
                    if (r11 != null) goto L65;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:156:0x09ea  */
                /* JADX WARN: Removed duplicated region for block: B:159:0x0a02  */
                /* JADX WARN: Removed duplicated region for block: B:161:0x0a09  */
                /* JADX WARN: Removed duplicated region for block: B:162:0x09fa  */
                /* JADX WARN: Removed duplicated region for block: B:165:0x09c6  */
                /* JADX WARN: Removed duplicated region for block: B:166:0x09cd  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void invoke(Composer composer3, int i9) {
                    float f;
                    String str;
                    String str2;
                    FlashBetGameSessionDto flashBetGameSessionDto;
                    String str3;
                    FlashBetDetailsDialogState flashBetDetailsDialogState;
                    Composer composer4;
                    FlashBetDetailsDialogState flashBetDetailsDialogState2;
                    int i10;
                    int i11;
                    double betAmount;
                    double d;
                    long j;
                    String str4;
                    FlashBetGameScoreUpdateDto flashBetGameScoreUpdateDto;
                    if ((i9 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1712142448, i9, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetDetailsDialog.<anonymous>.<anonymous>.<anonymous> (FlashBetDetailsDialog.kt:123)");
                    }
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    f = FlashBetDetailsDialogKt.FLASH_BET_DETAILS_CONTENT_MAX_HEIGHT;
                    Modifier verticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.m1551heightInVpY3zN4$default(fillMaxWidth$default, 0.0f, f, 1, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                    float f2 = 12;
                    Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(verticalScroll$default, Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(20));
                    Alignment.Horizontal centerHorizontally22 = Alignment.INSTANCE.getCenterHorizontally();
                    Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f2));
                    FlashBetGameSessionDto flashBetGameSessionDto2 = FlashBetGameSessionDto.this;
                    FlashBetDetailsDialogState flashBetDetailsDialogState3 = state;
                    ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4, centerHorizontally22, composer3, 54);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(composer3, m1517paddingVpY3zN4);
                    Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor32);
                    } else {
                        composer3.useNode();
                    }
                    Composer m4610constructorimpl3 = Updater.m4610constructorimpl(composer3);
                    Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32);
                    }
                    Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    String matchStartDate = flashBetGameSessionDto2.getMatchStartDate();
                    if (matchStartDate == null) {
                        FlashBetGameMatchDetailsDto matchDetails = flashBetGameSessionDto2.getMatchDetails();
                        matchStartDate = matchDetails != null ? matchDetails.getStartDate() : null;
                    }
                    composer3.startReplaceGroup(5004770);
                    boolean changed = composer3.changed(matchStartDate);
                    Object rememberedValue = composer3.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        String str5 = matchStartDate;
                        if (str5 == null || StringsKt.isBlank(str5)) {
                            matchStartDate = null;
                        } else {
                            String formattedDateWithYear = UiExtensionsKt.getFormattedDateWithYear(matchStartDate);
                            if (!StringsKt.isBlank(formattedDateWithYear)) {
                                matchStartDate = formattedDateWithYear;
                            }
                        }
                        composer3.updateRememberedValue(matchStartDate);
                        rememberedValue = matchStartDate;
                    }
                    String str6 = (String) rememberedValue;
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(-726911585);
                    if (str6 != null) {
                        str = "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo";
                        str2 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                        flashBetDetailsDialogState = flashBetDetailsDialogState3;
                        flashBetGameSessionDto = flashBetGameSessionDto2;
                        str3 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                        TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.flash_bet_game_took_place_on, new Object[]{str6}, composer3, 6), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(12), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 48, 0, 65020);
                    } else {
                        str = "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo";
                        str2 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                        flashBetGameSessionDto = flashBetGameSessionDto2;
                        str3 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                        flashBetDetailsDialogState = flashBetDetailsDialogState3;
                    }
                    composer3.endReplaceGroup();
                    int i12 = WhenMappings.$EnumSwitchMapping$0[flashBetDetailsDialogState.ordinal()];
                    if (i12 == 1) {
                        composer4 = composer3;
                        flashBetDetailsDialogState2 = flashBetDetailsDialogState;
                        i10 = 0;
                        composer4.startReplaceGroup(-1058609833);
                        FlashBetDetailsDialogKt.FlashBetDetailsTeamsRowSmall(flashBetGameSessionDto.getTeamDetails(), composer4, 0);
                        composer3.endReplaceGroup();
                        Unit unit = Unit.INSTANCE;
                    } else {
                        if (i12 != 2 && i12 != 3) {
                            composer3.startReplaceGroup(-726887208);
                            composer3.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer4 = composer3;
                        composer4.startReplaceGroup(-1058273762);
                        FlashBetGameMatchTeamDetailsDto teamDetails = flashBetGameSessionDto.getTeamDetails();
                        flashBetDetailsDialogState2 = flashBetDetailsDialogState;
                        if (flashBetDetailsDialogState2 == FlashBetDetailsDialogState.Results) {
                            List<FlashBetGameScoreUpdateDto> scores = flashBetGameSessionDto.getScores();
                            if (scores != null && (flashBetGameScoreUpdateDto = (FlashBetGameScoreUpdateDto) CollectionsKt.lastOrNull((List) scores)) != null) {
                                str4 = flashBetGameScoreUpdateDto.getScoreHome() + " - " + flashBetGameScoreUpdateDto.getScoreAway();
                            }
                            str4 = "- -";
                            i10 = 0;
                        } else {
                            i10 = 0;
                            str4 = null;
                        }
                        FlashBetDetailsDialogKt.FlashBetDetailsTeamRow(teamDetails, str4, composer4, i10);
                        composer3.endReplaceGroup();
                        Unit unit2 = Unit.INSTANCE;
                    }
                    List<FlashBetGameUserAnswerDto> userAnswers = flashBetGameSessionDto.getUserAnswers();
                    composer4.startReplaceGroup(-726855918);
                    if (userAnswers != null) {
                        for (FlashBetGameUserAnswerDto flashBetGameUserAnswerDto : userAnswers) {
                            FlashBetDetailsDialogKt.FlashBetDetailsBetItem(flashBetGameUserAnswerDto.getQuestion(), flashBetGameUserAnswerDto.getAnswer(), flashBetGameUserAnswerDto.getCoefficient(), flashBetGameUserAnswerDto.isCorrect(), flashBetDetailsDialogState2 == FlashBetDetailsDialogState.Results ? 1 : i10, composer3, 0);
                        }
                        Unit unit3 = Unit.INSTANCE;
                    }
                    composer3.endReplaceGroup();
                    float f3 = 4;
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3)), composer4, 6);
                    Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally3 = Alignment.INSTANCE.getCenterHorizontally();
                    Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                    ComposerKt.sourceInformationMarkerStart(composer4, -483455358, str);
                    MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(spaceBetween, centerHorizontally3, composer4, 54);
                    String str7 = str3;
                    ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, str7);
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer4, i10);
                    CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer4, fillMaxWidth$default2);
                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                    String str8 = str2;
                    ComposerKt.sourceInformationMarkerStart(composer4, -692256719, str8);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer4.createNode(constructor4);
                    } else {
                        composer3.useNode();
                    }
                    Composer m4610constructorimpl4 = Updater.m4610constructorimpl(composer3);
                    Updater.m4617setimpl(m4610constructorimpl4, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer4, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(composer4, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer4, 48);
                    ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, str7);
                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer4, i10);
                    CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer4, companion);
                    Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer4, -692256719, str8);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer4.createNode(constructor5);
                    } else {
                        composer3.useNode();
                    }
                    Composer m4610constructorimpl5 = Updater.m4610constructorimpl(composer3);
                    Updater.m4617setimpl(m4610constructorimpl5, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    Updater.m4617setimpl(m4610constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer4, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    FlashBetDetailsDialogState flashBetDetailsDialogState4 = flashBetDetailsDialogState2;
                    TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.flash_bet_buy_in, composer4, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(13), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer4, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3)), composer3, 6);
                    TextKt.m2642Text4IGK_g(String.valueOf(flashBetGameSessionDto.getBetAmount()), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    float f4 = 14;
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer3, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 432, 120);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    if (flashBetDetailsDialogState4 == FlashBetDetailsDialogState.Preview) {
                        composer3.startReplaceGroup(-1498057250);
                        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                        Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer3, 48);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str7);
                        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default3);
                        Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str8);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor6);
                        } else {
                            composer3.useNode();
                        }
                        Composer m4610constructorimpl6 = Updater.m4610constructorimpl(composer3);
                        Updater.m4617setimpl(m4610constructorimpl6, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl6.getInserting() || !Intrinsics.areEqual(m4610constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                            m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                            m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                        }
                        Updater.m4617setimpl(m4610constructorimpl6, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.flash_bet_reward_all_correct, composer3, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(11), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                        SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3)), composer3, 6);
                        TextKt.m2642Text4IGK_g(String.valueOf(flashBetGameSessionDto.getBetAmount() * 3), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer3, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 432, 120);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endReplaceGroup();
                    } else if (flashBetDetailsDialogState4 == FlashBetDetailsDialogState.Results) {
                        composer3.startReplaceGroup(-1496059889);
                        Modifier fillMaxWidth$default4 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer3, 0);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str7);
                        int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap7 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default4);
                        Function0<ComposeUiNode> constructor7 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str8);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor7);
                        } else {
                            composer3.useNode();
                        }
                        Composer m4610constructorimpl7 = Updater.m4610constructorimpl(composer3);
                        Updater.m4617setimpl(m4610constructorimpl7, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl7, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl7.getInserting() || !Intrinsics.areEqual(m4610constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                            m4610constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                            m4610constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                        }
                        Updater.m4617setimpl(m4610constructorimpl7, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                        Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        MeasurePolicy rowMeasurePolicy4 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3, composer3, 48);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str7);
                        int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap8 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier8 = ComposedModifierKt.materializeModifier(composer3, companion2);
                        Function0<ComposeUiNode> constructor8 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str8);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor8);
                        } else {
                            composer3.useNode();
                        }
                        Composer m4610constructorimpl8 = Updater.m4610constructorimpl(composer3);
                        Updater.m4617setimpl(m4610constructorimpl8, rowMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl8, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl8.getInserting() || !Intrinsics.areEqual(m4610constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                            m4610constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                            m4610constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                        }
                        Updater.m4617setimpl(m4610constructorimpl8, materializeModifier8, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                        TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.won, composer3, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(13), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                        SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3)), composer3, 6);
                        List<FlashBetGameUserAnswerDto> userAnswers2 = flashBetGameSessionDto.getUserAnswers();
                        if (userAnswers2 != null) {
                            List<FlashBetGameUserAnswerDto> list = userAnswers2;
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                Iterator<T> it = list.iterator();
                                i11 = 0;
                                while (it.hasNext()) {
                                    if (Intrinsics.areEqual((Object) ((FlashBetGameUserAnswerDto) it.next()).isCorrect(), (Object) true) && (i11 = i11 + 1) < 0) {
                                        CollectionsKt.throwCountOverflow();
                                    }
                                }
                                if (Intrinsics.areEqual(flashBetGameSessionDto.getResult(), FlashBetGameResult.EXPIRED) || flashBetGameSessionDto.getReturnAmount() != 0) {
                                    if (i11 != 3) {
                                        j = flashBetGameSessionDto.getBetAmount() * 3;
                                    } else {
                                        if (i11 == 2) {
                                            betAmount = flashBetGameSessionDto.getBetAmount();
                                            d = 1.5d;
                                        } else if (i11 == 1) {
                                            betAmount = flashBetGameSessionDto.getBetAmount();
                                            d = 0.5d;
                                        }
                                        j = (long) (betAmount * d);
                                    }
                                    TextKt.m2642Text4IGK_g(j > 0 ? "+" + j : String.valueOf(j), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j > 0 ? ComposeUtils.AppColorPalette.Green.INSTANCE.getColor() : ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer3, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 432, 120);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endReplaceGroup();
                                }
                                j = 0;
                                TextKt.m2642Text4IGK_g(j > 0 ? "+" + j : String.valueOf(j), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j > 0 ? ComposeUtils.AppColorPalette.Green.INSTANCE.getColor() : ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer3, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 432, 120);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endReplaceGroup();
                            }
                        }
                        i11 = 0;
                        if (Intrinsics.areEqual(flashBetGameSessionDto.getResult(), FlashBetGameResult.EXPIRED)) {
                        }
                        if (i11 != 3) {
                        }
                        TextKt.m2642Text4IGK_g(j > 0 ? "+" + j : String.valueOf(j), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j > 0 ? ComposeUtils.AppColorPalette.Green.INSTANCE.getColor() : ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer3, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 432, 120);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(-1493270106);
                        composer3.endReplaceGroup();
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), ComposableLambdaKt.rememberComposableLambda(448414097, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetDetailsDialogKt$FlashBetDetailsDialog$1$1$3
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
                        ComposerKt.traceEventStart(448414097, i9, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetDetailsDialog.<anonymous>.<anonymous>.<anonymous> (FlashBetDetailsDialog.kt:109)");
                    }
                    if (z5) {
                        Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(24), Dp.m7774constructorimpl(12));
                        FlashBetDetailsDialogState flashBetDetailsDialogState = state;
                        Function0<Unit> function0 = onCollectClick;
                        boolean z11 = z92;
                        ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap32 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(composer3, m1517paddingVpY3zN4);
                        Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor32);
                        } else {
                            composer3.useNode();
                        }
                        Composer m4610constructorimpl3 = Updater.m4610constructorimpl(composer3);
                        Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32);
                        }
                        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                        CommonButtonKt.m12915CommonButtonUPEs2M4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, StringResources_androidKt.stringResource(R.string.collect, composer3, 6), false, false, flashBetDetailsDialogState != FlashBetDetailsDialogState.Waiting, function0, false, false, false, z11, false, null, null, true, false, null, null, null, null, null, composer3, 6, 24576, 0, 2079642);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), false, true, null, false, composer2, 200118, LossReason.LOSS_REASON_CREATIVE_FILTERED_CATEGORY_EXCLUSIONS_VALUE);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            z3 = z92;
            z6 = z8;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z3 = z;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        z4 = z2;
        if ((74899 & i3) == 74898) {
        }
        if (i8 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        i5 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i5 == 1) {
        }
        final boolean z922 = z7;
        Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        Alignment center22 = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(center22, false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default22);
        Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
        Modifier m1520paddingqDBjuR0$default22 = PaddingKt.m1520paddingqDBjuR0$default(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(12), 0.0f, 2, null), 0.0f, Dp.m7774constructorimpl(22), 0.0f, Dp.m7774constructorimpl(43), 5, null);
        Alignment.Horizontal centerHorizontally22 = Alignment.INSTANCE.getCenterHorizontally();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally22, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default22);
        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        composer2 = startRestartGroup;
        TopActionButtonsKt.TopActionButtons(ColumnScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally()), onDismiss, null, null, false, false, false, startRestartGroup, ((i3 >> 3) & 112) | 24576, 108);
        SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(32), Dp.m7774constructorimpl(70)), composer2, 6);
        i6 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i6 == 1) {
        }
        if (state == FlashBetDetailsDialogState.Waiting) {
        }
        TicketDarkKt.TicketDark(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, i7, null), ComposableLambdaKt.rememberComposableLambda(422268303, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetDetailsDialogKt$FlashBetDetailsDialog$1$1$1
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
                    ComposerKt.traceEventStart(422268303, i9, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetDetailsDialog.<anonymous>.<anonymous>.<anonymous> (FlashBetDetailsDialog.kt:103)");
                }
                QuickBetHeaderKt.QuickBetHeader(null, stringResource, null, null, z10, false, false, false, composer3, 0, 237);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer2, 54), ComposableLambdaKt.rememberComposableLambda(-1712142448, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetDetailsDialogKt$FlashBetDetailsDialog$1$1$2

            /* compiled from: FlashBetDetailsDialog.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[FlashBetDetailsDialogState.values().length];
                    try {
                        iArr[FlashBetDetailsDialogState.Preview.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[FlashBetDetailsDialogState.Waiting.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[FlashBetDetailsDialogState.Results.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Code restructure failed: missing block: B:49:0x0279, code lost:
            
                if (r11 != null) goto L65;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:156:0x09ea  */
            /* JADX WARN: Removed duplicated region for block: B:159:0x0a02  */
            /* JADX WARN: Removed duplicated region for block: B:161:0x0a09  */
            /* JADX WARN: Removed duplicated region for block: B:162:0x09fa  */
            /* JADX WARN: Removed duplicated region for block: B:165:0x09c6  */
            /* JADX WARN: Removed duplicated region for block: B:166:0x09cd  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke(Composer composer3, int i9) {
                float f;
                String str;
                String str2;
                FlashBetGameSessionDto flashBetGameSessionDto;
                String str3;
                FlashBetDetailsDialogState flashBetDetailsDialogState;
                Composer composer4;
                FlashBetDetailsDialogState flashBetDetailsDialogState2;
                int i10;
                int i11;
                double betAmount;
                double d;
                long j;
                String str4;
                FlashBetGameScoreUpdateDto flashBetGameScoreUpdateDto;
                if ((i9 & 3) == 2 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1712142448, i9, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetDetailsDialog.<anonymous>.<anonymous>.<anonymous> (FlashBetDetailsDialog.kt:123)");
                }
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                f = FlashBetDetailsDialogKt.FLASH_BET_DETAILS_CONTENT_MAX_HEIGHT;
                Modifier verticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.m1551heightInVpY3zN4$default(fillMaxWidth$default, 0.0f, f, 1, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                float f2 = 12;
                Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(verticalScroll$default, Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(20));
                Alignment.Horizontal centerHorizontally222 = Alignment.INSTANCE.getCenterHorizontally();
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f2));
                FlashBetGameSessionDto flashBetGameSessionDto2 = FlashBetGameSessionDto.this;
                FlashBetDetailsDialogState flashBetDetailsDialogState3 = state;
                ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4, centerHorizontally222, composer3, 54);
                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap322 = composer3.getCurrentCompositionLocalMap();
                Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(composer3, m1517paddingVpY3zN4);
                Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor322);
                } else {
                    composer3.useNode();
                }
                Composer m4610constructorimpl3 = Updater.m4610constructorimpl(composer3);
                Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash322);
                }
                Updater.m4617setimpl(m4610constructorimpl3, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                String matchStartDate = flashBetGameSessionDto2.getMatchStartDate();
                if (matchStartDate == null) {
                    FlashBetGameMatchDetailsDto matchDetails = flashBetGameSessionDto2.getMatchDetails();
                    matchStartDate = matchDetails != null ? matchDetails.getStartDate() : null;
                }
                composer3.startReplaceGroup(5004770);
                boolean changed = composer3.changed(matchStartDate);
                Object rememberedValue = composer3.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    String str5 = matchStartDate;
                    if (str5 == null || StringsKt.isBlank(str5)) {
                        matchStartDate = null;
                    } else {
                        String formattedDateWithYear = UiExtensionsKt.getFormattedDateWithYear(matchStartDate);
                        if (!StringsKt.isBlank(formattedDateWithYear)) {
                            matchStartDate = formattedDateWithYear;
                        }
                    }
                    composer3.updateRememberedValue(matchStartDate);
                    rememberedValue = matchStartDate;
                }
                String str6 = (String) rememberedValue;
                composer3.endReplaceGroup();
                composer3.startReplaceGroup(-726911585);
                if (str6 != null) {
                    str = "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo";
                    str2 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                    flashBetDetailsDialogState = flashBetDetailsDialogState3;
                    flashBetGameSessionDto = flashBetGameSessionDto2;
                    str3 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                    TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.flash_bet_game_took_place_on, new Object[]{str6}, composer3, 6), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(12), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 48, 0, 65020);
                } else {
                    str = "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo";
                    str2 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                    flashBetGameSessionDto = flashBetGameSessionDto2;
                    str3 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                    flashBetDetailsDialogState = flashBetDetailsDialogState3;
                }
                composer3.endReplaceGroup();
                int i12 = WhenMappings.$EnumSwitchMapping$0[flashBetDetailsDialogState.ordinal()];
                if (i12 == 1) {
                    composer4 = composer3;
                    flashBetDetailsDialogState2 = flashBetDetailsDialogState;
                    i10 = 0;
                    composer4.startReplaceGroup(-1058609833);
                    FlashBetDetailsDialogKt.FlashBetDetailsTeamsRowSmall(flashBetGameSessionDto.getTeamDetails(), composer4, 0);
                    composer3.endReplaceGroup();
                    Unit unit = Unit.INSTANCE;
                } else {
                    if (i12 != 2 && i12 != 3) {
                        composer3.startReplaceGroup(-726887208);
                        composer3.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer4 = composer3;
                    composer4.startReplaceGroup(-1058273762);
                    FlashBetGameMatchTeamDetailsDto teamDetails = flashBetGameSessionDto.getTeamDetails();
                    flashBetDetailsDialogState2 = flashBetDetailsDialogState;
                    if (flashBetDetailsDialogState2 == FlashBetDetailsDialogState.Results) {
                        List<FlashBetGameScoreUpdateDto> scores = flashBetGameSessionDto.getScores();
                        if (scores != null && (flashBetGameScoreUpdateDto = (FlashBetGameScoreUpdateDto) CollectionsKt.lastOrNull((List) scores)) != null) {
                            str4 = flashBetGameScoreUpdateDto.getScoreHome() + " - " + flashBetGameScoreUpdateDto.getScoreAway();
                        }
                        str4 = "- -";
                        i10 = 0;
                    } else {
                        i10 = 0;
                        str4 = null;
                    }
                    FlashBetDetailsDialogKt.FlashBetDetailsTeamRow(teamDetails, str4, composer4, i10);
                    composer3.endReplaceGroup();
                    Unit unit2 = Unit.INSTANCE;
                }
                List<FlashBetGameUserAnswerDto> userAnswers = flashBetGameSessionDto.getUserAnswers();
                composer4.startReplaceGroup(-726855918);
                if (userAnswers != null) {
                    for (FlashBetGameUserAnswerDto flashBetGameUserAnswerDto : userAnswers) {
                        FlashBetDetailsDialogKt.FlashBetDetailsBetItem(flashBetGameUserAnswerDto.getQuestion(), flashBetGameUserAnswerDto.getAnswer(), flashBetGameUserAnswerDto.getCoefficient(), flashBetGameUserAnswerDto.isCorrect(), flashBetDetailsDialogState2 == FlashBetDetailsDialogState.Results ? 1 : i10, composer3, 0);
                    }
                    Unit unit3 = Unit.INSTANCE;
                }
                composer3.endReplaceGroup();
                float f3 = 4;
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3)), composer4, 6);
                Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment.Horizontal centerHorizontally3 = Alignment.INSTANCE.getCenterHorizontally();
                Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                ComposerKt.sourceInformationMarkerStart(composer4, -483455358, str);
                MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(spaceBetween, centerHorizontally3, composer4, 54);
                String str7 = str3;
                ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, str7);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer4, i10);
                CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer4, fillMaxWidth$default2);
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                String str8 = str2;
                ComposerKt.sourceInformationMarkerStart(composer4, -692256719, str8);
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer4.createNode(constructor4);
                } else {
                    composer3.useNode();
                }
                Composer m4610constructorimpl4 = Updater.m4610constructorimpl(composer3);
                Updater.m4617setimpl(m4610constructorimpl4, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer4, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(composer4, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer4, 48);
                ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, str7);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer4, i10);
                CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer4, companion);
                Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer4, -692256719, str8);
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer4.createNode(constructor5);
                } else {
                    composer3.useNode();
                }
                Composer m4610constructorimpl5 = Updater.m4610constructorimpl(composer3);
                Updater.m4617setimpl(m4610constructorimpl5, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                Updater.m4617setimpl(m4610constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer4, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                FlashBetDetailsDialogState flashBetDetailsDialogState4 = flashBetDetailsDialogState2;
                TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.flash_bet_buy_in, composer4, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(13), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer4, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3)), composer3, 6);
                TextKt.m2642Text4IGK_g(String.valueOf(flashBetGameSessionDto.getBetAmount()), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                float f4 = 14;
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer3, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 432, 120);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                if (flashBetDetailsDialogState4 == FlashBetDetailsDialogState.Preview) {
                    composer3.startReplaceGroup(-1498057250);
                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                    Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer3, 48);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str7);
                    int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default3);
                    Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str8);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor6);
                    } else {
                        composer3.useNode();
                    }
                    Composer m4610constructorimpl6 = Updater.m4610constructorimpl(composer3);
                    Updater.m4617setimpl(m4610constructorimpl6, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl6.getInserting() || !Intrinsics.areEqual(m4610constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                        m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                        m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                    }
                    Updater.m4617setimpl(m4610constructorimpl6, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.flash_bet_reward_all_correct, composer3, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(11), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3)), composer3, 6);
                    TextKt.m2642Text4IGK_g(String.valueOf(flashBetGameSessionDto.getBetAmount() * 3), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer3, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 432, 120);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endReplaceGroup();
                } else if (flashBetDetailsDialogState4 == FlashBetDetailsDialogState.Results) {
                    composer3.startReplaceGroup(-1496059889);
                    Modifier fillMaxWidth$default4 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer3, 0);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str7);
                    int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default4);
                    Function0<ComposeUiNode> constructor7 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str8);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor7);
                    } else {
                        composer3.useNode();
                    }
                    Composer m4610constructorimpl7 = Updater.m4610constructorimpl(composer3);
                    Updater.m4617setimpl(m4610constructorimpl7, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl7, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl7.getInserting() || !Intrinsics.areEqual(m4610constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                        m4610constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                        m4610constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                    }
                    Updater.m4617setimpl(m4610constructorimpl7, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                    Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    MeasurePolicy rowMeasurePolicy4 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3, composer3, 48);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str7);
                    int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap8 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier8 = ComposedModifierKt.materializeModifier(composer3, companion2);
                    Function0<ComposeUiNode> constructor8 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str8);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor8);
                    } else {
                        composer3.useNode();
                    }
                    Composer m4610constructorimpl8 = Updater.m4610constructorimpl(composer3);
                    Updater.m4617setimpl(m4610constructorimpl8, rowMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl8, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl8.getInserting() || !Intrinsics.areEqual(m4610constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                        m4610constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                        m4610constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                    }
                    Updater.m4617setimpl(m4610constructorimpl8, materializeModifier8, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                    TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.won, composer3, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(13), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3)), composer3, 6);
                    List<FlashBetGameUserAnswerDto> userAnswers2 = flashBetGameSessionDto.getUserAnswers();
                    if (userAnswers2 != null) {
                        List<FlashBetGameUserAnswerDto> list = userAnswers2;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            i11 = 0;
                            while (it.hasNext()) {
                                if (Intrinsics.areEqual((Object) ((FlashBetGameUserAnswerDto) it.next()).isCorrect(), (Object) true) && (i11 = i11 + 1) < 0) {
                                    CollectionsKt.throwCountOverflow();
                                }
                            }
                            if (Intrinsics.areEqual(flashBetGameSessionDto.getResult(), FlashBetGameResult.EXPIRED) || flashBetGameSessionDto.getReturnAmount() != 0) {
                                if (i11 != 3) {
                                    j = flashBetGameSessionDto.getBetAmount() * 3;
                                } else {
                                    if (i11 == 2) {
                                        betAmount = flashBetGameSessionDto.getBetAmount();
                                        d = 1.5d;
                                    } else if (i11 == 1) {
                                        betAmount = flashBetGameSessionDto.getBetAmount();
                                        d = 0.5d;
                                    }
                                    j = (long) (betAmount * d);
                                }
                                TextKt.m2642Text4IGK_g(j > 0 ? "+" + j : String.valueOf(j), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j > 0 ? ComposeUtils.AppColorPalette.Green.INSTANCE.getColor() : ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer3, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 432, 120);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endReplaceGroup();
                            }
                            j = 0;
                            TextKt.m2642Text4IGK_g(j > 0 ? "+" + j : String.valueOf(j), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j > 0 ? ComposeUtils.AppColorPalette.Green.INSTANCE.getColor() : ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer3, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 432, 120);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endReplaceGroup();
                        }
                    }
                    i11 = 0;
                    if (Intrinsics.areEqual(flashBetGameSessionDto.getResult(), FlashBetGameResult.EXPIRED)) {
                    }
                    if (i11 != 3) {
                    }
                    TextKt.m2642Text4IGK_g(j > 0 ? "+" + j : String.valueOf(j), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j > 0 ? ComposeUtils.AppColorPalette.Green.INSTANCE.getColor() : ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer3, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 432, 120);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endReplaceGroup();
                } else {
                    composer3.startReplaceGroup(-1493270106);
                    composer3.endReplaceGroup();
                }
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer2, 54), ComposableLambdaKt.rememberComposableLambda(448414097, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetDetailsDialogKt$FlashBetDetailsDialog$1$1$3
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
                    ComposerKt.traceEventStart(448414097, i9, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetDetailsDialog.<anonymous>.<anonymous>.<anonymous> (FlashBetDetailsDialog.kt:109)");
                }
                if (z5) {
                    Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(24), Dp.m7774constructorimpl(12));
                    FlashBetDetailsDialogState flashBetDetailsDialogState = state;
                    Function0<Unit> function0 = onCollectClick;
                    boolean z11 = z922;
                    ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap322 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(composer3, m1517paddingVpY3zN4);
                    Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor322);
                    } else {
                        composer3.useNode();
                    }
                    Composer m4610constructorimpl3 = Updater.m4610constructorimpl(composer3);
                    Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash322);
                    }
                    Updater.m4617setimpl(m4610constructorimpl3, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer3, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                    CommonButtonKt.m12915CommonButtonUPEs2M4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, StringResources_androidKt.stringResource(R.string.collect, composer3, 6), false, false, flashBetDetailsDialogState != FlashBetDetailsDialogState.Waiting, function0, false, false, false, z11, false, null, null, true, false, null, null, null, null, null, composer3, 6, 24576, 0, 2079642);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer2, 54), false, true, null, false, composer2, 200118, LossReason.LOSS_REASON_CREATIVE_FILTERED_CATEGORY_EXCLUSIONS_VALUE);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        z3 = z922;
        z6 = z8;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FlashBetDetailsTeamsRowSmall(final FlashBetGameMatchTeamDetailsDto flashBetGameMatchTeamDetailsDto, Composer composer, final int i) {
        int i2;
        String str;
        String str2;
        String str3;
        float f;
        String str4;
        String str5;
        Composer composer2;
        float f2;
        float f3;
        Composer composer3;
        Composer composer4;
        Composer startRestartGroup = composer.startRestartGroup(1834471516);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(flashBetGameMatchTeamDetailsDto) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1834471516, i2, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetDetailsTeamsRowSmall (FlashBetDetailsDialog.kt:301)");
            }
            if (flashBetGameMatchTeamDetailsDto == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetDetailsDialogKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit FlashBetDetailsTeamsRowSmall$lambda$3;
                            FlashBetDetailsTeamsRowSmall$lambda$3 = FlashBetDetailsDialogKt.FlashBetDetailsTeamsRowSmall$lambda$3(FlashBetGameMatchTeamDetailsDto.this, i, (Composer) obj, ((Integer) obj2).intValue());
                            return FlashBetDetailsTeamsRowSmall$lambda$3;
                        }
                    });
                    return;
                }
                return;
            }
            long j = ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor();
            float m7774constructorimpl = Dp.m7774constructorimpl(51);
            float m7774constructorimpl2 = Dp.m7774constructorimpl(32);
            float m7774constructorimpl3 = Dp.m7774constructorimpl(28);
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceEvenly, centerVertically, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
            Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f4 = 8;
            float f5 = 2;
            Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(BackgroundKt.m1025backgroundbw27NRU$default(ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, m7774constructorimpl), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f4))), j, null, 2, null), Dp.m7774constructorimpl(f5));
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
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
            Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (!StringsKt.isBlank(flashBetGameMatchTeamDetailsDto.getHomeTeamLogoUrl())) {
                startRestartGroup.startReplaceGroup(-1908864960);
                str = "C89@4556L9:Column.kt#2w3rfo";
                str2 = "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo";
                str3 = "C72@3468L9:Box.kt#2w3rfo";
                f = f5;
                str4 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                str5 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                f3 = m7774constructorimpl3;
                f2 = m7774constructorimpl2;
                composer2 = startRestartGroup;
                SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(flashBetGameMatchTeamDetailsDto.getHomeTeamLogoUrl(), null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(6))), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, startRestartGroup, 1572912, 0, 1976);
                composer2.endReplaceGroup();
            } else {
                str = "C89@4556L9:Column.kt#2w3rfo";
                str2 = "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo";
                str3 = "C72@3468L9:Box.kt#2w3rfo";
                f = f5;
                str4 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                str5 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                composer2 = startRestartGroup;
                f2 = m7774constructorimpl2;
                f3 = m7774constructorimpl3;
                startRestartGroup.startReplaceGroup(-1908475817);
                TextKt.m2642Text4IGK_g(TypeDescription.Generic.OfWildcardType.SYMBOL, (Modifier) null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(24), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199686, 0, 131026);
                composer2.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            float f6 = 4;
            Composer composer5 = composer2;
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f6)), composer5, 6);
            TextKt.m2642Text4IGK_g(flashBetGameMatchTeamDetailsDto.getHomeTeam(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(9), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer5, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer2, 0, 3072, 56830);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Composer composer6 = composer2;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.vs_img, composer6, 6), (String) null, SizeKt.m1565sizeVpY3zN4(Modifier.INSTANCE, f2, f3), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer6, 432, 120);
            Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(composer6, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, composer6, 48);
            String str6 = str4;
            ComposerKt.sourceInformationMarkerStart(composer6, -1323940314, str6);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer6.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer6, companion2);
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            String str7 = str5;
            ComposerKt.sourceInformationMarkerStart(composer6, -692256719, str7);
            if (!(composer6.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer6.startReusableNode();
            if (composer6.getInserting()) {
                composer6.createNode(constructor4);
            } else {
                composer6.useNode();
            }
            Composer m4610constructorimpl4 = Updater.m4610constructorimpl(composer6);
            Updater.m4617setimpl(m4610constructorimpl4, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer6, -384672921, str);
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            Modifier m1516padding3ABfNKs2 = PaddingKt.m1516padding3ABfNKs(BackgroundKt.m1025backgroundbw27NRU$default(ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, m7774constructorimpl), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f4))), j, null, 2, null), Dp.m7774constructorimpl(f));
            Alignment center2 = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer6, 733328855, str2);
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
            ComposerKt.sourceInformationMarkerStart(composer6, -1323940314, str6);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer6.getCurrentCompositionLocalMap();
            Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer6, m1516padding3ABfNKs2);
            Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer6, -692256719, str7);
            if (!(composer6.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer6.startReusableNode();
            if (composer6.getInserting()) {
                composer6.createNode(constructor5);
            } else {
                composer6.useNode();
            }
            Composer m4610constructorimpl5 = Updater.m4610constructorimpl(composer6);
            Updater.m4617setimpl(m4610constructorimpl5, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            Updater.m4617setimpl(m4610constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer6, -2146730711, str3);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            if (!StringsKt.isBlank(flashBetGameMatchTeamDetailsDto.getAwayTeamLogoUrl())) {
                composer6.startReplaceGroup(-1698664265);
                composer3 = composer6;
                SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(flashBetGameMatchTeamDetailsDto.getAwayTeamLogoUrl(), null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(6))), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, composer6, 1572912, 0, 1976);
                composer3.endReplaceGroup();
            } else {
                composer3 = composer6;
                composer6.startReplaceGroup(-1698275122);
                TextKt.m2642Text4IGK_g(TypeDescription.Generic.OfWildcardType.SYMBOL, (Modifier) null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(24), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 199686, 0, 131026);
                composer3.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            Modifier m1549height3ABfNKs = SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f6));
            Composer composer7 = composer3;
            SpacerKt.Spacer(m1549height3ABfNKs, composer7, 6);
            composer4 = composer7;
            TextKt.m2642Text4IGK_g(flashBetGameMatchTeamDetailsDto.getAwayTeam(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(9), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer7, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer4, 0, 3072, 56830);
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
        } else {
            startRestartGroup.skipToGroupEnd();
            composer4 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup2 = composer4.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetDetailsDialogKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FlashBetDetailsTeamsRowSmall$lambda$9;
                    FlashBetDetailsTeamsRowSmall$lambda$9 = FlashBetDetailsDialogKt.FlashBetDetailsTeamsRowSmall$lambda$9(FlashBetGameMatchTeamDetailsDto.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return FlashBetDetailsTeamsRowSmall$lambda$9;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FlashBetDetailsTeamRow(final FlashBetGameMatchTeamDetailsDto flashBetGameMatchTeamDetailsDto, final String str, Composer composer, final int i) {
        int i2;
        int i3;
        final int i4;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1054641737);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(flashBetGameMatchTeamDetailsDto) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        int i5 = i2;
        if ((i5 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1054641737, i5, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetDetailsTeamRow (FlashBetDetailsDialog.kt:405)");
            }
            if (flashBetGameMatchTeamDetailsDto == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetDetailsDialogKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit FlashBetDetailsTeamRow$lambda$10;
                            FlashBetDetailsTeamRow$lambda$10 = FlashBetDetailsDialogKt.FlashBetDetailsTeamRow$lambda$10(FlashBetGameMatchTeamDetailsDto.this, str, i, (Composer) obj, ((Integer) obj2).intValue());
                            return FlashBetDetailsTeamRow$lambda$10;
                        }
                    });
                    return;
                }
                return;
            }
            long j = ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor();
            float m7774constructorimpl = Dp.m7774constructorimpl(51);
            float m7774constructorimpl2 = Dp.m7774constructorimpl(32);
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceEvenly, centerVertically, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
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
            Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f = 8;
            float f2 = 2;
            Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(BackgroundKt.m1025backgroundbw27NRU$default(ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, m7774constructorimpl), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f))), j, null, 2, null), Dp.m7774constructorimpl(f2));
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
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
            Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (!StringsKt.isBlank(flashBetGameMatchTeamDetailsDto.getHomeTeamLogoUrl())) {
                startRestartGroup.startReplaceGroup(-2124030267);
                SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(flashBetGameMatchTeamDetailsDto.getHomeTeamLogoUrl(), null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(6))), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, startRestartGroup, 1572912, 0, 1976);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-2123641124);
                TextKt.m2642Text4IGK_g(TypeDescription.Generic.OfWildcardType.SYMBOL, (Modifier) null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(24), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 199686, 0, 131026);
                startRestartGroup.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.vs_img, startRestartGroup, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, m7774constructorimpl2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
            Modifier m1516padding3ABfNKs2 = PaddingKt.m1516padding3ABfNKs(BackgroundKt.m1025backgroundbw27NRU$default(ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, m7774constructorimpl), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f))), j, null, 2, null), Dp.m7774constructorimpl(f2));
            Alignment center2 = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs2);
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
            Composer m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            if (!StringsKt.isBlank(flashBetGameMatchTeamDetailsDto.getAwayTeamLogoUrl())) {
                startRestartGroup.startReplaceGroup(180165934);
                i3 = 6;
                SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(flashBetGameMatchTeamDetailsDto.getAwayTeamLogoUrl(), null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(6))), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, startRestartGroup, 1572912, 0, 1976);
                startRestartGroup.endReplaceGroup();
            } else {
                i3 = 6;
                startRestartGroup.startReplaceGroup(180555077);
                TextKt.m2642Text4IGK_g(TypeDescription.Generic.OfWildcardType.SYMBOL, (Modifier) null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(24), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 199686, 0, 131026);
                startRestartGroup.endReplaceGroup();
            }
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
            startRestartGroup.startReplaceGroup(755614559);
            if (str != null) {
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(i3)), startRestartGroup, i3);
                composer2 = startRestartGroup;
                i4 = i;
                TextKt.m2642Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, i3), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer2, (i5 >> 3) & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            } else {
                i4 = i;
                composer2 = startRestartGroup;
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
            i4 = i;
        }
        ScopeUpdateScope endRestartGroup2 = composer2.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetDetailsDialogKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FlashBetDetailsTeamRow$lambda$15;
                    FlashBetDetailsTeamRow$lambda$15 = FlashBetDetailsDialogKt.FlashBetDetailsTeamRow$lambda$15(FlashBetGameMatchTeamDetailsDto.this, str, i4, (Composer) obj, ((Integer) obj2).intValue());
                    return FlashBetDetailsTeamRow$lambda$15;
                }
            });
        }
    }

    public static final void FlashBetDetailsBetItem(final String question, final String answer, final Double d, final Boolean bool, final boolean z, Composer composer, final int i) {
        int i2;
        long j;
        Composer composer2;
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(answer, "answer");
        Composer startRestartGroup = composer.startRestartGroup(-870352472);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(question) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(answer) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(bool) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(z) ? 16384 : 8192;
        }
        int i3 = i2;
        if ((i3 & 9235) != 9234 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-870352472, i3, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetDetailsBetItem (FlashBetDetailsDialog.kt:500)");
            }
            if (!z) {
                j = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
            } else if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                j = ComposeUtils.AppColorPalette.Green.INSTANCE.getColor();
            } else {
                j = Intrinsics.areEqual((Object) bool, (Object) false) ? ComposeUtils.AppColorPalette.Red.INSTANCE.getColor() : ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor();
            }
            long j2 = j;
            float f = 12;
            Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(BackgroundKt.m1025backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(4))), ComposeUtils.AppColorPalette.BackgroundListBetsItem.INSTANCE.getColor(), null, 2, null), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4);
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
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
            Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            Modifier weight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
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
            Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m2642Text4IGK_g(question, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(12), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, i3 & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            TextKt.m2642Text4IGK_g(answer, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(10), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, (i3 >> 3) & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(BackgroundKt.m1025backgroundbw27NRU$default(ClipKt.clip(SizeKt.m1570widthInVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(24), 0.0f, 2, null), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f))), j2, null, 2, null), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(10));
            composer2 = startRestartGroup;
            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, m1517paddingVpY3zN42);
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor4);
            } else {
                composer2.useNode();
            }
            Composer m4610constructorimpl4 = Updater.m4610constructorimpl(composer2);
            Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetDetailsDialogKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FlashBetDetailsBetItem$lambda$20;
                    FlashBetDetailsBetItem$lambda$20 = FlashBetDetailsDialogKt.FlashBetDetailsBetItem$lambda$20(question, answer, d, bool, z, i, (Composer) obj, ((Integer) obj2).intValue());
                    return FlashBetDetailsBetItem$lambda$20;
                }
            });
        }
    }

    public static final void FlashBetAbandonedSessionContent(final FlashBetGameSessionDto session, final Function0<Unit> onDismiss, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer startRestartGroup = composer.startRestartGroup(1580421936);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(session) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1580421936, i2, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetAbandonedSessionContent (FlashBetDetailsDialog.kt:558)");
            }
            float f = 32;
            Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f));
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4);
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
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            TopActionButtonsKt.TopActionButtons(ColumnScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally()), onDismiss, null, null, false, false, false, startRestartGroup, (i2 & 112) | 24576, 108);
            SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(100)), startRestartGroup, 6);
            composer2 = startRestartGroup;
            TicketDarkKt.TicketDark(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposableSingletons$FlashBetDetailsDialogKt.INSTANCE.m13686getLambda$149302966$app_release(), ComposableLambdaKt.rememberComposableLambda(1969748009, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetDetailsDialogKt$FlashBetAbandonedSessionContent$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1969748009, i3, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetAbandonedSessionContent.<anonymous>.<anonymous> (FlashBetDetailsDialog.kt:594)");
                    }
                    float f2 = 12;
                    Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(20));
                    Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                    Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f2));
                    FlashBetGameSessionDto flashBetGameSessionDto = FlashBetGameSessionDto.this;
                    ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4, centerHorizontally2, composer3, 54);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, m1517paddingVpY3zN42);
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
                    Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    FlashBetDetailsDialogKt.FlashBetDetailsTeamsRowSmall(flashBetGameSessionDto.getTeamDetails(), composer3, 0);
                    TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.flash_bet_cannot_continue_message, composer3, 6), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3120, 0, 130544);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-206168312, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetDetailsDialogKt$FlashBetAbandonedSessionContent$1$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-206168312, i3, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetAbandonedSessionContent.<anonymous>.<anonymous> (FlashBetDetailsDialog.kt:581)");
                    }
                    Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(24), Dp.m7774constructorimpl(12));
                    Alignment center = Alignment.INSTANCE.getCenter();
                    Function0<Unit> function0 = onDismiss;
                    ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, m1517paddingVpY3zN42);
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
                    CommonButtonKt.m12915CommonButtonUPEs2M4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, StringResources_androidKt.stringResource(R.string.ok, composer3, 6), false, false, false, function0, false, false, false, false, false, null, null, true, false, null, null, null, null, null, composer3, 6, 24576, 0, 2080698);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), false, true, null, false, composer2, 200118, LossReason.LOSS_REASON_CREATIVE_FILTERED_CATEGORY_EXCLUSIONS_VALUE);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetDetailsDialogKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FlashBetAbandonedSessionContent$lambda$22;
                    FlashBetAbandonedSessionContent$lambda$22 = FlashBetDetailsDialogKt.FlashBetAbandonedSessionContent$lambda$22(FlashBetGameSessionDto.this, onDismiss, i, (Composer) obj, ((Integer) obj2).intValue());
                    return FlashBetAbandonedSessionContent$lambda$22;
                }
            });
        }
    }
}
