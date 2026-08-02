package com.paypal.pds.core;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0011\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'B;\b\u0004\u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005\u0012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\t\u0010\nR%\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR%\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0002\b\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0017\u0010\u0013\u001a\u00020\u00048G¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u00078AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0001\u0011()*+,-./012345678"}, d2 = {"Lcom/paypal/pds/core/Typography;", "", "Lkotlin/Function1;", "Lcom/paypal/pds/tokens/PDSTokens;", "Landroidx/compose/ui/text/TextStyle;", "Lkotlin/ExtensionFunctionType;", "p0", "", "p1", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "getTextStyle", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;", "getTextStyle$annotations", "(Landroidx/compose/runtime/Composer;I)V", "textStyle", "getMaxScaleFactor", "(Landroidx/compose/runtime/Composer;I)F", "maxScaleFactor", "BodyLarge", "BodyMedium", "BodySmall", "DisplayLarge", "DisplayMedium", "DisplaySmall", "HeadingLarge", "HeadingMedium", "HeadingSmall", "LabelLarge", "LabelMedium", "LabelSmall", "LinkLarge", "LinkMedium", "LinkSmall", "TitleLarge", "TitleMedium", "Lcom/paypal/pds/core/Typography$BodyLarge;", "Lcom/paypal/pds/core/Typography$BodyMedium;", "Lcom/paypal/pds/core/Typography$BodySmall;", "Lcom/paypal/pds/core/Typography$DisplayLarge;", "Lcom/paypal/pds/core/Typography$DisplayMedium;", "Lcom/paypal/pds/core/Typography$DisplaySmall;", "Lcom/paypal/pds/core/Typography$HeadingLarge;", "Lcom/paypal/pds/core/Typography$HeadingMedium;", "Lcom/paypal/pds/core/Typography$HeadingSmall;", "Lcom/paypal/pds/core/Typography$LabelLarge;", "Lcom/paypal/pds/core/Typography$LabelMedium;", "Lcom/paypal/pds/core/Typography$LabelSmall;", "Lcom/paypal/pds/core/Typography$LinkLarge;", "Lcom/paypal/pds/core/Typography$LinkMedium;", "Lcom/paypal/pds/core/Typography$LinkSmall;", "Lcom/paypal/pds/core/Typography$TitleLarge;", "Lcom/paypal/pds/core/Typography$TitleMedium;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class Typography {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function1<com.paypal.pds.tokens.PDSTokens, androidx.compose.ui.text.TextStyle> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<com.paypal.pds.tokens.PDSTokens, java.lang.Float> getHighResolutionOutputSizeshNQ4ISI;

    public static /* synthetic */ void getTextStyle$annotations(androidx.compose.runtime.Composer composer, int i) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Typography(kotlin.jvm.functions.Function1<? super com.paypal.pds.tokens.PDSTokens, androidx.compose.ui.text.TextStyle> function1, kotlin.jvm.functions.Function1<? super com.paypal.pds.tokens.PDSTokens, java.lang.Float> function12) {
        this.Camera2StreamConfigurationMap = function1;
        this.getHighResolutionOutputSizeshNQ4ISI = function12;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/core/Typography$BodyLarge;", "Lcom/paypal/pds/core/Typography;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BodyLarge extends com.paypal.pds.core.Typography {
        public static final int $stable = 0;
        public static final com.paypal.pds.core.Typography.BodyLarge INSTANCE = new com.paypal.pds.core.Typography.BodyLarge();

        private BodyLarge() {
            super(new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.Typography$BodyLarge$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.pds.core.Typography.BodyLarge.$r8$lambda$INBWIGiB6szisfQugn05Mgx5aZE((com.paypal.pds.tokens.PDSTokens) obj);
                }
            }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.Typography$BodyLarge$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Float.valueOf(com.paypal.pds.core.Typography.BodyLarge.$r8$lambda$yWTc93GrEI0oASbEEXIrxfhxIaE((com.paypal.pds.tokens.PDSTokens) obj));
                }
            }, null);
        }

        public static /* synthetic */ androidx.compose.ui.text.TextStyle $r8$lambda$INBWIGiB6szisfQugn05Mgx5aZE(com.paypal.pds.tokens.PDSTokens pDSTokens) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
            return new androidx.compose.ui.text.TextStyle(0L, pDSTokens.mo22290getTextBodyLargeFontSizeXSAIIZE(), new androidx.compose.ui.text.font.FontWeight(pDSTokens.getTextBodyLargeFontWeight()), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, androidx.compose.ui.text.font.FontFamilyKt.FontFamily(androidx.compose.ui.text.font.FontKt.m8134FontYpTlLL0$default(pDSTokens.getTextBodyLargeFontFamily(), null, 0, 0, 14, null)), "liga 0", pDSTokens.mo22291getTextBodyLargeLetterSpacingXSAIIZE(), (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 0, 0, pDSTokens.mo22292getTextBodyLargeLineHeightXSAIIZE(), (androidx.compose.ui.text.style.TextIndent) null, (androidx.compose.ui.text.PlatformTextStyle) null, new androidx.compose.ui.text.style.LineHeightStyle(androidx.compose.ui.text.style.LineHeightStyle.Alignment.INSTANCE.m8411getProportionalPIaL0Z0(), androidx.compose.ui.text.style.LineHeightStyle.Trim.INSTANCE.m8435getNoneEVpEnUU(), (kotlin.jvm.internal.DefaultConstructorMarker) null), 0, 0, (androidx.compose.ui.text.style.TextMotion) null, 15597337, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        public static /* synthetic */ float $r8$lambda$yWTc93GrEI0oASbEEXIrxfhxIaE(com.paypal.pds.tokens.PDSTokens pDSTokens) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
            return pDSTokens.getTextBodyLargeMaxScale();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/core/Typography$BodyMedium;", "Lcom/paypal/pds/core/Typography;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BodyMedium extends com.paypal.pds.core.Typography {
        public static final int $stable = 0;
        public static final com.paypal.pds.core.Typography.BodyMedium INSTANCE = new com.paypal.pds.core.Typography.BodyMedium();

        private BodyMedium() {
            super(new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.Typography$BodyMedium$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.pds.core.Typography.BodyMedium.$r8$lambda$218xM79r6E70GQJqzFUzsOmBljQ((com.paypal.pds.tokens.PDSTokens) obj);
                }
            }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.Typography$BodyMedium$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Float.valueOf(com.paypal.pds.core.Typography.BodyMedium.$r8$lambda$BQr_HKfs2GrUQZpS1UW9JQROSt0((com.paypal.pds.tokens.PDSTokens) obj));
                }
            }, null);
        }

        public static /* synthetic */ androidx.compose.ui.text.TextStyle $r8$lambda$218xM79r6E70GQJqzFUzsOmBljQ(com.paypal.pds.tokens.PDSTokens pDSTokens) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
            return new androidx.compose.ui.text.TextStyle(0L, pDSTokens.mo22293getTextBodyMediumFontSizeXSAIIZE(), new androidx.compose.ui.text.font.FontWeight(pDSTokens.getTextBodyMediumFontWeight()), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, androidx.compose.ui.text.font.FontFamilyKt.FontFamily(androidx.compose.ui.text.font.FontKt.m8134FontYpTlLL0$default(pDSTokens.getTextBodyMediumFontFamily(), null, 0, 0, 14, null)), "liga 0", pDSTokens.mo22294getTextBodyMediumLetterSpacingXSAIIZE(), (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 0, 0, pDSTokens.mo22295getTextBodyMediumLineHeightXSAIIZE(), (androidx.compose.ui.text.style.TextIndent) null, (androidx.compose.ui.text.PlatformTextStyle) null, new androidx.compose.ui.text.style.LineHeightStyle(androidx.compose.ui.text.style.LineHeightStyle.Alignment.INSTANCE.m8411getProportionalPIaL0Z0(), androidx.compose.ui.text.style.LineHeightStyle.Trim.INSTANCE.m8435getNoneEVpEnUU(), (kotlin.jvm.internal.DefaultConstructorMarker) null), 0, 0, (androidx.compose.ui.text.style.TextMotion) null, 15597337, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        public static /* synthetic */ float $r8$lambda$BQr_HKfs2GrUQZpS1UW9JQROSt0(com.paypal.pds.tokens.PDSTokens pDSTokens) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
            return pDSTokens.getTextBodyMediumMaxScale();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/core/Typography$BodySmall;", "Lcom/paypal/pds/core/Typography;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BodySmall extends com.paypal.pds.core.Typography {
        public static final int $stable = 0;
        public static final com.paypal.pds.core.Typography.BodySmall INSTANCE = new com.paypal.pds.core.Typography.BodySmall();

        private BodySmall() {
            super(new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.Typography$BodySmall$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.pds.core.Typography.BodySmall.$r8$lambda$opUrYmmUfX9prwUrZKNbuQRbOYk((com.paypal.pds.tokens.PDSTokens) obj);
                }
            }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.Typography$BodySmall$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Float.valueOf(com.paypal.pds.core.Typography.BodySmall.$r8$lambda$_86RPVxtCTTM6hwmTkmosHj2exs((com.paypal.pds.tokens.PDSTokens) obj));
                }
            }, null);
        }

        public static /* synthetic */ float $r8$lambda$_86RPVxtCTTM6hwmTkmosHj2exs(com.paypal.pds.tokens.PDSTokens pDSTokens) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
            return pDSTokens.getTextBodySmallMaxScale();
        }

        public static /* synthetic */ androidx.compose.ui.text.TextStyle $r8$lambda$opUrYmmUfX9prwUrZKNbuQRbOYk(com.paypal.pds.tokens.PDSTokens pDSTokens) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
            return new androidx.compose.ui.text.TextStyle(0L, pDSTokens.mo22296getTextBodySmallFontSizeXSAIIZE(), new androidx.compose.ui.text.font.FontWeight(pDSTokens.getTextBodySmallFontWeight()), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, androidx.compose.ui.text.font.FontFamilyKt.FontFamily(androidx.compose.ui.text.font.FontKt.m8134FontYpTlLL0$default(pDSTokens.getTextBodySmallFontFamily(), null, 0, 0, 14, null)), "liga 0", pDSTokens.mo22297getTextBodySmallLetterSpacingXSAIIZE(), (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 0, 0, pDSTokens.mo22298getTextBodySmallLineHeightXSAIIZE(), (androidx.compose.ui.text.style.TextIndent) null, (androidx.compose.ui.text.PlatformTextStyle) null, new androidx.compose.ui.text.style.LineHeightStyle(androidx.compose.ui.text.style.LineHeightStyle.Alignment.INSTANCE.m8411getProportionalPIaL0Z0(), androidx.compose.ui.text.style.LineHeightStyle.Trim.INSTANCE.m8435getNoneEVpEnUU(), (kotlin.jvm.internal.DefaultConstructorMarker) null), 0, 0, (androidx.compose.ui.text.style.TextMotion) null, 15597337, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/core/Typography$DisplayLarge;", "Lcom/paypal/pds/core/Typography;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DisplayLarge extends com.paypal.pds.core.Typography {
        public static final int $stable = 0;
        public static final com.paypal.pds.core.Typography.DisplayLarge INSTANCE = new com.paypal.pds.core.Typography.DisplayLarge();

        private DisplayLarge() {
            super(new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.Typography$DisplayLarge$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.pds.core.Typography.DisplayLarge.m22113$r8$lambda$tkM9skjVb74UqlDoYeAOq7WNw8((com.paypal.pds.tokens.PDSTokens) obj);
                }
            }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.Typography$DisplayLarge$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Float.valueOf(com.paypal.pds.core.Typography.DisplayLarge.$r8$lambda$rnHZ286V2BWUXQm4ZlEkTL1tjqA((com.paypal.pds.tokens.PDSTokens) obj));
                }
            }, null);
        }

        public static /* synthetic */ float $r8$lambda$rnHZ286V2BWUXQm4ZlEkTL1tjqA(com.paypal.pds.tokens.PDSTokens pDSTokens) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
            return pDSTokens.getTextDisplayLargeMaxScale();
        }

        /* renamed from: $r8$lambda$tkM9skjVb74-UqlDoYeAOq7WNw8, reason: not valid java name */
        public static /* synthetic */ androidx.compose.ui.text.TextStyle m22113$r8$lambda$tkM9skjVb74UqlDoYeAOq7WNw8(com.paypal.pds.tokens.PDSTokens pDSTokens) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
            return new androidx.compose.ui.text.TextStyle(0L, pDSTokens.mo22299getTextDisplayLargeFontSizeXSAIIZE(), new androidx.compose.ui.text.font.FontWeight(pDSTokens.getTextDisplayLargeFontWeight()), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, androidx.compose.ui.text.font.FontFamilyKt.FontFamily(androidx.compose.ui.text.font.FontKt.m8134FontYpTlLL0$default(pDSTokens.getTextDisplayLargeFontFamily(), null, 0, 0, 14, null)), "liga 0", pDSTokens.mo22300getTextDisplayLargeLetterSpacingXSAIIZE(), (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 0, 0, pDSTokens.mo22301getTextDisplayLargeLineHeightXSAIIZE(), (androidx.compose.ui.text.style.TextIndent) null, (androidx.compose.ui.text.PlatformTextStyle) null, new androidx.compose.ui.text.style.LineHeightStyle(androidx.compose.ui.text.style.LineHeightStyle.Alignment.INSTANCE.m8411getProportionalPIaL0Z0(), androidx.compose.ui.text.style.LineHeightStyle.Trim.INSTANCE.m8435getNoneEVpEnUU(), (kotlin.jvm.internal.DefaultConstructorMarker) null), 0, 0, (androidx.compose.ui.text.style.TextMotion) null, 15597337, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/core/Typography$DisplayMedium;", "Lcom/paypal/pds/core/Typography;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DisplayMedium extends com.paypal.pds.core.Typography {
        public static final int $stable = 0;
        public static final com.paypal.pds.core.Typography.DisplayMedium INSTANCE = new com.paypal.pds.core.Typography.DisplayMedium();

        private DisplayMedium() {
            super(new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.Typography$DisplayMedium$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.pds.core.Typography.DisplayMedium.$r8$lambda$YpUvJjC2em2MZeoxMsgdP_N0G8I((com.paypal.pds.tokens.PDSTokens) obj);
                }
            }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.Typography$DisplayMedium$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Float.valueOf(com.paypal.pds.core.Typography.DisplayMedium.$r8$lambda$AK_xdviAxxeLuG804oxVRXzC5FI((com.paypal.pds.tokens.PDSTokens) obj));
                }
            }, null);
        }

        public static /* synthetic */ float $r8$lambda$AK_xdviAxxeLuG804oxVRXzC5FI(com.paypal.pds.tokens.PDSTokens pDSTokens) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
            return pDSTokens.getTextDisplayMediumMaxScale();
        }

        public static /* synthetic */ androidx.compose.ui.text.TextStyle $r8$lambda$YpUvJjC2em2MZeoxMsgdP_N0G8I(com.paypal.pds.tokens.PDSTokens pDSTokens) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
            return new androidx.compose.ui.text.TextStyle(0L, pDSTokens.mo22302getTextDisplayMediumFontSizeXSAIIZE(), new androidx.compose.ui.text.font.FontWeight(pDSTokens.getTextDisplayMediumFontWeight()), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, androidx.compose.ui.text.font.FontFamilyKt.FontFamily(androidx.compose.ui.text.font.FontKt.m8134FontYpTlLL0$default(pDSTokens.getTextDisplayMediumFontFamily(), null, 0, 0, 14, null)), "liga 0", pDSTokens.mo22303getTextDisplayMediumLetterSpacingXSAIIZE(), (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 0, 0, pDSTokens.mo22304getTextDisplayMediumLineHeightXSAIIZE(), (androidx.compose.ui.text.style.TextIndent) null, (androidx.compose.ui.text.PlatformTextStyle) null, new androidx.compose.ui.text.style.LineHeightStyle(androidx.compose.ui.text.style.LineHeightStyle.Alignment.INSTANCE.m8411getProportionalPIaL0Z0(), androidx.compose.ui.text.style.LineHeightStyle.Trim.INSTANCE.m8435getNoneEVpEnUU(), (kotlin.jvm.internal.DefaultConstructorMarker) null), 0, 0, (androidx.compose.ui.text.style.TextMotion) null, 15597337, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/core/Typography$DisplaySmall;", "Lcom/paypal/pds/core/Typography;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DisplaySmall extends com.paypal.pds.core.Typography {
        public static final int $stable = 0;
        public static final com.paypal.pds.core.Typography.DisplaySmall INSTANCE = new com.paypal.pds.core.Typography.DisplaySmall();

        private DisplaySmall() {
            super(new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.Typography$DisplaySmall$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.pds.core.Typography.DisplaySmall.m22114$r8$lambda$Lq_BgPaCD5s9eUkHiefubCr_Yg((com.paypal.pds.tokens.PDSTokens) obj);
                }
            }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.Typography$DisplaySmall$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Float.valueOf(com.paypal.pds.core.Typography.DisplaySmall.$r8$lambda$vuzY6QrIk7XdY5viLk_5r_Atjj8((com.paypal.pds.tokens.PDSTokens) obj));
                }
            }, null);
        }

        /* renamed from: $r8$lambda$Lq_BgPaCD5s9eUkHiefubCr-_Yg, reason: not valid java name */
        public static /* synthetic */ androidx.compose.ui.text.TextStyle m22114$r8$lambda$Lq_BgPaCD5s9eUkHiefubCr_Yg(com.paypal.pds.tokens.PDSTokens pDSTokens) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
            return new androidx.compose.ui.text.TextStyle(0L, pDSTokens.mo22305getTextDisplaySmallFontSizeXSAIIZE(), new androidx.compose.ui.text.font.FontWeight(pDSTokens.getTextDisplaySmallFontWeight()), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, androidx.compose.ui.text.font.FontFamilyKt.FontFamily(androidx.compose.ui.text.font.FontKt.m8134FontYpTlLL0$default(pDSTokens.getTextDisplaySmallFontFamily(), null, 0, 0, 14, null)), "liga 0", pDSTokens.mo22306getTextDisplaySmallLetterSpacingXSAIIZE(), (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 0, 0, pDSTokens.mo22307getTextDisplaySmallLineHeightXSAIIZE(), (androidx.compose.ui.text.style.TextIndent) null, (androidx.compose.ui.text.PlatformTextStyle) null, new androidx.compose.ui.text.style.LineHeightStyle(androidx.compose.ui.text.style.LineHeightStyle.Alignment.INSTANCE.m8411getProportionalPIaL0Z0(), androidx.compose.ui.text.style.LineHeightStyle.Trim.INSTANCE.m8435getNoneEVpEnUU(), (kotlin.jvm.internal.DefaultConstructorMarker) null), 0, 0, (androidx.compose.ui.text.style.TextMotion) null, 15597337, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        public static /* synthetic */ float $r8$lambda$vuzY6QrIk7XdY5viLk_5r_Atjj8(com.paypal.pds.tokens.PDSTokens pDSTokens) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
            return pDSTokens.getTextDisplaySmallMaxScale();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/core/Typography$HeadingLarge;", "Lcom/paypal/pds/core/Typography;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class HeadingLarge extends com.paypal.pds.core.Typography {
        public static final int $stable = 0;
        public static final com.paypal.pds.core.Typography.HeadingLarge INSTANCE = new com.paypal.pds.core.Typography.HeadingLarge();

        private HeadingLarge() {
            super(new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.Typography$HeadingLarge$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.pds.core.Typography.HeadingLarge.$r8$lambda$rKgang6qCoIOuA9s_bb1P27hIKQ((com.paypal.pds.tokens.PDSTokens) obj);
                }
            }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.Typography$HeadingLarge$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Float.valueOf(com.paypal.pds.core.Typography.HeadingLarge.$r8$lambda$zzyBy1nr4FbCZq8PcMAhA0OHOU4((com.paypal.pds.tokens.PDSTokens) obj));
                }
            }, null);
        }

        public static /* synthetic */ androidx.compose.ui.text.TextStyle $r8$lambda$rKgang6qCoIOuA9s_bb1P27hIKQ(com.paypal.pds.tokens.PDSTokens pDSTokens) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
            return new androidx.compose.ui.text.TextStyle(0L, pDSTokens.mo22308getTextHeadingLargeFontSizeXSAIIZE(), new androidx.compose.ui.text.font.FontWeight(pDSTokens.getTextHeadingLargeFontWeight()), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, androidx.compose.ui.text.font.FontFamilyKt.FontFamily(androidx.compose.ui.text.font.FontKt.m8134FontYpTlLL0$default(pDSTokens.getTextHeadingLargeFontFamily(), null, 0, 0, 14, null)), "liga 0", pDSTokens.mo22309getTextHeadingLargeLetterSpacingXSAIIZE(), (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 0, 0, pDSTokens.mo22310getTextHeadingLargeLineHeightXSAIIZE(), (androidx.compose.ui.text.style.TextIndent) null, (androidx.compose.ui.text.PlatformTextStyle) null, new androidx.compose.ui.text.style.LineHeightStyle(androidx.compose.ui.text.style.LineHeightStyle.Alignment.INSTANCE.m8411getProportionalPIaL0Z0(), androidx.compose.ui.text.style.LineHeightStyle.Trim.INSTANCE.m8435getNoneEVpEnUU(), (kotlin.jvm.internal.DefaultConstructorMarker) null), 0, 0, (androidx.compose.ui.text.style.TextMotion) null, 15597337, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        public static /* synthetic */ float $r8$lambda$zzyBy1nr4FbCZq8PcMAhA0OHOU4(com.paypal.pds.tokens.PDSTokens pDSTokens) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
            return pDSTokens.getTextHeadingLargeMaxScale();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/core/Typography$HeadingMedium;", "Lcom/paypal/pds/core/Typography;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class HeadingMedium extends com.paypal.pds.core.Typography {
        public static final int $stable = 0;
        public static final com.paypal.pds.core.Typography.HeadingMedium INSTANCE = new com.paypal.pds.core.Typography.HeadingMedium();

        private HeadingMedium() {
            super(new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.Typography$HeadingMedium$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.pds.core.Typography.HeadingMedium.$r8$lambda$W9K06nzQw1fj5cJjSjutxQyJW6o((com.paypal.pds.tokens.PDSTokens) obj);
                }
            }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.Typography$HeadingMedium$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Float.valueOf(com.paypal.pds.core.Typography.HeadingMedium.m22115$r8$lambda$wOBvCIHNPcwcx1iGzlZbfsBftM((com.paypal.pds.tokens.PDSTokens) obj));
                }
            }, null);
        }

        public static /* synthetic */ androidx.compose.ui.text.TextStyle $r8$lambda$W9K06nzQw1fj5cJjSjutxQyJW6o(com.paypal.pds.tokens.PDSTokens pDSTokens) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
            return new androidx.compose.ui.text.TextStyle(0L, pDSTokens.mo22311getTextHeadingMediumFontSizeXSAIIZE(), new androidx.compose.ui.text.font.FontWeight(pDSTokens.getTextHeadingMediumFontWeight()), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, androidx.compose.ui.text.font.FontFamilyKt.FontFamily(androidx.compose.ui.text.font.FontKt.m8134FontYpTlLL0$default(pDSTokens.getTextHeadingMediumFontFamily(), null, 0, 0, 14, null)), "liga 0", pDSTokens.mo22312getTextHeadingMediumLetterSpacingXSAIIZE(), (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 0, 0, pDSTokens.mo22313getTextHeadingMediumLineHeightXSAIIZE(), (androidx.compose.ui.text.style.TextIndent) null, (androidx.compose.ui.text.PlatformTextStyle) null, new androidx.compose.ui.text.style.LineHeightStyle(androidx.compose.ui.text.style.LineHeightStyle.Alignment.INSTANCE.m8411getProportionalPIaL0Z0(), androidx.compose.ui.text.style.LineHeightStyle.Trim.INSTANCE.m8435getNoneEVpEnUU(), (kotlin.jvm.internal.DefaultConstructorMarker) null), 0, 0, (androidx.compose.ui.text.style.TextMotion) null, 15597337, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        /* renamed from: $r8$lambda$wOBvCIHNPcw-cx1iGzlZbfsBftM, reason: not valid java name */
        public static /* synthetic */ float m22115$r8$lambda$wOBvCIHNPcwcx1iGzlZbfsBftM(com.paypal.pds.tokens.PDSTokens pDSTokens) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
            return pDSTokens.getTextHeadingMediumMaxScale();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/core/Typography$HeadingSmall;", "Lcom/paypal/pds/core/Typography;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class HeadingSmall extends com.paypal.pds.core.Typography {
        public static final int $stable = 0;
        public static final com.paypal.pds.core.Typography.HeadingSmall INSTANCE = new com.paypal.pds.core.Typography.HeadingSmall();

        private HeadingSmall() {
            super(new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.Typography$HeadingSmall$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.pds.core.Typography.HeadingSmall.m22116$r8$lambda$bd9Jen02V9LE9RyGGcTluiYj1g((com.paypal.pds.tokens.PDSTokens) obj);
                }
            }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.Typography$HeadingSmall$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Float.valueOf(com.paypal.pds.core.Typography.HeadingSmall.$r8$lambda$60mX2ZkQsGUTpX2U7jvVTvyHELw((com.paypal.pds.tokens.PDSTokens) obj));
                }
            }, null);
        }

        public static /* synthetic */ float $r8$lambda$60mX2ZkQsGUTpX2U7jvVTvyHELw(com.paypal.pds.tokens.PDSTokens pDSTokens) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
            return pDSTokens.getTextHeadingSmallMaxScale();
        }

        /* renamed from: $r8$lambda$bd9Jen02V9LE9RyGGcTl-uiYj1g, reason: not valid java name */
        public static /* synthetic */ androidx.compose.ui.text.TextStyle m22116$r8$lambda$bd9Jen02V9LE9RyGGcTluiYj1g(com.paypal.pds.tokens.PDSTokens pDSTokens) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
            return new androidx.compose.ui.text.TextStyle(0L, pDSTokens.mo22314getTextHeadingSmallFontSizeXSAIIZE(), new androidx.compose.ui.text.font.FontWeight(pDSTokens.getTextHeadingSmallFontWeight()), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, androidx.compose.ui.text.font.FontFamilyKt.FontFamily(androidx.compose.ui.text.font.FontKt.m8134FontYpTlLL0$default(pDSTokens.getTextHeadingSmallFontFamily(), null, 0, 0, 14, null)), "liga 0", pDSTokens.mo22315getTextHeadingSmallLetterSpacingXSAIIZE(), (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 0, 0, pDSTokens.mo22316getTextHeadingSmallLineHeightXSAIIZE(), (androidx.compose.ui.text.style.TextIndent) null, (androidx.compose.ui.text.PlatformTextStyle) null, new androidx.compose.ui.text.style.LineHeightStyle(androidx.compose.ui.text.style.LineHeightStyle.Alignment.INSTANCE.m8411getProportionalPIaL0Z0(), androidx.compose.ui.text.style.LineHeightStyle.Trim.INSTANCE.m8435getNoneEVpEnUU(), (kotlin.jvm.internal.DefaultConstructorMarker) null), 0, 0, (androidx.compose.ui.text.style.TextMotion) null, 15597337, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/core/Typography$LabelLarge;", "Lcom/paypal/pds/core/Typography;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class LabelLarge extends com.paypal.pds.core.Typography {
        public static final int $stable = 0;
        public static final com.paypal.pds.core.Typography.LabelLarge INSTANCE = new com.paypal.pds.core.Typography.LabelLarge();

        private LabelLarge() {
            super(new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.Typography$LabelLarge$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.pds.core.Typography.LabelLarge.$r8$lambda$lNtquUaBhgGx6NFT22eX6iYaha0((com.paypal.pds.tokens.PDSTokens) obj);
                }
            }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.Typography$LabelLarge$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Float.valueOf(com.paypal.pds.core.Typography.LabelLarge.$r8$lambda$QvHfdK21Dct1rTq5B5u0lxiRGV8((com.paypal.pds.tokens.PDSTokens) obj));
                }
            }, null);
        }

        public static /* synthetic */ float $r8$lambda$QvHfdK21Dct1rTq5B5u0lxiRGV8(com.paypal.pds.tokens.PDSTokens pDSTokens) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
            return pDSTokens.getTextLabelLargeMaxScale();
        }

        public static /* synthetic */ androidx.compose.ui.text.TextStyle $r8$lambda$lNtquUaBhgGx6NFT22eX6iYaha0(com.paypal.pds.tokens.PDSTokens pDSTokens) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
            return new androidx.compose.ui.text.TextStyle(0L, pDSTokens.mo22317getTextLabelLargeFontSizeXSAIIZE(), new androidx.compose.ui.text.font.FontWeight(pDSTokens.getTextLabelLargeFontWeight()), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, androidx.compose.ui.text.font.FontFamilyKt.FontFamily(androidx.compose.ui.text.font.FontKt.m8134FontYpTlLL0$default(pDSTokens.getTextLabelLargeFontFamily(), null, 0, 0, 14, null)), "liga 0", pDSTokens.mo22318getTextLabelLargeLetterSpacingXSAIIZE(), (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 0, 0, pDSTokens.mo22319getTextLabelLargeLineHeightXSAIIZE(), (androidx.compose.ui.text.style.TextIndent) null, (androidx.compose.ui.text.PlatformTextStyle) null, new androidx.compose.ui.text.style.LineHeightStyle(androidx.compose.ui.text.style.LineHeightStyle.Alignment.INSTANCE.m8411getProportionalPIaL0Z0(), androidx.compose.ui.text.style.LineHeightStyle.Trim.INSTANCE.m8435getNoneEVpEnUU(), (kotlin.jvm.internal.DefaultConstructorMarker) null), 0, 0, (androidx.compose.ui.text.style.TextMotion) null, 15597337, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/core/Typography$LabelMedium;", "Lcom/paypal/pds/core/Typography;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class LabelMedium extends com.paypal.pds.core.Typography {
        public static final int $stable = 0;
        public static final com.paypal.pds.core.Typography.LabelMedium INSTANCE = new com.paypal.pds.core.Typography.LabelMedium();

        private LabelMedium() {
            super(new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.Typography$LabelMedium$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.pds.core.Typography.LabelMedium.$r8$lambda$SEH123jhyq5RSNYQTO2H8syONHM((com.paypal.pds.tokens.PDSTokens) obj);
                }
            }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.Typography$LabelMedium$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Float.valueOf(com.paypal.pds.core.Typography.LabelMedium.$r8$lambda$Osa5MEEhq_iOSY519I7_bFeeKsI((com.paypal.pds.tokens.PDSTokens) obj));
                }
            }, null);
        }

        public static /* synthetic */ float $r8$lambda$Osa5MEEhq_iOSY519I7_bFeeKsI(com.paypal.pds.tokens.PDSTokens pDSTokens) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
            return pDSTokens.getTextLabelMediumMaxScale();
        }

        public static /* synthetic */ androidx.compose.ui.text.TextStyle $r8$lambda$SEH123jhyq5RSNYQTO2H8syONHM(com.paypal.pds.tokens.PDSTokens pDSTokens) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
            return new androidx.compose.ui.text.TextStyle(0L, pDSTokens.mo22320getTextLabelMediumFontSizeXSAIIZE(), new androidx.compose.ui.text.font.FontWeight(pDSTokens.getTextLabelMediumFontWeight()), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, androidx.compose.ui.text.font.FontFamilyKt.FontFamily(androidx.compose.ui.text.font.FontKt.m8134FontYpTlLL0$default(pDSTokens.getTextLabelMediumFontFamily(), null, 0, 0, 14, null)), "liga 0", pDSTokens.mo22321getTextLabelMediumLetterSpacingXSAIIZE(), (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 0, 0, pDSTokens.mo22322getTextLabelMediumLineHeightXSAIIZE(), (androidx.compose.ui.text.style.TextIndent) null, (androidx.compose.ui.text.PlatformTextStyle) null, new androidx.compose.ui.text.style.LineHeightStyle(androidx.compose.ui.text.style.LineHeightStyle.Alignment.INSTANCE.m8411getProportionalPIaL0Z0(), androidx.compose.ui.text.style.LineHeightStyle.Trim.INSTANCE.m8435getNoneEVpEnUU(), (kotlin.jvm.internal.DefaultConstructorMarker) null), 0, 0, (androidx.compose.ui.text.style.TextMotion) null, 15597337, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/core/Typography$LabelSmall;", "Lcom/paypal/pds/core/Typography;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class LabelSmall extends com.paypal.pds.core.Typography {
        public static final int $stable = 0;
        public static final com.paypal.pds.core.Typography.LabelSmall INSTANCE = new com.paypal.pds.core.Typography.LabelSmall();

        private LabelSmall() {
            super(new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.Typography$LabelSmall$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.pds.core.Typography.LabelSmall.$r8$lambda$SLqzNtA6N63siCIyWzVqtLslvvw((com.paypal.pds.tokens.PDSTokens) obj);
                }
            }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.Typography$LabelSmall$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Float.valueOf(com.paypal.pds.core.Typography.LabelSmall.$r8$lambda$WFBdM7nyR3IbLb3TVOjl3tMQsNY((com.paypal.pds.tokens.PDSTokens) obj));
                }
            }, null);
        }

        public static /* synthetic */ androidx.compose.ui.text.TextStyle $r8$lambda$SLqzNtA6N63siCIyWzVqtLslvvw(com.paypal.pds.tokens.PDSTokens pDSTokens) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
            return new androidx.compose.ui.text.TextStyle(0L, pDSTokens.mo22323getTextLabelSmallFontSizeXSAIIZE(), new androidx.compose.ui.text.font.FontWeight(pDSTokens.getTextLabelSmallFontWeight()), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, androidx.compose.ui.text.font.FontFamilyKt.FontFamily(androidx.compose.ui.text.font.FontKt.m8134FontYpTlLL0$default(pDSTokens.getTextLabelSmallFontFamily(), null, 0, 0, 14, null)), "liga 0", pDSTokens.mo22324getTextLabelSmallLetterSpacingXSAIIZE(), (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 0, 0, pDSTokens.mo22325getTextLabelSmallLineHeightXSAIIZE(), (androidx.compose.ui.text.style.TextIndent) null, (androidx.compose.ui.text.PlatformTextStyle) null, new androidx.compose.ui.text.style.LineHeightStyle(androidx.compose.ui.text.style.LineHeightStyle.Alignment.INSTANCE.m8411getProportionalPIaL0Z0(), androidx.compose.ui.text.style.LineHeightStyle.Trim.INSTANCE.m8435getNoneEVpEnUU(), (kotlin.jvm.internal.DefaultConstructorMarker) null), 0, 0, (androidx.compose.ui.text.style.TextMotion) null, 15597337, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        public static /* synthetic */ float $r8$lambda$WFBdM7nyR3IbLb3TVOjl3tMQsNY(com.paypal.pds.tokens.PDSTokens pDSTokens) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
            return pDSTokens.getTextLabelSmallMaxScale();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/core/Typography$LinkLarge;", "Lcom/paypal/pds/core/Typography;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class LinkLarge extends com.paypal.pds.core.Typography {
        public static final int $stable = 0;
        public static final com.paypal.pds.core.Typography.LinkLarge INSTANCE = new com.paypal.pds.core.Typography.LinkLarge();

        private LinkLarge() {
            super(new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.Typography$LinkLarge$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.pds.core.Typography.LinkLarge.$r8$lambda$w93C6TkN1plU3gEF2NW5PAcq80I((com.paypal.pds.tokens.PDSTokens) obj);
                }
            }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.Typography$LinkLarge$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Float.valueOf(com.paypal.pds.core.Typography.LinkLarge.$r8$lambda$aN3i4_Y8lTEcwmuz28tUvOaycnM((com.paypal.pds.tokens.PDSTokens) obj));
                }
            }, null);
        }

        public static /* synthetic */ float $r8$lambda$aN3i4_Y8lTEcwmuz28tUvOaycnM(com.paypal.pds.tokens.PDSTokens pDSTokens) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
            return pDSTokens.getTextLinkLargeMaxScale();
        }

        public static /* synthetic */ androidx.compose.ui.text.TextStyle $r8$lambda$w93C6TkN1plU3gEF2NW5PAcq80I(com.paypal.pds.tokens.PDSTokens pDSTokens) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
            return new androidx.compose.ui.text.TextStyle(0L, pDSTokens.mo22326getTextLinkLargeFontSizeXSAIIZE(), new androidx.compose.ui.text.font.FontWeight(pDSTokens.getTextLinkLargeFontWeight()), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, androidx.compose.ui.text.font.FontFamilyKt.FontFamily(androidx.compose.ui.text.font.FontKt.m8134FontYpTlLL0$default(pDSTokens.getTextLinkLargeFontFamily(), null, 0, 0, 14, null)), "liga 0", pDSTokens.mo22327getTextLinkLargeLetterSpacingXSAIIZE(), (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, com.paypal.pds.core.TypographyKt.access$toTextDecoration(pDSTokens.getTextLinkLargeTextDecoration()), (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 0, 0, pDSTokens.mo22328getTextLinkLargeLineHeightXSAIIZE(), (androidx.compose.ui.text.style.TextIndent) null, (androidx.compose.ui.text.PlatformTextStyle) null, new androidx.compose.ui.text.style.LineHeightStyle(androidx.compose.ui.text.style.LineHeightStyle.Alignment.INSTANCE.m8411getProportionalPIaL0Z0(), androidx.compose.ui.text.style.LineHeightStyle.Trim.INSTANCE.m8435getNoneEVpEnUU(), (kotlin.jvm.internal.DefaultConstructorMarker) null), 0, 0, (androidx.compose.ui.text.style.TextMotion) null, 15593241, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/core/Typography$LinkMedium;", "Lcom/paypal/pds/core/Typography;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class LinkMedium extends com.paypal.pds.core.Typography {
        public static final int $stable = 0;
        public static final com.paypal.pds.core.Typography.LinkMedium INSTANCE = new com.paypal.pds.core.Typography.LinkMedium();

        private LinkMedium() {
            super(new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.Typography$LinkMedium$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.pds.core.Typography.LinkMedium.$r8$lambda$w5e1PEmuryrGQDTh4N6D2VV6Jf4((com.paypal.pds.tokens.PDSTokens) obj);
                }
            }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.Typography$LinkMedium$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Float.valueOf(com.paypal.pds.core.Typography.LinkMedium.m22117$r8$lambda$W8p4S46hZc_zChULcAxFHw0V8((com.paypal.pds.tokens.PDSTokens) obj));
                }
            }, null);
        }

        /* renamed from: $r8$lambda$W8p4S46hZc_zC-hUL-cAxFHw0V8, reason: not valid java name */
        public static /* synthetic */ float m22117$r8$lambda$W8p4S46hZc_zChULcAxFHw0V8(com.paypal.pds.tokens.PDSTokens pDSTokens) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
            return pDSTokens.getTextLinkMediumMaxScale();
        }

        public static /* synthetic */ androidx.compose.ui.text.TextStyle $r8$lambda$w5e1PEmuryrGQDTh4N6D2VV6Jf4(com.paypal.pds.tokens.PDSTokens pDSTokens) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
            return new androidx.compose.ui.text.TextStyle(0L, pDSTokens.mo22329getTextLinkMediumFontSizeXSAIIZE(), new androidx.compose.ui.text.font.FontWeight(pDSTokens.getTextLinkMediumFontWeight()), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, androidx.compose.ui.text.font.FontFamilyKt.FontFamily(androidx.compose.ui.text.font.FontKt.m8134FontYpTlLL0$default(pDSTokens.getTextLinkMediumFontFamily(), null, 0, 0, 14, null)), "liga 0", pDSTokens.mo22330getTextLinkMediumLetterSpacingXSAIIZE(), (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, com.paypal.pds.core.TypographyKt.access$toTextDecoration(pDSTokens.getTextLinkMediumTextDecoration()), (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 0, 0, pDSTokens.mo22331getTextLinkMediumLineHeightXSAIIZE(), (androidx.compose.ui.text.style.TextIndent) null, (androidx.compose.ui.text.PlatformTextStyle) null, new androidx.compose.ui.text.style.LineHeightStyle(androidx.compose.ui.text.style.LineHeightStyle.Alignment.INSTANCE.m8411getProportionalPIaL0Z0(), androidx.compose.ui.text.style.LineHeightStyle.Trim.INSTANCE.m8435getNoneEVpEnUU(), (kotlin.jvm.internal.DefaultConstructorMarker) null), 0, 0, (androidx.compose.ui.text.style.TextMotion) null, 15593241, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/core/Typography$LinkSmall;", "Lcom/paypal/pds/core/Typography;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class LinkSmall extends com.paypal.pds.core.Typography {
        public static final int $stable = 0;
        public static final com.paypal.pds.core.Typography.LinkSmall INSTANCE = new com.paypal.pds.core.Typography.LinkSmall();

        private LinkSmall() {
            super(new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.Typography$LinkSmall$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.pds.core.Typography.LinkSmall.$r8$lambda$Z0XmfssJjMSUugem0dCKosw8ZE8((com.paypal.pds.tokens.PDSTokens) obj);
                }
            }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.Typography$LinkSmall$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Float.valueOf(com.paypal.pds.core.Typography.LinkSmall.m22118$r8$lambda$ARjbq94FsMBlulOdEh2Cnoeb8k((com.paypal.pds.tokens.PDSTokens) obj));
                }
            }, null);
        }

        /* renamed from: $r8$lambda$ARjbq94FsMBlulOdEh2Cnoeb8-k, reason: not valid java name */
        public static /* synthetic */ float m22118$r8$lambda$ARjbq94FsMBlulOdEh2Cnoeb8k(com.paypal.pds.tokens.PDSTokens pDSTokens) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
            return pDSTokens.getTextLinkSmallMaxScale();
        }

        public static /* synthetic */ androidx.compose.ui.text.TextStyle $r8$lambda$Z0XmfssJjMSUugem0dCKosw8ZE8(com.paypal.pds.tokens.PDSTokens pDSTokens) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
            return new androidx.compose.ui.text.TextStyle(0L, pDSTokens.mo22332getTextLinkSmallFontSizeXSAIIZE(), new androidx.compose.ui.text.font.FontWeight(pDSTokens.getTextLinkSmallFontWeight()), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, androidx.compose.ui.text.font.FontFamilyKt.FontFamily(androidx.compose.ui.text.font.FontKt.m8134FontYpTlLL0$default(pDSTokens.getTextLinkSmallFontFamily(), null, 0, 0, 14, null)), "liga 0", pDSTokens.mo22333getTextLinkSmallLetterSpacingXSAIIZE(), (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, com.paypal.pds.core.TypographyKt.access$toTextDecoration(pDSTokens.getTextLinkSmallTextDecoration()), (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 0, 0, pDSTokens.mo22334getTextLinkSmallLineHeightXSAIIZE(), (androidx.compose.ui.text.style.TextIndent) null, (androidx.compose.ui.text.PlatformTextStyle) null, new androidx.compose.ui.text.style.LineHeightStyle(androidx.compose.ui.text.style.LineHeightStyle.Alignment.INSTANCE.m8411getProportionalPIaL0Z0(), androidx.compose.ui.text.style.LineHeightStyle.Trim.INSTANCE.m8435getNoneEVpEnUU(), (kotlin.jvm.internal.DefaultConstructorMarker) null), 0, 0, (androidx.compose.ui.text.style.TextMotion) null, 15593241, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/core/Typography$TitleLarge;", "Lcom/paypal/pds/core/Typography;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class TitleLarge extends com.paypal.pds.core.Typography {
        public static final int $stable = 0;
        public static final com.paypal.pds.core.Typography.TitleLarge INSTANCE = new com.paypal.pds.core.Typography.TitleLarge();

        private TitleLarge() {
            super(new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.Typography$TitleLarge$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.pds.core.Typography.TitleLarge.m22119$r8$lambda$5eXPsLMAia7uRNJaIDcAX4lK3U((com.paypal.pds.tokens.PDSTokens) obj);
                }
            }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.Typography$TitleLarge$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Float.valueOf(com.paypal.pds.core.Typography.TitleLarge.m22120$r8$lambda$8nbI2gRjn85rBaaIYwYMcFThrI((com.paypal.pds.tokens.PDSTokens) obj));
                }
            }, null);
        }

        /* renamed from: $r8$lambda$-5eXPsLMAia7uRNJaIDcAX4lK3U, reason: not valid java name */
        public static /* synthetic */ androidx.compose.ui.text.TextStyle m22119$r8$lambda$5eXPsLMAia7uRNJaIDcAX4lK3U(com.paypal.pds.tokens.PDSTokens pDSTokens) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
            return new androidx.compose.ui.text.TextStyle(0L, pDSTokens.mo22335getTextTitleLargeFontSizeXSAIIZE(), new androidx.compose.ui.text.font.FontWeight(pDSTokens.getTextTitleLargeFontWeight()), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, androidx.compose.ui.text.font.FontFamilyKt.FontFamily(androidx.compose.ui.text.font.FontKt.m8134FontYpTlLL0$default(pDSTokens.getTextTitleLargeFontFamily(), null, 0, 0, 14, null)), "liga 0", pDSTokens.mo22336getTextTitleLargeLetterSpacingXSAIIZE(), (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 0, 0, pDSTokens.mo22337getTextTitleLargeLineHeightXSAIIZE(), (androidx.compose.ui.text.style.TextIndent) null, (androidx.compose.ui.text.PlatformTextStyle) null, new androidx.compose.ui.text.style.LineHeightStyle(androidx.compose.ui.text.style.LineHeightStyle.Alignment.INSTANCE.m8411getProportionalPIaL0Z0(), androidx.compose.ui.text.style.LineHeightStyle.Trim.INSTANCE.m8435getNoneEVpEnUU(), (kotlin.jvm.internal.DefaultConstructorMarker) null), 0, 0, (androidx.compose.ui.text.style.TextMotion) null, 15597337, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        /* renamed from: $r8$lambda$8nbI2gRjn85rBa-aIYwYMcFThrI, reason: not valid java name */
        public static /* synthetic */ float m22120$r8$lambda$8nbI2gRjn85rBaaIYwYMcFThrI(com.paypal.pds.tokens.PDSTokens pDSTokens) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
            return pDSTokens.getTextTitleLargeMaxScale();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/core/Typography$TitleMedium;", "Lcom/paypal/pds/core/Typography;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TitleMedium extends com.paypal.pds.core.Typography {
        public static final int $stable = 0;
        public static final com.paypal.pds.core.Typography.TitleMedium INSTANCE = new com.paypal.pds.core.Typography.TitleMedium();

        private TitleMedium() {
            super(new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.Typography$TitleMedium$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.pds.core.Typography.TitleMedium.$r8$lambda$aSQqBTm3dbZqgzh_HJj8oQOPzu0((com.paypal.pds.tokens.PDSTokens) obj);
                }
            }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.Typography$TitleMedium$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Float.valueOf(com.paypal.pds.core.Typography.TitleMedium.$r8$lambda$Fpe2wSn45K2aS5XOhS_py66PH90((com.paypal.pds.tokens.PDSTokens) obj));
                }
            }, null);
        }

        public static /* synthetic */ float $r8$lambda$Fpe2wSn45K2aS5XOhS_py66PH90(com.paypal.pds.tokens.PDSTokens pDSTokens) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
            return pDSTokens.getTextTitleMediumMaxScale();
        }

        public static /* synthetic */ androidx.compose.ui.text.TextStyle $r8$lambda$aSQqBTm3dbZqgzh_HJj8oQOPzu0(com.paypal.pds.tokens.PDSTokens pDSTokens) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
            return new androidx.compose.ui.text.TextStyle(0L, pDSTokens.mo22338getTextTitleMediumFontSizeXSAIIZE(), new androidx.compose.ui.text.font.FontWeight(pDSTokens.getTextTitleMediumFontWeight()), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, androidx.compose.ui.text.font.FontFamilyKt.FontFamily(androidx.compose.ui.text.font.FontKt.m8134FontYpTlLL0$default(pDSTokens.getTextTitleMediumFontFamily(), null, 0, 0, 14, null)), "liga 0", pDSTokens.mo22339getTextTitleMediumLetterSpacingXSAIIZE(), (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 0, 0, pDSTokens.mo22340getTextTitleMediumLineHeightXSAIIZE(), (androidx.compose.ui.text.style.TextIndent) null, (androidx.compose.ui.text.PlatformTextStyle) null, new androidx.compose.ui.text.style.LineHeightStyle(androidx.compose.ui.text.style.LineHeightStyle.Alignment.INSTANCE.m8411getProportionalPIaL0Z0(), androidx.compose.ui.text.style.LineHeightStyle.Trim.INSTANCE.m8435getNoneEVpEnUU(), (kotlin.jvm.internal.DefaultConstructorMarker) null), 0, 0, (androidx.compose.ui.text.style.TextMotion) null, 15597337, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
    }

    public final androidx.compose.ui.text.TextStyle getTextStyle(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-679813939, i, -1, "com.paypal.pds.core.Typography.<get-textStyle> (Typography.kt:379)");
        }
        com.paypal.pds.tokens.PDSTokens localTokens = com.paypal.pds.core.ThemeKt.localTokens(composer, 0);
        kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
        spreadBuilder.addSpread(new java.lang.Object[]{this});
        spreadBuilder.add(localTokens);
        boolean z = false;
        for (java.lang.Object obj : spreadBuilder.toArray(new java.lang.Object[spreadBuilder.size()])) {
            z |= composer.changed(obj);
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = (androidx.compose.ui.text.TextStyle) this.Camera2StreamConfigurationMap.invoke(localTokens);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.ui.text.TextStyle textStyle = (androidx.compose.ui.text.TextStyle) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return textStyle;
    }

    public final float getMaxScaleFactor(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1938097897, i, -1, "com.paypal.pds.core.Typography.<get-maxScaleFactor> (Typography.kt:395)");
        }
        float floatValue = this.getHighResolutionOutputSizeshNQ4ISI.invoke(com.paypal.pds.core.ThemeKt.localTokens(composer, 0)).floatValue();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return floatValue;
    }

    public /* synthetic */ Typography(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, function12);
    }
}
