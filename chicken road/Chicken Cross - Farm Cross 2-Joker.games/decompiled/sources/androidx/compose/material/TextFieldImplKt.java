package androidx.compose.material;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
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
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextFieldImpl.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aß\u0001\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\f2\u0011\u0010$\u001a\r\u0012\u0004\u0012\u00020 0%¢\u0006\u0002\b&2\u0006\u0010'\u001a\u00020(2\u0013\u0010)\u001a\u000f\u0012\u0004\u0012\u00020 \u0018\u00010%¢\u0006\u0002\b&2\u0015\b\u0002\u0010*\u001a\u000f\u0012\u0004\u0012\u00020 \u0018\u00010%¢\u0006\u0002\b&2\u0015\b\u0002\u0010+\u001a\u000f\u0012\u0004\u0012\u00020 \u0018\u00010%¢\u0006\u0002\b&2\u0015\b\u0002\u0010,\u001a\u000f\u0012\u0004\u0012\u00020 \u0018\u00010%¢\u0006\u0002\b&2\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u00100\u001a\u00020.2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0015\b\u0002\u00107\u001a\u000f\u0012\u0004\u0012\u00020 \u0018\u00010%¢\u0006\u0002\b&H\u0001¢\u0006\u0002\u00108\u001aW\u00109\u001a\u00020 2\u0006\u0010:\u001a\u00020;2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?2 \u0010@\u001a\u001c\u0012\u0004\u0012\u00020 0%¢\u0006\u0002\b&¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\u0003\u0010\u0000H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bC\u0010D\u001a\u0012\u0010E\u001a\u00020\u00012\b\u0010F\u001a\u0004\u0018\u00010GH\u0000\u001a\u0012\u0010H\u001a\u00020\u00012\b\u0010F\u001a\u0004\u0018\u00010GH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0019\u0010\u0002\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\"\u000e\u0010\u000b\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u0019\u0010\u0012\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0013\u0010\u0005\"\u000e\u0010\u0014\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u0019\u0010\u0015\u001a\u00020\u0016X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u001b*\u00020\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006I"}, d2 = {"AnimationDuration", "", "HorizontalIconPadding", "Landroidx/compose/ui/unit/Dp;", "getHorizontalIconPadding", "()F", "F", "IconDefaultSizeModifier", "Landroidx/compose/ui/Modifier;", "getIconDefaultSizeModifier", "()Landroidx/compose/ui/Modifier;", "LabelId", "", "LeadingId", "PlaceholderAnimationDelayOrDuration", "PlaceholderAnimationDuration", "PlaceholderId", "TextFieldId", "TextFieldPadding", "getTextFieldPadding", "TrailingId", "ZeroConstraints", "Landroidx/compose/ui/unit/Constraints;", "getZeroConstraints", "()J", "J", "layoutId", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getLayoutId", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;", "CommonDecorationBox", "", "type", "Landroidx/compose/material/TextFieldType;", "value", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "label", "placeholder", "leadingIcon", "trailingIcon", "singleLine", "", "enabled", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "colors", "Landroidx/compose/material/TextFieldColors;", OutlinedTextFieldKt.BorderId, "(Landroidx/compose/material/TextFieldType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material/TextFieldColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Decoration", "contentColor", "Landroidx/compose/ui/graphics/Color;", "typography", "Landroidx/compose/ui/text/TextStyle;", "contentAlpha", "", "content", "Landroidx/compose/runtime/ComposableOpenTarget;", "index", "Decoration-euL9pac", "(JLandroidx/compose/ui/text/TextStyle;Ljava/lang/Float;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "heightOrZero", "placeable", "Landroidx/compose/ui/layout/Placeable;", "widthOrZero", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldImplKt {
    public static final int AnimationDuration = 150;
    private static final Modifier IconDefaultSizeModifier;
    public static final String LabelId = "Label";
    public static final String LeadingId = "Leading";
    private static final int PlaceholderAnimationDelayOrDuration = 67;
    private static final int PlaceholderAnimationDuration = 83;
    public static final String PlaceholderId = "Hint";
    public static final String TextFieldId = "TextField";
    public static final String TrailingId = "Trailing";
    private static final long ZeroConstraints = ConstraintsKt.Constraints(0, 0, 0, 0);
    private static final float TextFieldPadding = Dp.m3840constructorimpl(16);
    private static final float HorizontalIconPadding = Dp.m3840constructorimpl(12);

    public static final void CommonDecorationBox(final TextFieldType type, final String value, final Function2<? super Composer, ? super Integer, Unit> innerTextField, final VisualTransformation visualTransformation, final Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z, boolean z2, boolean z3, final InteractionSource interactionSource, final PaddingValues contentPadding, final TextFieldColors colors, Function2<? super Composer, ? super Integer, Unit> function25, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        InputPhase inputPhase;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final boolean z4;
        final boolean z5;
        final boolean z6;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Composer startRestartGroup = composer.startRestartGroup(-712568069);
        ComposerKt.sourceInformation(startRestartGroup, "C(CommonDecorationBox)P(12,13,4,14,7,9,8,11,10,3,6,5,2,1)80@3167L105,84@3322L25,101@3932L10,*113@4554L10,114@4648L22,108@4267L5060:TextFieldImpl.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(type) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changed(value) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changed(innerTextField) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 7168) == 0) {
            i4 |= startRestartGroup.changed(visualTransformation) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 57344) == 0) {
            i4 |= startRestartGroup.changed(function2) ? 16384 : 8192;
        }
        int i6 = i3 & 32;
        if (i6 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & 458752) == 0) {
            i4 |= startRestartGroup.changed(function22) ? 131072 : 65536;
        }
        int i7 = i3 & 64;
        if (i7 != 0) {
            i4 |= 1572864;
        } else if ((i & 3670016) == 0) {
            i4 |= startRestartGroup.changed(function23) ? 1048576 : 524288;
        }
        int i8 = i3 & 128;
        if (i8 != 0) {
            i4 |= 12582912;
        } else if ((i & 29360128) == 0) {
            i4 |= startRestartGroup.changed(function24) ? 8388608 : 4194304;
        }
        int i9 = i3 & 256;
        if (i9 != 0) {
            i4 |= 100663296;
        } else if ((i & 234881024) == 0) {
            i4 |= startRestartGroup.changed(z) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i10 = i3 & 512;
        if (i10 != 0) {
            i4 |= C.ENCODING_PCM_32BIT;
        } else if ((i & 1879048192) == 0) {
            i4 |= startRestartGroup.changed(z2) ? 536870912 : 268435456;
        }
        final int i11 = i4;
        int i12 = i3 & 1024;
        if (i12 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = i2 | (startRestartGroup.changed(z3) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i3 & 2048) != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= startRestartGroup.changed(interactionSource) ? 32 : 16;
        }
        int i13 = i5;
        if ((i3 & 4096) != 0) {
            i13 |= 384;
        } else if ((i2 & 896) == 0) {
            i13 |= startRestartGroup.changed(contentPadding) ? 256 : 128;
        }
        if ((i3 & 8192) != 0) {
            i13 |= 3072;
        } else if ((i2 & 7168) == 0) {
            i13 |= startRestartGroup.changed(colors) ? 2048 : 1024;
        }
        int i14 = i3 & 16384;
        if (i14 != 0) {
            i13 |= 24576;
        } else if ((i2 & 57344) == 0) {
            i13 |= startRestartGroup.changed(function25) ? 16384 : 8192;
        }
        if ((i11 & 1533916891) != 306783378 || (46811 & i13) != 9362 || !startRestartGroup.getSkipping()) {
            Function2<? super Composer, ? super Integer, Unit> function210 = i6 != 0 ? null : function22;
            Function2<? super Composer, ? super Integer, Unit> function211 = i7 != 0 ? null : function23;
            Function2<? super Composer, ? super Integer, Unit> function212 = i8 != 0 ? null : function24;
            boolean z7 = i9 != 0 ? false : z;
            boolean z8 = i10 != 0 ? true : z2;
            boolean z9 = i12 != 0 ? false : z3;
            Function2<? super Composer, ? super Integer, Unit> function213 = i14 != 0 ? null : function25;
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(value) | startRestartGroup.changed(visualTransformation);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = visualTransformation.filter(new AnnotatedString(value, null, null, 6, null));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            final String text = ((TransformedText) rememberedValue).getText().getText();
            if (FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, (i13 >> 3) & 14).getValue().booleanValue()) {
                inputPhase = InputPhase.Focused;
            } else {
                inputPhase = text.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
            }
            InputPhase inputPhase2 = inputPhase;
            final boolean z10 = z8;
            final boolean z11 = z9;
            final int i15 = i13;
            Function3<InputPhase, Composer, Integer, Color> function3 = new Function3<InputPhase, Composer, Integer, Color>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$labelColor$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Color invoke(InputPhase inputPhase3, Composer composer3, Integer num) {
                    return Color.m1618boximpl(m1232invokeXeAY9LY(inputPhase3, composer3, num.intValue()));
                }

                /* renamed from: invoke-XeAY9LY, reason: not valid java name */
                public final long m1232invokeXeAY9LY(InputPhase it, Composer composer3, int i16) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    composer3.startReplaceableGroup(697243846);
                    ComposerKt.sourceInformation(composer3, "C92@3610L273:TextFieldImpl.kt#jmzs0o");
                    TextFieldColors textFieldColors = TextFieldColors.this;
                    boolean z12 = z10;
                    boolean z13 = it == InputPhase.UnfocusedEmpty ? false : z11;
                    InteractionSource interactionSource2 = interactionSource;
                    int i17 = (i11 >> 27) & 14;
                    int i18 = i15;
                    long m1638unboximpl = textFieldColors.labelColor(z12, z13, interactionSource2, composer3, i17 | ((i18 << 3) & 896) | (i18 & 7168)).getValue().m1638unboximpl();
                    composer3.endReplaceableGroup();
                    return m1638unboximpl;
                }
            };
            Typography typography = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
            TextStyle subtitle1 = typography.getSubtitle1();
            TextStyle caption = typography.getCaption();
            boolean z12 = (Color.m1629equalsimpl0(subtitle1.m3502getColor0d7_KjU(), Color.INSTANCE.m1664getUnspecified0d7_KjU()) && !Color.m1629equalsimpl0(caption.m3502getColor0d7_KjU(), Color.INSTANCE.m1664getUnspecified0d7_KjU())) || (!Color.m1629equalsimpl0(subtitle1.m3502getColor0d7_KjU(), Color.INSTANCE.m1664getUnspecified0d7_KjU()) && Color.m1629equalsimpl0(caption.m3502getColor0d7_KjU(), Color.INSTANCE.m1664getUnspecified0d7_KjU()));
            TextFieldTransitionScope textFieldTransitionScope = TextFieldTransitionScope.INSTANCE;
            startRestartGroup.startReplaceableGroup(2129141006);
            ComposerKt.sourceInformation(startRestartGroup, "*110@4363L10,111@4455L22");
            long m3502getColor0d7_KjU = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getCaption().m3502getColor0d7_KjU();
            if (z12 && m3502getColor0d7_KjU == Color.INSTANCE.m1664getUnspecified0d7_KjU()) {
                m3502getColor0d7_KjU = function3.invoke(inputPhase2, startRestartGroup, 0).m1638unboximpl();
            }
            long j = m3502getColor0d7_KjU;
            startRestartGroup.endReplaceableGroup();
            long m3502getColor0d7_KjU2 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getSubtitle1().m3502getColor0d7_KjU();
            if (z12 && m3502getColor0d7_KjU2 == Color.INSTANCE.m1664getUnspecified0d7_KjU()) {
                m3502getColor0d7_KjU2 = function3.invoke(inputPhase2, startRestartGroup, 0).m1638unboximpl();
            }
            final Function2<? super Composer, ? super Integer, Unit> function214 = function210;
            final boolean z13 = z9;
            final int i16 = i13;
            final boolean z14 = z8;
            final Function2<? super Composer, ? super Integer, Unit> function215 = function211;
            final Function2<? super Composer, ? super Integer, Unit> function216 = function212;
            final boolean z15 = z7;
            final boolean z16 = z12;
            final Function2<? super Composer, ? super Integer, Unit> function217 = function213;
            composer2 = startRestartGroup;
            textFieldTransitionScope.m1241TransitionDTcfvLk(inputPhase2, j, m3502getColor0d7_KjU2, function3, function2 != null, ComposableLambdaKt.composableLambda(composer2, 341865432, true, new Function6<Float, Color, Color, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3

                /* compiled from: TextFieldImpl.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[TextFieldType.values().length];
                        iArr[TextFieldType.Filled.ordinal()] = 1;
                        iArr[TextFieldType.Outlined.ordinal()] = 2;
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(6);
                }

                @Override // kotlin.jvm.functions.Function6
                public /* bridge */ /* synthetic */ Unit invoke(Float f, Color color, Color color2, Float f2, Composer composer3, Integer num) {
                    m1230invokeRIQooxk(f.floatValue(), color.m1638unboximpl(), color2.m1638unboximpl(), f2.floatValue(), composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r27v0, types: [androidx.compose.runtime.Composer] */
                /* JADX WARN: Type inference failed for: r5v14, types: [kotlin.jvm.functions.Function2] */
                /* JADX WARN: Type inference failed for: r5v23, types: [kotlin.jvm.functions.Function2] */
                /* JADX WARN: Type inference failed for: r6v5 */
                /* JADX WARN: Type inference failed for: r6v6, types: [kotlin.jvm.functions.Function2] */
                /* JADX WARN: Type inference failed for: r6v7 */
                /* renamed from: invoke-RIQooxk, reason: not valid java name */
                public final void m1230invokeRIQooxk(final float f, final long j2, final long j3, final float f2, Composer composer3, int i17) {
                    int i18;
                    ComposableLambda composableLambda;
                    ComposableLambda composableLambda2;
                    SnapshotMutationPolicy snapshotMutationPolicy;
                    final long m1638unboximpl;
                    final long m1638unboximpl2;
                    ComposerKt.sourceInformation(composer3, "CP(1,2:c#ui.graphics.Color,0:c#ui.graphics.Color)149@6201L30,150@6287L43:TextFieldImpl.kt#jmzs0o");
                    if ((i17 & 14) == 0) {
                        i18 = (composer3.changed(f) ? 4 : 2) | i17;
                    } else {
                        i18 = i17;
                    }
                    if ((i17 & 112) == 0) {
                        i18 |= composer3.changed(j2) ? 32 : 16;
                    }
                    if ((i17 & 896) == 0) {
                        i18 |= composer3.changed(j3) ? 256 : 128;
                    }
                    if ((i17 & 7168) == 0) {
                        i18 |= composer3.changed(f2) ? 2048 : 1024;
                    }
                    final int i19 = i18;
                    if ((46811 & i19) != 9362 || !composer3.getSkipping()) {
                        final Function2<Composer, Integer, Unit> function218 = function2;
                        if (function218 != null) {
                            final boolean z17 = z16;
                            composableLambda = ComposableLambdaKt.composableLambda(composer3, 362863774, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
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

                                public final void invoke(Composer composer4, int i20) {
                                    TextStyle textStyle;
                                    TextStyle m3497copyHL5avdY;
                                    ComposerKt.sourceInformation(composer4, "C*123@5027L10,124@5083L10,129@5294L55:TextFieldImpl.kt#jmzs0o");
                                    if ((i20 & 11) != 2 || !composer4.getSkipping()) {
                                        TextStyle lerp = TextStyleKt.lerp(MaterialTheme.INSTANCE.getTypography(composer4, 6).getSubtitle1(), MaterialTheme.INSTANCE.getTypography(composer4, 6).getCaption(), f);
                                        boolean z18 = z17;
                                        long j4 = j2;
                                        if (z18) {
                                            m3497copyHL5avdY = lerp.m3497copyHL5avdY((r42 & 1) != 0 ? lerp.spanStyle.m3459getColor0d7_KjU() : j4, (r42 & 2) != 0 ? lerp.spanStyle.getFontSize() : 0L, (r42 & 4) != 0 ? lerp.spanStyle.getFontWeight() : null, (r42 & 8) != 0 ? lerp.spanStyle.getFontStyle() : null, (r42 & 16) != 0 ? lerp.spanStyle.getFontSynthesis() : null, (r42 & 32) != 0 ? lerp.spanStyle.getFontFamily() : null, (r42 & 64) != 0 ? lerp.spanStyle.getFontFeatureSettings() : null, (r42 & 128) != 0 ? lerp.spanStyle.getLetterSpacing() : 0L, (r42 & 256) != 0 ? lerp.spanStyle.getBaselineShift() : null, (r42 & 512) != 0 ? lerp.spanStyle.getTextGeometricTransform() : null, (r42 & 1024) != 0 ? lerp.spanStyle.getLocaleList() : null, (r42 & 2048) != 0 ? lerp.spanStyle.getBackground() : 0L, (r42 & 4096) != 0 ? lerp.spanStyle.getTextDecoration() : null, (r42 & 8192) != 0 ? lerp.spanStyle.getShadow() : null, (r42 & 16384) != 0 ? lerp.paragraphStyle.getTextAlign() : null, (r42 & 32768) != 0 ? lerp.paragraphStyle.getTextDirection() : null, (r42 & 65536) != 0 ? lerp.paragraphStyle.getLineHeight() : 0L, (r42 & 131072) != 0 ? lerp.paragraphStyle.getTextIndent() : null);
                                            textStyle = m3497copyHL5avdY;
                                        } else {
                                            textStyle = lerp;
                                        }
                                        TextFieldImplKt.m1229DecorationeuL9pac(j3, textStyle, null, function218, composer4, ((i19 >> 6) & 14) | 384, 0);
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            });
                        } else {
                            composableLambda = null;
                        }
                        if (function214 == null || text.length() != 0) {
                            composableLambda2 = null;
                        } else {
                            final TextFieldColors textFieldColors = colors;
                            final boolean z18 = z14;
                            final int i20 = i11;
                            final int i21 = i16;
                            final Function2<Composer, Integer, Unit> function219 = function214;
                            composableLambda2 = ComposableLambdaKt.composableLambda(composer3, 1120552650, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer4, Integer num) {
                                    invoke(modifier, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Modifier modifier, Composer composer4, int i22) {
                                    Intrinsics.checkNotNullParameter(modifier, "modifier");
                                    ComposerKt.sourceInformation(composer4, "C136@5575L341:TextFieldImpl.kt#jmzs0o");
                                    if ((i22 & 14) == 0) {
                                        i22 |= composer4.changed(modifier) ? 4 : 2;
                                    }
                                    if ((i22 & 91) != 18 || !composer4.getSkipping()) {
                                        Modifier alpha = AlphaKt.alpha(modifier, f2);
                                        TextFieldColors textFieldColors2 = textFieldColors;
                                        boolean z19 = z18;
                                        int i23 = i20;
                                        int i24 = i21;
                                        Function2<Composer, Integer, Unit> function220 = function219;
                                        composer4.startReplaceableGroup(733328855);
                                        ComposerKt.sourceInformation(composer4, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer4, 0);
                                        composer4.startReplaceableGroup(-1323940314);
                                        ComposerKt.sourceInformation(composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                        ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume = composer4.consume(localDensity);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        Density density = (Density) consume;
                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                        ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume2 = composer4.consume(localLayoutDirection);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        LayoutDirection layoutDirection = (LayoutDirection) consume2;
                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                        ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume3 = composer4.consume(localViewConfiguration);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(alpha);
                                        if (!(composer4.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        composer4.disableReusing();
                                        Composer m1283constructorimpl = Updater.m1283constructorimpl(composer4);
                                        Updater.m1290setimpl(m1283constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                        Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                        Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                        composer4.enableReusing();
                                        materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer4)), composer4, 0);
                                        composer4.startReplaceableGroup(2058660585);
                                        composer4.startReplaceableGroup(-2137368960);
                                        ComposerKt.sourceInformation(composer4, "C72@3384L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        composer4.startReplaceableGroup(1188063364);
                                        ComposerKt.sourceInformation(composer4, "C138@5709L25,139@5797L10,137@5647L247:TextFieldImpl.kt#jmzs0o");
                                        TextFieldImplKt.m1229DecorationeuL9pac(textFieldColors2.placeholderColor(z19, composer4, ((i23 >> 27) & 14) | ((i24 >> 6) & 112)).getValue().m1638unboximpl(), MaterialTheme.INSTANCE.getTypography(composer4, 6).getSubtitle1(), null, function220, composer4, (i23 >> 6) & 7168, 4);
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endNode();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            });
                        }
                        final String m1170getString4foXLRw = Strings_androidKt.m1170getString4foXLRw(Strings.INSTANCE.m1165getDefaultErrorMessageUdPEhr4(), composer3, 6);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Boolean valueOf = Boolean.valueOf(z13);
                        final boolean z19 = z13;
                        composer3.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(composer3, "C(remember)P(1,2):Composables.kt#9igjgp");
                        boolean changed2 = composer3.changed(valueOf) | composer3.changed(m1170getString4foXLRw);
                        Object rememberedValue2 = composer3.rememberedValue();
                        if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semantics) {
                                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                    if (z19) {
                                        SemanticsPropertiesKt.error(semantics, m1170getString4foXLRw);
                                    }
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue2);
                        }
                        composer3.endReplaceableGroup();
                        Modifier semantics$default = SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue2, 1, null);
                        if (colors instanceof TextFieldColorsWithIcons) {
                            composer3.startReplaceableGroup(-1083197894);
                            ComposerKt.sourceInformation(composer3, "153@6424L53");
                            TextFieldColorsWithIcons textFieldColorsWithIcons = (TextFieldColorsWithIcons) colors;
                            boolean z20 = z14;
                            boolean z21 = z13;
                            InteractionSource interactionSource2 = interactionSource;
                            int i22 = (i11 >> 27) & 14;
                            int i23 = i16;
                            snapshotMutationPolicy = null;
                            m1638unboximpl = textFieldColorsWithIcons.leadingIconColor(z20, z21, interactionSource2, composer3, ((i23 << 3) & 896) | i22 | ((i23 << 3) & 112)).getValue().m1638unboximpl();
                            composer3.endReplaceableGroup();
                        } else {
                            snapshotMutationPolicy = null;
                            composer3.startReplaceableGroup(-1083197798);
                            ComposerKt.sourceInformation(composer3, "155@6520L34");
                            TextFieldColors textFieldColors2 = colors;
                            boolean z22 = z14;
                            boolean z23 = z13;
                            int i24 = (i11 >> 27) & 14;
                            int i25 = i16;
                            m1638unboximpl = textFieldColors2.leadingIconColor(z22, z23, composer3, i24 | ((i25 << 3) & 112) | ((i25 >> 3) & 896)).getValue().m1638unboximpl();
                            composer3.endReplaceableGroup();
                        }
                        Object composableLambda3 = function215 != null ? ComposableLambdaKt.composableLambda(composer3, 1505327088, true, new Function2<Composer, Integer, Unit>
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: TERNARY (r18v1 'composableLambda3' java.lang.Object) = ((wrap:kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>:0x0184: IGET (r20v0 'this' androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3 A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] (LINE:158) androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3.$leadingIcon kotlin.jvm.functions.Function2) != (null kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>)) ? (wrap:java.lang.Object:0x0190: INVOKE 
                              (r27v0 'composer3' ?? I:androidx.compose.runtime.Composer)
                              (1505327088 int)
                              true
                              (wrap:kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>:0x018a: CONSTRUCTOR (r1v18 'm1638unboximpl' long A[DONT_INLINE]), (r3 I:kotlin.jvm.functions.Function2 A[DONT_INLINE]) A[DONT_GENERATE, MD:(long, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>):void (m), REMOVE, WRAPPED] (LINE:159) call: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1.<init>(long, kotlin.jvm.functions.Function2):void type: CONSTRUCTOR)
                             STATIC call: androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(androidx.compose.runtime.Composer, int, boolean, java.lang.Object):androidx.compose.runtime.internal.ComposableLambda A[DONT_GENERATE, MD:(androidx.compose.runtime.Composer, int, boolean, java.lang.Object):androidx.compose.runtime.internal.ComposableLambda (m), REMOVE, WRAPPED] (LINE:159)) : (r8v3 'snapshotMutationPolicy' androidx.compose.runtime.SnapshotMutationPolicy) in method: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3.invoke-RIQooxk(float, long, long, float, androidx.compose.runtime.Composer, int):void, file: classes.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because the return value of "jadx.core.dex.instructions.args.RegisterArg.getSVar()" is null
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:836)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                            	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1187)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:536)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 23 more
                            */
                        /*
                            Method dump skipped, instructions count: 826
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3.m1230invokeRIQooxk(float, long, long, float, androidx.compose.runtime.Composer, int):void");
                    }
                }), composer2, 1769472);
                function26 = function210;
                function27 = function211;
                function28 = function212;
                z4 = z7;
                z5 = z8;
                z6 = z9;
                function29 = function213;
            } else {
                startRestartGroup.skipToGroupEnd();
                function26 = function22;
                function27 = function23;
                function28 = function24;
                z4 = z;
                z5 = z2;
                z6 = z3;
                function29 = function25;
                composer2 = startRestartGroup;
            }
            ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                return;
            }
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$4
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

                public final void invoke(Composer composer3, int i17) {
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.this, value, innerTextField, visualTransformation, function2, function26, function27, function28, z4, z5, z6, interactionSource, contentPadding, colors, function29, composer3, i | 1, i2, i3);
                }
            });
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0053  */
        /* renamed from: Decoration-euL9pac, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void m1229DecorationeuL9pac(final long j, TextStyle textStyle, Float f, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
            int i3;
            TextStyle textStyle2;
            int i4;
            final Float f2;
            final int i5;
            TextStyle textStyle3;
            final TextStyle textStyle4;
            ScopeUpdateScope endRestartGroup;
            Intrinsics.checkNotNullParameter(content, "content");
            Composer startRestartGroup = composer.startRestartGroup(-399493340);
            ComposerKt.sourceInformation(startRestartGroup, "C(Decoration)P(2:c#ui.graphics.Color,3,1):TextFieldImpl.kt#jmzs0o");
            if ((i2 & 1) != 0) {
                i3 = i | 6;
            } else if ((i & 14) == 0) {
                i3 = (startRestartGroup.changed(j) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
            int i6 = i2 & 2;
            if (i6 != 0) {
                i3 |= 48;
            } else if ((i & 112) == 0) {
                textStyle2 = textStyle;
                i3 |= startRestartGroup.changed(textStyle2) ? 32 : 16;
                i4 = i2 & 4;
                if (i4 == 0) {
                    i3 |= 384;
                } else if ((i & 896) == 0) {
                    f2 = f;
                    i3 |= startRestartGroup.changed(f2) ? 256 : 128;
                    if ((i2 & 8) != 0) {
                        i3 |= 3072;
                    } else if ((i & 7168) == 0) {
                        i3 |= startRestartGroup.changed(content) ? 2048 : 1024;
                    }
                    i5 = i3;
                    if ((i5 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                        textStyle3 = i6 != 0 ? null : textStyle2;
                        Float f3 = i4 != 0 ? null : f2;
                        final Float f4 = f3;
                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 494684590, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1
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

                            public final void invoke(Composer composer2, int i7) {
                                ComposerKt.sourceInformation(composer2, "C238@9719L476:TextFieldImpl.kt#jmzs0o");
                                if ((i7 & 11) != 2 || !composer2.getSkipping()) {
                                    ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(j))};
                                    final Float f5 = f4;
                                    final Function2<Composer, Integer, Unit> function2 = content;
                                    final int i8 = i5;
                                    final long j2 = j;
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, -1132188434, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1.1
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
                                            ComposerKt.sourceInformation(composer3, "C:TextFieldImpl.kt#jmzs0o");
                                            if ((i9 & 11) != 2 || !composer3.getSkipping()) {
                                                if (f5 != null) {
                                                    composer3.startReplaceableGroup(-452622131);
                                                    ComposerKt.sourceInformation(composer3, "240@9843L142");
                                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(f5)}, function2, composer3, ((i8 >> 6) & 112) | 8);
                                                    composer3.endReplaceableGroup();
                                                    return;
                                                }
                                                composer3.startReplaceableGroup(-452621951);
                                                ComposerKt.sourceInformation(composer3, "245@10023L148");
                                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1630getAlphaimpl(j2)))}, function2, composer3, ((i8 >> 6) & 112) | 8);
                                                composer3.endReplaceableGroup();
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    }), composer2, 56);
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        });
                        if (textStyle3 != null) {
                            startRestartGroup.startReplaceableGroup(-2009952864);
                            ComposerKt.sourceInformation(startRestartGroup, "252@10230L46");
                            TextKt.ProvideTextStyle(textStyle3, composableLambda, startRestartGroup, ((i5 >> 3) & 14) | 48);
                        } else {
                            startRestartGroup.startReplaceableGroup(-2009952812);
                            ComposerKt.sourceInformation(startRestartGroup, "252@10282L18");
                            composableLambda.invoke(startRestartGroup, 6);
                        }
                        startRestartGroup.endReplaceableGroup();
                        textStyle4 = textStyle3;
                        f2 = f3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        textStyle4 = textStyle2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$1
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

                        public final void invoke(Composer composer2, int i7) {
                            TextFieldImplKt.m1229DecorationeuL9pac(j, textStyle4, f2, content, composer2, i | 1, i2);
                        }
                    });
                    return;
                }
                f2 = f;
                if ((i2 & 8) != 0) {
                }
                i5 = i3;
                if ((i5 & 5851) == 1170) {
                }
                if (i6 != 0) {
                }
                if (i4 != 0) {
                }
                final Float f42 = f3;
                ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(startRestartGroup, 494684590, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1
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

                    public final void invoke(Composer composer2, int i7) {
                        ComposerKt.sourceInformation(composer2, "C238@9719L476:TextFieldImpl.kt#jmzs0o");
                        if ((i7 & 11) != 2 || !composer2.getSkipping()) {
                            ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(j))};
                            final Float f5 = f42;
                            final Function2<? super Composer, ? super Integer, Unit> function2 = content;
                            final int i8 = i5;
                            final long j2 = j;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, -1132188434, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1.1
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
                                    ComposerKt.sourceInformation(composer3, "C:TextFieldImpl.kt#jmzs0o");
                                    if ((i9 & 11) != 2 || !composer3.getSkipping()) {
                                        if (f5 != null) {
                                            composer3.startReplaceableGroup(-452622131);
                                            ComposerKt.sourceInformation(composer3, "240@9843L142");
                                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(f5)}, function2, composer3, ((i8 >> 6) & 112) | 8);
                                            composer3.endReplaceableGroup();
                                            return;
                                        }
                                        composer3.startReplaceableGroup(-452621951);
                                        ComposerKt.sourceInformation(composer3, "245@10023L148");
                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1630getAlphaimpl(j2)))}, function2, composer3, ((i8 >> 6) & 112) | 8);
                                        composer3.endReplaceableGroup();
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }), composer2, 56);
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                });
                if (textStyle3 != null) {
                }
                startRestartGroup.endReplaceableGroup();
                textStyle4 = textStyle3;
                f2 = f3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            textStyle2 = textStyle;
            i4 = i2 & 4;
            if (i4 == 0) {
            }
            f2 = f;
            if ((i2 & 8) != 0) {
            }
            i5 = i3;
            if ((i5 & 5851) == 1170) {
            }
            if (i6 != 0) {
            }
            if (i4 != 0) {
            }
            final Float f422 = f3;
            ComposableLambda composableLambda22 = ComposableLambdaKt.composableLambda(startRestartGroup, 494684590, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1
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

                public final void invoke(Composer composer2, int i7) {
                    ComposerKt.sourceInformation(composer2, "C238@9719L476:TextFieldImpl.kt#jmzs0o");
                    if ((i7 & 11) != 2 || !composer2.getSkipping()) {
                        ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(j))};
                        final Float f5 = f422;
                        final Function2<? super Composer, ? super Integer, Unit> function2 = content;
                        final int i8 = i5;
                        final long j2 = j;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, -1132188434, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1.1
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
                                ComposerKt.sourceInformation(composer3, "C:TextFieldImpl.kt#jmzs0o");
                                if ((i9 & 11) != 2 || !composer3.getSkipping()) {
                                    if (f5 != null) {
                                        composer3.startReplaceableGroup(-452622131);
                                        ComposerKt.sourceInformation(composer3, "240@9843L142");
                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(f5)}, function2, composer3, ((i8 >> 6) & 112) | 8);
                                        composer3.endReplaceableGroup();
                                        return;
                                    }
                                    composer3.startReplaceableGroup(-452621951);
                                    ComposerKt.sourceInformation(composer3, "245@10023L148");
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1630getAlphaimpl(j2)))}, function2, composer3, ((i8 >> 6) & 112) | 8);
                                    composer3.endReplaceableGroup();
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, 56);
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            });
            if (textStyle3 != null) {
            }
            startRestartGroup.endReplaceableGroup();
            textStyle4 = textStyle3;
            f2 = f3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }

        public static final int widthOrZero(Placeable placeable) {
            if (placeable != null) {
                return placeable.getWidth();
            }
            return 0;
        }

        public static final int heightOrZero(Placeable placeable) {
            if (placeable != null) {
                return placeable.getHeight();
            }
            return 0;
        }

        public static final Object getLayoutId(IntrinsicMeasurable intrinsicMeasurable) {
            Intrinsics.checkNotNullParameter(intrinsicMeasurable, "<this>");
            Object parentData = intrinsicMeasurable.getParentData();
            LayoutIdParentData layoutIdParentData = parentData instanceof LayoutIdParentData ? (LayoutIdParentData) parentData : null;
            if (layoutIdParentData != null) {
                return layoutIdParentData.getLayoutId();
            }
            return null;
        }

        static {
            float f = 48;
            IconDefaultSizeModifier = SizeKt.m445defaultMinSizeVpY3zN4(Modifier.INSTANCE, Dp.m3840constructorimpl(f), Dp.m3840constructorimpl(f));
        }

        public static final long getZeroConstraints() {
            return ZeroConstraints;
        }

        public static final float getTextFieldPadding() {
            return TextFieldPadding;
        }

        public static final float getHorizontalIconPadding() {
            return HorizontalIconPadding;
        }

        public static final Modifier getIconDefaultSizeModifier() {
            return IconDefaultSizeModifier;
        }
    }
