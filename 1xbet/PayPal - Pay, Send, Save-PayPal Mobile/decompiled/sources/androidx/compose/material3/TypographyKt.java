package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0018\u0010\u0002\u001a\u00020\u0003*\u00020\u00018AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\" \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/material3/Typography;", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/ui/text/TextStyle;", "fromToken", "(Landroidx/compose/material3/Typography;Landroidx/compose/material3/tokens/TypographyKeyTokens;)Landroidx/compose/ui/text/TextStyle;", "getValue", "(Landroidx/compose/material3/tokens/TypographyKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalTypography", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalTypography", "()Landroidx/compose/runtime/ProvidableCompositionLocal;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TypographyKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material3.Typography> LocalTypography = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.TypographyKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return androidx.compose.material3.TypographyKt.$r8$lambda$8mpOFH9czLLBXUsu4Dr4skTts1k();
        }
    });

    public static final androidx.compose.ui.text.TextStyle fromToken(androidx.compose.material3.Typography typography, androidx.compose.material3.tokens.TypographyKeyTokens typographyKeyTokens) {
        switch (androidx.compose.material3.TypographyKt.WhenMappings.$EnumSwitchMapping$0[typographyKeyTokens.ordinal()]) {
            case 1:
                return typography.getDisplayLarge();
            case 2:
                return typography.getDisplayMedium();
            case 3:
                return typography.getDisplaySmall();
            case 4:
                return typography.getHeadlineLarge();
            case 5:
                return typography.getHeadlineMedium();
            case 6:
                return typography.getHeadlineSmall();
            case 7:
                return typography.getTitleLarge();
            case 8:
                return typography.getTitleMedium();
            case 9:
                return typography.getTitleSmall();
            case 10:
                return typography.getBodyLarge();
            case 11:
                return typography.getBodyMedium();
            case 12:
                return typography.getBodySmall();
            case 13:
                return typography.getLabelLarge();
            case 14:
                return typography.getLabelMedium();
            case 15:
                return typography.getLabelSmall();
            case 16:
                return typography.getDisplayLargeEmphasized();
            case 17:
                return typography.getDisplayMediumEmphasized();
            case 18:
                return typography.getDisplaySmallEmphasized();
            case 19:
                return typography.getHeadlineLargeEmphasized();
            case 20:
                return typography.getHeadlineMediumEmphasized();
            case 21:
                return typography.getHeadlineSmallEmphasized();
            case 22:
                return typography.getTitleLargeEmphasized();
            case 23:
                return typography.getTitleMediumEmphasized();
            case 24:
                return typography.getTitleSmallEmphasized();
            case 25:
                return typography.getBodyLargeEmphasized();
            case 26:
                return typography.getBodyMediumEmphasized();
            case 27:
                return typography.getBodySmallEmphasized();
            case 28:
                return typography.getLabelLargeEmphasized();
            case 29:
                return typography.getLabelMediumEmphasized();
            case 30:
                return typography.getLabelSmallEmphasized();
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final androidx.compose.ui.text.TextStyle getValue(androidx.compose.material3.tokens.TypographyKeyTokens typographyKeyTokens, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1049072145, i, -1, "androidx.compose.material3.<get-value> (Typography.kt:524)");
        }
        androidx.compose.ui.text.TextStyle fromToken = fromToken(androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer, 6), typographyKeyTokens);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return fromToken;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material3.Typography> getLocalTypography() {
        return LocalTypography;
    }

    public static /* synthetic */ androidx.compose.material3.Typography $r8$lambda$8mpOFH9czLLBXUsu4Dr4skTts1k() {
        return new androidx.compose.material3.Typography(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.material3.tokens.TypographyKeyTokens.values().length];
            try {
                iArr[androidx.compose.material3.tokens.TypographyKeyTokens.DisplayLarge.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.material3.tokens.TypographyKeyTokens.DisplayMedium.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.material3.tokens.TypographyKeyTokens.DisplaySmall.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.compose.material3.tokens.TypographyKeyTokens.HeadlineLarge.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[androidx.compose.material3.tokens.TypographyKeyTokens.HeadlineMedium.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[androidx.compose.material3.tokens.TypographyKeyTokens.HeadlineSmall.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[androidx.compose.material3.tokens.TypographyKeyTokens.TitleLarge.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[androidx.compose.material3.tokens.TypographyKeyTokens.TitleMedium.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[androidx.compose.material3.tokens.TypographyKeyTokens.TitleSmall.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[androidx.compose.material3.tokens.TypographyKeyTokens.BodyLarge.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[androidx.compose.material3.tokens.TypographyKeyTokens.BodyMedium.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[androidx.compose.material3.tokens.TypographyKeyTokens.BodySmall.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[androidx.compose.material3.tokens.TypographyKeyTokens.LabelLarge.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr[androidx.compose.material3.tokens.TypographyKeyTokens.LabelMedium.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr[androidx.compose.material3.tokens.TypographyKeyTokens.LabelSmall.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr[androidx.compose.material3.tokens.TypographyKeyTokens.DisplayLargeEmphasized.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr[androidx.compose.material3.tokens.TypographyKeyTokens.DisplayMediumEmphasized.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr[androidx.compose.material3.tokens.TypographyKeyTokens.DisplaySmallEmphasized.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr[androidx.compose.material3.tokens.TypographyKeyTokens.HeadlineLargeEmphasized.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr[androidx.compose.material3.tokens.TypographyKeyTokens.HeadlineMediumEmphasized.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr[androidx.compose.material3.tokens.TypographyKeyTokens.HeadlineSmallEmphasized.ordinal()] = 21;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                iArr[androidx.compose.material3.tokens.TypographyKeyTokens.TitleLargeEmphasized.ordinal()] = 22;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                iArr[androidx.compose.material3.tokens.TypographyKeyTokens.TitleMediumEmphasized.ordinal()] = 23;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                iArr[androidx.compose.material3.tokens.TypographyKeyTokens.TitleSmallEmphasized.ordinal()] = 24;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                iArr[androidx.compose.material3.tokens.TypographyKeyTokens.BodyLargeEmphasized.ordinal()] = 25;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                iArr[androidx.compose.material3.tokens.TypographyKeyTokens.BodyMediumEmphasized.ordinal()] = 26;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                iArr[androidx.compose.material3.tokens.TypographyKeyTokens.BodySmallEmphasized.ordinal()] = 27;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
            try {
                iArr[androidx.compose.material3.tokens.TypographyKeyTokens.LabelLargeEmphasized.ordinal()] = 28;
            } catch (java.lang.NoSuchFieldError unused28) {
            }
            try {
                iArr[androidx.compose.material3.tokens.TypographyKeyTokens.LabelMediumEmphasized.ordinal()] = 29;
            } catch (java.lang.NoSuchFieldError unused29) {
            }
            try {
                iArr[androidx.compose.material3.tokens.TypographyKeyTokens.LabelSmallEmphasized.ordinal()] = 30;
            } catch (java.lang.NoSuchFieldError unused30) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
