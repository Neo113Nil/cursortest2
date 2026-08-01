package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Chip.kt */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u008e\u0001\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u001b2\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000b0\u001d¢\u0006\u0002\b\u001b¢\u0006\u0002\b\u001fH\u0007¢\u0006\u0002\u0010 \u001aÄ\u0001\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00112\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020#2\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u001b2\u0015\b\u0002\u0010$\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u001b2\u0015\b\u0002\u0010%\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u001b2\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000b0\u001d¢\u0006\u0002\b\u001b¢\u0006\u0002\b\u001fH\u0007¢\u0006\u0002\u0010&\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0005\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\t\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"HorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "LeadingIconEndSpacing", "LeadingIconStartSpacing", "SelectedIconContainerSize", "SelectedOverlayOpacity", "", "SurfaceOverlayOpacity", "TrailingIconSpacing", "Chip", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "colors", "Landroidx/compose/material/ChipColors;", "leadingIcon", "Landroidx/compose/runtime/Composable;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/ChipColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "FilterChip", "selected", "Landroidx/compose/material/SelectableChipColors;", "selectedIcon", "trailingIcon", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/SelectableChipColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChipKt {
    private static final float LeadingIconEndSpacing;
    private static final float SelectedOverlayOpacity = 0.16f;
    private static final float SurfaceOverlayOpacity = 0.12f;
    private static final float TrailingIconSpacing;
    private static final float HorizontalPadding = Dp.m3840constructorimpl(12);
    private static final float LeadingIconStartSpacing = Dp.m3840constructorimpl(4);
    private static final float SelectedIconContainerSize = Dp.m3840constructorimpl(24);

    /* JADX WARN: Removed duplicated region for block: B:107:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00ed  */
    @ExperimentalMaterialApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Chip(final Function0<Unit> onClick, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, Shape shape, BorderStroke borderStroke, ChipColors chipColors, Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        Shape shape2;
        int i6;
        BorderStroke borderStroke2;
        ChipColors chipColors2;
        int i7;
        MutableInteractionSource mutableInteractionSource2;
        CornerBasedShape cornerBasedShape;
        ChipColors chipColors3;
        Function2<? super Composer, ? super Integer, Unit> function22;
        Modifier modifier2;
        boolean z2;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape3;
        BorderStroke borderStroke3;
        ChipColors chipColors4;
        Composer composer2;
        final Modifier modifier3;
        final MutableInteractionSource mutableInteractionSource4;
        final Shape shape4;
        final BorderStroke borderStroke4;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final boolean z3;
        final ChipColors chipColors5;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-368396408);
        ComposerKt.sourceInformation(startRestartGroup, "C(Chip)P(7,6,3,4,8!2,5)91@4163L39,92@4237L6,94@4354L12,98@4499L21,104@4663L24,99@4525L1754:Chip.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
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
                    i3 |= startRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024;
                    if ((57344 & i) != 0) {
                        if ((i2 & 16) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i9 = 16384;
                                i3 |= i9;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i9 = 8192;
                        i3 |= i9;
                    } else {
                        shape2 = shape;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((458752 & i) == 0) {
                        borderStroke2 = borderStroke;
                        i3 |= startRestartGroup.changed(borderStroke2) ? 131072 : 65536;
                        if ((i & 3670016) == 0) {
                            chipColors2 = chipColors;
                            i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(chipColors2)) ? 1048576 : 524288;
                        } else {
                            chipColors2 = chipColors;
                        }
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 29360128) == 0) {
                            i3 |= startRestartGroup.changed(function2) ? 8388608 : 4194304;
                        }
                        if ((i2 & 256) == 0) {
                            i8 = (i & 234881024) == 0 ? startRestartGroup.changed(content) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432 : 100663296;
                            if ((191739611 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier.Companion companion = i10 == 0 ? Modifier.INSTANCE : modifier;
                                    boolean z4 = i4 == 0 ? true : z;
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
                                    if ((i2 & 16) == 0) {
                                        cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                        i3 &= -57345;
                                    } else {
                                        cornerBasedShape = shape2;
                                    }
                                    if (i6 != 0) {
                                        borderStroke2 = null;
                                    }
                                    if ((i2 & 64) == 0) {
                                        chipColors3 = ChipDefaults.INSTANCE.m956chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 1572864, 63);
                                        i3 &= -3670017;
                                    } else {
                                        chipColors3 = chipColors2;
                                    }
                                    if (i7 == 0) {
                                        modifier2 = companion;
                                        z2 = z4;
                                        mutableInteractionSource3 = mutableInteractionSource2;
                                        shape3 = cornerBasedShape;
                                        function22 = null;
                                    } else {
                                        function22 = function2;
                                        modifier2 = companion;
                                        z2 = z4;
                                        mutableInteractionSource3 = mutableInteractionSource2;
                                        shape3 = cornerBasedShape;
                                    }
                                    borderStroke3 = borderStroke2;
                                    chipColors4 = chipColors3;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i3 &= -3670017;
                                    }
                                    modifier2 = modifier;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    function22 = function2;
                                    shape3 = shape2;
                                    borderStroke3 = borderStroke2;
                                    chipColors4 = chipColors2;
                                    z2 = z;
                                }
                                startRestartGroup.endDefaults();
                                int i11 = ((i3 >> 6) & 14) | ((i3 >> 15) & 112);
                                final State<Color> contentColor = chipColors4.contentColor(z2, startRestartGroup, i11);
                                final Function2<? super Composer, ? super Integer, Unit> function24 = function22;
                                final ChipColors chipColors6 = chipColors4;
                                final boolean z5 = z2;
                                final int i12 = i3;
                                composer2 = startRestartGroup;
                                SurfaceKt.m1173SurfaceLPr_se0(onClick, modifier2, z2, shape3, chipColors4.backgroundColor(z2, startRestartGroup, i11).getValue().m1638unboximpl(), Color.m1627copywmQWz5c$default(m964Chip$lambda1(contentColor), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(startRestartGroup, 139076687, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$Chip$2
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

                                    public final void invoke(Composer composer3, int i13) {
                                        long m964Chip$lambda1;
                                        ComposerKt.sourceInformation(composer3, "C109@4831L1442:Chip.kt#jmzs0o");
                                        if ((i13 & 11) != 2 || !composer3.getSkipping()) {
                                            ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                                            m964Chip$lambda1 = ChipKt.m964Chip$lambda1(contentColor);
                                            ProvidedValue[] providedValueArr = {localContentAlpha.provides(Float.valueOf(Color.m1630getAlphaimpl(m964Chip$lambda1)))};
                                            final Function2<Composer, Integer, Unit> function25 = function24;
                                            final ChipColors chipColors7 = chipColors6;
                                            final boolean z6 = z5;
                                            final int i14 = i12;
                                            final Function3<RowScope, Composer, Integer, Unit> function3 = content;
                                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 667535631, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$Chip$2.1
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

                                                public final void invoke(Composer composer4, int i15) {
                                                    ComposerKt.sourceInformation(composer4, "C111@4973L10,110@4917L1346:Chip.kt#jmzs0o");
                                                    if ((i15 & 11) != 2 || !composer4.getSkipping()) {
                                                        TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer4, 6).getBody2();
                                                        final Function2<Composer, Integer, Unit> function26 = function25;
                                                        final ChipColors chipColors8 = chipColors7;
                                                        final boolean z7 = z6;
                                                        final int i16 = i14;
                                                        final Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                                        TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer4, -1131213696, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.Chip.2.1.1
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

                                                            public final void invoke(Composer composer5, int i17) {
                                                                float m3840constructorimpl;
                                                                float f;
                                                                float f2;
                                                                float f3;
                                                                ComposerKt.sourceInformation(composer5, "C113@5022L1227:Chip.kt#jmzs0o");
                                                                if ((i17 & 11) != 2 || !composer5.getSkipping()) {
                                                                    Modifier m446defaultMinSizeVpY3zN4$default = SizeKt.m446defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, ChipDefaults.INSTANCE.m959getMinHeightD9Ej5fM(), 1, null);
                                                                    if (function26 == null) {
                                                                        m3840constructorimpl = ChipKt.HorizontalPadding;
                                                                    } else {
                                                                        m3840constructorimpl = Dp.m3840constructorimpl(0);
                                                                    }
                                                                    f = ChipKt.HorizontalPadding;
                                                                    Modifier m424paddingqDBjuR0$default = PaddingKt.m424paddingqDBjuR0$default(m446defaultMinSizeVpY3zN4$default, m3840constructorimpl, 0.0f, f, 0.0f, 10, null);
                                                                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                                    Function2<Composer, Integer, Unit> function27 = function26;
                                                                    ChipColors chipColors9 = chipColors8;
                                                                    boolean z8 = z7;
                                                                    int i18 = i16;
                                                                    Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                                                    composer5.startReplaceableGroup(693286680);
                                                                    ComposerKt.sourceInformation(composer5, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer5, 54);
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
                                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m424paddingqDBjuR0$default);
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
                                                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                                    composer5.startReplaceableGroup(951468004);
                                                                    ComposerKt.sourceInformation(composer5, "C137@6222L9:Chip.kt#jmzs0o");
                                                                    composer5.startReplaceableGroup(2084788874);
                                                                    ComposerKt.sourceInformation(composer5, "128@5675L47,129@5785L32,130@5842L267,135@6134L45");
                                                                    if (function27 != null) {
                                                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                                                        f2 = ChipKt.LeadingIconStartSpacing;
                                                                        SpacerKt.Spacer(SizeKt.m466width3ABfNKs(companion2, f2), composer5, 6);
                                                                        State<Color> leadingIconContentColor = chipColors9.leadingIconContentColor(z8, composer5, ((i18 >> 6) & 14) | ((i18 >> 15) & 112));
                                                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(m966invoke$lambda1$lambda0(leadingIconContentColor))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1630getAlphaimpl(m966invoke$lambda1$lambda0(leadingIconContentColor))))}, function27, composer5, ((i18 >> 18) & 112) | 8);
                                                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                                                        f3 = ChipKt.LeadingIconEndSpacing;
                                                                        SpacerKt.Spacer(SizeKt.m466width3ABfNKs(companion3, f3), composer5, 6);
                                                                    }
                                                                    composer5.endReplaceableGroup();
                                                                    function33.invoke(rowScopeInstance, composer5, Integer.valueOf(((i18 >> 21) & 112) | 6));
                                                                    composer5.endReplaceableGroup();
                                                                    composer5.endReplaceableGroup();
                                                                    composer5.endReplaceableGroup();
                                                                    composer5.endNode();
                                                                    composer5.endReplaceableGroup();
                                                                    composer5.endReplaceableGroup();
                                                                    return;
                                                                }
                                                                composer5.skipToGroupEnd();
                                                            }

                                                            /* renamed from: invoke$lambda-1$lambda-0, reason: not valid java name */
                                                            private static final long m966invoke$lambda1$lambda0(State<Color> state) {
                                                                return state.getValue().m1638unboximpl();
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
                                }), composer2, (i3 & 14) | C.ENCODING_PCM_32BIT | (i3 & 112) | (i3 & 896) | ((i3 >> 3) & 7168) | ((i3 << 3) & 3670016) | ((i3 << 15) & 234881024), 128);
                                modifier3 = modifier2;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                shape4 = shape3;
                                borderStroke4 = borderStroke3;
                                function23 = function22;
                                z3 = z2;
                                chipColors5 = chipColors4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier;
                                z3 = z;
                                mutableInteractionSource4 = mutableInteractionSource;
                                function23 = function2;
                                shape4 = shape2;
                                borderStroke4 = borderStroke2;
                                chipColors5 = chipColors2;
                                composer2 = startRestartGroup;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$Chip$3
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

                                public final void invoke(Composer composer3, int i13) {
                                    ChipKt.Chip(onClick, modifier3, z3, mutableInteractionSource4, shape4, borderStroke4, chipColors5, function23, content, composer3, i | 1, i2);
                                }
                            });
                            return;
                        }
                        i3 |= i8;
                        if ((191739611 & i3) == 38347922) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if ((i2 & 16) == 0) {
                        }
                        if (i6 != 0) {
                        }
                        if ((i2 & 64) == 0) {
                        }
                        if (i7 == 0) {
                        }
                        borderStroke3 = borderStroke2;
                        chipColors4 = chipColors3;
                        startRestartGroup.endDefaults();
                        int i112 = ((i3 >> 6) & 14) | ((i3 >> 15) & 112);
                        final State<Color> contentColor2 = chipColors4.contentColor(z2, startRestartGroup, i112);
                        final Function2<? super Composer, ? super Integer, Unit> function242 = function22;
                        final ChipColors chipColors62 = chipColors4;
                        final boolean z52 = z2;
                        final int i122 = i3;
                        composer2 = startRestartGroup;
                        SurfaceKt.m1173SurfaceLPr_se0(onClick, modifier2, z2, shape3, chipColors4.backgroundColor(z2, startRestartGroup, i112).getValue().m1638unboximpl(), Color.m1627copywmQWz5c$default(m964Chip$lambda1(contentColor2), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(startRestartGroup, 139076687, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$Chip$2
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

                            public final void invoke(Composer composer3, int i13) {
                                long m964Chip$lambda1;
                                ComposerKt.sourceInformation(composer3, "C109@4831L1442:Chip.kt#jmzs0o");
                                if ((i13 & 11) != 2 || !composer3.getSkipping()) {
                                    ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                                    m964Chip$lambda1 = ChipKt.m964Chip$lambda1(contentColor2);
                                    ProvidedValue[] providedValueArr = {localContentAlpha.provides(Float.valueOf(Color.m1630getAlphaimpl(m964Chip$lambda1)))};
                                    final Function2<? super Composer, ? super Integer, Unit> function25 = function242;
                                    final ChipColors chipColors7 = chipColors62;
                                    final boolean z6 = z52;
                                    final int i14 = i122;
                                    final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3 = content;
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 667535631, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$Chip$2.1
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

                                        public final void invoke(Composer composer4, int i15) {
                                            ComposerKt.sourceInformation(composer4, "C111@4973L10,110@4917L1346:Chip.kt#jmzs0o");
                                            if ((i15 & 11) != 2 || !composer4.getSkipping()) {
                                                TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer4, 6).getBody2();
                                                final Function2<? super Composer, ? super Integer, Unit> function26 = function25;
                                                final ChipColors chipColors8 = chipColors7;
                                                final boolean z7 = z6;
                                                final int i16 = i14;
                                                final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32 = function3;
                                                TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer4, -1131213696, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.Chip.2.1.1
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

                                                    public final void invoke(Composer composer5, int i17) {
                                                        float m3840constructorimpl;
                                                        float f;
                                                        float f2;
                                                        float f3;
                                                        ComposerKt.sourceInformation(composer5, "C113@5022L1227:Chip.kt#jmzs0o");
                                                        if ((i17 & 11) != 2 || !composer5.getSkipping()) {
                                                            Modifier m446defaultMinSizeVpY3zN4$default = SizeKt.m446defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, ChipDefaults.INSTANCE.m959getMinHeightD9Ej5fM(), 1, null);
                                                            if (function26 == null) {
                                                                m3840constructorimpl = ChipKt.HorizontalPadding;
                                                            } else {
                                                                m3840constructorimpl = Dp.m3840constructorimpl(0);
                                                            }
                                                            f = ChipKt.HorizontalPadding;
                                                            Modifier m424paddingqDBjuR0$default = PaddingKt.m424paddingqDBjuR0$default(m446defaultMinSizeVpY3zN4$default, m3840constructorimpl, 0.0f, f, 0.0f, 10, null);
                                                            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                            Function2<Composer, Integer, Unit> function27 = function26;
                                                            ChipColors chipColors9 = chipColors8;
                                                            boolean z8 = z7;
                                                            int i18 = i16;
                                                            Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                                            composer5.startReplaceableGroup(693286680);
                                                            ComposerKt.sourceInformation(composer5, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer5, 54);
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
                                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m424paddingqDBjuR0$default);
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
                                                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                            composer5.startReplaceableGroup(951468004);
                                                            ComposerKt.sourceInformation(composer5, "C137@6222L9:Chip.kt#jmzs0o");
                                                            composer5.startReplaceableGroup(2084788874);
                                                            ComposerKt.sourceInformation(composer5, "128@5675L47,129@5785L32,130@5842L267,135@6134L45");
                                                            if (function27 != null) {
                                                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                                                f2 = ChipKt.LeadingIconStartSpacing;
                                                                SpacerKt.Spacer(SizeKt.m466width3ABfNKs(companion2, f2), composer5, 6);
                                                                State<Color> leadingIconContentColor = chipColors9.leadingIconContentColor(z8, composer5, ((i18 >> 6) & 14) | ((i18 >> 15) & 112));
                                                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(m966invoke$lambda1$lambda0(leadingIconContentColor))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1630getAlphaimpl(m966invoke$lambda1$lambda0(leadingIconContentColor))))}, function27, composer5, ((i18 >> 18) & 112) | 8);
                                                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                                                f3 = ChipKt.LeadingIconEndSpacing;
                                                                SpacerKt.Spacer(SizeKt.m466width3ABfNKs(companion3, f3), composer5, 6);
                                                            }
                                                            composer5.endReplaceableGroup();
                                                            function33.invoke(rowScopeInstance, composer5, Integer.valueOf(((i18 >> 21) & 112) | 6));
                                                            composer5.endReplaceableGroup();
                                                            composer5.endReplaceableGroup();
                                                            composer5.endReplaceableGroup();
                                                            composer5.endNode();
                                                            composer5.endReplaceableGroup();
                                                            composer5.endReplaceableGroup();
                                                            return;
                                                        }
                                                        composer5.skipToGroupEnd();
                                                    }

                                                    /* renamed from: invoke$lambda-1$lambda-0, reason: not valid java name */
                                                    private static final long m966invoke$lambda1$lambda0(State<Color> state) {
                                                        return state.getValue().m1638unboximpl();
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
                        }), composer2, (i3 & 14) | C.ENCODING_PCM_32BIT | (i3 & 112) | (i3 & 896) | ((i3 >> 3) & 7168) | ((i3 << 3) & 3670016) | ((i3 << 15) & 234881024), 128);
                        modifier3 = modifier2;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        function23 = function22;
                        z3 = z2;
                        chipColors5 = chipColors4;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    borderStroke2 = borderStroke;
                    if ((i & 3670016) == 0) {
                    }
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    if ((i2 & 256) == 0) {
                    }
                    i3 |= i8;
                    if ((191739611 & i3) == 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if ((i2 & 16) == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i2 & 64) == 0) {
                    }
                    if (i7 == 0) {
                    }
                    borderStroke3 = borderStroke2;
                    chipColors4 = chipColors3;
                    startRestartGroup.endDefaults();
                    int i1122 = ((i3 >> 6) & 14) | ((i3 >> 15) & 112);
                    final State<Color> contentColor22 = chipColors4.contentColor(z2, startRestartGroup, i1122);
                    final Function2<? super Composer, ? super Integer, Unit> function2422 = function22;
                    final ChipColors chipColors622 = chipColors4;
                    final boolean z522 = z2;
                    final int i1222 = i3;
                    composer2 = startRestartGroup;
                    SurfaceKt.m1173SurfaceLPr_se0(onClick, modifier2, z2, shape3, chipColors4.backgroundColor(z2, startRestartGroup, i1122).getValue().m1638unboximpl(), Color.m1627copywmQWz5c$default(m964Chip$lambda1(contentColor22), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(startRestartGroup, 139076687, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$Chip$2
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

                        public final void invoke(Composer composer3, int i13) {
                            long m964Chip$lambda1;
                            ComposerKt.sourceInformation(composer3, "C109@4831L1442:Chip.kt#jmzs0o");
                            if ((i13 & 11) != 2 || !composer3.getSkipping()) {
                                ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                                m964Chip$lambda1 = ChipKt.m964Chip$lambda1(contentColor22);
                                ProvidedValue[] providedValueArr = {localContentAlpha.provides(Float.valueOf(Color.m1630getAlphaimpl(m964Chip$lambda1)))};
                                final Function2<? super Composer, ? super Integer, Unit> function25 = function2422;
                                final ChipColors chipColors7 = chipColors622;
                                final boolean z6 = z522;
                                final int i14 = i1222;
                                final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3 = content;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 667535631, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$Chip$2.1
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

                                    public final void invoke(Composer composer4, int i15) {
                                        ComposerKt.sourceInformation(composer4, "C111@4973L10,110@4917L1346:Chip.kt#jmzs0o");
                                        if ((i15 & 11) != 2 || !composer4.getSkipping()) {
                                            TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer4, 6).getBody2();
                                            final Function2<? super Composer, ? super Integer, Unit> function26 = function25;
                                            final ChipColors chipColors8 = chipColors7;
                                            final boolean z7 = z6;
                                            final int i16 = i14;
                                            final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32 = function3;
                                            TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer4, -1131213696, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.Chip.2.1.1
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

                                                public final void invoke(Composer composer5, int i17) {
                                                    float m3840constructorimpl;
                                                    float f;
                                                    float f2;
                                                    float f3;
                                                    ComposerKt.sourceInformation(composer5, "C113@5022L1227:Chip.kt#jmzs0o");
                                                    if ((i17 & 11) != 2 || !composer5.getSkipping()) {
                                                        Modifier m446defaultMinSizeVpY3zN4$default = SizeKt.m446defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, ChipDefaults.INSTANCE.m959getMinHeightD9Ej5fM(), 1, null);
                                                        if (function26 == null) {
                                                            m3840constructorimpl = ChipKt.HorizontalPadding;
                                                        } else {
                                                            m3840constructorimpl = Dp.m3840constructorimpl(0);
                                                        }
                                                        f = ChipKt.HorizontalPadding;
                                                        Modifier m424paddingqDBjuR0$default = PaddingKt.m424paddingqDBjuR0$default(m446defaultMinSizeVpY3zN4$default, m3840constructorimpl, 0.0f, f, 0.0f, 10, null);
                                                        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                        Function2<Composer, Integer, Unit> function27 = function26;
                                                        ChipColors chipColors9 = chipColors8;
                                                        boolean z8 = z7;
                                                        int i18 = i16;
                                                        Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                                        composer5.startReplaceableGroup(693286680);
                                                        ComposerKt.sourceInformation(composer5, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer5, 54);
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
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m424paddingqDBjuR0$default);
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
                                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                        composer5.startReplaceableGroup(951468004);
                                                        ComposerKt.sourceInformation(composer5, "C137@6222L9:Chip.kt#jmzs0o");
                                                        composer5.startReplaceableGroup(2084788874);
                                                        ComposerKt.sourceInformation(composer5, "128@5675L47,129@5785L32,130@5842L267,135@6134L45");
                                                        if (function27 != null) {
                                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                                            f2 = ChipKt.LeadingIconStartSpacing;
                                                            SpacerKt.Spacer(SizeKt.m466width3ABfNKs(companion2, f2), composer5, 6);
                                                            State<Color> leadingIconContentColor = chipColors9.leadingIconContentColor(z8, composer5, ((i18 >> 6) & 14) | ((i18 >> 15) & 112));
                                                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(m966invoke$lambda1$lambda0(leadingIconContentColor))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1630getAlphaimpl(m966invoke$lambda1$lambda0(leadingIconContentColor))))}, function27, composer5, ((i18 >> 18) & 112) | 8);
                                                            Modifier.Companion companion3 = Modifier.INSTANCE;
                                                            f3 = ChipKt.LeadingIconEndSpacing;
                                                            SpacerKt.Spacer(SizeKt.m466width3ABfNKs(companion3, f3), composer5, 6);
                                                        }
                                                        composer5.endReplaceableGroup();
                                                        function33.invoke(rowScopeInstance, composer5, Integer.valueOf(((i18 >> 21) & 112) | 6));
                                                        composer5.endReplaceableGroup();
                                                        composer5.endReplaceableGroup();
                                                        composer5.endReplaceableGroup();
                                                        composer5.endNode();
                                                        composer5.endReplaceableGroup();
                                                        composer5.endReplaceableGroup();
                                                        return;
                                                    }
                                                    composer5.skipToGroupEnd();
                                                }

                                                /* renamed from: invoke$lambda-1$lambda-0, reason: not valid java name */
                                                private static final long m966invoke$lambda1$lambda0(State<Color> state) {
                                                    return state.getValue().m1638unboximpl();
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
                    }), composer2, (i3 & 14) | C.ENCODING_PCM_32BIT | (i3 & 112) | (i3 & 896) | ((i3 >> 3) & 7168) | ((i3 << 3) & 3670016) | ((i3 << 15) & 234881024), 128);
                    modifier3 = modifier2;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    function23 = function22;
                    z3 = z2;
                    chipColors5 = chipColors4;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                if ((57344 & i) != 0) {
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                borderStroke2 = borderStroke;
                if ((i & 3670016) == 0) {
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                if ((i2 & 256) == 0) {
                }
                i3 |= i8;
                if ((191739611 & i3) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if (i6 != 0) {
                }
                if ((i2 & 64) == 0) {
                }
                if (i7 == 0) {
                }
                borderStroke3 = borderStroke2;
                chipColors4 = chipColors3;
                startRestartGroup.endDefaults();
                int i11222 = ((i3 >> 6) & 14) | ((i3 >> 15) & 112);
                final State<Color> contentColor222 = chipColors4.contentColor(z2, startRestartGroup, i11222);
                final Function2<? super Composer, ? super Integer, Unit> function24222 = function22;
                final ChipColors chipColors6222 = chipColors4;
                final boolean z5222 = z2;
                final int i12222 = i3;
                composer2 = startRestartGroup;
                SurfaceKt.m1173SurfaceLPr_se0(onClick, modifier2, z2, shape3, chipColors4.backgroundColor(z2, startRestartGroup, i11222).getValue().m1638unboximpl(), Color.m1627copywmQWz5c$default(m964Chip$lambda1(contentColor222), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(startRestartGroup, 139076687, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$Chip$2
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

                    public final void invoke(Composer composer3, int i13) {
                        long m964Chip$lambda1;
                        ComposerKt.sourceInformation(composer3, "C109@4831L1442:Chip.kt#jmzs0o");
                        if ((i13 & 11) != 2 || !composer3.getSkipping()) {
                            ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                            m964Chip$lambda1 = ChipKt.m964Chip$lambda1(contentColor222);
                            ProvidedValue[] providedValueArr = {localContentAlpha.provides(Float.valueOf(Color.m1630getAlphaimpl(m964Chip$lambda1)))};
                            final Function2<? super Composer, ? super Integer, Unit> function25 = function24222;
                            final ChipColors chipColors7 = chipColors6222;
                            final boolean z6 = z5222;
                            final int i14 = i12222;
                            final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3 = content;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 667535631, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$Chip$2.1
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

                                public final void invoke(Composer composer4, int i15) {
                                    ComposerKt.sourceInformation(composer4, "C111@4973L10,110@4917L1346:Chip.kt#jmzs0o");
                                    if ((i15 & 11) != 2 || !composer4.getSkipping()) {
                                        TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer4, 6).getBody2();
                                        final Function2<? super Composer, ? super Integer, Unit> function26 = function25;
                                        final ChipColors chipColors8 = chipColors7;
                                        final boolean z7 = z6;
                                        final int i16 = i14;
                                        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32 = function3;
                                        TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer4, -1131213696, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.Chip.2.1.1
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

                                            public final void invoke(Composer composer5, int i17) {
                                                float m3840constructorimpl;
                                                float f;
                                                float f2;
                                                float f3;
                                                ComposerKt.sourceInformation(composer5, "C113@5022L1227:Chip.kt#jmzs0o");
                                                if ((i17 & 11) != 2 || !composer5.getSkipping()) {
                                                    Modifier m446defaultMinSizeVpY3zN4$default = SizeKt.m446defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, ChipDefaults.INSTANCE.m959getMinHeightD9Ej5fM(), 1, null);
                                                    if (function26 == null) {
                                                        m3840constructorimpl = ChipKt.HorizontalPadding;
                                                    } else {
                                                        m3840constructorimpl = Dp.m3840constructorimpl(0);
                                                    }
                                                    f = ChipKt.HorizontalPadding;
                                                    Modifier m424paddingqDBjuR0$default = PaddingKt.m424paddingqDBjuR0$default(m446defaultMinSizeVpY3zN4$default, m3840constructorimpl, 0.0f, f, 0.0f, 10, null);
                                                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                    Function2<Composer, Integer, Unit> function27 = function26;
                                                    ChipColors chipColors9 = chipColors8;
                                                    boolean z8 = z7;
                                                    int i18 = i16;
                                                    Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                                    composer5.startReplaceableGroup(693286680);
                                                    ComposerKt.sourceInformation(composer5, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer5, 54);
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
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m424paddingqDBjuR0$default);
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
                                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                    composer5.startReplaceableGroup(951468004);
                                                    ComposerKt.sourceInformation(composer5, "C137@6222L9:Chip.kt#jmzs0o");
                                                    composer5.startReplaceableGroup(2084788874);
                                                    ComposerKt.sourceInformation(composer5, "128@5675L47,129@5785L32,130@5842L267,135@6134L45");
                                                    if (function27 != null) {
                                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                                        f2 = ChipKt.LeadingIconStartSpacing;
                                                        SpacerKt.Spacer(SizeKt.m466width3ABfNKs(companion2, f2), composer5, 6);
                                                        State<Color> leadingIconContentColor = chipColors9.leadingIconContentColor(z8, composer5, ((i18 >> 6) & 14) | ((i18 >> 15) & 112));
                                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(m966invoke$lambda1$lambda0(leadingIconContentColor))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1630getAlphaimpl(m966invoke$lambda1$lambda0(leadingIconContentColor))))}, function27, composer5, ((i18 >> 18) & 112) | 8);
                                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                                        f3 = ChipKt.LeadingIconEndSpacing;
                                                        SpacerKt.Spacer(SizeKt.m466width3ABfNKs(companion3, f3), composer5, 6);
                                                    }
                                                    composer5.endReplaceableGroup();
                                                    function33.invoke(rowScopeInstance, composer5, Integer.valueOf(((i18 >> 21) & 112) | 6));
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endNode();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    return;
                                                }
                                                composer5.skipToGroupEnd();
                                            }

                                            /* renamed from: invoke$lambda-1$lambda-0, reason: not valid java name */
                                            private static final long m966invoke$lambda1$lambda0(State<Color> state) {
                                                return state.getValue().m1638unboximpl();
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
                }), composer2, (i3 & 14) | C.ENCODING_PCM_32BIT | (i3 & 112) | (i3 & 896) | ((i3 >> 3) & 7168) | ((i3 << 3) & 3670016) | ((i3 << 15) & 234881024), 128);
                modifier3 = modifier2;
                mutableInteractionSource4 = mutableInteractionSource3;
                shape4 = shape3;
                borderStroke4 = borderStroke3;
                function23 = function22;
                z3 = z2;
                chipColors5 = chipColors4;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            if ((57344 & i) != 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            borderStroke2 = borderStroke;
            if ((i & 3670016) == 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if ((i2 & 256) == 0) {
            }
            i3 |= i8;
            if ((191739611 & i3) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if (i7 == 0) {
            }
            borderStroke3 = borderStroke2;
            chipColors4 = chipColors3;
            startRestartGroup.endDefaults();
            int i112222 = ((i3 >> 6) & 14) | ((i3 >> 15) & 112);
            final State<Color> contentColor2222 = chipColors4.contentColor(z2, startRestartGroup, i112222);
            final Function2<? super Composer, ? super Integer, Unit> function242222 = function22;
            final ChipColors chipColors62222 = chipColors4;
            final boolean z52222 = z2;
            final int i122222 = i3;
            composer2 = startRestartGroup;
            SurfaceKt.m1173SurfaceLPr_se0(onClick, modifier2, z2, shape3, chipColors4.backgroundColor(z2, startRestartGroup, i112222).getValue().m1638unboximpl(), Color.m1627copywmQWz5c$default(m964Chip$lambda1(contentColor2222), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(startRestartGroup, 139076687, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$Chip$2
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

                public final void invoke(Composer composer3, int i13) {
                    long m964Chip$lambda1;
                    ComposerKt.sourceInformation(composer3, "C109@4831L1442:Chip.kt#jmzs0o");
                    if ((i13 & 11) != 2 || !composer3.getSkipping()) {
                        ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                        m964Chip$lambda1 = ChipKt.m964Chip$lambda1(contentColor2222);
                        ProvidedValue[] providedValueArr = {localContentAlpha.provides(Float.valueOf(Color.m1630getAlphaimpl(m964Chip$lambda1)))};
                        final Function2<? super Composer, ? super Integer, Unit> function25 = function242222;
                        final ChipColors chipColors7 = chipColors62222;
                        final boolean z6 = z52222;
                        final int i14 = i122222;
                        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3 = content;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 667535631, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$Chip$2.1
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

                            public final void invoke(Composer composer4, int i15) {
                                ComposerKt.sourceInformation(composer4, "C111@4973L10,110@4917L1346:Chip.kt#jmzs0o");
                                if ((i15 & 11) != 2 || !composer4.getSkipping()) {
                                    TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer4, 6).getBody2();
                                    final Function2<? super Composer, ? super Integer, Unit> function26 = function25;
                                    final ChipColors chipColors8 = chipColors7;
                                    final boolean z7 = z6;
                                    final int i16 = i14;
                                    final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32 = function3;
                                    TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer4, -1131213696, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.Chip.2.1.1
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

                                        public final void invoke(Composer composer5, int i17) {
                                            float m3840constructorimpl;
                                            float f;
                                            float f2;
                                            float f3;
                                            ComposerKt.sourceInformation(composer5, "C113@5022L1227:Chip.kt#jmzs0o");
                                            if ((i17 & 11) != 2 || !composer5.getSkipping()) {
                                                Modifier m446defaultMinSizeVpY3zN4$default = SizeKt.m446defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, ChipDefaults.INSTANCE.m959getMinHeightD9Ej5fM(), 1, null);
                                                if (function26 == null) {
                                                    m3840constructorimpl = ChipKt.HorizontalPadding;
                                                } else {
                                                    m3840constructorimpl = Dp.m3840constructorimpl(0);
                                                }
                                                f = ChipKt.HorizontalPadding;
                                                Modifier m424paddingqDBjuR0$default = PaddingKt.m424paddingqDBjuR0$default(m446defaultMinSizeVpY3zN4$default, m3840constructorimpl, 0.0f, f, 0.0f, 10, null);
                                                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                Function2<Composer, Integer, Unit> function27 = function26;
                                                ChipColors chipColors9 = chipColors8;
                                                boolean z8 = z7;
                                                int i18 = i16;
                                                Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                                composer5.startReplaceableGroup(693286680);
                                                ComposerKt.sourceInformation(composer5, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer5, 54);
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
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m424paddingqDBjuR0$default);
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
                                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                composer5.startReplaceableGroup(951468004);
                                                ComposerKt.sourceInformation(composer5, "C137@6222L9:Chip.kt#jmzs0o");
                                                composer5.startReplaceableGroup(2084788874);
                                                ComposerKt.sourceInformation(composer5, "128@5675L47,129@5785L32,130@5842L267,135@6134L45");
                                                if (function27 != null) {
                                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                                    f2 = ChipKt.LeadingIconStartSpacing;
                                                    SpacerKt.Spacer(SizeKt.m466width3ABfNKs(companion2, f2), composer5, 6);
                                                    State<Color> leadingIconContentColor = chipColors9.leadingIconContentColor(z8, composer5, ((i18 >> 6) & 14) | ((i18 >> 15) & 112));
                                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(m966invoke$lambda1$lambda0(leadingIconContentColor))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1630getAlphaimpl(m966invoke$lambda1$lambda0(leadingIconContentColor))))}, function27, composer5, ((i18 >> 18) & 112) | 8);
                                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                                    f3 = ChipKt.LeadingIconEndSpacing;
                                                    SpacerKt.Spacer(SizeKt.m466width3ABfNKs(companion3, f3), composer5, 6);
                                                }
                                                composer5.endReplaceableGroup();
                                                function33.invoke(rowScopeInstance, composer5, Integer.valueOf(((i18 >> 21) & 112) | 6));
                                                composer5.endReplaceableGroup();
                                                composer5.endReplaceableGroup();
                                                composer5.endReplaceableGroup();
                                                composer5.endNode();
                                                composer5.endReplaceableGroup();
                                                composer5.endReplaceableGroup();
                                                return;
                                            }
                                            composer5.skipToGroupEnd();
                                        }

                                        /* renamed from: invoke$lambda-1$lambda-0, reason: not valid java name */
                                        private static final long m966invoke$lambda1$lambda0(State<Color> state) {
                                            return state.getValue().m1638unboximpl();
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
            }), composer2, (i3 & 14) | C.ENCODING_PCM_32BIT | (i3 & 112) | (i3 & 896) | ((i3 >> 3) & 7168) | ((i3 << 3) & 3670016) | ((i3 << 15) & 234881024), 128);
            modifier3 = modifier2;
            mutableInteractionSource4 = mutableInteractionSource3;
            shape4 = shape3;
            borderStroke4 = borderStroke3;
            function23 = function22;
            z3 = z2;
            chipColors5 = chipColors4;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        if ((57344 & i) != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        borderStroke2 = borderStroke;
        if ((i & 3670016) == 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if ((i2 & 256) == 0) {
        }
        i3 |= i8;
        if ((191739611 & i3) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if (i7 == 0) {
        }
        borderStroke3 = borderStroke2;
        chipColors4 = chipColors3;
        startRestartGroup.endDefaults();
        int i1122222 = ((i3 >> 6) & 14) | ((i3 >> 15) & 112);
        final State<Color> contentColor22222 = chipColors4.contentColor(z2, startRestartGroup, i1122222);
        final Function2<? super Composer, ? super Integer, Unit> function2422222 = function22;
        final ChipColors chipColors622222 = chipColors4;
        final boolean z522222 = z2;
        final int i1222222 = i3;
        composer2 = startRestartGroup;
        SurfaceKt.m1173SurfaceLPr_se0(onClick, modifier2, z2, shape3, chipColors4.backgroundColor(z2, startRestartGroup, i1122222).getValue().m1638unboximpl(), Color.m1627copywmQWz5c$default(m964Chip$lambda1(contentColor22222), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(startRestartGroup, 139076687, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$Chip$2
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

            public final void invoke(Composer composer3, int i13) {
                long m964Chip$lambda1;
                ComposerKt.sourceInformation(composer3, "C109@4831L1442:Chip.kt#jmzs0o");
                if ((i13 & 11) != 2 || !composer3.getSkipping()) {
                    ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                    m964Chip$lambda1 = ChipKt.m964Chip$lambda1(contentColor22222);
                    ProvidedValue[] providedValueArr = {localContentAlpha.provides(Float.valueOf(Color.m1630getAlphaimpl(m964Chip$lambda1)))};
                    final Function2<? super Composer, ? super Integer, Unit> function25 = function2422222;
                    final ChipColors chipColors7 = chipColors622222;
                    final boolean z6 = z522222;
                    final int i14 = i1222222;
                    final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3 = content;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 667535631, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$Chip$2.1
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

                        public final void invoke(Composer composer4, int i15) {
                            ComposerKt.sourceInformation(composer4, "C111@4973L10,110@4917L1346:Chip.kt#jmzs0o");
                            if ((i15 & 11) != 2 || !composer4.getSkipping()) {
                                TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer4, 6).getBody2();
                                final Function2<? super Composer, ? super Integer, Unit> function26 = function25;
                                final ChipColors chipColors8 = chipColors7;
                                final boolean z7 = z6;
                                final int i16 = i14;
                                final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32 = function3;
                                TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer4, -1131213696, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.Chip.2.1.1
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

                                    public final void invoke(Composer composer5, int i17) {
                                        float m3840constructorimpl;
                                        float f;
                                        float f2;
                                        float f3;
                                        ComposerKt.sourceInformation(composer5, "C113@5022L1227:Chip.kt#jmzs0o");
                                        if ((i17 & 11) != 2 || !composer5.getSkipping()) {
                                            Modifier m446defaultMinSizeVpY3zN4$default = SizeKt.m446defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, ChipDefaults.INSTANCE.m959getMinHeightD9Ej5fM(), 1, null);
                                            if (function26 == null) {
                                                m3840constructorimpl = ChipKt.HorizontalPadding;
                                            } else {
                                                m3840constructorimpl = Dp.m3840constructorimpl(0);
                                            }
                                            f = ChipKt.HorizontalPadding;
                                            Modifier m424paddingqDBjuR0$default = PaddingKt.m424paddingqDBjuR0$default(m446defaultMinSizeVpY3zN4$default, m3840constructorimpl, 0.0f, f, 0.0f, 10, null);
                                            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                            Function2<Composer, Integer, Unit> function27 = function26;
                                            ChipColors chipColors9 = chipColors8;
                                            boolean z8 = z7;
                                            int i18 = i16;
                                            Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                            composer5.startReplaceableGroup(693286680);
                                            ComposerKt.sourceInformation(composer5, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer5, 54);
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
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m424paddingqDBjuR0$default);
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
                                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                            composer5.startReplaceableGroup(951468004);
                                            ComposerKt.sourceInformation(composer5, "C137@6222L9:Chip.kt#jmzs0o");
                                            composer5.startReplaceableGroup(2084788874);
                                            ComposerKt.sourceInformation(composer5, "128@5675L47,129@5785L32,130@5842L267,135@6134L45");
                                            if (function27 != null) {
                                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                                f2 = ChipKt.LeadingIconStartSpacing;
                                                SpacerKt.Spacer(SizeKt.m466width3ABfNKs(companion2, f2), composer5, 6);
                                                State<Color> leadingIconContentColor = chipColors9.leadingIconContentColor(z8, composer5, ((i18 >> 6) & 14) | ((i18 >> 15) & 112));
                                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(m966invoke$lambda1$lambda0(leadingIconContentColor))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1630getAlphaimpl(m966invoke$lambda1$lambda0(leadingIconContentColor))))}, function27, composer5, ((i18 >> 18) & 112) | 8);
                                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                                f3 = ChipKt.LeadingIconEndSpacing;
                                                SpacerKt.Spacer(SizeKt.m466width3ABfNKs(companion3, f3), composer5, 6);
                                            }
                                            composer5.endReplaceableGroup();
                                            function33.invoke(rowScopeInstance, composer5, Integer.valueOf(((i18 >> 21) & 112) | 6));
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            composer5.endNode();
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            return;
                                        }
                                        composer5.skipToGroupEnd();
                                    }

                                    /* renamed from: invoke$lambda-1$lambda-0, reason: not valid java name */
                                    private static final long m966invoke$lambda1$lambda0(State<Color> state) {
                                        return state.getValue().m1638unboximpl();
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
        }), composer2, (i3 & 14) | C.ENCODING_PCM_32BIT | (i3 & 112) | (i3 & 896) | ((i3 >> 3) & 7168) | ((i3 << 3) & 3670016) | ((i3 << 15) & 234881024), 128);
        modifier3 = modifier2;
        mutableInteractionSource4 = mutableInteractionSource3;
        shape4 = shape3;
        borderStroke4 = borderStroke3;
        function23 = function22;
        z3 = z2;
        chipColors5 = chipColors4;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0283  */
    @ExperimentalMaterialApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilterChip(final boolean z, final Function0<Unit> onClick, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, Shape shape, BorderStroke borderStroke, SelectableChipColors selectableChipColors, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        MutableInteractionSource mutableInteractionSource2;
        CornerBasedShape cornerBasedShape;
        SelectableChipColors selectableChipColors2;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i14;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Function2<? super Composer, ? super Integer, Unit> function26;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape2;
        boolean z4;
        BorderStroke borderStroke2;
        Modifier modifier2;
        final SelectableChipColors selectableChipColors3;
        Composer composer2;
        final MutableInteractionSource mutableInteractionSource4;
        final Shape shape3;
        final BorderStroke borderStroke3;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final boolean z5;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int i15;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1259208246);
        ComposerKt.sourceInformation(startRestartGroup, "C(FilterChip)P(8,7,6,3,4,10!2,5,9,11)188@8670L39,189@8744L6,191@8871L18,198@9202L31,204@9413L34,199@9238L4010:Chip.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changed(onClick) ? 32 : 16;
        }
        int i16 = i3 & 4;
        if (i16 != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 7168) == 0) {
                z3 = z2;
                i4 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 57344) == 0) {
                    i4 |= startRestartGroup.changed(mutableInteractionSource) ? 16384 : 8192;
                }
                if ((i & 458752) == 0) {
                    i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(shape)) ? 131072 : 65536;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    i4 |= startRestartGroup.changed(borderStroke) ? 1048576 : 524288;
                }
                if ((i & 29360128) == 0) {
                    if ((i3 & 128) == 0 && startRestartGroup.changed(selectableChipColors)) {
                        i15 = 8388608;
                        i4 |= i15;
                    }
                    i15 = 4194304;
                    i4 |= i15;
                }
                i8 = i3 & 256;
                if (i8 != 0) {
                    i4 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    i4 |= startRestartGroup.changed(function2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i9 = i3 & 512;
                if (i9 != 0) {
                    i4 |= C.ENCODING_PCM_32BIT;
                } else if ((i & 1879048192) == 0) {
                    i4 |= startRestartGroup.changed(function22) ? 536870912 : 268435456;
                }
                i10 = i3 & 1024;
                if (i10 != 0) {
                    i11 = i2 | 6;
                } else if ((i2 & 14) == 0) {
                    i11 = i2 | (startRestartGroup.changed(function23) ? 4 : 2);
                } else {
                    i11 = i2;
                }
                if ((i3 & 2048) != 0) {
                    i13 = i11 | 48;
                } else {
                    if ((i2 & 112) != 0) {
                        i12 = i11;
                        if ((1533916891 & i4) == 306783378 || (i12 & 91) != 18 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i16 == 0 ? Modifier.INSTANCE : modifier;
                                if (i5 != 0) {
                                    z3 = true;
                                }
                                if (i6 == 0) {
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
                                if ((i3 & 32) == 0) {
                                    cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                    i4 &= -458753;
                                } else {
                                    cornerBasedShape = shape;
                                }
                                BorderStroke borderStroke4 = i7 == 0 ? null : borderStroke;
                                if ((i3 & 128) == 0) {
                                    selectableChipColors2 = ChipDefaults.INSTANCE.m957filterChipColorsJ08w3E(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, C.ENCODING_PCM_32BIT, FrameMetricsAggregator.EVERY_DURATION);
                                    i4 &= -29360129;
                                } else {
                                    selectableChipColors2 = selectableChipColors;
                                }
                                Function2<? super Composer, ? super Integer, Unit> function210 = i8 == 0 ? null : function2;
                                Function2<? super Composer, ? super Integer, Unit> function211 = i9 == 0 ? null : function22;
                                if (i10 == 0) {
                                    i14 = i4;
                                    function25 = function210;
                                    function26 = function211;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    shape2 = cornerBasedShape;
                                    z4 = z3;
                                    borderStroke2 = borderStroke4;
                                    function24 = null;
                                } else {
                                    function24 = function23;
                                    i14 = i4;
                                    function25 = function210;
                                    function26 = function211;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    shape2 = cornerBasedShape;
                                    z4 = z3;
                                    borderStroke2 = borderStroke4;
                                }
                                modifier2 = companion;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 32) != 0) {
                                    i4 &= -458753;
                                }
                                if ((i3 & 128) != 0) {
                                    i4 &= -29360129;
                                }
                                mutableInteractionSource3 = mutableInteractionSource;
                                shape2 = shape;
                                borderStroke2 = borderStroke;
                                selectableChipColors2 = selectableChipColors;
                                function25 = function2;
                                function26 = function22;
                                function24 = function23;
                                i14 = i4;
                                z4 = z3;
                                modifier2 = modifier;
                            }
                            startRestartGroup.endDefaults();
                            int i17 = i14 << 3;
                            int i18 = ((i14 >> 9) & 14) | (i17 & 112) | ((i14 >> 15) & 896);
                            final State<Color> contentColor = selectableChipColors2.contentColor(z4, z, startRestartGroup, i18);
                            final Function2<? super Composer, ? super Integer, Unit> function212 = function25;
                            final Function2<? super Composer, ? super Integer, Unit> function213 = function26;
                            final Function2<? super Composer, ? super Integer, Unit> function214 = function24;
                            final boolean z6 = z4;
                            final int i19 = i12;
                            Modifier modifier4 = modifier2;
                            selectableChipColors3 = selectableChipColors2;
                            final int i20 = i14;
                            composer2 = startRestartGroup;
                            SurfaceKt.m1174SurfaceNy5ogXk(z, onClick, SemanticsModifierKt.semantics$default(modifier2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ChipKt$FilterChip$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semantics) {
                                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                    SemanticsPropertiesKt.m3397setRolekuIjeqM(semantics, Role.INSTANCE.m3385getCheckboxo7Vup1c());
                                }
                            }, 1, null), false, shape2, selectableChipColors2.backgroundColor(z4, z, startRestartGroup, i18).getValue().m1638unboximpl(), Color.m1627copywmQWz5c$default(contentColor.getValue().m1638unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, 0.0f, mutableInteractionSource3, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(startRestartGroup, 722126431, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$FilterChip$3
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

                                public final void invoke(Composer composer3, int i21) {
                                    ComposerKt.sourceInformation(composer3, "C209@9597L3645:Chip.kt#jmzs0o");
                                    if ((i21 & 11) != 2 || !composer3.getSkipping()) {
                                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1630getAlphaimpl(contentColor.getValue().m1638unboximpl())))};
                                        final Function2<Composer, Integer, Unit> function215 = function212;
                                        final boolean z7 = z;
                                        final Function2<Composer, Integer, Unit> function216 = function213;
                                        final Function2<Composer, Integer, Unit> function217 = function214;
                                        final Function3<RowScope, Composer, Integer, Unit> function3 = content;
                                        final int i22 = i19;
                                        final SelectableChipColors selectableChipColors4 = selectableChipColors3;
                                        final boolean z8 = z6;
                                        final int i23 = i20;
                                        final State<Color> state = contentColor;
                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1582291359, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$FilterChip$3.1
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

                                            public final void invoke(Composer composer4, int i24) {
                                                ComposerKt.sourceInformation(composer4, "C211@9745L10,210@9689L3543:Chip.kt#jmzs0o");
                                                if ((i24 & 11) != 2 || !composer4.getSkipping()) {
                                                    TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer4, 6).getBody2();
                                                    final Function2<Composer, Integer, Unit> function218 = function215;
                                                    final boolean z9 = z7;
                                                    final Function2<Composer, Integer, Unit> function219 = function216;
                                                    final Function2<Composer, Integer, Unit> function220 = function217;
                                                    final Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                                    final int i25 = i22;
                                                    final SelectableChipColors selectableChipColors5 = selectableChipColors4;
                                                    final boolean z10 = z8;
                                                    final int i26 = i23;
                                                    final State<Color> state2 = state;
                                                    TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer4, -1543702066, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.FilterChip.3.1.1
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

                                                        public final void invoke(Composer composer5, int i27) {
                                                            float m3840constructorimpl;
                                                            float m3840constructorimpl2;
                                                            float f;
                                                            RowScopeInstance rowScopeInstance;
                                                            float f2;
                                                            int i28;
                                                            float f3;
                                                            float f4;
                                                            float f5;
                                                            ComposerKt.sourceInformation(composer5, "C213@9794L3424:Chip.kt#jmzs0o");
                                                            if ((i27 & 11) != 2 || !composer5.getSkipping()) {
                                                                Modifier m446defaultMinSizeVpY3zN4$default = SizeKt.m446defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, ChipDefaults.INSTANCE.m959getMinHeightD9Ej5fM(), 1, null);
                                                                if (function218 == null && (!z9 || function219 == null)) {
                                                                    m3840constructorimpl = ChipKt.HorizontalPadding;
                                                                } else {
                                                                    m3840constructorimpl = Dp.m3840constructorimpl(0);
                                                                }
                                                                float f6 = m3840constructorimpl;
                                                                if (function220 == null) {
                                                                    m3840constructorimpl2 = ChipKt.HorizontalPadding;
                                                                } else {
                                                                    m3840constructorimpl2 = Dp.m3840constructorimpl(0);
                                                                }
                                                                Modifier m424paddingqDBjuR0$default = PaddingKt.m424paddingqDBjuR0$default(m446defaultMinSizeVpY3zN4$default, f6, 0.0f, m3840constructorimpl2, 0.0f, 10, null);
                                                                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                                Function2<Composer, Integer, Unit> function221 = function218;
                                                                boolean z11 = z9;
                                                                Function2<Composer, Integer, Unit> function222 = function219;
                                                                Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                                                int i29 = i25;
                                                                Function2<Composer, Integer, Unit> function223 = function220;
                                                                SelectableChipColors selectableChipColors6 = selectableChipColors5;
                                                                boolean z12 = z10;
                                                                int i30 = i26;
                                                                State<Color> state3 = state2;
                                                                composer5.startReplaceableGroup(693286680);
                                                                ComposerKt.sourceInformation(composer5, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer5, 54);
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
                                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m424paddingqDBjuR0$default);
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
                                                                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                                                composer5.startReplaceableGroup(1218705642);
                                                                ComposerKt.sourceInformation(composer5, "C275@12946L9,277@13028L43,278@13096L14,279@13135L43:Chip.kt#jmzs0o");
                                                                composer5.startReplaceableGroup(-1943412137);
                                                                ComposerKt.sourceInformation(composer5, "236@10806L47,237@10878L1955,273@12858L45");
                                                                if (function221 != null || (z11 && function222 != null)) {
                                                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                                                    f = ChipKt.LeadingIconStartSpacing;
                                                                    SpacerKt.Spacer(SizeKt.m466width3ABfNKs(companion2, f), composer5, 6);
                                                                    composer5.startReplaceableGroup(733328855);
                                                                    ComposerKt.sourceInformation(composer5, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                                                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer5, 0);
                                                                    composer5.startReplaceableGroup(-1323940314);
                                                                    ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                                    ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                                                    ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                    Object consume4 = composer5.consume(localDensity2);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    Density density2 = (Density) consume4;
                                                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                                                    ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                    Object consume5 = composer5.consume(localLayoutDirection2);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
                                                                    rowScopeInstance = rowScopeInstance2;
                                                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                                                                    ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                    Object consume6 = composer5.consume(localViewConfiguration2);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
                                                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(companion3);
                                                                    if (!(composer5.getApplier() instanceof Applier)) {
                                                                        ComposablesKt.invalidApplier();
                                                                    }
                                                                    composer5.startReusableNode();
                                                                    if (composer5.getInserting()) {
                                                                        composer5.createNode(constructor2);
                                                                    } else {
                                                                        composer5.useNode();
                                                                    }
                                                                    composer5.disableReusing();
                                                                    Composer m1283constructorimpl2 = Updater.m1283constructorimpl(composer5);
                                                                    Updater.m1290setimpl(m1283constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                    Updater.m1290setimpl(m1283constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                                                                    Updater.m1290setimpl(m1283constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                                    Updater.m1290setimpl(m1283constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                                    composer5.enableReusing();
                                                                    materializerOf2.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer5)), composer5, 0);
                                                                    composer5.startReplaceableGroup(2058660585);
                                                                    composer5.startReplaceableGroup(-2137368960);
                                                                    ComposerKt.sourceInformation(composer5, "C72@3384L9:Box.kt#2w3rfo");
                                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                    composer5.startReplaceableGroup(-626917591);
                                                                    ComposerKt.sourceInformation(composer5, "C:Chip.kt#jmzs0o");
                                                                    composer5.startReplaceableGroup(649985595);
                                                                    ComposerKt.sourceInformation(composer5, "239@11001L141,243@11175L297");
                                                                    if (function221 != null) {
                                                                        State<Color> leadingIconColor = selectableChipColors6.leadingIconColor(z12, z11, composer5, ((i30 >> 9) & 14) | ((i30 << 3) & 112) | ((i30 >> 15) & 896));
                                                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(leadingIconColor.getValue()), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1630getAlphaimpl(leadingIconColor.getValue().m1638unboximpl())))}, function221, composer5, ((i30 >> 21) & 112) | 8);
                                                                    }
                                                                    composer5.endReplaceableGroup();
                                                                    composer5.startReplaceableGroup(-1943411323);
                                                                    ComposerKt.sourceInformation(composer5, "262@12326L451");
                                                                    if (z11 && function222 != null) {
                                                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                                                        long m1638unboximpl = state3.getValue().m1638unboximpl();
                                                                        composer5.startReplaceableGroup(649986426);
                                                                        ComposerKt.sourceInformation(composer5, "260@12219L34");
                                                                        if (function221 != null) {
                                                                            Modifier.Companion companion5 = Modifier.INSTANCE;
                                                                            f3 = ChipKt.SelectedIconContainerSize;
                                                                            companion4 = ClipKt.clip(BackgroundKt.m172backgroundbw27NRU(SizeKt.m453requiredSize3ABfNKs(companion5, f3), state3.getValue().m1638unboximpl(), RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape());
                                                                            m1638unboximpl = selectableChipColors6.backgroundColor(z12, z11, composer5, ((i30 >> 9) & 14) | ((i30 << 3) & 112) | ((i30 >> 15) & 896)).getValue().m1638unboximpl();
                                                                        }
                                                                        composer5.endReplaceableGroup();
                                                                        Alignment center = Alignment.INSTANCE.getCenter();
                                                                        composer5.startReplaceableGroup(733328855);
                                                                        ComposerKt.sourceInformation(composer5, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                                        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer5, 6);
                                                                        composer5.startReplaceableGroup(-1323940314);
                                                                        ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                                        ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                                                                        ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                        Object consume7 = composer5.consume(localDensity3);
                                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                        Density density3 = (Density) consume7;
                                                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
                                                                        ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                        Object consume8 = composer5.consume(localLayoutDirection3);
                                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                        LayoutDirection layoutDirection3 = (LayoutDirection) consume8;
                                                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration3 = CompositionLocalsKt.getLocalViewConfiguration();
                                                                        ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                        Object consume9 = composer5.consume(localViewConfiguration3);
                                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                        ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume9;
                                                                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(companion4);
                                                                        if (!(composer5.getApplier() instanceof Applier)) {
                                                                            ComposablesKt.invalidApplier();
                                                                        }
                                                                        composer5.startReusableNode();
                                                                        if (composer5.getInserting()) {
                                                                            composer5.createNode(constructor3);
                                                                        } else {
                                                                            composer5.useNode();
                                                                        }
                                                                        composer5.disableReusing();
                                                                        Composer m1283constructorimpl3 = Updater.m1283constructorimpl(composer5);
                                                                        Updater.m1290setimpl(m1283constructorimpl3, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                        Updater.m1290setimpl(m1283constructorimpl3, density3, ComposeUiNode.INSTANCE.getSetDensity());
                                                                        Updater.m1290setimpl(m1283constructorimpl3, layoutDirection3, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                                        Updater.m1290setimpl(m1283constructorimpl3, viewConfiguration3, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                                        composer5.enableReusing();
                                                                        materializerOf3.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer5)), composer5, 0);
                                                                        composer5.startReplaceableGroup(2058660585);
                                                                        composer5.startReplaceableGroup(-2137368960);
                                                                        ComposerKt.sourceInformation(composer5, "C72@3384L9:Box.kt#2w3rfo");
                                                                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                                        composer5.startReplaceableGroup(-370889391);
                                                                        ComposerKt.sourceInformation(composer5, "C266@12539L204:Chip.kt#jmzs0o");
                                                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(m1638unboximpl))}, function222, composer5, ((i30 >> 24) & 112) | 8);
                                                                        composer5.endReplaceableGroup();
                                                                        composer5.endReplaceableGroup();
                                                                        composer5.endReplaceableGroup();
                                                                        composer5.endNode();
                                                                        composer5.endReplaceableGroup();
                                                                        composer5.endReplaceableGroup();
                                                                    }
                                                                    composer5.endReplaceableGroup();
                                                                    composer5.endReplaceableGroup();
                                                                    composer5.endReplaceableGroup();
                                                                    composer5.endReplaceableGroup();
                                                                    composer5.endNode();
                                                                    composer5.endReplaceableGroup();
                                                                    composer5.endReplaceableGroup();
                                                                    Modifier.Companion companion6 = Modifier.INSTANCE;
                                                                    f2 = ChipKt.LeadingIconEndSpacing;
                                                                    Modifier m466width3ABfNKs = SizeKt.m466width3ABfNKs(companion6, f2);
                                                                    i28 = 6;
                                                                    SpacerKt.Spacer(m466width3ABfNKs, composer5, 6);
                                                                } else {
                                                                    rowScopeInstance = rowScopeInstance2;
                                                                    i28 = 6;
                                                                }
                                                                composer5.endReplaceableGroup();
                                                                function33.invoke(rowScopeInstance, composer5, Integer.valueOf((i29 & 112) | i28));
                                                                if (function223 != null) {
                                                                    Modifier.Companion companion7 = Modifier.INSTANCE;
                                                                    f4 = ChipKt.TrailingIconSpacing;
                                                                    SpacerKt.Spacer(SizeKt.m466width3ABfNKs(companion7, f4), composer5, i28);
                                                                    function223.invoke(composer5, Integer.valueOf(i29 & 14));
                                                                    Modifier.Companion companion8 = Modifier.INSTANCE;
                                                                    f5 = ChipKt.TrailingIconSpacing;
                                                                    SpacerKt.Spacer(SizeKt.m466width3ABfNKs(companion8, f5), composer5, i28);
                                                                }
                                                                composer5.endReplaceableGroup();
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
                            }), composer2, (i14 & 126) | ((i14 >> 3) & 57344) | (i17 & 29360128) | ((i14 << 15) & 1879048192), 6, 264);
                            mutableInteractionSource4 = mutableInteractionSource3;
                            shape3 = shape2;
                            borderStroke3 = borderStroke2;
                            function27 = function25;
                            function28 = function26;
                            function29 = function24;
                            z5 = z6;
                            modifier3 = modifier4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            mutableInteractionSource4 = mutableInteractionSource;
                            shape3 = shape;
                            borderStroke3 = borderStroke;
                            function28 = function22;
                            function29 = function23;
                            z5 = z3;
                            composer2 = startRestartGroup;
                            selectableChipColors3 = selectableChipColors;
                            function27 = function2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$FilterChip$4
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

                            public final void invoke(Composer composer3, int i21) {
                                ChipKt.FilterChip(z, onClick, modifier3, z5, mutableInteractionSource4, shape3, borderStroke3, selectableChipColors3, function27, function28, function29, content, composer3, i | 1, i2, i3);
                            }
                        });
                        return;
                    }
                    i13 = i11 | (startRestartGroup.changed(content) ? 32 : 16);
                }
                i12 = i13;
                if ((1533916891 & i4) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i16 == 0) {
                }
                if (i5 != 0) {
                }
                if (i6 == 0) {
                }
                if ((i3 & 32) == 0) {
                }
                if (i7 == 0) {
                }
                if ((i3 & 128) == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                modifier2 = companion;
                startRestartGroup.endDefaults();
                int i172 = i14 << 3;
                int i182 = ((i14 >> 9) & 14) | (i172 & 112) | ((i14 >> 15) & 896);
                final State<Color> contentColor2 = selectableChipColors2.contentColor(z4, z, startRestartGroup, i182);
                final Function2<? super Composer, ? super Integer, Unit> function2122 = function25;
                final Function2<? super Composer, ? super Integer, Unit> function2132 = function26;
                final Function2<? super Composer, ? super Integer, Unit> function2142 = function24;
                final boolean z62 = z4;
                final int i192 = i12;
                Modifier modifier42 = modifier2;
                selectableChipColors3 = selectableChipColors2;
                final int i202 = i14;
                composer2 = startRestartGroup;
                SurfaceKt.m1174SurfaceNy5ogXk(z, onClick, SemanticsModifierKt.semantics$default(modifier2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ChipKt$FilterChip$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semantics) {
                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        SemanticsPropertiesKt.m3397setRolekuIjeqM(semantics, Role.INSTANCE.m3385getCheckboxo7Vup1c());
                    }
                }, 1, null), false, shape2, selectableChipColors2.backgroundColor(z4, z, startRestartGroup, i182).getValue().m1638unboximpl(), Color.m1627copywmQWz5c$default(contentColor2.getValue().m1638unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, 0.0f, mutableInteractionSource3, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(startRestartGroup, 722126431, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$FilterChip$3
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

                    public final void invoke(Composer composer3, int i21) {
                        ComposerKt.sourceInformation(composer3, "C209@9597L3645:Chip.kt#jmzs0o");
                        if ((i21 & 11) != 2 || !composer3.getSkipping()) {
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1630getAlphaimpl(contentColor2.getValue().m1638unboximpl())))};
                            final Function2<? super Composer, ? super Integer, Unit> function215 = function2122;
                            final boolean z7 = z;
                            final Function2<? super Composer, ? super Integer, Unit> function216 = function2132;
                            final Function2<? super Composer, ? super Integer, Unit> function217 = function2142;
                            final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3 = content;
                            final int i22 = i192;
                            final SelectableChipColors selectableChipColors4 = selectableChipColors3;
                            final boolean z8 = z62;
                            final int i23 = i202;
                            final State<Color> state = contentColor2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1582291359, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$FilterChip$3.1
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

                                public final void invoke(Composer composer4, int i24) {
                                    ComposerKt.sourceInformation(composer4, "C211@9745L10,210@9689L3543:Chip.kt#jmzs0o");
                                    if ((i24 & 11) != 2 || !composer4.getSkipping()) {
                                        TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer4, 6).getBody2();
                                        final Function2<? super Composer, ? super Integer, Unit> function218 = function215;
                                        final boolean z9 = z7;
                                        final Function2<? super Composer, ? super Integer, Unit> function219 = function216;
                                        final Function2<? super Composer, ? super Integer, Unit> function220 = function217;
                                        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32 = function3;
                                        final int i25 = i22;
                                        final SelectableChipColors selectableChipColors5 = selectableChipColors4;
                                        final boolean z10 = z8;
                                        final int i26 = i23;
                                        final State<Color> state2 = state;
                                        TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer4, -1543702066, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.FilterChip.3.1.1
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

                                            public final void invoke(Composer composer5, int i27) {
                                                float m3840constructorimpl;
                                                float m3840constructorimpl2;
                                                float f;
                                                RowScopeInstance rowScopeInstance;
                                                float f2;
                                                int i28;
                                                float f3;
                                                float f4;
                                                float f5;
                                                ComposerKt.sourceInformation(composer5, "C213@9794L3424:Chip.kt#jmzs0o");
                                                if ((i27 & 11) != 2 || !composer5.getSkipping()) {
                                                    Modifier m446defaultMinSizeVpY3zN4$default = SizeKt.m446defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, ChipDefaults.INSTANCE.m959getMinHeightD9Ej5fM(), 1, null);
                                                    if (function218 == null && (!z9 || function219 == null)) {
                                                        m3840constructorimpl = ChipKt.HorizontalPadding;
                                                    } else {
                                                        m3840constructorimpl = Dp.m3840constructorimpl(0);
                                                    }
                                                    float f6 = m3840constructorimpl;
                                                    if (function220 == null) {
                                                        m3840constructorimpl2 = ChipKt.HorizontalPadding;
                                                    } else {
                                                        m3840constructorimpl2 = Dp.m3840constructorimpl(0);
                                                    }
                                                    Modifier m424paddingqDBjuR0$default = PaddingKt.m424paddingqDBjuR0$default(m446defaultMinSizeVpY3zN4$default, f6, 0.0f, m3840constructorimpl2, 0.0f, 10, null);
                                                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                    Function2<Composer, Integer, Unit> function221 = function218;
                                                    boolean z11 = z9;
                                                    Function2<Composer, Integer, Unit> function222 = function219;
                                                    Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                                    int i29 = i25;
                                                    Function2<Composer, Integer, Unit> function223 = function220;
                                                    SelectableChipColors selectableChipColors6 = selectableChipColors5;
                                                    boolean z12 = z10;
                                                    int i30 = i26;
                                                    State<Color> state3 = state2;
                                                    composer5.startReplaceableGroup(693286680);
                                                    ComposerKt.sourceInformation(composer5, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer5, 54);
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
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m424paddingqDBjuR0$default);
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
                                                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                                    composer5.startReplaceableGroup(1218705642);
                                                    ComposerKt.sourceInformation(composer5, "C275@12946L9,277@13028L43,278@13096L14,279@13135L43:Chip.kt#jmzs0o");
                                                    composer5.startReplaceableGroup(-1943412137);
                                                    ComposerKt.sourceInformation(composer5, "236@10806L47,237@10878L1955,273@12858L45");
                                                    if (function221 != null || (z11 && function222 != null)) {
                                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                                        f = ChipKt.LeadingIconStartSpacing;
                                                        SpacerKt.Spacer(SizeKt.m466width3ABfNKs(companion2, f), composer5, 6);
                                                        composer5.startReplaceableGroup(733328855);
                                                        ComposerKt.sourceInformation(composer5, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer5, 0);
                                                        composer5.startReplaceableGroup(-1323940314);
                                                        ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                                        ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume4 = composer5.consume(localDensity2);
                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        Density density2 = (Density) consume4;
                                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                                        ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume5 = composer5.consume(localLayoutDirection2);
                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
                                                        rowScopeInstance = rowScopeInstance2;
                                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                                                        ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume6 = composer5.consume(localViewConfiguration2);
                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
                                                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(companion3);
                                                        if (!(composer5.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer5.startReusableNode();
                                                        if (composer5.getInserting()) {
                                                            composer5.createNode(constructor2);
                                                        } else {
                                                            composer5.useNode();
                                                        }
                                                        composer5.disableReusing();
                                                        Composer m1283constructorimpl2 = Updater.m1283constructorimpl(composer5);
                                                        Updater.m1290setimpl(m1283constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m1290setimpl(m1283constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                                                        Updater.m1290setimpl(m1283constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                        Updater.m1290setimpl(m1283constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                        composer5.enableReusing();
                                                        materializerOf2.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer5)), composer5, 0);
                                                        composer5.startReplaceableGroup(2058660585);
                                                        composer5.startReplaceableGroup(-2137368960);
                                                        ComposerKt.sourceInformation(composer5, "C72@3384L9:Box.kt#2w3rfo");
                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                        composer5.startReplaceableGroup(-626917591);
                                                        ComposerKt.sourceInformation(composer5, "C:Chip.kt#jmzs0o");
                                                        composer5.startReplaceableGroup(649985595);
                                                        ComposerKt.sourceInformation(composer5, "239@11001L141,243@11175L297");
                                                        if (function221 != null) {
                                                            State<Color> leadingIconColor = selectableChipColors6.leadingIconColor(z12, z11, composer5, ((i30 >> 9) & 14) | ((i30 << 3) & 112) | ((i30 >> 15) & 896));
                                                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(leadingIconColor.getValue()), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1630getAlphaimpl(leadingIconColor.getValue().m1638unboximpl())))}, function221, composer5, ((i30 >> 21) & 112) | 8);
                                                        }
                                                        composer5.endReplaceableGroup();
                                                        composer5.startReplaceableGroup(-1943411323);
                                                        ComposerKt.sourceInformation(composer5, "262@12326L451");
                                                        if (z11 && function222 != null) {
                                                            Modifier.Companion companion4 = Modifier.INSTANCE;
                                                            long m1638unboximpl = state3.getValue().m1638unboximpl();
                                                            composer5.startReplaceableGroup(649986426);
                                                            ComposerKt.sourceInformation(composer5, "260@12219L34");
                                                            if (function221 != null) {
                                                                Modifier.Companion companion5 = Modifier.INSTANCE;
                                                                f3 = ChipKt.SelectedIconContainerSize;
                                                                companion4 = ClipKt.clip(BackgroundKt.m172backgroundbw27NRU(SizeKt.m453requiredSize3ABfNKs(companion5, f3), state3.getValue().m1638unboximpl(), RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape());
                                                                m1638unboximpl = selectableChipColors6.backgroundColor(z12, z11, composer5, ((i30 >> 9) & 14) | ((i30 << 3) & 112) | ((i30 >> 15) & 896)).getValue().m1638unboximpl();
                                                            }
                                                            composer5.endReplaceableGroup();
                                                            Alignment center = Alignment.INSTANCE.getCenter();
                                                            composer5.startReplaceableGroup(733328855);
                                                            ComposerKt.sourceInformation(composer5, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer5, 6);
                                                            composer5.startReplaceableGroup(-1323940314);
                                                            ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                            ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                                                            ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            Object consume7 = composer5.consume(localDensity3);
                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                            Density density3 = (Density) consume7;
                                                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
                                                            ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            Object consume8 = composer5.consume(localLayoutDirection3);
                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                            LayoutDirection layoutDirection3 = (LayoutDirection) consume8;
                                                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration3 = CompositionLocalsKt.getLocalViewConfiguration();
                                                            ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            Object consume9 = composer5.consume(localViewConfiguration3);
                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                            ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume9;
                                                            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(companion4);
                                                            if (!(composer5.getApplier() instanceof Applier)) {
                                                                ComposablesKt.invalidApplier();
                                                            }
                                                            composer5.startReusableNode();
                                                            if (composer5.getInserting()) {
                                                                composer5.createNode(constructor3);
                                                            } else {
                                                                composer5.useNode();
                                                            }
                                                            composer5.disableReusing();
                                                            Composer m1283constructorimpl3 = Updater.m1283constructorimpl(composer5);
                                                            Updater.m1290setimpl(m1283constructorimpl3, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                            Updater.m1290setimpl(m1283constructorimpl3, density3, ComposeUiNode.INSTANCE.getSetDensity());
                                                            Updater.m1290setimpl(m1283constructorimpl3, layoutDirection3, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                            Updater.m1290setimpl(m1283constructorimpl3, viewConfiguration3, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                            composer5.enableReusing();
                                                            materializerOf3.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer5)), composer5, 0);
                                                            composer5.startReplaceableGroup(2058660585);
                                                            composer5.startReplaceableGroup(-2137368960);
                                                            ComposerKt.sourceInformation(composer5, "C72@3384L9:Box.kt#2w3rfo");
                                                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                            composer5.startReplaceableGroup(-370889391);
                                                            ComposerKt.sourceInformation(composer5, "C266@12539L204:Chip.kt#jmzs0o");
                                                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(m1638unboximpl))}, function222, composer5, ((i30 >> 24) & 112) | 8);
                                                            composer5.endReplaceableGroup();
                                                            composer5.endReplaceableGroup();
                                                            composer5.endReplaceableGroup();
                                                            composer5.endNode();
                                                            composer5.endReplaceableGroup();
                                                            composer5.endReplaceableGroup();
                                                        }
                                                        composer5.endReplaceableGroup();
                                                        composer5.endReplaceableGroup();
                                                        composer5.endReplaceableGroup();
                                                        composer5.endReplaceableGroup();
                                                        composer5.endNode();
                                                        composer5.endReplaceableGroup();
                                                        composer5.endReplaceableGroup();
                                                        Modifier.Companion companion6 = Modifier.INSTANCE;
                                                        f2 = ChipKt.LeadingIconEndSpacing;
                                                        Modifier m466width3ABfNKs = SizeKt.m466width3ABfNKs(companion6, f2);
                                                        i28 = 6;
                                                        SpacerKt.Spacer(m466width3ABfNKs, composer5, 6);
                                                    } else {
                                                        rowScopeInstance = rowScopeInstance2;
                                                        i28 = 6;
                                                    }
                                                    composer5.endReplaceableGroup();
                                                    function33.invoke(rowScopeInstance, composer5, Integer.valueOf((i29 & 112) | i28));
                                                    if (function223 != null) {
                                                        Modifier.Companion companion7 = Modifier.INSTANCE;
                                                        f4 = ChipKt.TrailingIconSpacing;
                                                        SpacerKt.Spacer(SizeKt.m466width3ABfNKs(companion7, f4), composer5, i28);
                                                        function223.invoke(composer5, Integer.valueOf(i29 & 14));
                                                        Modifier.Companion companion8 = Modifier.INSTANCE;
                                                        f5 = ChipKt.TrailingIconSpacing;
                                                        SpacerKt.Spacer(SizeKt.m466width3ABfNKs(companion8, f5), composer5, i28);
                                                    }
                                                    composer5.endReplaceableGroup();
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
                }), composer2, (i14 & 126) | ((i14 >> 3) & 57344) | (i172 & 29360128) | ((i14 << 15) & 1879048192), 6, 264);
                mutableInteractionSource4 = mutableInteractionSource3;
                shape3 = shape2;
                borderStroke3 = borderStroke2;
                function27 = function25;
                function28 = function26;
                function29 = function24;
                z5 = z62;
                modifier3 = modifier42;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z3 = z2;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            if ((i & 458752) == 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            if ((i & 29360128) == 0) {
            }
            i8 = i3 & 256;
            if (i8 != 0) {
            }
            i9 = i3 & 512;
            if (i9 != 0) {
            }
            i10 = i3 & 1024;
            if (i10 != 0) {
            }
            if ((i3 & 2048) != 0) {
            }
            i12 = i13;
            if ((1533916891 & i4) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i16 == 0) {
            }
            if (i5 != 0) {
            }
            if (i6 == 0) {
            }
            if ((i3 & 32) == 0) {
            }
            if (i7 == 0) {
            }
            if ((i3 & 128) == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            modifier2 = companion;
            startRestartGroup.endDefaults();
            int i1722 = i14 << 3;
            int i1822 = ((i14 >> 9) & 14) | (i1722 & 112) | ((i14 >> 15) & 896);
            final State<Color> contentColor22 = selectableChipColors2.contentColor(z4, z, startRestartGroup, i1822);
            final Function2<? super Composer, ? super Integer, Unit> function21222 = function25;
            final Function2<? super Composer, ? super Integer, Unit> function21322 = function26;
            final Function2<? super Composer, ? super Integer, Unit> function21422 = function24;
            final boolean z622 = z4;
            final int i1922 = i12;
            Modifier modifier422 = modifier2;
            selectableChipColors3 = selectableChipColors2;
            final int i2022 = i14;
            composer2 = startRestartGroup;
            SurfaceKt.m1174SurfaceNy5ogXk(z, onClick, SemanticsModifierKt.semantics$default(modifier2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ChipKt$FilterChip$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semantics) {
                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    SemanticsPropertiesKt.m3397setRolekuIjeqM(semantics, Role.INSTANCE.m3385getCheckboxo7Vup1c());
                }
            }, 1, null), false, shape2, selectableChipColors2.backgroundColor(z4, z, startRestartGroup, i1822).getValue().m1638unboximpl(), Color.m1627copywmQWz5c$default(contentColor22.getValue().m1638unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, 0.0f, mutableInteractionSource3, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(startRestartGroup, 722126431, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$FilterChip$3
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

                public final void invoke(Composer composer3, int i21) {
                    ComposerKt.sourceInformation(composer3, "C209@9597L3645:Chip.kt#jmzs0o");
                    if ((i21 & 11) != 2 || !composer3.getSkipping()) {
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1630getAlphaimpl(contentColor22.getValue().m1638unboximpl())))};
                        final Function2<? super Composer, ? super Integer, Unit> function215 = function21222;
                        final boolean z7 = z;
                        final Function2<? super Composer, ? super Integer, Unit> function216 = function21322;
                        final Function2<? super Composer, ? super Integer, Unit> function217 = function21422;
                        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3 = content;
                        final int i22 = i1922;
                        final SelectableChipColors selectableChipColors4 = selectableChipColors3;
                        final boolean z8 = z622;
                        final int i23 = i2022;
                        final State<Color> state = contentColor22;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1582291359, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$FilterChip$3.1
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

                            public final void invoke(Composer composer4, int i24) {
                                ComposerKt.sourceInformation(composer4, "C211@9745L10,210@9689L3543:Chip.kt#jmzs0o");
                                if ((i24 & 11) != 2 || !composer4.getSkipping()) {
                                    TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer4, 6).getBody2();
                                    final Function2<? super Composer, ? super Integer, Unit> function218 = function215;
                                    final boolean z9 = z7;
                                    final Function2<? super Composer, ? super Integer, Unit> function219 = function216;
                                    final Function2<? super Composer, ? super Integer, Unit> function220 = function217;
                                    final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32 = function3;
                                    final int i25 = i22;
                                    final SelectableChipColors selectableChipColors5 = selectableChipColors4;
                                    final boolean z10 = z8;
                                    final int i26 = i23;
                                    final State<Color> state2 = state;
                                    TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer4, -1543702066, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.FilterChip.3.1.1
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

                                        public final void invoke(Composer composer5, int i27) {
                                            float m3840constructorimpl;
                                            float m3840constructorimpl2;
                                            float f;
                                            RowScopeInstance rowScopeInstance;
                                            float f2;
                                            int i28;
                                            float f3;
                                            float f4;
                                            float f5;
                                            ComposerKt.sourceInformation(composer5, "C213@9794L3424:Chip.kt#jmzs0o");
                                            if ((i27 & 11) != 2 || !composer5.getSkipping()) {
                                                Modifier m446defaultMinSizeVpY3zN4$default = SizeKt.m446defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, ChipDefaults.INSTANCE.m959getMinHeightD9Ej5fM(), 1, null);
                                                if (function218 == null && (!z9 || function219 == null)) {
                                                    m3840constructorimpl = ChipKt.HorizontalPadding;
                                                } else {
                                                    m3840constructorimpl = Dp.m3840constructorimpl(0);
                                                }
                                                float f6 = m3840constructorimpl;
                                                if (function220 == null) {
                                                    m3840constructorimpl2 = ChipKt.HorizontalPadding;
                                                } else {
                                                    m3840constructorimpl2 = Dp.m3840constructorimpl(0);
                                                }
                                                Modifier m424paddingqDBjuR0$default = PaddingKt.m424paddingqDBjuR0$default(m446defaultMinSizeVpY3zN4$default, f6, 0.0f, m3840constructorimpl2, 0.0f, 10, null);
                                                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                Function2<Composer, Integer, Unit> function221 = function218;
                                                boolean z11 = z9;
                                                Function2<Composer, Integer, Unit> function222 = function219;
                                                Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                                int i29 = i25;
                                                Function2<Composer, Integer, Unit> function223 = function220;
                                                SelectableChipColors selectableChipColors6 = selectableChipColors5;
                                                boolean z12 = z10;
                                                int i30 = i26;
                                                State<Color> state3 = state2;
                                                composer5.startReplaceableGroup(693286680);
                                                ComposerKt.sourceInformation(composer5, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer5, 54);
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
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m424paddingqDBjuR0$default);
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
                                                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                                composer5.startReplaceableGroup(1218705642);
                                                ComposerKt.sourceInformation(composer5, "C275@12946L9,277@13028L43,278@13096L14,279@13135L43:Chip.kt#jmzs0o");
                                                composer5.startReplaceableGroup(-1943412137);
                                                ComposerKt.sourceInformation(composer5, "236@10806L47,237@10878L1955,273@12858L45");
                                                if (function221 != null || (z11 && function222 != null)) {
                                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                                    f = ChipKt.LeadingIconStartSpacing;
                                                    SpacerKt.Spacer(SizeKt.m466width3ABfNKs(companion2, f), composer5, 6);
                                                    composer5.startReplaceableGroup(733328855);
                                                    ComposerKt.sourceInformation(composer5, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer5, 0);
                                                    composer5.startReplaceableGroup(-1323940314);
                                                    ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                    ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                                    ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume4 = composer5.consume(localDensity2);
                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                    Density density2 = (Density) consume4;
                                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                                    ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume5 = composer5.consume(localLayoutDirection2);
                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                    LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
                                                    rowScopeInstance = rowScopeInstance2;
                                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                                                    ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume6 = composer5.consume(localViewConfiguration2);
                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
                                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(companion3);
                                                    if (!(composer5.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer5.startReusableNode();
                                                    if (composer5.getInserting()) {
                                                        composer5.createNode(constructor2);
                                                    } else {
                                                        composer5.useNode();
                                                    }
                                                    composer5.disableReusing();
                                                    Composer m1283constructorimpl2 = Updater.m1283constructorimpl(composer5);
                                                    Updater.m1290setimpl(m1283constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    Updater.m1290setimpl(m1283constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                                                    Updater.m1290setimpl(m1283constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                    Updater.m1290setimpl(m1283constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                    composer5.enableReusing();
                                                    materializerOf2.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer5)), composer5, 0);
                                                    composer5.startReplaceableGroup(2058660585);
                                                    composer5.startReplaceableGroup(-2137368960);
                                                    ComposerKt.sourceInformation(composer5, "C72@3384L9:Box.kt#2w3rfo");
                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                    composer5.startReplaceableGroup(-626917591);
                                                    ComposerKt.sourceInformation(composer5, "C:Chip.kt#jmzs0o");
                                                    composer5.startReplaceableGroup(649985595);
                                                    ComposerKt.sourceInformation(composer5, "239@11001L141,243@11175L297");
                                                    if (function221 != null) {
                                                        State<Color> leadingIconColor = selectableChipColors6.leadingIconColor(z12, z11, composer5, ((i30 >> 9) & 14) | ((i30 << 3) & 112) | ((i30 >> 15) & 896));
                                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(leadingIconColor.getValue()), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1630getAlphaimpl(leadingIconColor.getValue().m1638unboximpl())))}, function221, composer5, ((i30 >> 21) & 112) | 8);
                                                    }
                                                    composer5.endReplaceableGroup();
                                                    composer5.startReplaceableGroup(-1943411323);
                                                    ComposerKt.sourceInformation(composer5, "262@12326L451");
                                                    if (z11 && function222 != null) {
                                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                                        long m1638unboximpl = state3.getValue().m1638unboximpl();
                                                        composer5.startReplaceableGroup(649986426);
                                                        ComposerKt.sourceInformation(composer5, "260@12219L34");
                                                        if (function221 != null) {
                                                            Modifier.Companion companion5 = Modifier.INSTANCE;
                                                            f3 = ChipKt.SelectedIconContainerSize;
                                                            companion4 = ClipKt.clip(BackgroundKt.m172backgroundbw27NRU(SizeKt.m453requiredSize3ABfNKs(companion5, f3), state3.getValue().m1638unboximpl(), RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape());
                                                            m1638unboximpl = selectableChipColors6.backgroundColor(z12, z11, composer5, ((i30 >> 9) & 14) | ((i30 << 3) & 112) | ((i30 >> 15) & 896)).getValue().m1638unboximpl();
                                                        }
                                                        composer5.endReplaceableGroup();
                                                        Alignment center = Alignment.INSTANCE.getCenter();
                                                        composer5.startReplaceableGroup(733328855);
                                                        ComposerKt.sourceInformation(composer5, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer5, 6);
                                                        composer5.startReplaceableGroup(-1323940314);
                                                        ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                        ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                                                        ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume7 = composer5.consume(localDensity3);
                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        Density density3 = (Density) consume7;
                                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
                                                        ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume8 = composer5.consume(localLayoutDirection3);
                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        LayoutDirection layoutDirection3 = (LayoutDirection) consume8;
                                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration3 = CompositionLocalsKt.getLocalViewConfiguration();
                                                        ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume9 = composer5.consume(localViewConfiguration3);
                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume9;
                                                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(companion4);
                                                        if (!(composer5.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer5.startReusableNode();
                                                        if (composer5.getInserting()) {
                                                            composer5.createNode(constructor3);
                                                        } else {
                                                            composer5.useNode();
                                                        }
                                                        composer5.disableReusing();
                                                        Composer m1283constructorimpl3 = Updater.m1283constructorimpl(composer5);
                                                        Updater.m1290setimpl(m1283constructorimpl3, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m1290setimpl(m1283constructorimpl3, density3, ComposeUiNode.INSTANCE.getSetDensity());
                                                        Updater.m1290setimpl(m1283constructorimpl3, layoutDirection3, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                        Updater.m1290setimpl(m1283constructorimpl3, viewConfiguration3, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                        composer5.enableReusing();
                                                        materializerOf3.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer5)), composer5, 0);
                                                        composer5.startReplaceableGroup(2058660585);
                                                        composer5.startReplaceableGroup(-2137368960);
                                                        ComposerKt.sourceInformation(composer5, "C72@3384L9:Box.kt#2w3rfo");
                                                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                        composer5.startReplaceableGroup(-370889391);
                                                        ComposerKt.sourceInformation(composer5, "C266@12539L204:Chip.kt#jmzs0o");
                                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(m1638unboximpl))}, function222, composer5, ((i30 >> 24) & 112) | 8);
                                                        composer5.endReplaceableGroup();
                                                        composer5.endReplaceableGroup();
                                                        composer5.endReplaceableGroup();
                                                        composer5.endNode();
                                                        composer5.endReplaceableGroup();
                                                        composer5.endReplaceableGroup();
                                                    }
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endNode();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    Modifier.Companion companion6 = Modifier.INSTANCE;
                                                    f2 = ChipKt.LeadingIconEndSpacing;
                                                    Modifier m466width3ABfNKs = SizeKt.m466width3ABfNKs(companion6, f2);
                                                    i28 = 6;
                                                    SpacerKt.Spacer(m466width3ABfNKs, composer5, 6);
                                                } else {
                                                    rowScopeInstance = rowScopeInstance2;
                                                    i28 = 6;
                                                }
                                                composer5.endReplaceableGroup();
                                                function33.invoke(rowScopeInstance, composer5, Integer.valueOf((i29 & 112) | i28));
                                                if (function223 != null) {
                                                    Modifier.Companion companion7 = Modifier.INSTANCE;
                                                    f4 = ChipKt.TrailingIconSpacing;
                                                    SpacerKt.Spacer(SizeKt.m466width3ABfNKs(companion7, f4), composer5, i28);
                                                    function223.invoke(composer5, Integer.valueOf(i29 & 14));
                                                    Modifier.Companion companion8 = Modifier.INSTANCE;
                                                    f5 = ChipKt.TrailingIconSpacing;
                                                    SpacerKt.Spacer(SizeKt.m466width3ABfNKs(companion8, f5), composer5, i28);
                                                }
                                                composer5.endReplaceableGroup();
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
            }), composer2, (i14 & 126) | ((i14 >> 3) & 57344) | (i1722 & 29360128) | ((i14 << 15) & 1879048192), 6, 264);
            mutableInteractionSource4 = mutableInteractionSource3;
            shape3 = shape2;
            borderStroke3 = borderStroke2;
            function27 = function25;
            function28 = function26;
            function29 = function24;
            z5 = z622;
            modifier3 = modifier422;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z3 = z2;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        if ((i & 458752) == 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        if ((i & 29360128) == 0) {
        }
        i8 = i3 & 256;
        if (i8 != 0) {
        }
        i9 = i3 & 512;
        if (i9 != 0) {
        }
        i10 = i3 & 1024;
        if (i10 != 0) {
        }
        if ((i3 & 2048) != 0) {
        }
        i12 = i13;
        if ((1533916891 & i4) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i16 == 0) {
        }
        if (i5 != 0) {
        }
        if (i6 == 0) {
        }
        if ((i3 & 32) == 0) {
        }
        if (i7 == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        modifier2 = companion;
        startRestartGroup.endDefaults();
        int i17222 = i14 << 3;
        int i18222 = ((i14 >> 9) & 14) | (i17222 & 112) | ((i14 >> 15) & 896);
        final State<Color> contentColor222 = selectableChipColors2.contentColor(z4, z, startRestartGroup, i18222);
        final Function2<? super Composer, ? super Integer, Unit> function212222 = function25;
        final Function2<? super Composer, ? super Integer, Unit> function213222 = function26;
        final Function2<? super Composer, ? super Integer, Unit> function214222 = function24;
        final boolean z6222 = z4;
        final int i19222 = i12;
        Modifier modifier4222 = modifier2;
        selectableChipColors3 = selectableChipColors2;
        final int i20222 = i14;
        composer2 = startRestartGroup;
        SurfaceKt.m1174SurfaceNy5ogXk(z, onClick, SemanticsModifierKt.semantics$default(modifier2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ChipKt$FilterChip$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                SemanticsPropertiesKt.m3397setRolekuIjeqM(semantics, Role.INSTANCE.m3385getCheckboxo7Vup1c());
            }
        }, 1, null), false, shape2, selectableChipColors2.backgroundColor(z4, z, startRestartGroup, i18222).getValue().m1638unboximpl(), Color.m1627copywmQWz5c$default(contentColor222.getValue().m1638unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, 0.0f, mutableInteractionSource3, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(startRestartGroup, 722126431, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$FilterChip$3
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

            public final void invoke(Composer composer3, int i21) {
                ComposerKt.sourceInformation(composer3, "C209@9597L3645:Chip.kt#jmzs0o");
                if ((i21 & 11) != 2 || !composer3.getSkipping()) {
                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1630getAlphaimpl(contentColor222.getValue().m1638unboximpl())))};
                    final Function2<? super Composer, ? super Integer, Unit> function215 = function212222;
                    final boolean z7 = z;
                    final Function2<? super Composer, ? super Integer, Unit> function216 = function213222;
                    final Function2<? super Composer, ? super Integer, Unit> function217 = function214222;
                    final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3 = content;
                    final int i22 = i19222;
                    final SelectableChipColors selectableChipColors4 = selectableChipColors3;
                    final boolean z8 = z6222;
                    final int i23 = i20222;
                    final State<Color> state = contentColor222;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1582291359, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$FilterChip$3.1
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

                        public final void invoke(Composer composer4, int i24) {
                            ComposerKt.sourceInformation(composer4, "C211@9745L10,210@9689L3543:Chip.kt#jmzs0o");
                            if ((i24 & 11) != 2 || !composer4.getSkipping()) {
                                TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer4, 6).getBody2();
                                final Function2<? super Composer, ? super Integer, Unit> function218 = function215;
                                final boolean z9 = z7;
                                final Function2<? super Composer, ? super Integer, Unit> function219 = function216;
                                final Function2<? super Composer, ? super Integer, Unit> function220 = function217;
                                final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32 = function3;
                                final int i25 = i22;
                                final SelectableChipColors selectableChipColors5 = selectableChipColors4;
                                final boolean z10 = z8;
                                final int i26 = i23;
                                final State<Color> state2 = state;
                                TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer4, -1543702066, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.FilterChip.3.1.1
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

                                    public final void invoke(Composer composer5, int i27) {
                                        float m3840constructorimpl;
                                        float m3840constructorimpl2;
                                        float f;
                                        RowScopeInstance rowScopeInstance;
                                        float f2;
                                        int i28;
                                        float f3;
                                        float f4;
                                        float f5;
                                        ComposerKt.sourceInformation(composer5, "C213@9794L3424:Chip.kt#jmzs0o");
                                        if ((i27 & 11) != 2 || !composer5.getSkipping()) {
                                            Modifier m446defaultMinSizeVpY3zN4$default = SizeKt.m446defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, ChipDefaults.INSTANCE.m959getMinHeightD9Ej5fM(), 1, null);
                                            if (function218 == null && (!z9 || function219 == null)) {
                                                m3840constructorimpl = ChipKt.HorizontalPadding;
                                            } else {
                                                m3840constructorimpl = Dp.m3840constructorimpl(0);
                                            }
                                            float f6 = m3840constructorimpl;
                                            if (function220 == null) {
                                                m3840constructorimpl2 = ChipKt.HorizontalPadding;
                                            } else {
                                                m3840constructorimpl2 = Dp.m3840constructorimpl(0);
                                            }
                                            Modifier m424paddingqDBjuR0$default = PaddingKt.m424paddingqDBjuR0$default(m446defaultMinSizeVpY3zN4$default, f6, 0.0f, m3840constructorimpl2, 0.0f, 10, null);
                                            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                            Function2<Composer, Integer, Unit> function221 = function218;
                                            boolean z11 = z9;
                                            Function2<Composer, Integer, Unit> function222 = function219;
                                            Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                            int i29 = i25;
                                            Function2<Composer, Integer, Unit> function223 = function220;
                                            SelectableChipColors selectableChipColors6 = selectableChipColors5;
                                            boolean z12 = z10;
                                            int i30 = i26;
                                            State<Color> state3 = state2;
                                            composer5.startReplaceableGroup(693286680);
                                            ComposerKt.sourceInformation(composer5, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer5, 54);
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
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m424paddingqDBjuR0$default);
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
                                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                            composer5.startReplaceableGroup(1218705642);
                                            ComposerKt.sourceInformation(composer5, "C275@12946L9,277@13028L43,278@13096L14,279@13135L43:Chip.kt#jmzs0o");
                                            composer5.startReplaceableGroup(-1943412137);
                                            ComposerKt.sourceInformation(composer5, "236@10806L47,237@10878L1955,273@12858L45");
                                            if (function221 != null || (z11 && function222 != null)) {
                                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                                f = ChipKt.LeadingIconStartSpacing;
                                                SpacerKt.Spacer(SizeKt.m466width3ABfNKs(companion2, f), composer5, 6);
                                                composer5.startReplaceableGroup(733328855);
                                                ComposerKt.sourceInformation(composer5, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer5, 0);
                                                composer5.startReplaceableGroup(-1323940314);
                                                ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume4 = composer5.consume(localDensity2);
                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                Density density2 = (Density) consume4;
                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume5 = composer5.consume(localLayoutDirection2);
                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
                                                rowScopeInstance = rowScopeInstance2;
                                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume6 = composer5.consume(localViewConfiguration2);
                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
                                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(companion3);
                                                if (!(composer5.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer5.startReusableNode();
                                                if (composer5.getInserting()) {
                                                    composer5.createNode(constructor2);
                                                } else {
                                                    composer5.useNode();
                                                }
                                                composer5.disableReusing();
                                                Composer m1283constructorimpl2 = Updater.m1283constructorimpl(composer5);
                                                Updater.m1290setimpl(m1283constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m1290setimpl(m1283constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                                                Updater.m1290setimpl(m1283constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                Updater.m1290setimpl(m1283constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                composer5.enableReusing();
                                                materializerOf2.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer5)), composer5, 0);
                                                composer5.startReplaceableGroup(2058660585);
                                                composer5.startReplaceableGroup(-2137368960);
                                                ComposerKt.sourceInformation(composer5, "C72@3384L9:Box.kt#2w3rfo");
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                composer5.startReplaceableGroup(-626917591);
                                                ComposerKt.sourceInformation(composer5, "C:Chip.kt#jmzs0o");
                                                composer5.startReplaceableGroup(649985595);
                                                ComposerKt.sourceInformation(composer5, "239@11001L141,243@11175L297");
                                                if (function221 != null) {
                                                    State<Color> leadingIconColor = selectableChipColors6.leadingIconColor(z12, z11, composer5, ((i30 >> 9) & 14) | ((i30 << 3) & 112) | ((i30 >> 15) & 896));
                                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(leadingIconColor.getValue()), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1630getAlphaimpl(leadingIconColor.getValue().m1638unboximpl())))}, function221, composer5, ((i30 >> 21) & 112) | 8);
                                                }
                                                composer5.endReplaceableGroup();
                                                composer5.startReplaceableGroup(-1943411323);
                                                ComposerKt.sourceInformation(composer5, "262@12326L451");
                                                if (z11 && function222 != null) {
                                                    Modifier.Companion companion4 = Modifier.INSTANCE;
                                                    long m1638unboximpl = state3.getValue().m1638unboximpl();
                                                    composer5.startReplaceableGroup(649986426);
                                                    ComposerKt.sourceInformation(composer5, "260@12219L34");
                                                    if (function221 != null) {
                                                        Modifier.Companion companion5 = Modifier.INSTANCE;
                                                        f3 = ChipKt.SelectedIconContainerSize;
                                                        companion4 = ClipKt.clip(BackgroundKt.m172backgroundbw27NRU(SizeKt.m453requiredSize3ABfNKs(companion5, f3), state3.getValue().m1638unboximpl(), RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape());
                                                        m1638unboximpl = selectableChipColors6.backgroundColor(z12, z11, composer5, ((i30 >> 9) & 14) | ((i30 << 3) & 112) | ((i30 >> 15) & 896)).getValue().m1638unboximpl();
                                                    }
                                                    composer5.endReplaceableGroup();
                                                    Alignment center = Alignment.INSTANCE.getCenter();
                                                    composer5.startReplaceableGroup(733328855);
                                                    ComposerKt.sourceInformation(composer5, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                    MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer5, 6);
                                                    composer5.startReplaceableGroup(-1323940314);
                                                    ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                    ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                                                    ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume7 = composer5.consume(localDensity3);
                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                    Density density3 = (Density) consume7;
                                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
                                                    ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume8 = composer5.consume(localLayoutDirection3);
                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                    LayoutDirection layoutDirection3 = (LayoutDirection) consume8;
                                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration3 = CompositionLocalsKt.getLocalViewConfiguration();
                                                    ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume9 = composer5.consume(localViewConfiguration3);
                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                    ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume9;
                                                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(companion4);
                                                    if (!(composer5.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer5.startReusableNode();
                                                    if (composer5.getInserting()) {
                                                        composer5.createNode(constructor3);
                                                    } else {
                                                        composer5.useNode();
                                                    }
                                                    composer5.disableReusing();
                                                    Composer m1283constructorimpl3 = Updater.m1283constructorimpl(composer5);
                                                    Updater.m1290setimpl(m1283constructorimpl3, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    Updater.m1290setimpl(m1283constructorimpl3, density3, ComposeUiNode.INSTANCE.getSetDensity());
                                                    Updater.m1290setimpl(m1283constructorimpl3, layoutDirection3, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                    Updater.m1290setimpl(m1283constructorimpl3, viewConfiguration3, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                    composer5.enableReusing();
                                                    materializerOf3.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer5)), composer5, 0);
                                                    composer5.startReplaceableGroup(2058660585);
                                                    composer5.startReplaceableGroup(-2137368960);
                                                    ComposerKt.sourceInformation(composer5, "C72@3384L9:Box.kt#2w3rfo");
                                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                    composer5.startReplaceableGroup(-370889391);
                                                    ComposerKt.sourceInformation(composer5, "C266@12539L204:Chip.kt#jmzs0o");
                                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(m1638unboximpl))}, function222, composer5, ((i30 >> 24) & 112) | 8);
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endNode();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                }
                                                composer5.endReplaceableGroup();
                                                composer5.endReplaceableGroup();
                                                composer5.endReplaceableGroup();
                                                composer5.endReplaceableGroup();
                                                composer5.endNode();
                                                composer5.endReplaceableGroup();
                                                composer5.endReplaceableGroup();
                                                Modifier.Companion companion6 = Modifier.INSTANCE;
                                                f2 = ChipKt.LeadingIconEndSpacing;
                                                Modifier m466width3ABfNKs = SizeKt.m466width3ABfNKs(companion6, f2);
                                                i28 = 6;
                                                SpacerKt.Spacer(m466width3ABfNKs, composer5, 6);
                                            } else {
                                                rowScopeInstance = rowScopeInstance2;
                                                i28 = 6;
                                            }
                                            composer5.endReplaceableGroup();
                                            function33.invoke(rowScopeInstance, composer5, Integer.valueOf((i29 & 112) | i28));
                                            if (function223 != null) {
                                                Modifier.Companion companion7 = Modifier.INSTANCE;
                                                f4 = ChipKt.TrailingIconSpacing;
                                                SpacerKt.Spacer(SizeKt.m466width3ABfNKs(companion7, f4), composer5, i28);
                                                function223.invoke(composer5, Integer.valueOf(i29 & 14));
                                                Modifier.Companion companion8 = Modifier.INSTANCE;
                                                f5 = ChipKt.TrailingIconSpacing;
                                                SpacerKt.Spacer(SizeKt.m466width3ABfNKs(companion8, f5), composer5, i28);
                                            }
                                            composer5.endReplaceableGroup();
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
        }), composer2, (i14 & 126) | ((i14 >> 3) & 57344) | (i17222 & 29360128) | ((i14 << 15) & 1879048192), 6, 264);
        mutableInteractionSource4 = mutableInteractionSource3;
        shape3 = shape2;
        borderStroke3 = borderStroke2;
        function27 = function25;
        function28 = function26;
        function29 = function24;
        z5 = z6222;
        modifier3 = modifier4222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Chip$lambda-1, reason: not valid java name */
    public static final long m964Chip$lambda1(State<Color> state) {
        return state.getValue().m1638unboximpl();
    }

    static {
        float f = 8;
        LeadingIconEndSpacing = Dp.m3840constructorimpl(f);
        TrailingIconSpacing = Dp.m3840constructorimpl(f);
    }
}
