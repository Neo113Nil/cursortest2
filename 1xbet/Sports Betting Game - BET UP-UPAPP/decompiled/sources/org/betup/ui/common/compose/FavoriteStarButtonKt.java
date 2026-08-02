package org.betup.ui.common.compose;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.betup.R;
import org.betup.ui.views.ComposeUtils;

/* compiled from: FavoriteStarButton.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u007f\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a\r\u0010\u001b\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u001c\u001a\r\u0010\u001d\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u001c\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020\u0016X\u008a\u0084\u0002²\u0006\n\u0010 \u001a\u00020\u0001X\u008a\u008e\u0002"}, d2 = {"FAVORITE_STATE_CHANGE_DURATION_MS", "", "FAVORITE_SQUEEZE_SCALE", "", "FAVORITE_OVERSHOOT_SCALE", "FAVORITE_CLICK_DURATION_MS", "FAVORITE_PULSE_DURATION_MS", "FavoriteStarButton", "", "isFavorite", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "iconSize", "Landroidx/compose/ui/unit/Dp;", "touchTargetSize", "selectedIcon", "unselectedIcon", "selectedTint", "Landroidx/compose/ui/graphics/Color;", "unselectedTint", "applyTint", "FavoriteStarButton-Fbr4GWI", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZFFIIJJZLandroidx/compose/runtime/Composer;III)V", "PreviewFavoriteStarButtonSelected", "(Landroidx/compose/runtime/Composer;I)V", "PreviewFavoriteStarButtonUnselected", "app_release", "tint", "pulseKey"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FavoriteStarButtonKt {
    private static final int FAVORITE_CLICK_DURATION_MS = 500;
    private static final float FAVORITE_OVERSHOOT_SCALE = 1.3f;
    private static final int FAVORITE_PULSE_DURATION_MS = 400;
    private static final float FAVORITE_SQUEEZE_SCALE = 0.8f;
    private static final int FAVORITE_STATE_CHANGE_DURATION_MS = 300;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FavoriteStarButton_Fbr4GWI$lambda$10(boolean z, Function0 function0, Modifier modifier, boolean z2, float f, float f2, int i, int i2, long j, long j2, boolean z3, int i3, int i4, int i5, Composer composer, int i6) {
        m12932FavoriteStarButtonFbr4GWI(z, function0, modifier, z2, f, f2, i, i2, j, j2, z3, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewFavoriteStarButtonSelected$lambda$13(int i, Composer composer, int i2) {
        PreviewFavoriteStarButtonSelected(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewFavoriteStarButtonUnselected$lambda$16(int i, Composer composer, int i2) {
        PreviewFavoriteStarButtonUnselected(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0396  */
    /* renamed from: FavoriteStarButton-Fbr4GWI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m12932FavoriteStarButtonFbr4GWI(final boolean z, final Function0<Unit> onClick, Modifier modifier, boolean z2, float f, float f2, int i, int i2, long j, long j2, boolean z3, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        Modifier modifier2;
        int i7;
        boolean z4;
        int i8;
        float f3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        long j3;
        long j4;
        boolean z5;
        Modifier modifier3;
        float f4;
        long j5;
        boolean z6;
        long j6;
        int i14;
        float f5;
        int i15;
        boolean z7;
        long m5204getUnspecified0d7_KjU;
        Object rememberedValue;
        Object rememberedValue2;
        Animatable animatable;
        boolean z8;
        FavoriteStarButtonKt$FavoriteStarButton$1$1 rememberedValue3;
        boolean changedInstance;
        FavoriteStarButtonKt$FavoriteStarButton$2$1 rememberedValue4;
        float f6;
        Composer composer2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        final float f7;
        Object rememberedValue5;
        final Modifier modifier4;
        final float f8;
        final boolean z9;
        final long j7;
        final boolean z10;
        final int i16;
        final int i17;
        final long j8;
        ScopeUpdateScope endRestartGroup;
        int i18;
        int i19;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-1074865680);
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i6 = (startRestartGroup.changed(z) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i20 = i5 & 4;
        if (i20 != 0) {
            i6 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            modifier2 = modifier;
            i6 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= 3072;
            } else if ((i3 & 3072) == 0) {
                z4 = z2;
                i6 |= startRestartGroup.changed(z4) ? 2048 : 1024;
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                } else if ((i3 & 24576) == 0) {
                    f3 = f;
                    i6 |= startRestartGroup.changed(f3) ? 16384 : 8192;
                    i9 = i5 & 32;
                    if (i9 == 0) {
                        i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i6 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                    }
                    i10 = i5 & 64;
                    if (i10 == 0) {
                        i6 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        i6 |= startRestartGroup.changed(i) ? 1048576 : 524288;
                    }
                    i11 = i5 & 128;
                    if (i11 == 0) {
                        i6 |= 12582912;
                    } else if ((i3 & 12582912) == 0) {
                        i6 |= startRestartGroup.changed(i2) ? 8388608 : 4194304;
                    }
                    if ((i3 & 100663296) == 0) {
                        if ((i5 & 256) == 0 && startRestartGroup.changed(j)) {
                            i19 = 67108864;
                            i6 |= i19;
                        }
                        i19 = 33554432;
                        i6 |= i19;
                    }
                    if ((i3 & 805306368) == 0) {
                        if ((i5 & 512) == 0 && startRestartGroup.changed(j2)) {
                            i18 = C.BUFFER_FLAG_LAST_SAMPLE;
                            i6 |= i18;
                        }
                        i18 = 268435456;
                        i6 |= i18;
                    }
                    i12 = i5 & 1024;
                    if (i12 == 0) {
                        i13 = i4 | 6;
                    } else if ((i4 & 6) == 0) {
                        i13 = i4 | (startRestartGroup.changed(z3) ? 4 : 2);
                    } else {
                        i13 = i4;
                    }
                    if ((i6 & 306783379) == 306783378 || (i13 & 3) != 2 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i20 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i7 != 0) {
                                z4 = true;
                            }
                            float m7774constructorimpl = i8 == 0 ? Dp.m7774constructorimpl(24) : f3;
                            float m7774constructorimpl2 = i9 == 0 ? Dp.m7774constructorimpl(48) : f2;
                            int i21 = i10 == 0 ? R.drawable.star_favorite_selected : i;
                            int i22 = i11 == 0 ? R.drawable.star_favorite_unselected : i2;
                            if ((i5 & 256) == 0) {
                                j3 = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
                                i6 &= -234881025;
                            } else {
                                j3 = j;
                            }
                            if ((i5 & 512) == 0) {
                                j4 = ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor();
                                i6 &= -1879048193;
                            } else {
                                j4 = j2;
                            }
                            if (i12 == 0) {
                                modifier3 = companion;
                                f4 = m7774constructorimpl;
                                j5 = j4;
                                z5 = true;
                            } else {
                                z5 = z3;
                                modifier3 = companion;
                                f4 = m7774constructorimpl;
                                j5 = j4;
                            }
                            z6 = z4;
                            j6 = j3;
                            i14 = i22;
                            f5 = m7774constructorimpl2;
                            i15 = i21;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i5 & 256) != 0) {
                                i6 &= -234881025;
                            }
                            if ((i5 & 512) != 0) {
                                i6 &= -1879048193;
                            }
                            i15 = i;
                            j6 = j;
                            j5 = j2;
                            z5 = z3;
                            modifier3 = modifier2;
                            z6 = z4;
                            f4 = f3;
                            f5 = f2;
                            i14 = i2;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1074865680, i6, i13, "org.betup.ui.common.compose.FavoriteStarButton (FavoriteStarButton.kt:57)");
                        }
                        if (z5) {
                            z7 = z;
                            m5204getUnspecified0d7_KjU = Color.INSTANCE.m5204getUnspecified0d7_KjU();
                        } else {
                            z7 = z;
                            m5204getUnspecified0d7_KjU = z7 ? j6 : j5;
                        }
                        final State<Color> m902animateColorAsStateeuL9pac = SingleValueAnimationKt.m902animateColorAsStateeuL9pac(m5204getUnspecified0d7_KjU, AnimationSpecKt.tween$default(300, 0, null, 6, null), "favoriteTint", null, startRestartGroup, 432, 8);
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        MutableIntState mutableIntState = (MutableIntState) rememberedValue;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        float f9 = f4;
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        animatable = (Animatable) rememberedValue2;
                        startRestartGroup.endReplaceGroup();
                        Boolean valueOf = Boolean.valueOf(z);
                        startRestartGroup.startReplaceGroup(-1633490746);
                        int i23 = i6 & 14;
                        z8 = i23 != 4;
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!z8 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new FavoriteStarButtonKt$FavoriteStarButton$1$1(z7, mutableIntState, null);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        startRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, i23);
                        Integer valueOf2 = Integer.valueOf(FavoriteStarButton_Fbr4GWI$lambda$2(mutableIntState));
                        startRestartGroup.startReplaceGroup(-1633490746);
                        changedInstance = startRestartGroup.changedInstance(animatable);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (!changedInstance || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new FavoriteStarButtonKt$FavoriteStarButton$2$1(animatable, mutableIntState, null);
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        startRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(valueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, 0);
                        final int i24 = i14;
                        final int i25 = i15;
                        f6 = f5;
                        Modifier clickAnimation = ClickAnimationModifierKt.clickAnimation(SizeKt.m1563size3ABfNKs(modifier3, f5), onClick, null, z6, null, 500, 0, 0, 0.8f, FAVORITE_OVERSHOOT_SCALE, false, false, null, startRestartGroup, (i6 & 112) | 906166272 | (i6 & 7168), 0, 3690);
                        Alignment center = Alignment.INSTANCE.getCenter();
                        composer2 = startRestartGroup;
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, clickAnimation);
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
                        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer2.startReplaceGroup(2113501818);
                        if (((Number) animatable.getValue()).floatValue() <= 0.0f) {
                            f7 = f9;
                            BoxKt.Box(BackgroundKt.m1024backgroundbw27NRU(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f7 + Dp.m7774constructorimpl(8))), Color.m5167copywmQWz5c$default(j6, ((Number) animatable.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape()), composer2, 0);
                        } else {
                            f7 = f9;
                        }
                        composer2.endReplaceGroup();
                        Boolean valueOf3 = Boolean.valueOf(z);
                        composer2.startReplaceGroup(1849434622);
                        rememberedValue5 = composer2.rememberedValue();
                        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new Function1() { // from class: org.betup.ui.common.compose.FavoriteStarButtonKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    ContentTransform FavoriteStarButton_Fbr4GWI$lambda$9$lambda$8$lambda$7;
                                    FavoriteStarButton_Fbr4GWI$lambda$9$lambda$8$lambda$7 = FavoriteStarButtonKt.FavoriteStarButton_Fbr4GWI$lambda$9$lambda$8$lambda$7((AnimatedContentTransitionScope) obj);
                                    return FavoriteStarButton_Fbr4GWI$lambda$9$lambda$8$lambda$7;
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue5);
                        }
                        composer2.endReplaceGroup();
                        AnimatedContentKt.AnimatedContent(valueOf3, null, (Function1) rememberedValue5, null, "favoriteStarIcon", null, ComposableLambdaKt.rememberComposableLambda(1826739385, true, new Function4<AnimatedContentScope, Boolean, Composer, Integer, Unit>() { // from class: org.betup.ui.common.compose.FavoriteStarButtonKt$FavoriteStarButton$3$2
                            @Override // kotlin.jvm.functions.Function4
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Boolean bool, Composer composer3, Integer num) {
                                invoke(animatedContentScope, bool.booleanValue(), composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedContentScope AnimatedContent, boolean z11, Composer composer3, int i26) {
                                long FavoriteStarButton_Fbr4GWI$lambda$0;
                                Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1826739385, i26, -1, "org.betup.ui.common.compose.FavoriteStarButton.<anonymous>.<anonymous> (FavoriteStarButton.kt:124)");
                                }
                                Painter painterResource = PainterResources_androidKt.painterResource(z11 ? i25 : i24, composer3, 0);
                                String stringResource = StringResources_androidKt.stringResource(R.string.cd_favorite, composer3, 6);
                                FavoriteStarButton_Fbr4GWI$lambda$0 = FavoriteStarButtonKt.FavoriteStarButton_Fbr4GWI$lambda$0(m902animateColorAsStateeuL9pac);
                                IconKt.m3077Iconww6aTOc(painterResource, stringResource, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, f7), FavoriteStarButton_Fbr4GWI$lambda$0, composer3, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, i23 | 1597824, 42);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        f8 = f7;
                        z9 = z6;
                        j7 = j5;
                        z10 = z5;
                        i16 = i24;
                        i17 = i25;
                        j8 = j6;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        f6 = f2;
                        i17 = i;
                        i16 = i2;
                        composer2 = startRestartGroup;
                        modifier4 = modifier2;
                        z9 = z4;
                        f8 = f3;
                        j8 = j;
                        j7 = j2;
                        z10 = z3;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        final float f10 = f6;
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.common.compose.FavoriteStarButtonKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit FavoriteStarButton_Fbr4GWI$lambda$10;
                                FavoriteStarButton_Fbr4GWI$lambda$10 = FavoriteStarButtonKt.FavoriteStarButton_Fbr4GWI$lambda$10(z, onClick, modifier4, z9, f8, f10, i17, i16, j8, j7, z10, i3, i4, i5, (Composer) obj, ((Integer) obj2).intValue());
                                return FavoriteStarButton_Fbr4GWI$lambda$10;
                            }
                        });
                        return;
                    }
                    return;
                }
                f3 = f;
                i9 = i5 & 32;
                if (i9 == 0) {
                }
                i10 = i5 & 64;
                if (i10 == 0) {
                }
                i11 = i5 & 128;
                if (i11 == 0) {
                }
                if ((i3 & 100663296) == 0) {
                }
                if ((i3 & 805306368) == 0) {
                }
                i12 = i5 & 1024;
                if (i12 == 0) {
                }
                if ((i6 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i20 == 0) {
                }
                if (i7 != 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                if ((i5 & 256) == 0) {
                }
                if ((i5 & 512) == 0) {
                }
                if (i12 == 0) {
                }
                z6 = z4;
                j6 = j3;
                i14 = i22;
                f5 = m7774constructorimpl2;
                i15 = i21;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                if (z5) {
                }
                final State<Color> m902animateColorAsStateeuL9pac2 = SingleValueAnimationKt.m902animateColorAsStateeuL9pac(m5204getUnspecified0d7_KjU, AnimationSpecKt.tween$default(300, 0, null, 6, null), "favoriteTint", null, startRestartGroup, 432, 8);
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                MutableIntState mutableIntState2 = (MutableIntState) rememberedValue;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue2 = startRestartGroup.rememberedValue();
                float f92 = f4;
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                animatable = (Animatable) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                Boolean valueOf4 = Boolean.valueOf(z);
                startRestartGroup.startReplaceGroup(-1633490746);
                int i232 = i6 & 14;
                if (i232 != 4) {
                }
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!z8) {
                }
                rememberedValue3 = new FavoriteStarButtonKt$FavoriteStarButton$1$1(z7, mutableIntState2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, i232);
                Integer valueOf22 = Integer.valueOf(FavoriteStarButton_Fbr4GWI$lambda$2(mutableIntState2));
                startRestartGroup.startReplaceGroup(-1633490746);
                changedInstance = startRestartGroup.changedInstance(animatable);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue4 = new FavoriteStarButtonKt$FavoriteStarButton$2$1(animatable, mutableIntState2, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, 0);
                final int i242 = i14;
                final int i252 = i15;
                f6 = f5;
                Modifier clickAnimation2 = ClickAnimationModifierKt.clickAnimation(SizeKt.m1563size3ABfNKs(modifier3, f5), onClick, null, z6, null, 500, 0, 0, 0.8f, FAVORITE_OVERSHOOT_SCALE, false, false, null, startRestartGroup, (i6 & 112) | 906166272 | (i6 & 7168), 0, 3690);
                Alignment center2 = Alignment.INSTANCE.getCenter();
                composer2 = startRestartGroup;
                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, clickAnimation2);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(composer2);
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                composer2.startReplaceGroup(2113501818);
                if (((Number) animatable.getValue()).floatValue() <= 0.0f) {
                }
                composer2.endReplaceGroup();
                Boolean valueOf32 = Boolean.valueOf(z);
                composer2.startReplaceGroup(1849434622);
                rememberedValue5 = composer2.rememberedValue();
                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                }
                composer2.endReplaceGroup();
                AnimatedContentKt.AnimatedContent(valueOf32, null, (Function1) rememberedValue5, null, "favoriteStarIcon", null, ComposableLambdaKt.rememberComposableLambda(1826739385, true, new Function4<AnimatedContentScope, Boolean, Composer, Integer, Unit>() { // from class: org.betup.ui.common.compose.FavoriteStarButtonKt$FavoriteStarButton$3$2
                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Boolean bool, Composer composer3, Integer num) {
                        invoke(animatedContentScope, bool.booleanValue(), composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedContentScope AnimatedContent, boolean z11, Composer composer3, int i26) {
                        long FavoriteStarButton_Fbr4GWI$lambda$0;
                        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1826739385, i26, -1, "org.betup.ui.common.compose.FavoriteStarButton.<anonymous>.<anonymous> (FavoriteStarButton.kt:124)");
                        }
                        Painter painterResource = PainterResources_androidKt.painterResource(z11 ? i252 : i242, composer3, 0);
                        String stringResource = StringResources_androidKt.stringResource(R.string.cd_favorite, composer3, 6);
                        FavoriteStarButton_Fbr4GWI$lambda$0 = FavoriteStarButtonKt.FavoriteStarButton_Fbr4GWI$lambda$0(m902animateColorAsStateeuL9pac2);
                        IconKt.m3077Iconww6aTOc(painterResource, stringResource, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, f7), FavoriteStarButton_Fbr4GWI$lambda$0, composer3, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), composer2, i232 | 1597824, 42);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                f8 = f7;
                z9 = z6;
                j7 = j5;
                z10 = z5;
                i16 = i242;
                i17 = i252;
                j8 = j6;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z4 = z2;
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            f3 = f;
            i9 = i5 & 32;
            if (i9 == 0) {
            }
            i10 = i5 & 64;
            if (i10 == 0) {
            }
            i11 = i5 & 128;
            if (i11 == 0) {
            }
            if ((i3 & 100663296) == 0) {
            }
            if ((i3 & 805306368) == 0) {
            }
            i12 = i5 & 1024;
            if (i12 == 0) {
            }
            if ((i6 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i20 == 0) {
            }
            if (i7 != 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if ((i5 & 256) == 0) {
            }
            if ((i5 & 512) == 0) {
            }
            if (i12 == 0) {
            }
            z6 = z4;
            j6 = j3;
            i14 = i22;
            f5 = m7774constructorimpl2;
            i15 = i21;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            if (z5) {
            }
            final State<Color> m902animateColorAsStateeuL9pac22 = SingleValueAnimationKt.m902animateColorAsStateeuL9pac(m5204getUnspecified0d7_KjU, AnimationSpecKt.tween$default(300, 0, null, 6, null), "favoriteTint", null, startRestartGroup, 432, 8);
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            MutableIntState mutableIntState22 = (MutableIntState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue2 = startRestartGroup.rememberedValue();
            float f922 = f4;
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            animatable = (Animatable) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            Boolean valueOf42 = Boolean.valueOf(z);
            startRestartGroup.startReplaceGroup(-1633490746);
            int i2322 = i6 & 14;
            if (i2322 != 4) {
            }
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!z8) {
            }
            rememberedValue3 = new FavoriteStarButtonKt$FavoriteStarButton$1$1(z7, mutableIntState22, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf42, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, i2322);
            Integer valueOf222 = Integer.valueOf(FavoriteStarButton_Fbr4GWI$lambda$2(mutableIntState22));
            startRestartGroup.startReplaceGroup(-1633490746);
            changedInstance = startRestartGroup.changedInstance(animatable);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue4 = new FavoriteStarButtonKt$FavoriteStarButton$2$1(animatable, mutableIntState22, null);
            startRestartGroup.updateRememberedValue(rememberedValue4);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, 0);
            final int i2422 = i14;
            final int i2522 = i15;
            f6 = f5;
            Modifier clickAnimation22 = ClickAnimationModifierKt.clickAnimation(SizeKt.m1563size3ABfNKs(modifier3, f5), onClick, null, z6, null, 500, 0, 0, 0.8f, FAVORITE_OVERSHOOT_SCALE, false, false, null, startRestartGroup, (i6 & 112) | 906166272 | (i6 & 7168), 0, 3690);
            Alignment center22 = Alignment.INSTANCE.getCenter();
            composer2 = startRestartGroup;
            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(center22, false);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(composer2, clickAnimation22);
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
            }
            composer2.startReusableNode();
            if (!composer2.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(composer2);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
            composer2.startReplaceGroup(2113501818);
            if (((Number) animatable.getValue()).floatValue() <= 0.0f) {
            }
            composer2.endReplaceGroup();
            Boolean valueOf322 = Boolean.valueOf(z);
            composer2.startReplaceGroup(1849434622);
            rememberedValue5 = composer2.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            }
            composer2.endReplaceGroup();
            AnimatedContentKt.AnimatedContent(valueOf322, null, (Function1) rememberedValue5, null, "favoriteStarIcon", null, ComposableLambdaKt.rememberComposableLambda(1826739385, true, new Function4<AnimatedContentScope, Boolean, Composer, Integer, Unit>() { // from class: org.betup.ui.common.compose.FavoriteStarButtonKt$FavoriteStarButton$3$2
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Boolean bool, Composer composer3, Integer num) {
                    invoke(animatedContentScope, bool.booleanValue(), composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedContentScope AnimatedContent, boolean z11, Composer composer3, int i26) {
                    long FavoriteStarButton_Fbr4GWI$lambda$0;
                    Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1826739385, i26, -1, "org.betup.ui.common.compose.FavoriteStarButton.<anonymous>.<anonymous> (FavoriteStarButton.kt:124)");
                    }
                    Painter painterResource = PainterResources_androidKt.painterResource(z11 ? i2522 : i2422, composer3, 0);
                    String stringResource = StringResources_androidKt.stringResource(R.string.cd_favorite, composer3, 6);
                    FavoriteStarButton_Fbr4GWI$lambda$0 = FavoriteStarButtonKt.FavoriteStarButton_Fbr4GWI$lambda$0(m902animateColorAsStateeuL9pac22);
                    IconKt.m3077Iconww6aTOc(painterResource, stringResource, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, f7), FavoriteStarButton_Fbr4GWI$lambda$0, composer3, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), composer2, i2322 | 1597824, 42);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
            f8 = f7;
            z9 = z6;
            j7 = j5;
            z10 = z5;
            i16 = i2422;
            i17 = i2522;
            j8 = j6;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        z4 = z2;
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        f3 = f;
        i9 = i5 & 32;
        if (i9 == 0) {
        }
        i10 = i5 & 64;
        if (i10 == 0) {
        }
        i11 = i5 & 128;
        if (i11 == 0) {
        }
        if ((i3 & 100663296) == 0) {
        }
        if ((i3 & 805306368) == 0) {
        }
        i12 = i5 & 1024;
        if (i12 == 0) {
        }
        if ((i6 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i20 == 0) {
        }
        if (i7 != 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if ((i5 & 256) == 0) {
        }
        if ((i5 & 512) == 0) {
        }
        if (i12 == 0) {
        }
        z6 = z4;
        j6 = j3;
        i14 = i22;
        f5 = m7774constructorimpl2;
        i15 = i21;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        if (z5) {
        }
        final State<Color> m902animateColorAsStateeuL9pac222 = SingleValueAnimationKt.m902animateColorAsStateeuL9pac(m5204getUnspecified0d7_KjU, AnimationSpecKt.tween$default(300, 0, null, 6, null), "favoriteTint", null, startRestartGroup, 432, 8);
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        MutableIntState mutableIntState222 = (MutableIntState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue2 = startRestartGroup.rememberedValue();
        float f9222 = f4;
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        animatable = (Animatable) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        Boolean valueOf422 = Boolean.valueOf(z);
        startRestartGroup.startReplaceGroup(-1633490746);
        int i23222 = i6 & 14;
        if (i23222 != 4) {
        }
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!z8) {
        }
        rememberedValue3 = new FavoriteStarButtonKt$FavoriteStarButton$1$1(z7, mutableIntState222, null);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf422, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, i23222);
        Integer valueOf2222 = Integer.valueOf(FavoriteStarButton_Fbr4GWI$lambda$2(mutableIntState222));
        startRestartGroup.startReplaceGroup(-1633490746);
        changedInstance = startRestartGroup.changedInstance(animatable);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue4 = new FavoriteStarButtonKt$FavoriteStarButton$2$1(animatable, mutableIntState222, null);
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf2222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, 0);
        final int i24222 = i14;
        final int i25222 = i15;
        f6 = f5;
        Modifier clickAnimation222 = ClickAnimationModifierKt.clickAnimation(SizeKt.m1563size3ABfNKs(modifier3, f5), onClick, null, z6, null, 500, 0, 0, 0.8f, FAVORITE_OVERSHOOT_SCALE, false, false, null, startRestartGroup, (i6 & 112) | 906166272 | (i6 & 7168), 0, 3690);
        Alignment center222 = Alignment.INSTANCE.getCenter();
        composer2 = startRestartGroup;
        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(center222, false);
        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap222 = composer2.getCurrentCompositionLocalMap();
        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(composer2, clickAnimation222);
        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (!composer2.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(composer2);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
        composer2.startReplaceGroup(2113501818);
        if (((Number) animatable.getValue()).floatValue() <= 0.0f) {
        }
        composer2.endReplaceGroup();
        Boolean valueOf3222 = Boolean.valueOf(z);
        composer2.startReplaceGroup(1849434622);
        rememberedValue5 = composer2.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
        }
        composer2.endReplaceGroup();
        AnimatedContentKt.AnimatedContent(valueOf3222, null, (Function1) rememberedValue5, null, "favoriteStarIcon", null, ComposableLambdaKt.rememberComposableLambda(1826739385, true, new Function4<AnimatedContentScope, Boolean, Composer, Integer, Unit>() { // from class: org.betup.ui.common.compose.FavoriteStarButtonKt$FavoriteStarButton$3$2
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Boolean bool, Composer composer3, Integer num) {
                invoke(animatedContentScope, bool.booleanValue(), composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedContentScope AnimatedContent, boolean z11, Composer composer3, int i26) {
                long FavoriteStarButton_Fbr4GWI$lambda$0;
                Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1826739385, i26, -1, "org.betup.ui.common.compose.FavoriteStarButton.<anonymous>.<anonymous> (FavoriteStarButton.kt:124)");
                }
                Painter painterResource = PainterResources_androidKt.painterResource(z11 ? i25222 : i24222, composer3, 0);
                String stringResource = StringResources_androidKt.stringResource(R.string.cd_favorite, composer3, 6);
                FavoriteStarButton_Fbr4GWI$lambda$0 = FavoriteStarButtonKt.FavoriteStarButton_Fbr4GWI$lambda$0(m902animateColorAsStateeuL9pac222);
                IconKt.m3077Iconww6aTOc(painterResource, stringResource, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, f7), FavoriteStarButton_Fbr4GWI$lambda$0, composer3, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer2, 54), composer2, i23222 | 1597824, 42);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier3;
        f8 = f7;
        z9 = z6;
        j7 = j5;
        z10 = z5;
        i16 = i24222;
        i17 = i25222;
        j8 = j6;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int FavoriteStarButton_Fbr4GWI$lambda$2(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform FavoriteStarButton_Fbr4GWI$lambda$9$lambda$8$lambda$7(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.m865scaleInL8ZKhE$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.8f, 0L, 4, null).plus(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null)), EnterExitTransitionKt.m867scaleOutL8ZKhE$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.8f, 0L, 4, null).plus(EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null)));
    }

    private static final void PreviewFavoriteStarButtonSelected(Composer composer, final int i) {
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1336123022);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1336123022, i, -1, "org.betup.ui.common.compose.PreviewFavoriteStarButtonSelected (FavoriteStarButton.kt:138)");
            }
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.common.compose.FavoriteStarButtonKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            m12932FavoriteStarButtonFbr4GWI(true, function0, null, false, 0.0f, 0.0f, 0, 0, 0L, 0L, false, startRestartGroup, 54, 0, 2044);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.common.compose.FavoriteStarButtonKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewFavoriteStarButtonSelected$lambda$13;
                    PreviewFavoriteStarButtonSelected$lambda$13 = FavoriteStarButtonKt.PreviewFavoriteStarButtonSelected$lambda$13(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewFavoriteStarButtonSelected$lambda$13;
                }
            });
        }
    }

    private static final void PreviewFavoriteStarButtonUnselected(Composer composer, final int i) {
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(693861013);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(693861013, i, -1, "org.betup.ui.common.compose.PreviewFavoriteStarButtonUnselected (FavoriteStarButton.kt:147)");
            }
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.common.compose.FavoriteStarButtonKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            m12932FavoriteStarButtonFbr4GWI(false, function0, null, false, 0.0f, 0.0f, 0, 0, 0L, 0L, false, startRestartGroup, 54, 0, 2044);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.common.compose.FavoriteStarButtonKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewFavoriteStarButtonUnselected$lambda$16;
                    PreviewFavoriteStarButtonUnselected$lambda$16 = FavoriteStarButtonKt.PreviewFavoriteStarButtonUnselected$lambda$16(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewFavoriteStarButtonUnselected$lambda$16;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long FavoriteStarButton_Fbr4GWI$lambda$0(State<Color> state) {
        return state.getValue().m5178unboximpl();
    }
}
