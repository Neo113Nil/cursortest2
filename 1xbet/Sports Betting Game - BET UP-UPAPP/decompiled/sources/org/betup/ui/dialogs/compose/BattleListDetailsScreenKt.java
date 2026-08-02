package org.betup.ui.dialogs.compose;

import android.content.res.Configuration;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.betup.R;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.entity.challenges.NewChallengeDetailsResponseModelP;
import org.betup.model.remote.entity.user.BaseUserModel;
import org.betup.ui.MainActivity;
import org.betup.ui.common.compose.ClickAnimationModifierKt;
import org.betup.ui.common.compose.LazyListStateNoSaveKt;
import org.betup.ui.common.compose.PagerStateNoSaveKt;
import org.betup.ui.dialogs.controller.ChallengePreviewController;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.BattleShareCaptureAnchor;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: BattleListDetailsScreen.kt */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a\u0097\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b26\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00010\u001026\u0010\u0016\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0007¢\u0006\u0002\u0010\u001f¨\u0006 ²\u0006\n\u0010!\u001a\u00020\u0014X\u008a\u0084\u0002²\u0006\n\u0010\"\u001a\u00020\u0014X\u008a\u0084\u0002²\u0006\f\u0010#\u001a\u0004\u0018\u00010$X\u008a\u0084\u0002²\u0006\n\u0010%\u001a\u00020\u0014X\u008a\u0084\u0002²\u0006\f\u0010&\u001a\u0004\u0018\u00010'X\u008a\u0084\u0002²\u0006\f\u0010(\u001a\u0004\u0018\u00010'X\u008a\u0084\u0002"}, d2 = {"BattleListDetailsScreen", "", "challengeIds", "", "", "selectedChallengeId", "controller", "Lorg/betup/ui/dialogs/controller/ChallengePreviewController;", "shareCaptureAnchor", "Lorg/betup/utils/BattleShareCaptureAnchor;", "onDismiss", "Lkotlin/Function0;", "onAcceptChallenge", "onDeclineChallenge", "onCancelChallenge", "onMatchClick", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "matchId", "", "isLive", "onLeagueClick", "leagueId", "onShare", "onRematch", "onHowBattlesDecided", "activity", "Lorg/betup/ui/MainActivity;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;JLorg/betup/ui/dialogs/controller/ChallengePreviewController;Lorg/betup/utils/BattleShareCaptureAnchor;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lorg/betup/ui/MainActivity;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "app_release", "isLoading", "isCancelInProgress", "error", "", "isBound", "firstVisible", "", "lastVisible"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BattleListDetailsScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleListDetailsScreen$lambda$24(List list, long j, ChallengePreviewController challengePreviewController, BattleShareCaptureAnchor battleShareCaptureAnchor, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function2 function2, Function2 function22, Function0 function05, Function0 function06, Function0 function07, MainActivity mainActivity, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        BattleListDetailsScreen(list, j, challengePreviewController, battleShareCaptureAnchor, function0, function02, function03, function04, function2, function22, function05, function06, function07, mainActivity, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleListDetailsScreen$lambda$3(List list, long j, ChallengePreviewController challengePreviewController, BattleShareCaptureAnchor battleShareCaptureAnchor, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function2 function2, Function2 function22, Function0 function05, Function0 function06, Function0 function07, MainActivity mainActivity, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        BattleListDetailsScreen(list, j, challengePreviewController, battleShareCaptureAnchor, function0, function02, function03, function04, function2, function22, function05, function06, function07, mainActivity, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BattleListDetailsScreen(final List<Long> challengeIds, final long j, final ChallengePreviewController controller, final BattleShareCaptureAnchor shareCaptureAnchor, final Function0<Unit> onDismiss, final Function0<Unit> onAcceptChallenge, final Function0<Unit> onDeclineChallenge, final Function0<Unit> onCancelChallenge, final Function2<? super Long, ? super Boolean, Unit> onMatchClick, final Function2<? super Long, ? super Boolean, Unit> onLeagueClick, final Function0<Unit> onShare, final Function0<Unit> onRematch, final Function0<Unit> onHowBattlesDecided, final MainActivity activity, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Object obj;
        BattleListDetailsScreenKt$BattleListDetailsScreen$5$1 battleListDetailsScreenKt$BattleListDetailsScreen$5$1;
        Composer composer2;
        final Modifier modifier2;
        int i10;
        int i11;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(challengeIds, "challengeIds");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(shareCaptureAnchor, "shareCaptureAnchor");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onAcceptChallenge, "onAcceptChallenge");
        Intrinsics.checkNotNullParameter(onDeclineChallenge, "onDeclineChallenge");
        Intrinsics.checkNotNullParameter(onCancelChallenge, "onCancelChallenge");
        Intrinsics.checkNotNullParameter(onMatchClick, "onMatchClick");
        Intrinsics.checkNotNullParameter(onLeagueClick, "onLeagueClick");
        Intrinsics.checkNotNullParameter(onShare, "onShare");
        Intrinsics.checkNotNullParameter(onRematch, "onRematch");
        Intrinsics.checkNotNullParameter(onHowBattlesDecided, "onHowBattlesDecided");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Composer startRestartGroup = composer.startRestartGroup(-818865501);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(challengeIds) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changedInstance(controller) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(shareCaptureAnchor) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(onDismiss) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i5 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else {
            if ((196608 & i) == 0) {
                i5 = startRestartGroup.changedInstance(onAcceptChallenge) ? 131072 : 65536;
            }
            if ((i3 & 64) != 0) {
                i13 = (1572864 & i) == 0 ? startRestartGroup.changedInstance(onDeclineChallenge) ? 1048576 : 524288 : 1572864;
                if ((i3 & 128) == 0) {
                    i12 = (12582912 & i) == 0 ? startRestartGroup.changedInstance(onCancelChallenge) ? 8388608 : 4194304 : 12582912;
                    if ((i3 & 256) != 0) {
                        i11 = (100663296 & i) == 0 ? startRestartGroup.changedInstance(onMatchClick) ? 67108864 : 33554432 : 100663296;
                        if ((i3 & 512) == 0) {
                            i10 = (805306368 & i) == 0 ? startRestartGroup.changedInstance(onLeagueClick) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456 : 805306368;
                            i6 = i4;
                            if ((i3 & 1024) == 0) {
                                i7 = i2;
                                i8 = i7 | 6;
                            } else {
                                i7 = i2;
                                if ((i7 & 6) == 0) {
                                    i8 = i7 | (startRestartGroup.changedInstance(onShare) ? 4 : 2);
                                } else {
                                    i8 = i7;
                                }
                            }
                            if ((i3 & 2048) == 0) {
                                i8 |= 48;
                            } else if ((i7 & 48) == 0) {
                                i8 |= startRestartGroup.changedInstance(onRematch) ? 32 : 16;
                            }
                            int i14 = i8;
                            if ((i3 & 4096) == 0) {
                                i14 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                            } else if ((i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                i14 |= startRestartGroup.changedInstance(onHowBattlesDecided) ? 256 : 128;
                                if ((i3 & 8192) != 0) {
                                    i14 |= 3072;
                                } else if ((i7 & 3072) == 0) {
                                    i14 |= startRestartGroup.changedInstance(activity) ? 2048 : 1024;
                                    i9 = i3 & 16384;
                                    if (i9 == 0) {
                                        i14 |= 24576;
                                    } else if ((i7 & 24576) == 0) {
                                        i14 |= startRestartGroup.changed(modifier) ? 16384 : 8192;
                                        if ((i6 & 306783379) == 306783378 || (i14 & 9363) != 9362 || !startRestartGroup.getSkipping()) {
                                            Modifier modifier3 = i9 != 0 ? Modifier.INSTANCE : modifier;
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-818865501, i6, i14, "org.betup.ui.dialogs.compose.BattleListDetailsScreen (BattleListDetailsScreen.kt:58)");
                                            }
                                            ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                            Object consume = startRestartGroup.consume(localConfiguration);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            boolean z = ((Configuration) consume).screenHeightDp < 740;
                                            float m7774constructorimpl = Dp.m7774constructorimpl(WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getStatusBars(WindowInsets.INSTANCE, startRestartGroup, 6), startRestartGroup, 0).getTop() + Dp.m7774constructorimpl(z ? 4 : 8));
                                            float m7774constructorimpl2 = z ? Dp.m7774constructorimpl(12) : Dp.m7774constructorimpl(16);
                                            float m7774constructorimpl3 = Dp.m7774constructorimpl(z ? 28 : 32);
                                            float m7774constructorimpl4 = Dp.m7774constructorimpl(z ? 12 : 16);
                                            startRestartGroup.startReplaceGroup(-950698421);
                                            if (challengeIds.isEmpty()) {
                                                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                                                startRestartGroup.startReplaceGroup(5004770);
                                                boolean z2 = (57344 & i6) == 16384;
                                                Object rememberedValue = startRestartGroup.rememberedValue();
                                                if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.compose.BattleListDetailsScreenKt$$ExternalSyntheticLambda0
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            Unit BattleListDetailsScreen$lambda$1$lambda$0;
                                                            BattleListDetailsScreen$lambda$1$lambda$0 = BattleListDetailsScreenKt.BattleListDetailsScreen$lambda$1$lambda$0(Function0.this);
                                                            return BattleListDetailsScreen$lambda$1$lambda$0;
                                                        }
                                                    };
                                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                                }
                                                startRestartGroup.endReplaceGroup();
                                                Modifier m1059clickableXHw0xAI$default = ClickableKt.m1059clickableXHw0xAI$default(fillMaxSize$default, false, null, null, (Function0) rememberedValue, 7, null);
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default);
                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                final Modifier modifier4 = modifier3;
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
                                                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.new_close_ic, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_close, startRestartGroup, 6), ClickAnimationModifierKt.clickAnimation(SizeKt.m1563size3ABfNKs(PaddingKt.m1520paddingqDBjuR0$default(BoxScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd()), 0.0f, m7774constructorimpl, m7774constructorimpl2, 0.0f, 9, null), m7774constructorimpl3), onDismiss, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, (i6 >> 9) & 112, 0, 4094), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 120);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                startRestartGroup.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                startRestartGroup.endReplaceGroup();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                                                if (endRestartGroup != null) {
                                                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.BattleListDetailsScreenKt$$ExternalSyntheticLambda1
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(Object obj2, Object obj3) {
                                                            Unit BattleListDetailsScreen$lambda$3;
                                                            BattleListDetailsScreen$lambda$3 = BattleListDetailsScreenKt.BattleListDetailsScreen$lambda$3(challengeIds, j, controller, shareCaptureAnchor, onDismiss, onAcceptChallenge, onDeclineChallenge, onCancelChallenge, onMatchClick, onLeagueClick, onShare, onRematch, onHowBattlesDecided, activity, modifier4, i, i2, i3, (Composer) obj2, ((Integer) obj3).intValue());
                                                            return BattleListDetailsScreen$lambda$3;
                                                        }
                                                    });
                                                    return;
                                                }
                                                return;
                                            }
                                            Modifier modifier5 = modifier3;
                                            startRestartGroup.endReplaceGroup();
                                            final State collectAsState = SnapshotStateKt.collectAsState(controller.isLoading(), null, startRestartGroup, 0, 1);
                                            final State collectAsState2 = SnapshotStateKt.collectAsState(controller.isCancelInProgress(), null, startRestartGroup, 0, 1);
                                            final State collectAsState3 = SnapshotStateKt.collectAsState(controller.getError(), null, startRestartGroup, 0, 1);
                                            final State collectAsState4 = SnapshotStateKt.collectAsState(controller.isBoundState(), null, startRestartGroup, 0, 1);
                                            Iterator<Long> it = challengeIds.iterator();
                                            int i15 = 0;
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    i15 = -1;
                                                    break;
                                                } else if (it.next().longValue() == j) {
                                                    break;
                                                } else {
                                                    i15++;
                                                }
                                            }
                                            int coerceAtLeast = RangesKt.coerceAtLeast(i15, 0);
                                            int i16 = (coerceAtLeast < 0 || coerceAtLeast >= challengeIds.size()) ? 0 : coerceAtLeast;
                                            startRestartGroup.startReplaceGroup(5004770);
                                            boolean changedInstance = startRestartGroup.changedInstance(challengeIds);
                                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                                            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.compose.BattleListDetailsScreenKt$$ExternalSyntheticLambda2
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        int size;
                                                        size = challengeIds.size();
                                                        return Integer.valueOf(size);
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue2);
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            PagerState rememberPagerStateWithoutSavedState = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(i16, 0.0f, (Function0) rememberedValue2, startRestartGroup, 0, 2);
                                            final int currentPage = rememberPagerStateWithoutSavedState.getCurrentPage();
                                            final LazyListState rememberLazyListStateWithoutSavedState = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
                                            startRestartGroup.startReplaceGroup(1849434622);
                                            Object rememberedValue3 = startRestartGroup.rememberedValue();
                                            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.dialogs.compose.BattleListDetailsScreenKt$$ExternalSyntheticLambda3
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        Integer BattleListDetailsScreen$lambda$12$lambda$11;
                                                        BattleListDetailsScreen$lambda$12$lambda$11 = BattleListDetailsScreenKt.BattleListDetailsScreen$lambda$12$lambda$11(LazyListState.this);
                                                        return BattleListDetailsScreen$lambda$12$lambda$11;
                                                    }
                                                });
                                                startRestartGroup.updateRememberedValue(rememberedValue3);
                                            }
                                            final State state = (State) rememberedValue3;
                                            startRestartGroup.endReplaceGroup();
                                            startRestartGroup.startReplaceGroup(1849434622);
                                            Object rememberedValue4 = startRestartGroup.rememberedValue();
                                            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.dialogs.compose.BattleListDetailsScreenKt$$ExternalSyntheticLambda4
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        Integer BattleListDetailsScreen$lambda$15$lambda$14;
                                                        BattleListDetailsScreen$lambda$15$lambda$14 = BattleListDetailsScreenKt.BattleListDetailsScreen$lambda$15$lambda$14(LazyListState.this);
                                                        return BattleListDetailsScreen$lambda$15$lambda$14;
                                                    }
                                                });
                                                startRestartGroup.updateRememberedValue(rememberedValue4);
                                            }
                                            final State state2 = (State) rememberedValue4;
                                            startRestartGroup.endReplaceGroup();
                                            Integer valueOf = Integer.valueOf(challengeIds.size());
                                            Integer valueOf2 = Integer.valueOf(currentPage);
                                            startRestartGroup.startReplaceGroup(-1746271574);
                                            boolean changedInstance2 = startRestartGroup.changedInstance(challengeIds) | startRestartGroup.changed(currentPage) | startRestartGroup.changed(rememberPagerStateWithoutSavedState);
                                            BattleListDetailsScreenKt$BattleListDetailsScreen$4$1 rememberedValue5 = startRestartGroup.rememberedValue();
                                            if (changedInstance2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue5 = new BattleListDetailsScreenKt$BattleListDetailsScreen$4$1(challengeIds, currentPage, rememberPagerStateWithoutSavedState, null);
                                                startRestartGroup.updateRememberedValue(rememberedValue5);
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            EffectsKt.LaunchedEffect(valueOf, valueOf2, (Function2) rememberedValue5, startRestartGroup, 0);
                                            Integer valueOf3 = Integer.valueOf(currentPage);
                                            Object orNull = CollectionsKt.getOrNull(challengeIds, currentPage);
                                            startRestartGroup.startReplaceGroup(-1746271574);
                                            boolean changedInstance3 = startRestartGroup.changedInstance(challengeIds) | startRestartGroup.changed(currentPage) | startRestartGroup.changedInstance(controller);
                                            Object rememberedValue6 = startRestartGroup.rememberedValue();
                                            if (changedInstance3 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                obj = null;
                                                battleListDetailsScreenKt$BattleListDetailsScreen$5$1 = new BattleListDetailsScreenKt$BattleListDetailsScreen$5$1(challengeIds, currentPage, controller, null);
                                                startRestartGroup.updateRememberedValue(battleListDetailsScreenKt$BattleListDetailsScreen$5$1);
                                            } else {
                                                battleListDetailsScreenKt$BattleListDetailsScreen$5$1 = rememberedValue6;
                                                obj = null;
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            EffectsKt.LaunchedEffect(valueOf3, orNull, (Function2) battleListDetailsScreenKt$BattleListDetailsScreen$5$1, startRestartGroup, 0);
                                            Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, obj);
                                            startRestartGroup.startReplaceGroup(1849434622);
                                            Object rememberedValue7 = startRestartGroup.rememberedValue();
                                            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue7 = InteractionSourceKt.MutableInteractionSource();
                                                startRestartGroup.updateRememberedValue(rememberedValue7);
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            Modifier m1057clickableO2vRcR0$default = ClickableKt.m1057clickableO2vRcR0$default(fillMaxSize$default2, (MutableInteractionSource) rememberedValue7, null, false, null, null, onDismiss, 28, null);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1057clickableO2vRcR0$default);
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
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            Modifier fillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default3);
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
                                            PagerKt.m1761HorizontalPager8jOkeI(rememberPagerStateWithoutSavedState, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), null, null, 0, 0.0f, Alignment.INSTANCE.getCenterVertically(), null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(711783712, true, new Function4<PagerScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.compose.BattleListDetailsScreenKt$BattleListDetailsScreen$7$1$1
                                                @Override // kotlin.jvm.functions.Function4
                                                public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer3, Integer num2) {
                                                    invoke(pagerScope, num.intValue(), composer3, num2.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
                                                
                                                    if (r1 == null) goto L18;
                                                 */
                                                /* JADX WARN: Removed duplicated region for block: B:24:0x00ce  */
                                                /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
                                                /*
                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                */
                                                public final void invoke(PagerScope HorizontalPager, int i17, Composer composer3, int i18) {
                                                    boolean z3;
                                                    boolean BattleListDetailsScreen$lambda$5;
                                                    Integer id;
                                                    boolean BattleListDetailsScreen$lambda$7;
                                                    boolean BattleListDetailsScreen$lambda$4;
                                                    String BattleListDetailsScreen$lambda$6;
                                                    Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(711783712, i18, -1, "org.betup.ui.dialogs.compose.BattleListDetailsScreen.<anonymous>.<anonymous>.<anonymous> (BattleListDetailsScreen.kt:131)");
                                                    }
                                                    long longValue = challengeIds.get(i17).longValue();
                                                    boolean z4 = i17 == currentPage;
                                                    NewChallengeDetailsResponseModelP detailsForChallengeId = controller.getDetailsForChallengeId(longValue);
                                                    if (z4) {
                                                        BattleListDetailsScreen$lambda$7 = BattleListDetailsScreenKt.BattleListDetailsScreen$lambda$7(collectAsState4);
                                                        if (BattleListDetailsScreen$lambda$7) {
                                                            BattleListDetailsScreen$lambda$4 = BattleListDetailsScreenKt.BattleListDetailsScreen$lambda$4(collectAsState);
                                                            if (!BattleListDetailsScreen$lambda$4) {
                                                                if (detailsForChallengeId == null) {
                                                                    BattleListDetailsScreen$lambda$6 = BattleListDetailsScreenKt.BattleListDetailsScreen$lambda$6(collectAsState3);
                                                                }
                                                            }
                                                        }
                                                        z3 = true;
                                                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                        OddType oddType = controller.getUserServiceP().getOddType();
                                                        Intrinsics.checkNotNullExpressionValue(oddType, "getOddType(...)");
                                                        BaseUserModel userModel = controller.getUserServiceP().getShortProfile().getUserModel();
                                                        Long valueOf4 = (userModel != null || (id = userModel.getId()) == null) ? null : Long.valueOf(id.intValue());
                                                        BattleListDetailsScreen$lambda$5 = BattleListDetailsScreenKt.BattleListDetailsScreen$lambda$5(collectAsState2);
                                                        ChallengePreviewScreenKt.ChallengePreviewScreen(fillMaxWidth$default, z3, detailsForChallengeId, oddType, valueOf4, onDismiss, onAcceptChallenge, onDeclineChallenge, onCancelChallenge, BattleListDetailsScreen$lambda$5, onMatchClick, onLeagueClick, onShare, onRematch, onHowBattlesDecided, activity, true, shareCaptureAnchor, composer3, 6, 1572864, 0);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            return;
                                                        }
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    z3 = false;
                                                    Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                    OddType oddType2 = controller.getUserServiceP().getOddType();
                                                    Intrinsics.checkNotNullExpressionValue(oddType2, "getOddType(...)");
                                                    BaseUserModel userModel2 = controller.getUserServiceP().getShortProfile().getUserModel();
                                                    if (userModel2 != null) {
                                                    }
                                                    BattleListDetailsScreen$lambda$5 = BattleListDetailsScreenKt.BattleListDetailsScreen$lambda$5(collectAsState2);
                                                    ChallengePreviewScreenKt.ChallengePreviewScreen(fillMaxWidth$default2, z3, detailsForChallengeId, oddType2, valueOf4, onDismiss, onAcceptChallenge, onDeclineChallenge, onCancelChallenge, BattleListDetailsScreen$lambda$5, onMatchClick, onLeagueClick, onShare, onRematch, onHowBattlesDecided, activity, true, shareCaptureAnchor, composer3, 6, 1572864, 0);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                    }
                                                }
                                            }, startRestartGroup, 54), startRestartGroup, 1572864, 24576, 16316);
                                            startRestartGroup.startReplaceGroup(-901522461);
                                            if (challengeIds.size() > 1) {
                                                Modifier m1568width3ABfNKs = SizeKt.m1568width3ABfNKs(PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, m7774constructorimpl4, 7, null), Dp.m7774constructorimpl(80));
                                                Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(8));
                                                startRestartGroup.startReplaceGroup(-1224400529);
                                                boolean changedInstance4 = startRestartGroup.changedInstance(challengeIds) | startRestartGroup.changed(currentPage);
                                                Object rememberedValue8 = startRestartGroup.rememberedValue();
                                                if (changedInstance4 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue8 = new Function1() { // from class: org.betup.ui.dialogs.compose.BattleListDetailsScreenKt$$ExternalSyntheticLambda5
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj2) {
                                                            Unit BattleListDetailsScreen$lambda$23$lambda$22$lambda$21$lambda$20;
                                                            BattleListDetailsScreen$lambda$23$lambda$22$lambda$21$lambda$20 = BattleListDetailsScreenKt.BattleListDetailsScreen$lambda$23$lambda$22$lambda$21$lambda$20(challengeIds, currentPage, state, state2, (LazyListScope) obj2);
                                                            return BattleListDetailsScreen$lambda$23$lambda$22$lambda$21$lambda$20;
                                                        }
                                                    };
                                                    startRestartGroup.updateRememberedValue(rememberedValue8);
                                                }
                                                startRestartGroup.endReplaceGroup();
                                                LazyDslKt.LazyRow(m1568width3ABfNKs, rememberLazyListStateWithoutSavedState, null, false, m1397spacedBy0680j_4, null, null, false, null, (Function1) rememberedValue8, startRestartGroup, 24576, 492);
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            startRestartGroup.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            composer2 = startRestartGroup;
                                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.new_close_ic, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_close, startRestartGroup, 6), ClickAnimationModifierKt.clickAnimation(SizeKt.m1563size3ABfNKs(PaddingKt.m1520paddingqDBjuR0$default(ZIndexModifierKt.zIndex(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd()), 30.0f), 0.0f, m7774constructorimpl, m7774constructorimpl2, 0.0f, 9, null), m7774constructorimpl3), onDismiss, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, (i6 >> 9) & 112, 0, 4094), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 0, 120);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            composer2.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            modifier2 = modifier5;
                                        } else {
                                            startRestartGroup.skipToGroupEnd();
                                            modifier2 = modifier;
                                            composer2 = startRestartGroup;
                                        }
                                        ScopeUpdateScope endRestartGroup2 = composer2.endRestartGroup();
                                        if (endRestartGroup2 != null) {
                                            endRestartGroup2.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.BattleListDetailsScreenKt$$ExternalSyntheticLambda6
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj2, Object obj3) {
                                                    Unit BattleListDetailsScreen$lambda$24;
                                                    BattleListDetailsScreen$lambda$24 = BattleListDetailsScreenKt.BattleListDetailsScreen$lambda$24(challengeIds, j, controller, shareCaptureAnchor, onDismiss, onAcceptChallenge, onDeclineChallenge, onCancelChallenge, onMatchClick, onLeagueClick, onShare, onRematch, onHowBattlesDecided, activity, modifier2, i, i2, i3, (Composer) obj2, ((Integer) obj3).intValue());
                                                    return BattleListDetailsScreen$lambda$24;
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    if ((i6 & 306783379) == 306783378) {
                                    }
                                    if (i9 != 0) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    ProvidableCompositionLocal<Configuration> localConfiguration2 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume2 = startRestartGroup.consume(localConfiguration2);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    if (((Configuration) consume2).screenHeightDp < 740) {
                                    }
                                    float m7774constructorimpl5 = Dp.m7774constructorimpl(WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getStatusBars(WindowInsets.INSTANCE, startRestartGroup, 6), startRestartGroup, 0).getTop() + Dp.m7774constructorimpl(z ? 4 : 8));
                                    float m7774constructorimpl22 = z ? Dp.m7774constructorimpl(12) : Dp.m7774constructorimpl(16);
                                    float m7774constructorimpl32 = Dp.m7774constructorimpl(z ? 28 : 32);
                                    float m7774constructorimpl42 = Dp.m7774constructorimpl(z ? 12 : 16);
                                    startRestartGroup.startReplaceGroup(-950698421);
                                    if (challengeIds.isEmpty()) {
                                    }
                                }
                                i9 = i3 & 16384;
                                if (i9 == 0) {
                                }
                                if ((i6 & 306783379) == 306783378) {
                                }
                                if (i9 != 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                ProvidableCompositionLocal<Configuration> localConfiguration22 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume22 = startRestartGroup.consume(localConfiguration22);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                if (((Configuration) consume22).screenHeightDp < 740) {
                                }
                                float m7774constructorimpl52 = Dp.m7774constructorimpl(WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getStatusBars(WindowInsets.INSTANCE, startRestartGroup, 6), startRestartGroup, 0).getTop() + Dp.m7774constructorimpl(z ? 4 : 8));
                                float m7774constructorimpl222 = z ? Dp.m7774constructorimpl(12) : Dp.m7774constructorimpl(16);
                                float m7774constructorimpl322 = Dp.m7774constructorimpl(z ? 28 : 32);
                                float m7774constructorimpl422 = Dp.m7774constructorimpl(z ? 12 : 16);
                                startRestartGroup.startReplaceGroup(-950698421);
                                if (challengeIds.isEmpty()) {
                                }
                            }
                            if ((i3 & 8192) != 0) {
                            }
                            i9 = i3 & 16384;
                            if (i9 == 0) {
                            }
                            if ((i6 & 306783379) == 306783378) {
                            }
                            if (i9 != 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            ProvidableCompositionLocal<Configuration> localConfiguration222 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume222 = startRestartGroup.consume(localConfiguration222);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            if (((Configuration) consume222).screenHeightDp < 740) {
                            }
                            float m7774constructorimpl522 = Dp.m7774constructorimpl(WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getStatusBars(WindowInsets.INSTANCE, startRestartGroup, 6), startRestartGroup, 0).getTop() + Dp.m7774constructorimpl(z ? 4 : 8));
                            float m7774constructorimpl2222 = z ? Dp.m7774constructorimpl(12) : Dp.m7774constructorimpl(16);
                            float m7774constructorimpl3222 = Dp.m7774constructorimpl(z ? 28 : 32);
                            float m7774constructorimpl4222 = Dp.m7774constructorimpl(z ? 12 : 16);
                            startRestartGroup.startReplaceGroup(-950698421);
                            if (challengeIds.isEmpty()) {
                            }
                        }
                        i4 |= i10;
                        i6 = i4;
                        if ((i3 & 1024) == 0) {
                        }
                        if ((i3 & 2048) == 0) {
                        }
                        int i142 = i8;
                        if ((i3 & 4096) == 0) {
                        }
                        if ((i3 & 8192) != 0) {
                        }
                        i9 = i3 & 16384;
                        if (i9 == 0) {
                        }
                        if ((i6 & 306783379) == 306783378) {
                        }
                        if (i9 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ProvidableCompositionLocal<Configuration> localConfiguration2222 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume2222 = startRestartGroup.consume(localConfiguration2222);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (((Configuration) consume2222).screenHeightDp < 740) {
                        }
                        float m7774constructorimpl5222 = Dp.m7774constructorimpl(WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getStatusBars(WindowInsets.INSTANCE, startRestartGroup, 6), startRestartGroup, 0).getTop() + Dp.m7774constructorimpl(z ? 4 : 8));
                        float m7774constructorimpl22222 = z ? Dp.m7774constructorimpl(12) : Dp.m7774constructorimpl(16);
                        float m7774constructorimpl32222 = Dp.m7774constructorimpl(z ? 28 : 32);
                        float m7774constructorimpl42222 = Dp.m7774constructorimpl(z ? 12 : 16);
                        startRestartGroup.startReplaceGroup(-950698421);
                        if (challengeIds.isEmpty()) {
                        }
                    }
                    i4 |= i11;
                    if ((i3 & 512) == 0) {
                    }
                    i4 |= i10;
                    i6 = i4;
                    if ((i3 & 1024) == 0) {
                    }
                    if ((i3 & 2048) == 0) {
                    }
                    int i1422 = i8;
                    if ((i3 & 4096) == 0) {
                    }
                    if ((i3 & 8192) != 0) {
                    }
                    i9 = i3 & 16384;
                    if (i9 == 0) {
                    }
                    if ((i6 & 306783379) == 306783378) {
                    }
                    if (i9 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ProvidableCompositionLocal<Configuration> localConfiguration22222 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume22222 = startRestartGroup.consume(localConfiguration22222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (((Configuration) consume22222).screenHeightDp < 740) {
                    }
                    float m7774constructorimpl52222 = Dp.m7774constructorimpl(WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getStatusBars(WindowInsets.INSTANCE, startRestartGroup, 6), startRestartGroup, 0).getTop() + Dp.m7774constructorimpl(z ? 4 : 8));
                    float m7774constructorimpl222222 = z ? Dp.m7774constructorimpl(12) : Dp.m7774constructorimpl(16);
                    float m7774constructorimpl322222 = Dp.m7774constructorimpl(z ? 28 : 32);
                    float m7774constructorimpl422222 = Dp.m7774constructorimpl(z ? 12 : 16);
                    startRestartGroup.startReplaceGroup(-950698421);
                    if (challengeIds.isEmpty()) {
                    }
                }
                i4 |= i12;
                if ((i3 & 256) != 0) {
                }
                i4 |= i11;
                if ((i3 & 512) == 0) {
                }
                i4 |= i10;
                i6 = i4;
                if ((i3 & 1024) == 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                int i14222 = i8;
                if ((i3 & 4096) == 0) {
                }
                if ((i3 & 8192) != 0) {
                }
                i9 = i3 & 16384;
                if (i9 == 0) {
                }
                if ((i6 & 306783379) == 306783378) {
                }
                if (i9 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ProvidableCompositionLocal<Configuration> localConfiguration222222 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume222222 = startRestartGroup.consume(localConfiguration222222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (((Configuration) consume222222).screenHeightDp < 740) {
                }
                float m7774constructorimpl522222 = Dp.m7774constructorimpl(WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getStatusBars(WindowInsets.INSTANCE, startRestartGroup, 6), startRestartGroup, 0).getTop() + Dp.m7774constructorimpl(z ? 4 : 8));
                float m7774constructorimpl2222222 = z ? Dp.m7774constructorimpl(12) : Dp.m7774constructorimpl(16);
                float m7774constructorimpl3222222 = Dp.m7774constructorimpl(z ? 28 : 32);
                float m7774constructorimpl4222222 = Dp.m7774constructorimpl(z ? 12 : 16);
                startRestartGroup.startReplaceGroup(-950698421);
                if (challengeIds.isEmpty()) {
                }
            }
            i4 |= i13;
            if ((i3 & 128) == 0) {
            }
            i4 |= i12;
            if ((i3 & 256) != 0) {
            }
            i4 |= i11;
            if ((i3 & 512) == 0) {
            }
            i4 |= i10;
            i6 = i4;
            if ((i3 & 1024) == 0) {
            }
            if ((i3 & 2048) == 0) {
            }
            int i142222 = i8;
            if ((i3 & 4096) == 0) {
            }
            if ((i3 & 8192) != 0) {
            }
            i9 = i3 & 16384;
            if (i9 == 0) {
            }
            if ((i6 & 306783379) == 306783378) {
            }
            if (i9 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<Configuration> localConfiguration2222222 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume2222222 = startRestartGroup.consume(localConfiguration2222222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (((Configuration) consume2222222).screenHeightDp < 740) {
            }
            float m7774constructorimpl5222222 = Dp.m7774constructorimpl(WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getStatusBars(WindowInsets.INSTANCE, startRestartGroup, 6), startRestartGroup, 0).getTop() + Dp.m7774constructorimpl(z ? 4 : 8));
            float m7774constructorimpl22222222 = z ? Dp.m7774constructorimpl(12) : Dp.m7774constructorimpl(16);
            float m7774constructorimpl32222222 = Dp.m7774constructorimpl(z ? 28 : 32);
            float m7774constructorimpl42222222 = Dp.m7774constructorimpl(z ? 12 : 16);
            startRestartGroup.startReplaceGroup(-950698421);
            if (challengeIds.isEmpty()) {
            }
        }
        i4 |= i5;
        if ((i3 & 64) != 0) {
        }
        i4 |= i13;
        if ((i3 & 128) == 0) {
        }
        i4 |= i12;
        if ((i3 & 256) != 0) {
        }
        i4 |= i11;
        if ((i3 & 512) == 0) {
        }
        i4 |= i10;
        i6 = i4;
        if ((i3 & 1024) == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        int i1422222 = i8;
        if ((i3 & 4096) == 0) {
        }
        if ((i3 & 8192) != 0) {
        }
        i9 = i3 & 16384;
        if (i9 == 0) {
        }
        if ((i6 & 306783379) == 306783378) {
        }
        if (i9 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Configuration> localConfiguration22222222 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume22222222 = startRestartGroup.consume(localConfiguration22222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (((Configuration) consume22222222).screenHeightDp < 740) {
        }
        float m7774constructorimpl52222222 = Dp.m7774constructorimpl(WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getStatusBars(WindowInsets.INSTANCE, startRestartGroup, 6), startRestartGroup, 0).getTop() + Dp.m7774constructorimpl(z ? 4 : 8));
        float m7774constructorimpl222222222 = z ? Dp.m7774constructorimpl(12) : Dp.m7774constructorimpl(16);
        float m7774constructorimpl322222222 = Dp.m7774constructorimpl(z ? 28 : 32);
        float m7774constructorimpl422222222 = Dp.m7774constructorimpl(z ? 12 : 16);
        startRestartGroup.startReplaceGroup(-950698421);
        if (challengeIds.isEmpty()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleListDetailsScreen$lambda$1$lambda$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer BattleListDetailsScreen$lambda$12$lambda$11(LazyListState lazyListState) {
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.firstOrNull((List) lazyListState.getLayoutInfo().getVisibleItemsInfo());
        if (lazyListItemInfo != null) {
            return Integer.valueOf(lazyListItemInfo.getIndex());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer BattleListDetailsScreen$lambda$15$lambda$14(LazyListState lazyListState) {
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.lastOrNull((List) lazyListState.getLayoutInfo().getVisibleItemsInfo());
        if (lazyListItemInfo != null) {
            return Integer.valueOf(lazyListItemInfo.getIndex());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleListDetailsScreen$lambda$23$lambda$22$lambda$21$lambda$20(List list, final int i, final State state, final State state2, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        LazyListScope.items$default(LazyRow, list.size(), null, null, ComposableLambdaKt.composableLambdaInstance(1596325710, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.compose.BattleListDetailsScreenKt$BattleListDetailsScreen$7$1$2$1$1
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Code restructure failed: missing block: B:32:0x0045, code lost:
            
                r9 = org.betup.ui.dialogs.compose.BattleListDetailsScreenKt.BattleListDetailsScreen$lambda$16(r3);
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke(LazyItemScope items, int i2, Composer composer, int i3) {
                Integer BattleListDetailsScreen$lambda$13;
                Integer BattleListDetailsScreen$lambda$16;
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((i3 & 48) == 0) {
                    i3 |= composer.changed(i2) ? 32 : 16;
                }
                if ((i3 & Opcodes.I2B) == 144 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1596325710, i3, -1, "org.betup.ui.dialogs.compose.BattleListDetailsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BattleListDetailsScreen.kt:169)");
                }
                BattleListDetailsScreen$lambda$13 = BattleListDetailsScreenKt.BattleListDetailsScreen$lambda$13(state);
                float f = ((BattleListDetailsScreen$lambda$13 != null && i2 == BattleListDetailsScreen$lambda$13.intValue()) || (BattleListDetailsScreen$lambda$16 != null && i2 == BattleListDetailsScreen$lambda$16.intValue())) ? 0.3f : 1.0f;
                BoxKt.Box(BackgroundKt.m1024backgroundbw27NRU(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(10)), i2 == i ? ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor() : Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor(), f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100))), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BattleListDetailsScreen$lambda$4(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BattleListDetailsScreen$lambda$5(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String BattleListDetailsScreen$lambda$6(State<String> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BattleListDetailsScreen$lambda$7(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer BattleListDetailsScreen$lambda$13(State<Integer> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer BattleListDetailsScreen$lambda$16(State<Integer> state) {
        return state.getValue();
    }
}
