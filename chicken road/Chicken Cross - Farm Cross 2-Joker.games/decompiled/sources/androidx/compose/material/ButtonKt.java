package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Button.kt */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u008d\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008d\u0001\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008d\u0001\u0010\u001b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019¨\u0006\u001c"}, d2 = {"Button", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "elevation", "Landroidx/compose/material/ButtonElevation;", "shape", "Landroidx/compose/ui/graphics/Shape;", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "colors", "Landroidx/compose/material/ButtonColors;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/ButtonElevation;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/ButtonColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "OutlinedButton", "TextButton", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Button(final Function0<Unit> onClick, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, ButtonElevation buttonElevation, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, PaddingValues paddingValues, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        final int i3;
        int i4;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        ButtonElevation buttonElevation2;
        Shape shape2;
        int i6;
        final ButtonColors buttonColors2;
        int i7;
        int i8;
        final PaddingValues paddingValues2;
        Modifier modifier2;
        MutableInteractionSource mutableInteractionSource3;
        int i9;
        ButtonColors buttonColors3;
        final PaddingValues paddingValues3;
        BorderStroke borderStroke2;
        ButtonElevation buttonElevation3;
        Shape shape3;
        boolean z2;
        Composer composer2;
        final Shape shape4;
        final BorderStroke borderStroke3;
        final ButtonElevation buttonElevation4;
        final Modifier modifier3;
        final boolean z3;
        final MutableInteractionSource mutableInteractionSource4;
        ScopeUpdateScope endRestartGroup;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-2116133464);
        ComposerKt.sourceInformation(startRestartGroup, "C(Button)P(8,7,5,6,4,9!2,3)94@4533L39,95@4623L11,96@4669L6,98@4759L14,102@4922L21,108@5086L24,111@5228L37,103@4948L1086:Button.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                i3 |= startRestartGroup.changed(z) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 2048 : 1024;
                    if ((57344 & i) != 0) {
                        if ((i2 & 16) == 0) {
                            buttonElevation2 = buttonElevation;
                            if (startRestartGroup.changed(buttonElevation2)) {
                                i11 = 16384;
                                i3 |= i11;
                            }
                        } else {
                            buttonElevation2 = buttonElevation;
                        }
                        i11 = 8192;
                        i3 |= i11;
                    } else {
                        buttonElevation2 = buttonElevation;
                    }
                    if ((458752 & i) != 0) {
                        shape2 = shape;
                        i3 |= ((i2 & 32) == 0 && startRestartGroup.changed(shape2)) ? 131072 : 65536;
                    } else {
                        shape2 = shape;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        i3 |= startRestartGroup.changed(borderStroke) ? 1048576 : 524288;
                    }
                    if ((29360128 & i) != 0) {
                        if ((i2 & 128) == 0) {
                            buttonColors2 = buttonColors;
                            if (startRestartGroup.changed(buttonColors2)) {
                                i10 = 8388608;
                                i3 |= i10;
                            }
                        } else {
                            buttonColors2 = buttonColors;
                        }
                        i10 = 4194304;
                        i3 |= i10;
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i8 = i7;
                        paddingValues2 = paddingValues;
                        i3 |= startRestartGroup.changed(paddingValues2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        if ((i2 & 512) != 0) {
                            i3 |= C.ENCODING_PCM_32BIT;
                        } else if ((1879048192 & i) == 0) {
                            i3 |= startRestartGroup.changed(content) ? 536870912 : 268435456;
                        }
                        if ((1533916891 & i3) == 306783378 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                modifier2 = i12 != 0 ? Modifier.INSTANCE : modifier;
                                boolean z4 = i4 != 0 ? true : z;
                                if (i5 != 0) {
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
                                if ((i2 & 16) != 0) {
                                    i9 = i8;
                                    i3 &= -57345;
                                    buttonElevation2 = ButtonDefaults.INSTANCE.m927elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                } else {
                                    i9 = i8;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                    shape2 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall();
                                }
                                BorderStroke borderStroke4 = i6 != 0 ? null : borderStroke;
                                if ((i2 & 128) != 0) {
                                    buttonColors3 = ButtonDefaults.INSTANCE.m926buttonColorsro_MJ88(0L, 0L, 0L, 0L, startRestartGroup, 24576, 15);
                                    i3 &= -29360129;
                                } else {
                                    buttonColors3 = buttonColors;
                                }
                                if (i9 != 0) {
                                    borderStroke2 = borderStroke4;
                                    buttonColors2 = buttonColors3;
                                    paddingValues3 = ButtonDefaults.INSTANCE.getContentPadding();
                                } else {
                                    paddingValues3 = paddingValues;
                                    borderStroke2 = borderStroke4;
                                    buttonColors2 = buttonColors3;
                                }
                                buttonElevation3 = buttonElevation2;
                                shape3 = shape2;
                                z2 = z4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                modifier2 = modifier;
                                borderStroke2 = borderStroke;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                paddingValues3 = paddingValues2;
                                shape3 = shape2;
                                z2 = z;
                                buttonElevation3 = buttonElevation2;
                            }
                            startRestartGroup.endDefaults();
                            int i13 = i3 >> 6;
                            int i14 = (i13 & 14) | ((i3 >> 18) & 112);
                            final State<Color> contentColor = buttonColors2.contentColor(z2, startRestartGroup, i14);
                            long m1638unboximpl = buttonColors2.backgroundColor(z2, startRestartGroup, i14).getValue().m1638unboximpl();
                            long m1627copywmQWz5c$default = Color.m1627copywmQWz5c$default(m936Button$lambda1(contentColor), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                            State<Dp> elevation = buttonElevation3 != null ? buttonElevation3.elevation(z2, mutableInteractionSource3, startRestartGroup, i13 & 1022) : null;
                            PaddingValues paddingValues4 = paddingValues3;
                            composer2 = startRestartGroup;
                            SurfaceKt.m1173SurfaceLPr_se0(onClick, modifier2, z2, shape3, m1638unboximpl, m1627copywmQWz5c$default, borderStroke2, elevation != null ? elevation.getValue().m3854unboximpl() : Dp.m3840constructorimpl(0), mutableInteractionSource3, ComposableLambdaKt.composableLambda(startRestartGroup, 7524271, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt$Button$2
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

                                public final void invoke(Composer composer3, int i15) {
                                    long m936Button$lambda1;
                                    ComposerKt.sourceInformation(composer3, "C114@5345L683:Button.kt#jmzs0o");
                                    if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                                        ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                                        m936Button$lambda1 = ButtonKt.m936Button$lambda1(contentColor);
                                        ProvidedValue[] providedValueArr = {localContentAlpha.provides(Float.valueOf(Color.m1630getAlphaimpl(m936Button$lambda1)))};
                                        final PaddingValues paddingValues5 = paddingValues3;
                                        final Function3<RowScope, Composer, Integer, Unit> function3 = content;
                                        final int i16 = i3;
                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, -1699085201, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt$Button$2.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i17) {
                                                ComposerKt.sourceInformation(composer4, "C116@5487L10,115@5431L587:Button.kt#jmzs0o");
                                                if ((i17 & 11) != 2 || !composer4.getSkipping()) {
                                                    TextStyle button = MaterialTheme.INSTANCE.getTypography(composer4, 6).getButton();
                                                    final PaddingValues paddingValues6 = PaddingValues.this;
                                                    final Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                                    final int i18 = i16;
                                                    TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer4, -630330208, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt.Button.2.1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                            invoke(composer5, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer5, int i19) {
                                                            ComposerKt.sourceInformation(composer5, "C118@5537L467:Button.kt#jmzs0o");
                                                            if ((i19 & 11) != 2 || !composer5.getSkipping()) {
                                                                Modifier padding = PaddingKt.padding(SizeKt.m445defaultMinSizeVpY3zN4(Modifier.INSTANCE, ButtonDefaults.INSTANCE.m932getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m931getMinHeightD9Ej5fM()), PaddingValues.this);
                                                                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                                Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                                                int i20 = ((i18 >> 18) & 7168) | 432;
                                                                composer5.startReplaceableGroup(693286680);
                                                                ComposerKt.sourceInformation(composer5, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer5, 54);
                                                                composer5.startReplaceableGroup(-1323940314);
                                                                ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                Object consume = composer5.consume(localDensity);
                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                Density density = (Density) consume;
                                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                Object consume2 = composer5.consume(localLayoutDirection);
                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                LayoutDirection layoutDirection = (LayoutDirection) consume2;
                                                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                Object consume3 = composer5.consume(localViewConfiguration);
                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(padding);
                                                                if (!(composer5.getApplier() instanceof Applier)) {
                                                                    ComposablesKt.invalidApplier();
                                                                }
                                                                composer5.startReusableNode();
                                                                if (composer5.getInserting()) {
                                                                    composer5.createNode(constructor);
                                                                } else {
                                                                    composer5.useNode();
                                                                }
                                                                composer5.disableReusing();
                                                                Composer m1283constructorimpl = Updater.m1283constructorimpl(composer5);
                                                                Updater.m1290setimpl(m1283constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                                Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                                Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                                composer5.enableReusing();
                                                                materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer5)), composer5, 0);
                                                                composer5.startReplaceableGroup(2058660585);
                                                                composer5.startReplaceableGroup(-678309503);
                                                                ComposerKt.sourceInformation(composer5, "C80@3988L9:Row.kt#2w3rfo");
                                                                function33.invoke(RowScopeInstance.INSTANCE, composer5, Integer.valueOf(((i20 >> 6) & 112) | 6));
                                                                composer5.endReplaceableGroup();
                                                                composer5.endReplaceableGroup();
                                                                composer5.endNode();
                                                                composer5.endReplaceableGroup();
                                                                composer5.endReplaceableGroup();
                                                                return;
                                                            }
                                                            composer5.skipToGroupEnd();
                                                        }
                                                    }), composer4, 48);
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        }), composer3, 56);
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }), composer2, (i13 & 7168) | (i3 & 14) | C.ENCODING_PCM_32BIT | (i3 & 112) | (i3 & 896) | (i3 & 3670016) | ((i3 << 15) & 234881024), 0);
                            shape4 = shape3;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColors2;
                            buttonElevation4 = buttonElevation3;
                            paddingValues2 = paddingValues4;
                            modifier3 = modifier2;
                            z3 = z2;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            z3 = z;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            buttonElevation4 = buttonElevation2;
                            shape4 = shape2;
                            composer2 = startRestartGroup;
                            borderStroke3 = borderStroke;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt$Button$3
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

                            public final void invoke(Composer composer3, int i15) {
                                ButtonKt.Button(onClick, modifier3, z3, mutableInteractionSource4, buttonElevation4, shape4, borderStroke3, buttonColors2, paddingValues2, content, composer3, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i8 = i7;
                    paddingValues2 = paddingValues;
                    if ((i2 & 512) != 0) {
                    }
                    if ((1533916891 & i3) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i2 & 128) != 0) {
                    }
                    if (i9 != 0) {
                    }
                    buttonElevation3 = buttonElevation2;
                    shape3 = shape2;
                    z2 = z4;
                    startRestartGroup.endDefaults();
                    int i132 = i3 >> 6;
                    int i142 = (i132 & 14) | ((i3 >> 18) & 112);
                    final State<Color> contentColor2 = buttonColors2.contentColor(z2, startRestartGroup, i142);
                    long m1638unboximpl2 = buttonColors2.backgroundColor(z2, startRestartGroup, i142).getValue().m1638unboximpl();
                    long m1627copywmQWz5c$default2 = Color.m1627copywmQWz5c$default(m936Button$lambda1(contentColor2), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    if (buttonElevation3 != null) {
                    }
                    PaddingValues paddingValues42 = paddingValues3;
                    composer2 = startRestartGroup;
                    SurfaceKt.m1173SurfaceLPr_se0(onClick, modifier2, z2, shape3, m1638unboximpl2, m1627copywmQWz5c$default2, borderStroke2, elevation != null ? elevation.getValue().m3854unboximpl() : Dp.m3840constructorimpl(0), mutableInteractionSource3, ComposableLambdaKt.composableLambda(startRestartGroup, 7524271, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt$Button$2
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

                        public final void invoke(Composer composer3, int i15) {
                            long m936Button$lambda1;
                            ComposerKt.sourceInformation(composer3, "C114@5345L683:Button.kt#jmzs0o");
                            if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                                ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                                m936Button$lambda1 = ButtonKt.m936Button$lambda1(contentColor2);
                                ProvidedValue[] providedValueArr = {localContentAlpha.provides(Float.valueOf(Color.m1630getAlphaimpl(m936Button$lambda1)))};
                                final PaddingValues paddingValues5 = paddingValues3;
                                final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3 = content;
                                final int i16 = i3;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, -1699085201, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt$Button$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i17) {
                                        ComposerKt.sourceInformation(composer4, "C116@5487L10,115@5431L587:Button.kt#jmzs0o");
                                        if ((i17 & 11) != 2 || !composer4.getSkipping()) {
                                            TextStyle button = MaterialTheme.INSTANCE.getTypography(composer4, 6).getButton();
                                            final PaddingValues paddingValues6 = PaddingValues.this;
                                            final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32 = function3;
                                            final int i18 = i16;
                                            TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer4, -630330208, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt.Button.2.1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                    invoke(composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer5, int i19) {
                                                    ComposerKt.sourceInformation(composer5, "C118@5537L467:Button.kt#jmzs0o");
                                                    if ((i19 & 11) != 2 || !composer5.getSkipping()) {
                                                        Modifier padding = PaddingKt.padding(SizeKt.m445defaultMinSizeVpY3zN4(Modifier.INSTANCE, ButtonDefaults.INSTANCE.m932getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m931getMinHeightD9Ej5fM()), PaddingValues.this);
                                                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                        Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                                        int i20 = ((i18 >> 18) & 7168) | 432;
                                                        composer5.startReplaceableGroup(693286680);
                                                        ComposerKt.sourceInformation(composer5, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer5, 54);
                                                        composer5.startReplaceableGroup(-1323940314);
                                                        ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                                        ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume = composer5.consume(localDensity);
                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        Density density = (Density) consume;
                                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                        ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume2 = composer5.consume(localLayoutDirection);
                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        LayoutDirection layoutDirection = (LayoutDirection) consume2;
                                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                        ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume3 = composer5.consume(localViewConfiguration);
                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(padding);
                                                        if (!(composer5.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer5.startReusableNode();
                                                        if (composer5.getInserting()) {
                                                            composer5.createNode(constructor);
                                                        } else {
                                                            composer5.useNode();
                                                        }
                                                        composer5.disableReusing();
                                                        Composer m1283constructorimpl = Updater.m1283constructorimpl(composer5);
                                                        Updater.m1290setimpl(m1283constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                        Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                        Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                        composer5.enableReusing();
                                                        materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer5)), composer5, 0);
                                                        composer5.startReplaceableGroup(2058660585);
                                                        composer5.startReplaceableGroup(-678309503);
                                                        ComposerKt.sourceInformation(composer5, "C80@3988L9:Row.kt#2w3rfo");
                                                        function33.invoke(RowScopeInstance.INSTANCE, composer5, Integer.valueOf(((i20 >> 6) & 112) | 6));
                                                        composer5.endReplaceableGroup();
                                                        composer5.endReplaceableGroup();
                                                        composer5.endNode();
                                                        composer5.endReplaceableGroup();
                                                        composer5.endReplaceableGroup();
                                                        return;
                                                    }
                                                    composer5.skipToGroupEnd();
                                                }
                                            }), composer4, 48);
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), composer3, 56);
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, (i132 & 7168) | (i3 & 14) | C.ENCODING_PCM_32BIT | (i3 & 112) | (i3 & 896) | (i3 & 3670016) | ((i3 << 15) & 234881024), 0);
                    shape4 = shape3;
                    borderStroke3 = borderStroke2;
                    buttonColors2 = buttonColors2;
                    buttonElevation4 = buttonElevation3;
                    paddingValues2 = paddingValues42;
                    modifier3 = modifier2;
                    z3 = z2;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((57344 & i) != 0) {
                }
                if ((458752 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((29360128 & i) != 0) {
                }
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                i8 = i7;
                paddingValues2 = paddingValues;
                if ((i2 & 512) != 0) {
                }
                if ((1533916891 & i3) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i12 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i6 != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                if (i9 != 0) {
                }
                buttonElevation3 = buttonElevation2;
                shape3 = shape2;
                z2 = z4;
                startRestartGroup.endDefaults();
                int i1322 = i3 >> 6;
                int i1422 = (i1322 & 14) | ((i3 >> 18) & 112);
                final State<Color> contentColor22 = buttonColors2.contentColor(z2, startRestartGroup, i1422);
                long m1638unboximpl22 = buttonColors2.backgroundColor(z2, startRestartGroup, i1422).getValue().m1638unboximpl();
                long m1627copywmQWz5c$default22 = Color.m1627copywmQWz5c$default(m936Button$lambda1(contentColor22), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                if (buttonElevation3 != null) {
                }
                PaddingValues paddingValues422 = paddingValues3;
                composer2 = startRestartGroup;
                SurfaceKt.m1173SurfaceLPr_se0(onClick, modifier2, z2, shape3, m1638unboximpl22, m1627copywmQWz5c$default22, borderStroke2, elevation != null ? elevation.getValue().m3854unboximpl() : Dp.m3840constructorimpl(0), mutableInteractionSource3, ComposableLambdaKt.composableLambda(startRestartGroup, 7524271, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt$Button$2
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

                    public final void invoke(Composer composer3, int i15) {
                        long m936Button$lambda1;
                        ComposerKt.sourceInformation(composer3, "C114@5345L683:Button.kt#jmzs0o");
                        if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                            ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                            m936Button$lambda1 = ButtonKt.m936Button$lambda1(contentColor22);
                            ProvidedValue[] providedValueArr = {localContentAlpha.provides(Float.valueOf(Color.m1630getAlphaimpl(m936Button$lambda1)))};
                            final PaddingValues paddingValues5 = paddingValues3;
                            final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3 = content;
                            final int i16 = i3;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, -1699085201, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt$Button$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i17) {
                                    ComposerKt.sourceInformation(composer4, "C116@5487L10,115@5431L587:Button.kt#jmzs0o");
                                    if ((i17 & 11) != 2 || !composer4.getSkipping()) {
                                        TextStyle button = MaterialTheme.INSTANCE.getTypography(composer4, 6).getButton();
                                        final PaddingValues paddingValues6 = PaddingValues.this;
                                        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32 = function3;
                                        final int i18 = i16;
                                        TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer4, -630330208, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt.Button.2.1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                invoke(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer5, int i19) {
                                                ComposerKt.sourceInformation(composer5, "C118@5537L467:Button.kt#jmzs0o");
                                                if ((i19 & 11) != 2 || !composer5.getSkipping()) {
                                                    Modifier padding = PaddingKt.padding(SizeKt.m445defaultMinSizeVpY3zN4(Modifier.INSTANCE, ButtonDefaults.INSTANCE.m932getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m931getMinHeightD9Ej5fM()), PaddingValues.this);
                                                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                    Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                                    int i20 = ((i18 >> 18) & 7168) | 432;
                                                    composer5.startReplaceableGroup(693286680);
                                                    ComposerKt.sourceInformation(composer5, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer5, 54);
                                                    composer5.startReplaceableGroup(-1323940314);
                                                    ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                                    ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume = composer5.consume(localDensity);
                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                    Density density = (Density) consume;
                                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                    ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume2 = composer5.consume(localLayoutDirection);
                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                    LayoutDirection layoutDirection = (LayoutDirection) consume2;
                                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                    ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume3 = composer5.consume(localViewConfiguration);
                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(padding);
                                                    if (!(composer5.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer5.startReusableNode();
                                                    if (composer5.getInserting()) {
                                                        composer5.createNode(constructor);
                                                    } else {
                                                        composer5.useNode();
                                                    }
                                                    composer5.disableReusing();
                                                    Composer m1283constructorimpl = Updater.m1283constructorimpl(composer5);
                                                    Updater.m1290setimpl(m1283constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                    Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                    Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                    composer5.enableReusing();
                                                    materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer5)), composer5, 0);
                                                    composer5.startReplaceableGroup(2058660585);
                                                    composer5.startReplaceableGroup(-678309503);
                                                    ComposerKt.sourceInformation(composer5, "C80@3988L9:Row.kt#2w3rfo");
                                                    function33.invoke(RowScopeInstance.INSTANCE, composer5, Integer.valueOf(((i20 >> 6) & 112) | 6));
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endNode();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    return;
                                                }
                                                composer5.skipToGroupEnd();
                                            }
                                        }), composer4, 48);
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }), composer3, 56);
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }), composer2, (i1322 & 7168) | (i3 & 14) | C.ENCODING_PCM_32BIT | (i3 & 112) | (i3 & 896) | (i3 & 3670016) | ((i3 << 15) & 234881024), 0);
                shape4 = shape3;
                borderStroke3 = borderStroke2;
                buttonColors2 = buttonColors2;
                buttonElevation4 = buttonElevation3;
                paddingValues2 = paddingValues422;
                modifier3 = modifier2;
                z3 = z2;
                mutableInteractionSource4 = mutableInteractionSource3;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((57344 & i) != 0) {
            }
            if ((458752 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((29360128 & i) != 0) {
            }
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            i8 = i7;
            paddingValues2 = paddingValues;
            if ((i2 & 512) != 0) {
            }
            if ((1533916891 & i3) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i12 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if (i9 != 0) {
            }
            buttonElevation3 = buttonElevation2;
            shape3 = shape2;
            z2 = z4;
            startRestartGroup.endDefaults();
            int i13222 = i3 >> 6;
            int i14222 = (i13222 & 14) | ((i3 >> 18) & 112);
            final State<Color> contentColor222 = buttonColors2.contentColor(z2, startRestartGroup, i14222);
            long m1638unboximpl222 = buttonColors2.backgroundColor(z2, startRestartGroup, i14222).getValue().m1638unboximpl();
            long m1627copywmQWz5c$default222 = Color.m1627copywmQWz5c$default(m936Button$lambda1(contentColor222), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
            if (buttonElevation3 != null) {
            }
            PaddingValues paddingValues4222 = paddingValues3;
            composer2 = startRestartGroup;
            SurfaceKt.m1173SurfaceLPr_se0(onClick, modifier2, z2, shape3, m1638unboximpl222, m1627copywmQWz5c$default222, borderStroke2, elevation != null ? elevation.getValue().m3854unboximpl() : Dp.m3840constructorimpl(0), mutableInteractionSource3, ComposableLambdaKt.composableLambda(startRestartGroup, 7524271, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt$Button$2
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

                public final void invoke(Composer composer3, int i15) {
                    long m936Button$lambda1;
                    ComposerKt.sourceInformation(composer3, "C114@5345L683:Button.kt#jmzs0o");
                    if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                        ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                        m936Button$lambda1 = ButtonKt.m936Button$lambda1(contentColor222);
                        ProvidedValue[] providedValueArr = {localContentAlpha.provides(Float.valueOf(Color.m1630getAlphaimpl(m936Button$lambda1)))};
                        final PaddingValues paddingValues5 = paddingValues3;
                        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3 = content;
                        final int i16 = i3;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, -1699085201, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt$Button$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i17) {
                                ComposerKt.sourceInformation(composer4, "C116@5487L10,115@5431L587:Button.kt#jmzs0o");
                                if ((i17 & 11) != 2 || !composer4.getSkipping()) {
                                    TextStyle button = MaterialTheme.INSTANCE.getTypography(composer4, 6).getButton();
                                    final PaddingValues paddingValues6 = PaddingValues.this;
                                    final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32 = function3;
                                    final int i18 = i16;
                                    TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer4, -630330208, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt.Button.2.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            invoke(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer5, int i19) {
                                            ComposerKt.sourceInformation(composer5, "C118@5537L467:Button.kt#jmzs0o");
                                            if ((i19 & 11) != 2 || !composer5.getSkipping()) {
                                                Modifier padding = PaddingKt.padding(SizeKt.m445defaultMinSizeVpY3zN4(Modifier.INSTANCE, ButtonDefaults.INSTANCE.m932getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m931getMinHeightD9Ej5fM()), PaddingValues.this);
                                                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                                int i20 = ((i18 >> 18) & 7168) | 432;
                                                composer5.startReplaceableGroup(693286680);
                                                ComposerKt.sourceInformation(composer5, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer5, 54);
                                                composer5.startReplaceableGroup(-1323940314);
                                                ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume = composer5.consume(localDensity);
                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                Density density = (Density) consume;
                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume2 = composer5.consume(localLayoutDirection);
                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                LayoutDirection layoutDirection = (LayoutDirection) consume2;
                                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume3 = composer5.consume(localViewConfiguration);
                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(padding);
                                                if (!(composer5.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer5.startReusableNode();
                                                if (composer5.getInserting()) {
                                                    composer5.createNode(constructor);
                                                } else {
                                                    composer5.useNode();
                                                }
                                                composer5.disableReusing();
                                                Composer m1283constructorimpl = Updater.m1283constructorimpl(composer5);
                                                Updater.m1290setimpl(m1283constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                composer5.enableReusing();
                                                materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer5)), composer5, 0);
                                                composer5.startReplaceableGroup(2058660585);
                                                composer5.startReplaceableGroup(-678309503);
                                                ComposerKt.sourceInformation(composer5, "C80@3988L9:Row.kt#2w3rfo");
                                                function33.invoke(RowScopeInstance.INSTANCE, composer5, Integer.valueOf(((i20 >> 6) & 112) | 6));
                                                composer5.endReplaceableGroup();
                                                composer5.endReplaceableGroup();
                                                composer5.endNode();
                                                composer5.endReplaceableGroup();
                                                composer5.endReplaceableGroup();
                                                return;
                                            }
                                            composer5.skipToGroupEnd();
                                        }
                                    }), composer4, 48);
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }), composer3, 56);
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, (i13222 & 7168) | (i3 & 14) | C.ENCODING_PCM_32BIT | (i3 & 112) | (i3 & 896) | (i3 & 3670016) | ((i3 << 15) & 234881024), 0);
            shape4 = shape3;
            borderStroke3 = borderStroke2;
            buttonColors2 = buttonColors2;
            buttonElevation4 = buttonElevation3;
            paddingValues2 = paddingValues4222;
            modifier3 = modifier2;
            z3 = z2;
            mutableInteractionSource4 = mutableInteractionSource3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((57344 & i) != 0) {
        }
        if ((458752 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((29360128 & i) != 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        i8 = i7;
        paddingValues2 = paddingValues;
        if ((i2 & 512) != 0) {
        }
        if ((1533916891 & i3) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i12 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if (i9 != 0) {
        }
        buttonElevation3 = buttonElevation2;
        shape3 = shape2;
        z2 = z4;
        startRestartGroup.endDefaults();
        int i132222 = i3 >> 6;
        int i142222 = (i132222 & 14) | ((i3 >> 18) & 112);
        final State<Color> contentColor2222 = buttonColors2.contentColor(z2, startRestartGroup, i142222);
        long m1638unboximpl2222 = buttonColors2.backgroundColor(z2, startRestartGroup, i142222).getValue().m1638unboximpl();
        long m1627copywmQWz5c$default2222 = Color.m1627copywmQWz5c$default(m936Button$lambda1(contentColor2222), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
        if (buttonElevation3 != null) {
        }
        PaddingValues paddingValues42222 = paddingValues3;
        composer2 = startRestartGroup;
        SurfaceKt.m1173SurfaceLPr_se0(onClick, modifier2, z2, shape3, m1638unboximpl2222, m1627copywmQWz5c$default2222, borderStroke2, elevation != null ? elevation.getValue().m3854unboximpl() : Dp.m3840constructorimpl(0), mutableInteractionSource3, ComposableLambdaKt.composableLambda(startRestartGroup, 7524271, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt$Button$2
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

            public final void invoke(Composer composer3, int i15) {
                long m936Button$lambda1;
                ComposerKt.sourceInformation(composer3, "C114@5345L683:Button.kt#jmzs0o");
                if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                    ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                    m936Button$lambda1 = ButtonKt.m936Button$lambda1(contentColor2222);
                    ProvidedValue[] providedValueArr = {localContentAlpha.provides(Float.valueOf(Color.m1630getAlphaimpl(m936Button$lambda1)))};
                    final PaddingValues paddingValues5 = paddingValues3;
                    final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3 = content;
                    final int i16 = i3;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, -1699085201, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt$Button$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i17) {
                            ComposerKt.sourceInformation(composer4, "C116@5487L10,115@5431L587:Button.kt#jmzs0o");
                            if ((i17 & 11) != 2 || !composer4.getSkipping()) {
                                TextStyle button = MaterialTheme.INSTANCE.getTypography(composer4, 6).getButton();
                                final PaddingValues paddingValues6 = PaddingValues.this;
                                final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32 = function3;
                                final int i18 = i16;
                                TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer4, -630330208, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt.Button.2.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer5, int i19) {
                                        ComposerKt.sourceInformation(composer5, "C118@5537L467:Button.kt#jmzs0o");
                                        if ((i19 & 11) != 2 || !composer5.getSkipping()) {
                                            Modifier padding = PaddingKt.padding(SizeKt.m445defaultMinSizeVpY3zN4(Modifier.INSTANCE, ButtonDefaults.INSTANCE.m932getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m931getMinHeightD9Ej5fM()), PaddingValues.this);
                                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                            Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                            int i20 = ((i18 >> 18) & 7168) | 432;
                                            composer5.startReplaceableGroup(693286680);
                                            ComposerKt.sourceInformation(composer5, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer5, 54);
                                            composer5.startReplaceableGroup(-1323940314);
                                            ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                            ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume = composer5.consume(localDensity);
                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                            Density density = (Density) consume;
                                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                            ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume2 = composer5.consume(localLayoutDirection);
                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                            LayoutDirection layoutDirection = (LayoutDirection) consume2;
                                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                            ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume3 = composer5.consume(localViewConfiguration);
                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(padding);
                                            if (!(composer5.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer5.startReusableNode();
                                            if (composer5.getInserting()) {
                                                composer5.createNode(constructor);
                                            } else {
                                                composer5.useNode();
                                            }
                                            composer5.disableReusing();
                                            Composer m1283constructorimpl = Updater.m1283constructorimpl(composer5);
                                            Updater.m1290setimpl(m1283constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                            Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                            Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                            composer5.enableReusing();
                                            materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer5)), composer5, 0);
                                            composer5.startReplaceableGroup(2058660585);
                                            composer5.startReplaceableGroup(-678309503);
                                            ComposerKt.sourceInformation(composer5, "C80@3988L9:Row.kt#2w3rfo");
                                            function33.invoke(RowScopeInstance.INSTANCE, composer5, Integer.valueOf(((i20 >> 6) & 112) | 6));
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            composer5.endNode();
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            return;
                                        }
                                        composer5.skipToGroupEnd();
                                    }
                                }), composer4, 48);
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }), composer3, 56);
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }), composer2, (i132222 & 7168) | (i3 & 14) | C.ENCODING_PCM_32BIT | (i3 & 112) | (i3 & 896) | (i3 & 3670016) | ((i3 << 15) & 234881024), 0);
        shape4 = shape3;
        borderStroke3 = borderStroke2;
        buttonColors2 = buttonColors2;
        buttonElevation4 = buttonElevation3;
        paddingValues2 = paddingValues42222;
        modifier3 = modifier2;
        z3 = z2;
        mutableInteractionSource4 = mutableInteractionSource3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void OutlinedButton(Function0<Unit> onClick, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, ButtonElevation buttonElevation, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, PaddingValues paddingValues, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        MutableInteractionSource mutableInteractionSource2;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-1776134358);
        ComposerKt.sourceInformation(composer, "C(OutlinedButton)P(8,7,5,6,4,9!2,3)168@7956L39,170@8070L6,171@8127L14,172@8185L22,175@8325L270:Button.kt#jmzs0o");
        Modifier modifier2 = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        boolean z2 = (i2 & 4) != 0 ? true : z;
        if ((i2 & 8) != 0) {
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        Button(onClick, modifier2, z2, mutableInteractionSource2, (i2 & 16) != 0 ? null : buttonElevation, (i2 & 32) != 0 ? MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall() : shape, (i2 & 64) != 0 ? ButtonDefaults.INSTANCE.getOutlinedBorder(composer, 6) : borderStroke, (i2 & 128) != 0 ? ButtonDefaults.INSTANCE.m934outlinedButtonColorsRGew2ao(0L, 0L, 0L, composer, 3072, 7) : buttonColors, (i2 & 256) != 0 ? ButtonDefaults.INSTANCE.getContentPadding() : paddingValues, content, composer, i & 2147483646, 0);
        composer.endReplaceableGroup();
    }

    public static final void TextButton(Function0<Unit> onClick, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, ButtonElevation buttonElevation, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, PaddingValues paddingValues, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        MutableInteractionSource mutableInteractionSource2;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(288797557);
        ComposerKt.sourceInformation(composer, "C(TextButton)P(8,7,5,6,4,9!2,3)222@10527L39,224@10641L6,226@10731L18,229@10877L270:Button.kt#jmzs0o");
        Modifier modifier2 = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        boolean z2 = (i2 & 4) != 0 ? true : z;
        if ((i2 & 8) != 0) {
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        Button(onClick, modifier2, z2, mutableInteractionSource2, (i2 & 16) != 0 ? null : buttonElevation, (i2 & 32) != 0 ? MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall() : shape, (i2 & 64) != 0 ? null : borderStroke, (i2 & 128) != 0 ? ButtonDefaults.INSTANCE.m935textButtonColorsRGew2ao(0L, 0L, 0L, composer, 3072, 7) : buttonColors, (i2 & 256) != 0 ? ButtonDefaults.INSTANCE.getTextButtonContentPadding() : paddingValues, content, composer, i & 2147483646, 0);
        composer.endReplaceableGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Button$lambda-1, reason: not valid java name */
    public static final long m936Button$lambda1(State<Color> state) {
        return state.getValue().m1638unboximpl();
    }
}
