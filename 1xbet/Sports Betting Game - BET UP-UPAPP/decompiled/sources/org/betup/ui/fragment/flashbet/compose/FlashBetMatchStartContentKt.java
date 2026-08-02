package org.betup.ui.fragment.flashbet.compose;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
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
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import coil3.compose.SingletonAsyncImageKt;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.extractor.text.ttml.TtmlNode;
import io.sentry.SentryReplayEvent;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.R;
import org.betup.games.flashbet.model.FlashBetGameMatchTeamDetailsDto;
import org.betup.games.flashbet.model.FlashBetGameSessionDto;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.betup.ui.common.compose.ClickAnimationModifierKt;
import org.betup.ui.common.compose.CommonButtonKt;
import org.betup.ui.common.compose.MatchLeagueItemKt;
import org.betup.ui.common.compose.PagerStateNoSaveKt;
import org.betup.ui.fragment.flashbet.FlashBetUiSoundEffect;
import org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartUiState;
import org.betup.ui.fragment.flashbet.controller.FlashBetMatchStartController;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.UiExtensionsKt;
import org.modelmapper.internal.asm.Opcodes;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;

/* compiled from: FlashBetMatchStartContent.kt */
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u000e\u0010\u0000\u001a\u00020\u0001H\u0082@¢\u0006\u0002\u0010\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000\u001a\u0087\u0001\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\u0018\b\u0002\u0010\u0013\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00142\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010\u0018\u001a\u001b\u0010\u0019\u001a\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0003¢\u0006\u0002\u0010\u001a\u001a#\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0003¢\u0006\u0002\u0010\u001d\u001a\u001b\u0010\u001e\u001a\u00020\u00012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0 H\u0003¢\u0006\u0002\u0010!\u001aS\u0010)\u001a\u00020\u00012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0 2\u0006\u0010+\u001a\u00020%2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\u0006\u0010-\u001a\u00020\r2\u0006\u0010.\u001a\u00020%2\u0006\u0010/\u001a\u00020\r2\b\b\u0002\u00100\u001a\u000201H\u0003¢\u0006\u0002\u00102\u001a'\u00103\u001a\u00020\u00012\u0006\u00104\u001a\u00020\b2\u0006\u00105\u001a\u00020\b2\u0006\u00106\u001a\u000207H\u0003¢\u0006\u0004\b8\u00109\u001a\r\u0010:\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010;\u001a\r\u0010<\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010;\"\u000e\u0010\"\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020%X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020%X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010'\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010(\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000¨\u0006=²\u0006\n\u0010>\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\u0010\u0010?\u001a\b\u0012\u0004\u0012\u00020\b0 X\u008a\u0084\u0002²\u0006\u0010\u0010@\u001a\b\u0012\u0004\u0012\u00020\b0 X\u008a\u0084\u0002²\u0006\n\u0010A\u001a\u00020\u0004X\u008a\u008e\u0002²\u0006\n\u0010B\u001a\u00020\u0004X\u008a\u008e\u0002"}, d2 = {"deferToNextLayoutFrame", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isSessionCommitted", "", "Lorg/betup/ui/fragment/flashbet/compose/FlashBetMatchStartUiState;", "FlashBetMatchStartContent", GetRandomTeamImagesInteractor.KEY_SPORT_ID, "", "categoryName", "categoryPhotoUrl", "categoryLogoUrl", "entryFee", "", "controller", "Lorg/betup/ui/fragment/flashbet/controller/FlashBetMatchStartController;", "onBackClick", "Lkotlin/Function0;", "onStartClick", "onGameStarted", "Lkotlin/Function1;", "Lorg/betup/games/flashbet/model/FlashBetGameSessionDto;", "uiStateOverride", "Lkotlinx/coroutines/flow/StateFlow;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLorg/betup/ui/fragment/flashbet/controller/FlashBetMatchStartController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/flow/StateFlow;Landroidx/compose/runtime/Composer;II)V", "FlashBetNoMatchesInCategoryContent", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "FlashBetStartErrorContent", "message", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "PreloadCarouselImages", SentryReplayEvent.JsonKeys.URLS, "", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "REVEAL_SPIN_MS_TEAM1", "REVEAL_SPIN_MS_TEAM2", "REVEAL_CYCLES_TEAM1", "", "REVEAL_CYCLES_TEAM2", "REVEAL_INITIAL_DELAY_TEAM1", "REVEAL_INITIAL_DELAY_TEAM2", "TeamRevealCarousel", "imageUrls", "targetStopIndex", "onStopped", "spinMsPerPage", "cycles", "initialDelayMs", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;ILkotlin/jvm/functions/Function0;JIJLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PrizeRow", "left", TtmlNode.RIGHT, "rightColor", "Landroidx/compose/ui/graphics/Color;", "PrizeRow-XO-JAsU", "(Ljava/lang/String;Ljava/lang/String;JLandroidx/compose/runtime/Composer;I)V", "PreviewFlashBetMatchStartContentFootball", "(Landroidx/compose/runtime/Composer;I)V", "PreviewFlashBetMatchStartContentHighEntry", "app_release", "uiState", "randomTeamImageUrlsTeam1", "randomTeamImageUrlsTeam2", "team1RevealStopped", "team2RevealStopped"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashBetMatchStartContentKt {
    private static final int REVEAL_CYCLES_TEAM1 = 1;
    private static final int REVEAL_CYCLES_TEAM2 = 1;
    private static final long REVEAL_INITIAL_DELAY_TEAM1 = 0;
    private static final long REVEAL_INITIAL_DELAY_TEAM2 = 40;
    private static final long REVEAL_SPIN_MS_TEAM1 = 6;
    private static final long REVEAL_SPIN_MS_TEAM2 = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetMatchStartContent$lambda$51(String str, String str2, String str3, String str4, long j, FlashBetMatchStartController flashBetMatchStartController, Function0 function0, Function0 function02, Function1 function1, StateFlow stateFlow, int i, int i2, Composer composer, int i3) {
        FlashBetMatchStartContent(str, str2, str3, str4, j, flashBetMatchStartController, function0, function02, function1, stateFlow, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetNoMatchesInCategoryContent$lambda$53(Function0 function0, int i, Composer composer, int i2) {
        FlashBetNoMatchesInCategoryContent(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetStartErrorContent$lambda$55(String str, Function0 function0, int i, Composer composer, int i2) {
        FlashBetStartErrorContent(str, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreloadCarouselImages$lambda$56(List list, int i, Composer composer, int i2) {
        PreloadCarouselImages(list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreloadCarouselImages$lambda$61(List list, int i, Composer composer, int i2) {
        PreloadCarouselImages(list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewFlashBetMatchStartContentFootball$lambda$75(int i, Composer composer, int i2) {
        PreviewFlashBetMatchStartContentFootball(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewFlashBetMatchStartContentHighEntry$lambda$81(int i, Composer composer, int i2) {
        PreviewFlashBetMatchStartContentHighEntry(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrizeRow_XO_JAsU$lambda$69(String str, String str2, long j, int i, Composer composer, int i2) {
        m13721PrizeRowXOJAsU(str, str2, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TeamRevealCarousel$lambda$62(List list, int i, Function0 function0, long j, int i2, long j2, Modifier modifier, int i3, int i4, Composer composer, int i5) {
        TeamRevealCarousel(list, i, function0, j, i2, j2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int TeamRevealCarousel$lambda$64$lambda$63(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TeamRevealCarousel$lambda$66(List list, int i, Function0 function0, long j, int i2, long j2, Modifier modifier, int i3, int i4, Composer composer, int i5) {
        TeamRevealCarousel(list, i, function0, j, i2, j2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object deferToNextLayoutFrame(Continuation<? super Unit> continuation) {
        Object withFrameNanos = MonotonicFrameClockKt.withFrameNanos(new Function1() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit deferToNextLayoutFrame$lambda$0;
                deferToNextLayoutFrame$lambda$0 = FlashBetMatchStartContentKt.deferToNextLayoutFrame$lambda$0(((Long) obj).longValue());
                return deferToNextLayoutFrame$lambda$0;
            }
        }, continuation);
        return withFrameNanos == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withFrameNanos : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deferToNextLayoutFrame$lambda$0(long j) {
        return Unit.INSTANCE;
    }

    public static final boolean isSessionCommitted(FlashBetMatchStartUiState flashBetMatchStartUiState) {
        Intrinsics.checkNotNullParameter(flashBetMatchStartUiState, "<this>");
        return Intrinsics.areEqual(flashBetMatchStartUiState, FlashBetMatchStartUiState.Loading.INSTANCE) || (flashBetMatchStartUiState instanceof FlashBetMatchStartUiState.StartSuccess);
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x05b3, code lost:
    
        if (r4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x07e8, code lost:
    
        if (r5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01a1, code lost:
    
        if (r4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L122;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x07e2  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0837  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x1744  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x08f0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x1751  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:464:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0314  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FlashBetMatchStartContent(final String sportId, final String categoryName, final String categoryPhotoUrl, final String categoryLogoUrl, final long j, final FlashBetMatchStartController flashBetMatchStartController, final Function0<Unit> onBackClick, final Function0<Unit> onStartClick, Function1<? super FlashBetGameSessionDto, Unit> function1, StateFlow<? extends FlashBetMatchStartUiState> stateFlow, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        Function1<? super FlashBetGameSessionDto, Unit> function12;
        int i6;
        int i7;
        StateFlow<? extends FlashBetMatchStartUiState> stateFlow2;
        boolean changedInstance;
        Object obj;
        boolean changedInstance2;
        int i8;
        FlashBetMatchStartContentKt$FlashBetMatchStartContent$1$1 flashBetMatchStartContentKt$FlashBetMatchStartContent$1$1;
        StateFlow<? extends FlashBetMatchStartUiState> stateFlow3;
        State collectAsState;
        StateFlow<List<String>> randomTeamImageUrlsTeam1;
        StateFlow<List<String>> randomTeamImageUrlsTeam2;
        boolean changedInstance3;
        FlashBetMatchStartContentKt$FlashBetMatchStartContent$2$1 rememberedValue;
        SnapshotMutationPolicy snapshotMutationPolicy;
        boolean changed;
        Object rememberedValue2;
        FlashBetGameSessionDto flashBetGameSessionDto;
        Object rememberedValue3;
        final MutableState mutableState;
        Object rememberedValue4;
        final MutableState mutableState2;
        boolean changed2;
        Object rememberedValue5;
        boolean z;
        int i9;
        boolean changed3;
        FlashBetMatchStartContentKt$FlashBetMatchStartContent$4$1 rememberedValue6;
        boolean changedInstance4;
        FlashBetMatchStartContentKt$FlashBetMatchStartContent$5$1 rememberedValue7;
        boolean changedInstance5;
        FlashBetMatchStartContentKt$FlashBetMatchStartContent$6$1 rememberedValue8;
        boolean changedInstance6;
        Object obj2;
        List list;
        List list2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        boolean changed4;
        Object obj3;
        String str;
        Composer composer2;
        FlashBetMatchStartUiState FlashBetMatchStartContent$lambda$4;
        int i10;
        boolean z2;
        int i11;
        final StateFlow<? extends FlashBetMatchStartUiState> stateFlow4;
        final Function1<? super FlashBetGameSessionDto, Unit> function13;
        ScopeUpdateScope endRestartGroup;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(sportId, "sportId");
        Intrinsics.checkNotNullParameter(categoryName, "categoryName");
        Intrinsics.checkNotNullParameter(categoryPhotoUrl, "categoryPhotoUrl");
        Intrinsics.checkNotNullParameter(categoryLogoUrl, "categoryLogoUrl");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(onStartClick, "onStartClick");
        Composer startRestartGroup = composer.startRestartGroup(1974877629);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(sportId) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(categoryName) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(categoryPhotoUrl) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(categoryLogoUrl) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(j) ? 16384 : 8192;
            if ((i2 & 32) == 0) {
                i4 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else {
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 = startRestartGroup.changedInstance(flashBetMatchStartController) ? 131072 : 65536;
                }
                if ((i2 & 64) == 0) {
                    i13 = (i & 1572864) == 0 ? startRestartGroup.changedInstance(onBackClick) ? 1048576 : 524288 : 1572864;
                    if ((i2 & 128) != 0) {
                        i12 = (12582912 & i) == 0 ? startRestartGroup.changedInstance(onStartClick) ? 8388608 : 4194304 : 12582912;
                        i5 = i2 & 256;
                        if (i5 != 0) {
                            i3 |= 100663296;
                            function12 = function1;
                        } else {
                            function12 = function1;
                            if ((i & 100663296) == 0) {
                                i3 |= startRestartGroup.changedInstance(function12) ? 67108864 : 33554432;
                            }
                        }
                        i6 = i2 & 512;
                        if (i6 != 0) {
                            i3 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i3 |= startRestartGroup.changedInstance(stateFlow) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                        }
                        i7 = i3;
                        if ((306783379 & i7) == 306783378 || !startRestartGroup.getSkipping()) {
                            if (i5 != 0) {
                                function12 = null;
                            }
                            stateFlow2 = i6 != 0 ? null : stateFlow;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1974877629, i7, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContent (FlashBetMatchStartContent.kt:93)");
                            }
                            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(localContext);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final Context applicationContext = ((Context) consume).getApplicationContext();
                            startRestartGroup.startReplaceGroup(5004770);
                            changedInstance = startRestartGroup.changedInstance(applicationContext);
                            Object rememberedValue9 = startRestartGroup.rememberedValue();
                            if (!changedInstance) {
                                obj = rememberedValue9;
                            }
                            Function0 function0 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit FlashBetMatchStartContent$lambda$2$lambda$1;
                                    FlashBetMatchStartContent$lambda$2$lambda$1 = FlashBetMatchStartContentKt.FlashBetMatchStartContent$lambda$2$lambda$1(applicationContext);
                                    return FlashBetMatchStartContent$lambda$2$lambda$1;
                                }
                            };
                            startRestartGroup.updateRememberedValue(function0);
                            obj = function0;
                            final Function0 function02 = (Function0) obj;
                            startRestartGroup.endReplaceGroup();
                            Unit unit = Unit.INSTANCE;
                            startRestartGroup.startReplaceGroup(5004770);
                            changedInstance2 = startRestartGroup.changedInstance(applicationContext);
                            Object rememberedValue10 = startRestartGroup.rememberedValue();
                            if (changedInstance2) {
                                i8 = i7;
                            } else {
                                i8 = i7;
                                if (rememberedValue10 != Composer.INSTANCE.getEmpty()) {
                                    flashBetMatchStartContentKt$FlashBetMatchStartContent$1$1 = rememberedValue10;
                                    startRestartGroup.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) flashBetMatchStartContentKt$FlashBetMatchStartContent$1$1, startRestartGroup, 6);
                                    if (stateFlow2 != null) {
                                        Intrinsics.checkNotNull(flashBetMatchStartController);
                                        stateFlow3 = flashBetMatchStartController.getUiState();
                                    } else {
                                        stateFlow3 = stateFlow2;
                                    }
                                    int i14 = i8;
                                    Function1<? super FlashBetGameSessionDto, Unit> function14 = function12;
                                    collectAsState = SnapshotStateKt.collectAsState(stateFlow3, FlashBetMatchStartUiState.Idle.INSTANCE, null, startRestartGroup, 48, 2);
                                    randomTeamImageUrlsTeam1 = flashBetMatchStartController == null ? flashBetMatchStartController.getRandomTeamImageUrlsTeam1() : null;
                                    startRestartGroup.startReplaceGroup(-518116505);
                                    if (randomTeamImageUrlsTeam1 == null) {
                                        startRestartGroup.startReplaceGroup(1849434622);
                                        Object rememberedValue11 = startRestartGroup.rememberedValue();
                                        Object obj4 = rememberedValue11;
                                        if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                            Object asStateFlow = FlowKt.asStateFlow(StateFlowKt.MutableStateFlow(CollectionsKt.emptyList()));
                                            startRestartGroup.updateRememberedValue(asStateFlow);
                                            obj4 = asStateFlow;
                                        }
                                        randomTeamImageUrlsTeam1 = (StateFlow) obj4;
                                        startRestartGroup.endReplaceGroup();
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    randomTeamImageUrlsTeam2 = flashBetMatchStartController == null ? flashBetMatchStartController.getRandomTeamImageUrlsTeam2() : null;
                                    startRestartGroup.startReplaceGroup(-518111289);
                                    if (randomTeamImageUrlsTeam2 == null) {
                                        startRestartGroup.startReplaceGroup(1849434622);
                                        Object rememberedValue12 = startRestartGroup.rememberedValue();
                                        if (rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue12 = FlowKt.asStateFlow(StateFlowKt.MutableStateFlow(CollectionsKt.emptyList()));
                                            startRestartGroup.updateRememberedValue(rememberedValue12);
                                        }
                                        randomTeamImageUrlsTeam2 = (StateFlow) rememberedValue12;
                                        startRestartGroup.endReplaceGroup();
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    State collectAsState2 = SnapshotStateKt.collectAsState(randomTeamImageUrlsTeam1, CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
                                    State collectAsState3 = SnapshotStateKt.collectAsState(randomTeamImageUrlsTeam2, CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
                                    long j2 = ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor();
                                    Integer intOrNull = StringsKt.toIntOrNull(sportId);
                                    int intValue = intOrNull == null ? intOrNull.intValue() : 0;
                                    startRestartGroup.startReplaceGroup(-1633490746);
                                    changedInstance3 = startRestartGroup.changedInstance(flashBetMatchStartController) | ((i14 & 14) != 4);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!changedInstance3 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        snapshotMutationPolicy = null;
                                        rememberedValue = new FlashBetMatchStartContentKt$FlashBetMatchStartContent$2$1(flashBetMatchStartController, sportId, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    } else {
                                        snapshotMutationPolicy = null;
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    int i15 = i14 << 3;
                                    EffectsKt.LaunchedEffect(flashBetMatchStartController, sportId, (Function2) rememberedValue, startRestartGroup, ((i14 >> 15) & 14) | (i15 & 112));
                                    FlashBetMatchStartUiState FlashBetMatchStartContent$lambda$42 = FlashBetMatchStartContent$lambda$4(collectAsState);
                                    startRestartGroup.startReplaceGroup(5004770);
                                    changed = startRestartGroup.changed(FlashBetMatchStartContent$lambda$42);
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (!changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        FlashBetMatchStartUiState FlashBetMatchStartContent$lambda$43 = FlashBetMatchStartContent$lambda$4(collectAsState);
                                        FlashBetMatchStartUiState.StartSuccess startSuccess = !(FlashBetMatchStartContent$lambda$43 instanceof FlashBetMatchStartUiState.StartSuccess) ? (FlashBetMatchStartUiState.StartSuccess) FlashBetMatchStartContent$lambda$43 : snapshotMutationPolicy;
                                        rememberedValue2 = startSuccess == 0 ? startSuccess.getSession() : snapshotMutationPolicy;
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    flashBetGameSessionDto = (FlashBetGameSessionDto) rememberedValue2;
                                    startRestartGroup.endReplaceGroup();
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (rememberedValue3 != Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    }
                                    mutableState = (MutableState) rememberedValue3;
                                    startRestartGroup.endReplaceGroup();
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    rememberedValue4 = startRestartGroup.rememberedValue();
                                    if (rememberedValue4 != Composer.INSTANCE.getEmpty()) {
                                        MutableState mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                                        startRestartGroup.updateRememberedValue(mutableStateOf$default);
                                        rememberedValue4 = mutableStateOf$default;
                                    }
                                    mutableState2 = (MutableState) rememberedValue4;
                                    startRestartGroup.endReplaceGroup();
                                    List<String> FlashBetMatchStartContent$lambda$7 = FlashBetMatchStartContent$lambda$7(collectAsState2);
                                    List<String> FlashBetMatchStartContent$lambda$8 = FlashBetMatchStartContent$lambda$8(collectAsState3);
                                    startRestartGroup.startReplaceGroup(-1746271574);
                                    changed2 = startRestartGroup.changed(FlashBetMatchStartContent$lambda$7) | startRestartGroup.changed(flashBetGameSessionDto) | startRestartGroup.changed(FlashBetMatchStartContent$lambda$8);
                                    rememberedValue5 = startRestartGroup.rememberedValue();
                                    if (!changed2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        if ((flashBetGameSessionDto == null ? flashBetGameSessionDto.getTeamDetails() : null) != null) {
                                            rememberedValue5 = new Pair(new Pair(CollectionsKt.emptyList(), 0), new Pair(CollectionsKt.emptyList(), 0));
                                            z = true;
                                        } else {
                                            FlashBetGameMatchTeamDetailsDto teamDetails = flashBetGameSessionDto.getTeamDetails();
                                            Intrinsics.checkNotNull(teamDetails);
                                            String homeTeamLogoUrl = teamDetails.getHomeTeamLogoUrl();
                                            FlashBetGameMatchTeamDetailsDto teamDetails2 = flashBetGameSessionDto.getTeamDetails();
                                            Intrinsics.checkNotNull(teamDetails2);
                                            String awayTeamLogoUrl = teamDetails2.getAwayTeamLogoUrl();
                                            List createListBuilder = CollectionsKt.createListBuilder();
                                            createListBuilder.addAll(FlashBetMatchStartContent$lambda$7(collectAsState2));
                                            String str2 = homeTeamLogoUrl;
                                            if (!StringsKt.isBlank(str2)) {
                                                createListBuilder.add(homeTeamLogoUrl);
                                            }
                                            List build = CollectionsKt.build(createListBuilder);
                                            List createListBuilder2 = CollectionsKt.createListBuilder();
                                            createListBuilder2.addAll(FlashBetMatchStartContent$lambda$8(collectAsState3));
                                            String str3 = awayTeamLogoUrl;
                                            if (!StringsKt.isBlank(str3)) {
                                                createListBuilder2.add(awayTeamLogoUrl);
                                            }
                                            List build2 = CollectionsKt.build(createListBuilder2);
                                            if (StringsKt.isBlank(str2)) {
                                                z = true;
                                                i9 = 0;
                                            } else {
                                                z = true;
                                                i9 = build.size() - 1;
                                            }
                                            rememberedValue5 = new Pair(new Pair(build, Integer.valueOf(i9)), new Pair(build2, Integer.valueOf(!StringsKt.isBlank(str3) ? build2.size() - 1 : 0)));
                                        }
                                        startRestartGroup.updateRememberedValue(rememberedValue5);
                                    } else {
                                        z = true;
                                    }
                                    Pair pair = (Pair) rememberedValue5;
                                    startRestartGroup.endReplaceGroup();
                                    Pair pair2 = (Pair) pair.component1();
                                    Pair pair3 = (Pair) pair.component2();
                                    List list3 = (List) pair2.getFirst();
                                    int intValue2 = ((Number) pair2.getSecond()).intValue();
                                    List list4 = (List) pair3.getFirst();
                                    int intValue3 = ((Number) pair3.getSecond()).intValue();
                                    FlashBetMatchStartUiState FlashBetMatchStartContent$lambda$44 = FlashBetMatchStartContent$lambda$4(collectAsState);
                                    startRestartGroup.startReplaceGroup(-1633490746);
                                    int i16 = i14 & 234881024;
                                    changed3 = startRestartGroup.changed(collectAsState) | (i16 != 67108864 ? z : false);
                                    rememberedValue6 = startRestartGroup.rememberedValue();
                                    if (!changed3 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue6 = new FlashBetMatchStartContentKt$FlashBetMatchStartContent$4$1(function14, collectAsState, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue6);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(FlashBetMatchStartContent$lambda$44, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, startRestartGroup, 0);
                                    startRestartGroup.startReplaceGroup(-1746271574);
                                    changedInstance4 = startRestartGroup.changedInstance(flashBetGameSessionDto);
                                    rememberedValue7 = startRestartGroup.rememberedValue();
                                    if (!changedInstance4 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue7 = new FlashBetMatchStartContentKt$FlashBetMatchStartContent$5$1(flashBetGameSessionDto, mutableState, mutableState2, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue7);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(flashBetGameSessionDto, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue7, startRestartGroup, 0);
                                    Boolean valueOf = Boolean.valueOf(FlashBetMatchStartContent$lambda$12(mutableState));
                                    Boolean valueOf2 = Boolean.valueOf(FlashBetMatchStartContent$lambda$15(mutableState2));
                                    startRestartGroup.startReplaceGroup(-1224400529);
                                    changedInstance5 = startRestartGroup.changedInstance(flashBetGameSessionDto) | (i16 != 67108864 ? z : false);
                                    rememberedValue8 = startRestartGroup.rememberedValue();
                                    if (!changedInstance5 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue8 = new FlashBetMatchStartContentKt$FlashBetMatchStartContent$6$1(flashBetGameSessionDto, function14, mutableState, mutableState2, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue8);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    boolean z3 = z;
                                    EffectsKt.LaunchedEffect(valueOf, valueOf2, flashBetGameSessionDto, (Function2) rememberedValue8, startRestartGroup, 0);
                                    startRestartGroup.startReplaceGroup(-1224400529);
                                    changedInstance6 = startRestartGroup.changedInstance(flashBetGameSessionDto) | startRestartGroup.changedInstance(list3) | startRestartGroup.changedInstance(list4) | (i16 != 67108864 ? z3 ? 1 : 0 : false);
                                    Object rememberedValue13 = startRestartGroup.rememberedValue();
                                    if (!changedInstance6) {
                                        obj2 = rememberedValue13;
                                    }
                                    FlashBetMatchStartContentKt$FlashBetMatchStartContent$7$1 flashBetMatchStartContentKt$FlashBetMatchStartContent$7$1 = new FlashBetMatchStartContentKt$FlashBetMatchStartContent$7$1(flashBetGameSessionDto, list3, list4, function14, null);
                                    startRestartGroup.updateRememberedValue(flashBetMatchStartContentKt$FlashBetMatchStartContent$7$1);
                                    obj2 = flashBetMatchStartContentKt$FlashBetMatchStartContent$7$1;
                                    startRestartGroup.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(flashBetGameSessionDto, list3, list4, (Function2) obj2, startRestartGroup, 0);
                                    boolean z4 = flashBetGameSessionDto == null ? z3 ? 1 : 0 : false;
                                    PreloadCarouselImages(FlashBetMatchStartContent$lambda$7(collectAsState2), startRestartGroup, 0);
                                    PreloadCarouselImages(FlashBetMatchStartContent$lambda$8(collectAsState3), startRestartGroup, 0);
                                    startRestartGroup.startReplaceGroup(-518012912);
                                    list = list3;
                                    if (!list.isEmpty()) {
                                        PreloadCarouselImages(list3, startRestartGroup, 0);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    startRestartGroup.startReplaceGroup(-518010096);
                                    list2 = list4;
                                    if (!list2.isEmpty()) {
                                        PreloadCarouselImages(list4, startRestartGroup, 0);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    float f = 12;
                                    Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, z3 ? 1 : 0, null), ScrollKt.rememberScrollState(0, startRestartGroup, 0, z3 ? 1 : 0), false, null, false, 14, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(f));
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4);
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
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, z3 ? 1 : 0, null);
                                    Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 54);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                                    Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.arrow_light_left, startRestartGroup, 6);
                                    float f2 = 24;
                                    Modifier m1563size3ABfNKs = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2));
                                    startRestartGroup.startReplaceGroup(-1633490746);
                                    int i17 = i14 & 3670016;
                                    changed4 = startRestartGroup.changed(function02) | (i17 != 1048576);
                                    Object rememberedValue14 = startRestartGroup.rememberedValue();
                                    if (!changed4) {
                                        obj3 = rememberedValue14;
                                    }
                                    Function0 function03 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit FlashBetMatchStartContent$lambda$50$lambda$27$lambda$25$lambda$24;
                                            FlashBetMatchStartContent$lambda$50$lambda$27$lambda$25$lambda$24 = FlashBetMatchStartContentKt.FlashBetMatchStartContent$lambda$50$lambda$27$lambda$25$lambda$24(Function0.this, onBackClick);
                                            return FlashBetMatchStartContent$lambda$50$lambda$27$lambda$25$lambda$24;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(function03);
                                    obj3 = function03;
                                    startRestartGroup.endReplaceGroup();
                                    ImageKt.Image(painterResource, "back", ClickAnimationModifierKt.clickAnimation(m1563size3ABfNKs, (Function0) obj3, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 6, 0, 4094), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
                                    str = categoryLogoUrl;
                                    if (str.length() == 0) {
                                        str = categoryPhotoUrl;
                                    }
                                    int i18 = i15 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH;
                                    composer2 = startRestartGroup;
                                    MatchLeagueItemKt.MatchLeagueItem(null, str, categoryName, false, false, false, null, composer2, i18, 121);
                                    SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), composer2, 6);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    float f3 = 8;
                                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3)), composer2, 6);
                                    FlashBetMatchStartContent$lambda$4 = FlashBetMatchStartContent$lambda$4(collectAsState);
                                    if (FlashBetMatchStartContent$lambda$4 instanceof FlashBetMatchStartUiState.NoAvailableMatches) {
                                        if (FlashBetMatchStartContent$lambda$4 instanceof FlashBetMatchStartUiState.Error) {
                                            composer2.startReplaceGroup(512122090);
                                            FlashBetMatchStartUiState FlashBetMatchStartContent$lambda$45 = FlashBetMatchStartContent$lambda$4(collectAsState);
                                            Intrinsics.checkNotNull(FlashBetMatchStartContent$lambda$45, "null cannot be cast to non-null type org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartUiState.Error");
                                            String message = ((FlashBetMatchStartUiState.Error) FlashBetMatchStartContent$lambda$45).getMessage();
                                            composer2.startReplaceGroup(-1633490746);
                                            boolean changed5 = composer2.changed(function02) | (i17 == 1048576);
                                            Object rememberedValue15 = composer2.rememberedValue();
                                            if (changed5 || rememberedValue15 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue15 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$$ExternalSyntheticLambda5
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        Unit FlashBetMatchStartContent$lambda$50$lambda$31$lambda$30;
                                                        FlashBetMatchStartContent$lambda$50$lambda$31$lambda$30 = FlashBetMatchStartContentKt.FlashBetMatchStartContent$lambda$50$lambda$31$lambda$30(Function0.this, onBackClick);
                                                        return FlashBetMatchStartContent$lambda$50$lambda$31$lambda$30;
                                                    }
                                                };
                                                composer2.updateRememberedValue(rememberedValue15);
                                            }
                                            composer2.endReplaceGroup();
                                            FlashBetStartErrorContent(message, (Function0) rememberedValue15, composer2, 0);
                                            composer2.endReplaceGroup();
                                        } else {
                                            composer2.startReplaceGroup(512796960);
                                            float f4 = 1;
                                            Modifier m1038borderziNgDLE = BorderKt.m1038borderziNgDLE(BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(6), 7, null), j2, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f3))), Dp.m7774constructorimpl(f4), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f3)));
                                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, m1038borderziNgDLE);
                                            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor3);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer m4610constructorimpl3 = Updater.m4610constructorimpl(composer2);
                                            Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                            }
                                            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, companion);
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
                                            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer2, companion2);
                                            Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor5);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer m4610constructorimpl5 = Updater.m4610constructorimpl(composer2);
                                            Updater.m4617setimpl(m4610constructorimpl5, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                                m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                                m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                            }
                                            Updater.m4617setimpl(m4610constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                            Modifier m1038borderziNgDLE2 = BorderKt.m1038borderziNgDLE(BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(14), Dp.m7774constructorimpl(f), 0.0f, 8, null), j2, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f3))), Dp.m7774constructorimpl(f4), ComposeUtils.AppBrushPalette.BorderGoldTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f3)));
                                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(composer2, m1038borderziNgDLE2);
                                            Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor6);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer m4610constructorimpl6 = Updater.m4610constructorimpl(composer2);
                                            Updater.m4617setimpl(m4610constructorimpl6, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m4610constructorimpl6.getInserting() || !Intrinsics.areEqual(m4610constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                                m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                                m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                                            }
                                            Updater.m4617setimpl(m4610constructorimpl6, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                            ImageKt.Image(PainterResources_androidKt.painterResource(UiExtensionsKt.getBackgroundImageResource(intValue), composer2, 0), (String) null, PaddingKt.m1516padding3ABfNKs(BoxScopeInstance.INSTANCE.matchParentSize(Modifier.INSTANCE), Dp.m7774constructorimpl(f4)), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, composer2, 24624, 104);
                                            Modifier m1038borderziNgDLE3 = BorderKt.m1038borderziNgDLE(BackgroundKt.m1024backgroundbw27NRU(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m5203getTransparent0d7_KjU(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f3))), Dp.m7774constructorimpl(f4), ComposeUtils.AppBrushPalette.BorderGoldTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f3)));
                                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                            MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(composer2, m1038borderziNgDLE3);
                                            Function0<ComposeUiNode> constructor7 = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor7);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer m4610constructorimpl7 = Updater.m4610constructorimpl(composer2);
                                            Updater.m4617setimpl(m4610constructorimpl7, maybeCachedBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4617setimpl(m4610constructorimpl7, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m4610constructorimpl7.getInserting() || !Intrinsics.areEqual(m4610constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                                                m4610constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                                                m4610constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                                            }
                                            Updater.m4617setimpl(m4610constructorimpl7, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                                            float f5 = 10;
                                            Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f5));
                                            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                            MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier8 = ComposedModifierKt.materializeModifier(composer2, m1516padding3ABfNKs);
                                            Function0<ComposeUiNode> constructor8 = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor8);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer m4610constructorimpl8 = Updater.m4610constructorimpl(composer2);
                                            Updater.m4617setimpl(m4610constructorimpl8, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4617setimpl(m4610constructorimpl8, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m4610constructorimpl8.getInserting() || !Intrinsics.areEqual(m4610constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                                                m4610constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                                                m4610constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                                            }
                                            Updater.m4617setimpl(m4610constructorimpl8, materializeModifier8, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                                            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                            Arrangement.HorizontalOrVertical spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
                                            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceEvenly, centerVertically2, composer2, 54);
                                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap9 = composer2.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier9 = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default2);
                                            Function0<ComposeUiNode> constructor9 = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor9);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer m4610constructorimpl9 = Updater.m4610constructorimpl(composer2);
                                            Updater.m4617setimpl(m4610constructorimpl9, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4617setimpl(m4610constructorimpl9, currentCompositionLocalMap9, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m4610constructorimpl9.getInserting() || !Intrinsics.areEqual(m4610constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                                                m4610constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
                                                m4610constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
                                            }
                                            Updater.m4617setimpl(m4610constructorimpl9, materializeModifier9, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                            float f6 = 88;
                                            Modifier m1038borderziNgDLE4 = BorderKt.m1038borderziNgDLE(BackgroundKt.m1024backgroundbw27NRU(ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f6)), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f3))), j2, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f3))), Dp.m7774constructorimpl(f4), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f3)));
                                            Alignment center = Alignment.INSTANCE.getCenter();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                            MeasurePolicy maybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap10 = composer2.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier10 = ComposedModifierKt.materializeModifier(composer2, m1038borderziNgDLE4);
                                            Function0<ComposeUiNode> constructor10 = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor10);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer m4610constructorimpl10 = Updater.m4610constructorimpl(composer2);
                                            Updater.m4617setimpl(m4610constructorimpl10, maybeCachedBoxMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4617setimpl(m4610constructorimpl10, currentCompositionLocalMap10, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash10 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m4610constructorimpl10.getInserting() || !Intrinsics.areEqual(m4610constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                                                m4610constructorimpl10.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash10));
                                                m4610constructorimpl10.apply(Integer.valueOf(currentCompositeKeyHash10), setCompositeKeyHash10);
                                            }
                                            Updater.m4617setimpl(m4610constructorimpl10, materializeModifier10, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                                            if (z4 && !list.isEmpty()) {
                                                composer2.startReplaceGroup(-165220299);
                                                int coerceIn = RangesKt.coerceIn(intValue2, 0, list3.size() - 1);
                                                i10 = 5004770;
                                                composer2.startReplaceGroup(5004770);
                                                Object rememberedValue16 = composer2.rememberedValue();
                                                if (rememberedValue16 == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue16 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$$ExternalSyntheticLambda6
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            Unit FlashBetMatchStartContent$lambda$50$lambda$48$lambda$47$lambda$46$lambda$41$lambda$40$lambda$39$lambda$38$lambda$34$lambda$33$lambda$32;
                                                            FlashBetMatchStartContent$lambda$50$lambda$48$lambda$47$lambda$46$lambda$41$lambda$40$lambda$39$lambda$38$lambda$34$lambda$33$lambda$32 = FlashBetMatchStartContentKt.FlashBetMatchStartContent$lambda$50$lambda$48$lambda$47$lambda$46$lambda$41$lambda$40$lambda$39$lambda$38$lambda$34$lambda$33$lambda$32(MutableState.this);
                                                            return FlashBetMatchStartContent$lambda$50$lambda$48$lambda$47$lambda$46$lambda$41$lambda$40$lambda$39$lambda$38$lambda$34$lambda$33$lambda$32;
                                                        }
                                                    };
                                                    composer2.updateRememberedValue(rememberedValue16);
                                                }
                                                composer2.endReplaceGroup();
                                                TeamRevealCarousel(list3, coerceIn, (Function0) rememberedValue16, 6L, 1, 0L, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer2, 1797504, 0);
                                                composer2.endReplaceGroup();
                                            } else {
                                                i10 = 5004770;
                                                composer2.startReplaceGroup(-164295476);
                                                TextKt.m2642Text4IGK_g(TypeDescription.Generic.OfWildcardType.SYMBOL, (Modifier) null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(56), (FontStyle) null, FontWeight.INSTANCE.getBold(), ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199686, 0, 130962);
                                                composer2.endReplaceGroup();
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            composer2.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3)), composer2, 6);
                                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.vs_img, composer2, 6), (String) null, SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(56)), Dp.m7774constructorimpl(48)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 432, 120);
                                            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3)), composer2, 6);
                                            Modifier m1038borderziNgDLE5 = BorderKt.m1038borderziNgDLE(BackgroundKt.m1024backgroundbw27NRU(ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f6)), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f3))), j2, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f3))), Dp.m7774constructorimpl(f4), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f3)));
                                            Alignment center2 = Alignment.INSTANCE.getCenter();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                            MeasurePolicy maybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash11 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap11 = composer2.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier11 = ComposedModifierKt.materializeModifier(composer2, m1038borderziNgDLE5);
                                            Function0<ComposeUiNode> constructor11 = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor11);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer m4610constructorimpl11 = Updater.m4610constructorimpl(composer2);
                                            Updater.m4617setimpl(m4610constructorimpl11, maybeCachedBoxMeasurePolicy6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4617setimpl(m4610constructorimpl11, currentCompositionLocalMap11, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash11 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m4610constructorimpl11.getInserting() || !Intrinsics.areEqual(m4610constructorimpl11.rememberedValue(), Integer.valueOf(currentCompositeKeyHash11))) {
                                                m4610constructorimpl11.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash11));
                                                m4610constructorimpl11.apply(Integer.valueOf(currentCompositeKeyHash11), setCompositeKeyHash11);
                                            }
                                            Updater.m4617setimpl(m4610constructorimpl11, materializeModifier11, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                            BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                                            if (z4 && !list2.isEmpty()) {
                                                composer2.startReplaceGroup(874737822);
                                                int coerceIn2 = RangesKt.coerceIn(intValue3, 0, list4.size() - 1);
                                                composer2.startReplaceGroup(i10);
                                                Object rememberedValue17 = composer2.rememberedValue();
                                                if (rememberedValue17 == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue17 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$$ExternalSyntheticLambda7
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            Unit FlashBetMatchStartContent$lambda$50$lambda$48$lambda$47$lambda$46$lambda$41$lambda$40$lambda$39$lambda$38$lambda$37$lambda$36$lambda$35;
                                                            FlashBetMatchStartContent$lambda$50$lambda$48$lambda$47$lambda$46$lambda$41$lambda$40$lambda$39$lambda$38$lambda$37$lambda$36$lambda$35 = FlashBetMatchStartContentKt.FlashBetMatchStartContent$lambda$50$lambda$48$lambda$47$lambda$46$lambda$41$lambda$40$lambda$39$lambda$38$lambda$37$lambda$36$lambda$35(MutableState.this);
                                                            return FlashBetMatchStartContent$lambda$50$lambda$48$lambda$47$lambda$46$lambda$41$lambda$40$lambda$39$lambda$38$lambda$37$lambda$36$lambda$35;
                                                        }
                                                    };
                                                    composer2.updateRememberedValue(rememberedValue17);
                                                }
                                                composer2.endReplaceGroup();
                                                TeamRevealCarousel(list4, coerceIn2, (Function0) rememberedValue17, 8L, 1, REVEAL_INITIAL_DELAY_TEAM2, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer2, 1797504, 0);
                                                composer2.endReplaceGroup();
                                            } else {
                                                composer2.startReplaceGroup(875662645);
                                                TextKt.m2642Text4IGK_g(TypeDescription.Generic.OfWildcardType.SYMBOL, (Modifier) null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(56), (FontStyle) null, FontWeight.INSTANCE.getBold(), ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199686, 0, 130962);
                                                composer2.endReplaceGroup();
                                            }
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
                                            float f7 = 4;
                                            float f8 = 13;
                                            Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(f7), 1, null), Dp.m7774constructorimpl(f8), 0.0f, Dp.m7774constructorimpl(f8), 0.0f, 10, null);
                                            Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
                                            Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                            MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically3, composer2, 54);
                                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash12 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap12 = composer2.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier12 = ComposedModifierKt.materializeModifier(composer2, m1520paddingqDBjuR0$default);
                                            Function0<ComposeUiNode> constructor12 = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor12);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer m4610constructorimpl12 = Updater.m4610constructorimpl(composer2);
                                            Updater.m4617setimpl(m4610constructorimpl12, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4617setimpl(m4610constructorimpl12, currentCompositionLocalMap12, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash12 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m4610constructorimpl12.getInserting() || !Intrinsics.areEqual(m4610constructorimpl12.rememberedValue(), Integer.valueOf(currentCompositeKeyHash12))) {
                                                m4610constructorimpl12.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash12));
                                                m4610constructorimpl12.apply(Integer.valueOf(currentCompositeKeyHash12), setCompositeKeyHash12);
                                            }
                                            Updater.m4617setimpl(m4610constructorimpl12, materializeModifier12, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                                            Alignment.Vertical centerVertically4 = Alignment.INSTANCE.getCenterVertically();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                            Modifier.Companion companion3 = Modifier.INSTANCE;
                                            MeasurePolicy rowMeasurePolicy4 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically4, composer2, 48);
                                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash13 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap13 = composer2.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier13 = ComposedModifierKt.materializeModifier(composer2, companion3);
                                            Function0<ComposeUiNode> constructor13 = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor13);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer m4610constructorimpl13 = Updater.m4610constructorimpl(composer2);
                                            Updater.m4617setimpl(m4610constructorimpl13, rowMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4617setimpl(m4610constructorimpl13, currentCompositionLocalMap13, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash13 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m4610constructorimpl13.getInserting() || !Intrinsics.areEqual(m4610constructorimpl13.rememberedValue(), Integer.valueOf(currentCompositeKeyHash13))) {
                                                m4610constructorimpl13.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash13));
                                                m4610constructorimpl13.apply(Integer.valueOf(currentCompositeKeyHash13), setCompositeKeyHash13);
                                            }
                                            Updater.m4617setimpl(m4610constructorimpl13, materializeModifier13, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                            RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                                            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.flash_bet_buy_in, composer2, 6) + " ", (Modifier) null, ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                                            TextKt.m2642Text4IGK_g(String.valueOf(j), (Modifier) null, ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131026);
                                            SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f7)), composer2, 6);
                                            float f9 = 20;
                                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.new_betcoin, composer2, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f9)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 432, 120);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            composer2.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            String obj5 = StringsKt.trim((CharSequence) new Regex("</?b>").replace(StringResources_androidKt.stringResource(R.string.start, composer2, 6).toString(), "")).toString();
                                            if ((flashBetMatchStartController == null || !(FlashBetMatchStartContent$lambda$4(collectAsState) instanceof FlashBetMatchStartUiState.Loading)) && !z4) {
                                                z2 = true;
                                                i11 = -1633490746;
                                            } else {
                                                i11 = -1633490746;
                                                z2 = false;
                                            }
                                            composer2.startReplaceGroup(i11);
                                            boolean changed6 = composer2.changed(function02) | ((i14 & 29360128) == 8388608);
                                            Object rememberedValue18 = composer2.rememberedValue();
                                            if (changed6 || rememberedValue18 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue18 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$$ExternalSyntheticLambda8
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        Unit FlashBetMatchStartContent$lambda$50$lambda$48$lambda$47$lambda$46$lambda$45$lambda$44$lambda$43;
                                                        FlashBetMatchStartContent$lambda$50$lambda$48$lambda$47$lambda$46$lambda$45$lambda$44$lambda$43 = FlashBetMatchStartContentKt.FlashBetMatchStartContent$lambda$50$lambda$48$lambda$47$lambda$46$lambda$45$lambda$44$lambda$43(Function0.this, onStartClick);
                                                        return FlashBetMatchStartContent$lambda$50$lambda$48$lambda$47$lambda$46$lambda$45$lambda$44$lambda$43;
                                                    }
                                                };
                                                composer2.updateRememberedValue(rememberedValue18);
                                            }
                                            composer2.endReplaceGroup();
                                            CommonButtonKt.m12915CommonButtonUPEs2M4(null, true, obj5, true, false, z2, (Function0) rememberedValue18, false, false, false, false, false, null, null, true, false, null, null, null, null, null, composer2, 3120, 24576, 0, 2080657);
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
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            composer2.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f5)), composer2, 6);
                                            Modifier m1024backgroundbw27NRU = BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(2), 0.0f, 2, null), j2, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f3)));
                                            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                            MeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash14 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap14 = composer2.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier14 = ComposedModifierKt.materializeModifier(composer2, m1024backgroundbw27NRU);
                                            Function0<ComposeUiNode> constructor14 = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor14);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer m4610constructorimpl14 = Updater.m4610constructorimpl(composer2);
                                            Updater.m4617setimpl(m4610constructorimpl14, columnMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4617setimpl(m4610constructorimpl14, currentCompositionLocalMap14, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash14 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m4610constructorimpl14.getInserting() || !Intrinsics.areEqual(m4610constructorimpl14.rememberedValue(), Integer.valueOf(currentCompositeKeyHash14))) {
                                                m4610constructorimpl14.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash14));
                                                m4610constructorimpl14.apply(Integer.valueOf(currentCompositeKeyHash14), setCompositeKeyHash14);
                                            }
                                            Updater.m4617setimpl(m4610constructorimpl14, materializeModifier14, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                            ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                                            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.flash_bet_prizes_description, composer2, 6), PaddingKt.m1517paddingVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f9), Dp.m7774constructorimpl(f3)), ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 130992);
                                            m13721PrizeRowXOJAsU(StringResources_androidKt.stringResource(R.string.flash_bet_prize_3_3, composer2, 6), StringResources_androidKt.stringResource(R.string.flash_bet_prize_3_3_value, composer2, 6), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), composer2, 0);
                                            m13721PrizeRowXOJAsU(StringResources_androidKt.stringResource(R.string.flash_bet_prize_2_3, composer2, 6), StringResources_androidKt.stringResource(R.string.flash_bet_prize_2_3_value, composer2, 6), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), composer2, 0);
                                            m13721PrizeRowXOJAsU(StringResources_androidKt.stringResource(R.string.flash_bet_prize_1_3, composer2, 6), StringResources_androidKt.stringResource(R.string.flash_bet_prize_1_3_value, composer2, 6), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), composer2, 0);
                                            m13721PrizeRowXOJAsU(StringResources_androidKt.stringResource(R.string.flash_bet_prize_0_3, composer2, 6), StringResources_androidKt.stringResource(R.string.flash_bet_prize_0_3_value, composer2, 6), ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), composer2, 0);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            composer2.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            composer2.endReplaceGroup();
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            composer2.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            stateFlow4 = stateFlow2;
                                            function13 = function14;
                                        }
                                    } else {
                                        composer2.startReplaceGroup(511852917);
                                        composer2.startReplaceGroup(-1633490746);
                                        boolean changed7 = composer2.changed(function02) | (i17 == 1048576);
                                        Object rememberedValue19 = composer2.rememberedValue();
                                        if (changed7 || rememberedValue19 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue19 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$$ExternalSyntheticLambda4
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    Unit FlashBetMatchStartContent$lambda$50$lambda$29$lambda$28;
                                                    FlashBetMatchStartContent$lambda$50$lambda$29$lambda$28 = FlashBetMatchStartContentKt.FlashBetMatchStartContent$lambda$50$lambda$29$lambda$28(Function0.this, onBackClick);
                                                    return FlashBetMatchStartContent$lambda$50$lambda$29$lambda$28;
                                                }
                                            };
                                            composer2.updateRememberedValue(rememberedValue19);
                                        }
                                        composer2.endReplaceGroup();
                                        FlashBetNoMatchesInCategoryContent((Function0) rememberedValue19, composer2, 0);
                                        composer2.endReplaceGroup();
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    stateFlow4 = stateFlow2;
                                    function13 = function14;
                                }
                            }
                            flashBetMatchStartContentKt$FlashBetMatchStartContent$1$1 = new FlashBetMatchStartContentKt$FlashBetMatchStartContent$1$1(applicationContext, null);
                            startRestartGroup.updateRememberedValue(flashBetMatchStartContentKt$FlashBetMatchStartContent$1$1);
                            startRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) flashBetMatchStartContentKt$FlashBetMatchStartContent$1$1, startRestartGroup, 6);
                            if (stateFlow2 != null) {
                            }
                            int i142 = i8;
                            Function1<? super FlashBetGameSessionDto, Unit> function142 = function12;
                            collectAsState = SnapshotStateKt.collectAsState(stateFlow3, FlashBetMatchStartUiState.Idle.INSTANCE, null, startRestartGroup, 48, 2);
                            if (flashBetMatchStartController == null) {
                            }
                            startRestartGroup.startReplaceGroup(-518116505);
                            if (randomTeamImageUrlsTeam1 == null) {
                            }
                            startRestartGroup.endReplaceGroup();
                            if (flashBetMatchStartController == null) {
                            }
                            startRestartGroup.startReplaceGroup(-518111289);
                            if (randomTeamImageUrlsTeam2 == null) {
                            }
                            startRestartGroup.endReplaceGroup();
                            State collectAsState22 = SnapshotStateKt.collectAsState(randomTeamImageUrlsTeam1, CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
                            State collectAsState32 = SnapshotStateKt.collectAsState(randomTeamImageUrlsTeam2, CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
                            long j22 = ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor();
                            Integer intOrNull2 = StringsKt.toIntOrNull(sportId);
                            if (intOrNull2 == null) {
                            }
                            startRestartGroup.startReplaceGroup(-1633490746);
                            changedInstance3 = startRestartGroup.changedInstance(flashBetMatchStartController) | ((i142 & 14) != 4);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (changedInstance3) {
                            }
                            snapshotMutationPolicy = null;
                            rememberedValue = new FlashBetMatchStartContentKt$FlashBetMatchStartContent$2$1(flashBetMatchStartController, sportId, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            startRestartGroup.endReplaceGroup();
                            int i152 = i142 << 3;
                            EffectsKt.LaunchedEffect(flashBetMatchStartController, sportId, (Function2) rememberedValue, startRestartGroup, ((i142 >> 15) & 14) | (i152 & 112));
                            FlashBetMatchStartUiState FlashBetMatchStartContent$lambda$422 = FlashBetMatchStartContent$lambda$4(collectAsState);
                            startRestartGroup.startReplaceGroup(5004770);
                            changed = startRestartGroup.changed(FlashBetMatchStartContent$lambda$422);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changed) {
                            }
                            FlashBetMatchStartUiState FlashBetMatchStartContent$lambda$432 = FlashBetMatchStartContent$lambda$4(collectAsState);
                            if (!(FlashBetMatchStartContent$lambda$432 instanceof FlashBetMatchStartUiState.StartSuccess)) {
                            }
                            if (startSuccess == 0) {
                            }
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                            flashBetGameSessionDto = (FlashBetGameSessionDto) rememberedValue2;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (rememberedValue3 != Composer.INSTANCE.getEmpty()) {
                            }
                            mutableState = (MutableState) rememberedValue3;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (rememberedValue4 != Composer.INSTANCE.getEmpty()) {
                            }
                            mutableState2 = (MutableState) rememberedValue4;
                            startRestartGroup.endReplaceGroup();
                            List<String> FlashBetMatchStartContent$lambda$72 = FlashBetMatchStartContent$lambda$7(collectAsState22);
                            List<String> FlashBetMatchStartContent$lambda$82 = FlashBetMatchStartContent$lambda$8(collectAsState32);
                            startRestartGroup.startReplaceGroup(-1746271574);
                            changed2 = startRestartGroup.changed(FlashBetMatchStartContent$lambda$72) | startRestartGroup.changed(flashBetGameSessionDto) | startRestartGroup.changed(FlashBetMatchStartContent$lambda$82);
                            rememberedValue5 = startRestartGroup.rememberedValue();
                            if (changed2) {
                            }
                            if ((flashBetGameSessionDto == null ? flashBetGameSessionDto.getTeamDetails() : null) != null) {
                            }
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                            Pair pair4 = (Pair) rememberedValue5;
                            startRestartGroup.endReplaceGroup();
                            Pair pair22 = (Pair) pair4.component1();
                            Pair pair32 = (Pair) pair4.component2();
                            List list32 = (List) pair22.getFirst();
                            int intValue22 = ((Number) pair22.getSecond()).intValue();
                            List list42 = (List) pair32.getFirst();
                            int intValue32 = ((Number) pair32.getSecond()).intValue();
                            FlashBetMatchStartUiState FlashBetMatchStartContent$lambda$442 = FlashBetMatchStartContent$lambda$4(collectAsState);
                            startRestartGroup.startReplaceGroup(-1633490746);
                            int i162 = i142 & 234881024;
                            changed3 = startRestartGroup.changed(collectAsState) | (i162 != 67108864 ? z : false);
                            rememberedValue6 = startRestartGroup.rememberedValue();
                            if (!changed3) {
                            }
                            rememberedValue6 = new FlashBetMatchStartContentKt$FlashBetMatchStartContent$4$1(function142, collectAsState, null);
                            startRestartGroup.updateRememberedValue(rememberedValue6);
                            startRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(FlashBetMatchStartContent$lambda$442, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, startRestartGroup, 0);
                            startRestartGroup.startReplaceGroup(-1746271574);
                            changedInstance4 = startRestartGroup.changedInstance(flashBetGameSessionDto);
                            rememberedValue7 = startRestartGroup.rememberedValue();
                            if (!changedInstance4) {
                            }
                            rememberedValue7 = new FlashBetMatchStartContentKt$FlashBetMatchStartContent$5$1(flashBetGameSessionDto, mutableState, mutableState2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue7);
                            startRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(flashBetGameSessionDto, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue7, startRestartGroup, 0);
                            Boolean valueOf3 = Boolean.valueOf(FlashBetMatchStartContent$lambda$12(mutableState));
                            Boolean valueOf22 = Boolean.valueOf(FlashBetMatchStartContent$lambda$15(mutableState2));
                            startRestartGroup.startReplaceGroup(-1224400529);
                            changedInstance5 = startRestartGroup.changedInstance(flashBetGameSessionDto) | (i162 != 67108864 ? z : false);
                            rememberedValue8 = startRestartGroup.rememberedValue();
                            if (!changedInstance5) {
                            }
                            rememberedValue8 = new FlashBetMatchStartContentKt$FlashBetMatchStartContent$6$1(flashBetGameSessionDto, function142, mutableState, mutableState2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue8);
                            startRestartGroup.endReplaceGroup();
                            boolean z32 = z;
                            EffectsKt.LaunchedEffect(valueOf3, valueOf22, flashBetGameSessionDto, (Function2) rememberedValue8, startRestartGroup, 0);
                            startRestartGroup.startReplaceGroup(-1224400529);
                            changedInstance6 = startRestartGroup.changedInstance(flashBetGameSessionDto) | startRestartGroup.changedInstance(list32) | startRestartGroup.changedInstance(list42) | (i162 != 67108864 ? z32 ? 1 : 0 : false);
                            Object rememberedValue132 = startRestartGroup.rememberedValue();
                            if (!changedInstance6) {
                            }
                            FlashBetMatchStartContentKt$FlashBetMatchStartContent$7$1 flashBetMatchStartContentKt$FlashBetMatchStartContent$7$12 = new FlashBetMatchStartContentKt$FlashBetMatchStartContent$7$1(flashBetGameSessionDto, list32, list42, function142, null);
                            startRestartGroup.updateRememberedValue(flashBetMatchStartContentKt$FlashBetMatchStartContent$7$12);
                            obj2 = flashBetMatchStartContentKt$FlashBetMatchStartContent$7$12;
                            startRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(flashBetGameSessionDto, list32, list42, (Function2) obj2, startRestartGroup, 0);
                            if (flashBetGameSessionDto == null) {
                            }
                            PreloadCarouselImages(FlashBetMatchStartContent$lambda$7(collectAsState22), startRestartGroup, 0);
                            PreloadCarouselImages(FlashBetMatchStartContent$lambda$8(collectAsState32), startRestartGroup, 0);
                            startRestartGroup.startReplaceGroup(-518012912);
                            list = list32;
                            if (!list.isEmpty()) {
                            }
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(-518010096);
                            list2 = list42;
                            if (!list2.isEmpty()) {
                            }
                            startRestartGroup.endReplaceGroup();
                            float f10 = 12;
                            Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, z32 ? 1 : 0, null), ScrollKt.rememberScrollState(0, startRestartGroup, 0, z32 ? 1 : 0), false, null, false, 14, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(f10));
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap15 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier15 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN42);
                            Function0<ComposeUiNode> constructor15 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
                            }
                            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap15, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash15 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl.getInserting()) {
                            }
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash15);
                            Updater.m4617setimpl(m4610constructorimpl, materializeModifier15, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
                            Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, z32 ? 1 : 0, null);
                            Arrangement.HorizontalOrVertical spaceBetween3 = Arrangement.INSTANCE.getSpaceBetween();
                            Alignment.Vertical centerVertically5 = Alignment.INSTANCE.getCenterVertically();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy5 = RowKt.rowMeasurePolicy(spaceBetween3, centerVertically5, startRestartGroup, 54);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default3);
                            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
                            }
                            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl2.getInserting()) {
                            }
                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance5 = RowScopeInstance.INSTANCE;
                            Painter painterResource2 = PainterResources_androidKt.painterResource(R.drawable.arrow_light_left, startRestartGroup, 6);
                            float f22 = 24;
                            Modifier m1563size3ABfNKs2 = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f22));
                            startRestartGroup.startReplaceGroup(-1633490746);
                            int i172 = i142 & 3670016;
                            changed4 = startRestartGroup.changed(function02) | (i172 != 1048576);
                            Object rememberedValue142 = startRestartGroup.rememberedValue();
                            if (!changed4) {
                            }
                            Function0 function032 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit FlashBetMatchStartContent$lambda$50$lambda$27$lambda$25$lambda$24;
                                    FlashBetMatchStartContent$lambda$50$lambda$27$lambda$25$lambda$24 = FlashBetMatchStartContentKt.FlashBetMatchStartContent$lambda$50$lambda$27$lambda$25$lambda$24(Function0.this, onBackClick);
                                    return FlashBetMatchStartContent$lambda$50$lambda$27$lambda$25$lambda$24;
                                }
                            };
                            startRestartGroup.updateRememberedValue(function032);
                            obj3 = function032;
                            startRestartGroup.endReplaceGroup();
                            ImageKt.Image(painterResource2, "back", ClickAnimationModifierKt.clickAnimation(m1563size3ABfNKs2, (Function0) obj3, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 6, 0, 4094), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
                            str = categoryLogoUrl;
                            if (str.length() == 0) {
                            }
                            int i182 = i152 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH;
                            composer2 = startRestartGroup;
                            MatchLeagueItemKt.MatchLeagueItem(null, str, categoryName, false, false, false, null, composer2, i182, 121);
                            SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f22)), composer2, 6);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            float f32 = 8;
                            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f32)), composer2, 6);
                            FlashBetMatchStartContent$lambda$4 = FlashBetMatchStartContent$lambda$4(collectAsState);
                            if (FlashBetMatchStartContent$lambda$4 instanceof FlashBetMatchStartUiState.NoAvailableMatches) {
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            stateFlow4 = stateFlow2;
                            function13 = function142;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            composer2 = startRestartGroup;
                            function13 = function12;
                            stateFlow4 = stateFlow;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj6, Object obj7) {
                                    Unit FlashBetMatchStartContent$lambda$51;
                                    FlashBetMatchStartContent$lambda$51 = FlashBetMatchStartContentKt.FlashBetMatchStartContent$lambda$51(sportId, categoryName, categoryPhotoUrl, categoryLogoUrl, j, flashBetMatchStartController, onBackClick, onStartClick, function13, stateFlow4, i, i2, (Composer) obj6, ((Integer) obj7).intValue());
                                    return FlashBetMatchStartContent$lambda$51;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= i12;
                    i5 = i2 & 256;
                    if (i5 != 0) {
                    }
                    i6 = i2 & 512;
                    if (i6 != 0) {
                    }
                    i7 = i3;
                    if ((306783379 & i7) == 306783378) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume2 = startRestartGroup.consume(localContext2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final Context applicationContext2 = ((Context) consume2).getApplicationContext();
                    startRestartGroup.startReplaceGroup(5004770);
                    changedInstance = startRestartGroup.changedInstance(applicationContext2);
                    Object rememberedValue92 = startRestartGroup.rememberedValue();
                    if (!changedInstance) {
                    }
                    Function0 function04 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit FlashBetMatchStartContent$lambda$2$lambda$1;
                            FlashBetMatchStartContent$lambda$2$lambda$1 = FlashBetMatchStartContentKt.FlashBetMatchStartContent$lambda$2$lambda$1(applicationContext2);
                            return FlashBetMatchStartContent$lambda$2$lambda$1;
                        }
                    };
                    startRestartGroup.updateRememberedValue(function04);
                    obj = function04;
                    final Function0 function022 = (Function0) obj;
                    startRestartGroup.endReplaceGroup();
                    Unit unit2 = Unit.INSTANCE;
                    startRestartGroup.startReplaceGroup(5004770);
                    changedInstance2 = startRestartGroup.changedInstance(applicationContext2);
                    Object rememberedValue102 = startRestartGroup.rememberedValue();
                    if (changedInstance2) {
                    }
                    flashBetMatchStartContentKt$FlashBetMatchStartContent$1$1 = new FlashBetMatchStartContentKt$FlashBetMatchStartContent$1$1(applicationContext2, null);
                    startRestartGroup.updateRememberedValue(flashBetMatchStartContentKt$FlashBetMatchStartContent$1$1);
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) flashBetMatchStartContentKt$FlashBetMatchStartContent$1$1, startRestartGroup, 6);
                    if (stateFlow2 != null) {
                    }
                    int i1422 = i8;
                    Function1<? super FlashBetGameSessionDto, Unit> function1422 = function12;
                    collectAsState = SnapshotStateKt.collectAsState(stateFlow3, FlashBetMatchStartUiState.Idle.INSTANCE, null, startRestartGroup, 48, 2);
                    if (flashBetMatchStartController == null) {
                    }
                    startRestartGroup.startReplaceGroup(-518116505);
                    if (randomTeamImageUrlsTeam1 == null) {
                    }
                    startRestartGroup.endReplaceGroup();
                    if (flashBetMatchStartController == null) {
                    }
                    startRestartGroup.startReplaceGroup(-518111289);
                    if (randomTeamImageUrlsTeam2 == null) {
                    }
                    startRestartGroup.endReplaceGroup();
                    State collectAsState222 = SnapshotStateKt.collectAsState(randomTeamImageUrlsTeam1, CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
                    State collectAsState322 = SnapshotStateKt.collectAsState(randomTeamImageUrlsTeam2, CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
                    long j222 = ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor();
                    Integer intOrNull22 = StringsKt.toIntOrNull(sportId);
                    if (intOrNull22 == null) {
                    }
                    startRestartGroup.startReplaceGroup(-1633490746);
                    changedInstance3 = startRestartGroup.changedInstance(flashBetMatchStartController) | ((i1422 & 14) != 4);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (changedInstance3) {
                    }
                    snapshotMutationPolicy = null;
                    rememberedValue = new FlashBetMatchStartContentKt$FlashBetMatchStartContent$2$1(flashBetMatchStartController, sportId, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceGroup();
                    int i1522 = i1422 << 3;
                    EffectsKt.LaunchedEffect(flashBetMatchStartController, sportId, (Function2) rememberedValue, startRestartGroup, ((i1422 >> 15) & 14) | (i1522 & 112));
                    FlashBetMatchStartUiState FlashBetMatchStartContent$lambda$4222 = FlashBetMatchStartContent$lambda$4(collectAsState);
                    startRestartGroup.startReplaceGroup(5004770);
                    changed = startRestartGroup.changed(FlashBetMatchStartContent$lambda$4222);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    FlashBetMatchStartUiState FlashBetMatchStartContent$lambda$4322 = FlashBetMatchStartContent$lambda$4(collectAsState);
                    if (!(FlashBetMatchStartContent$lambda$4322 instanceof FlashBetMatchStartUiState.StartSuccess)) {
                    }
                    if (startSuccess == 0) {
                    }
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    flashBetGameSessionDto = (FlashBetGameSessionDto) rememberedValue2;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 != Composer.INSTANCE.getEmpty()) {
                    }
                    mutableState = (MutableState) rememberedValue3;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (rememberedValue4 != Composer.INSTANCE.getEmpty()) {
                    }
                    mutableState2 = (MutableState) rememberedValue4;
                    startRestartGroup.endReplaceGroup();
                    List<String> FlashBetMatchStartContent$lambda$722 = FlashBetMatchStartContent$lambda$7(collectAsState222);
                    List<String> FlashBetMatchStartContent$lambda$822 = FlashBetMatchStartContent$lambda$8(collectAsState322);
                    startRestartGroup.startReplaceGroup(-1746271574);
                    changed2 = startRestartGroup.changed(FlashBetMatchStartContent$lambda$722) | startRestartGroup.changed(flashBetGameSessionDto) | startRestartGroup.changed(FlashBetMatchStartContent$lambda$822);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (changed2) {
                    }
                    if ((flashBetGameSessionDto == null ? flashBetGameSessionDto.getTeamDetails() : null) != null) {
                    }
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                    Pair pair42 = (Pair) rememberedValue5;
                    startRestartGroup.endReplaceGroup();
                    Pair pair222 = (Pair) pair42.component1();
                    Pair pair322 = (Pair) pair42.component2();
                    List list322 = (List) pair222.getFirst();
                    int intValue222 = ((Number) pair222.getSecond()).intValue();
                    List list422 = (List) pair322.getFirst();
                    int intValue322 = ((Number) pair322.getSecond()).intValue();
                    FlashBetMatchStartUiState FlashBetMatchStartContent$lambda$4422 = FlashBetMatchStartContent$lambda$4(collectAsState);
                    startRestartGroup.startReplaceGroup(-1633490746);
                    int i1622 = i1422 & 234881024;
                    changed3 = startRestartGroup.changed(collectAsState) | (i1622 != 67108864 ? z : false);
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (!changed3) {
                    }
                    rememberedValue6 = new FlashBetMatchStartContentKt$FlashBetMatchStartContent$4$1(function1422, collectAsState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(FlashBetMatchStartContent$lambda$4422, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, startRestartGroup, 0);
                    startRestartGroup.startReplaceGroup(-1746271574);
                    changedInstance4 = startRestartGroup.changedInstance(flashBetGameSessionDto);
                    rememberedValue7 = startRestartGroup.rememberedValue();
                    if (!changedInstance4) {
                    }
                    rememberedValue7 = new FlashBetMatchStartContentKt$FlashBetMatchStartContent$5$1(flashBetGameSessionDto, mutableState, mutableState2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(flashBetGameSessionDto, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue7, startRestartGroup, 0);
                    Boolean valueOf32 = Boolean.valueOf(FlashBetMatchStartContent$lambda$12(mutableState));
                    Boolean valueOf222 = Boolean.valueOf(FlashBetMatchStartContent$lambda$15(mutableState2));
                    startRestartGroup.startReplaceGroup(-1224400529);
                    changedInstance5 = startRestartGroup.changedInstance(flashBetGameSessionDto) | (i1622 != 67108864 ? z : false);
                    rememberedValue8 = startRestartGroup.rememberedValue();
                    if (!changedInstance5) {
                    }
                    rememberedValue8 = new FlashBetMatchStartContentKt$FlashBetMatchStartContent$6$1(flashBetGameSessionDto, function1422, mutableState, mutableState2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                    startRestartGroup.endReplaceGroup();
                    boolean z322 = z;
                    EffectsKt.LaunchedEffect(valueOf32, valueOf222, flashBetGameSessionDto, (Function2) rememberedValue8, startRestartGroup, 0);
                    startRestartGroup.startReplaceGroup(-1224400529);
                    changedInstance6 = startRestartGroup.changedInstance(flashBetGameSessionDto) | startRestartGroup.changedInstance(list322) | startRestartGroup.changedInstance(list422) | (i1622 != 67108864 ? z322 ? 1 : 0 : false);
                    Object rememberedValue1322 = startRestartGroup.rememberedValue();
                    if (!changedInstance6) {
                    }
                    FlashBetMatchStartContentKt$FlashBetMatchStartContent$7$1 flashBetMatchStartContentKt$FlashBetMatchStartContent$7$122 = new FlashBetMatchStartContentKt$FlashBetMatchStartContent$7$1(flashBetGameSessionDto, list322, list422, function1422, null);
                    startRestartGroup.updateRememberedValue(flashBetMatchStartContentKt$FlashBetMatchStartContent$7$122);
                    obj2 = flashBetMatchStartContentKt$FlashBetMatchStartContent$7$122;
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(flashBetGameSessionDto, list322, list422, (Function2) obj2, startRestartGroup, 0);
                    if (flashBetGameSessionDto == null) {
                    }
                    PreloadCarouselImages(FlashBetMatchStartContent$lambda$7(collectAsState222), startRestartGroup, 0);
                    PreloadCarouselImages(FlashBetMatchStartContent$lambda$8(collectAsState322), startRestartGroup, 0);
                    startRestartGroup.startReplaceGroup(-518012912);
                    list = list322;
                    if (!list.isEmpty()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(-518010096);
                    list2 = list422;
                    if (!list2.isEmpty()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    float f102 = 12;
                    Modifier m1517paddingVpY3zN422 = PaddingKt.m1517paddingVpY3zN4(ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, z322 ? 1 : 0, null), ScrollKt.rememberScrollState(0, startRestartGroup, 0, z322 ? 1 : 0), false, null, false, 14, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(f102));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy52 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap152 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier152 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN422);
                    Function0<ComposeUiNode> constructor152 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy52, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap152, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash152 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl.getInserting()) {
                    }
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash152);
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier152, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance52 = ColumnScopeInstance.INSTANCE;
                    Modifier fillMaxWidth$default32 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, z322 ? 1 : 0, null);
                    Arrangement.HorizontalOrVertical spaceBetween32 = Arrangement.INSTANCE.getSpaceBetween();
                    Alignment.Vertical centerVertically52 = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy52 = RowKt.rowMeasurePolicy(spaceBetween32, centerVertically52, startRestartGroup, 54);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default32);
                    Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy52, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl2.getInserting()) {
                    }
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance52 = RowScopeInstance.INSTANCE;
                    Painter painterResource22 = PainterResources_androidKt.painterResource(R.drawable.arrow_light_left, startRestartGroup, 6);
                    float f222 = 24;
                    Modifier m1563size3ABfNKs22 = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f222));
                    startRestartGroup.startReplaceGroup(-1633490746);
                    int i1722 = i1422 & 3670016;
                    changed4 = startRestartGroup.changed(function022) | (i1722 != 1048576);
                    Object rememberedValue1422 = startRestartGroup.rememberedValue();
                    if (!changed4) {
                    }
                    Function0 function0322 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit FlashBetMatchStartContent$lambda$50$lambda$27$lambda$25$lambda$24;
                            FlashBetMatchStartContent$lambda$50$lambda$27$lambda$25$lambda$24 = FlashBetMatchStartContentKt.FlashBetMatchStartContent$lambda$50$lambda$27$lambda$25$lambda$24(Function0.this, onBackClick);
                            return FlashBetMatchStartContent$lambda$50$lambda$27$lambda$25$lambda$24;
                        }
                    };
                    startRestartGroup.updateRememberedValue(function0322);
                    obj3 = function0322;
                    startRestartGroup.endReplaceGroup();
                    ImageKt.Image(painterResource22, "back", ClickAnimationModifierKt.clickAnimation(m1563size3ABfNKs22, (Function0) obj3, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 6, 0, 4094), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
                    str = categoryLogoUrl;
                    if (str.length() == 0) {
                    }
                    int i1822 = i1522 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH;
                    composer2 = startRestartGroup;
                    MatchLeagueItemKt.MatchLeagueItem(null, str, categoryName, false, false, false, null, composer2, i1822, 121);
                    SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f222)), composer2, 6);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    float f322 = 8;
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f322)), composer2, 6);
                    FlashBetMatchStartContent$lambda$4 = FlashBetMatchStartContent$lambda$4(collectAsState);
                    if (FlashBetMatchStartContent$lambda$4 instanceof FlashBetMatchStartUiState.NoAvailableMatches) {
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    stateFlow4 = stateFlow2;
                    function13 = function1422;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i3 |= i13;
                if ((i2 & 128) != 0) {
                }
                i3 |= i12;
                i5 = i2 & 256;
                if (i5 != 0) {
                }
                i6 = i2 & 512;
                if (i6 != 0) {
                }
                i7 = i3;
                if ((306783379 & i7) == 306783378) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ProvidableCompositionLocal<Context> localContext22 = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume22 = startRestartGroup.consume(localContext22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final Context applicationContext22 = ((Context) consume22).getApplicationContext();
                startRestartGroup.startReplaceGroup(5004770);
                changedInstance = startRestartGroup.changedInstance(applicationContext22);
                Object rememberedValue922 = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                Function0 function042 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit FlashBetMatchStartContent$lambda$2$lambda$1;
                        FlashBetMatchStartContent$lambda$2$lambda$1 = FlashBetMatchStartContentKt.FlashBetMatchStartContent$lambda$2$lambda$1(applicationContext22);
                        return FlashBetMatchStartContent$lambda$2$lambda$1;
                    }
                };
                startRestartGroup.updateRememberedValue(function042);
                obj = function042;
                final Function0 function0222 = (Function0) obj;
                startRestartGroup.endReplaceGroup();
                Unit unit22 = Unit.INSTANCE;
                startRestartGroup.startReplaceGroup(5004770);
                changedInstance2 = startRestartGroup.changedInstance(applicationContext22);
                Object rememberedValue1022 = startRestartGroup.rememberedValue();
                if (changedInstance2) {
                }
                flashBetMatchStartContentKt$FlashBetMatchStartContent$1$1 = new FlashBetMatchStartContentKt$FlashBetMatchStartContent$1$1(applicationContext22, null);
                startRestartGroup.updateRememberedValue(flashBetMatchStartContentKt$FlashBetMatchStartContent$1$1);
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) flashBetMatchStartContentKt$FlashBetMatchStartContent$1$1, startRestartGroup, 6);
                if (stateFlow2 != null) {
                }
                int i14222 = i8;
                Function1<? super FlashBetGameSessionDto, Unit> function14222 = function12;
                collectAsState = SnapshotStateKt.collectAsState(stateFlow3, FlashBetMatchStartUiState.Idle.INSTANCE, null, startRestartGroup, 48, 2);
                if (flashBetMatchStartController == null) {
                }
                startRestartGroup.startReplaceGroup(-518116505);
                if (randomTeamImageUrlsTeam1 == null) {
                }
                startRestartGroup.endReplaceGroup();
                if (flashBetMatchStartController == null) {
                }
                startRestartGroup.startReplaceGroup(-518111289);
                if (randomTeamImageUrlsTeam2 == null) {
                }
                startRestartGroup.endReplaceGroup();
                State collectAsState2222 = SnapshotStateKt.collectAsState(randomTeamImageUrlsTeam1, CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
                State collectAsState3222 = SnapshotStateKt.collectAsState(randomTeamImageUrlsTeam2, CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
                long j2222 = ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor();
                Integer intOrNull222 = StringsKt.toIntOrNull(sportId);
                if (intOrNull222 == null) {
                }
                startRestartGroup.startReplaceGroup(-1633490746);
                changedInstance3 = startRestartGroup.changedInstance(flashBetMatchStartController) | ((i14222 & 14) != 4);
                rememberedValue = startRestartGroup.rememberedValue();
                if (changedInstance3) {
                }
                snapshotMutationPolicy = null;
                rememberedValue = new FlashBetMatchStartContentKt$FlashBetMatchStartContent$2$1(flashBetMatchStartController, sportId, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                int i15222 = i14222 << 3;
                EffectsKt.LaunchedEffect(flashBetMatchStartController, sportId, (Function2) rememberedValue, startRestartGroup, ((i14222 >> 15) & 14) | (i15222 & 112));
                FlashBetMatchStartUiState FlashBetMatchStartContent$lambda$42222 = FlashBetMatchStartContent$lambda$4(collectAsState);
                startRestartGroup.startReplaceGroup(5004770);
                changed = startRestartGroup.changed(FlashBetMatchStartContent$lambda$42222);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                FlashBetMatchStartUiState FlashBetMatchStartContent$lambda$43222 = FlashBetMatchStartContent$lambda$4(collectAsState);
                if (!(FlashBetMatchStartContent$lambda$43222 instanceof FlashBetMatchStartUiState.StartSuccess)) {
                }
                if (startSuccess == 0) {
                }
                startRestartGroup.updateRememberedValue(rememberedValue2);
                flashBetGameSessionDto = (FlashBetGameSessionDto) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 != Composer.INSTANCE.getEmpty()) {
                }
                mutableState = (MutableState) rememberedValue3;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 != Composer.INSTANCE.getEmpty()) {
                }
                mutableState2 = (MutableState) rememberedValue4;
                startRestartGroup.endReplaceGroup();
                List<String> FlashBetMatchStartContent$lambda$7222 = FlashBetMatchStartContent$lambda$7(collectAsState2222);
                List<String> FlashBetMatchStartContent$lambda$8222 = FlashBetMatchStartContent$lambda$8(collectAsState3222);
                startRestartGroup.startReplaceGroup(-1746271574);
                changed2 = startRestartGroup.changed(FlashBetMatchStartContent$lambda$7222) | startRestartGroup.changed(flashBetGameSessionDto) | startRestartGroup.changed(FlashBetMatchStartContent$lambda$8222);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (changed2) {
                }
                if ((flashBetGameSessionDto == null ? flashBetGameSessionDto.getTeamDetails() : null) != null) {
                }
                startRestartGroup.updateRememberedValue(rememberedValue5);
                Pair pair422 = (Pair) rememberedValue5;
                startRestartGroup.endReplaceGroup();
                Pair pair2222 = (Pair) pair422.component1();
                Pair pair3222 = (Pair) pair422.component2();
                List list3222 = (List) pair2222.getFirst();
                int intValue2222 = ((Number) pair2222.getSecond()).intValue();
                List list4222 = (List) pair3222.getFirst();
                int intValue3222 = ((Number) pair3222.getSecond()).intValue();
                FlashBetMatchStartUiState FlashBetMatchStartContent$lambda$44222 = FlashBetMatchStartContent$lambda$4(collectAsState);
                startRestartGroup.startReplaceGroup(-1633490746);
                int i16222 = i14222 & 234881024;
                changed3 = startRestartGroup.changed(collectAsState) | (i16222 != 67108864 ? z : false);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (!changed3) {
                }
                rememberedValue6 = new FlashBetMatchStartContentKt$FlashBetMatchStartContent$4$1(function14222, collectAsState, null);
                startRestartGroup.updateRememberedValue(rememberedValue6);
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(FlashBetMatchStartContent$lambda$44222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, startRestartGroup, 0);
                startRestartGroup.startReplaceGroup(-1746271574);
                changedInstance4 = startRestartGroup.changedInstance(flashBetGameSessionDto);
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (!changedInstance4) {
                }
                rememberedValue7 = new FlashBetMatchStartContentKt$FlashBetMatchStartContent$5$1(flashBetGameSessionDto, mutableState, mutableState2, null);
                startRestartGroup.updateRememberedValue(rememberedValue7);
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(flashBetGameSessionDto, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue7, startRestartGroup, 0);
                Boolean valueOf322 = Boolean.valueOf(FlashBetMatchStartContent$lambda$12(mutableState));
                Boolean valueOf2222 = Boolean.valueOf(FlashBetMatchStartContent$lambda$15(mutableState2));
                startRestartGroup.startReplaceGroup(-1224400529);
                changedInstance5 = startRestartGroup.changedInstance(flashBetGameSessionDto) | (i16222 != 67108864 ? z : false);
                rememberedValue8 = startRestartGroup.rememberedValue();
                if (!changedInstance5) {
                }
                rememberedValue8 = new FlashBetMatchStartContentKt$FlashBetMatchStartContent$6$1(flashBetGameSessionDto, function14222, mutableState, mutableState2, null);
                startRestartGroup.updateRememberedValue(rememberedValue8);
                startRestartGroup.endReplaceGroup();
                boolean z3222 = z;
                EffectsKt.LaunchedEffect(valueOf322, valueOf2222, flashBetGameSessionDto, (Function2) rememberedValue8, startRestartGroup, 0);
                startRestartGroup.startReplaceGroup(-1224400529);
                changedInstance6 = startRestartGroup.changedInstance(flashBetGameSessionDto) | startRestartGroup.changedInstance(list3222) | startRestartGroup.changedInstance(list4222) | (i16222 != 67108864 ? z3222 ? 1 : 0 : false);
                Object rememberedValue13222 = startRestartGroup.rememberedValue();
                if (!changedInstance6) {
                }
                FlashBetMatchStartContentKt$FlashBetMatchStartContent$7$1 flashBetMatchStartContentKt$FlashBetMatchStartContent$7$1222 = new FlashBetMatchStartContentKt$FlashBetMatchStartContent$7$1(flashBetGameSessionDto, list3222, list4222, function14222, null);
                startRestartGroup.updateRememberedValue(flashBetMatchStartContentKt$FlashBetMatchStartContent$7$1222);
                obj2 = flashBetMatchStartContentKt$FlashBetMatchStartContent$7$1222;
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(flashBetGameSessionDto, list3222, list4222, (Function2) obj2, startRestartGroup, 0);
                if (flashBetGameSessionDto == null) {
                }
                PreloadCarouselImages(FlashBetMatchStartContent$lambda$7(collectAsState2222), startRestartGroup, 0);
                PreloadCarouselImages(FlashBetMatchStartContent$lambda$8(collectAsState3222), startRestartGroup, 0);
                startRestartGroup.startReplaceGroup(-518012912);
                list = list3222;
                if (!list.isEmpty()) {
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-518010096);
                list2 = list4222;
                if (!list2.isEmpty()) {
                }
                startRestartGroup.endReplaceGroup();
                float f1022 = 12;
                Modifier m1517paddingVpY3zN4222 = PaddingKt.m1517paddingVpY3zN4(ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, z3222 ? 1 : 0, null), ScrollKt.rememberScrollState(0, startRestartGroup, 0, z3222 ? 1 : 0), false, null, false, 14, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(f1022));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy522 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap1522 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier1522 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4222);
                Function0<ComposeUiNode> constructor1522 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy522, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap1522, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash1522 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash1522);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier1522, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance522 = ColumnScopeInstance.INSTANCE;
                Modifier fillMaxWidth$default322 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, z3222 ? 1 : 0, null);
                Arrangement.HorizontalOrVertical spaceBetween322 = Arrangement.INSTANCE.getSpaceBetween();
                Alignment.Vertical centerVertically522 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy522 = RowKt.rowMeasurePolicy(spaceBetween322, centerVertically522, startRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default322);
                Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy522, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting()) {
                }
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance522 = RowScopeInstance.INSTANCE;
                Painter painterResource222 = PainterResources_androidKt.painterResource(R.drawable.arrow_light_left, startRestartGroup, 6);
                float f2222 = 24;
                Modifier m1563size3ABfNKs222 = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2222));
                startRestartGroup.startReplaceGroup(-1633490746);
                int i17222 = i14222 & 3670016;
                changed4 = startRestartGroup.changed(function0222) | (i17222 != 1048576);
                Object rememberedValue14222 = startRestartGroup.rememberedValue();
                if (!changed4) {
                }
                Function0 function03222 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit FlashBetMatchStartContent$lambda$50$lambda$27$lambda$25$lambda$24;
                        FlashBetMatchStartContent$lambda$50$lambda$27$lambda$25$lambda$24 = FlashBetMatchStartContentKt.FlashBetMatchStartContent$lambda$50$lambda$27$lambda$25$lambda$24(Function0.this, onBackClick);
                        return FlashBetMatchStartContent$lambda$50$lambda$27$lambda$25$lambda$24;
                    }
                };
                startRestartGroup.updateRememberedValue(function03222);
                obj3 = function03222;
                startRestartGroup.endReplaceGroup();
                ImageKt.Image(painterResource222, "back", ClickAnimationModifierKt.clickAnimation(m1563size3ABfNKs222, (Function0) obj3, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 6, 0, 4094), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
                str = categoryLogoUrl;
                if (str.length() == 0) {
                }
                int i18222 = i15222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH;
                composer2 = startRestartGroup;
                MatchLeagueItemKt.MatchLeagueItem(null, str, categoryName, false, false, false, null, composer2, i18222, 121);
                SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2222)), composer2, 6);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                float f3222 = 8;
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3222)), composer2, 6);
                FlashBetMatchStartContent$lambda$4 = FlashBetMatchStartContent$lambda$4(collectAsState);
                if (FlashBetMatchStartContent$lambda$4 instanceof FlashBetMatchStartUiState.NoAvailableMatches) {
                }
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                }
                stateFlow4 = stateFlow2;
                function13 = function14222;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i3 |= i4;
            if ((i2 & 64) == 0) {
            }
            i3 |= i13;
            if ((i2 & 128) != 0) {
            }
            i3 |= i12;
            i5 = i2 & 256;
            if (i5 != 0) {
            }
            i6 = i2 & 512;
            if (i6 != 0) {
            }
            i7 = i3;
            if ((306783379 & i7) == 306783378) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<Context> localContext222 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume222 = startRestartGroup.consume(localContext222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Context applicationContext222 = ((Context) consume222).getApplicationContext();
            startRestartGroup.startReplaceGroup(5004770);
            changedInstance = startRestartGroup.changedInstance(applicationContext222);
            Object rememberedValue9222 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            Function0 function0422 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit FlashBetMatchStartContent$lambda$2$lambda$1;
                    FlashBetMatchStartContent$lambda$2$lambda$1 = FlashBetMatchStartContentKt.FlashBetMatchStartContent$lambda$2$lambda$1(applicationContext222);
                    return FlashBetMatchStartContent$lambda$2$lambda$1;
                }
            };
            startRestartGroup.updateRememberedValue(function0422);
            obj = function0422;
            final Function0 function02222 = (Function0) obj;
            startRestartGroup.endReplaceGroup();
            Unit unit222 = Unit.INSTANCE;
            startRestartGroup.startReplaceGroup(5004770);
            changedInstance2 = startRestartGroup.changedInstance(applicationContext222);
            Object rememberedValue10222 = startRestartGroup.rememberedValue();
            if (changedInstance2) {
            }
            flashBetMatchStartContentKt$FlashBetMatchStartContent$1$1 = new FlashBetMatchStartContentKt$FlashBetMatchStartContent$1$1(applicationContext222, null);
            startRestartGroup.updateRememberedValue(flashBetMatchStartContentKt$FlashBetMatchStartContent$1$1);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) flashBetMatchStartContentKt$FlashBetMatchStartContent$1$1, startRestartGroup, 6);
            if (stateFlow2 != null) {
            }
            int i142222 = i8;
            Function1<? super FlashBetGameSessionDto, Unit> function142222 = function12;
            collectAsState = SnapshotStateKt.collectAsState(stateFlow3, FlashBetMatchStartUiState.Idle.INSTANCE, null, startRestartGroup, 48, 2);
            if (flashBetMatchStartController == null) {
            }
            startRestartGroup.startReplaceGroup(-518116505);
            if (randomTeamImageUrlsTeam1 == null) {
            }
            startRestartGroup.endReplaceGroup();
            if (flashBetMatchStartController == null) {
            }
            startRestartGroup.startReplaceGroup(-518111289);
            if (randomTeamImageUrlsTeam2 == null) {
            }
            startRestartGroup.endReplaceGroup();
            State collectAsState22222 = SnapshotStateKt.collectAsState(randomTeamImageUrlsTeam1, CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
            State collectAsState32222 = SnapshotStateKt.collectAsState(randomTeamImageUrlsTeam2, CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
            long j22222 = ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor();
            Integer intOrNull2222 = StringsKt.toIntOrNull(sportId);
            if (intOrNull2222 == null) {
            }
            startRestartGroup.startReplaceGroup(-1633490746);
            changedInstance3 = startRestartGroup.changedInstance(flashBetMatchStartController) | ((i142222 & 14) != 4);
            rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance3) {
            }
            snapshotMutationPolicy = null;
            rememberedValue = new FlashBetMatchStartContentKt$FlashBetMatchStartContent$2$1(flashBetMatchStartController, sportId, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            int i152222 = i142222 << 3;
            EffectsKt.LaunchedEffect(flashBetMatchStartController, sportId, (Function2) rememberedValue, startRestartGroup, ((i142222 >> 15) & 14) | (i152222 & 112));
            FlashBetMatchStartUiState FlashBetMatchStartContent$lambda$422222 = FlashBetMatchStartContent$lambda$4(collectAsState);
            startRestartGroup.startReplaceGroup(5004770);
            changed = startRestartGroup.changed(FlashBetMatchStartContent$lambda$422222);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            FlashBetMatchStartUiState FlashBetMatchStartContent$lambda$432222 = FlashBetMatchStartContent$lambda$4(collectAsState);
            if (!(FlashBetMatchStartContent$lambda$432222 instanceof FlashBetMatchStartUiState.StartSuccess)) {
            }
            if (startSuccess == 0) {
            }
            startRestartGroup.updateRememberedValue(rememberedValue2);
            flashBetGameSessionDto = (FlashBetGameSessionDto) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 != Composer.INSTANCE.getEmpty()) {
            }
            mutableState = (MutableState) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 != Composer.INSTANCE.getEmpty()) {
            }
            mutableState2 = (MutableState) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            List<String> FlashBetMatchStartContent$lambda$72222 = FlashBetMatchStartContent$lambda$7(collectAsState22222);
            List<String> FlashBetMatchStartContent$lambda$82222 = FlashBetMatchStartContent$lambda$8(collectAsState32222);
            startRestartGroup.startReplaceGroup(-1746271574);
            changed2 = startRestartGroup.changed(FlashBetMatchStartContent$lambda$72222) | startRestartGroup.changed(flashBetGameSessionDto) | startRestartGroup.changed(FlashBetMatchStartContent$lambda$82222);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (changed2) {
            }
            if ((flashBetGameSessionDto == null ? flashBetGameSessionDto.getTeamDetails() : null) != null) {
            }
            startRestartGroup.updateRememberedValue(rememberedValue5);
            Pair pair4222 = (Pair) rememberedValue5;
            startRestartGroup.endReplaceGroup();
            Pair pair22222 = (Pair) pair4222.component1();
            Pair pair32222 = (Pair) pair4222.component2();
            List list32222 = (List) pair22222.getFirst();
            int intValue22222 = ((Number) pair22222.getSecond()).intValue();
            List list42222 = (List) pair32222.getFirst();
            int intValue32222 = ((Number) pair32222.getSecond()).intValue();
            FlashBetMatchStartUiState FlashBetMatchStartContent$lambda$442222 = FlashBetMatchStartContent$lambda$4(collectAsState);
            startRestartGroup.startReplaceGroup(-1633490746);
            int i162222 = i142222 & 234881024;
            changed3 = startRestartGroup.changed(collectAsState) | (i162222 != 67108864 ? z : false);
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (!changed3) {
            }
            rememberedValue6 = new FlashBetMatchStartContentKt$FlashBetMatchStartContent$4$1(function142222, collectAsState, null);
            startRestartGroup.updateRememberedValue(rememberedValue6);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(FlashBetMatchStartContent$lambda$442222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, startRestartGroup, 0);
            startRestartGroup.startReplaceGroup(-1746271574);
            changedInstance4 = startRestartGroup.changedInstance(flashBetGameSessionDto);
            rememberedValue7 = startRestartGroup.rememberedValue();
            if (!changedInstance4) {
            }
            rememberedValue7 = new FlashBetMatchStartContentKt$FlashBetMatchStartContent$5$1(flashBetGameSessionDto, mutableState, mutableState2, null);
            startRestartGroup.updateRememberedValue(rememberedValue7);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(flashBetGameSessionDto, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue7, startRestartGroup, 0);
            Boolean valueOf3222 = Boolean.valueOf(FlashBetMatchStartContent$lambda$12(mutableState));
            Boolean valueOf22222 = Boolean.valueOf(FlashBetMatchStartContent$lambda$15(mutableState2));
            startRestartGroup.startReplaceGroup(-1224400529);
            changedInstance5 = startRestartGroup.changedInstance(flashBetGameSessionDto) | (i162222 != 67108864 ? z : false);
            rememberedValue8 = startRestartGroup.rememberedValue();
            if (!changedInstance5) {
            }
            rememberedValue8 = new FlashBetMatchStartContentKt$FlashBetMatchStartContent$6$1(flashBetGameSessionDto, function142222, mutableState, mutableState2, null);
            startRestartGroup.updateRememberedValue(rememberedValue8);
            startRestartGroup.endReplaceGroup();
            boolean z32222 = z;
            EffectsKt.LaunchedEffect(valueOf3222, valueOf22222, flashBetGameSessionDto, (Function2) rememberedValue8, startRestartGroup, 0);
            startRestartGroup.startReplaceGroup(-1224400529);
            changedInstance6 = startRestartGroup.changedInstance(flashBetGameSessionDto) | startRestartGroup.changedInstance(list32222) | startRestartGroup.changedInstance(list42222) | (i162222 != 67108864 ? z32222 ? 1 : 0 : false);
            Object rememberedValue132222 = startRestartGroup.rememberedValue();
            if (!changedInstance6) {
            }
            FlashBetMatchStartContentKt$FlashBetMatchStartContent$7$1 flashBetMatchStartContentKt$FlashBetMatchStartContent$7$12222 = new FlashBetMatchStartContentKt$FlashBetMatchStartContent$7$1(flashBetGameSessionDto, list32222, list42222, function142222, null);
            startRestartGroup.updateRememberedValue(flashBetMatchStartContentKt$FlashBetMatchStartContent$7$12222);
            obj2 = flashBetMatchStartContentKt$FlashBetMatchStartContent$7$12222;
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(flashBetGameSessionDto, list32222, list42222, (Function2) obj2, startRestartGroup, 0);
            if (flashBetGameSessionDto == null) {
            }
            PreloadCarouselImages(FlashBetMatchStartContent$lambda$7(collectAsState22222), startRestartGroup, 0);
            PreloadCarouselImages(FlashBetMatchStartContent$lambda$8(collectAsState32222), startRestartGroup, 0);
            startRestartGroup.startReplaceGroup(-518012912);
            list = list32222;
            if (!list.isEmpty()) {
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-518010096);
            list2 = list42222;
            if (!list2.isEmpty()) {
            }
            startRestartGroup.endReplaceGroup();
            float f10222 = 12;
            Modifier m1517paddingVpY3zN42222 = PaddingKt.m1517paddingVpY3zN4(ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, z32222 ? 1 : 0, null), ScrollKt.rememberScrollState(0, startRestartGroup, 0, z32222 ? 1 : 0), false, null, false, 14, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(f10222));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy5222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap15222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier15222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN42222);
            Function0<ComposeUiNode> constructor15222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy5222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap15222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash15222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash15222);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier15222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance5222 = ColumnScopeInstance.INSTANCE;
            Modifier fillMaxWidth$default3222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, z32222 ? 1 : 0, null);
            Arrangement.HorizontalOrVertical spaceBetween3222 = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically5222 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy5222 = RowKt.rowMeasurePolicy(spaceBetween3222, centerVertically5222, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default3222);
            Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy5222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance5222 = RowScopeInstance.INSTANCE;
            Painter painterResource2222 = PainterResources_androidKt.painterResource(R.drawable.arrow_light_left, startRestartGroup, 6);
            float f22222 = 24;
            Modifier m1563size3ABfNKs2222 = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f22222));
            startRestartGroup.startReplaceGroup(-1633490746);
            int i172222 = i142222 & 3670016;
            changed4 = startRestartGroup.changed(function02222) | (i172222 != 1048576);
            Object rememberedValue142222 = startRestartGroup.rememberedValue();
            if (!changed4) {
            }
            Function0 function032222 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit FlashBetMatchStartContent$lambda$50$lambda$27$lambda$25$lambda$24;
                    FlashBetMatchStartContent$lambda$50$lambda$27$lambda$25$lambda$24 = FlashBetMatchStartContentKt.FlashBetMatchStartContent$lambda$50$lambda$27$lambda$25$lambda$24(Function0.this, onBackClick);
                    return FlashBetMatchStartContent$lambda$50$lambda$27$lambda$25$lambda$24;
                }
            };
            startRestartGroup.updateRememberedValue(function032222);
            obj3 = function032222;
            startRestartGroup.endReplaceGroup();
            ImageKt.Image(painterResource2222, "back", ClickAnimationModifierKt.clickAnimation(m1563size3ABfNKs2222, (Function0) obj3, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 6, 0, 4094), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
            str = categoryLogoUrl;
            if (str.length() == 0) {
            }
            int i182222 = i152222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH;
            composer2 = startRestartGroup;
            MatchLeagueItemKt.MatchLeagueItem(null, str, categoryName, false, false, false, null, composer2, i182222, 121);
            SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f22222)), composer2, 6);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            float f32222 = 8;
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f32222)), composer2, 6);
            FlashBetMatchStartContent$lambda$4 = FlashBetMatchStartContent$lambda$4(collectAsState);
            if (FlashBetMatchStartContent$lambda$4 instanceof FlashBetMatchStartUiState.NoAvailableMatches) {
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            stateFlow4 = stateFlow2;
            function13 = function142222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i2 & 32) == 0) {
        }
        i3 |= i4;
        if ((i2 & 64) == 0) {
        }
        i3 |= i13;
        if ((i2 & 128) != 0) {
        }
        i3 |= i12;
        i5 = i2 & 256;
        if (i5 != 0) {
        }
        i6 = i2 & 512;
        if (i6 != 0) {
        }
        i7 = i3;
        if ((306783379 & i7) == 306783378) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Context> localContext2222 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2222 = startRestartGroup.consume(localContext2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Context applicationContext2222 = ((Context) consume2222).getApplicationContext();
        startRestartGroup.startReplaceGroup(5004770);
        changedInstance = startRestartGroup.changedInstance(applicationContext2222);
        Object rememberedValue92222 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        Function0 function04222 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit FlashBetMatchStartContent$lambda$2$lambda$1;
                FlashBetMatchStartContent$lambda$2$lambda$1 = FlashBetMatchStartContentKt.FlashBetMatchStartContent$lambda$2$lambda$1(applicationContext2222);
                return FlashBetMatchStartContent$lambda$2$lambda$1;
            }
        };
        startRestartGroup.updateRememberedValue(function04222);
        obj = function04222;
        final Function0 function022222 = (Function0) obj;
        startRestartGroup.endReplaceGroup();
        Unit unit2222 = Unit.INSTANCE;
        startRestartGroup.startReplaceGroup(5004770);
        changedInstance2 = startRestartGroup.changedInstance(applicationContext2222);
        Object rememberedValue102222 = startRestartGroup.rememberedValue();
        if (changedInstance2) {
        }
        flashBetMatchStartContentKt$FlashBetMatchStartContent$1$1 = new FlashBetMatchStartContentKt$FlashBetMatchStartContent$1$1(applicationContext2222, null);
        startRestartGroup.updateRememberedValue(flashBetMatchStartContentKt$FlashBetMatchStartContent$1$1);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(unit2222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) flashBetMatchStartContentKt$FlashBetMatchStartContent$1$1, startRestartGroup, 6);
        if (stateFlow2 != null) {
        }
        int i1422222 = i8;
        Function1<? super FlashBetGameSessionDto, Unit> function1422222 = function12;
        collectAsState = SnapshotStateKt.collectAsState(stateFlow3, FlashBetMatchStartUiState.Idle.INSTANCE, null, startRestartGroup, 48, 2);
        if (flashBetMatchStartController == null) {
        }
        startRestartGroup.startReplaceGroup(-518116505);
        if (randomTeamImageUrlsTeam1 == null) {
        }
        startRestartGroup.endReplaceGroup();
        if (flashBetMatchStartController == null) {
        }
        startRestartGroup.startReplaceGroup(-518111289);
        if (randomTeamImageUrlsTeam2 == null) {
        }
        startRestartGroup.endReplaceGroup();
        State collectAsState222222 = SnapshotStateKt.collectAsState(randomTeamImageUrlsTeam1, CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
        State collectAsState322222 = SnapshotStateKt.collectAsState(randomTeamImageUrlsTeam2, CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
        long j222222 = ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor();
        Integer intOrNull22222 = StringsKt.toIntOrNull(sportId);
        if (intOrNull22222 == null) {
        }
        startRestartGroup.startReplaceGroup(-1633490746);
        changedInstance3 = startRestartGroup.changedInstance(flashBetMatchStartController) | ((i1422222 & 14) != 4);
        rememberedValue = startRestartGroup.rememberedValue();
        if (changedInstance3) {
        }
        snapshotMutationPolicy = null;
        rememberedValue = new FlashBetMatchStartContentKt$FlashBetMatchStartContent$2$1(flashBetMatchStartController, sportId, null);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        int i1522222 = i1422222 << 3;
        EffectsKt.LaunchedEffect(flashBetMatchStartController, sportId, (Function2) rememberedValue, startRestartGroup, ((i1422222 >> 15) & 14) | (i1522222 & 112));
        FlashBetMatchStartUiState FlashBetMatchStartContent$lambda$4222222 = FlashBetMatchStartContent$lambda$4(collectAsState);
        startRestartGroup.startReplaceGroup(5004770);
        changed = startRestartGroup.changed(FlashBetMatchStartContent$lambda$4222222);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        FlashBetMatchStartUiState FlashBetMatchStartContent$lambda$4322222 = FlashBetMatchStartContent$lambda$4(collectAsState);
        if (!(FlashBetMatchStartContent$lambda$4322222 instanceof FlashBetMatchStartUiState.StartSuccess)) {
        }
        if (startSuccess == 0) {
        }
        startRestartGroup.updateRememberedValue(rememberedValue2);
        flashBetGameSessionDto = (FlashBetGameSessionDto) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 != Composer.INSTANCE.getEmpty()) {
        }
        mutableState = (MutableState) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 != Composer.INSTANCE.getEmpty()) {
        }
        mutableState2 = (MutableState) rememberedValue4;
        startRestartGroup.endReplaceGroup();
        List<String> FlashBetMatchStartContent$lambda$722222 = FlashBetMatchStartContent$lambda$7(collectAsState222222);
        List<String> FlashBetMatchStartContent$lambda$822222 = FlashBetMatchStartContent$lambda$8(collectAsState322222);
        startRestartGroup.startReplaceGroup(-1746271574);
        changed2 = startRestartGroup.changed(FlashBetMatchStartContent$lambda$722222) | startRestartGroup.changed(flashBetGameSessionDto) | startRestartGroup.changed(FlashBetMatchStartContent$lambda$822222);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (changed2) {
        }
        if ((flashBetGameSessionDto == null ? flashBetGameSessionDto.getTeamDetails() : null) != null) {
        }
        startRestartGroup.updateRememberedValue(rememberedValue5);
        Pair pair42222 = (Pair) rememberedValue5;
        startRestartGroup.endReplaceGroup();
        Pair pair222222 = (Pair) pair42222.component1();
        Pair pair322222 = (Pair) pair42222.component2();
        List list322222 = (List) pair222222.getFirst();
        int intValue222222 = ((Number) pair222222.getSecond()).intValue();
        List list422222 = (List) pair322222.getFirst();
        int intValue322222 = ((Number) pair322222.getSecond()).intValue();
        FlashBetMatchStartUiState FlashBetMatchStartContent$lambda$4422222 = FlashBetMatchStartContent$lambda$4(collectAsState);
        startRestartGroup.startReplaceGroup(-1633490746);
        int i1622222 = i1422222 & 234881024;
        changed3 = startRestartGroup.changed(collectAsState) | (i1622222 != 67108864 ? z : false);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue6 = new FlashBetMatchStartContentKt$FlashBetMatchStartContent$4$1(function1422222, collectAsState, null);
        startRestartGroup.updateRememberedValue(rememberedValue6);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(FlashBetMatchStartContent$lambda$4422222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, startRestartGroup, 0);
        startRestartGroup.startReplaceGroup(-1746271574);
        changedInstance4 = startRestartGroup.changedInstance(flashBetGameSessionDto);
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (!changedInstance4) {
        }
        rememberedValue7 = new FlashBetMatchStartContentKt$FlashBetMatchStartContent$5$1(flashBetGameSessionDto, mutableState, mutableState2, null);
        startRestartGroup.updateRememberedValue(rememberedValue7);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(flashBetGameSessionDto, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue7, startRestartGroup, 0);
        Boolean valueOf32222 = Boolean.valueOf(FlashBetMatchStartContent$lambda$12(mutableState));
        Boolean valueOf222222 = Boolean.valueOf(FlashBetMatchStartContent$lambda$15(mutableState2));
        startRestartGroup.startReplaceGroup(-1224400529);
        changedInstance5 = startRestartGroup.changedInstance(flashBetGameSessionDto) | (i1622222 != 67108864 ? z : false);
        rememberedValue8 = startRestartGroup.rememberedValue();
        if (!changedInstance5) {
        }
        rememberedValue8 = new FlashBetMatchStartContentKt$FlashBetMatchStartContent$6$1(flashBetGameSessionDto, function1422222, mutableState, mutableState2, null);
        startRestartGroup.updateRememberedValue(rememberedValue8);
        startRestartGroup.endReplaceGroup();
        boolean z322222 = z;
        EffectsKt.LaunchedEffect(valueOf32222, valueOf222222, flashBetGameSessionDto, (Function2) rememberedValue8, startRestartGroup, 0);
        startRestartGroup.startReplaceGroup(-1224400529);
        changedInstance6 = startRestartGroup.changedInstance(flashBetGameSessionDto) | startRestartGroup.changedInstance(list322222) | startRestartGroup.changedInstance(list422222) | (i1622222 != 67108864 ? z322222 ? 1 : 0 : false);
        Object rememberedValue1322222 = startRestartGroup.rememberedValue();
        if (!changedInstance6) {
        }
        FlashBetMatchStartContentKt$FlashBetMatchStartContent$7$1 flashBetMatchStartContentKt$FlashBetMatchStartContent$7$122222 = new FlashBetMatchStartContentKt$FlashBetMatchStartContent$7$1(flashBetGameSessionDto, list322222, list422222, function1422222, null);
        startRestartGroup.updateRememberedValue(flashBetMatchStartContentKt$FlashBetMatchStartContent$7$122222);
        obj2 = flashBetMatchStartContentKt$FlashBetMatchStartContent$7$122222;
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(flashBetGameSessionDto, list322222, list422222, (Function2) obj2, startRestartGroup, 0);
        if (flashBetGameSessionDto == null) {
        }
        PreloadCarouselImages(FlashBetMatchStartContent$lambda$7(collectAsState222222), startRestartGroup, 0);
        PreloadCarouselImages(FlashBetMatchStartContent$lambda$8(collectAsState322222), startRestartGroup, 0);
        startRestartGroup.startReplaceGroup(-518012912);
        list = list322222;
        if (!list.isEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-518010096);
        list2 = list422222;
        if (!list2.isEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        float f102222 = 12;
        Modifier m1517paddingVpY3zN422222 = PaddingKt.m1517paddingVpY3zN4(ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, z322222 ? 1 : 0, null), ScrollKt.rememberScrollState(0, startRestartGroup, 0, z322222 ? 1 : 0), false, null, false, 14, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(f102222));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy52222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap152222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier152222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN422222);
        Function0<ComposeUiNode> constructor152222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy52222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap152222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash152222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash152222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier152222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance52222 = ColumnScopeInstance.INSTANCE;
        Modifier fillMaxWidth$default32222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, z322222 ? 1 : 0, null);
        Arrangement.HorizontalOrVertical spaceBetween32222 = Arrangement.INSTANCE.getSpaceBetween();
        Alignment.Vertical centerVertically52222 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy52222 = RowKt.rowMeasurePolicy(spaceBetween32222, centerVertically52222, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default32222);
        Function0<ComposeUiNode> constructor222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy52222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance52222 = RowScopeInstance.INSTANCE;
        Painter painterResource22222 = PainterResources_androidKt.painterResource(R.drawable.arrow_light_left, startRestartGroup, 6);
        float f222222 = 24;
        Modifier m1563size3ABfNKs22222 = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f222222));
        startRestartGroup.startReplaceGroup(-1633490746);
        int i1722222 = i1422222 & 3670016;
        changed4 = startRestartGroup.changed(function022222) | (i1722222 != 1048576);
        Object rememberedValue1422222 = startRestartGroup.rememberedValue();
        if (!changed4) {
        }
        Function0 function0322222 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit FlashBetMatchStartContent$lambda$50$lambda$27$lambda$25$lambda$24;
                FlashBetMatchStartContent$lambda$50$lambda$27$lambda$25$lambda$24 = FlashBetMatchStartContentKt.FlashBetMatchStartContent$lambda$50$lambda$27$lambda$25$lambda$24(Function0.this, onBackClick);
                return FlashBetMatchStartContent$lambda$50$lambda$27$lambda$25$lambda$24;
            }
        };
        startRestartGroup.updateRememberedValue(function0322222);
        obj3 = function0322222;
        startRestartGroup.endReplaceGroup();
        ImageKt.Image(painterResource22222, "back", ClickAnimationModifierKt.clickAnimation(m1563size3ABfNKs22222, (Function0) obj3, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 6, 0, 4094), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
        str = categoryLogoUrl;
        if (str.length() == 0) {
        }
        int i1822222 = i1522222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH;
        composer2 = startRestartGroup;
        MatchLeagueItemKt.MatchLeagueItem(null, str, categoryName, false, false, false, null, composer2, i1822222, 121);
        SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f222222)), composer2, 6);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        float f322222 = 8;
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f322222)), composer2, 6);
        FlashBetMatchStartContent$lambda$4 = FlashBetMatchStartContent$lambda$4(collectAsState);
        if (FlashBetMatchStartContent$lambda$4 instanceof FlashBetMatchStartUiState.NoAvailableMatches) {
        }
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        stateFlow4 = stateFlow2;
        function13 = function1422222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetMatchStartContent$lambda$2$lambda$1(Context context) {
        FlashBetUiSoundEffect flashBetUiSoundEffect = FlashBetUiSoundEffect.INSTANCE;
        Intrinsics.checkNotNull(context);
        flashBetUiSoundEffect.playClick(context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean FlashBetMatchStartContent$lambda$12(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FlashBetMatchStartContent$lambda$13(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean FlashBetMatchStartContent$lambda$15(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FlashBetMatchStartContent$lambda$16(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetMatchStartContent$lambda$50$lambda$27$lambda$25$lambda$24(Function0 function0, Function0 function02) {
        function0.invoke();
        function02.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetMatchStartContent$lambda$50$lambda$29$lambda$28(Function0 function0, Function0 function02) {
        function0.invoke();
        function02.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetMatchStartContent$lambda$50$lambda$31$lambda$30(Function0 function0, Function0 function02) {
        function0.invoke();
        function02.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetMatchStartContent$lambda$50$lambda$48$lambda$47$lambda$46$lambda$41$lambda$40$lambda$39$lambda$38$lambda$34$lambda$33$lambda$32(MutableState mutableState) {
        FlashBetMatchStartContent$lambda$13(mutableState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetMatchStartContent$lambda$50$lambda$48$lambda$47$lambda$46$lambda$41$lambda$40$lambda$39$lambda$38$lambda$37$lambda$36$lambda$35(MutableState mutableState) {
        FlashBetMatchStartContent$lambda$16(mutableState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetMatchStartContent$lambda$50$lambda$48$lambda$47$lambda$46$lambda$45$lambda$44$lambda$43(Function0 function0, Function0 function02) {
        function0.invoke();
        function02.invoke();
        return Unit.INSTANCE;
    }

    private static final void FlashBetNoMatchesInCategoryContent(final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(993293145);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(993293145, i2, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetNoMatchesInCategoryContent (FlashBetMatchStartContent.kt:460)");
            }
            float f = 8;
            Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(BorderKt.m1038borderziNgDLE(BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(12), 7, null), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f))), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f))), Dp.m7774constructorimpl(24));
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs);
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
            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.flash_bet_no_matches_in_category, startRestartGroup, 6), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 199728, 0, 130512);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(20)), startRestartGroup, 6);
            composer2 = startRestartGroup;
            CommonButtonKt.m12915CommonButtonUPEs2M4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, StringResources_androidKt.stringResource(R.string.flash_bet_back, startRestartGroup, 6), true, false, false, function0, false, false, false, false, false, null, null, true, false, null, null, null, null, null, composer2, ((i2 << 18) & 3670016) | 3126, 24576, 0, 2080688);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FlashBetNoMatchesInCategoryContent$lambda$53;
                    FlashBetNoMatchesInCategoryContent$lambda$53 = FlashBetMatchStartContentKt.FlashBetNoMatchesInCategoryContent$lambda$53(Function0.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return FlashBetNoMatchesInCategoryContent$lambda$53;
                }
            });
        }
    }

    private static final void FlashBetStartErrorContent(final String str, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-656498153);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-656498153, i3, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetStartErrorContent (FlashBetMatchStartContent.kt:499)");
            }
            float f = 8;
            Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(BorderKt.m1038borderziNgDLE(BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(12), 7, null), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f))), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f))), Dp.m7774constructorimpl(24));
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs);
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
            TextKt.m2642Text4IGK_g(str, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, (i3 & 14) | 199728, 0, 130512);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(20)), startRestartGroup, 6);
            composer2 = startRestartGroup;
            CommonButtonKt.m12915CommonButtonUPEs2M4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, StringResources_androidKt.stringResource(R.string.flash_bet_back, startRestartGroup, 6), true, false, false, function0, false, false, false, false, false, null, null, true, false, null, null, null, null, null, composer2, ((i3 << 15) & 3670016) | 3126, 24576, 0, 2080688);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FlashBetStartErrorContent$lambda$55;
                    FlashBetStartErrorContent$lambda$55 = FlashBetMatchStartContentKt.FlashBetStartErrorContent$lambda$55(str, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                    return FlashBetStartErrorContent$lambda$55;
                }
            });
        }
    }

    private static final void PreloadCarouselImages(final List<String> list, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-685279959);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-685279959, i2, -1, "org.betup.ui.fragment.flashbet.compose.PreloadCarouselImages (FlashBetMatchStartContent.kt:535)");
            }
            if (list.isEmpty()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit PreloadCarouselImages$lambda$56;
                            PreloadCarouselImages$lambda$56 = FlashBetMatchStartContentKt.PreloadCarouselImages$lambda$56(list, i, (Composer) obj, ((Integer) obj2).intValue());
                            return PreloadCarouselImages$lambda$56;
                        }
                    });
                    return;
                }
                return;
            }
            float f = 1;
            Modifier m1563size3ABfNKs = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f));
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit PreloadCarouselImages$lambda$58$lambda$57;
                        PreloadCarouselImages$lambda$58$lambda$57 = FlashBetMatchStartContentKt.PreloadCarouselImages$lambda$58$lambda$57((GraphicsLayerScope) obj);
                        return PreloadCarouselImages$lambda$58$lambda$57;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(m1563size3ABfNKs, (Function1) rememberedValue);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, graphicsLayer);
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
            startRestartGroup.startReplaceGroup(-953227412);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                SingletonAsyncImageKt.m8174AsyncImage10Xjiaw((String) it.next(), null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, startRestartGroup, 1573296, 0, 1976);
                f = f;
                startRestartGroup = startRestartGroup;
            }
            composer2 = startRestartGroup;
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
        }
        ScopeUpdateScope endRestartGroup2 = composer2.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreloadCarouselImages$lambda$61;
                    PreloadCarouselImages$lambda$61 = FlashBetMatchStartContentKt.PreloadCarouselImages$lambda$61(list, i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreloadCarouselImages$lambda$61;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreloadCarouselImages$lambda$58$lambda$57(GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha(0.0f);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void TeamRevealCarousel(final List<String> list, final int i, final Function0<Unit> function0, final long j, final int i2, final long j2, Modifier modifier, Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        Modifier.Companion companion;
        final Modifier modifier2;
        Composer startRestartGroup = composer.startRestartGroup(1373638303);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i4 & 8) != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i5 |= startRestartGroup.changed(j) ? 2048 : 1024;
        }
        if ((i4 & 16) != 0) {
            i5 |= 24576;
        } else if ((i3 & 24576) == 0) {
            i5 |= startRestartGroup.changed(i2) ? 16384 : 8192;
        }
        if ((i4 & 32) != 0) {
            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i5 |= startRestartGroup.changed(j2) ? 131072 : 65536;
            i6 = i4 & 64;
            if (i6 == 0) {
                i5 |= 1572864;
                companion = modifier;
            } else {
                companion = modifier;
                if ((i3 & 1572864) == 0) {
                    i5 |= startRestartGroup.changed(companion) ? 1048576 : 524288;
                }
            }
            if ((i5 & 599187) == 599186 || !startRestartGroup.getSkipping()) {
                if (i6 != 0) {
                    companion = Modifier.INSTANCE;
                }
                modifier2 = companion;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1373638303, i5, -1, "org.betup.ui.fragment.flashbet.compose.TeamRevealCarousel (FlashBetMatchStartContent.kt:569)");
                }
                if (!list.isEmpty()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$$ExternalSyntheticLambda21
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit TeamRevealCarousel$lambda$62;
                                TeamRevealCarousel$lambda$62 = FlashBetMatchStartContentKt.TeamRevealCarousel$lambda$62(list, i, function0, j, i2, j2, modifier2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                return TeamRevealCarousel$lambda$62;
                            }
                        });
                        return;
                    }
                    return;
                }
                final int size = list.size();
                int coerceIn = RangesKt.coerceIn(i, 0, size - 1);
                startRestartGroup.startReplaceGroup(5004770);
                boolean changed = startRestartGroup.changed(size);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$$ExternalSyntheticLambda22
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int TeamRevealCarousel$lambda$64$lambda$63;
                            TeamRevealCarousel$lambda$64$lambda$63 = FlashBetMatchStartContentKt.TeamRevealCarousel$lambda$64$lambda$63(size);
                            return Integer.valueOf(TeamRevealCarousel$lambda$64$lambda$63);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                int i7 = i5;
                PagerState rememberPagerStateWithoutSavedState = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(0, 0.0f, (Function0) rememberedValue, startRestartGroup, 6, 2);
                Object[] objArr = {rememberPagerStateWithoutSavedState, Integer.valueOf(size), Integer.valueOf(coerceIn), Long.valueOf(j), Integer.valueOf(i2), Long.valueOf(j2)};
                startRestartGroup.startReplaceGroup(-1224400529);
                boolean changed2 = startRestartGroup.changed(size) | ((458752 & i7) == 131072) | ((57344 & i7) == 16384) | startRestartGroup.changed(rememberPagerStateWithoutSavedState) | ((i7 & 7168) == 2048) | startRestartGroup.changed(coerceIn) | ((i7 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
                FlashBetMatchStartContentKt$TeamRevealCarousel$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new FlashBetMatchStartContentKt$TeamRevealCarousel$2$1(size, j2, i2, rememberPagerStateWithoutSavedState, coerceIn, function0, j, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(objArr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 0);
                PagerKt.m1761HorizontalPager8jOkeI(rememberPagerStateWithoutSavedState, modifier2, null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-750019778, true, new Function4<PagerScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$TeamRevealCarousel$3
                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer2, Integer num2) {
                        invoke(pagerScope, num.intValue(), composer2, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PagerScope HorizontalPager, int i8, Composer composer2, int i9) {
                        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-750019778, i9, -1, "org.betup.ui.fragment.flashbet.compose.TeamRevealCarousel.<anonymous> (FlashBetMatchStartContent.kt:595)");
                        }
                        String str = list.get(i8);
                        Modifier clip = ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(8)));
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, clip);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer m4610constructorimpl = Updater.m4610constructorimpl(composer2);
                        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(str, null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, composer2, 1573296, 0, 1976);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), startRestartGroup, ((i7 >> 15) & 112) | 100663296, 24576, 16124);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier2 = companion;
            }
            ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
            if (endRestartGroup2 != null) {
                final Modifier modifier3 = modifier2;
                endRestartGroup2.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit TeamRevealCarousel$lambda$66;
                        TeamRevealCarousel$lambda$66 = FlashBetMatchStartContentKt.TeamRevealCarousel$lambda$66(list, i, function0, j, i2, j2, modifier3, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                        return TeamRevealCarousel$lambda$66;
                    }
                });
                return;
            }
            return;
        }
        i6 = i4 & 64;
        if (i6 == 0) {
        }
        if ((i5 & 599187) == 599186) {
        }
        if (i6 != 0) {
        }
        modifier2 = companion;
        if (ComposerKt.isTraceInProgress()) {
        }
        if (!list.isEmpty()) {
        }
    }

    /* renamed from: PrizeRow-XO-JAsU, reason: not valid java name */
    private static final void m13721PrizeRowXOJAsU(final String str, final String str2, final long j, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-200002073);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= startRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i2 & Opcodes.I2S) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-200002073, i2, -1, "org.betup.ui.fragment.flashbet.compose.PrizeRow (FlashBetMatchStartContent.kt:616)");
            }
            long j2 = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
            Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(24), Dp.m7774constructorimpl(4));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
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
            TextKt.m2642Text4IGK_g(str, SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(100)), j2, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, (i2 & 14) | 199728, 0, 131024);
            Modifier m1568width3ABfNKs = SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(32));
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1568width3ABfNKs);
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
            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TextKt.m2642Text4IGK_g("→", (Modifier) null, j2, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 199686, 0, 131026);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            TextKt.m2642Text4IGK_g(str2, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), j, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7659getEnde0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, ((i2 >> 3) & 14) | 199728 | (i2 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 0, 130512);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PrizeRow_XO_JAsU$lambda$69;
                    PrizeRow_XO_JAsU$lambda$69 = FlashBetMatchStartContentKt.PrizeRow_XO_JAsU$lambda$69(str, str2, j, i, (Composer) obj, ((Integer) obj2).intValue());
                    return PrizeRow_XO_JAsU$lambda$69;
                }
            });
        }
    }

    private static final void PreviewFlashBetMatchStartContentFootball(Composer composer, final int i) {
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-352899824);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-352899824, i, -1, "org.betup.ui.fragment.flashbet.compose.PreviewFlashBetMatchStartContentFootball (FlashBetMatchStartContent.kt:659)");
            }
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = FlowKt.asStateFlow(StateFlowKt.MutableStateFlow(FlashBetMatchStartUiState.Idle.INSTANCE));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            StateFlow stateFlow = (StateFlow) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Function0 function0 = (Function0) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            FlashBetMatchStartContent("22", "Premier League", "https://picsum.photos/200", "https://picsum.photos/64", 100L, null, function0, (Function0) rememberedValue3, null, stateFlow, startRestartGroup, 14380470, 256);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewFlashBetMatchStartContentFootball$lambda$75;
                    PreviewFlashBetMatchStartContentFootball$lambda$75 = FlashBetMatchStartContentKt.PreviewFlashBetMatchStartContentFootball$lambda$75(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewFlashBetMatchStartContentFootball$lambda$75;
                }
            });
        }
    }

    private static final void PreviewFlashBetMatchStartContentHighEntry(Composer composer, final int i) {
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(347045839);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(347045839, i, -1, "org.betup.ui.fragment.flashbet.compose.PreviewFlashBetMatchStartContentHighEntry (FlashBetMatchStartContent.kt:682)");
            }
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = FlowKt.asStateFlow(StateFlowKt.MutableStateFlow(FlashBetMatchStartUiState.Idle.INSTANCE));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            StateFlow stateFlow = (StateFlow) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Function0 function0 = (Function0) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            FlashBetMatchStartContent("5", "La Liga", "", "", 500L, null, function0, (Function0) rememberedValue3, null, stateFlow, startRestartGroup, 14380470, 256);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewFlashBetMatchStartContentHighEntry$lambda$81;
                    PreviewFlashBetMatchStartContentHighEntry$lambda$81 = FlashBetMatchStartContentKt.PreviewFlashBetMatchStartContentHighEntry$lambda$81(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewFlashBetMatchStartContentHighEntry$lambda$81;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FlashBetMatchStartUiState FlashBetMatchStartContent$lambda$4(State<? extends FlashBetMatchStartUiState> state) {
        return state.getValue();
    }

    private static final List<String> FlashBetMatchStartContent$lambda$7(State<? extends List<String>> state) {
        return state.getValue();
    }

    private static final List<String> FlashBetMatchStartContent$lambda$8(State<? extends List<String>> state) {
        return state.getValue();
    }
}
