package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidPopup.android.kt */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aX\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001aD\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0015\u001a(\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00022\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u0010H\u0001¢\u0006\u0002\u0010\u0018\u001a+\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001b2\u0013\b\b\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u0010H\u0083\b¢\u0006\u0002\u0010\u001c\u001a\u001a\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u001a\f\u0010\"\u001a\u00020\u001e*\u00020 H\u0000\u001a\f\u0010#\u001a\u00020$*\u00020%H\u0002\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"LocalPopupTestTag", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "getLocalPopupTestTag", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "Popup", "", "alignment", "Landroidx/compose/ui/Alignment;", "offset", "Landroidx/compose/ui/unit/IntOffset;", "onDismissRequest", "Lkotlin/Function0;", "properties", "Landroidx/compose/ui/window/PopupProperties;", "content", "Landroidx/compose/runtime/Composable;", "Popup-K5zGePQ", "(Landroidx/compose/ui/Alignment;JLkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "popupPositionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "PopupTestTag", "tag", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SimpleStack", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "isPopupLayout", "", "view", "Landroid/view/View;", "testTag", "isFlagSecureEnabled", "toIntBounds", "Landroidx/compose/ui/unit/IntRect;", "Landroid/graphics/Rect;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidPopup_androidKt {
    private static final ProvidableCompositionLocal<String> LocalPopupTestTag = CompositionLocalKt.compositionLocalOf$default(null, new Function0<String>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$LocalPopupTestTag$1
        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }, 1, null);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0058  */
    /* renamed from: Popup-K5zGePQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4083PopupK5zGePQ(Alignment alignment, long j, Function0<Unit> function0, PopupProperties popupProperties, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        final Alignment alignment2;
        int i3;
        long j2;
        int i4;
        Function0<Unit> function02;
        PopupProperties popupProperties2;
        Function0<Unit> function03;
        PopupProperties popupProperties3;
        Alignment alignment3;
        long j3;
        boolean changed;
        Object rememberedValue;
        final long j4;
        final Function0<Unit> function04;
        final PopupProperties popupProperties4;
        ScopeUpdateScope endRestartGroup;
        int i5;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(295309329);
        ComposerKt.sourceInformation(startRestartGroup, "C(Popup)P(!1,2:c#ui.unit.IntOffset,3,4)191@8520L128,198@8654L165:AndroidPopup.android.kt#2oxthz");
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            alignment2 = alignment;
        } else if ((i & 14) == 0) {
            alignment2 = alignment;
            i3 = (startRestartGroup.changed(alignment2) ? 4 : 2) | i;
        } else {
            alignment2 = alignment;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            j2 = j;
            i3 |= startRestartGroup.changed(j2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                function02 = function0;
                i3 |= startRestartGroup.changed(function02) ? 256 : 128;
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        popupProperties2 = popupProperties;
                        if (startRestartGroup.changed(popupProperties2)) {
                            i5 = 2048;
                            i3 |= i5;
                        }
                    } else {
                        popupProperties2 = popupProperties;
                    }
                    i5 = 1024;
                    i3 |= i5;
                } else {
                    popupProperties2 = popupProperties;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    i3 |= startRestartGroup.changed(content) ? 16384 : 8192;
                }
                if ((46811 & i3) == 9362 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Alignment topStart = i6 != 0 ? Alignment.INSTANCE.getTopStart() : alignment2;
                        long IntOffset = i7 != 0 ? IntOffsetKt.IntOffset(0, 0) : j2;
                        if (i4 != 0) {
                            function02 = null;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            popupProperties3 = new PopupProperties(false, false, false, null, false, false, 63, null);
                            j3 = IntOffset;
                            function03 = function02;
                            alignment3 = topStart;
                        } else {
                            function03 = function02;
                            popupProperties3 = popupProperties2;
                            alignment3 = topStart;
                            j3 = IntOffset;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        function03 = function02;
                        popupProperties3 = popupProperties2;
                        alignment3 = alignment2;
                        j3 = j2;
                    }
                    startRestartGroup.endDefaults();
                    IntOffset m3949boximpl = IntOffset.m3949boximpl(j3);
                    startRestartGroup.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
                    changed = startRestartGroup.changed(m3949boximpl) | startRestartGroup.changed(alignment3);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new AlignmentOffsetPositionProvider(alignment3, j3, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    Popup((AlignmentOffsetPositionProvider) rememberedValue, function03, popupProperties3, content, startRestartGroup, (i3 >> 3) & 8176, 0);
                    alignment2 = alignment3;
                    j4 = j3;
                    function04 = function03;
                    popupProperties4 = popupProperties3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    j4 = j2;
                    function04 = function02;
                    popupProperties4 = popupProperties2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$1
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

                    public final void invoke(Composer composer2, int i8) {
                        AndroidPopup_androidKt.m4083PopupK5zGePQ(Alignment.this, j4, function04, popupProperties4, content, composer2, i | 1, i2);
                    }
                });
                return;
            }
            function02 = function0;
            if ((i & 7168) == 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((46811 & i3) == 9362) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            startRestartGroup.endDefaults();
            IntOffset m3949boximpl2 = IntOffset.m3949boximpl(j3);
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(m3949boximpl2) | startRestartGroup.changed(alignment3);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new AlignmentOffsetPositionProvider(alignment3, j3, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            Popup((AlignmentOffsetPositionProvider) rememberedValue, function03, popupProperties3, content, startRestartGroup, (i3 >> 3) & 8176, 0);
            alignment2 = alignment3;
            j4 = j3;
            function04 = function03;
            popupProperties4 = popupProperties3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        j2 = j;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function02 = function0;
        if ((i & 7168) == 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((46811 & i3) == 9362) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        startRestartGroup.endDefaults();
        IntOffset m3949boximpl22 = IntOffset.m3949boximpl(j3);
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(m3949boximpl22) | startRestartGroup.changed(alignment3);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new AlignmentOffsetPositionProvider(alignment3, j3, null);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        Popup((AlignmentOffsetPositionProvider) rememberedValue, function03, popupProperties3, content, startRestartGroup, (i3 >> 3) & 8176, 0);
        alignment2 = alignment3;
        j4 = j3;
        function04 = function03;
        popupProperties4 = popupProperties3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Popup(final PopupPositionProvider popupPositionProvider, Function0<Unit> function0, PopupProperties popupProperties, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        final Function0<Unit> function02;
        final PopupProperties popupProperties2;
        int i4;
        PopupProperties popupProperties3;
        Function0<Unit> function03;
        Object rememberedValue;
        LayoutDirection layoutDirection;
        String str;
        int i5;
        Object obj;
        ScopeUpdateScope endRestartGroup;
        int i6;
        Intrinsics.checkNotNullParameter(popupPositionProvider, "popupPositionProvider");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-830247068);
        ComposerKt.sourceInformation(startRestartGroup, "C(Popup)P(2,1,3)225@9543L7,226@9582L7,227@9626L7,228@9681L7,229@9717L28,230@9772L29,231@9820L38,232@9881L944,260@10831L417,275@11254L229,284@11489L166,296@12218L175,306@12571L771:AndroidPopup.android.kt#2oxthz");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(popupPositionProvider) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            function02 = function0;
            i3 |= startRestartGroup.changed(function02) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    popupProperties2 = popupProperties;
                    if (startRestartGroup.changed(popupProperties2)) {
                        i6 = 256;
                        i3 |= i6;
                    }
                } else {
                    popupProperties2 = popupProperties;
                }
                i6 = 128;
                i3 |= i6;
            } else {
                popupProperties2 = popupProperties;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changed(content) ? 2048 : 1024;
            }
            if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    if (i7 != 0) {
                        function02 = null;
                    }
                    if ((i2 & 4) != 0) {
                        i4 = i3 & (-897);
                        popupProperties3 = new PopupProperties(false, false, false, null, false, false, 63, null);
                        function03 = function02;
                        startRestartGroup.endDefaults();
                        ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localView);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        View view = (View) consume;
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume2 = startRestartGroup.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Density density = (Density) consume2;
                        ProvidableCompositionLocal<String> providableCompositionLocal = LocalPopupTestTag;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume3 = startRestartGroup.consume(providableCompositionLocal);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final String str2 = (String) consume3;
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume4 = startRestartGroup.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        LayoutDirection layoutDirection2 = (LayoutDirection) consume4;
                        CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
                        final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, startRestartGroup, (i4 >> 9) & 14);
                        UUID popupId = (UUID) RememberSaveableKt.m1296rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<UUID>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1
                            @Override // kotlin.jvm.functions.Function0
                            public final UUID invoke() {
                                return UUID.randomUUID();
                            }
                        }, startRestartGroup, 3080, 6);
                        startRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            Intrinsics.checkNotNullExpressionValue(popupId, "popupId");
                            layoutDirection = layoutDirection2;
                            str = "C:CompositionLocal.kt#9igjgp";
                            i5 = 2023513938;
                            final PopupLayout popupLayout = new PopupLayout(function03, popupProperties3, str2, view, density, popupPositionProvider, popupId, null, 128, null);
                            popupLayout.setContent(rememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(1302892335, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
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

                                public final void invoke(Composer composer2, int i8) {
                                    ComposerKt.sourceInformation(composer2, "C243@10262L533:AndroidPopup.android.kt#2oxthz");
                                    if ((i8 & 11) != 2 || !composer2.getSkipping()) {
                                        Modifier semantics$default = SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.1
                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                invoke2(semanticsPropertyReceiver);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(SemanticsPropertyReceiver semantics) {
                                                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                                SemanticsPropertiesKt.popup(semantics);
                                            }
                                        }, 1, null);
                                        final PopupLayout popupLayout2 = PopupLayout.this;
                                        Modifier alpha = AlphaKt.alpha(OnRemeasuredModifierKt.onSizeChanged(semantics$default, new Function1<IntSize, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.2
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                                m4085invokeozmzZPI(intSize.getPackedValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                            public final void m4085invokeozmzZPI(long j) {
                                                PopupLayout.this.m4089setPopupContentSizefhxjrPA(IntSize.m3992boximpl(j));
                                                PopupLayout.this.updatePosition();
                                            }
                                        }), PopupLayout.this.getCanCalculatePosition() ? 1.0f : 0.0f);
                                        final State<Function2<Composer, Integer, Unit>> state = rememberUpdatedState;
                                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, 606497925, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.3
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

                                            public final void invoke(Composer composer3, int i9) {
                                                Function2 m4082Popup$lambda1;
                                                ComposerKt.sourceInformation(composer3, "C254@10761L16:AndroidPopup.android.kt#2oxthz");
                                                if ((i9 & 11) == 2 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                } else {
                                                    m4082Popup$lambda1 = AndroidPopup_androidKt.m4082Popup$lambda1(state);
                                                    m4082Popup$lambda1.invoke(composer3, 0);
                                                }
                                            }
                                        });
                                        composer2.startReplaceableGroup(1406149896);
                                        ComposerKt.sourceInformation(composer2, "C(SimpleStack)P(1)338@14055L979:AndroidPopup.android.kt#2oxthz");
                                        AndroidPopup_androidKt$SimpleStack$1 androidPopup_androidKt$SimpleStack$1 = AndroidPopup_androidKt$SimpleStack$1.INSTANCE;
                                        composer2.startReplaceableGroup(-1323940314);
                                        ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume5 = composer2.consume(localDensity2);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        Density density2 = (Density) consume5;
                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume6 = composer2.consume(localLayoutDirection2);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        LayoutDirection layoutDirection3 = (LayoutDirection) consume6;
                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume7 = composer2.consume(localViewConfiguration);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume7;
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(alpha);
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
                                        Updater.m1290setimpl(m1283constructorimpl, androidPopup_androidKt$SimpleStack$1, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m1290setimpl(m1283constructorimpl, density2, ComposeUiNode.INSTANCE.getSetDensity());
                                        Updater.m1290setimpl(m1283constructorimpl, layoutDirection3, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                        Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                        composer2.enableReusing();
                                        materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer2)), composer2, 0);
                                        composer2.startReplaceableGroup(2058660585);
                                        composableLambda.invoke(composer2, 6);
                                        composer2.endReplaceableGroup();
                                        composer2.endNode();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }));
                            startRestartGroup.updateRememberedValue(popupLayout);
                            obj = popupLayout;
                        } else {
                            layoutDirection = layoutDirection2;
                            str = "C:CompositionLocal.kt#9igjgp";
                            i5 = 2023513938;
                            obj = rememberedValue;
                        }
                        startRestartGroup.endReplaceableGroup();
                        final PopupLayout popupLayout2 = (PopupLayout) obj;
                        final Function0<Unit> function04 = function03;
                        final PopupProperties popupProperties4 = popupProperties3;
                        final LayoutDirection layoutDirection3 = layoutDirection;
                        EffectsKt.DisposableEffect(popupLayout2, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                PopupLayout.this.show();
                                PopupLayout.this.updateParameters(function04, popupProperties4, str2, layoutDirection3);
                                final PopupLayout popupLayout3 = PopupLayout.this;
                                return new DisposableEffectResult() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$invoke$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        PopupLayout.this.disposeComposition();
                                        PopupLayout.this.dismiss();
                                    }
                                };
                            }
                        }, startRestartGroup, 8);
                        EffectsKt.SideEffect(new Function0<Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                PopupLayout.this.updateParameters(function04, popupProperties4, str2, layoutDirection3);
                            }
                        }, startRestartGroup, 0);
                        EffectsKt.DisposableEffect(popupPositionProvider, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                PopupLayout.this.setPositionProvider(popupPositionProvider);
                                PopupLayout.this.updatePosition();
                                return new DisposableEffectResult() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$invoke$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                    }
                                };
                            }
                        }, startRestartGroup, i4 & 14);
                        EffectsKt.LaunchedEffect(popupLayout2, new AndroidPopup_androidKt$Popup$5(popupLayout2, null), startRestartGroup, 8);
                        Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.INSTANCE, new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                invoke2(layoutCoordinates);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(LayoutCoordinates childCoordinates) {
                                Intrinsics.checkNotNullParameter(childCoordinates, "childCoordinates");
                                LayoutCoordinates parentLayoutCoordinates = childCoordinates.getParentLayoutCoordinates();
                                Intrinsics.checkNotNull(parentLayoutCoordinates);
                                PopupLayout.this.updateParentLayoutCoordinates(parentLayoutCoordinates);
                            }
                        });
                        final LayoutDirection layoutDirection4 = layoutDirection;
                        MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8
                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            /* renamed from: measure-3p2s80s */
                            public final MeasureResult mo15measure3p2s80s(MeasureScope Layout, List<? extends Measurable> list, long j) {
                                Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                                Intrinsics.checkNotNullParameter(list, "<anonymous parameter 0>");
                                PopupLayout.this.setParentLayoutDirection(layoutDirection4);
                                return MeasureScope.layout$default(Layout, 0, 0, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$measure$1
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Placeable.PlacementScope layout) {
                                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                        invoke2(placementScope);
                                        return Unit.INSTANCE;
                                    }
                                }, 4, null);
                            }
                        };
                        startRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                        String str3 = str;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, i5, str3);
                        Object consume5 = startRestartGroup.consume(localDensity2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Density density2 = (Density) consume5;
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, i5, str3);
                        Object consume6 = startRestartGroup.consume(localLayoutDirection2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        LayoutDirection layoutDirection5 = (LayoutDirection) consume6;
                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, i5, str3);
                        Object consume7 = startRestartGroup.consume(localViewConfiguration);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume7;
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(onGloballyPositioned);
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
                        Updater.m1290setimpl(m1283constructorimpl, density2, ComposeUiNode.INSTANCE.getSetDensity());
                        Updater.m1290setimpl(m1283constructorimpl, layoutDirection5, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                        Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                        startRestartGroup.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
                        startRestartGroup.startReplaceableGroup(2058660585);
                        startRestartGroup.startReplaceableGroup(2085825549);
                        ComposerKt.sourceInformation(startRestartGroup, "C:AndroidPopup.android.kt#2oxthz");
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceableGroup();
                        function02 = function03;
                        popupProperties2 = popupProperties3;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                }
                i4 = i3;
                function03 = function02;
                popupProperties3 = popupProperties2;
                startRestartGroup.endDefaults();
                ProvidableCompositionLocal<View> localView2 = AndroidCompositionLocals_androidKt.getLocalView();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume8 = startRestartGroup.consume(localView2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                View view2 = (View) consume8;
                ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume22 = startRestartGroup.consume(localDensity3);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density3 = (Density) consume22;
                ProvidableCompositionLocal<String> providableCompositionLocal2 = LocalPopupTestTag;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume32 = startRestartGroup.consume(providableCompositionLocal2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final String str22 = (String) consume32;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume42 = startRestartGroup.consume(localLayoutDirection3);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection22 = (LayoutDirection) consume42;
                CompositionContext rememberCompositionContext2 = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
                final State<? extends Function2<? super Composer, ? super Integer, Unit>> rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(content, startRestartGroup, (i4 >> 9) & 14);
                UUID popupId2 = (UUID) RememberSaveableKt.m1296rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<UUID>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1
                    @Override // kotlin.jvm.functions.Function0
                    public final UUID invoke() {
                        return UUID.randomUUID();
                    }
                }, startRestartGroup, 3080, 6);
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final PopupLayout popupLayout22 = (PopupLayout) obj;
                final Function0<Unit> function042 = function03;
                final PopupProperties popupProperties42 = popupProperties3;
                final LayoutDirection layoutDirection32 = layoutDirection;
                EffectsKt.DisposableEffect(popupLayout22, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        PopupLayout.this.show();
                        PopupLayout.this.updateParameters(function042, popupProperties42, str22, layoutDirection32);
                        final PopupLayout popupLayout3 = PopupLayout.this;
                        return new DisposableEffectResult() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                PopupLayout.this.disposeComposition();
                                PopupLayout.this.dismiss();
                            }
                        };
                    }
                }, startRestartGroup, 8);
                EffectsKt.SideEffect(new Function0<Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        PopupLayout.this.updateParameters(function042, popupProperties42, str22, layoutDirection32);
                    }
                }, startRestartGroup, 0);
                EffectsKt.DisposableEffect(popupPositionProvider, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        PopupLayout.this.setPositionProvider(popupPositionProvider);
                        PopupLayout.this.updatePosition();
                        return new DisposableEffectResult() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                            }
                        };
                    }
                }, startRestartGroup, i4 & 14);
                EffectsKt.LaunchedEffect(popupLayout22, new AndroidPopup_androidKt$Popup$5(popupLayout22, null), startRestartGroup, 8);
                Modifier onGloballyPositioned2 = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.INSTANCE, new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                        invoke2(layoutCoordinates);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(LayoutCoordinates childCoordinates) {
                        Intrinsics.checkNotNullParameter(childCoordinates, "childCoordinates");
                        LayoutCoordinates parentLayoutCoordinates = childCoordinates.getParentLayoutCoordinates();
                        Intrinsics.checkNotNull(parentLayoutCoordinates);
                        PopupLayout.this.updateParentLayoutCoordinates(parentLayoutCoordinates);
                    }
                });
                final LayoutDirection layoutDirection42 = layoutDirection;
                MeasurePolicy measurePolicy2 = new MeasurePolicy() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo15measure3p2s80s(MeasureScope Layout, List<? extends Measurable> list, long j) {
                        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                        Intrinsics.checkNotNullParameter(list, "<anonymous parameter 0>");
                        PopupLayout.this.setParentLayoutDirection(layoutDirection42);
                        return MeasureScope.layout$default(Layout, 0, 0, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$measure$1
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope layout) {
                                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }
                        }, 4, null);
                    }
                };
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
                String str32 = str;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, i5, str32);
                Object consume52 = startRestartGroup.consume(localDensity22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density22 = (Density) consume52;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, i5, str32);
                Object consume62 = startRestartGroup.consume(localLayoutDirection22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection52 = (LayoutDirection) consume62;
                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, i5, str32);
                Object consume72 = startRestartGroup.consume(localViewConfiguration2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume72;
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(onGloballyPositioned2);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                startRestartGroup.disableReusing();
                Composer m1283constructorimpl2 = Updater.m1283constructorimpl(startRestartGroup);
                Updater.m1290setimpl(m1283constructorimpl2, measurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m1290setimpl(m1283constructorimpl2, density22, ComposeUiNode.INSTANCE.getSetDensity());
                Updater.m1290setimpl(m1283constructorimpl2, layoutDirection52, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                Updater.m1290setimpl(m1283constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(2085825549);
                ComposerKt.sourceInformation(startRestartGroup, "C:AndroidPopup.android.kt#2oxthz");
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                function02 = function03;
                popupProperties2 = popupProperties3;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9
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

                public final void invoke(Composer composer2, int i8) {
                    AndroidPopup_androidKt.Popup(PopupPositionProvider.this, function02, popupProperties2, content, composer2, i | 1, i2);
                }
            });
            return;
        }
        function02 = function0;
        if ((i & 896) != 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 5851) == 1170) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i7 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        i4 = i3;
        function03 = function02;
        popupProperties3 = popupProperties2;
        startRestartGroup.endDefaults();
        ProvidableCompositionLocal<View> localView22 = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume82 = startRestartGroup.consume(localView22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        View view22 = (View) consume82;
        ProvidableCompositionLocal<Density> localDensity32 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume222 = startRestartGroup.consume(localDensity32);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density32 = (Density) consume222;
        ProvidableCompositionLocal<String> providableCompositionLocal22 = LocalPopupTestTag;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume322 = startRestartGroup.consume(providableCompositionLocal22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final String str222 = (String) consume322;
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection32 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume422 = startRestartGroup.consume(localLayoutDirection32);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        LayoutDirection layoutDirection222 = (LayoutDirection) consume422;
        CompositionContext rememberCompositionContext22 = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
        final State<? extends Function2<? super Composer, ? super Integer, Unit>> rememberUpdatedState22 = SnapshotStateKt.rememberUpdatedState(content, startRestartGroup, (i4 >> 9) & 14);
        UUID popupId22 = (UUID) RememberSaveableKt.m1296rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<UUID>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1
            @Override // kotlin.jvm.functions.Function0
            public final UUID invoke() {
                return UUID.randomUUID();
            }
        }, startRestartGroup, 3080, 6);
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final PopupLayout popupLayout222 = (PopupLayout) obj;
        final Function0<Unit> function0422 = function03;
        final PopupProperties popupProperties422 = popupProperties3;
        final LayoutDirection layoutDirection322 = layoutDirection;
        EffectsKt.DisposableEffect(popupLayout222, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                PopupLayout.this.show();
                PopupLayout.this.updateParameters(function0422, popupProperties422, str222, layoutDirection322);
                final PopupLayout popupLayout3 = PopupLayout.this;
                return new DisposableEffectResult() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        PopupLayout.this.disposeComposition();
                        PopupLayout.this.dismiss();
                    }
                };
            }
        }, startRestartGroup, 8);
        EffectsKt.SideEffect(new Function0<Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                PopupLayout.this.updateParameters(function0422, popupProperties422, str222, layoutDirection322);
            }
        }, startRestartGroup, 0);
        EffectsKt.DisposableEffect(popupPositionProvider, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                PopupLayout.this.setPositionProvider(popupPositionProvider);
                PopupLayout.this.updatePosition();
                return new DisposableEffectResult() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                    }
                };
            }
        }, startRestartGroup, i4 & 14);
        EffectsKt.LaunchedEffect(popupLayout222, new AndroidPopup_androidKt$Popup$5(popupLayout222, null), startRestartGroup, 8);
        Modifier onGloballyPositioned22 = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.INSTANCE, new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutCoordinates childCoordinates) {
                Intrinsics.checkNotNullParameter(childCoordinates, "childCoordinates");
                LayoutCoordinates parentLayoutCoordinates = childCoordinates.getParentLayoutCoordinates();
                Intrinsics.checkNotNull(parentLayoutCoordinates);
                PopupLayout.this.updateParentLayoutCoordinates(parentLayoutCoordinates);
            }
        });
        final LayoutDirection layoutDirection422 = layoutDirection;
        MeasurePolicy measurePolicy22 = new MeasurePolicy() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo15measure3p2s80s(MeasureScope Layout, List<? extends Measurable> list, long j) {
                Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                Intrinsics.checkNotNullParameter(list, "<anonymous parameter 0>");
                PopupLayout.this.setParentLayoutDirection(layoutDirection422);
                return MeasureScope.layout$default(Layout, 0, 0, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$measure$1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Placeable.PlacementScope layout) {
                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return Unit.INSTANCE;
                    }
                }, 4, null);
            }
        };
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        ProvidableCompositionLocal<Density> localDensity222 = CompositionLocalsKt.getLocalDensity();
        String str322 = str;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, i5, str322);
        Object consume522 = startRestartGroup.consume(localDensity222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density222 = (Density) consume522;
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection222 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, i5, str322);
        Object consume622 = startRestartGroup.consume(localLayoutDirection222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        LayoutDirection layoutDirection522 = (LayoutDirection) consume622;
        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration22 = CompositionLocalsKt.getLocalViewConfiguration();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, i5, str322);
        Object consume722 = startRestartGroup.consume(localViewConfiguration22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ViewConfiguration viewConfiguration22 = (ViewConfiguration) consume722;
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf22 = LayoutKt.materializerOf(onGloballyPositioned22);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m1283constructorimpl22 = Updater.m1283constructorimpl(startRestartGroup);
        Updater.m1290setimpl(m1283constructorimpl22, measurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m1290setimpl(m1283constructorimpl22, density222, ComposeUiNode.INSTANCE.getSetDensity());
        Updater.m1290setimpl(m1283constructorimpl22, layoutDirection522, ComposeUiNode.INSTANCE.getSetLayoutDirection());
        Updater.m1290setimpl(m1283constructorimpl22, viewConfiguration22, ComposeUiNode.INSTANCE.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf22.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(2085825549);
        ComposerKt.sourceInformation(startRestartGroup, "C:AndroidPopup.android.kt#2oxthz");
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        function02 = function03;
        popupProperties2 = popupProperties3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final ProvidableCompositionLocal<String> getLocalPopupTestTag() {
        return LocalPopupTestTag;
    }

    public static final void PopupTestTag(final String tag, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-498879600);
        ComposerKt.sourceInformation(startRestartGroup, "C(PopupTestTag)P(1)330@13717L75:AndroidPopup.android.kt#2oxthz");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(tag) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(content) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{LocalPopupTestTag.provides(tag)}, content, startRestartGroup, (i2 & 112) | 8);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$PopupTestTag$1
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
                AndroidPopup_androidKt.PopupTestTag(tag, content, composer2, i | 1);
            }
        });
    }

    private static final void SimpleStack(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        composer.startReplaceableGroup(1406149896);
        ComposerKt.sourceInformation(composer, "C(SimpleStack)P(1)338@14055L979:AndroidPopup.android.kt#2oxthz");
        AndroidPopup_androidKt$SimpleStack$1 androidPopup_androidKt$SimpleStack$1 = AndroidPopup_androidKt$SimpleStack$1.INSTANCE;
        int i2 = ((i << 3) & 112) | ((i >> 3) & 14);
        composer.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(composer, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Density density = (Density) consume;
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume2 = composer.consume(localLayoutDirection);
        ComposerKt.sourceInformationMarkerEnd(composer);
        LayoutDirection layoutDirection = (LayoutDirection) consume2;
        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume3 = composer.consume(localViewConfiguration);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(modifier);
        int i3 = ((i2 << 9) & 7168) | 6;
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        composer.disableReusing();
        Composer m1283constructorimpl = Updater.m1283constructorimpl(composer);
        Updater.m1290setimpl(m1283constructorimpl, androidPopup_androidKt$SimpleStack$1, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
        Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
        Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
        composer.enableReusing();
        materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        function2.invoke(composer, Integer.valueOf((i3 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    public static final boolean isFlagSecureEnabled(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRect toIntBounds(Rect rect) {
        return new IntRect(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static /* synthetic */ boolean isPopupLayout$default(View view, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return isPopupLayout(view, str);
    }

    public static final boolean isPopupLayout(View view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        return (view instanceof PopupLayout) && (str == null || Intrinsics.areEqual(str, ((PopupLayout) view).getTestTag()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Popup$lambda-1, reason: not valid java name */
    public static final Function2<Composer, Integer, Unit> m4082Popup$lambda1(State<? extends Function2<? super Composer, ? super Integer, Unit>> state) {
        return (Function2) state.getValue();
    }
}
