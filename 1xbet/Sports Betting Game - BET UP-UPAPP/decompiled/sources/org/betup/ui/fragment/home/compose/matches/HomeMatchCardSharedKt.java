package org.betup.ui.fragment.home.compose.matches;

import android.content.Context;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextMeasurerHelperKt;
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
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import coil3.compose.SingletonAsyncImageKt;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import com.google.logging.type.LogSeverity;
import com.ironsource.X2;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.extractor.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.betup.R;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.betup.ui.common.compose.AutoResizeSiblingsTextKt;
import org.betup.ui.common.compose.ClickAnimationModifierKt;
import org.betup.ui.common.compose.CommonButtonMatchBetKt;
import org.betup.ui.fragment.home.compose.HomeMatchItem;
import org.betup.ui.fragment.home.compose.HomeMatchOddUi;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.OddHelper;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: HomeMatchCardShared.kt */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\u001aC\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\t¢\u0006\u0002\b\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\u0015\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\u000eH\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u0010\u0015\u001a\u0017\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0017\u001a\u0015\u0010\u0018\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a\u0085\u0001\u0010\u0019\u001a\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0\u00072\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0\u00072\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020#0\u00072\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010'\u001aU\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020#2\u0006\u0010,\u001a\u00020#2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010-\u001aE\u0010.\u001a\u00020\u00012\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u001b2\u000e\b\u0002\u00101\u001a\b\u0012\u0004\u0012\u0002020\u001b2\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u00020\u00110\u001b2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u00104\u001a%\u00105\u001a\u00020\u00012\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u001b2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u00106\u001a\r\u00107\u001a\u00020\u0014H\u0003¢\u0006\u0002\u0010\u0015\u001a\u0011\u00108\u001a\u000209*\u00020:H\u0003¢\u0006\u0002\u0010;\u001a:\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u001b2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u001b2\f\u00101\u001a\b\u0012\u0004\u0012\u0002020\u001b2\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u00020\u00110\u001bH\u0000\u001a\u0010\u0010>\u001a\u00020#2\u0006\u0010?\u001a\u00020\u0011H\u0000\u001a%\u0010@\u001a\u0004\u0018\u00010\u001e2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00110\u001b2\u0006\u0010A\u001a\u00020\u001eH\u0000¢\u0006\u0002\u0010B\u001a2\u0010C\u001a\b\u0012\u0004\u0012\u00020=0\u001b2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u001b2\f\u00101\u001a\b\u0012\u0004\u0012\u0002020\u001b2\u0006\u0010D\u001a\u00020\u001eH\u0002\u001a*\u0010E\u001a\b\u0012\u0004\u0012\u00020=0\u001b2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u001b2\f\u00101\u001a\b\u0012\u0004\u0012\u0002020\u001bH\u0002\u001a\u0018\u0010F\u001a\u00020:2\u0006\u0010G\u001a\u0002022\u0006\u0010H\u001a\u000202H\u0002\u001a$\u0010I\u001a\b\u0012\u0004\u0012\u0002000\u001b2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u001b2\u0006\u0010A\u001a\u00020\u001eH\u0002\u001a$\u0010J\u001a\b\u0012\u0004\u0012\u0002020\u001b2\f\u00101\u001a\b\u0012\u0004\u0012\u0002020\u001b2\u0006\u0010A\u001a\u00020\u001eH\u0002\u001a$\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00110\u001b2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00110\u001b2\u0006\u0010A\u001a\u00020\u001eH\u0002\u001a\u001f\u0010L\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010M\u001a1\u0010N\u001a\u00020\u00012\u0006\u0010O\u001a\u00020\u00112\u0006\u0010P\u001a\u00020\u00112\u0006\u0010Q\u001a\u00020R2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0004\bS\u0010T\u001a\u0015\u0010\\\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0003¢\u0006\u0002\u0010\u000f\u001a!\u0010]\u001a\u00020\u00012\b\u0010^\u001a\u0004\u0018\u00010\u001e2\b\u0010_\u001a\u0004\u0018\u00010\u001eH\u0003¢\u0006\u0002\u0010`\u001a\u0015\u0010a\u001a\u00020Z2\u0006\u0010b\u001a\u00020\u001eH\u0002¢\u0006\u0002\u0010c\u001a'\u0010d\u001a\u00020\u00012\u0006\u0010e\u001a\u00020\u00112\u0006\u0010f\u001a\u00020V2\u0006\u0010g\u001a\u00020ZH\u0003¢\u0006\u0004\bh\u0010i\u001a\r\u0010j\u001a\u00020\u0014H\u0001¢\u0006\u0002\u0010\u0015\u001a\u001d\u0010k\u001a\u00020\u00012\u0006\u0010l\u001a\u00020\u00112\u0006\u0010m\u001a\u00020\u0011H\u0001¢\u0006\u0002\u0010n\u001a\u0017\u0010o\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0017\u001a\f\u0010p\u001a\u00020#*\u00020\u000eH\u0000\"\u0010\u0010U\u001a\u00020VX\u0082\u0004¢\u0006\u0004\n\u0002\u0010W\"\u0010\u0010X\u001a\u00020VX\u0082\u0004¢\u0006\u0004\n\u0002\u0010W\"\u0010\u0010Y\u001a\u00020ZX\u0082\u0004¢\u0006\u0004\n\u0002\u0010[¨\u0006q²\u0006\n\u0010r\u001a\u000200X\u008a\u0084\u0002²\u0006\n\u0010s\u001a\u000200X\u008a\u0084\u0002"}, d2 = {"HomeMatchCardContainer", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "HomeMatchCardHeader", "item", "Lorg/betup/ui/fragment/home/compose/HomeMatchItem;", "(Lorg/betup/ui/fragment/home/compose/HomeMatchItem;Landroidx/compose/runtime/Composer;I)V", "homeMatchSportLeagueHeaderText", "", "(Lorg/betup/ui/fragment/home/compose/HomeMatchItem;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "homeMatchSportLeagueHeaderStyle", "Landroidx/compose/ui/text/TextStyle;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;", "HomePulsingLiveDot", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "HomeMatchInnerTeamsBlock", "HomeMatchOddsRow", "odds", "", "Lorg/betup/ui/fragment/home/compose/HomeMatchOddUi;", GetRandomTeamImagesInteractor.KEY_SPORT_ID, "", "oddType", "Lorg/betup/model/local/entity/OddType;", "isBetSelected", "", "", "isBetValidating", "isBetLocked", "onBetClick", "(Ljava/util/List;ILorg/betup/model/local/entity/OddType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "HomeMatchBetButton", "odd", "isSelected", "isValidating", "isLocked", "(Lorg/betup/ui/fragment/home/compose/HomeMatchOddUi;ILorg/betup/model/local/entity/OddType;ZZZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "HomeMatchSentimentBar", "percents", "", "coefficients", "", "betNames", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "HomeMatchBinarySentimentBar", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "homeSentimentLabelStyle", "toComposeColor", "Landroidx/compose/ui/graphics/Color;", "Lorg/betup/ui/fragment/home/compose/matches/SentimentBarColor;", "(Lorg/betup/ui/fragment/home/compose/matches/SentimentBarColor;Landroidx/compose/runtime/Composer;I)J", "resolveSentimentSegments", "Lorg/betup/ui/fragment/home/compose/matches/HomeSentimentSegment;", "isDrawOutcome", "betName", "resolveDrawIndex", "outcomeCount", "(Ljava/util/List;I)Ljava/lang/Integer;", "buildThreeWaySegments", "drawIndex", "buildTwoWaySegments", "teamSentimentColor", "thisCoef", "otherCoef", "normalizeSentimentPercents", "normalizeSentimentCoefficients", "normalizeSentimentBetNames", "HomeMatchTeamsBlock", "(Lorg/betup/ui/fragment/home/compose/HomeMatchItem;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "HomeMatchTeamColumn", "teamName", "logoUrl", TtmlNode.ATTR_TTS_TEXT_ALIGN, "Landroidx/compose/ui/text/style/TextAlign;", "HomeMatchTeamColumn-oTYcxuw", "(Ljava/lang/String;Ljava/lang/String;ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "HomeMatchScoreBaseFontSize", "Landroidx/compose/ui/unit/TextUnit;", "J", "HomeMatchScoreMinFontSize", "HomeMatchScoreRowGap", "Landroidx/compose/ui/unit/Dp;", "F", "HomeMatchCenterColumn", "HomeMatchScoreRow", "scoreHome", "scoreAway", "(Ljava/lang/Integer;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)V", "homeScoreChipHorizontalPadding", "maxDigitCount", "(I)F", "HomeScoreChip", "text", TtmlNode.ATTR_TTS_FONT_SIZE, "horizontalPadding", "HomeScoreChip-pezOeNo", "(Ljava/lang/String;JFLandroidx/compose/runtime/Composer;I)V", "homeTeamNameStyle", "HomeTeamLogo", "url", "name", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "HomeOddPlaceholderButton", "hasScore", "app_release", "scale", "alpha"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeMatchCardSharedKt {
    private static final long HomeMatchScoreBaseFontSize = TextUnitKt.getSp(13);
    private static final long HomeMatchScoreMinFontSize = TextUnitKt.getSp(9);
    private static final float HomeMatchScoreRowGap = Dp.m7774constructorimpl(4);

    /* compiled from: HomeMatchCardShared.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SentimentBarColor.values().length];
            try {
                iArr[SentimentBarColor.Green.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SentimentBarColor.Violet.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SentimentBarColor.Gold.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeMatchBetButton$lambda$26(HomeMatchOddUi homeMatchOddUi, int i, OddType oddType, boolean z, boolean z2, boolean z3, Function0 function0, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        HomeMatchBetButton(homeMatchOddUi, i, oddType, z, z2, z3, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeMatchBinarySentimentBar$lambda$28(List list, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HomeMatchBinarySentimentBar(list, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeMatchCardContainer$lambda$0(Function0 function0, Modifier modifier, Function3 function3, int i, int i2, Composer composer, int i3) {
        HomeMatchCardContainer(function0, modifier, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeMatchCardHeader$lambda$4(HomeMatchItem homeMatchItem, int i, Composer composer, int i2) {
        HomeMatchCardHeader(homeMatchItem, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeMatchCenterColumn$lambda$53(HomeMatchItem homeMatchItem, int i, Composer composer, int i2) {
        HomeMatchCenterColumn(homeMatchItem, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeMatchInnerTeamsBlock$lambda$13(HomeMatchItem homeMatchItem, int i, Composer composer, int i2) {
        HomeMatchInnerTeamsBlock(homeMatchItem, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeMatchOddsRow$lambda$23(List list, int i, OddType oddType, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        HomeMatchOddsRow(list, i, oddType, function1, function12, function13, function14, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeMatchScoreRow$lambda$54(Integer num, Integer num2, int i, Composer composer, int i2) {
        HomeMatchScoreRow(num, num2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeMatchSentimentBar$lambda$27(List list, List list2, List list3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HomeMatchSentimentBar(list, list2, list3, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeMatchTeamColumn_oTYcxuw$lambda$45(String str, String str2, int i, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        m13792HomeMatchTeamColumnoTYcxuw(str, str2, i, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeMatchTeamsBlock$lambda$43(HomeMatchItem homeMatchItem, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HomeMatchTeamsBlock(homeMatchItem, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeOddPlaceholderButton$lambda$58(Modifier modifier, int i, int i2, Composer composer, int i3) {
        HomeOddPlaceholderButton(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomePulsingLiveDot$lambda$11(Modifier modifier, int i, int i2, Composer composer, int i3) {
        HomePulsingLiveDot(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeScoreChip_pezOeNo$lambda$55(String str, long j, float f, int i, Composer composer, int i2) {
        m13793HomeScoreChippezOeNo(str, j, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeTeamLogo$lambda$57(String str, String str2, int i, Composer composer, int i2) {
        HomeTeamLogo(str, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeMatchCardContainer(final Function0<Unit> onClick, Modifier modifier, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(295860307);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i3 |= startRestartGroup.changedInstance(content) ? 256 : 128;
            }
            if ((i3 & Opcodes.I2S) == 146 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(295860307, i3, -1, "org.betup.ui.fragment.home.compose.matches.HomeMatchCardContainer (HomeMatchCardShared.kt:68)");
                }
                RoundedCornerShape m1810RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(12));
                int i5 = i3 << 3;
                Modifier modifier5 = modifier4;
                Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(ClickAnimationModifierKt.subtleClickAnimation(BackgroundKt.background$default(BorderKt.m1038borderziNgDLE(ClipKt.clip(modifier4, m1810RoundedCornerShape0680j_4), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.GiftBorder.INSTANCE.getBrush(), m1810RoundedCornerShape0680j_4), ComposeUtils.AppBrushPalette.GiftBackground.INSTANCE.getBrush(), null, 0.0f, 6, null), onClick, null, true, 0, false, false, 0.0f, false, 0.0f, null, startRestartGroup, (i5 & 112) | 3072, 0, 1018), HomeMatchCardDimensionsKt.getHomeMatchCardContentPadding());
                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                int i6 = (i5 & 7168) | 48;
                composer2 = startRestartGroup;
                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, Alignment.INSTANCE.getStart(), composer2, 6);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m1516padding3ABfNKs);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                m4610constructorimpl = Updater.m4610constructorimpl(composer2);
                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                content.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i6 >> 6) & 112) | 6));
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchCardSharedKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit HomeMatchCardContainer$lambda$0;
                        HomeMatchCardContainer$lambda$0 = HomeMatchCardSharedKt.HomeMatchCardContainer$lambda$0(Function0.this, modifier3, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return HomeMatchCardContainer$lambda$0;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & Opcodes.I2S) == 146) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        RoundedCornerShape m1810RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(12));
        int i52 = i3 << 3;
        Modifier modifier52 = modifier4;
        Modifier m1516padding3ABfNKs2 = PaddingKt.m1516padding3ABfNKs(ClickAnimationModifierKt.subtleClickAnimation(BackgroundKt.background$default(BorderKt.m1038borderziNgDLE(ClipKt.clip(modifier4, m1810RoundedCornerShape0680j_42), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.GiftBorder.INSTANCE.getBrush(), m1810RoundedCornerShape0680j_42), ComposeUtils.AppBrushPalette.GiftBackground.INSTANCE.getBrush(), null, 0.0f, 6, null), onClick, null, true, 0, false, false, 0.0f, false, 0.0f, null, startRestartGroup, (i52 & 112) | 3072, 0, 1018), HomeMatchCardDimensionsKt.getHomeMatchCardContentPadding());
        Arrangement.Vertical top2 = Arrangement.INSTANCE.getTop();
        int i62 = (i52 & 7168) | 48;
        composer2 = startRestartGroup;
        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(top2, Alignment.INSTANCE.getStart(), composer2, 6);
        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, m1516padding3ABfNKs2);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (!composer2.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(composer2);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        content.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i62 >> 6) & 112) | 6));
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier52;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void HomeMatchCardHeader(final HomeMatchItem item, Composer composer, final int i) {
        int i2;
        String str;
        String str2;
        String str3;
        String str4;
        Composer composer2;
        int i3;
        Composer composer3;
        Intrinsics.checkNotNullParameter(item, "item");
        Composer startRestartGroup = composer.startRestartGroup(1170626111);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(item) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1170626111, i2, -1, "org.betup.ui.fragment.home.compose.matches.HomeMatchCardHeader (HomeMatchCardShared.kt:83)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 54);
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
            String homeMatchSportLeagueHeaderText = homeMatchSportLeagueHeaderText(item, startRestartGroup, i2 & 14);
            if (homeMatchSportLeagueHeaderText != null) {
                startRestartGroup.startReplaceGroup(-1913778616);
                str = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                str2 = "C101@5232L9:Row.kt#2w3rfo";
                str3 = "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo";
                str4 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                TextKt.m3621Text4IGK_g(homeMatchSportLeagueHeaderText, rowScopeInstance.weight(Modifier.INSTANCE, 1.0f, false), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, homeMatchSportLeagueHeaderStyle(startRestartGroup, 0), startRestartGroup, 0, 3120, 55292);
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
                i3 = 0;
            } else {
                str = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                str2 = "C101@5232L9:Row.kt#2w3rfo";
                str3 = "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo";
                str4 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(-1913502189);
                i3 = 0;
                SpacerKt.Spacer(rowScopeInstance.weight(Modifier.INSTANCE, 1.0f, false), composer2, 0);
                composer2.endReplaceGroup();
            }
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(6));
            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, str3);
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4, centerVertically2, composer2, 54);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, i3);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str4);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer2);
            Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -407735110, str2);
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            String betsLabel = item.getBetsLabel();
            composer2.startReplaceGroup(1099660163);
            if (betsLabel == null) {
                composer3 = composer2;
            } else {
                composer3 = composer2;
                TextKt.m3621Text4IGK_g(betsLabel, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(11), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.openSansFamily(composer2, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null), composer3, 0, 3072, 57342);
            }
            composer3.endReplaceGroup();
            startRestartGroup = composer3;
            startRestartGroup.startReplaceGroup(1099672428);
            if (item.isLive()) {
                HomePulsingLiveDot(null, startRestartGroup, 0, 1);
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
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchCardSharedKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomeMatchCardHeader$lambda$4;
                    HomeMatchCardHeader$lambda$4 = HomeMatchCardSharedKt.HomeMatchCardHeader$lambda$4(HomeMatchItem.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return HomeMatchCardHeader$lambda$4;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final String homeMatchSportLeagueHeaderText(HomeMatchItem homeMatchItem, Composer composer, int i) {
        String str;
        String leagueName;
        composer.startReplaceGroup(-1875293374);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1875293374, i, -1, "org.betup.ui.fragment.home.compose.matches.homeMatchSportLeagueHeaderText (HomeMatchCardShared.kt:124)");
        }
        String sportName = homeMatchItem.getSportName();
        String str2 = null;
        if (sportName != null) {
            if (StringsKt.isBlank(sportName)) {
                sportName = null;
            }
            if (sportName != null) {
                str = sportName.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str, "toUpperCase(...)");
                leagueName = homeMatchItem.getLeagueName();
                if (leagueName != null || StringsKt.isBlank(leagueName)) {
                    leagueName = null;
                }
                if (str == null && leagueName != null) {
                    str2 = StringResources_androidKt.stringResource(R.string.home_match_sport_league_header, new Object[]{str, leagueName}, composer, 6);
                } else if (str == null) {
                    str2 = str;
                } else if (leagueName != null) {
                    str2 = leagueName;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return str2;
            }
        }
        str = null;
        leagueName = homeMatchItem.getLeagueName();
        if (leagueName != null) {
        }
        leagueName = null;
        if (str == null) {
        }
        if (str == null) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        return str2;
    }

    private static final TextStyle homeMatchSportLeagueHeaderStyle(Composer composer, int i) {
        composer.startReplaceGroup(-1022430468);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1022430468, i, -1, "org.betup.ui.fragment.home.compose.matches.homeMatchSportLeagueHeaderStyle (HomeMatchCardShared.kt:137)");
        }
        TextStyle textStyle = new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(11), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.openSansFamily(composer, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return textStyle;
    }

    private static final void HomePulsingLiveDot(Modifier modifier, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Composer startRestartGroup = composer.startRestartGroup(231198916);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) != 2 || !startRestartGroup.getSkipping()) {
            modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(231198916, i3, -1, "org.betup.ui.fragment.home.compose.matches.HomePulsingLiveDot (HomeMatchCardShared.kt:144)");
            }
            InfiniteTransition rememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition("home_live_dot_pulse", startRestartGroup, 6, 0);
            final State<Float> animateFloat = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.85f, 1.15f, AnimationSpecKt.m925infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(LogSeverity.EMERGENCY_VALUE, 0, null, 6, null), RepeatMode.Reverse, 0L, 4, null), "home_live_dot_scale", startRestartGroup, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0);
            final State<Float> animateFloat2 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.55f, 1.0f, AnimationSpecKt.m925infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(LogSeverity.EMERGENCY_VALUE, 0, null, 6, null), RepeatMode.Reverse, 0L, 4, null), "home_live_dot_alpha", startRestartGroup, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0);
            Modifier m1563size3ABfNKs = SizeKt.m1563size3ABfNKs(modifier3, Dp.m7774constructorimpl(8));
            startRestartGroup.startReplaceGroup(-1633490746);
            boolean changed = startRestartGroup.changed(animateFloat) | startRestartGroup.changed(animateFloat2);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchCardSharedKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit HomePulsingLiveDot$lambda$10$lambda$9;
                        HomePulsingLiveDot$lambda$10$lambda$9 = HomeMatchCardSharedKt.HomePulsingLiveDot$lambda$10$lambda$9(State.this, animateFloat2, (GraphicsLayerScope) obj);
                        return HomePulsingLiveDot$lambda$10$lambda$9;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            BoxKt.Box(BackgroundKt.m1025backgroundbw27NRU$default(ClipKt.clip(GraphicsLayerModifierKt.graphicsLayer(m1563size3ABfNKs, (Function1) rememberedValue), RoundedCornerShapeKt.getCircleShape()), ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), null, 2, null), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchCardSharedKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomePulsingLiveDot$lambda$11;
                    HomePulsingLiveDot$lambda$11 = HomeMatchCardSharedKt.HomePulsingLiveDot$lambda$11(Modifier.this, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return HomePulsingLiveDot$lambda$11;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomePulsingLiveDot$lambda$10$lambda$9(State state, State state2, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setScaleX(HomePulsingLiveDot$lambda$7(state));
        graphicsLayer.setScaleY(HomePulsingLiveDot$lambda$7(state));
        graphicsLayer.setAlpha(HomePulsingLiveDot$lambda$8(state2));
        return Unit.INSTANCE;
    }

    public static final void HomeMatchInnerTeamsBlock(final HomeMatchItem item, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(item, "item");
        Composer startRestartGroup = composer.startRestartGroup(-2138317761);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(item) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2138317761, i2, -1, "org.betup.ui.fragment.home.compose.matches.HomeMatchInnerTeamsBlock (HomeMatchCardShared.kt:178)");
            }
            RoundedCornerShape m1810RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(8));
            Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(BackgroundKt.background$default(BorderKt.m1038borderziNgDLE(ClipKt.clip(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), HomeMatchCardDimensionsKt.getHomeMatchCardTeamsBlockHeight()), m1810RoundedCornerShape0680j_4), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.GiftBorder.INSTANCE.getBrush(), m1810RoundedCornerShape0680j_4), ComposeUtils.AppBrushPalette.GiftBackground.INSTANCE.getBrush(), null, 0.0f, 6, null), Dp.m7774constructorimpl(10), Dp.m7774constructorimpl(6));
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
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
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            HomeMatchTeamsBlock(item, null, startRestartGroup, i2 & 14, 2);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchCardSharedKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomeMatchInnerTeamsBlock$lambda$13;
                    HomeMatchInnerTeamsBlock$lambda$13 = HomeMatchCardSharedKt.HomeMatchInnerTeamsBlock$lambda$13(HomeMatchItem.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return HomeMatchInnerTeamsBlock$lambda$13;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeMatchOddsRow(final List<HomeMatchOddUi> odds, final int i, final OddType oddType, final Function1<? super Long, Boolean> isBetSelected, final Function1<? super Long, Boolean> isBetValidating, final Function1<? super HomeMatchOddUi, Boolean> function1, final Function1<? super HomeMatchOddUi, Unit> function12, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        List<HomeMatchOddUi> take;
        Modifier modifier3;
        Composer composer2;
        String str;
        List list;
        int i6;
        String str2;
        int i7;
        Modifier modifier4;
        Composer composer3;
        boolean z;
        final Modifier modifier5;
        ScopeUpdateScope endRestartGroup;
        int i8;
        Function1<? super HomeMatchOddUi, Boolean> isBetLocked = function1;
        final Function1<? super HomeMatchOddUi, Unit> onBetClick = function12;
        Intrinsics.checkNotNullParameter(odds, "odds");
        Intrinsics.checkNotNullParameter(oddType, "oddType");
        Intrinsics.checkNotNullParameter(isBetSelected, "isBetSelected");
        Intrinsics.checkNotNullParameter(isBetValidating, "isBetValidating");
        Intrinsics.checkNotNullParameter(isBetLocked, "isBetLocked");
        Intrinsics.checkNotNullParameter(onBetClick, "onBetClick");
        Composer startRestartGroup = composer.startRestartGroup(1668247168);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(odds) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changed(oddType.ordinal()) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(isBetSelected) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(isBetValidating) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= startRestartGroup.changedInstance(isBetLocked) ? 131072 : 65536;
        }
        if ((i3 & 64) == 0) {
            i8 = (1572864 & i2) == 0 ? startRestartGroup.changedInstance(onBetClick) ? 1048576 : 524288 : 1572864;
            i5 = i3 & 128;
            if (i5 == 0) {
                i4 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                modifier2 = modifier;
                i4 |= startRestartGroup.changed(modifier2) ? 8388608 : 4194304;
                if ((i4 & 4793491) == 4793490 || !startRestartGroup.getSkipping()) {
                    Modifier modifier6 = i5 != 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1668247168, i4, -1, "org.betup.ui.fragment.home.compose.matches.HomeMatchOddsRow (HomeMatchCardShared.kt:204)");
                    }
                    take = CollectionsKt.take(odds, 3);
                    float m7774constructorimpl = Dp.m7774constructorimpl(6);
                    String str3 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                    String str4 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                    if (take.size() == 2) {
                        startRestartGroup.startReplaceGroup(1685219056);
                        Modifier m1549height3ABfNKs = SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(modifier6, 0.0f, 1, null), HomeMatchCardDimensionsKt.getHomeMatchCardOddsRowHeight());
                        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(m7774constructorimpl);
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Modifier modifier7 = modifier6;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4, centerVertically, startRestartGroup, 54);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1549height3ABfNKs);
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
                        startRestartGroup.startReplaceGroup(-668949822);
                        for (final HomeMatchOddUi homeMatchOddUi : take) {
                            boolean booleanValue = isBetSelected.invoke(Long.valueOf(homeMatchOddUi.getGrabbedBetId())).booleanValue();
                            boolean booleanValue2 = isBetValidating.invoke(Long.valueOf(homeMatchOddUi.getGrabbedBetId())).booleanValue();
                            boolean booleanValue3 = isBetLocked.invoke(homeMatchOddUi).booleanValue();
                            startRestartGroup.startReplaceGroup(-1633490746);
                            boolean changed = ((3670016 & i4) == 1048576) | startRestartGroup.changed(homeMatchOddUi);
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchCardSharedKt$$ExternalSyntheticLambda10
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit HomeMatchOddsRow$lambda$17$lambda$16$lambda$15$lambda$14;
                                        HomeMatchOddsRow$lambda$17$lambda$16$lambda$15$lambda$14 = HomeMatchCardSharedKt.HomeMatchOddsRow$lambda$17$lambda$16$lambda$15$lambda$14(Function1.this, homeMatchOddUi);
                                        return HomeMatchOddsRow$lambda$17$lambda$16$lambda$15$lambda$14;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceGroup();
                            Composer composer4 = startRestartGroup;
                            HomeMatchBetButton(homeMatchOddUi, i, oddType, booleanValue, booleanValue2, booleanValue3, (Function0) rememberedValue, RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer4, i4 & 1008, 0);
                            isBetLocked = function1;
                            onBetClick = function12;
                            startRestartGroup = composer4;
                            i4 = i4;
                        }
                        Composer composer5 = startRestartGroup;
                        composer5.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        composer5.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        composer5.endReplaceGroup();
                        composer2 = composer5;
                        modifier3 = modifier7;
                    } else {
                        int i9 = i4;
                        Composer composer6 = startRestartGroup;
                        composer6.startReplaceGroup(1686028001);
                        Modifier modifier8 = modifier6;
                        Modifier m1549height3ABfNKs2 = SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(modifier8, 0.0f, 1, null), HomeMatchCardDimensionsKt.getHomeMatchCardOddsRowHeight());
                        Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(m7774constructorimpl);
                        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(composer6, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_42, centerVertically2, composer6, 54);
                        ComposerKt.sourceInformationMarkerStart(composer6, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer6.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer6, m1549height3ABfNKs2);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer6, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(composer6.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer6.startReusableNode();
                        if (composer6.getInserting()) {
                            composer6.createNode(constructor2);
                        } else {
                            composer6.useNode();
                        }
                        Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer6);
                        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer6, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        composer6.startReplaceGroup(-1112920818);
                        int i10 = 0;
                        while (i10 < 3) {
                            final HomeMatchOddUi homeMatchOddUi2 = (HomeMatchOddUi) CollectionsKt.getOrNull(take, i10);
                            Modifier weight$default = RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null);
                            Alignment centerStart = Alignment.INSTANCE.getCenterStart();
                            ComposerKt.sourceInformationMarkerStart(composer6, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(centerStart, false);
                            ComposerKt.sourceInformationMarkerStart(composer6, -1323940314, str4);
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer6.getCurrentCompositionLocalMap();
                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer6, weight$default);
                            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer6, -692256719, str3);
                            if (!(composer6.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer6.startReusableNode();
                            if (composer6.getInserting()) {
                                composer6.createNode(constructor3);
                            } else {
                                composer6.useNode();
                            }
                            Composer m4610constructorimpl3 = Updater.m4610constructorimpl(composer6);
                            Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer6, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            if (homeMatchOddUi2 != null) {
                                composer6.startReplaceGroup(-2026805670);
                                boolean booleanValue4 = isBetSelected.invoke(Long.valueOf(homeMatchOddUi2.getGrabbedBetId())).booleanValue();
                                boolean booleanValue5 = isBetValidating.invoke(Long.valueOf(homeMatchOddUi2.getGrabbedBetId())).booleanValue();
                                boolean booleanValue6 = function1.invoke(homeMatchOddUi2).booleanValue();
                                composer6.startReplaceGroup(-1633490746);
                                int i11 = i9;
                                str = str3;
                                boolean changed2 = ((3670016 & i11) == 1048576) | composer6.changed(homeMatchOddUi2);
                                Object rememberedValue2 = composer6.rememberedValue();
                                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchCardSharedKt$$ExternalSyntheticLambda11
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit HomeMatchOddsRow$lambda$22$lambda$21$lambda$20$lambda$19$lambda$18;
                                            HomeMatchOddsRow$lambda$22$lambda$21$lambda$20$lambda$19$lambda$18 = HomeMatchCardSharedKt.HomeMatchOddsRow$lambda$22$lambda$21$lambda$20$lambda$19$lambda$18(Function1.this, homeMatchOddUi2);
                                            return HomeMatchOddsRow$lambda$22$lambda$21$lambda$20$lambda$19$lambda$18;
                                        }
                                    };
                                    composer6.updateRememberedValue(rememberedValue2);
                                }
                                composer6.endReplaceGroup();
                                str2 = str4;
                                i7 = i11;
                                list = take;
                                i6 = i10;
                                modifier4 = modifier8;
                                Composer composer7 = composer6;
                                HomeMatchBetButton(homeMatchOddUi2, i, oddType, booleanValue4, booleanValue5, booleanValue6, (Function0) rememberedValue2, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer6, (i11 & 112) | 12582912 | (i11 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 0);
                                composer7.endReplaceGroup();
                                composer3 = composer7;
                                z = true;
                            } else {
                                str = str3;
                                list = take;
                                i6 = i10;
                                Composer composer8 = composer6;
                                str2 = str4;
                                i7 = i9;
                                modifier4 = modifier8;
                                if (list.isEmpty()) {
                                    composer3 = composer8;
                                    composer3.startReplaceGroup(-2026179904);
                                    z = true;
                                    HomeOddPlaceholderButton(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer3, 6, 0);
                                    composer3.endReplaceGroup();
                                } else {
                                    composer3 = composer8;
                                    z = true;
                                    composer3.startReplaceGroup(-2026032654);
                                    SpacerKt.Spacer(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer3, 6);
                                    composer3.endReplaceGroup();
                                }
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            i10 = i6 + 1;
                            str3 = str;
                            composer6 = composer3;
                            modifier8 = modifier4;
                            str4 = str2;
                            take = list;
                            i9 = i7;
                        }
                        modifier3 = modifier8;
                        composer2 = composer6;
                        composer2.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier5 = modifier2;
                    composer2 = startRestartGroup;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchCardSharedKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit HomeMatchOddsRow$lambda$23;
                            HomeMatchOddsRow$lambda$23 = HomeMatchCardSharedKt.HomeMatchOddsRow$lambda$23(odds, i, oddType, isBetSelected, isBetValidating, function1, function12, modifier5, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return HomeMatchOddsRow$lambda$23;
                        }
                    });
                    return;
                }
                return;
            }
            modifier2 = modifier;
            if ((i4 & 4793491) == 4793490) {
            }
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            take = CollectionsKt.take(odds, 3);
            float m7774constructorimpl2 = Dp.m7774constructorimpl(6);
            String str32 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
            String str42 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
            if (take.size() == 2) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier5 = modifier3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 |= i8;
        i5 = i3 & 128;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        if ((i4 & 4793491) == 4793490) {
        }
        if (i5 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        take = CollectionsKt.take(odds, 3);
        float m7774constructorimpl22 = Dp.m7774constructorimpl(6);
        String str322 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
        String str422 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
        if (take.size() == 2) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier5 = modifier3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeMatchOddsRow$lambda$17$lambda$16$lambda$15$lambda$14(Function1 function1, HomeMatchOddUi homeMatchOddUi) {
        function1.invoke(homeMatchOddUi);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeMatchOddsRow$lambda$22$lambda$21$lambda$20$lambda$19$lambda$18(Function1 function1, HomeMatchOddUi homeMatchOddUi) {
        function1.invoke(homeMatchOddUi);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void HomeMatchBetButton(final HomeMatchOddUi homeMatchOddUi, final int i, final OddType oddType, final boolean z, final boolean z2, final boolean z3, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        String format;
        float homeMatchCardOddsRowHeight;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(481964034);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(homeMatchOddUi) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changed(oddType.ordinal()) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changed(z) ? 2048 : 1024;
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 16384 : 8192;
            }
            if ((i3 & 32) == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i4 |= startRestartGroup.changed(z3) ? 131072 : 65536;
            }
            if ((i3 & 64) == 0) {
                i4 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                i4 |= startRestartGroup.changedInstance(function0) ? 1048576 : 524288;
            }
            i5 = i3 & 128;
            if (i5 == 0) {
                i4 |= 12582912;
            } else if ((12582912 & i2) == 0) {
                modifier2 = modifier;
                i4 |= startRestartGroup.changed(modifier2) ? 8388608 : 4194304;
                if ((4793491 & i4) == 4793490 || !startRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 != 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(481964034, i4, -1, "org.betup.ui.fragment.home.compose.matches.HomeMatchBetButton (HomeMatchCardShared.kt:279)");
                    }
                    format = OddHelper.format(oddType, homeMatchOddUi.getCoefficient());
                    if (format == null) {
                        format = "";
                    }
                    if (z3) {
                        homeMatchCardOddsRowHeight = HomeMatchCardDimensionsKt.getHomeMatchCardLockedOddsButtonHeight();
                    } else {
                        homeMatchCardOddsRowHeight = HomeMatchCardDimensionsKt.getHomeMatchCardOddsRowHeight();
                    }
                    Modifier m1549height3ABfNKs = SizeKt.m1549height3ABfNKs(modifier4, homeMatchCardOddsRowHeight);
                    Alignment centerStart = Alignment.INSTANCE.getCenterStart();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(centerStart, false);
                    Modifier modifier5 = modifier4;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1549height3ABfNKs);
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
                    int i6 = i4 >> 6;
                    String str = format;
                    composer2 = startRestartGroup;
                    CommonButtonMatchBetKt.CommonButtonMatchBet(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), z, homeMatchOddUi.getBetName(), true, true, str, !z2, function0, null, false, false, Integer.valueOf(i), false, z3, false, true, false, null, composer2, (i6 & 112) | 27654 | ((i4 << 3) & 29360128), (i4 & 112) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i6 & 7168), 218880);
                    composer2.startReplaceGroup(446669868);
                    if (z2) {
                        Modifier m1024backgroundbw27NRU = BackgroundKt.m1024backgroundbw27NRU(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100)));
                        Alignment center = Alignment.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, m1024backgroundbw27NRU);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer2);
                        Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        ProgressIndicatorKt.m2521CircularProgressIndicatorLxG7B9w(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(20)), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0.0f, 0L, 0, composer2, 6, 28);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
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
                    modifier3 = modifier5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    composer2 = startRestartGroup;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchCardSharedKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit HomeMatchBetButton$lambda$26;
                            HomeMatchBetButton$lambda$26 = HomeMatchCardSharedKt.HomeMatchBetButton$lambda$26(HomeMatchOddUi.this, i, oddType, z, z2, z3, function0, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return HomeMatchBetButton$lambda$26;
                        }
                    });
                    return;
                }
                return;
            }
            modifier2 = modifier;
            if ((4793491 & i4) == 4793490) {
            }
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            format = OddHelper.format(oddType, homeMatchOddUi.getCoefficient());
            if (format == null) {
            }
            if (z3) {
            }
            Modifier m1549height3ABfNKs2 = SizeKt.m1549height3ABfNKs(modifier4, homeMatchCardOddsRowHeight);
            Alignment centerStart2 = Alignment.INSTANCE.getCenterStart();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(centerStart2, false);
            Modifier modifier52 = modifier4;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m1549height3ABfNKs2);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            int i62 = i4 >> 6;
            String str2 = format;
            composer2 = startRestartGroup;
            CommonButtonMatchBetKt.CommonButtonMatchBet(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), z, homeMatchOddUi.getBetName(), true, true, str2, !z2, function0, null, false, false, Integer.valueOf(i), false, z3, false, true, false, null, composer2, (i62 & 112) | 27654 | ((i4 << 3) & 29360128), (i4 & 112) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i62 & 7168), 218880);
            composer2.startReplaceGroup(446669868);
            if (z2) {
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        i5 = i3 & 128;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        if ((4793491 & i4) == 4793490) {
        }
        if (i5 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        format = OddHelper.format(oddType, homeMatchOddUi.getCoefficient());
        if (format == null) {
        }
        if (z3) {
        }
        Modifier m1549height3ABfNKs22 = SizeKt.m1549height3ABfNKs(modifier4, homeMatchCardOddsRowHeight);
        Alignment centerStart22 = Alignment.INSTANCE.getCenterStart();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(centerStart22, false);
        Modifier modifier522 = modifier4;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, m1549height3ABfNKs22);
        Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance32 = BoxScopeInstance.INSTANCE;
        int i622 = i4 >> 6;
        String str22 = format;
        composer2 = startRestartGroup;
        CommonButtonMatchBetKt.CommonButtonMatchBet(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), z, homeMatchOddUi.getBetName(), true, true, str22, !z2, function0, null, false, false, Integer.valueOf(i), false, z3, false, true, false, null, composer2, (i622 & 112) | 27654 | ((i4 << 3) & 29360128), (i4 & 112) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i622 & 7168), 218880);
        composer2.startReplaceGroup(446669868);
        if (z2) {
        }
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier522;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void HomeMatchSentimentBar(final List<Float> percents, List<Double> list, List<String> list2, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(percents, "percents");
        Composer startRestartGroup = composer.startRestartGroup(1677920082);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(percents) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(list) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(list2) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                list = CollectionsKt.emptyList();
            }
            if (i5 != 0) {
                list2 = CollectionsKt.emptyList();
            }
            if (i6 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1677920082, i3, -1, "org.betup.ui.fragment.home.compose.matches.HomeMatchSentimentBar (HomeMatchCardShared.kt:339)");
            }
            final List<HomeSentimentSegment> resolveSentimentSegments = resolveSentimentSegments(percents, list, list2);
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalDensity().provides(DensityKt.Density(((Density) consume).getDensity(), 1.0f)), ComposableLambdaKt.rememberComposableLambda(-1101841390, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchCardSharedKt$HomeMatchSentimentBar$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    long composeColor;
                    TextStyle homeSentimentLabelStyle;
                    Composer composer3 = composer2;
                    int i8 = 2;
                    if ((i7 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1101841390, i7, -1, "org.betup.ui.fragment.home.compose.matches.HomeMatchSentimentBar.<anonymous> (HomeMatchCardShared.kt:343)");
                    }
                    float f = 0.0f;
                    int i9 = 1;
                    Object obj = null;
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.this, 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(3));
                    List<HomeSentimentSegment> list3 = resolveSentimentSegments;
                    ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer3, 6);
                    String str = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    String str2 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer m4610constructorimpl = Updater.m4610constructorimpl(composer2);
                    Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Modifier m1551heightInVpY3zN4$default = SizeKt.m1551heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(12), 0.0f, 2, null);
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    String str3 = "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo";
                    ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, m1551heightInVpY3zN4$default);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer2);
                    Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    String str4 = "C101@5232L9:Row.kt#2w3rfo";
                    ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    composer3.startReplaceGroup(1223965132);
                    List<HomeSentimentSegment> list4 = list3;
                    for (HomeSentimentSegment homeSentimentSegment : list4) {
                        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, RangesKt.coerceAtLeast(homeSentimentSegment.getPercent(), 1.0f), false, 2, null), f, i9, obj);
                        Alignment centerStart = list3.size() == i8 ? Intrinsics.areEqual(homeSentimentSegment, CollectionsKt.first((List) list3)) ? Alignment.INSTANCE.getCenterStart() : Alignment.INSTANCE.getCenterEnd() : Alignment.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(centerStart, false);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default2);
                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str2);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer3.createNode(constructor3);
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
                        ComposerKt.sourceInformationMarkerStart(composer3, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        String stringResource = StringResources_androidKt.stringResource(R.string.home_daily_quests_percent, new Object[]{Integer.valueOf((int) homeSentimentSegment.getPercent())}, composer3, 6);
                        homeSentimentLabelStyle = HomeMatchCardSharedKt.homeSentimentLabelStyle(composer3, 0);
                        TextKt.m3621Text4IGK_g(stringResource, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, homeSentimentLabelStyle, composer2, 0, 3072, 57342);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer3 = composer2;
                        list3 = list3;
                        str2 = str2;
                        str = str;
                        str4 = str4;
                        str3 = str3;
                        obj = null;
                        i9 = 1;
                        f = 0.0f;
                        i8 = 2;
                    }
                    String str5 = str;
                    String str6 = str4;
                    composer2.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Modifier m1025backgroundbw27NRU$default = BackgroundKt.m1025backgroundbw27NRU$default(ClipKt.clip(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), HomeMatchCardDimensionsKt.getHomeMatchSentimentBarTrackHeight()), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(2))), ComposeUtils.AppColorPalette.ScreenBackground.INSTANCE.getColor(), null, 2, null);
                    ComposerKt.sourceInformationMarkerStart(composer2, 693286680, str3);
                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str5);
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, m1025backgroundbw27NRU$default);
                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str2);
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
                    Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -407735110, str6);
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    composer2.startReplaceGroup(60283329);
                    for (HomeSentimentSegment homeSentimentSegment2 : list4) {
                        Modifier weight$default = RowScope.weight$default(rowScopeInstance2, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), RangesKt.coerceAtLeast(homeSentimentSegment2.getPercent(), 1.0f), false, 2, null);
                        composeColor = HomeMatchCardSharedKt.toComposeColor(homeSentimentSegment2.getColor(), composer2, 0);
                        BoxKt.Box(BackgroundKt.m1025backgroundbw27NRU$default(weight$default, composeColor, null, 2, null), composer2, 0);
                    }
                    composer2.endReplaceGroup();
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
                }
            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final List<Double> list3 = list;
        final List<String> list4 = list2;
        final Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchCardSharedKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomeMatchSentimentBar$lambda$27;
                    HomeMatchSentimentBar$lambda$27 = HomeMatchCardSharedKt.HomeMatchSentimentBar$lambda$27(percents, list3, list4, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return HomeMatchSentimentBar$lambda$27;
                }
            });
        }
    }

    public static final void HomeMatchBinarySentimentBar(final List<Float> percents, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(percents, "percents");
        Composer startRestartGroup = composer.startRestartGroup(-722365965);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(percents) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-722365965, i3, -1, "org.betup.ui.fragment.home.compose.matches.HomeMatchBinarySentimentBar (HomeMatchCardShared.kt:403)");
            }
            HomeMatchSentimentBar(percents, null, null, modifier, startRestartGroup, (i3 & 14) | ((i3 << 6) & 7168), 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchCardSharedKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomeMatchBinarySentimentBar$lambda$28;
                    HomeMatchBinarySentimentBar$lambda$28 = HomeMatchCardSharedKt.HomeMatchBinarySentimentBar$lambda$28(percents, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return HomeMatchBinarySentimentBar$lambda$28;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle homeSentimentLabelStyle(Composer composer, int i) {
        composer.startReplaceGroup(-129805790);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-129805790, i, -1, "org.betup.ui.fragment.home.compose.matches.homeSentimentLabelStyle (HomeMatchCardShared.kt:408)");
        }
        TextStyle textStyle = new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(10), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.openSansFamily(composer, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return textStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long toComposeColor(SentimentBarColor sentimentBarColor, Composer composer, int i) {
        long j;
        composer.startReplaceGroup(-423926131);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-423926131, i, -1, "org.betup.ui.fragment.home.compose.matches.toComposeColor (HomeMatchCardShared.kt:415)");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[sentimentBarColor.ordinal()];
        if (i2 == 1) {
            j = ComposeUtils.AppColorPalette.Green.INSTANCE.getColor();
        } else if (i2 == 2) {
            j = ComposeUtils.AppColorPalette.Violet.INSTANCE.getColor();
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            j = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return j;
    }

    public static /* synthetic */ List resolveSentimentSegments$default(List list, List list2, List list3, int i, Object obj) {
        if ((i & 4) != 0) {
            list3 = CollectionsKt.emptyList();
        }
        return resolveSentimentSegments(list, list2, list3);
    }

    public static final List<HomeSentimentSegment> resolveSentimentSegments(List<Float> percents, List<Double> coefficients, List<String> betNames) {
        Intrinsics.checkNotNullParameter(percents, "percents");
        Intrinsics.checkNotNullParameter(coefficients, "coefficients");
        Intrinsics.checkNotNullParameter(betNames, "betNames");
        if (percents.isEmpty() && coefficients.isEmpty()) {
            return CollectionsKt.listOf((Object[]) new HomeSentimentSegment[]{new HomeSentimentSegment(50.0f, SentimentBarColor.Green), new HomeSentimentSegment(50.0f, SentimentBarColor.Violet)});
        }
        int max = Math.max(percents.size(), Math.max(coefficients.size(), betNames.size()));
        if (max <= 0) {
            return CollectionsKt.listOf((Object[]) new HomeSentimentSegment[]{new HomeSentimentSegment(50.0f, SentimentBarColor.Green), new HomeSentimentSegment(50.0f, SentimentBarColor.Violet)});
        }
        List<Float> normalizeSentimentPercents = normalizeSentimentPercents(percents, max);
        List<Double> normalizeSentimentCoefficients = normalizeSentimentCoefficients(coefficients, max);
        Integer resolveDrawIndex = resolveDrawIndex(normalizeSentimentBetNames(betNames, max), max);
        if (resolveDrawIndex != null && max >= 3) {
            return buildThreeWaySegments(normalizeSentimentPercents, normalizeSentimentCoefficients, resolveDrawIndex.intValue());
        }
        return buildTwoWaySegments(normalizeSentimentPercents, normalizeSentimentCoefficients);
    }

    public static final boolean isDrawOutcome(String betName) {
        Intrinsics.checkNotNullParameter(betName, "betName");
        String obj = StringsKt.trim((CharSequence) betName).toString();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String upperCase = obj.toUpperCase(US);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return Intrinsics.areEqual(upperCase, "X") || StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "DRAW", false, 2, (Object) null);
    }

    public static final Integer resolveDrawIndex(List<String> betNames, int i) {
        Intrinsics.checkNotNullParameter(betNames, "betNames");
        if (i < 3) {
            return null;
        }
        int i2 = 0;
        for (Object obj : betNames) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (isDrawOutcome((String) obj)) {
                return Integer.valueOf(i2);
            }
            i2 = i3;
        }
        return 1;
    }

    private static final List<HomeSentimentSegment> buildThreeWaySegments(List<Float> list, List<Double> list2, int i) {
        SentimentBarColor sentimentBarColor;
        List<Float> list3 = list;
        IntRange indices = CollectionsKt.getIndices(list3);
        ArrayList arrayList = new ArrayList();
        for (Integer num : indices) {
            if (num.intValue() != i) {
                arrayList.add(num);
            }
        }
        List sorted = CollectionsKt.sorted(arrayList);
        int intValue = ((Number) CollectionsKt.first(sorted)).intValue();
        int intValue2 = ((Number) CollectionsKt.last(sorted)).intValue();
        double doubleValue = list2.get(intValue).doubleValue();
        double doubleValue2 = list2.get(intValue2).doubleValue();
        IntRange indices2 = CollectionsKt.getIndices(list3);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(indices2, 10));
        Iterator<Integer> it = indices2.iterator();
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            if (nextInt == i) {
                sentimentBarColor = SentimentBarColor.Gold;
            } else if (nextInt == intValue) {
                sentimentBarColor = teamSentimentColor(doubleValue, doubleValue2);
            } else if (nextInt == intValue2) {
                sentimentBarColor = teamSentimentColor(doubleValue2, doubleValue);
            } else {
                sentimentBarColor = SentimentBarColor.Violet;
            }
            arrayList2.add(new HomeSentimentSegment(list.get(nextInt).floatValue(), sentimentBarColor));
        }
        return arrayList2;
    }

    private static final List<HomeSentimentSegment> buildTwoWaySegments(List<Float> list, List<Double> list2) {
        float floatValue = list.get(0).floatValue();
        float floatValue2 = (1 < list.size() ? list.get(1) : Float.valueOf(RangesKt.coerceAtLeast(100.0f - floatValue, 0.0f))).floatValue();
        double doubleValue = (list2.size() > 0 ? list2.get(0) : Double.valueOf(0.0d)).doubleValue();
        double doubleValue2 = (1 < list2.size() ? list2.get(1) : Double.valueOf(0.0d)).doubleValue();
        return CollectionsKt.listOf((Object[]) new HomeSentimentSegment[]{new HomeSentimentSegment(floatValue, teamSentimentColor(doubleValue, doubleValue2)), new HomeSentimentSegment(floatValue2, teamSentimentColor(doubleValue2, doubleValue))});
    }

    private static final SentimentBarColor teamSentimentColor(double d, double d2) {
        return d <= d2 ? SentimentBarColor.Green : SentimentBarColor.Violet;
    }

    private static final List<Float> normalizeSentimentPercents(List<Float> list, int i) {
        int i2 = 0;
        if (list.isEmpty()) {
            ArrayList arrayList = new ArrayList(i);
            while (i2 < i) {
                arrayList.add(Float.valueOf(100.0f / i));
                i2++;
            }
            return arrayList;
        }
        if (list.size() == 1 && i == 2) {
            float floatValue = list.get(0).floatValue();
            return CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(floatValue), Float.valueOf(RangesKt.coerceAtLeast(100.0f - floatValue, 0.0f))});
        }
        ArrayList arrayList2 = new ArrayList(i);
        while (i2 < i) {
            arrayList2.add(Float.valueOf(((i2 < 0 || i2 >= list.size()) ? Float.valueOf(0.0f) : list.get(i2)).floatValue()));
            i2++;
        }
        return arrayList2;
    }

    private static final List<Double> normalizeSentimentCoefficients(List<Double> list, int i) {
        ArrayList arrayList = new ArrayList(i);
        int i2 = 0;
        while (i2 < i) {
            arrayList.add(Double.valueOf(((i2 < 0 || i2 >= list.size()) ? Double.valueOf(0.0d) : list.get(i2)).doubleValue()));
            i2++;
        }
        return arrayList;
    }

    private static final List<String> normalizeSentimentBetNames(List<String> list, int i) {
        ArrayList arrayList = new ArrayList(i);
        int i2 = 0;
        while (i2 < i) {
            arrayList.add((i2 < 0 || i2 >= list.size()) ? "" : list.get(i2));
            i2++;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeMatchTeamsBlock(final HomeMatchItem item, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final Modifier modifier3;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(item, "item");
        Composer startRestartGroup = composer.startRestartGroup(-2041514148);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(item) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i3;
            if ((i4 & 19) == 18 || !startRestartGroup.getSkipping()) {
                modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2041514148, i4, -1, "org.betup.ui.fragment.home.compose.matches.HomeMatchTeamsBlock (HomeMatchCardShared.kt:526)");
                }
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(6));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4, centerVertically, startRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                m13792HomeMatchTeamColumnoTYcxuw(item.getHomeTeamName(), item.getHomeLogoUrl(), TextAlign.INSTANCE.m7658getCentere0LSkKk(), RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0, 0);
                HomeMatchCenterColumn(item, startRestartGroup, i4 & 14);
                m13792HomeMatchTeamColumnoTYcxuw(item.getAwayTeamName(), item.getAwayLogoUrl(), TextAlign.INSTANCE.m7658getCentere0LSkKk(), RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0, 0);
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
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchCardSharedKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit HomeMatchTeamsBlock$lambda$43;
                        HomeMatchTeamsBlock$lambda$43 = HomeMatchCardSharedKt.HomeMatchTeamsBlock$lambda$43(HomeMatchItem.this, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return HomeMatchTeamsBlock$lambda$43;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 19) == 18) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(6));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_42, centerVertically2, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
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
        m13792HomeMatchTeamColumnoTYcxuw(item.getHomeTeamName(), item.getHomeLogoUrl(), TextAlign.INSTANCE.m7658getCentere0LSkKk(), RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0, 0);
        HomeMatchCenterColumn(item, startRestartGroup, i4 & 14);
        m13792HomeMatchTeamColumnoTYcxuw(item.getAwayTeamName(), item.getAwayLogoUrl(), TextAlign.INSTANCE.m7658getCentere0LSkKk(), RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0, 0);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0090  */
    /* renamed from: HomeMatchTeamColumn-oTYcxuw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m13792HomeMatchTeamColumnoTYcxuw(final String str, final String str2, final int i, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Composer composer2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-721286399);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changed(i) ? 256 : 128;
        }
        int i5 = i3 & 8;
        if (i5 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i4 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-721286399, i4, -1, "org.betup.ui.fragment.home.compose.matches.HomeMatchTeamColumn (HomeMatchCardShared.kt:554)");
                }
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(3));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4, centerHorizontally, startRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
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
                HomeTeamLogo(str2, str, startRestartGroup, ((i4 >> 3) & 14) | ((i4 << 3) & 112));
                Modifier modifier4 = modifier3;
                composer2 = startRestartGroup;
                TextKt.m3621Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(i), 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, homeTeamNameStyle(startRestartGroup, 0), composer2, (i4 & 14) | ((i4 << 21) & 1879048192), 3120, 54782);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchCardSharedKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit HomeMatchTeamColumn_oTYcxuw$lambda$45;
                        HomeMatchTeamColumn_oTYcxuw$lambda$45 = HomeMatchCardSharedKt.HomeMatchTeamColumn_oTYcxuw$lambda$45(str, str2, i, modifier2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        return HomeMatchTeamColumn_oTYcxuw$lambda$45;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i4 & 1171) == 1170) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(3));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_42, centerHorizontally2, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
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
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        HomeTeamLogo(str2, str, startRestartGroup, ((i4 >> 3) & 14) | ((i4 << 3) & 112));
        Modifier modifier42 = modifier3;
        composer2 = startRestartGroup;
        TextKt.m3621Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(i), 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, homeTeamNameStyle(startRestartGroup, 0), composer2, (i4 & 14) | ((i4 << 21) & 1879048192), 3120, 54782);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier42;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x04e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void HomeMatchCenterColumn(final HomeMatchItem homeMatchItem, Composer composer, final int i) {
        int i2;
        Composer composer2;
        int i3;
        long j;
        FontFamily openSansFamily;
        Composer composer3;
        Composer composer4;
        Composer startRestartGroup = composer.startRestartGroup(1992355341);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(homeMatchItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1992355341, i2, -1, "org.betup.ui.fragment.home.compose.matches.HomeMatchCenterColumn (HomeMatchCardShared.kt:576)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(3));
            Modifier m1568width3ABfNKs = SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, HomeMatchCardDimensionsKt.getHomeMatchCardCenterColumnWidth());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4, centerHorizontally, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1568width3ABfNKs);
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
            if (hasScore(homeMatchItem)) {
                startRestartGroup.startReplaceGroup(-1262267649);
                HomeMatchScoreRow(homeMatchItem.getScoreHome(), homeMatchItem.getScoreAway(), startRestartGroup, 0);
                if (homeMatchItem.isLive()) {
                    String periodLabel = homeMatchItem.getPeriodLabel();
                    startRestartGroup.startReplaceGroup(-1841828029);
                    if (periodLabel == null) {
                        composer4 = startRestartGroup;
                    } else {
                        composer4 = startRestartGroup;
                        TextKt.m3621Text4IGK_g(periodLabel, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(10), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.openSansFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744412, (DefaultConstructorMarker) null), composer4, 0, 3120, 55294);
                    }
                    composer4.endReplaceGroup();
                    String liveTimeLabel = homeMatchItem.getLiveTimeLabel();
                    if (liveTimeLabel != null) {
                        TextKt.m3621Text4IGK_g(liveTimeLabel, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(13), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer4, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), composer4, 0, 3072, 57342);
                    }
                } else {
                    composer4 = startRestartGroup;
                }
                composer4.endReplaceGroup();
            } else {
                String str = null;
                if (homeMatchItem.isLive()) {
                    startRestartGroup.startReplaceGroup(-1260918188);
                    String periodLabel2 = homeMatchItem.getPeriodLabel();
                    startRestartGroup.startReplaceGroup(-1841789709);
                    if (periodLabel2 == null) {
                        composer4 = startRestartGroup;
                    } else {
                        composer4 = startRestartGroup;
                        TextKt.m3621Text4IGK_g(periodLabel2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(10), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.openSansFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744412, (DefaultConstructorMarker) null), composer4, 0, 3120, 55294);
                    }
                    composer4.endReplaceGroup();
                    String liveTimeLabel2 = homeMatchItem.getLiveTimeLabel();
                    String str2 = (liveTimeLabel2 == null || StringsKt.isBlank(liveTimeLabel2)) ? null : liveTimeLabel2;
                    if (str2 != null) {
                        TextKt.m3621Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(13), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer4, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), composer4, 0, 3072, 57342);
                    }
                    composer4.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1259778938);
                    String kickoffDateLabel = homeMatchItem.getKickoffDateLabel();
                    startRestartGroup.startReplaceGroup(-1841753223);
                    if (kickoffDateLabel == null) {
                        composer2 = startRestartGroup;
                    } else {
                        composer2 = startRestartGroup;
                        TextKt.m3621Text4IGK_g(kickoffDateLabel, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(10), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.openSansFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744412, (DefaultConstructorMarker) null), composer2, 0, 3072, 57342);
                    }
                    composer2.endReplaceGroup();
                    String kickoffTimeLabel = homeMatchItem.getKickoffTimeLabel();
                    if (kickoffTimeLabel != null && !StringsKt.isBlank(kickoffTimeLabel)) {
                        str = kickoffTimeLabel;
                    }
                    Composer composer5 = composer2;
                    composer5.startReplaceGroup(-1841738578);
                    if (str == null) {
                        i3 = 6;
                        str = StringResources_androidKt.stringResource(R.string.home_match_vs, composer5, 6);
                    } else {
                        i3 = 6;
                    }
                    composer5.endReplaceGroup();
                    if (homeMatchItem.getKickoffTimeLabel() != null) {
                        j = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
                    } else {
                        j = ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor();
                    }
                    long j2 = j;
                    long sp = homeMatchItem.getKickoffTimeLabel() != null ? TextUnitKt.getSp(13) : TextUnitKt.getSp(11);
                    FontWeight bold = homeMatchItem.getKickoffTimeLabel() != null ? FontWeight.INSTANCE.getBold() : FontWeight.INSTANCE.getNormal();
                    if (homeMatchItem.getKickoffTimeLabel() != null) {
                        composer5.startReplaceGroup(-1258620623);
                        openSansFamily = ComposeUtils.INSTANCE.sfProFontFamily(composer5, i3);
                        composer5.endReplaceGroup();
                    } else {
                        composer5.startReplaceGroup(-1258537326);
                        openSansFamily = ComposeUtils.INSTANCE.openSansFamily(composer5, i3);
                        composer5.endReplaceGroup();
                    }
                    TextStyle textStyle = new TextStyle(j2, sp, bold, (FontStyle) null, (FontSynthesis) null, openSansFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null);
                    composer3 = composer5;
                    TextKt.m3621Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composer3, 0, 3072, 57342);
                    composer3.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }
            composer3 = composer4;
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer3 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchCardSharedKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomeMatchCenterColumn$lambda$53;
                    HomeMatchCenterColumn$lambda$53 = HomeMatchCardSharedKt.HomeMatchCenterColumn$lambda$53(HomeMatchItem.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return HomeMatchCenterColumn$lambda$53;
                }
            });
        }
    }

    private static final void HomeMatchScoreRow(final Integer num, final Integer num2, Composer composer, final int i) {
        int i2;
        final String str;
        String num3;
        Composer startRestartGroup = composer.startRestartGroup(-501575837);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(num) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(num2) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-501575837, i2, -1, "org.betup.ui.fragment.home.compose.matches.HomeMatchScoreRow (HomeMatchCardShared.kt:685)");
            }
            final String str2 = "-";
            if (num == null || (str = num.toString()) == null) {
                str = "-";
            }
            if (num2 != null && (num3 = num2.toString()) != null) {
                str2 = num3;
            }
            final float homeScoreChipHorizontalPadding = homeScoreChipHorizontalPadding(Math.max(str.length(), str2.length()));
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(-1919297607, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchCardSharedKt$HomeMatchScoreRow$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num4) {
                    invoke(boxWithConstraintsScope, composer2, num4.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer2, int i3) {
                    int i4;
                    float f;
                    long j;
                    long j2;
                    float f2;
                    float f3;
                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((i3 & 6) == 0) {
                        i4 = i3 | (composer2.changed(BoxWithConstraints) ? 4 : 2);
                    } else {
                        i4 = i3;
                    }
                    if ((i4 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1919297607, i4, -1, "org.betup.ui.fragment.home.compose.matches.HomeMatchScoreRow.<anonymous> (HomeMatchCardShared.kt:692)");
                    }
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = composer2.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Density density = (Density) consume;
                    float mo1167toPx0680j_4 = density.mo1167toPx0680j_4(BoxWithConstraints.mo1423getMaxWidthD9Ej5fM());
                    f = HomeMatchCardSharedKt.HomeMatchScoreRowGap;
                    float mo1167toPx0680j_42 = density.mo1167toPx0680j_4(f);
                    float mo1167toPx0680j_43 = density.mo1167toPx0680j_4(homeScoreChipHorizontalPadding);
                    TextStyle textStyle = new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.openSansFamily(composer2, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
                    TextStyle textStyle2 = new TextStyle(ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744410, (DefaultConstructorMarker) null);
                    float coerceAtLeast = RangesKt.coerceAtLeast((mo1167toPx0680j_4 - (((mo1167toPx0680j_42 * 2.0f) + (mo1167toPx0680j_43 * 4.0f)) + ((int) (TextMeasurer.m7211measurexDpz5zY$default(TextMeasurerHelperKt.rememberTextMeasurer(0, composer2, 0, 1), new AnnotatedString("-", null, 2, null), textStyle, 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> 32)))) / 2.0f, 1.0f);
                    List listOf = CollectionsKt.listOf((Object[]) new String[]{str, str2});
                    j = HomeMatchCardSharedKt.HomeMatchScoreBaseFontSize;
                    j2 = HomeMatchCardSharedKt.HomeMatchScoreMinFontSize;
                    long m12898CalculateAutoResizeFontSizeForWidtha8pgNYE = AutoResizeSiblingsTextKt.m12898CalculateAutoResizeFontSizeForWidtha8pgNYE(listOf, j, j2, coerceAtLeast, false, 1, textStyle2, composer2, 197040, 16);
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    String str3 = str;
                    float f4 = homeScoreChipHorizontalPadding;
                    String str4 = str2;
                    ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default);
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
                    Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    HomeMatchCardSharedKt.m13793HomeScoreChippezOeNo(str3, m12898CalculateAutoResizeFontSizeForWidtha8pgNYE, f4, composer2, 0);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    f2 = HomeMatchCardSharedKt.HomeMatchScoreRowGap;
                    SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(companion, f2), composer2, 6);
                    TextKt.m3621Text4IGK_g("-", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composer2, 6, 3456, 53246);
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    f3 = HomeMatchCardSharedKt.HomeMatchScoreRowGap;
                    SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(companion2, f3), composer2, 6);
                    HomeMatchCardSharedKt.m13793HomeScoreChippezOeNo(str4, m12898CalculateAutoResizeFontSizeForWidtha8pgNYE, f4, composer2, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchCardSharedKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomeMatchScoreRow$lambda$54;
                    HomeMatchScoreRow$lambda$54 = HomeMatchCardSharedKt.HomeMatchScoreRow$lambda$54(num, num2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return HomeMatchScoreRow$lambda$54;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HomeScoreChip-pezOeNo, reason: not valid java name */
    public static final void m13793HomeScoreChippezOeNo(final String str, final long j, final float f, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1552980028);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= startRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i2 & Opcodes.I2S) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1552980028, i2, -1, "org.betup.ui.fragment.home.compose.matches.HomeScoreChip (HomeMatchCardShared.kt:759)");
            }
            TextKt.m3621Text4IGK_g(str, PaddingKt.m1517paddingVpY3zN4(BackgroundKt.m1025backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(6))), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), null, 2, null), f, Dp.m7774constructorimpl(4)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7709getClipgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), j, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, i2 & 14, X2.b.f, 51196);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchCardSharedKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomeScoreChip_pezOeNo$lambda$55;
                    HomeScoreChip_pezOeNo$lambda$55 = HomeMatchCardSharedKt.HomeScoreChip_pezOeNo$lambda$55(str, j, f, i, (Composer) obj, ((Integer) obj2).intValue());
                    return HomeScoreChip_pezOeNo$lambda$55;
                }
            });
        }
    }

    public static final TextStyle homeTeamNameStyle(Composer composer, int i) {
        composer.startReplaceGroup(687106943);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(687106943, i, -1, "org.betup.ui.fragment.home.compose.matches.homeTeamNameStyle (HomeMatchCardShared.kt:781)");
        }
        TextStyle textStyle = new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(11), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.openSansFamily(composer, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744412, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return textStyle;
    }

    public static final void HomeTeamLogo(final String url, final String name, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(name, "name");
        Composer startRestartGroup = composer.startRestartGroup(494752338);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(url) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(name) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(494752338, i2, -1, "org.betup.ui.fragment.home.compose.matches.HomeTeamLogo (HomeMatchCardShared.kt:792)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            composer2 = startRestartGroup;
            SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(ImageRequests_androidKt.allowHardware(new ImageRequest.Builder((Context) consume).data(!StringsKt.isBlank(url) ? url : null), false).build(), name, BackgroundKt.m1025backgroundbw27NRU$default(BorderKt.m1036borderxT4_qwU(ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(28)), RoundedCornerShapeKt.getCircleShape()), Dp.m7774constructorimpl(1), ComposeUtils.AppColorPalette.ScreenBorder.INSTANCE.getColor(), RoundedCornerShapeKt.getCircleShape()), ComposeUtils.AppColorPalette.ScreenBackground.INSTANCE.getColor(), null, 2, null), null, null, null, ContentScale.INSTANCE.getFit(), 0.0f, null, 0, false, startRestartGroup, (i2 & 112) | 1572864, 0, 1976);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchCardSharedKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomeTeamLogo$lambda$57;
                    HomeTeamLogo$lambda$57 = HomeMatchCardSharedKt.HomeTeamLogo$lambda$57(url, name, i, (Composer) obj, ((Integer) obj2).intValue());
                    return HomeTeamLogo$lambda$57;
                }
            });
        }
    }

    public static final void HomeOddPlaceholderButton(Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1960194581);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) != 2 || !startRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1960194581, i3, -1, "org.betup.ui.fragment.home.compose.matches.HomeOddPlaceholderButton (HomeMatchCardShared.kt:810)");
            }
            Modifier modifier4 = modifier3;
            composer2 = startRestartGroup;
            TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.home_odds_placeholder, startRestartGroup, 6), PaddingKt.m1518paddingVpY3zN4$default(BackgroundKt.background$default(ClipKt.clip(modifier3, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100))), ComposeUtils.AppBrushPalette.ButtonBackgroundGray.INSTANCE.getBrush(), null, 0.0f, 6, null), 0.0f, Dp.m7774constructorimpl(8), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.openSansFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744412, (DefaultConstructorMarker) null), composer2, 0, 0, 65532);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchCardSharedKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomeOddPlaceholderButton$lambda$58;
                    HomeOddPlaceholderButton$lambda$58 = HomeMatchCardSharedKt.HomeOddPlaceholderButton$lambda$58(Modifier.this, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return HomeOddPlaceholderButton$lambda$58;
                }
            });
        }
    }

    public static final boolean hasScore(HomeMatchItem homeMatchItem) {
        Intrinsics.checkNotNullParameter(homeMatchItem, "<this>");
        return (homeMatchItem.getScoreHome() == null || homeMatchItem.getScoreAway() == null) ? false : true;
    }

    private static final float homeScoreChipHorizontalPadding(int i) {
        return Dp.m7774constructorimpl(i >= 3 ? 4 : 8);
    }

    private static final float HomePulsingLiveDot$lambda$7(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float HomePulsingLiveDot$lambda$8(State<Float> state) {
        return state.getValue().floatValue();
    }
}
