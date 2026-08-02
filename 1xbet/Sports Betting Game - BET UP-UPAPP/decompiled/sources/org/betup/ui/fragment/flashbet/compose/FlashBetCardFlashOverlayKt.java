package org.betup.ui.fragment.flashbet.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import coil3.compose.SingletonAsyncImageKt;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.sentry.protocol.SentryStackFrame;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.betup.R;
import org.betup.ui.fragment.flashbet.FlashBetEventFormattingKt;
import org.betup.ui.fragment.flashbet.FlashBetEventKind;
import org.betup.ui.views.ComposeUtils;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: FlashBetCardFlashOverlay.kt */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0007\u001a\f\u0010\b\u001a\u0004\u0018\u00010\u0005*\u00020\u0007\u001a\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n\u001a\u0016\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n\u001a!\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001a)\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001aE\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00172\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0003¢\u0006\u0004\b#\u0010$\u001a\u0015\u0010%\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010&\u001a\u0015\u0010'\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010(\u001a!\u0010)\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0013\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000*\n\u0010\u0002\"\u00020\u00032\u00020\u0003*\n\u0010\u0004\"\u00020\u00052\u00020\u0005¨\u0006*"}, d2 = {"FLASH_BET_CARD_FLASH_DURATION_MS", "", "FlashBetCardFlash", "Lorg/betup/ui/fragment/flashbet/compose/FlashBetEventFlash;", "FlashBetCardFlashKind", "Lorg/betup/ui/fragment/flashbet/compose/FlashBetEventFlashKind;", "toEventFlashKind", "Lorg/betup/ui/fragment/flashbet/FlashBetEventKind;", "toCardFlashKind", "parseCardFlashLabel", "", "description", "parseEventFlashLabel", "kind", "FlashBetEventFlashOverlay", "", "flash", "modifier", "Landroidx/compose/ui/Modifier;", "(Lorg/betup/ui/fragment/flashbet/compose/FlashBetEventFlash;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "EventFlashTeamLogo", "logoUrl", "glowColor", "Landroidx/compose/ui/graphics/Color;", "sizeDp", "", "EventFlashTeamLogo-3IgeMak", "(Ljava/lang/String;JILandroidx/compose/runtime/Composer;II)V", "EventFlashBadge", "brush", "Landroidx/compose/ui/graphics/Brush;", SentryStackFrame.JsonKeys.SYMBOL, "symbolColor", "symbolFontSize", "Landroidx/compose/ui/unit/TextUnit;", "EventFlashBadge-Wt1r0hQ", "(Landroidx/compose/ui/graphics/Brush;Ljava/lang/String;JJIJLandroidx/compose/runtime/Composer;II)V", "eventFlashAccentColor", "(Lorg/betup/ui/fragment/flashbet/compose/FlashBetEventFlashKind;)J", "eventFlashTitle", "(Lorg/betup/ui/fragment/flashbet/compose/FlashBetEventFlashKind;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "FlashBetCardFlashOverlay", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashBetCardFlashOverlayKt {
    public static final long FLASH_BET_CARD_FLASH_DURATION_MS = 2200;

    /* compiled from: FlashBetCardFlashOverlay.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[FlashBetEventKind.values().length];
            try {
                iArr[FlashBetEventKind.GOAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlashBetEventKind.YELLOW_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FlashBetEventKind.RED_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FlashBetEventKind.SUBSTITUTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FlashBetEventKind.CORNER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FlashBetEventKind.PENALTY_MISSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FlashBetEventKind.HALF_TIME.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FlashBetEventFlashKind.values().length];
            try {
                iArr2[FlashBetEventFlashKind.YELLOW_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[FlashBetEventFlashKind.RED_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[FlashBetEventFlashKind.GOAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[FlashBetEventFlashKind.CORNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[FlashBetEventFlashKind.SUBSTITUTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[FlashBetEventFlashKind.PENALTY_MISSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[FlashBetEventFlashKind.HALF_TIME.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventFlashBadge_Wt1r0hQ$lambda$23(Brush brush, String str, long j, long j2, int i, long j3, int i2, int i3, Composer composer, int i4) {
        m13689EventFlashBadgeWt1r0hQ(brush, str, j, j2, i, j3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventFlashTeamLogo_3IgeMak$lambda$21(String str, long j, int i, int i2, int i3, Composer composer, int i4) {
        m13690EventFlashTeamLogo3IgeMak(str, j, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetCardFlashOverlay$lambda$24(FlashBetEventFlash flashBetEventFlash, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FlashBetCardFlashOverlay(flashBetEventFlash, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetEventFlashOverlay$lambda$19(FlashBetEventFlash flashBetEventFlash, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FlashBetEventFlashOverlay(flashBetEventFlash, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetEventFlashOverlay$lambda$5(FlashBetEventFlash flashBetEventFlash, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FlashBetEventFlashOverlay(flashBetEventFlash, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final FlashBetEventFlashKind toEventFlashKind(FlashBetEventKind flashBetEventKind) {
        Intrinsics.checkNotNullParameter(flashBetEventKind, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[flashBetEventKind.ordinal()]) {
            case 1:
                return FlashBetEventFlashKind.GOAL;
            case 2:
                return FlashBetEventFlashKind.YELLOW_CARD;
            case 3:
                return FlashBetEventFlashKind.RED_CARD;
            case 4:
                return FlashBetEventFlashKind.SUBSTITUTION;
            case 5:
                return FlashBetEventFlashKind.CORNER;
            case 6:
                return FlashBetEventFlashKind.PENALTY_MISSED;
            case 7:
                return FlashBetEventFlashKind.HALF_TIME;
            default:
                return null;
        }
    }

    public static final FlashBetEventFlashKind toCardFlashKind(FlashBetEventKind flashBetEventKind) {
        Intrinsics.checkNotNullParameter(flashBetEventKind, "<this>");
        FlashBetEventFlashKind eventFlashKind = toEventFlashKind(flashBetEventKind);
        if (eventFlashKind == null) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$1[eventFlashKind.ordinal()];
        if (i != 1 && i != 2) {
            eventFlashKind = null;
        }
        return eventFlashKind;
    }

    public static final String parseCardFlashLabel(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        String obj = StringsKt.trim((CharSequence) description).toString();
        String obj2 = StringsKt.trim((CharSequence) new Regex("(?i)red\\s*card").replace(new Regex("(?i)yellow\\s*card").replace(new Regex("(?i)\\s*~\\s*\\d*(st|nd|rd|th)?\\s*red\\s*card\\s*~").replace(new Regex("(?i)\\s*~\\s*\\d*(st|nd|rd|th)?\\s*yellow\\s*card\\s*~").replace(new Regex("(?i)^(yellow|red)\\s*[·\\-–]\\s*").replace(obj, ""), ""), ""), ""), "")).toString();
        if (!StringsKt.isBlank(obj2)) {
            obj = obj2;
        }
        return obj;
    }

    public static final String parseEventFlashLabel(FlashBetEventFlashKind kind, String description) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(description, "description");
        String obj = StringsKt.trim((CharSequence) description).toString();
        switch (WhenMappings.$EnumSwitchMapping$1[kind.ordinal()]) {
            case 1:
            case 2:
                return parseCardFlashLabel(obj);
            case 3:
                return FlashBetEventFormattingKt.parseGoalDescriptionLabel(obj);
            case 4:
                String obj2 = StringsKt.trim((CharSequence) new Regex("(?i)\\bcorner(\\s*kick)?\\b").replace(new Regex("(?i)^(corner|colț|ecke)\\s*[·\\-–]\\s*").replace(obj, ""), "")).toString();
                if (!StringsKt.isBlank(obj2)) {
                    obj = obj2;
                }
                return obj;
            case 5:
                String obj3 = StringsKt.trim((CharSequence) new Regex("(?i)substitution").replace(new Regex("(?i)^(sub|substitution|înlocuire|wechsel)\\s*[·\\-–⇄]\\s*").replace(obj, ""), "")).toString();
                if (!StringsKt.isBlank(obj3)) {
                    obj = obj3;
                }
                return obj;
            case 6:
                String obj4 = StringsKt.trim((CharSequence) new Regex("(?i)(penalty\\s*missed|missed\\s*penalty)").replace(new Regex("(?i)^(penalty\\s*missed|missed\\s*penalty|penalty\\s*ratat)\\s*[·\\-–]\\s*").replace(obj, ""), "")).toString();
                if (!StringsKt.isBlank(obj4)) {
                    obj = obj4;
                }
                return obj;
            case 7:
                return "";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0858  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x08e6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x09b2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FlashBetEventFlashOverlay(final FlashBetEventFlash flashBetEventFlash, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        float f;
        boolean z;
        Modifier modifier3;
        int i4;
        Composer composer2;
        Brush m5119linearGradientmHitzGk$default;
        Composer composer3;
        String str;
        int i5;
        Composer composer4;
        String str2;
        Composer startRestartGroup = composer.startRestartGroup(-1170601187);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(flashBetEventFlash) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i3 & 19) == 18 || !startRestartGroup.getSkipping()) {
                final Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1170601187, i3, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetEventFlashOverlay (FlashBetCardFlashOverlay.kt:132)");
                }
                if (flashBetEventFlash != null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetCardFlashOverlayKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit FlashBetEventFlashOverlay$lambda$5;
                                FlashBetEventFlashOverlay$lambda$5 = FlashBetCardFlashOverlayKt.FlashBetEventFlashOverlay$lambda$5(FlashBetEventFlash.this, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return FlashBetEventFlashOverlay$lambda$5;
                            }
                        });
                        return;
                    }
                    return;
                }
                int key = flashBetEventFlash.getKey();
                startRestartGroup.startReplaceGroup(5004770);
                boolean changed = startRestartGroup.changed(key);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                Animatable animatable = (Animatable) rememberedValue;
                startRestartGroup.endReplaceGroup();
                int key2 = flashBetEventFlash.getKey();
                startRestartGroup.startReplaceGroup(5004770);
                boolean changed2 = startRestartGroup.changed(key2);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = AnimatableKt.Animatable$default(0.55f, 0.0f, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final Animatable animatable2 = (Animatable) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                int key3 = flashBetEventFlash.getKey();
                startRestartGroup.startReplaceGroup(5004770);
                boolean changed3 = startRestartGroup.changed(key3);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                Animatable animatable3 = (Animatable) rememberedValue3;
                startRestartGroup.endReplaceGroup();
                int key4 = flashBetEventFlash.getKey();
                startRestartGroup.startReplaceGroup(5004770);
                boolean changed4 = startRestartGroup.changed(key4);
                Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changed4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                final Animatable animatable4 = (Animatable) rememberedValue4;
                startRestartGroup.endReplaceGroup();
                boolean z2 = flashBetEventFlash.getKind() == FlashBetEventFlashKind.GOAL || flashBetEventFlash.getKind() == FlashBetEventFlashKind.RED_CARD || flashBetEventFlash.getKind() == FlashBetEventFlashKind.PENALTY_MISSED;
                Integer valueOf = Integer.valueOf(flashBetEventFlash.getKey());
                startRestartGroup.startReplaceGroup(-1224400529);
                boolean changedInstance = startRestartGroup.changedInstance(animatable) | startRestartGroup.changedInstance(animatable2) | startRestartGroup.changedInstance(animatable3) | startRestartGroup.changedInstance(animatable4) | startRestartGroup.changed(z2);
                FlashBetCardFlashOverlayKt$FlashBetEventFlashOverlay$2$1 rememberedValue5 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new FlashBetCardFlashOverlayKt$FlashBetEventFlashOverlay$2$1(animatable, animatable2, animatable3, animatable4, z2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, startRestartGroup, 0);
                final float floatValue = (1.0f - ((Number) animatable.getValue()).floatValue()) * 88.0f;
                final float floatValue2 = (1.0f - ((Number) animatable.getValue()).floatValue()) * 16.0f;
                float coerceIn = RangesKt.coerceIn(((Number) animatable.getValue()).floatValue(), 0.0f, 1.0f);
                FontFamily sfProFontFamily = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
                final boolean z3 = flashBetEventFlash.getKind() == FlashBetEventFlashKind.YELLOW_CARD || flashBetEventFlash.getKind() == FlashBetEventFlashKind.RED_CARD;
                boolean z4 = flashBetEventFlash.getKind() == FlashBetEventFlashKind.RED_CARD || flashBetEventFlash.getKind() == FlashBetEventFlashKind.PENALTY_MISSED;
                long eventFlashAccentColor = eventFlashAccentColor(flashBetEventFlash.getKind());
                switch (WhenMappings.$EnumSwitchMapping$1[flashBetEventFlash.getKind().ordinal()]) {
                    case 1:
                        f = 0.56f;
                        break;
                    case 2:
                        f = 0.64f;
                        break;
                    case 3:
                        f = 0.62f;
                        break;
                    case 4:
                        f = 0.5f;
                        break;
                    case 5:
                        f = 0.52f;
                        break;
                    case 6:
                        f = 0.58f;
                        break;
                    case 7:
                        f = 0.54f;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                float f2 = f * coerceIn;
                float floatValue3 = ((Number) animatable3.getValue()).floatValue() * coerceIn;
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                startRestartGroup.startReplaceGroup(5004770);
                boolean changedInstance2 = startRestartGroup.changedInstance(animatable4);
                Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new Function1() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetCardFlashOverlayKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit FlashBetEventFlashOverlay$lambda$12$lambda$11;
                            FlashBetEventFlashOverlay$lambda$12$lambda$11 = FlashBetCardFlashOverlayKt.FlashBetEventFlashOverlay$lambda$12$lambda$11(Animatable.this, (GraphicsLayerScope) obj);
                            return FlashBetEventFlashOverlay$lambda$12$lambda$11;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                startRestartGroup.endReplaceGroup();
                Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(fillMaxSize$default, (Function1) rememberedValue6);
                Integer valueOf2 = Integer.valueOf(flashBetEventFlash.getKey());
                startRestartGroup.startReplaceGroup(1849434622);
                FlashBetCardFlashOverlayKt$FlashBetEventFlashOverlay$4$1 rememberedValue7 = startRestartGroup.rememberedValue();
                if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new PointerInputEventHandler() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetCardFlashOverlayKt$FlashBetEventFlashOverlay$4$1

                        /* compiled from: FlashBetCardFlashOverlay.kt */
                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                        @DebugMetadata(c = "org.betup.ui.fragment.flashbet.compose.FlashBetCardFlashOverlayKt$FlashBetEventFlashOverlay$4$1$1", f = "FlashBetCardFlashOverlay.kt", i = {}, l = {207}, m = "invokeSuspend", n = {}, s = {})
                        /* renamed from: org.betup.ui.fragment.flashbet.compose.FlashBetCardFlashOverlayKt$FlashBetEventFlashOverlay$4$1$1, reason: invalid class name */
                        static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                            private /* synthetic */ Object L$0;
                            int label;

                            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                                anonymousClass1.L$0 = obj;
                                return anonymousClass1;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                                return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    this.label = 1;
                                    if (AwaitPointerEventScope.awaitPointerEvent$default((AwaitPointerEventScope) this.L$0, null, this, 1, null) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                            Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new AnonymousClass1(null), continuation);
                            return awaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : Unit.INSTANCE;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                startRestartGroup.endReplaceGroup();
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(graphicsLayer, valueOf2, (PointerInputEventHandler) rememberedValue7);
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, pointerInput);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                Modifier modifier5 = modifier4;
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
                BoxKt.Box(BackgroundKt.m1025backgroundbw27NRU$default(AlphaKt.alpha(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), f2), Color.INSTANCE.m5194getBlack0d7_KjU(), null, 2, null), startRestartGroup, 0);
                BoxKt.Box(BackgroundKt.background$default(AlphaKt.alpha(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), floatValue3), Brush.Companion.m5121radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(Color.m5167copywmQWz5c$default(eventFlashAccentColor, 0.72f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.m5167copywmQWz5c$default(eventFlashAccentColor, 0.28f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.INSTANCE.m5203getTransparent0d7_KjU())}), 0L, 520.0f, 0, 10, (Object) null), null, 0.0f, 6, null), startRestartGroup, 0);
                Modifier alpha = AlphaKt.alpha(PaddingKt.m1517paddingVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(28), Dp.m7774constructorimpl(36)), coerceIn);
                startRestartGroup.startReplaceGroup(-1224400529);
                boolean changed5 = startRestartGroup.changed(floatValue) | startRestartGroup.changed(z3) | startRestartGroup.changed(floatValue2) | startRestartGroup.changedInstance(animatable2);
                Object rememberedValue8 = startRestartGroup.rememberedValue();
                if (changed5 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = new Function1() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetCardFlashOverlayKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit FlashBetEventFlashOverlay$lambda$18$lambda$15$lambda$14;
                            FlashBetEventFlashOverlay$lambda$18$lambda$15$lambda$14 = FlashBetCardFlashOverlayKt.FlashBetEventFlashOverlay$lambda$18$lambda$15$lambda$14(floatValue, z3, floatValue2, animatable2, (GraphicsLayerScope) obj);
                            return FlashBetEventFlashOverlay$lambda$18$lambda$15$lambda$14;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                }
                startRestartGroup.endReplaceGroup();
                Modifier graphicsLayer2 = GraphicsLayerModifierKt.graphicsLayer(alpha, (Function1) rememberedValue8);
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, graphicsLayer2);
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
                switch (WhenMappings.$EnumSwitchMapping$1[flashBetEventFlash.getKind().ordinal()]) {
                    case 1:
                    case 2:
                        z = z3;
                        modifier3 = modifier5;
                        i4 = 0;
                        composer2 = startRestartGroup;
                        composer2.startReplaceGroup(-1789321190);
                        if (flashBetEventFlash.getKind() == FlashBetEventFlashKind.RED_CARD) {
                            m5119linearGradientmHitzGk$default = Brush.Companion.m5119linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(ComposeUtils.AppColorPalette.Red.INSTANCE.getColor()), Color.m5158boximpl(Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), 0.82f, 0.0f, 0.0f, 0.0f, 14, null))}), 0L, 0L, 0, 14, (Object) null);
                        } else {
                            m5119linearGradientmHitzGk$default = Brush.Companion.m5119linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(ColorKt.Color(4294953984L)), Color.m5158boximpl(ColorKt.Color(4294944768L))}), 0L, 0L, 0, 14, (Object) null);
                        }
                        Brush brush = m5119linearGradientmHitzGk$default;
                        float f3 = 3;
                        BoxKt.Box(BackgroundKt.background$default(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(ShadowKt.m4803shadows4CzXII$default(Modifier.INSTANCE, Dp.m7774constructorimpl(z4 ? 32 : 24), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f3)), false, Color.m5167copywmQWz5c$default(eventFlashAccentColor, 0.65f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), 4, null), Dp.m7774constructorimpl(z4 ? 76 : 72)), Dp.m7774constructorimpl(z4 ? 104 : 98)), brush, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f3)), 0.0f, 4, null), composer2, 0);
                        composer2.endReplaceGroup();
                        Unit unit = Unit.INSTANCE;
                        String eventFlashTitle = eventFlashTitle(flashBetEventFlash.getKind(), composer2, i4);
                        composer2.startReplaceGroup(-1720122594);
                        str = eventFlashTitle;
                        if (StringsKt.isBlank(str)) {
                            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(12)), composer2, 6);
                            String upperCase = eventFlashTitle.toUpperCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                            i5 = 12;
                            str2 = "toUpperCase(...)";
                            composer4 = composer2;
                            TextKt.m2642Text4IGK_g(upperCase, (Modifier) null, Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), 0.92f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), sfProFontFamily, TextUnitKt.getSp(1.6d), (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), TextUnitKt.getSp(15), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 12782592, 6, 129298);
                        } else {
                            i5 = 12;
                            composer4 = composer2;
                            str2 = "toUpperCase(...)";
                        }
                        composer4.endReplaceGroup();
                        composer4.startReplaceGroup(-1720104457);
                        if (!StringsKt.isBlank(flashBetEventFlash.getLabel())) {
                            Modifier.Companion companion = Modifier.INSTANCE;
                            if (!StringsKt.isBlank(str)) {
                                i5 = 5;
                            }
                            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(companion, Dp.m7774constructorimpl(i5)), composer4, i4);
                            String label = flashBetEventFlash.getLabel();
                            if (z) {
                                label = label.toUpperCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(label, str2);
                            }
                            TextKt.m2642Text4IGK_g(label, AlphaKt.alpha(SizeKt.m1570widthInVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(280), 1, null), 0.96f), ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), z ? TextUnitKt.getSp(14) : TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getBold(), sfProFontFamily, TextUnitKt.getSp(z ? 1.2d : 0.4d), (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), TextUnitKt.getSp(z ? 19 : 20), TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 196656, 3120, 119056);
                        }
                        composer4.endReplaceGroup();
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
                        modifier2 = modifier3;
                        break;
                    case 3:
                        z = z3;
                        modifier3 = modifier5;
                        i4 = 0;
                        startRestartGroup.startReplaceGroup(-1787911930);
                        String teamLogoUrl = flashBetEventFlash.getTeamLogoUrl();
                        String str3 = (teamLogoUrl == null || StringsKt.isBlank(teamLogoUrl)) ? null : teamLogoUrl;
                        if (str3 != null) {
                            startRestartGroup.startReplaceGroup(-1787816512);
                            m13690EventFlashTeamLogo3IgeMak(str3, eventFlashAccentColor, 0, startRestartGroup, 0, 4);
                            startRestartGroup.endReplaceGroup();
                            composer3 = startRestartGroup;
                        } else {
                            startRestartGroup.startReplaceGroup(-1787603046);
                            composer3 = startRestartGroup;
                            m13689EventFlashBadgeWt1r0hQ(Brush.Companion.m5119linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(ComposeUtils.AppColorPalette.Green.INSTANCE.getColor()), Color.m5158boximpl(Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Green.INSTANCE.getColor(), 0.78f, 0.0f, 0.0f, 0.0f, 14, null))}), 0L, 0L, 0, 14, (Object) null), "⚽", ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(30), 96, eventFlashAccentColor, startRestartGroup, 27696, 0);
                            composer3.endReplaceGroup();
                        }
                        composer3.endReplaceGroup();
                        Unit unit2 = Unit.INSTANCE;
                        composer2 = composer3;
                        String eventFlashTitle2 = eventFlashTitle(flashBetEventFlash.getKind(), composer2, i4);
                        composer2.startReplaceGroup(-1720122594);
                        str = eventFlashTitle2;
                        if (StringsKt.isBlank(str)) {
                        }
                        composer4.endReplaceGroup();
                        composer4.startReplaceGroup(-1720104457);
                        if (!StringsKt.isBlank(flashBetEventFlash.getLabel())) {
                        }
                        composer4.endReplaceGroup();
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
                        }
                        modifier2 = modifier3;
                        break;
                    case 4:
                        z = z3;
                        composer3 = startRestartGroup;
                        modifier3 = modifier5;
                        i4 = 0;
                        startRestartGroup.startReplaceGroup(-1786832448);
                        m13689EventFlashBadgeWt1r0hQ(Brush.Companion.m5119linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), 0.95f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), 0.88f, 0.0f, 0.0f, 0.0f, 14, null))}), 0L, 0L, 0, 14, (Object) null), "⛳", ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(26), 0, eventFlashAccentColor, startRestartGroup, 3120, 16);
                        composer3.endReplaceGroup();
                        Unit unit3 = Unit.INSTANCE;
                        composer2 = composer3;
                        String eventFlashTitle22 = eventFlashTitle(flashBetEventFlash.getKind(), composer2, i4);
                        composer2.startReplaceGroup(-1720122594);
                        str = eventFlashTitle22;
                        if (StringsKt.isBlank(str)) {
                        }
                        composer4.endReplaceGroup();
                        composer4.startReplaceGroup(-1720104457);
                        if (!StringsKt.isBlank(flashBetEventFlash.getLabel())) {
                        }
                        composer4.endReplaceGroup();
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
                        }
                        modifier2 = modifier3;
                        break;
                    case 5:
                        z = z3;
                        composer3 = startRestartGroup;
                        modifier3 = modifier5;
                        i4 = 0;
                        startRestartGroup.startReplaceGroup(-1786142512);
                        m13689EventFlashBadgeWt1r0hQ(Brush.Companion.m5119linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), 0.95f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null))}), 0L, 0L, 0, 14, (Object) null), "⇄", ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), 0L, 0, eventFlashAccentColor, startRestartGroup, 48, 24);
                        composer3.endReplaceGroup();
                        Unit unit4 = Unit.INSTANCE;
                        composer2 = composer3;
                        String eventFlashTitle222 = eventFlashTitle(flashBetEventFlash.getKind(), composer2, i4);
                        composer2.startReplaceGroup(-1720122594);
                        str = eventFlashTitle222;
                        if (StringsKt.isBlank(str)) {
                        }
                        composer4.endReplaceGroup();
                        composer4.startReplaceGroup(-1720104457);
                        if (!StringsKt.isBlank(flashBetEventFlash.getLabel())) {
                        }
                        composer4.endReplaceGroup();
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
                        }
                        modifier2 = modifier3;
                        break;
                    case 6:
                        z = z3;
                        composer3 = startRestartGroup;
                        modifier3 = modifier5;
                        i4 = 0;
                        startRestartGroup.startReplaceGroup(-1785497557);
                        m13689EventFlashBadgeWt1r0hQ(Brush.Companion.m5119linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(ComposeUtils.AppColorPalette.Red.INSTANCE.getColor()), Color.m5158boximpl(Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), 0.75f, 0.0f, 0.0f, 0.0f, 14, null))}), 0L, 0L, 0, 14, (Object) null), "✕", ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), 0L, 0, eventFlashAccentColor, startRestartGroup, 48, 24);
                        composer3.endReplaceGroup();
                        Unit unit5 = Unit.INSTANCE;
                        composer2 = composer3;
                        String eventFlashTitle2222 = eventFlashTitle(flashBetEventFlash.getKind(), composer2, i4);
                        composer2.startReplaceGroup(-1720122594);
                        str = eventFlashTitle2222;
                        if (StringsKt.isBlank(str)) {
                        }
                        composer4.endReplaceGroup();
                        composer4.startReplaceGroup(-1720104457);
                        if (!StringsKt.isBlank(flashBetEventFlash.getLabel())) {
                        }
                        composer4.endReplaceGroup();
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
                        }
                        modifier2 = modifier3;
                        break;
                    case 7:
                        startRestartGroup.startReplaceGroup(-1784881928);
                        i4 = 0;
                        z = z3;
                        modifier3 = modifier5;
                        composer3 = startRestartGroup;
                        m13689EventFlashBadgeWt1r0hQ(Brush.Companion.m5119linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor()), Color.m5158boximpl(Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0.78f, 0.0f, 0.0f, 0.0f, 14, null))}), 0L, 0L, 0, 14, (Object) null), "HT", ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), TextUnitKt.getSp(18), 0, eventFlashAccentColor, startRestartGroup, 3120, 16);
                        composer3.endReplaceGroup();
                        Unit unit6 = Unit.INSTANCE;
                        composer2 = composer3;
                        String eventFlashTitle22222 = eventFlashTitle(flashBetEventFlash.getKind(), composer2, i4);
                        composer2.startReplaceGroup(-1720122594);
                        str = eventFlashTitle22222;
                        if (StringsKt.isBlank(str)) {
                        }
                        composer4.endReplaceGroup();
                        composer4.startReplaceGroup(-1720104457);
                        if (!StringsKt.isBlank(flashBetEventFlash.getLabel())) {
                        }
                        composer4.endReplaceGroup();
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
                        }
                        modifier2 = modifier3;
                        break;
                    default:
                        startRestartGroup.startReplaceGroup(-1720288090);
                        startRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                composer4 = startRestartGroup;
            }
            ScopeUpdateScope endRestartGroup2 = composer4.endRestartGroup();
            if (endRestartGroup2 != null) {
                endRestartGroup2.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetCardFlashOverlayKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit FlashBetEventFlashOverlay$lambda$19;
                        FlashBetEventFlashOverlay$lambda$19 = FlashBetCardFlashOverlayKt.FlashBetEventFlashOverlay$lambda$19(FlashBetEventFlash.this, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return FlashBetEventFlashOverlay$lambda$19;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
        }
        if (i6 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        if (flashBetEventFlash != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetEventFlashOverlay$lambda$12$lambda$11(Animatable animatable, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setClip(false);
        graphicsLayer.setTranslationX(graphicsLayer.mo1167toPx0680j_4(Dp.m7774constructorimpl(((Number) animatable.getValue()).floatValue())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetEventFlashOverlay$lambda$18$lambda$15$lambda$14(float f, boolean z, float f2, Animatable animatable, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setClip(false);
        graphicsLayer.setTranslationX(graphicsLayer.mo1167toPx0680j_4(Dp.m7774constructorimpl(f)));
        if (!z) {
            f2 = 0.0f;
        }
        graphicsLayer.setRotationZ(f2);
        graphicsLayer.setScaleX(((Number) animatable.getValue()).floatValue());
        graphicsLayer.setScaleY(((Number) animatable.getValue()).floatValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079  */
    /* renamed from: EventFlashTeamLogo-3IgeMak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m13690EventFlashTeamLogo3IgeMak(final String str, final long j, int i, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        final int i6;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(797265829);
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
            i4 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 = i;
            i4 |= startRestartGroup.changed(i5) ? 256 : 128;
            if ((i4 & Opcodes.I2S) == 146 || !startRestartGroup.getSkipping()) {
                int i8 = i7 == 0 ? 96 : i5;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(797265829, i4, -1, "org.betup.ui.fragment.flashbet.compose.EventFlashTeamLogo (FlashBetCardFlashOverlay.kt:398)");
                }
                float f = 14;
                float f2 = i8;
                Modifier m1036borderxT4_qwU = BorderKt.m1036borderxT4_qwU(BackgroundKt.m1025backgroundbw27NRU$default(ClipKt.clip(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(ShadowKt.m4803shadows4CzXII$default(Modifier.INSTANCE, Dp.m7774constructorimpl(24), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f)), false, Color.m5167copywmQWz5c$default(j, 0.6f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 4, null), Dp.m7774constructorimpl(f2)), Dp.m7774constructorimpl(f2)), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f))), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), 0.95f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m7774constructorimpl(2), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f)));
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1036borderxT4_qwU);
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
                int i9 = i8;
                SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(str, null, ClipKt.clip(PaddingKt.m1516padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(10)), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(8))), null, null, null, ContentScale.INSTANCE.getFit(), 0.0f, null, 0, false, startRestartGroup, (i4 & 14) | 1572912, 0, 1976);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i6 = i9;
            } else {
                startRestartGroup.skipToGroupEnd();
                i6 = i5;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetCardFlashOverlayKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit EventFlashTeamLogo_3IgeMak$lambda$21;
                        EventFlashTeamLogo_3IgeMak$lambda$21 = FlashBetCardFlashOverlayKt.EventFlashTeamLogo_3IgeMak$lambda$21(str, j, i6, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        return EventFlashTeamLogo_3IgeMak$lambda$21;
                    }
                });
                return;
            }
            return;
        }
        i5 = i;
        if ((i4 & Opcodes.I2S) == 146) {
        }
        if (i7 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        float f3 = 14;
        float f22 = i8;
        Modifier m1036borderxT4_qwU2 = BorderKt.m1036borderxT4_qwU(BackgroundKt.m1025backgroundbw27NRU$default(ClipKt.clip(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(ShadowKt.m4803shadows4CzXII$default(Modifier.INSTANCE, Dp.m7774constructorimpl(24), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f3)), false, Color.m5167copywmQWz5c$default(j, 0.6f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 4, null), Dp.m7774constructorimpl(f22)), Dp.m7774constructorimpl(f22)), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f3))), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), 0.95f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m7774constructorimpl(2), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f3)));
        Alignment center2 = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1036borderxT4_qwU2);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        int i92 = i8;
        SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(str, null, ClipKt.clip(PaddingKt.m1516padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(10)), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(8))), null, null, null, ContentScale.INSTANCE.getFit(), 0.0f, null, 0, false, startRestartGroup, (i4 & 14) | 1572912, 0, 1976);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        i6 = i92;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x004c  */
    /* renamed from: EventFlashBadge-Wt1r0hQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m13689EventFlashBadgeWt1r0hQ(final Brush brush, final String str, final long j, long j2, int i, long j3, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        long j4;
        int i6;
        int i7;
        int i8;
        long j5;
        long sp;
        long m5205getWhite0d7_KjU;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(323132024);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(brush) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(str) ? 32 : 16;
            if ((i3 & 4) == 0) {
                i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i4 |= startRestartGroup.changed(j) ? 256 : 128;
                i5 = i3 & 8;
                if (i5 != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    j4 = j2;
                    i4 |= startRestartGroup.changed(j4) ? 2048 : 1024;
                    i6 = i3 & 16;
                    if (i6 == 0) {
                        i4 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        i7 = i;
                        i4 |= startRestartGroup.changed(i7) ? 16384 : 8192;
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            j5 = j3;
                            i4 |= startRestartGroup.changed(j5) ? 131072 : 65536;
                            if ((i4 & 74899) == 74898 || !startRestartGroup.getSkipping()) {
                                sp = i5 == 0 ? TextUnitKt.getSp(22) : j4;
                                int i9 = i6 == 0 ? 88 : i7;
                                m5205getWhite0d7_KjU = i8 == 0 ? Color.INSTANCE.m5205getWhite0d7_KjU() : j5;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(323132024, i4, -1, "org.betup.ui.fragment.flashbet.compose.EventFlashBadge (FlashBetCardFlashOverlay.kt:438)");
                                }
                                float f = 12;
                                float f2 = i9;
                                Modifier background$default = BackgroundKt.background$default(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(ShadowKt.m4803shadows4CzXII$default(Modifier.INSTANCE, Dp.m7774constructorimpl(22), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f)), false, Color.m5167copywmQWz5c$default(m5205getWhite0d7_KjU, 0.55f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 4, null), Dp.m7774constructorimpl(f2)), Dp.m7774constructorimpl(f2)), brush, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f)), 0.0f, 4, null);
                                Alignment center = Alignment.INSTANCE.getCenter();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, background$default);
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
                                TextKt.m2642Text4IGK_g(str, (Modifier) null, j, sp, (FontStyle) null, FontWeight.INSTANCE.getBold(), ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, ((i4 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i4 & 7168), 0, 130450);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endNode();
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                i7 = i9;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                sp = j4;
                                m5205getWhite0d7_KjU = j5;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                final long j6 = sp;
                                final int i10 = i7;
                                final long j7 = m5205getWhite0d7_KjU;
                                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetCardFlashOverlayKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit EventFlashBadge_Wt1r0hQ$lambda$23;
                                        EventFlashBadge_Wt1r0hQ$lambda$23 = FlashBetCardFlashOverlayKt.EventFlashBadge_Wt1r0hQ$lambda$23(Brush.this, str, j, j6, i10, j7, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                        return EventFlashBadge_Wt1r0hQ$lambda$23;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        j5 = j3;
                        if ((i4 & 74899) == 74898) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        float f3 = 12;
                        float f22 = i9;
                        Modifier background$default2 = BackgroundKt.background$default(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(ShadowKt.m4803shadows4CzXII$default(Modifier.INSTANCE, Dp.m7774constructorimpl(22), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f3)), false, Color.m5167copywmQWz5c$default(m5205getWhite0d7_KjU, 0.55f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 4, null), Dp.m7774constructorimpl(f22)), Dp.m7774constructorimpl(f22)), brush, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f3)), 0.0f, 4, null);
                        Alignment center2 = Alignment.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, background$default2);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                        }
                        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting()) {
                        }
                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        TextKt.m2642Text4IGK_g(str, (Modifier) null, j, sp, (FontStyle) null, FontWeight.INSTANCE.getBold(), ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, ((i4 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i4 & 7168), 0, 130450);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        i7 = i9;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i7 = i;
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    j5 = j3;
                    if ((i4 & 74899) == 74898) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    float f32 = 12;
                    float f222 = i9;
                    Modifier background$default22 = BackgroundKt.background$default(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(ShadowKt.m4803shadows4CzXII$default(Modifier.INSTANCE, Dp.m7774constructorimpl(22), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f32)), false, Color.m5167copywmQWz5c$default(m5205getWhite0d7_KjU, 0.55f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 4, null), Dp.m7774constructorimpl(f222)), Dp.m7774constructorimpl(f222)), brush, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f32)), 0.0f, 4, null);
                    Alignment center22 = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(center22, false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, background$default22);
                    Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl.getInserting()) {
                    }
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                    TextKt.m2642Text4IGK_g(str, (Modifier) null, j, sp, (FontStyle) null, FontWeight.INSTANCE.getBold(), ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, ((i4 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i4 & 7168), 0, 130450);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i7 = i9;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                j4 = j2;
                i6 = i3 & 16;
                if (i6 == 0) {
                }
                i7 = i;
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                j5 = j3;
                if ((i4 & 74899) == 74898) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i8 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                float f322 = 12;
                float f2222 = i9;
                Modifier background$default222 = BackgroundKt.background$default(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(ShadowKt.m4803shadows4CzXII$default(Modifier.INSTANCE, Dp.m7774constructorimpl(22), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f322)), false, Color.m5167copywmQWz5c$default(m5205getWhite0d7_KjU, 0.55f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 4, null), Dp.m7774constructorimpl(f2222)), Dp.m7774constructorimpl(f2222)), brush, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f322)), 0.0f, 4, null);
                Alignment center222 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(center222, false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, background$default222);
                Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                TextKt.m2642Text4IGK_g(str, (Modifier) null, j, sp, (FontStyle) null, FontWeight.INSTANCE.getBold(), ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, ((i4 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i4 & 7168), 0, 130450);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                i7 = i9;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i5 = i3 & 8;
            if (i5 != 0) {
            }
            j4 = j2;
            i6 = i3 & 16;
            if (i6 == 0) {
            }
            i7 = i;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            j5 = j3;
            if ((i4 & 74899) == 74898) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i8 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            float f3222 = 12;
            float f22222 = i9;
            Modifier background$default2222 = BackgroundKt.background$default(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(ShadowKt.m4803shadows4CzXII$default(Modifier.INSTANCE, Dp.m7774constructorimpl(22), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f3222)), false, Color.m5167copywmQWz5c$default(m5205getWhite0d7_KjU, 0.55f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 4, null), Dp.m7774constructorimpl(f22222)), Dp.m7774constructorimpl(f22222)), brush, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f3222)), 0.0f, 4, null);
            Alignment center2222 = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(center2222, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, background$default2222);
            Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
            TextKt.m2642Text4IGK_g(str, (Modifier) null, j, sp, (FontStyle) null, FontWeight.INSTANCE.getBold(), ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, ((i4 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i4 & 7168), 0, 130450);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            i7 = i9;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i3 & 4) == 0) {
        }
        i5 = i3 & 8;
        if (i5 != 0) {
        }
        j4 = j2;
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        i7 = i;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        j5 = j3;
        if ((i4 & 74899) == 74898) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i8 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        float f32222 = 12;
        float f222222 = i9;
        Modifier background$default22222 = BackgroundKt.background$default(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(ShadowKt.m4803shadows4CzXII$default(Modifier.INSTANCE, Dp.m7774constructorimpl(22), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f32222)), false, Color.m5167copywmQWz5c$default(m5205getWhite0d7_KjU, 0.55f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 4, null), Dp.m7774constructorimpl(f222222)), Dp.m7774constructorimpl(f222222)), brush, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f32222)), 0.0f, 4, null);
        Alignment center22222 = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy22222 = BoxKt.maybeCachedBoxMeasurePolicy(center22222, false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, background$default22222);
        Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance22222 = BoxScopeInstance.INSTANCE;
        TextKt.m2642Text4IGK_g(str, (Modifier) null, j, sp, (FontStyle) null, FontWeight.INSTANCE.getBold(), ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, ((i4 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i4 & 7168), 0, 130450);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        i7 = i9;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final long eventFlashAccentColor(FlashBetEventFlashKind flashBetEventFlashKind) {
        switch (WhenMappings.$EnumSwitchMapping$1[flashBetEventFlashKind.ordinal()]) {
            case 1:
                return ColorKt.Color(4294953984L);
            case 2:
                return ComposeUtils.AppColorPalette.Red.INSTANCE.getColor();
            case 3:
                return ComposeUtils.AppColorPalette.Green.INSTANCE.getColor();
            case 4:
                return ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor();
            case 5:
                return ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor();
            case 6:
                return ComposeUtils.AppColorPalette.Red.INSTANCE.getColor();
            case 7:
                return ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final String eventFlashTitle(FlashBetEventFlashKind flashBetEventFlashKind, Composer composer, int i) {
        String str;
        composer.startReplaceGroup(1094547962);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1094547962, i, -1, "org.betup.ui.fragment.flashbet.compose.eventFlashTitle (FlashBetCardFlashOverlay.kt:474)");
        }
        switch (WhenMappings.$EnumSwitchMapping$1[flashBetEventFlashKind.ordinal()]) {
            case 1:
            case 2:
                composer.startReplaceGroup(286876740);
                composer.endReplaceGroup();
                str = "";
                break;
            case 3:
                composer.startReplaceGroup(-406391865);
                str = StringResources_androidKt.stringResource(R.string.flash_bet_event_goal, composer, 6);
                composer.endReplaceGroup();
                break;
            case 4:
                composer.startReplaceGroup(-406383479);
                str = StringResources_androidKt.stringResource(R.string.flash_bet_event_corner, composer, 6);
                composer.endReplaceGroup();
                break;
            case 5:
                composer.startReplaceGroup(-406386385);
                str = StringResources_androidKt.stringResource(R.string.flash_bet_event_substitution, composer, 6);
                composer.endReplaceGroup();
                break;
            case 6:
                composer.startReplaceGroup(-406380495);
                str = StringResources_androidKt.stringResource(R.string.flash_bet_event_penalty_missed, composer, 6);
                composer.endReplaceGroup();
                break;
            case 7:
                composer.startReplaceGroup(-406377428);
                str = StringResources_androidKt.stringResource(R.string.flash_bet_event_half_time, composer, 6);
                composer.endReplaceGroup();
                break;
            default:
                composer.startReplaceGroup(-406392926);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return str;
    }

    public static final void FlashBetCardFlashOverlay(final FlashBetEventFlash flashBetEventFlash, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-251512983);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(flashBetEventFlash) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-251512983, i3, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetCardFlashOverlay (FlashBetCardFlashOverlay.kt:488)");
            }
            FlashBetEventFlashOverlay(flashBetEventFlash, modifier, startRestartGroup, i3 & 126, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetCardFlashOverlayKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FlashBetCardFlashOverlay$lambda$24;
                    FlashBetCardFlashOverlay$lambda$24 = FlashBetCardFlashOverlayKt.FlashBetCardFlashOverlay$lambda$24(FlashBetEventFlash.this, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return FlashBetCardFlashOverlay$lambda$24;
                }
            });
        }
    }
}
