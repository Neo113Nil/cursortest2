package androidx.compose.material;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Tab.kt */
@Metadata(d1 = {"\u0000n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0083\u0001\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u00162\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!\u001a\u008b\u0001\u0010\"\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00122\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0002\b\u00162\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$\u001a{\u0010\"\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u001c\u0010%\u001a\u0018\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00100&¢\u0006\u0002\b\u0016¢\u0006\u0002\b(H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*\u001a7\u0010+\u001a\u00020\u00102\u0013\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0002\b\u00162\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0002\b\u0016H\u0003¢\u0006\u0002\u0010,\u001a@\u0010-\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u00122\u0011\u0010%\u001a\r\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u0016H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101\u001aD\u00102\u001a\u00020\u0010*\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000bH\u0002\u001a\u001c\u0010=\u001a\u00020\u0010*\u0002032\u0006\u0010>\u001a\u0002072\u0006\u0010:\u001a\u00020\u000bH\u0002\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\u0007\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\b\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\t\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\u000e\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006?"}, d2 = {"DoubleLineTextBaselineWithIcon", "Landroidx/compose/ui/unit/Dp;", "F", "HorizontalTextPadding", "IconDistanceFromBaseline", "Landroidx/compose/ui/unit/TextUnit;", "J", "LargeTabHeight", "SingleLineTextBaselineWithIcon", "SmallTabHeight", "TabFadeInAnimationDelay", "", "TabFadeInAnimationDuration", "TabFadeOutAnimationDuration", "TextDistanceFromLeadingIcon", "LeadingIconTab", "", "selected", "", "onClick", "Lkotlin/Function0;", "text", "Landroidx/compose/runtime/Composable;", "icon", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "selectedContentColor", "Landroidx/compose/ui/graphics/Color;", "unselectedContentColor", "LeadingIconTab-0nD-MI0", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V", "Tab", "Tab-0nD-MI0", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "Tab-EVJuX4I", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "TabBaselineLayout", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "TabTransition", "activeColor", "inactiveColor", "TabTransition-Klgx-Pg", "(JJZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "placeTextAndIcon", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "density", "Landroidx/compose/ui/unit/Density;", "textPlaceable", "Landroidx/compose/ui/layout/Placeable;", "iconPlaceable", "tabWidth", "tabHeight", "firstBaseline", "lastBaseline", "placeTextOrIcon", "textOrIconPlaceable", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TabKt {
    private static final int TabFadeInAnimationDelay = 100;
    private static final int TabFadeInAnimationDuration = 150;
    private static final int TabFadeOutAnimationDuration = 100;
    private static final float SmallTabHeight = Dp.m3840constructorimpl(48);
    private static final float LargeTabHeight = Dp.m3840constructorimpl(72);
    private static final float HorizontalTextPadding = Dp.m3840constructorimpl(16);
    private static final float SingleLineTextBaselineWithIcon = Dp.m3840constructorimpl(14);
    private static final float DoubleLineTextBaselineWithIcon = Dp.m3840constructorimpl(6);
    private static final long IconDistanceFromBaseline = TextUnitKt.getSp(20);
    private static final float TextDistanceFromLeadingIcon = Dp.m3840constructorimpl(8);

    /* JADX WARN: Removed duplicated region for block: B:106:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00cf  */
    /* renamed from: Tab-0nD-MI0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1192Tab0nDMI0(final boolean z, final Function0<Unit> onClick, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, MutableInteractionSource mutableInteractionSource, long j, long j2, Composer composer, final int i, final int i2) {
        final int i3;
        int i4;
        int i5;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i7;
        MutableInteractionSource mutableInteractionSource2;
        long j3;
        MutableInteractionSource mutableInteractionSource3;
        long j4;
        Modifier modifier2;
        boolean z3;
        MutableInteractionSource mutableInteractionSource4;
        long j5;
        long j6;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        boolean z4;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final boolean z5;
        final MutableInteractionSource mutableInteractionSource5;
        final long j7;
        final long j8;
        ScopeUpdateScope endRestartGroup;
        int i8;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-1486097588);
        ComposerKt.sourceInformation(startRestartGroup, "C(Tab)P(5,4,3!1,7!2,6:c#ui.graphics.Color,8:c#ui.graphics.Color)96@4350L39,97@4443L7,98@4535L6,106@4792L234:Tab.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(onClick) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    i3 |= startRestartGroup.changed(function2) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & 458752) == 0) {
                        function23 = function22;
                        i3 |= startRestartGroup.changed(function23) ? 131072 : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                            mutableInteractionSource2 = mutableInteractionSource;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                            if ((i & 3670016) == 0) {
                                i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                            }
                        }
                        if ((i & 29360128) == 0) {
                            if ((i2 & 128) == 0 && startRestartGroup.changed(j)) {
                                i8 = 8388608;
                                i3 |= i8;
                            }
                            i8 = 4194304;
                            i3 |= i8;
                        }
                        if ((i & 234881024) == 0) {
                            j3 = j2;
                            i3 |= ((i2 & 256) == 0 && startRestartGroup.changed(j3)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        } else {
                            j3 = j2;
                        }
                        if ((191739611 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            ComposableLambda composableLambda = null;
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i9 != 0 ? Modifier.INSTANCE : modifier;
                                boolean z6 = i4 != 0 ? true : z2;
                                Function2<? super Composer, ? super Integer, Unit> function28 = i5 != 0 ? null : function2;
                                if (i6 != 0) {
                                    function23 = null;
                                }
                                if (i7 != 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                }
                                if ((i2 & 128) != 0) {
                                    ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localContentColor);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    j4 = ((Color) consume).m1638unboximpl();
                                    i3 &= -29360129;
                                } else {
                                    j4 = j;
                                }
                                if ((i2 & 256) != 0) {
                                    j3 = Color.m1627copywmQWz5c$default(j4, ContentAlpha.INSTANCE.getMedium(startRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i3 &= -234881025;
                                }
                                modifier2 = companion;
                                z3 = z6;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                j5 = j3;
                                j6 = j4;
                                function24 = function23;
                                function25 = function28;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                if ((i2 & 256) != 0) {
                                    i3 &= -234881025;
                                }
                                modifier2 = modifier;
                                z3 = z2;
                                j6 = j;
                                j5 = j3;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                function24 = function23;
                                function25 = function2;
                            }
                            startRestartGroup.endDefaults();
                            if (function25 != null) {
                                z4 = true;
                                composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, -1729014781, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$styledText$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i10) {
                                        TextStyle m3497copyHL5avdY;
                                        ComposerKt.sourceInformation(composer3, "C102@4667L10,103@4732L39:Tab.kt#jmzs0o");
                                        if ((i10 & 11) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                        } else {
                                            m3497copyHL5avdY = r3.m3497copyHL5avdY((r42 & 1) != 0 ? r3.spanStyle.m3459getColor0d7_KjU() : 0L, (r42 & 2) != 0 ? r3.spanStyle.getFontSize() : 0L, (r42 & 4) != 0 ? r3.spanStyle.getFontWeight() : null, (r42 & 8) != 0 ? r3.spanStyle.getFontStyle() : null, (r42 & 16) != 0 ? r3.spanStyle.getFontSynthesis() : null, (r42 & 32) != 0 ? r3.spanStyle.getFontFamily() : null, (r42 & 64) != 0 ? r3.spanStyle.getFontFeatureSettings() : null, (r42 & 128) != 0 ? r3.spanStyle.getLetterSpacing() : 0L, (r42 & 256) != 0 ? r3.spanStyle.getBaselineShift() : null, (r42 & 512) != 0 ? r3.spanStyle.getTextGeometricTransform() : null, (r42 & 1024) != 0 ? r3.spanStyle.getLocaleList() : null, (r42 & 2048) != 0 ? r3.spanStyle.getBackground() : 0L, (r42 & 4096) != 0 ? r3.spanStyle.getTextDecoration() : null, (r42 & 8192) != 0 ? r3.spanStyle.getShadow() : null, (r42 & 16384) != 0 ? r3.paragraphStyle.getTextAlign() : TextAlign.m3741boximpl(TextAlign.INSTANCE.m3748getCentere0LSkKk()), (r42 & 32768) != 0 ? r3.paragraphStyle.getTextDirection() : null, (r42 & 65536) != 0 ? r3.paragraphStyle.getLineHeight() : 0L, (r42 & 131072) != 0 ? MaterialTheme.INSTANCE.getTypography(composer3, 6).getButton().paragraphStyle.getTextIndent() : null);
                                            TextKt.ProvideTextStyle(m3497copyHL5avdY, function25, composer3, (i3 >> 9) & 112);
                                        }
                                    }
                                });
                            } else {
                                z4 = true;
                            }
                            final ComposableLambda composableLambda2 = composableLambda;
                            ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(startRestartGroup, -178151495, z4, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                                    invoke(columnScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(ColumnScope Tab, Composer composer3, int i10) {
                                    Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
                                    ComposerKt.sourceInformation(composer3, "C115@4971L49:Tab.kt#jmzs0o");
                                    if ((i10 & 81) == 16 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                    } else {
                                        TabKt.TabBaselineLayout(composableLambda2, function24, composer3, (i3 >> 12) & 112);
                                    }
                                }
                            });
                            int i10 = 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                            int i11 = i3 >> 6;
                            composer2 = startRestartGroup;
                            m1193TabEVJuX4I(z, onClick, modifier2, z3, mutableInteractionSource4, j6, j5, composableLambda3, startRestartGroup, i10 | (57344 & i11) | (458752 & i11) | (i11 & 3670016), 0);
                            function26 = function25;
                            modifier3 = modifier2;
                            function27 = function24;
                            z5 = z3;
                            mutableInteractionSource5 = mutableInteractionSource4;
                            j7 = j6;
                            j8 = j5;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            z5 = z2;
                            function26 = function2;
                            composer2 = startRestartGroup;
                            long j9 = j3;
                            mutableInteractionSource5 = mutableInteractionSource2;
                            j7 = j;
                            function27 = function23;
                            j8 = j9;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i12) {
                                TabKt.m1192Tab0nDMI0(z, onClick, modifier3, z5, function26, function27, mutableInteractionSource5, j7, j8, composer3, i | 1, i2);
                            }
                        });
                        return;
                    }
                    function23 = function22;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    if ((i & 29360128) == 0) {
                    }
                    if ((i & 234881024) == 0) {
                    }
                    if ((191739611 & i3) == 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    ComposableLambda composableLambda4 = null;
                    if ((i & 1) != 0) {
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
                    if ((i2 & 128) != 0) {
                    }
                    if ((i2 & 256) != 0) {
                    }
                    modifier2 = companion;
                    z3 = z6;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    j5 = j3;
                    j6 = j4;
                    function24 = function23;
                    function25 = function28;
                    startRestartGroup.endDefaults();
                    if (function25 != null) {
                    }
                    final Function2<? super Composer, ? super Integer, Unit> composableLambda22 = composableLambda4;
                    ComposableLambda composableLambda32 = ComposableLambdaKt.composableLambda(startRestartGroup, -178151495, z4, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                            invoke(columnScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(ColumnScope Tab, Composer composer3, int i102) {
                            Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
                            ComposerKt.sourceInformation(composer3, "C115@4971L49:Tab.kt#jmzs0o");
                            if ((i102 & 81) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                            } else {
                                TabKt.TabBaselineLayout(composableLambda22, function24, composer3, (i3 >> 12) & 112);
                            }
                        }
                    });
                    int i102 = 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                    int i112 = i3 >> 6;
                    composer2 = startRestartGroup;
                    m1193TabEVJuX4I(z, onClick, modifier2, z3, mutableInteractionSource4, j6, j5, composableLambda32, startRestartGroup, i102 | (57344 & i112) | (458752 & i112) | (i112 & 3670016), 0);
                    function26 = function25;
                    modifier3 = modifier2;
                    function27 = function24;
                    z5 = z3;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    j7 = j6;
                    j8 = j5;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                function23 = function22;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                if ((i & 29360128) == 0) {
                }
                if ((i & 234881024) == 0) {
                }
                if ((191739611 & i3) == 38347922) {
                }
                startRestartGroup.startDefaults();
                ComposableLambda composableLambda42 = null;
                if ((i & 1) != 0) {
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
                if ((i2 & 128) != 0) {
                }
                if ((i2 & 256) != 0) {
                }
                modifier2 = companion;
                z3 = z6;
                mutableInteractionSource4 = mutableInteractionSource3;
                j5 = j3;
                j6 = j4;
                function24 = function23;
                function25 = function28;
                startRestartGroup.endDefaults();
                if (function25 != null) {
                }
                final Function2<? super Composer, ? super Integer, Unit> composableLambda222 = composableLambda42;
                ComposableLambda composableLambda322 = ComposableLambdaKt.composableLambda(startRestartGroup, -178151495, z4, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                        invoke(columnScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ColumnScope Tab, Composer composer3, int i1022) {
                        Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
                        ComposerKt.sourceInformation(composer3, "C115@4971L49:Tab.kt#jmzs0o");
                        if ((i1022 & 81) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                        } else {
                            TabKt.TabBaselineLayout(composableLambda222, function24, composer3, (i3 >> 12) & 112);
                        }
                    }
                });
                int i1022 = 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                int i1122 = i3 >> 6;
                composer2 = startRestartGroup;
                m1193TabEVJuX4I(z, onClick, modifier2, z3, mutableInteractionSource4, j6, j5, composableLambda322, startRestartGroup, i1022 | (57344 & i1122) | (458752 & i1122) | (i1122 & 3670016), 0);
                function26 = function25;
                modifier3 = modifier2;
                function27 = function24;
                z5 = z3;
                mutableInteractionSource5 = mutableInteractionSource4;
                j7 = j6;
                j8 = j5;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            function23 = function22;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            if ((i & 29360128) == 0) {
            }
            if ((i & 234881024) == 0) {
            }
            if ((191739611 & i3) == 38347922) {
            }
            startRestartGroup.startDefaults();
            ComposableLambda composableLambda422 = null;
            if ((i & 1) != 0) {
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
            if ((i2 & 128) != 0) {
            }
            if ((i2 & 256) != 0) {
            }
            modifier2 = companion;
            z3 = z6;
            mutableInteractionSource4 = mutableInteractionSource3;
            j5 = j3;
            j6 = j4;
            function24 = function23;
            function25 = function28;
            startRestartGroup.endDefaults();
            if (function25 != null) {
            }
            final Function2<? super Composer, ? super Integer, Unit> composableLambda2222 = composableLambda422;
            ComposableLambda composableLambda3222 = ComposableLambdaKt.composableLambda(startRestartGroup, -178151495, z4, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                    invoke(columnScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ColumnScope Tab, Composer composer3, int i10222) {
                    Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
                    ComposerKt.sourceInformation(composer3, "C115@4971L49:Tab.kt#jmzs0o");
                    if ((i10222 & 81) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                    } else {
                        TabKt.TabBaselineLayout(composableLambda2222, function24, composer3, (i3 >> 12) & 112);
                    }
                }
            });
            int i10222 = 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
            int i11222 = i3 >> 6;
            composer2 = startRestartGroup;
            m1193TabEVJuX4I(z, onClick, modifier2, z3, mutableInteractionSource4, j6, j5, composableLambda3222, startRestartGroup, i10222 | (57344 & i11222) | (458752 & i11222) | (i11222 & 3670016), 0);
            function26 = function25;
            modifier3 = modifier2;
            function27 = function24;
            z5 = z3;
            mutableInteractionSource5 = mutableInteractionSource4;
            j7 = j6;
            j8 = j5;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        function23 = function22;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        if ((i & 29360128) == 0) {
        }
        if ((i & 234881024) == 0) {
        }
        if ((191739611 & i3) == 38347922) {
        }
        startRestartGroup.startDefaults();
        ComposableLambda composableLambda4222 = null;
        if ((i & 1) != 0) {
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
        if ((i2 & 128) != 0) {
        }
        if ((i2 & 256) != 0) {
        }
        modifier2 = companion;
        z3 = z6;
        mutableInteractionSource4 = mutableInteractionSource3;
        j5 = j3;
        j6 = j4;
        function24 = function23;
        function25 = function28;
        startRestartGroup.endDefaults();
        if (function25 != null) {
        }
        final Function2<? super Composer, ? super Integer, Unit> composableLambda22222 = composableLambda4222;
        ComposableLambda composableLambda32222 = ComposableLambdaKt.composableLambda(startRestartGroup, -178151495, z4, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                invoke(columnScope, composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(ColumnScope Tab, Composer composer3, int i102222) {
                Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
                ComposerKt.sourceInformation(composer3, "C115@4971L49:Tab.kt#jmzs0o");
                if ((i102222 & 81) == 16 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                } else {
                    TabKt.TabBaselineLayout(composableLambda22222, function24, composer3, (i3 >> 12) & 112);
                }
            }
        });
        int i102222 = 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
        int i112222 = i3 >> 6;
        composer2 = startRestartGroup;
        m1193TabEVJuX4I(z, onClick, modifier2, z3, mutableInteractionSource4, j6, j5, composableLambda32222, startRestartGroup, i102222 | (57344 & i112222) | (458752 & i112222) | (i112222 & 3670016), 0);
        function26 = function25;
        modifier3 = modifier2;
        function27 = function24;
        z5 = z3;
        mutableInteractionSource5 = mutableInteractionSource4;
        j7 = j6;
        j8 = j5;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00ae  */
    /* renamed from: LeadingIconTab-0nD-MI0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1191LeadingIconTab0nDMI0(final boolean z, final Function0<Unit> onClick, final Function2<? super Composer, ? super Integer, Unit> text, final Function2<? super Composer, ? super Integer, Unit> icon, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, long j, long j2, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        boolean z3;
        int i5;
        long j3;
        MutableInteractionSource mutableInteractionSource2;
        long j4;
        int i6;
        Modifier modifier2;
        long j5;
        long j6;
        MutableInteractionSource mutableInteractionSource3;
        boolean z4;
        final Modifier modifier3;
        final boolean z5;
        final MutableInteractionSource mutableInteractionSource4;
        final long j7;
        final long j8;
        ScopeUpdateScope endRestartGroup;
        int i7;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Composer startRestartGroup = composer.startRestartGroup(-1499861761);
        ComposerKt.sourceInformation(startRestartGroup, "C(LeadingIconTab)P(5,4,7,1,3!2,6:c#ui.graphics.Color,8:c#ui.graphics.Color)158@6914L39,159@7007L7,160@7099L6,165@7347L60,167@7413L929:Tab.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(onClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(text) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(icon) ? 2048 : 1024;
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((458752 & i) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 131072 : 65536;
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    i3 |= startRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                    if ((29360128 & i) == 0) {
                        if ((i2 & 128) == 0 && startRestartGroup.changed(j)) {
                            i7 = 8388608;
                            i3 |= i7;
                        }
                        i7 = 4194304;
                        i3 |= i7;
                    }
                    if ((i & 234881024) != 0) {
                        j3 = j2;
                        i3 |= ((i2 & 256) == 0 && startRestartGroup.changed(j3)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    } else {
                        j3 = j2;
                    }
                    if ((191739611 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i8 == 0 ? Modifier.INSTANCE : modifier;
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if (i5 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i2 & 128) == 0) {
                                ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(localContentColor);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                j4 = ((Color) consume).m1638unboximpl();
                                i3 &= -29360129;
                            } else {
                                j4 = j;
                            }
                            if ((i2 & 256) == 0) {
                                j6 = j4;
                                i6 = i3 & (-234881025);
                                modifier2 = companion;
                                j5 = Color.m1627copywmQWz5c$default(j6, ContentAlpha.INSTANCE.getMedium(startRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                i6 = i3;
                                modifier2 = companion;
                                j5 = j3;
                                j6 = j4;
                            }
                            mutableInteractionSource3 = mutableInteractionSource2;
                            z4 = z3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                            }
                            modifier2 = modifier;
                            mutableInteractionSource3 = mutableInteractionSource;
                            j6 = j;
                            i6 = i3;
                            z4 = z3;
                            j5 = j3;
                        }
                        startRestartGroup.endDefaults();
                        final Indication m1262rememberRipple9IZ8Weo = RippleKt.m1262rememberRipple9IZ8Weo(true, 0.0f, j6, startRestartGroup, ((i6 >> 15) & 896) | 6, 2);
                        final Modifier modifier4 = modifier2;
                        final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                        final boolean z6 = z4;
                        final int i9 = i6;
                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 866677691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i10) {
                                float f;
                                float f2;
                                float f3;
                                TextStyle m3497copyHL5avdY;
                                ComposerKt.sourceInformation(composer2, "C168@7493L843:Tab.kt#jmzs0o");
                                if ((i10 & 11) != 2 || !composer2.getSkipping()) {
                                    Modifier modifier5 = Modifier.this;
                                    f = TabKt.SmallTabHeight;
                                    Modifier m636selectableO2vRcR0 = SelectableKt.m636selectableO2vRcR0(SizeKt.m447height3ABfNKs(modifier5, f), z, mutableInteractionSource5, m1262rememberRipple9IZ8Weo, z6, Role.m3377boximpl(Role.INSTANCE.m3389getTabo7Vup1c()), onClick);
                                    f2 = TabKt.HorizontalTextPadding;
                                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m422paddingVpY3zN4$default(m636selectableO2vRcR0, f2, 0.0f, 2, null), 0.0f, 1, null);
                                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    Function2<Composer, Integer, Unit> function2 = icon;
                                    int i11 = i9;
                                    Function2<Composer, Integer, Unit> function22 = text;
                                    composer2.startReplaceableGroup(693286680);
                                    ComposerKt.sourceInformation(composer2, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                                    composer2.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume2 = composer2.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    Density density = (Density) consume2;
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume3 = composer2.consume(localLayoutDirection);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    LayoutDirection layoutDirection = (LayoutDirection) consume3;
                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume4 = composer2.consume(localViewConfiguration);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(fillMaxWidth$default);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    composer2.disableReusing();
                                    Composer m1283constructorimpl = Updater.m1283constructorimpl(composer2);
                                    Updater.m1290setimpl(m1283constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                    Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                    Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                    composer2.enableReusing();
                                    materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    composer2.startReplaceableGroup(-678309503);
                                    ComposerKt.sourceInformation(composer2, "C80@3988L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    composer2.startReplaceableGroup(1002887383);
                                    ComposerKt.sourceInformation(composer2, "C184@8105L6,185@8124L59,186@8222L10,187@8287L39:Tab.kt#jmzs0o");
                                    function2.invoke(composer2, Integer.valueOf((i11 >> 9) & 14));
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    f3 = TabKt.TextDistanceFromLeadingIcon;
                                    SpacerKt.Spacer(SizeKt.m458requiredWidth3ABfNKs(companion2, f3), composer2, 6);
                                    m3497copyHL5avdY = r8.m3497copyHL5avdY((r42 & 1) != 0 ? r8.spanStyle.m3459getColor0d7_KjU() : 0L, (r42 & 2) != 0 ? r8.spanStyle.getFontSize() : 0L, (r42 & 4) != 0 ? r8.spanStyle.getFontWeight() : null, (r42 & 8) != 0 ? r8.spanStyle.getFontStyle() : null, (r42 & 16) != 0 ? r8.spanStyle.getFontSynthesis() : null, (r42 & 32) != 0 ? r8.spanStyle.getFontFamily() : null, (r42 & 64) != 0 ? r8.spanStyle.getFontFeatureSettings() : null, (r42 & 128) != 0 ? r8.spanStyle.getLetterSpacing() : 0L, (r42 & 256) != 0 ? r8.spanStyle.getBaselineShift() : null, (r42 & 512) != 0 ? r8.spanStyle.getTextGeometricTransform() : null, (r42 & 1024) != 0 ? r8.spanStyle.getLocaleList() : null, (r42 & 2048) != 0 ? r8.spanStyle.getBackground() : 0L, (r42 & 4096) != 0 ? r8.spanStyle.getTextDecoration() : null, (r42 & 8192) != 0 ? r8.spanStyle.getShadow() : null, (r42 & 16384) != 0 ? r8.paragraphStyle.getTextAlign() : TextAlign.m3741boximpl(TextAlign.INSTANCE.m3748getCentere0LSkKk()), (r42 & 32768) != 0 ? r8.paragraphStyle.getTextDirection() : null, (r42 & 65536) != 0 ? r8.paragraphStyle.getLineHeight() : 0L, (r42 & 131072) != 0 ? MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton().paragraphStyle.getTextIndent() : null);
                                    TextKt.ProvideTextStyle(m3497copyHL5avdY, function22, composer2, (i11 >> 3) & 112);
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        });
                        int i10 = i6 >> 21;
                        m1194TabTransitionKlgxPg(j6, j5, z, composableLambda, startRestartGroup, (i10 & 112) | (i10 & 14) | 3072 | ((i6 << 6) & 896));
                        modifier3 = modifier2;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        j7 = j6;
                        j8 = j5;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        j7 = j;
                        j8 = j3;
                        mutableInteractionSource4 = mutableInteractionSource;
                        z5 = z3;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11) {
                            TabKt.m1191LeadingIconTab0nDMI0(z, onClick, text, icon, modifier3, z5, mutableInteractionSource4, j7, j8, composer2, i | 1, i2);
                        }
                    });
                    return;
                }
                if ((29360128 & i) == 0) {
                }
                if ((i & 234881024) != 0) {
                }
                if ((191739611 & i3) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i8 == 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if ((i2 & 256) == 0) {
                }
                mutableInteractionSource3 = mutableInteractionSource2;
                z4 = z3;
                startRestartGroup.endDefaults();
                final Indication m1262rememberRipple9IZ8Weo2 = RippleKt.m1262rememberRipple9IZ8Weo(true, 0.0f, j6, startRestartGroup, ((i6 >> 15) & 896) | 6, 2);
                final Modifier modifier42 = modifier2;
                final MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource3;
                final boolean z62 = z4;
                final int i92 = i6;
                ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(startRestartGroup, 866677691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i102) {
                        float f;
                        float f2;
                        float f3;
                        TextStyle m3497copyHL5avdY;
                        ComposerKt.sourceInformation(composer2, "C168@7493L843:Tab.kt#jmzs0o");
                        if ((i102 & 11) != 2 || !composer2.getSkipping()) {
                            Modifier modifier5 = Modifier.this;
                            f = TabKt.SmallTabHeight;
                            Modifier m636selectableO2vRcR0 = SelectableKt.m636selectableO2vRcR0(SizeKt.m447height3ABfNKs(modifier5, f), z, mutableInteractionSource52, m1262rememberRipple9IZ8Weo2, z62, Role.m3377boximpl(Role.INSTANCE.m3389getTabo7Vup1c()), onClick);
                            f2 = TabKt.HorizontalTextPadding;
                            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m422paddingVpY3zN4$default(m636selectableO2vRcR0, f2, 0.0f, 2, null), 0.0f, 1, null);
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function2<Composer, Integer, Unit> function2 = icon;
                            int i11 = i92;
                            Function2<Composer, Integer, Unit> function22 = text;
                            composer2.startReplaceableGroup(693286680);
                            ComposerKt.sourceInformation(composer2, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                            composer2.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume2 = composer2.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            Density density = (Density) consume2;
                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume3 = composer2.consume(localLayoutDirection);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            LayoutDirection layoutDirection = (LayoutDirection) consume3;
                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume4 = composer2.consume(localViewConfiguration);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(fillMaxWidth$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer m1283constructorimpl = Updater.m1283constructorimpl(composer2);
                            Updater.m1290setimpl(m1283constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                            Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                            Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                            composer2.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-678309503);
                            ComposerKt.sourceInformation(composer2, "C80@3988L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(1002887383);
                            ComposerKt.sourceInformation(composer2, "C184@8105L6,185@8124L59,186@8222L10,187@8287L39:Tab.kt#jmzs0o");
                            function2.invoke(composer2, Integer.valueOf((i11 >> 9) & 14));
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            f3 = TabKt.TextDistanceFromLeadingIcon;
                            SpacerKt.Spacer(SizeKt.m458requiredWidth3ABfNKs(companion2, f3), composer2, 6);
                            m3497copyHL5avdY = r8.m3497copyHL5avdY((r42 & 1) != 0 ? r8.spanStyle.m3459getColor0d7_KjU() : 0L, (r42 & 2) != 0 ? r8.spanStyle.getFontSize() : 0L, (r42 & 4) != 0 ? r8.spanStyle.getFontWeight() : null, (r42 & 8) != 0 ? r8.spanStyle.getFontStyle() : null, (r42 & 16) != 0 ? r8.spanStyle.getFontSynthesis() : null, (r42 & 32) != 0 ? r8.spanStyle.getFontFamily() : null, (r42 & 64) != 0 ? r8.spanStyle.getFontFeatureSettings() : null, (r42 & 128) != 0 ? r8.spanStyle.getLetterSpacing() : 0L, (r42 & 256) != 0 ? r8.spanStyle.getBaselineShift() : null, (r42 & 512) != 0 ? r8.spanStyle.getTextGeometricTransform() : null, (r42 & 1024) != 0 ? r8.spanStyle.getLocaleList() : null, (r42 & 2048) != 0 ? r8.spanStyle.getBackground() : 0L, (r42 & 4096) != 0 ? r8.spanStyle.getTextDecoration() : null, (r42 & 8192) != 0 ? r8.spanStyle.getShadow() : null, (r42 & 16384) != 0 ? r8.paragraphStyle.getTextAlign() : TextAlign.m3741boximpl(TextAlign.INSTANCE.m3748getCentere0LSkKk()), (r42 & 32768) != 0 ? r8.paragraphStyle.getTextDirection() : null, (r42 & 65536) != 0 ? r8.paragraphStyle.getLineHeight() : 0L, (r42 & 131072) != 0 ? MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton().paragraphStyle.getTextIndent() : null);
                            TextKt.ProvideTextStyle(m3497copyHL5avdY, function22, composer2, (i11 >> 3) & 112);
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                });
                int i102 = i6 >> 21;
                m1194TabTransitionKlgxPg(j6, j5, z, composableLambda2, startRestartGroup, (i102 & 112) | (i102 & 14) | 3072 | ((i6 << 6) & 896));
                modifier3 = modifier2;
                z5 = z4;
                mutableInteractionSource4 = mutableInteractionSource3;
                j7 = j6;
                j8 = j5;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z3 = z2;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            if ((29360128 & i) == 0) {
            }
            if ((i & 234881024) != 0) {
            }
            if ((191739611 & i3) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 == 0) {
            }
            if (i4 != 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if ((i2 & 256) == 0) {
            }
            mutableInteractionSource3 = mutableInteractionSource2;
            z4 = z3;
            startRestartGroup.endDefaults();
            final Indication m1262rememberRipple9IZ8Weo22 = RippleKt.m1262rememberRipple9IZ8Weo(true, 0.0f, j6, startRestartGroup, ((i6 >> 15) & 896) | 6, 2);
            final Modifier modifier422 = modifier2;
            final MutableInteractionSource mutableInteractionSource522 = mutableInteractionSource3;
            final boolean z622 = z4;
            final int i922 = i6;
            ComposableLambda composableLambda22 = ComposableLambdaKt.composableLambda(startRestartGroup, 866677691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i1022) {
                    float f;
                    float f2;
                    float f3;
                    TextStyle m3497copyHL5avdY;
                    ComposerKt.sourceInformation(composer2, "C168@7493L843:Tab.kt#jmzs0o");
                    if ((i1022 & 11) != 2 || !composer2.getSkipping()) {
                        Modifier modifier5 = Modifier.this;
                        f = TabKt.SmallTabHeight;
                        Modifier m636selectableO2vRcR0 = SelectableKt.m636selectableO2vRcR0(SizeKt.m447height3ABfNKs(modifier5, f), z, mutableInteractionSource522, m1262rememberRipple9IZ8Weo22, z622, Role.m3377boximpl(Role.INSTANCE.m3389getTabo7Vup1c()), onClick);
                        f2 = TabKt.HorizontalTextPadding;
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m422paddingVpY3zN4$default(m636selectableO2vRcR0, f2, 0.0f, 2, null), 0.0f, 1, null);
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function2<Composer, Integer, Unit> function2 = icon;
                        int i11 = i922;
                        Function2<Composer, Integer, Unit> function22 = text;
                        composer2.startReplaceableGroup(693286680);
                        ComposerKt.sourceInformation(composer2, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume2 = composer2.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        Density density = (Density) consume2;
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume3 = composer2.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        LayoutDirection layoutDirection = (LayoutDirection) consume3;
                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume4 = composer2.consume(localViewConfiguration);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(fillMaxWidth$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer m1283constructorimpl = Updater.m1283constructorimpl(composer2);
                        Updater.m1290setimpl(m1283constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                        Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                        Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                        composer2.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-678309503);
                        ComposerKt.sourceInformation(composer2, "C80@3988L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(1002887383);
                        ComposerKt.sourceInformation(composer2, "C184@8105L6,185@8124L59,186@8222L10,187@8287L39:Tab.kt#jmzs0o");
                        function2.invoke(composer2, Integer.valueOf((i11 >> 9) & 14));
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        f3 = TabKt.TextDistanceFromLeadingIcon;
                        SpacerKt.Spacer(SizeKt.m458requiredWidth3ABfNKs(companion2, f3), composer2, 6);
                        m3497copyHL5avdY = r8.m3497copyHL5avdY((r42 & 1) != 0 ? r8.spanStyle.m3459getColor0d7_KjU() : 0L, (r42 & 2) != 0 ? r8.spanStyle.getFontSize() : 0L, (r42 & 4) != 0 ? r8.spanStyle.getFontWeight() : null, (r42 & 8) != 0 ? r8.spanStyle.getFontStyle() : null, (r42 & 16) != 0 ? r8.spanStyle.getFontSynthesis() : null, (r42 & 32) != 0 ? r8.spanStyle.getFontFamily() : null, (r42 & 64) != 0 ? r8.spanStyle.getFontFeatureSettings() : null, (r42 & 128) != 0 ? r8.spanStyle.getLetterSpacing() : 0L, (r42 & 256) != 0 ? r8.spanStyle.getBaselineShift() : null, (r42 & 512) != 0 ? r8.spanStyle.getTextGeometricTransform() : null, (r42 & 1024) != 0 ? r8.spanStyle.getLocaleList() : null, (r42 & 2048) != 0 ? r8.spanStyle.getBackground() : 0L, (r42 & 4096) != 0 ? r8.spanStyle.getTextDecoration() : null, (r42 & 8192) != 0 ? r8.spanStyle.getShadow() : null, (r42 & 16384) != 0 ? r8.paragraphStyle.getTextAlign() : TextAlign.m3741boximpl(TextAlign.INSTANCE.m3748getCentere0LSkKk()), (r42 & 32768) != 0 ? r8.paragraphStyle.getTextDirection() : null, (r42 & 65536) != 0 ? r8.paragraphStyle.getLineHeight() : 0L, (r42 & 131072) != 0 ? MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton().paragraphStyle.getTextIndent() : null);
                        TextKt.ProvideTextStyle(m3497copyHL5avdY, function22, composer2, (i11 >> 3) & 112);
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            });
            int i1022 = i6 >> 21;
            m1194TabTransitionKlgxPg(j6, j5, z, composableLambda22, startRestartGroup, (i1022 & 112) | (i1022 & 14) | 3072 | ((i6 << 6) & 896));
            modifier3 = modifier2;
            z5 = z4;
            mutableInteractionSource4 = mutableInteractionSource3;
            j7 = j6;
            j8 = j5;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        z3 = z2;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        if ((29360128 & i) == 0) {
        }
        if ((i & 234881024) != 0) {
        }
        if ((191739611 & i3) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if (i4 != 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((i2 & 256) == 0) {
        }
        mutableInteractionSource3 = mutableInteractionSource2;
        z4 = z3;
        startRestartGroup.endDefaults();
        final Indication m1262rememberRipple9IZ8Weo222 = RippleKt.m1262rememberRipple9IZ8Weo(true, 0.0f, j6, startRestartGroup, ((i6 >> 15) & 896) | 6, 2);
        final Modifier modifier4222 = modifier2;
        final MutableInteractionSource mutableInteractionSource5222 = mutableInteractionSource3;
        final boolean z6222 = z4;
        final int i9222 = i6;
        ComposableLambda composableLambda222 = ComposableLambdaKt.composableLambda(startRestartGroup, 866677691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i10222) {
                float f;
                float f2;
                float f3;
                TextStyle m3497copyHL5avdY;
                ComposerKt.sourceInformation(composer2, "C168@7493L843:Tab.kt#jmzs0o");
                if ((i10222 & 11) != 2 || !composer2.getSkipping()) {
                    Modifier modifier5 = Modifier.this;
                    f = TabKt.SmallTabHeight;
                    Modifier m636selectableO2vRcR0 = SelectableKt.m636selectableO2vRcR0(SizeKt.m447height3ABfNKs(modifier5, f), z, mutableInteractionSource5222, m1262rememberRipple9IZ8Weo222, z6222, Role.m3377boximpl(Role.INSTANCE.m3389getTabo7Vup1c()), onClick);
                    f2 = TabKt.HorizontalTextPadding;
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m422paddingVpY3zN4$default(m636selectableO2vRcR0, f2, 0.0f, 2, null), 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Function2<Composer, Integer, Unit> function2 = icon;
                    int i11 = i9222;
                    Function2<Composer, Integer, Unit> function22 = text;
                    composer2.startReplaceableGroup(693286680);
                    ComposerKt.sourceInformation(composer2, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume2 = composer2.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Density density = (Density) consume2;
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume3 = composer2.consume(localLayoutDirection);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    LayoutDirection layoutDirection = (LayoutDirection) consume3;
                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume4 = composer2.consume(localViewConfiguration);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(fillMaxWidth$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer m1283constructorimpl = Updater.m1283constructorimpl(composer2);
                    Updater.m1290setimpl(m1283constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                    Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                    Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                    composer2.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-678309503);
                    ComposerKt.sourceInformation(composer2, "C80@3988L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(1002887383);
                    ComposerKt.sourceInformation(composer2, "C184@8105L6,185@8124L59,186@8222L10,187@8287L39:Tab.kt#jmzs0o");
                    function2.invoke(composer2, Integer.valueOf((i11 >> 9) & 14));
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    f3 = TabKt.TextDistanceFromLeadingIcon;
                    SpacerKt.Spacer(SizeKt.m458requiredWidth3ABfNKs(companion2, f3), composer2, 6);
                    m3497copyHL5avdY = r8.m3497copyHL5avdY((r42 & 1) != 0 ? r8.spanStyle.m3459getColor0d7_KjU() : 0L, (r42 & 2) != 0 ? r8.spanStyle.getFontSize() : 0L, (r42 & 4) != 0 ? r8.spanStyle.getFontWeight() : null, (r42 & 8) != 0 ? r8.spanStyle.getFontStyle() : null, (r42 & 16) != 0 ? r8.spanStyle.getFontSynthesis() : null, (r42 & 32) != 0 ? r8.spanStyle.getFontFamily() : null, (r42 & 64) != 0 ? r8.spanStyle.getFontFeatureSettings() : null, (r42 & 128) != 0 ? r8.spanStyle.getLetterSpacing() : 0L, (r42 & 256) != 0 ? r8.spanStyle.getBaselineShift() : null, (r42 & 512) != 0 ? r8.spanStyle.getTextGeometricTransform() : null, (r42 & 1024) != 0 ? r8.spanStyle.getLocaleList() : null, (r42 & 2048) != 0 ? r8.spanStyle.getBackground() : 0L, (r42 & 4096) != 0 ? r8.spanStyle.getTextDecoration() : null, (r42 & 8192) != 0 ? r8.spanStyle.getShadow() : null, (r42 & 16384) != 0 ? r8.paragraphStyle.getTextAlign() : TextAlign.m3741boximpl(TextAlign.INSTANCE.m3748getCentere0LSkKk()), (r42 & 32768) != 0 ? r8.paragraphStyle.getTextDirection() : null, (r42 & 65536) != 0 ? r8.paragraphStyle.getLineHeight() : 0L, (r42 & 131072) != 0 ? MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton().paragraphStyle.getTextIndent() : null);
                    TextKt.ProvideTextStyle(m3497copyHL5avdY, function22, composer2, (i11 >> 3) & 112);
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    return;
                }
                composer2.skipToGroupEnd();
            }
        });
        int i10222 = i6 >> 21;
        m1194TabTransitionKlgxPg(j6, j5, z, composableLambda222, startRestartGroup, (i10222 & 112) | (i10222 & 14) | 3072 | ((i6 << 6) & 896));
        modifier3 = modifier2;
        z5 = z4;
        mutableInteractionSource4 = mutableInteractionSource3;
        j7 = j6;
        j8 = j5;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0091  */
    /* renamed from: Tab-EVJuX4I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1193TabEVJuX4I(final boolean z, final Function0<Unit> onClick, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, long j, long j2, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final boolean z3;
        int i5;
        long j3;
        MutableInteractionSource mutableInteractionSource2;
        long j4;
        int i6;
        Modifier modifier3;
        long j5;
        long j6;
        MutableInteractionSource mutableInteractionSource3;
        boolean z4;
        final Modifier modifier4;
        final MutableInteractionSource mutableInteractionSource4;
        final long j7;
        final long j8;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(713679175);
        ComposerKt.sourceInformation(startRestartGroup, "C(Tab)P(5,4,3,1,2,6:c#ui.graphics.Color,7:c#ui.graphics.Color)227@10083L39,228@10176L7,229@10268L6,235@10562L60,237@10628L618:Tab.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(onClick) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    i3 |= startRestartGroup.changed(mutableInteractionSource) ? 16384 : 8192;
                    if ((458752 & i) == 0) {
                        if ((i2 & 32) == 0 && startRestartGroup.changed(j)) {
                            i8 = 131072;
                            i3 |= i8;
                        }
                        i8 = 65536;
                        i3 |= i8;
                    }
                    if ((3670016 & i) != 0) {
                        j3 = j2;
                        i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(j3)) ? 1048576 : 524288;
                    } else {
                        j3 = j2;
                    }
                    if ((i2 & 128) != 0) {
                        i7 = (29360128 & i) == 0 ? startRestartGroup.changed(content) ? 8388608 : 4194304 : 12582912;
                        if ((23967451 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i9 != 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    z3 = true;
                                }
                                if (i5 != 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                if ((i2 & 32) != 0) {
                                    ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localContentColor);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    j4 = ((Color) consume).m1638unboximpl();
                                    i3 &= -458753;
                                } else {
                                    j4 = j;
                                }
                                if ((i2 & 64) != 0) {
                                    j6 = j4;
                                    i6 = i3 & (-3670017);
                                    modifier3 = companion;
                                    j5 = Color.m1627copywmQWz5c$default(j6, ContentAlpha.INSTANCE.getMedium(startRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                } else {
                                    i6 = i3;
                                    modifier3 = companion;
                                    j5 = j3;
                                    j6 = j4;
                                }
                                mutableInteractionSource3 = mutableInteractionSource2;
                                z4 = z3;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                mutableInteractionSource3 = mutableInteractionSource;
                                j6 = j;
                                i6 = i3;
                                modifier3 = modifier2;
                                z4 = z3;
                                j5 = j3;
                            }
                            startRestartGroup.endDefaults();
                            final Indication m1262rememberRipple9IZ8Weo = RippleKt.m1262rememberRipple9IZ8Weo(true, 0.0f, j6, startRestartGroup, ((i6 >> 9) & 896) | 6, 2);
                            final Modifier modifier5 = modifier3;
                            final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                            final boolean z5 = z4;
                            final int i10 = i6;
                            int i11 = i6 >> 15;
                            m1194TabTransitionKlgxPg(j6, j5, z, ComposableLambdaKt.composableLambda(startRestartGroup, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i12) {
                                    ComposerKt.sourceInformation(composer2, "C238@10708L532:Tab.kt#jmzs0o");
                                    if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m636selectableO2vRcR0(Modifier.this, z, mutableInteractionSource5, m1262rememberRipple9IZ8Weo, z5, Role.m3377boximpl(Role.INSTANCE.m3389getTabo7Vup1c()), onClick), 0.0f, 1, null);
                                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                        Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                                        int i13 = ((i10 >> 12) & 7168) | 432;
                                        composer2.startReplaceableGroup(-483455358);
                                        ComposerKt.sourceInformation(composer2, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                                        composer2.startReplaceableGroup(-1323940314);
                                        ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume2 = composer2.consume(localDensity);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        Density density = (Density) consume2;
                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume3 = composer2.consume(localLayoutDirection);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        LayoutDirection layoutDirection = (LayoutDirection) consume3;
                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume4 = composer2.consume(localViewConfiguration);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(fillMaxWidth$default);
                                        if (!(composer2.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (composer2.getInserting()) {
                                            composer2.createNode(constructor);
                                        } else {
                                            composer2.useNode();
                                        }
                                        composer2.disableReusing();
                                        Composer m1283constructorimpl = Updater.m1283constructorimpl(composer2);
                                        Updater.m1290setimpl(m1283constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                        Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                        Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                        composer2.enableReusing();
                                        materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer2)), composer2, 0);
                                        composer2.startReplaceableGroup(2058660585);
                                        composer2.startReplaceableGroup(-1163856341);
                                        ComposerKt.sourceInformation(composer2, "C79@3994L9:Column.kt#2w3rfo");
                                        function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i13 >> 6) & 112) | 6));
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                        composer2.endNode();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }), startRestartGroup, (i11 & 112) | (i11 & 14) | 3072 | ((i6 << 6) & 896));
                            modifier4 = modifier3;
                            z3 = z4;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            j7 = j6;
                            j8 = j5;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            mutableInteractionSource4 = mutableInteractionSource;
                            modifier4 = modifier2;
                            j8 = j3;
                            j7 = j;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i12) {
                                TabKt.m1193TabEVJuX4I(z, onClick, modifier4, z3, mutableInteractionSource4, j7, j8, content, composer2, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i3 |= i7;
                    if ((23967451 & i3) == 4793490) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z4 = z3;
                    startRestartGroup.endDefaults();
                    final Indication m1262rememberRipple9IZ8Weo2 = RippleKt.m1262rememberRipple9IZ8Weo(true, 0.0f, j6, startRestartGroup, ((i6 >> 9) & 896) | 6, 2);
                    final Modifier modifier52 = modifier3;
                    final MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource3;
                    final boolean z52 = z4;
                    final int i102 = i6;
                    int i112 = i6 >> 15;
                    m1194TabTransitionKlgxPg(j6, j5, z, ComposableLambdaKt.composableLambda(startRestartGroup, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i12) {
                            ComposerKt.sourceInformation(composer2, "C238@10708L532:Tab.kt#jmzs0o");
                            if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m636selectableO2vRcR0(Modifier.this, z, mutableInteractionSource52, m1262rememberRipple9IZ8Weo2, z52, Role.m3377boximpl(Role.INSTANCE.m3389getTabo7Vup1c()), onClick), 0.0f, 1, null);
                                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                                int i13 = ((i102 >> 12) & 7168) | 432;
                                composer2.startReplaceableGroup(-483455358);
                                ComposerKt.sourceInformation(composer2, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                                composer2.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume2 = composer2.consume(localDensity);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                Density density = (Density) consume2;
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume3 = composer2.consume(localLayoutDirection);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                LayoutDirection layoutDirection = (LayoutDirection) consume3;
                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume4 = composer2.consume(localViewConfiguration);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(fillMaxWidth$default);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer m1283constructorimpl = Updater.m1283constructorimpl(composer2);
                                Updater.m1290setimpl(m1283constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                composer2.enableReusing();
                                materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-1163856341);
                                ComposerKt.sourceInformation(composer2, "C79@3994L9:Column.kt#2w3rfo");
                                function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i13 >> 6) & 112) | 6));
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), startRestartGroup, (i112 & 112) | (i112 & 14) | 3072 | ((i6 << 6) & 896));
                    modifier4 = modifier3;
                    z3 = z4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    j7 = j6;
                    j8 = j5;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                if ((458752 & i) == 0) {
                }
                if ((3670016 & i) != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                i3 |= i7;
                if ((23967451 & i3) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                mutableInteractionSource3 = mutableInteractionSource2;
                z4 = z3;
                startRestartGroup.endDefaults();
                final Indication m1262rememberRipple9IZ8Weo22 = RippleKt.m1262rememberRipple9IZ8Weo(true, 0.0f, j6, startRestartGroup, ((i6 >> 9) & 896) | 6, 2);
                final Modifier modifier522 = modifier3;
                final MutableInteractionSource mutableInteractionSource522 = mutableInteractionSource3;
                final boolean z522 = z4;
                final int i1022 = i6;
                int i1122 = i6 >> 15;
                m1194TabTransitionKlgxPg(j6, j5, z, ComposableLambdaKt.composableLambda(startRestartGroup, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i12) {
                        ComposerKt.sourceInformation(composer2, "C238@10708L532:Tab.kt#jmzs0o");
                        if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m636selectableO2vRcR0(Modifier.this, z, mutableInteractionSource522, m1262rememberRipple9IZ8Weo22, z522, Role.m3377boximpl(Role.INSTANCE.m3389getTabo7Vup1c()), onClick), 0.0f, 1, null);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                            int i13 = ((i1022 >> 12) & 7168) | 432;
                            composer2.startReplaceableGroup(-483455358);
                            ComposerKt.sourceInformation(composer2, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                            composer2.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume2 = composer2.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            Density density = (Density) consume2;
                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume3 = composer2.consume(localLayoutDirection);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            LayoutDirection layoutDirection = (LayoutDirection) consume3;
                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume4 = composer2.consume(localViewConfiguration);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(fillMaxWidth$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer m1283constructorimpl = Updater.m1283constructorimpl(composer2);
                            Updater.m1290setimpl(m1283constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                            Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                            Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                            composer2.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1163856341);
                            ComposerKt.sourceInformation(composer2, "C79@3994L9:Column.kt#2w3rfo");
                            function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i13 >> 6) & 112) | 6));
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), startRestartGroup, (i1122 & 112) | (i1122 & 14) | 3072 | ((i6 << 6) & 896));
                modifier4 = modifier3;
                z3 = z4;
                mutableInteractionSource4 = mutableInteractionSource3;
                j7 = j6;
                j8 = j5;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            if ((458752 & i) == 0) {
            }
            if ((3670016 & i) != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            i3 |= i7;
            if ((23967451 & i3) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            mutableInteractionSource3 = mutableInteractionSource2;
            z4 = z3;
            startRestartGroup.endDefaults();
            final Indication m1262rememberRipple9IZ8Weo222 = RippleKt.m1262rememberRipple9IZ8Weo(true, 0.0f, j6, startRestartGroup, ((i6 >> 9) & 896) | 6, 2);
            final Modifier modifier5222 = modifier3;
            final MutableInteractionSource mutableInteractionSource5222 = mutableInteractionSource3;
            final boolean z5222 = z4;
            final int i10222 = i6;
            int i11222 = i6 >> 15;
            m1194TabTransitionKlgxPg(j6, j5, z, ComposableLambdaKt.composableLambda(startRestartGroup, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i12) {
                    ComposerKt.sourceInformation(composer2, "C238@10708L532:Tab.kt#jmzs0o");
                    if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m636selectableO2vRcR0(Modifier.this, z, mutableInteractionSource5222, m1262rememberRipple9IZ8Weo222, z5222, Role.m3377boximpl(Role.INSTANCE.m3389getTabo7Vup1c()), onClick), 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                        int i13 = ((i10222 >> 12) & 7168) | 432;
                        composer2.startReplaceableGroup(-483455358);
                        ComposerKt.sourceInformation(composer2, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume2 = composer2.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        Density density = (Density) consume2;
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume3 = composer2.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        LayoutDirection layoutDirection = (LayoutDirection) consume3;
                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume4 = composer2.consume(localViewConfiguration);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(fillMaxWidth$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer m1283constructorimpl = Updater.m1283constructorimpl(composer2);
                        Updater.m1290setimpl(m1283constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                        Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                        Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                        composer2.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-1163856341);
                        ComposerKt.sourceInformation(composer2, "C79@3994L9:Column.kt#2w3rfo");
                        function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i13 >> 6) & 112) | 6));
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, (i11222 & 112) | (i11222 & 14) | 3072 | ((i6 << 6) & 896));
            modifier4 = modifier3;
            z3 = z4;
            mutableInteractionSource4 = mutableInteractionSource3;
            j7 = j6;
            j8 = j5;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        if ((458752 & i) == 0) {
        }
        if ((3670016 & i) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        i3 |= i7;
        if ((23967451 & i3) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        mutableInteractionSource3 = mutableInteractionSource2;
        z4 = z3;
        startRestartGroup.endDefaults();
        final Indication m1262rememberRipple9IZ8Weo2222 = RippleKt.m1262rememberRipple9IZ8Weo(true, 0.0f, j6, startRestartGroup, ((i6 >> 9) & 896) | 6, 2);
        final Modifier modifier52222 = modifier3;
        final MutableInteractionSource mutableInteractionSource52222 = mutableInteractionSource3;
        final boolean z52222 = z4;
        final int i102222 = i6;
        int i112222 = i6 >> 15;
        m1194TabTransitionKlgxPg(j6, j5, z, ComposableLambdaKt.composableLambda(startRestartGroup, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i12) {
                ComposerKt.sourceInformation(composer2, "C238@10708L532:Tab.kt#jmzs0o");
                if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m636selectableO2vRcR0(Modifier.this, z, mutableInteractionSource52222, m1262rememberRipple9IZ8Weo2222, z52222, Role.m3377boximpl(Role.INSTANCE.m3389getTabo7Vup1c()), onClick), 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                    int i13 = ((i102222 >> 12) & 7168) | 432;
                    composer2.startReplaceableGroup(-483455358);
                    ComposerKt.sourceInformation(composer2, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume2 = composer2.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Density density = (Density) consume2;
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume3 = composer2.consume(localLayoutDirection);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    LayoutDirection layoutDirection = (LayoutDirection) consume3;
                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume4 = composer2.consume(localViewConfiguration);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(fillMaxWidth$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer m1283constructorimpl = Updater.m1283constructorimpl(composer2);
                    Updater.m1290setimpl(m1283constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                    Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                    Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                    composer2.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-1163856341);
                    ComposerKt.sourceInformation(composer2, "C79@3994L9:Column.kt#2w3rfo");
                    function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i13 >> 6) & 112) | 6));
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, (i112222 & 112) | (i112222 & 14) | 3072 | ((i6 << 6) & 896));
        modifier4 = modifier3;
        z3 = z4;
        mutableInteractionSource4 = mutableInteractionSource3;
        j7 = j6;
        j8 = j5;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TabTransition-Klgx-Pg, reason: not valid java name */
    public static final void m1194TabTransitionKlgxPg(final long j, final long j2, final boolean z, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-405571117);
        ComposerKt.sourceInformation(startRestartGroup, "C(TabTransition)P(0:c#ui.graphics.Color,2:c#ui.graphics.Color,3)268@11677L26,269@11732L550,287@12287L164:Tab.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(function2) ? 2048 : 1024;
        }
        if ((i2 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            int i3 = i2 >> 6;
            Transition updateTransition = TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, startRestartGroup, i3 & 14, 2);
            TabKt$TabTransition$color$2 tabKt$TabTransition$color$2 = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material.TabKt$TabTransition$color$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<Boolean> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }

                public final FiniteAnimationSpec<Color> invoke(Transition.Segment<Boolean> animateColor, Composer composer2, int i4) {
                    TweenSpec tween$default;
                    Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                    composer2.startReplaceableGroup(-2120892502);
                    if (animateColor.isTransitioningTo(false, true)) {
                        tween$default = AnimationSpecKt.tween(TextFieldImplKt.AnimationDuration, 100, EasingKt.getLinearEasing());
                    } else {
                        tween$default = AnimationSpecKt.tween$default(100, 0, EasingKt.getLinearEasing(), 2, null);
                    }
                    composer2.endReplaceableGroup();
                    return tween$default;
                }
            };
            startRestartGroup.startReplaceableGroup(-1462136984);
            ComposerKt.sourceInformation(startRestartGroup, "C(animateColor)P(2)68@3224L31,69@3291L70,73@3374L70:Transition.kt#xbi5r1");
            boolean booleanValue = ((Boolean) updateTransition.getTargetState()).booleanValue();
            startRestartGroup.startReplaceableGroup(1445938070);
            ComposerKt.sourceInformation(startRestartGroup, "C:Tab.kt#jmzs0o");
            long j3 = booleanValue ? j : j2;
            startRestartGroup.endReplaceableGroup();
            ColorSpace m1632getColorSpaceimpl = Color.m1632getColorSpaceimpl(j3);
            startRestartGroup.startReplaceableGroup(-3686930);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(m1632getColorSpaceimpl);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m1632getColorSpaceimpl);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            TwoWayConverter twoWayConverter = (TwoWayConverter) rememberedValue;
            startRestartGroup.startReplaceableGroup(1847725064);
            ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
            boolean booleanValue2 = ((Boolean) updateTransition.getCurrentState()).booleanValue();
            startRestartGroup.startReplaceableGroup(1445938070);
            ComposerKt.sourceInformation(startRestartGroup, "C:Tab.kt#jmzs0o");
            long j4 = booleanValue2 ? j : j2;
            startRestartGroup.endReplaceableGroup();
            Color m1618boximpl = Color.m1618boximpl(j4);
            boolean booleanValue3 = ((Boolean) updateTransition.getTargetState()).booleanValue();
            startRestartGroup.startReplaceableGroup(1445938070);
            ComposerKt.sourceInformation(startRestartGroup, "C:Tab.kt#jmzs0o");
            long j5 = booleanValue3 ? j : j2;
            startRestartGroup.endReplaceableGroup();
            State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, m1618boximpl, Color.m1618boximpl(j5), tabKt$TabTransition$color$2.invoke((TabKt$TabTransition$color$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter, "ColorAnimation", startRestartGroup, 32768);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(Color.m1627copywmQWz5c$default(m1195TabTransition_Klgx_Pg$lambda5(createTransitionAnimation), 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1630getAlphaimpl(m1195TabTransition_Klgx_Pg$lambda5(createTransitionAnimation))))}, function2, startRestartGroup, (i3 & 112) | 8);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$TabTransition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i4) {
                TabKt.m1194TabTransitionKlgxPg(j, j2, z, function2, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TabBaselineLayout(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1249848471);
        ComposerKt.sourceInformation(startRestartGroup, "C(TabBaselineLayout)P(1)304@12859L1909:Tab.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(function22) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.TabKt$TabBaselineLayout$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo15measure3p2s80s(final MeasureScope Layout, List<? extends Measurable> measurables, long j) {
                    final Placeable placeable;
                    final Placeable placeable2;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    if (function2 != null) {
                        for (Measurable measurable : measurables) {
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "text")) {
                                placeable = measurable.mo3121measureBRTryo0(Constraints.m3787copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    placeable = null;
                    if (function22 != null) {
                        for (Measurable measurable2 : measurables) {
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "icon")) {
                                placeable2 = measurable2.mo3121measureBRTryo0(j);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    placeable2 = null;
                    final int max = Math.max(placeable != null ? placeable.getWidth() : 0, placeable2 != null ? placeable2.getWidth() : 0);
                    final int i3 = Layout.mo309roundToPx0680j_4((placeable == null || placeable2 == null) ? TabKt.SmallTabHeight : TabKt.LargeTabHeight);
                    final Integer valueOf = placeable != null ? Integer.valueOf(placeable.get(AlignmentLineKt.getFirstBaseline())) : null;
                    final Integer valueOf2 = placeable != null ? Integer.valueOf(placeable.get(AlignmentLineKt.getLastBaseline())) : null;
                    return MeasureScope.layout$default(Layout, max, i3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabKt$TabBaselineLayout$2$measure$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Placeable.PlacementScope layout) {
                            Placeable placeable3;
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            Placeable placeable4 = Placeable.this;
                            if (placeable4 == null || (placeable3 = placeable2) == null) {
                                if (placeable4 != null) {
                                    TabKt.placeTextOrIcon(layout, placeable4, i3);
                                    return;
                                }
                                Placeable placeable5 = placeable2;
                                if (placeable5 != null) {
                                    TabKt.placeTextOrIcon(layout, placeable5, i3);
                                    return;
                                }
                                return;
                            }
                            MeasureScope measureScope = Layout;
                            int i4 = max;
                            int i5 = i3;
                            Integer num = valueOf;
                            Intrinsics.checkNotNull(num);
                            int intValue = num.intValue();
                            Integer num2 = valueOf2;
                            Intrinsics.checkNotNull(num2);
                            TabKt.placeTextAndIcon(layout, measureScope, placeable4, placeable3, i4, i5, intValue, num2.intValue());
                        }
                    }, 4, null);
                }
            };
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            Modifier.Companion companion = Modifier.INSTANCE;
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(localViewConfiguration);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1283constructorimpl = Updater.m1283constructorimpl(startRestartGroup);
            Updater.m1290setimpl(m1283constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(1142473408);
            ComposerKt.sourceInformation(startRestartGroup, "C312@13111L41:Tab.kt#jmzs0o");
            startRestartGroup.startReplaceableGroup(-2141028452);
            ComposerKt.sourceInformation(startRestartGroup, "307@12925L123");
            if (function2 != null) {
                Modifier m422paddingVpY3zN4$default = PaddingKt.m422paddingVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, "text"), HorizontalTextPadding, 0.0f, 2, null);
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume4 = startRestartGroup.consume(localDensity2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density2 = (Density) consume4;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume5 = startRestartGroup.consume(localLayoutDirection2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume6 = startRestartGroup.consume(localViewConfiguration2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(m422paddingVpY3zN4$default);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m1283constructorimpl2 = Updater.m1283constructorimpl(startRestartGroup);
                Updater.m1290setimpl(m1283constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m1290setimpl(m1283constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                Updater.m1290setimpl(m1283constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                Updater.m1290setimpl(m1283constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(-459869377);
                ComposerKt.sourceInformation(startRestartGroup, "C309@13040L6:Tab.kt#jmzs0o");
                function2.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            if (function22 != null) {
                Modifier layoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, "icon");
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume7 = startRestartGroup.consume(localDensity3);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density3 = (Density) consume7;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume8 = startRestartGroup.consume(localLayoutDirection3);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection3 = (LayoutDirection) consume8;
                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration3 = CompositionLocalsKt.getLocalViewConfiguration();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume9 = startRestartGroup.consume(localViewConfiguration3);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume9;
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(layoutId);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m1283constructorimpl3 = Updater.m1283constructorimpl(startRestartGroup);
                Updater.m1290setimpl(m1283constructorimpl3, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m1290setimpl(m1283constructorimpl3, density3, ComposeUiNode.INSTANCE.getSetDensity());
                Updater.m1290setimpl(m1283constructorimpl3, layoutDirection3, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                Updater.m1290setimpl(m1283constructorimpl3, viewConfiguration3, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf3.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(892169960);
                ComposerKt.sourceInformation(startRestartGroup, "C312@13144L6:Tab.kt#jmzs0o");
                function22.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$TabBaselineLayout$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                TabKt.TabBaselineLayout(function2, function22, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeTextOrIcon(Placeable.PlacementScope placementScope, Placeable placeable, int i) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, (i - placeable.getHeight()) / 2, 0.0f, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeTextAndIcon(Placeable.PlacementScope placementScope, Density density, Placeable placeable, Placeable placeable2, int i, int i2, int i3, int i4) {
        float f;
        if (i3 == i4) {
            f = SingleLineTextBaselineWithIcon;
        } else {
            f = DoubleLineTextBaselineWithIcon;
        }
        int mo309roundToPx0680j_4 = density.mo309roundToPx0680j_4(f) + density.mo309roundToPx0680j_4(TabRowDefaults.INSTANCE.m1203getIndicatorHeightD9Ej5fM());
        int height = (placeable2.getHeight() + density.mo308roundToPxR2X_6o(IconDistanceFromBaseline)) - i3;
        int i5 = (i2 - i4) - mo309roundToPx0680j_4;
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, (i - placeable.getWidth()) / 2, i5, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, (i - placeable2.getWidth()) / 2, i5 - height, 0.0f, 4, null);
    }

    /* renamed from: TabTransition_Klgx_Pg$lambda-5, reason: not valid java name */
    private static final long m1195TabTransition_Klgx_Pg$lambda5(State<Color> state) {
        return state.getValue().m1638unboximpl();
    }
}
