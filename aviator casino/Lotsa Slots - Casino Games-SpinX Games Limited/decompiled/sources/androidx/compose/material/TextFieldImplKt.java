package androidx.compose.material;

/* compiled from: TextFieldImpl.kt */
@kotlin.Metadata(d1 = {"\u0000\u0092\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aß\u0001\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\f2\u0011\u0010$\u001a\r\u0012\u0004\u0012\u00020 0%¢\u0006\u0002\b&2\u0006\u0010'\u001a\u00020(2\u0013\u0010)\u001a\u000f\u0012\u0004\u0012\u00020 \u0018\u00010%¢\u0006\u0002\b&2\u0015\b\u0002\u0010*\u001a\u000f\u0012\u0004\u0012\u00020 \u0018\u00010%¢\u0006\u0002\b&2\u0015\b\u0002\u0010+\u001a\u000f\u0012\u0004\u0012\u00020 \u0018\u00010%¢\u0006\u0002\b&2\u0015\b\u0002\u0010,\u001a\u000f\u0012\u0004\u0012\u00020 \u0018\u00010%¢\u0006\u0002\b&2\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u00100\u001a\u00020.2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0015\b\u0002\u00107\u001a\u000f\u0012\u0004\u0012\u00020 \u0018\u00010%¢\u0006\u0002\b&H\u0001¢\u0006\u0002\u00108\u001aW\u00109\u001a\u00020 2\u0006\u0010:\u001a\u00020;2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?2 \u0010@\u001a\u001c\u0012\u0004\u0012\u00020 0%¢\u0006\u0002\b&¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\u0003\u0010\u0000H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bC\u0010D\u001a\u0012\u0010E\u001a\u00020\u00012\b\u0010F\u001a\u0004\u0018\u00010GH\u0000\u001a\u0012\u0010H\u001a\u00020\u00012\b\u0010F\u001a\u0004\u0018\u00010GH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0019\u0010\u0002\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\"\u000e\u0010\u000b\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u0019\u0010\u0012\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0013\u0010\u0005\"\u000e\u0010\u0014\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u0019\u0010\u0015\u001a\u00020\u0016X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u001b*\u00020\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006I"}, d2 = {"AnimationDuration", "", "HorizontalIconPadding", "Landroidx/compose/ui/unit/Dp;", "getHorizontalIconPadding", "()F", "F", "IconDefaultSizeModifier", "Landroidx/compose/ui/Modifier;", "getIconDefaultSizeModifier", "()Landroidx/compose/ui/Modifier;", "LabelId", "", "LeadingId", "PlaceholderAnimationDelayOrDuration", "PlaceholderAnimationDuration", "PlaceholderId", "TextFieldId", "TextFieldPadding", "getTextFieldPadding", "TrailingId", "ZeroConstraints", "Landroidx/compose/ui/unit/Constraints;", "getZeroConstraints", "()J", "J", "layoutId", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getLayoutId", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;", "CommonDecorationBox", "", "type", "Landroidx/compose/material/TextFieldType;", "value", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "label", "placeholder", "leadingIcon", "trailingIcon", "singleLine", "", "enabled", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "colors", "Landroidx/compose/material/TextFieldColors;", androidx.compose.material.OutlinedTextFieldKt.BorderId, "(Landroidx/compose/material/TextFieldType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material/TextFieldColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Decoration", "contentColor", "Landroidx/compose/ui/graphics/Color;", "typography", "Landroidx/compose/ui/text/TextStyle;", "contentAlpha", "", "content", "Landroidx/compose/runtime/ComposableOpenTarget;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "Decoration-euL9pac", "(JLandroidx/compose/ui/text/TextStyle;Ljava/lang/Float;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "heightOrZero", "placeable", "Landroidx/compose/ui/layout/Placeable;", "widthOrZero", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldImplKt {
    public static final int AnimationDuration = 150;
    private static final androidx.compose.ui.Modifier IconDefaultSizeModifier;
    public static final java.lang.String LabelId = "Label";
    public static final java.lang.String LeadingId = "Leading";
    private static final int PlaceholderAnimationDelayOrDuration = 67;
    private static final int PlaceholderAnimationDuration = 83;
    public static final java.lang.String PlaceholderId = "Hint";
    public static final java.lang.String TextFieldId = "TextField";
    public static final java.lang.String TrailingId = "Trailing";
    private static final long ZeroConstraints = androidx.compose.ui.unit.ConstraintsKt.Constraints(0, 0, 0, 0);
    private static final float TextFieldPadding = androidx.compose.ui.unit.Dp.m4478constructorimpl(16);
    private static final float HorizontalIconPadding = androidx.compose.ui.unit.Dp.m4478constructorimpl(12);

    public static final void CommonDecorationBox(final androidx.compose.material.TextFieldType type, final java.lang.String value, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> innerTextField, final androidx.compose.ui.text.input.VisualTransformation visualTransformation, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24, boolean z, boolean z2, boolean z3, final androidx.compose.foundation.interaction.InteractionSource interactionSource, final androidx.compose.foundation.layout.PaddingValues contentPadding, final androidx.compose.material.TextFieldColors colors, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        androidx.compose.material.InputPhase inputPhase;
        androidx.compose.runtime.Composer composer2;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function26;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function27;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function28;
        final boolean z4;
        final boolean z5;
        final boolean z6;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function29;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(colors, "colors");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-712568069);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(CommonDecorationBox)P(12,13,4,14,7,9,8,11,10,3,6,5,2,1)80@3167L105,84@3322L25,101@3932L10,*113@4554L10,114@4648L22,108@4267L5060:TextFieldImpl.kt#jmzs0o");
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
            i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
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
            i4 |= startRestartGroup.changed(z) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i10 = i3 & 512;
        if (i10 != 0) {
            i4 |= 805306368;
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
            kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function210 = i6 != 0 ? null : function22;
            kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function211 = i7 != 0 ? null : function23;
            kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function212 = i8 != 0 ? null : function24;
            boolean z7 = i9 != 0 ? false : z;
            boolean z8 = i10 != 0 ? true : z2;
            boolean z9 = i12 != 0 ? false : z3;
            kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function213 = i14 != 0 ? null : function25;
            startRestartGroup.startReplaceableGroup(511388516);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(value) | startRestartGroup.changed(visualTransformation);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = visualTransformation.filter(new androidx.compose.ui.text.AnnotatedString(value, null, null, 6, null));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            final java.lang.String text = ((androidx.compose.ui.text.input.TransformedText) rememberedValue).getText().getText();
            if (androidx.compose.foundation.interaction.FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, (i13 >> 3) & 14).getValue().booleanValue()) {
                inputPhase = androidx.compose.material.InputPhase.Focused;
            } else {
                inputPhase = text.length() == 0 ? androidx.compose.material.InputPhase.UnfocusedEmpty : androidx.compose.material.InputPhase.UnfocusedNotEmpty;
            }
            androidx.compose.material.InputPhase inputPhase2 = inputPhase;
            final boolean z10 = z8;
            final boolean z11 = z9;
            final int i15 = i13;
            kotlin.jvm.functions.Function3<androidx.compose.material.InputPhase, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.ui.graphics.Color> function3 = new kotlin.jvm.functions.Function3<androidx.compose.material.InputPhase, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.ui.graphics.Color>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$labelColor$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ androidx.compose.ui.graphics.Color invoke(androidx.compose.material.InputPhase inputPhase3, androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                    return androidx.compose.ui.graphics.Color.m2103boximpl(m1571invokeXeAY9LY(inputPhase3, composer3, num.intValue()));
                }

                /* renamed from: invoke-XeAY9LY, reason: not valid java name */
                public final long m1571invokeXeAY9LY(androidx.compose.material.InputPhase it, androidx.compose.runtime.Composer composer3, int i16) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                    composer3.startReplaceableGroup(697243846);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C92@3610L273:TextFieldImpl.kt#jmzs0o");
                    androidx.compose.material.TextFieldColors textFieldColors = androidx.compose.material.TextFieldColors.this;
                    boolean z12 = z10;
                    boolean z13 = it == androidx.compose.material.InputPhase.UnfocusedEmpty ? false : z11;
                    androidx.compose.foundation.interaction.InteractionSource interactionSource2 = interactionSource;
                    int i17 = (i11 >> 27) & 14;
                    int i18 = i15;
                    long m2123unboximpl = textFieldColors.labelColor(z12, z13, interactionSource2, composer3, i17 | ((i18 << 3) & 896) | (i18 & 7168)).getValue().m2123unboximpl();
                    composer3.endReplaceableGroup();
                    return m2123unboximpl;
                }
            };
            androidx.compose.material.Typography typography = androidx.compose.material.MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
            androidx.compose.ui.text.TextStyle subtitle1 = typography.getSubtitle1();
            androidx.compose.ui.text.TextStyle caption = typography.getCaption();
            boolean z12 = (androidx.compose.ui.graphics.Color.m2114equalsimpl0(subtitle1.m3994getColor0d7_KjU(), androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) && !androidx.compose.ui.graphics.Color.m2114equalsimpl0(caption.m3994getColor0d7_KjU(), androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU())) || (!androidx.compose.ui.graphics.Color.m2114equalsimpl0(subtitle1.m3994getColor0d7_KjU(), androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) && androidx.compose.ui.graphics.Color.m2114equalsimpl0(caption.m3994getColor0d7_KjU(), androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()));
            androidx.compose.material.TextFieldTransitionScope textFieldTransitionScope = androidx.compose.material.TextFieldTransitionScope.INSTANCE;
            startRestartGroup.startReplaceableGroup(2129141006);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "*110@4363L10,111@4455L22");
            long m3994getColor0d7_KjU = androidx.compose.material.MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getCaption().m3994getColor0d7_KjU();
            if (z12 && m3994getColor0d7_KjU == androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) {
                m3994getColor0d7_KjU = function3.invoke(inputPhase2, startRestartGroup, 0).m2123unboximpl();
            }
            long j = m3994getColor0d7_KjU;
            startRestartGroup.endReplaceableGroup();
            long m3994getColor0d7_KjU2 = androidx.compose.material.MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getSubtitle1().m3994getColor0d7_KjU();
            if (z12 && m3994getColor0d7_KjU2 == androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) {
                m3994getColor0d7_KjU2 = function3.invoke(inputPhase2, startRestartGroup, 0).m2123unboximpl();
            }
            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function214 = function210;
            final boolean z13 = z9;
            final int i16 = i13;
            final boolean z14 = z8;
            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function215 = function211;
            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function216 = function212;
            final boolean z15 = z7;
            final boolean z16 = z12;
            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function217 = function213;
            composer2 = startRestartGroup;
            textFieldTransitionScope.m1580TransitionDTcfvLk(inputPhase2, j, m3994getColor0d7_KjU2, function3, function2 != null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, 341865432, true, new kotlin.jvm.functions.Function6<java.lang.Float, androidx.compose.ui.graphics.Color, androidx.compose.ui.graphics.Color, java.lang.Float, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3

                /* compiled from: TextFieldImpl.kt */
                @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[androidx.compose.material.TextFieldType.values().length];
                        iArr[androidx.compose.material.TextFieldType.Filled.ordinal()] = 1;
                        iArr[androidx.compose.material.TextFieldType.Outlined.ordinal()] = 2;
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(6);
                }

                @Override // kotlin.jvm.functions.Function6
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Float f, androidx.compose.ui.graphics.Color color, androidx.compose.ui.graphics.Color color2, java.lang.Float f2, androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                    m1569invokeRIQooxk(f.floatValue(), color.m2123unboximpl(), color2.m2123unboximpl(), f2.floatValue(), composer3, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r27v0, types: [androidx.compose.runtime.Composer] */
                /* JADX WARN: Type inference failed for: r5v14, types: [kotlin.jvm.functions.Function2] */
                /* JADX WARN: Type inference failed for: r5v23, types: [kotlin.jvm.functions.Function2] */
                /* JADX WARN: Type inference failed for: r6v5 */
                /* JADX WARN: Type inference failed for: r6v6, types: [kotlin.jvm.functions.Function2] */
                /* JADX WARN: Type inference failed for: r6v7 */
                /* renamed from: invoke-RIQooxk, reason: not valid java name */
                public final void m1569invokeRIQooxk(final float f, final long j2, final long j3, final float f2, androidx.compose.runtime.Composer composer3, int i17) {
                    int i18;
                    androidx.compose.runtime.internal.ComposableLambda composableLambda;
                    androidx.compose.runtime.internal.ComposableLambda composableLambda2;
                    androidx.compose.runtime.SnapshotMutationPolicy snapshotMutationPolicy;
                    final long m2123unboximpl;
                    final long m2123unboximpl2;
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CP(1,2:c#ui.graphics.Color,0:c#ui.graphics.Color)149@6201L30,150@6287L43:TextFieldImpl.kt#jmzs0o");
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
                        final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function218 = function2;
                        if (function218 != null) {
                            final boolean z17 = z16;
                            composableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 362863774, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                                    invoke(composer4, num.intValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(androidx.compose.runtime.Composer composer4, int i20) {
                                    androidx.compose.ui.text.TextStyle textStyle;
                                    androidx.compose.ui.text.TextStyle m3986copyHL5avdY;
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C*123@5027L10,124@5083L10,129@5294L55:TextFieldImpl.kt#jmzs0o");
                                    if ((i20 & 11) != 2 || !composer4.getSkipping()) {
                                        androidx.compose.ui.text.TextStyle lerp = androidx.compose.ui.text.TextStyleKt.lerp(androidx.compose.material.MaterialTheme.INSTANCE.getTypography(composer4, 6).getSubtitle1(), androidx.compose.material.MaterialTheme.INSTANCE.getTypography(composer4, 6).getCaption(), f);
                                        boolean z18 = z17;
                                        long j4 = j2;
                                        if (z18) {
                                            m3986copyHL5avdY = lerp.m3986copyHL5avdY((r42 & 1) != 0 ? lerp.spanStyle.m3923getColor0d7_KjU() : j4, (r42 & 2) != 0 ? lerp.spanStyle.getFontSize() : 0L, (r42 & 4) != 0 ? lerp.spanStyle.getFontWeight() : null, (r42 & 8) != 0 ? lerp.spanStyle.getFontStyle() : null, (r42 & 16) != 0 ? lerp.spanStyle.getFontSynthesis() : null, (r42 & 32) != 0 ? lerp.spanStyle.getFontFamily() : null, (r42 & 64) != 0 ? lerp.spanStyle.getFontFeatureSettings() : null, (r42 & 128) != 0 ? lerp.spanStyle.getLetterSpacing() : 0L, (r42 & 256) != 0 ? lerp.spanStyle.getBaselineShift() : null, (r42 & 512) != 0 ? lerp.spanStyle.getTextGeometricTransform() : null, (r42 & 1024) != 0 ? lerp.spanStyle.getLocaleList() : null, (r42 & 2048) != 0 ? lerp.spanStyle.getBackground() : 0L, (r42 & 4096) != 0 ? lerp.spanStyle.getTextDecoration() : null, (r42 & 8192) != 0 ? lerp.spanStyle.getShadow() : null, (r42 & 16384) != 0 ? androidx.compose.ui.text.style.TextAlign.m4353boximpl(lerp.paragraphStyle.getTextAlign()) : null, (r42 & 32768) != 0 ? androidx.compose.ui.text.style.TextDirection.m4367boximpl(lerp.paragraphStyle.getTextDirection()) : null, (r42 & 65536) != 0 ? lerp.paragraphStyle.getLineHeight() : 0L, (r42 & 131072) != 0 ? lerp.paragraphStyle.getTextIndent() : null);
                                            textStyle = m3986copyHL5avdY;
                                        } else {
                                            textStyle = lerp;
                                        }
                                        androidx.compose.material.TextFieldImplKt.m1568DecorationeuL9pac(j3, textStyle, null, function218, composer4, ((i19 >> 6) & 14) | 384, 0);
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
                            final androidx.compose.material.TextFieldColors textFieldColors = colors;
                            final boolean z18 = z14;
                            final int i20 = i11;
                            final int i21 = i16;
                            final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function219 = function214;
                            composableLambda2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 1120552650, true, new kotlin.jvm.functions.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                                    invoke(modifier, composer4, num.intValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer4, int i22) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "modifier");
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C136@5575L341:TextFieldImpl.kt#jmzs0o");
                                    if ((i22 & 14) == 0) {
                                        i22 |= composer4.changed(modifier) ? 4 : 2;
                                    }
                                    if ((i22 & 91) != 18 || !composer4.getSkipping()) {
                                        androidx.compose.ui.Modifier alpha = androidx.compose.ui.draw.AlphaKt.alpha(modifier, f2);
                                        androidx.compose.material.TextFieldColors textFieldColors2 = textFieldColors;
                                        boolean z19 = z18;
                                        int i23 = i20;
                                        int i24 = i21;
                                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function220 = function219;
                                        composer4.startReplaceableGroup(733328855);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, composer4, 0);
                                        composer4.startReplaceableGroup(-1323940314);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        java.lang.Object consume = composer4.consume(localDensity);
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer4);
                                        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume;
                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        java.lang.Object consume2 = composer4.consume(localLayoutDirection);
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer4);
                                        androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume2;
                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        java.lang.Object consume3 = composer4.consume(localViewConfiguration);
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer4);
                                        androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume3;
                                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(alpha);
                                        if (!(composer4.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        composer4.disableReusing();
                                        androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer4);
                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                        composer4.enableReusing();
                                        materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer4)), composer4, 0);
                                        composer4.startReplaceableGroup(2058660585);
                                        composer4.startReplaceableGroup(-2137368960);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C72@3384L9:Box.kt#2w3rfo");
                                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                        composer4.startReplaceableGroup(1188063364);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C138@5709L25,139@5797L10,137@5647L247:TextFieldImpl.kt#jmzs0o");
                                        androidx.compose.material.TextFieldImplKt.m1568DecorationeuL9pac(textFieldColors2.placeholderColor(z19, composer4, ((i23 >> 27) & 14) | ((i24 >> 6) & 112)).getValue().m2123unboximpl(), androidx.compose.material.MaterialTheme.INSTANCE.getTypography(composer4, 6).getSubtitle1(), null, function220, composer4, (i23 >> 6) & 7168, 4);
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
                        final java.lang.String m1509getString4foXLRw = androidx.compose.material.Strings_androidKt.m1509getString4foXLRw(androidx.compose.material.Strings.INSTANCE.m1504getDefaultErrorMessageUdPEhr4(), composer3, 6);
                        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z13);
                        final boolean z19 = z13;
                        composer3.startReplaceableGroup(511388516);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(remember)P(1,2):Composables.kt#9igjgp");
                        boolean changed2 = composer3.changed(valueOf) | composer3.changed(m1509getString4foXLRw);
                        java.lang.Object rememberedValue2 = composer3.rememberedValue();
                        if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(androidx.compose.ui.semantics.SemanticsPropertyReceiver semantics) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                    if (z19) {
                                        androidx.compose.ui.semantics.SemanticsPropertiesKt.error(semantics, m1509getString4foXLRw);
                                    }
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue2);
                        }
                        composer3.endReplaceableGroup();
                        androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion, false, (kotlin.jvm.functions.Function1) rememberedValue2, 1, null);
                        if (colors instanceof androidx.compose.material.TextFieldColorsWithIcons) {
                            composer3.startReplaceableGroup(-1083197894);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "153@6424L53");
                            androidx.compose.material.TextFieldColorsWithIcons textFieldColorsWithIcons = (androidx.compose.material.TextFieldColorsWithIcons) colors;
                            boolean z20 = z14;
                            boolean z21 = z13;
                            androidx.compose.foundation.interaction.InteractionSource interactionSource2 = interactionSource;
                            int i22 = (i11 >> 27) & 14;
                            int i23 = i16;
                            snapshotMutationPolicy = null;
                            m2123unboximpl = textFieldColorsWithIcons.leadingIconColor(z20, z21, interactionSource2, composer3, ((i23 << 3) & 896) | i22 | ((i23 << 3) & 112)).getValue().m2123unboximpl();
                            composer3.endReplaceableGroup();
                        } else {
                            snapshotMutationPolicy = null;
                            composer3.startReplaceableGroup(-1083197798);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "155@6520L34");
                            androidx.compose.material.TextFieldColors textFieldColors2 = colors;
                            boolean z22 = z14;
                            boolean z23 = z13;
                            int i24 = (i11 >> 27) & 14;
                            int i25 = i16;
                            m2123unboximpl = textFieldColors2.leadingIconColor(z22, z23, composer3, i24 | ((i25 << 3) & 112) | ((i25 >> 3) & 896)).getValue().m2123unboximpl();
                            composer3.endReplaceableGroup();
                        }
                        java.lang.Object composableLambda3 = function215 != null ? androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 1505327088, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: TERNARY (r18v1 'composableLambda3' java.lang.Object) = ((wrap:kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>:0x0184: IGET (r20v0 'this' androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3 A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] (LINE:158) androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3.$leadingIcon kotlin.jvm.functions.Function2) != (null kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>)) ? (wrap:java.lang.Object:0x0190: INVOKE 
                              (r27v0 'composer3' ?? I:androidx.compose.runtime.Composer)
                              (1505327088 int)
                              true
                              (wrap:kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>:0x018a: CONSTRUCTOR (r1v18 'm2123unboximpl' long A[DONT_INLINE]), (r3 I:kotlin.jvm.functions.Function2 A[DONT_INLINE]) A[DONT_GENERATE, MD:(long, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>):void (m), REMOVE, WRAPPED] (LINE:159) call: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1.<init>(long, kotlin.jvm.functions.Function2):void type: CONSTRUCTOR)
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
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3.m1569invokeRIQooxk(float, long, long, float, androidx.compose.runtime.Composer, int):void");
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
            androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                return;
            }
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                    invoke(composer3, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer3, int i17) {
                    androidx.compose.material.TextFieldImplKt.CommonDecorationBox(androidx.compose.material.TextFieldType.this, value, innerTextField, visualTransformation, function2, function26, function27, function28, z4, z5, z6, interactionSource, contentPadding, colors, function29, composer3, i | 1, i2, i3);
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
        public static final void m1568DecorationeuL9pac(final long j, androidx.compose.ui.text.TextStyle textStyle, java.lang.Float f, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content, androidx.compose.runtime.Composer composer, final int i, final int i2) {
            int i3;
            androidx.compose.ui.text.TextStyle textStyle2;
            int i4;
            final java.lang.Float f2;
            final int i5;
            androidx.compose.ui.text.TextStyle textStyle3;
            final androidx.compose.ui.text.TextStyle textStyle4;
            androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
            androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-399493340);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Decoration)P(2:c#ui.graphics.Color,3,1):TextFieldImpl.kt#jmzs0o");
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
                        java.lang.Float f3 = i4 != 0 ? null : f2;
                        final java.lang.Float f4 = f3;
                        androidx.compose.runtime.internal.ComposableLambda composableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 494684590, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                invoke(composer2, num.intValue());
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void invoke(androidx.compose.runtime.Composer composer2, int i7) {
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C238@9719L476:TextFieldImpl.kt#jmzs0o");
                                if ((i7 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                androidx.compose.runtime.ProvidedValue[] providedValueArr = {androidx.compose.material.ContentColorKt.getLocalContentColor().provides(androidx.compose.ui.graphics.Color.m2103boximpl(j))};
                                final java.lang.Float f5 = f4;
                                final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = content;
                                final int i8 = i5;
                                final long j2 = j;
                                androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) providedValueArr, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -1132188434, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                                        invoke(composer3, num.intValue());
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(androidx.compose.runtime.Composer composer3, int i9) {
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C:TextFieldImpl.kt#jmzs0o");
                                        if ((i9 & 11) != 2 || !composer3.getSkipping()) {
                                            if (f5 != null) {
                                                composer3.startReplaceableGroup(-452622131);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "240@9843L142");
                                                androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{androidx.compose.material.ContentAlphaKt.getLocalContentAlpha().provides(f5)}, function2, composer3, ((i8 >> 6) & 112) | 8);
                                                composer3.endReplaceableGroup();
                                                return;
                                            }
                                            composer3.startReplaceableGroup(-452621951);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "245@10023L148");
                                            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{androidx.compose.material.ContentAlphaKt.getLocalContentAlpha().provides(java.lang.Float.valueOf(androidx.compose.ui.graphics.Color.m2115getAlphaimpl(j2)))}, function2, composer3, ((i8 >> 6) & 112) | 8);
                                            composer3.endReplaceableGroup();
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }), composer2, 56);
                            }
                        });
                        if (textStyle3 != null) {
                            startRestartGroup.startReplaceableGroup(-2009952864);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "252@10230L46");
                            androidx.compose.material.TextKt.ProvideTextStyle(textStyle3, composableLambda, startRestartGroup, ((i5 >> 3) & 14) | 48);
                        } else {
                            startRestartGroup.startReplaceableGroup(-2009952812);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "252@10282L18");
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
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                            invoke(composer2, num.intValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(androidx.compose.runtime.Composer composer2, int i7) {
                            androidx.compose.material.TextFieldImplKt.m1568DecorationeuL9pac(j, textStyle4, f2, content, composer2, i | 1, i2);
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
                final java.lang.Float f42 = f3;
                androidx.compose.runtime.internal.ComposableLambda composableLambda2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 494684590, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                        invoke(composer2, num.intValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(androidx.compose.runtime.Composer composer2, int i7) {
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C238@9719L476:TextFieldImpl.kt#jmzs0o");
                        if ((i7 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        androidx.compose.runtime.ProvidedValue[] providedValueArr = {androidx.compose.material.ContentColorKt.getLocalContentColor().provides(androidx.compose.ui.graphics.Color.m2103boximpl(j))};
                        final java.lang.Float f5 = f42;
                        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2 = content;
                        final int i8 = i5;
                        final long j2 = j;
                        androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) providedValueArr, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -1132188434, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                                invoke(composer3, num.intValue());
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void invoke(androidx.compose.runtime.Composer composer3, int i9) {
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C:TextFieldImpl.kt#jmzs0o");
                                if ((i9 & 11) != 2 || !composer3.getSkipping()) {
                                    if (f5 != null) {
                                        composer3.startReplaceableGroup(-452622131);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "240@9843L142");
                                        androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{androidx.compose.material.ContentAlphaKt.getLocalContentAlpha().provides(f5)}, function2, composer3, ((i8 >> 6) & 112) | 8);
                                        composer3.endReplaceableGroup();
                                        return;
                                    }
                                    composer3.startReplaceableGroup(-452621951);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "245@10023L148");
                                    androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{androidx.compose.material.ContentAlphaKt.getLocalContentAlpha().provides(java.lang.Float.valueOf(androidx.compose.ui.graphics.Color.m2115getAlphaimpl(j2)))}, function2, composer3, ((i8 >> 6) & 112) | 8);
                                    composer3.endReplaceableGroup();
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, 56);
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
            final java.lang.Float f422 = f3;
            androidx.compose.runtime.internal.ComposableLambda composableLambda22 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 494684590, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer2, int i7) {
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C238@9719L476:TextFieldImpl.kt#jmzs0o");
                    if ((i7 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    androidx.compose.runtime.ProvidedValue[] providedValueArr = {androidx.compose.material.ContentColorKt.getLocalContentColor().provides(androidx.compose.ui.graphics.Color.m2103boximpl(j))};
                    final java.lang.Float f5 = f422;
                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2 = content;
                    final int i8 = i5;
                    final long j2 = j;
                    androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) providedValueArr, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -1132188434, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                            invoke(composer3, num.intValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(androidx.compose.runtime.Composer composer3, int i9) {
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C:TextFieldImpl.kt#jmzs0o");
                            if ((i9 & 11) != 2 || !composer3.getSkipping()) {
                                if (f5 != null) {
                                    composer3.startReplaceableGroup(-452622131);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "240@9843L142");
                                    androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{androidx.compose.material.ContentAlphaKt.getLocalContentAlpha().provides(f5)}, function2, composer3, ((i8 >> 6) & 112) | 8);
                                    composer3.endReplaceableGroup();
                                    return;
                                }
                                composer3.startReplaceableGroup(-452621951);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "245@10023L148");
                                androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{androidx.compose.material.ContentAlphaKt.getLocalContentAlpha().provides(java.lang.Float.valueOf(androidx.compose.ui.graphics.Color.m2115getAlphaimpl(j2)))}, function2, composer3, ((i8 >> 6) & 112) | 8);
                                composer3.endReplaceableGroup();
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 56);
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

        public static final int widthOrZero(androidx.compose.ui.layout.Placeable placeable) {
            if (placeable != null) {
                return placeable.getWidth();
            }
            return 0;
        }

        public static final int heightOrZero(androidx.compose.ui.layout.Placeable placeable) {
            if (placeable != null) {
                return placeable.getHeight();
            }
            return 0;
        }

        public static final java.lang.Object getLayoutId(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intrinsicMeasurable, "<this>");
            java.lang.Object parentData = intrinsicMeasurable.getParentData();
            androidx.compose.ui.layout.LayoutIdParentData layoutIdParentData = parentData instanceof androidx.compose.ui.layout.LayoutIdParentData ? (androidx.compose.ui.layout.LayoutIdParentData) parentData : null;
            if (layoutIdParentData != null) {
                return layoutIdParentData.getLayoutId();
            }
            return null;
        }

        static {
            float f = 48;
            IconDefaultSizeModifier = androidx.compose.foundation.layout.SizeKt.m601defaultMinSizeVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m4478constructorimpl(f), androidx.compose.ui.unit.Dp.m4478constructorimpl(f));
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

        public static final androidx.compose.ui.Modifier getIconDefaultSizeModifier() {
            return IconDefaultSizeModifier;
        }
    }
