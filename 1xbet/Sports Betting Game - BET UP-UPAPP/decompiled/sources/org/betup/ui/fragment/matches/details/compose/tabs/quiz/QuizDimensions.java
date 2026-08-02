package org.betup.ui.fragment.matches.details.compose.tabs.quiz;

import android.content.res.Configuration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import io.sentry.rrweb.RRWebVideoEvent;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: QuizDimensions.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0007J\u0017\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001a\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001c\u0010\u0016J\u000f\u0010\u001d\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001e\u0010\u0016J\u000f\u0010\u001f\u001a\u00020\u000fH\u0007¢\u0006\u0004\b \u0010\u0007J\u000f\u0010!\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\"\u0010\u0007J\u000f\u0010#\u001a\u00020\u000fH\u0007¢\u0006\u0004\b$\u0010\u0007J\u000f\u0010%\u001a\u00020\u000fH\u0007¢\u0006\u0004\b&\u0010\u0007J\u000f\u0010'\u001a\u00020\u000fH\u0007¢\u0006\u0004\b(\u0010\u0007J\u000f\u0010)\u001a\u00020\u000fH\u0007¢\u0006\u0004\b*\u0010\u0007J\u000f\u0010+\u001a\u00020\u000fH\u0007¢\u0006\u0004\b,\u0010\u0007J\u000f\u0010-\u001a\u00020\u000fH\u0007¢\u0006\u0004\b.\u0010\u0007J\u000f\u0010/\u001a\u00020\u000fH\u0007¢\u0006\u0004\b0\u0010\u0007J\u000f\u00101\u001a\u00020\u000fH\u0007¢\u0006\u0004\b2\u0010\u0007J\u000f\u00103\u001a\u00020\u000fH\u0007¢\u0006\u0004\b4\u0010\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lorg/betup/ui/fragment/matches/details/compose/tabs/quiz/QuizDimensions;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "BASE_HEIGHT", "", "getScaleFactor", "(Landroidx/compose/runtime/Composer;I)F", "textSize", "Landroidx/compose/ui/unit/TextUnit;", "baseSize", "", "textSize-K2XA3mU", "(ILandroidx/compose/runtime/Composer;I)J", "spacing", "Landroidx/compose/ui/unit/Dp;", "spacing-ccRj1GA", "(ILandroidx/compose/runtime/Composer;I)F", RRWebVideoEvent.JsonKeys.SIZE, "size-ccRj1GA", "headerText", "headerText-5XXgJZs", "(Landroidx/compose/runtime/Composer;I)J", "titleText", "titleText-5XXgJZs", "bodyText", "bodyText-5XXgJZs", "smallText", "smallText-5XXgJZs", "tinyText", "tinyText-5XXgJZs", "spacingTiny", "spacingTiny-chRvn1I", "spacingSmall", "spacingSmall-chRvn1I", "spacingMedium", "spacingMedium-chRvn1I", "spacingLarge", "spacingLarge-chRvn1I", "spacingXLarge", "spacingXLarge-chRvn1I", "iconSmall", "iconSmall-chRvn1I", "iconMedium", "iconMedium-chRvn1I", "trophyLarge", "trophyLarge-chRvn1I", "trophyMedium", "trophyMedium-chRvn1I", "trophyContainer", "trophyContainer-chRvn1I", "badgeSize", "badgeSize-chRvn1I", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QuizDimensions {
    public static final int $stable = 0;
    private static final float BASE_HEIGHT = 800.0f;
    public static final QuizDimensions INSTANCE = new QuizDimensions();

    private QuizDimensions() {
    }

    public final float getScaleFactor(Composer composer, int i) {
        composer.startReplaceGroup(-328457387);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-328457387, i, -1, "org.betup.ui.fragment.matches.details.compose.tabs.quiz.QuizDimensions.getScaleFactor (QuizDimensions.kt:24)");
        }
        ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localConfiguration);
        ComposerKt.sourceInformationMarkerEnd(composer);
        float coerceIn = RangesKt.coerceIn(((Configuration) consume).screenHeightDp / BASE_HEIGHT, 0.35f, 1.1f);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return coerceIn;
    }

    /* renamed from: textSize-K2XA3mU, reason: not valid java name */
    public final long m14041textSizeK2XA3mU(int i, Composer composer, int i2) {
        composer.startReplaceGroup(-1524386654);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1524386654, i2, -1, "org.betup.ui.fragment.matches.details.compose.tabs.quiz.QuizDimensions.textSize (QuizDimensions.kt:35)");
        }
        long sp = TextUnitKt.getSp(i * getScaleFactor(composer, (i2 >> 3) & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return sp;
    }

    /* renamed from: spacing-ccRj1GA, reason: not valid java name */
    public final float m14035spacingccRj1GA(int i, Composer composer, int i2) {
        composer.startReplaceGroup(-16457052);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-16457052, i2, -1, "org.betup.ui.fragment.matches.details.compose.tabs.quiz.QuizDimensions.spacing (QuizDimensions.kt:43)");
        }
        float m7774constructorimpl = Dp.m7774constructorimpl(i * getScaleFactor(composer, (i2 >> 3) & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m7774constructorimpl;
    }

    /* renamed from: size-ccRj1GA, reason: not valid java name */
    public final float m14033sizeccRj1GA(int i, Composer composer, int i2) {
        composer.startReplaceGroup(-1883583030);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1883583030, i2, -1, "org.betup.ui.fragment.matches.details.compose.tabs.quiz.QuizDimensions.size (QuizDimensions.kt:51)");
        }
        float m7774constructorimpl = Dp.m7774constructorimpl(i * getScaleFactor(composer, (i2 >> 3) & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m7774constructorimpl;
    }

    /* renamed from: headerText-5XXgJZs, reason: not valid java name */
    public final long m14030headerText5XXgJZs(Composer composer, int i) {
        composer.startReplaceGroup(-2058798203);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2058798203, i, -1, "org.betup.ui.fragment.matches.details.compose.tabs.quiz.QuizDimensions.headerText (QuizDimensions.kt:58)");
        }
        long m14041textSizeK2XA3mU = m14041textSizeK2XA3mU(14, composer, ((i << 3) & 112) | 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m14041textSizeK2XA3mU;
    }

    /* renamed from: titleText-5XXgJZs, reason: not valid java name */
    public final long m14043titleText5XXgJZs(Composer composer, int i) {
        composer.startReplaceGroup(326311988);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(326311988, i, -1, "org.betup.ui.fragment.matches.details.compose.tabs.quiz.QuizDimensions.titleText (QuizDimensions.kt:61)");
        }
        long m14041textSizeK2XA3mU = m14041textSizeK2XA3mU(16, composer, ((i << 3) & 112) | 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m14041textSizeK2XA3mU;
    }

    /* renamed from: bodyText-5XXgJZs, reason: not valid java name */
    public final long m14029bodyText5XXgJZs(Composer composer, int i) {
        composer.startReplaceGroup(1596863578);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1596863578, i, -1, "org.betup.ui.fragment.matches.details.compose.tabs.quiz.QuizDimensions.bodyText (QuizDimensions.kt:64)");
        }
        long m14041textSizeK2XA3mU = m14041textSizeK2XA3mU(12, composer, ((i << 3) & 112) | 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m14041textSizeK2XA3mU;
    }

    /* renamed from: smallText-5XXgJZs, reason: not valid java name */
    public final long m14034smallText5XXgJZs(Composer composer, int i) {
        composer.startReplaceGroup(1702912419);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1702912419, i, -1, "org.betup.ui.fragment.matches.details.compose.tabs.quiz.QuizDimensions.smallText (QuizDimensions.kt:67)");
        }
        long m14041textSizeK2XA3mU = m14041textSizeK2XA3mU(10, composer, ((i << 3) & 112) | 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m14041textSizeK2XA3mU;
    }

    /* renamed from: tinyText-5XXgJZs, reason: not valid java name */
    public final long m14042tinyText5XXgJZs(Composer composer, int i) {
        composer.startReplaceGroup(1985669944);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1985669944, i, -1, "org.betup.ui.fragment.matches.details.compose.tabs.quiz.QuizDimensions.tinyText (QuizDimensions.kt:70)");
        }
        long m14041textSizeK2XA3mU = m14041textSizeK2XA3mU(9, composer, ((i << 3) & 112) | 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m14041textSizeK2XA3mU;
    }

    /* renamed from: spacingTiny-chRvn1I, reason: not valid java name */
    public final float m14039spacingTinychRvn1I(Composer composer, int i) {
        composer.startReplaceGroup(808999981);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(808999981, i, -1, "org.betup.ui.fragment.matches.details.compose.tabs.quiz.QuizDimensions.spacingTiny (QuizDimensions.kt:73)");
        }
        float m14035spacingccRj1GA = m14035spacingccRj1GA(2, composer, ((i << 3) & 112) | 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m14035spacingccRj1GA;
    }

    /* renamed from: spacingSmall-chRvn1I, reason: not valid java name */
    public final float m14038spacingSmallchRvn1I(Composer composer, int i) {
        composer.startReplaceGroup(-48238038);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-48238038, i, -1, "org.betup.ui.fragment.matches.details.compose.tabs.quiz.QuizDimensions.spacingSmall (QuizDimensions.kt:76)");
        }
        float m14035spacingccRj1GA = m14035spacingccRj1GA(4, composer, ((i << 3) & 112) | 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m14035spacingccRj1GA;
    }

    /* renamed from: spacingMedium-chRvn1I, reason: not valid java name */
    public final float m14037spacingMediumchRvn1I(Composer composer, int i) {
        composer.startReplaceGroup(-242965534);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-242965534, i, -1, "org.betup.ui.fragment.matches.details.compose.tabs.quiz.QuizDimensions.spacingMedium (QuizDimensions.kt:79)");
        }
        float m14035spacingccRj1GA = m14035spacingccRj1GA(10, composer, ((i << 3) & 112) | 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m14035spacingccRj1GA;
    }

    /* renamed from: spacingLarge-chRvn1I, reason: not valid java name */
    public final float m14036spacingLargechRvn1I(Composer composer, int i) {
        composer.startReplaceGroup(-1075643810);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1075643810, i, -1, "org.betup.ui.fragment.matches.details.compose.tabs.quiz.QuizDimensions.spacingLarge (QuizDimensions.kt:82)");
        }
        float m14035spacingccRj1GA = m14035spacingccRj1GA(16, composer, ((i << 3) & 112) | 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m14035spacingccRj1GA;
    }

    /* renamed from: spacingXLarge-chRvn1I, reason: not valid java name */
    public final float m14040spacingXLargechRvn1I(Composer composer, int i) {
        composer.startReplaceGroup(131722512);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(131722512, i, -1, "org.betup.ui.fragment.matches.details.compose.tabs.quiz.QuizDimensions.spacingXLarge (QuizDimensions.kt:85)");
        }
        float m14035spacingccRj1GA = m14035spacingccRj1GA(24, composer, ((i << 3) & 112) | 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m14035spacingccRj1GA;
    }

    /* renamed from: iconSmall-chRvn1I, reason: not valid java name */
    public final float m14032iconSmallchRvn1I(Composer composer, int i) {
        composer.startReplaceGroup(357396056);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(357396056, i, -1, "org.betup.ui.fragment.matches.details.compose.tabs.quiz.QuizDimensions.iconSmall (QuizDimensions.kt:88)");
        }
        float m14033sizeccRj1GA = m14033sizeccRj1GA(12, composer, ((i << 3) & 112) | 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m14033sizeccRj1GA;
    }

    /* renamed from: iconMedium-chRvn1I, reason: not valid java name */
    public final float m14031iconMediumchRvn1I(Composer composer, int i) {
        composer.startReplaceGroup(-553210508);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-553210508, i, -1, "org.betup.ui.fragment.matches.details.compose.tabs.quiz.QuizDimensions.iconMedium (QuizDimensions.kt:91)");
        }
        float m14033sizeccRj1GA = m14033sizeccRj1GA(14, composer, ((i << 3) & 112) | 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m14033sizeccRj1GA;
    }

    /* renamed from: trophyLarge-chRvn1I, reason: not valid java name */
    public final float m14045trophyLargechRvn1I(Composer composer, int i) {
        composer.startReplaceGroup(-632667851);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-632667851, i, -1, "org.betup.ui.fragment.matches.details.compose.tabs.quiz.QuizDimensions.trophyLarge (QuizDimensions.kt:94)");
        }
        float m14033sizeccRj1GA = m14033sizeccRj1GA(75, composer, ((i << 3) & 112) | 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m14033sizeccRj1GA;
    }

    /* renamed from: trophyMedium-chRvn1I, reason: not valid java name */
    public final float m14046trophyMediumchRvn1I(Composer composer, int i) {
        composer.startReplaceGroup(604387307);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(604387307, i, -1, "org.betup.ui.fragment.matches.details.compose.tabs.quiz.QuizDimensions.trophyMedium (QuizDimensions.kt:97)");
        }
        float m14033sizeccRj1GA = m14033sizeccRj1GA(60, composer, ((i << 3) & 112) | 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m14033sizeccRj1GA;
    }

    /* renamed from: trophyContainer-chRvn1I, reason: not valid java name */
    public final float m14044trophyContainerchRvn1I(Composer composer, int i) {
        composer.startReplaceGroup(-1747922821);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1747922821, i, -1, "org.betup.ui.fragment.matches.details.compose.tabs.quiz.QuizDimensions.trophyContainer (QuizDimensions.kt:100)");
        }
        float m14033sizeccRj1GA = m14033sizeccRj1GA(85, composer, ((i << 3) & 112) | 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m14033sizeccRj1GA;
    }

    /* renamed from: badgeSize-chRvn1I, reason: not valid java name */
    public final float m14028badgeSizechRvn1I(Composer composer, int i) {
        composer.startReplaceGroup(-28516466);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-28516466, i, -1, "org.betup.ui.fragment.matches.details.compose.tabs.quiz.QuizDimensions.badgeSize (QuizDimensions.kt:103)");
        }
        float m14033sizeccRj1GA = m14033sizeccRj1GA(32, composer, ((i << 3) & 112) | 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m14033sizeccRj1GA;
    }
}
