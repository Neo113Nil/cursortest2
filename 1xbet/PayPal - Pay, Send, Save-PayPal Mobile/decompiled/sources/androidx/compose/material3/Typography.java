package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\"\u0018\u00002\u00020\u0001Bµ\u0002\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"B\u009f\u0001\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b!\u0010#J»\u0002\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u0002H\u0000¢\u0006\u0004\b$\u0010%J£\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u00104R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b5\u00104R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b6\u00104R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b7\u00104R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b8\u00104R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b9\u00104R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b:\u00104R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b;\u00104R\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b<\u00104R\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b=\u00104R\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b>\u00104R\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b?\u00104R\u001a\u0010\u000f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b@\u00104R\u001a\u0010\u0010\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\bA\u00104R\u001a\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\bB\u00104R\u001a\u0010\u0012\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\bC\u00104R\u001a\u0010\u0013\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0013\u00102\u001a\u0004\bD\u00104R\u001a\u0010\u0014\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0014\u00102\u001a\u0004\bE\u00104R\u001a\u0010\u0015\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0015\u00102\u001a\u0004\bF\u00104R\u001a\u0010\u0016\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0016\u00102\u001a\u0004\bG\u00104R\u001a\u0010\u0017\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0017\u00102\u001a\u0004\bH\u00104R\u001a\u0010\u0018\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0018\u00102\u001a\u0004\bI\u00104R\u001a\u0010\u0019\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0019\u00102\u001a\u0004\bJ\u00104R\u001a\u0010\u001a\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001a\u00102\u001a\u0004\bK\u00104R\u001a\u0010\u001b\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001b\u00102\u001a\u0004\bL\u00104R\u001a\u0010\u001c\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001c\u00102\u001a\u0004\bM\u00104R\u001a\u0010\u001d\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001d\u00102\u001a\u0004\bN\u00104R\u001a\u0010\u001e\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001e\u00102\u001a\u0004\bO\u00104R\u001a\u0010\u001f\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001f\u00102\u001a\u0004\bP\u00104R\u001a\u0010 \u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b \u00102\u001a\u0004\bQ\u00104"}, d2 = {"Landroidx/compose/material3/Typography;", "", "Landroidx/compose/ui/text/TextStyle;", "displayLarge", "displayMedium", "displaySmall", "headlineLarge", "headlineMedium", "headlineSmall", "titleLarge", "titleMedium", "titleSmall", "bodyLarge", "bodyMedium", "bodySmall", "labelLarge", "labelMedium", "labelSmall", "displayLargeEmphasized", "displayMediumEmphasized", "displaySmallEmphasized", "headlineLargeEmphasized", "headlineMediumEmphasized", "headlineSmallEmphasized", "titleLargeEmphasized", "titleMediumEmphasized", "titleSmallEmphasized", "bodyLargeEmphasized", "bodyMediumEmphasized", "bodySmallEmphasized", "labelLargeEmphasized", "labelMediumEmphasized", "labelSmallEmphasized", "<init>", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "copy$material3", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)Landroidx/compose/material3/Typography;", "copy", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)Landroidx/compose/material3/Typography;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/TextStyle;", "getDisplayLarge", "()Landroidx/compose/ui/text/TextStyle;", "getDisplayMedium", "getDisplaySmall", "getHeadlineLarge", "getHeadlineMedium", "getHeadlineSmall", "getTitleLarge", "getTitleMedium", "getTitleSmall", "getBodyLarge", "getBodyMedium", "getBodySmall", "getLabelLarge", "getLabelMedium", "getLabelSmall", "getDisplayLargeEmphasized$material3", "getDisplayMediumEmphasized$material3", "getDisplaySmallEmphasized$material3", "getHeadlineLargeEmphasized$material3", "getHeadlineMediumEmphasized$material3", "getHeadlineSmallEmphasized$material3", "getTitleLargeEmphasized$material3", "getTitleMediumEmphasized$material3", "getTitleSmallEmphasized$material3", "getBodyLargeEmphasized$material3", "getBodyMediumEmphasized$material3", "getBodySmallEmphasized$material3", "getLabelLargeEmphasized$material3", "getLabelMediumEmphasized$material3", "getLabelSmallEmphasized$material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Typography {
    public static final int $stable = 0;
    private final androidx.compose.ui.text.TextStyle bodyLarge;
    private final androidx.compose.ui.text.TextStyle bodyLargeEmphasized;
    private final androidx.compose.ui.text.TextStyle bodyMedium;
    private final androidx.compose.ui.text.TextStyle bodyMediumEmphasized;
    private final androidx.compose.ui.text.TextStyle bodySmall;
    private final androidx.compose.ui.text.TextStyle bodySmallEmphasized;
    private final androidx.compose.ui.text.TextStyle displayLarge;
    private final androidx.compose.ui.text.TextStyle displayLargeEmphasized;
    private final androidx.compose.ui.text.TextStyle displayMedium;
    private final androidx.compose.ui.text.TextStyle displayMediumEmphasized;
    private final androidx.compose.ui.text.TextStyle displaySmall;
    private final androidx.compose.ui.text.TextStyle displaySmallEmphasized;
    private final androidx.compose.ui.text.TextStyle headlineLarge;
    private final androidx.compose.ui.text.TextStyle headlineLargeEmphasized;
    private final androidx.compose.ui.text.TextStyle headlineMedium;
    private final androidx.compose.ui.text.TextStyle headlineMediumEmphasized;
    private final androidx.compose.ui.text.TextStyle headlineSmall;
    private final androidx.compose.ui.text.TextStyle headlineSmallEmphasized;
    private final androidx.compose.ui.text.TextStyle labelLarge;
    private final androidx.compose.ui.text.TextStyle labelLargeEmphasized;
    private final androidx.compose.ui.text.TextStyle labelMedium;
    private final androidx.compose.ui.text.TextStyle labelMediumEmphasized;
    private final androidx.compose.ui.text.TextStyle labelSmall;
    private final androidx.compose.ui.text.TextStyle labelSmallEmphasized;
    private final androidx.compose.ui.text.TextStyle titleLarge;
    private final androidx.compose.ui.text.TextStyle titleLargeEmphasized;
    private final androidx.compose.ui.text.TextStyle titleMedium;
    private final androidx.compose.ui.text.TextStyle titleMediumEmphasized;
    private final androidx.compose.ui.text.TextStyle titleSmall;
    private final androidx.compose.ui.text.TextStyle titleSmallEmphasized;

    public Typography(androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.text.TextStyle textStyle2, androidx.compose.ui.text.TextStyle textStyle3, androidx.compose.ui.text.TextStyle textStyle4, androidx.compose.ui.text.TextStyle textStyle5, androidx.compose.ui.text.TextStyle textStyle6, androidx.compose.ui.text.TextStyle textStyle7, androidx.compose.ui.text.TextStyle textStyle8, androidx.compose.ui.text.TextStyle textStyle9, androidx.compose.ui.text.TextStyle textStyle10, androidx.compose.ui.text.TextStyle textStyle11, androidx.compose.ui.text.TextStyle textStyle12, androidx.compose.ui.text.TextStyle textStyle13, androidx.compose.ui.text.TextStyle textStyle14, androidx.compose.ui.text.TextStyle textStyle15, androidx.compose.ui.text.TextStyle textStyle16, androidx.compose.ui.text.TextStyle textStyle17, androidx.compose.ui.text.TextStyle textStyle18, androidx.compose.ui.text.TextStyle textStyle19, androidx.compose.ui.text.TextStyle textStyle20, androidx.compose.ui.text.TextStyle textStyle21, androidx.compose.ui.text.TextStyle textStyle22, androidx.compose.ui.text.TextStyle textStyle23, androidx.compose.ui.text.TextStyle textStyle24, androidx.compose.ui.text.TextStyle textStyle25, androidx.compose.ui.text.TextStyle textStyle26, androidx.compose.ui.text.TextStyle textStyle27, androidx.compose.ui.text.TextStyle textStyle28, androidx.compose.ui.text.TextStyle textStyle29, androidx.compose.ui.text.TextStyle textStyle30) {
        this.displayLarge = textStyle;
        this.displayMedium = textStyle2;
        this.displaySmall = textStyle3;
        this.headlineLarge = textStyle4;
        this.headlineMedium = textStyle5;
        this.headlineSmall = textStyle6;
        this.titleLarge = textStyle7;
        this.titleMedium = textStyle8;
        this.titleSmall = textStyle9;
        this.bodyLarge = textStyle10;
        this.bodyMedium = textStyle11;
        this.bodySmall = textStyle12;
        this.labelLarge = textStyle13;
        this.labelMedium = textStyle14;
        this.labelSmall = textStyle15;
        this.displayLargeEmphasized = textStyle16;
        this.displayMediumEmphasized = textStyle17;
        this.displaySmallEmphasized = textStyle18;
        this.headlineLargeEmphasized = textStyle19;
        this.headlineMediumEmphasized = textStyle20;
        this.headlineSmallEmphasized = textStyle21;
        this.titleLargeEmphasized = textStyle22;
        this.titleMediumEmphasized = textStyle23;
        this.titleSmallEmphasized = textStyle24;
        this.bodyLargeEmphasized = textStyle25;
        this.bodyMediumEmphasized = textStyle26;
        this.bodySmallEmphasized = textStyle27;
        this.labelLargeEmphasized = textStyle28;
        this.labelMediumEmphasized = textStyle29;
        this.labelSmallEmphasized = textStyle30;
    }

    public /* synthetic */ Typography(androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.text.TextStyle textStyle2, androidx.compose.ui.text.TextStyle textStyle3, androidx.compose.ui.text.TextStyle textStyle4, androidx.compose.ui.text.TextStyle textStyle5, androidx.compose.ui.text.TextStyle textStyle6, androidx.compose.ui.text.TextStyle textStyle7, androidx.compose.ui.text.TextStyle textStyle8, androidx.compose.ui.text.TextStyle textStyle9, androidx.compose.ui.text.TextStyle textStyle10, androidx.compose.ui.text.TextStyle textStyle11, androidx.compose.ui.text.TextStyle textStyle12, androidx.compose.ui.text.TextStyle textStyle13, androidx.compose.ui.text.TextStyle textStyle14, androidx.compose.ui.text.TextStyle textStyle15, androidx.compose.ui.text.TextStyle textStyle16, androidx.compose.ui.text.TextStyle textStyle17, androidx.compose.ui.text.TextStyle textStyle18, androidx.compose.ui.text.TextStyle textStyle19, androidx.compose.ui.text.TextStyle textStyle20, androidx.compose.ui.text.TextStyle textStyle21, androidx.compose.ui.text.TextStyle textStyle22, androidx.compose.ui.text.TextStyle textStyle23, androidx.compose.ui.text.TextStyle textStyle24, androidx.compose.ui.text.TextStyle textStyle25, androidx.compose.ui.text.TextStyle textStyle26, androidx.compose.ui.text.TextStyle textStyle27, androidx.compose.ui.text.TextStyle textStyle28, androidx.compose.ui.text.TextStyle textStyle29, androidx.compose.ui.text.TextStyle textStyle30, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getDisplayLarge() : textStyle, (i & 2) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getDisplayMedium() : textStyle2, (i & 4) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getDisplaySmall() : textStyle3, (i & 8) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getHeadlineLarge() : textStyle4, (i & 16) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getHeadlineMedium() : textStyle5, (i & 32) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getHeadlineSmall() : textStyle6, (i & 64) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getTitleLarge() : textStyle7, (i & 128) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getTitleMedium() : textStyle8, (i & 256) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getTitleSmall() : textStyle9, (i & 512) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getBodyLarge() : textStyle10, (i & 1024) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getBodyMedium() : textStyle11, (i & 2048) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getBodySmall() : textStyle12, (i & 4096) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getLabelLarge() : textStyle13, (i & 8192) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getLabelMedium() : textStyle14, (i & 16384) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getLabelSmall() : textStyle15, (i & 32768) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getDisplayLargeEmphasized() : textStyle16, (i & 65536) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getDisplayMediumEmphasized() : textStyle17, (i & 131072) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getDisplaySmallEmphasized() : textStyle18, (i & 262144) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getHeadlineLargeEmphasized() : textStyle19, (i & 524288) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getHeadlineMediumEmphasized() : textStyle20, (i & 1048576) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getHeadlineSmallEmphasized() : textStyle21, (i & 2097152) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getTitleLargeEmphasized() : textStyle22, (i & 4194304) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getTitleMediumEmphasized() : textStyle23, (i & 8388608) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getTitleSmallEmphasized() : textStyle24, (i & 16777216) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getBodyLargeEmphasized() : textStyle25, (i & 33554432) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getBodyMediumEmphasized() : textStyle26, (i & 67108864) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getBodySmallEmphasized() : textStyle27, (i & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getLabelLargeEmphasized() : textStyle28, (i & 268435456) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getLabelMediumEmphasized() : textStyle29, (i & 536870912) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getLabelSmallEmphasized() : textStyle30);
    }

    public final androidx.compose.ui.text.TextStyle getDisplayLarge() {
        return this.displayLarge;
    }

    public final androidx.compose.ui.text.TextStyle getDisplayMedium() {
        return this.displayMedium;
    }

    public final androidx.compose.ui.text.TextStyle getDisplaySmall() {
        return this.displaySmall;
    }

    public final androidx.compose.ui.text.TextStyle getHeadlineLarge() {
        return this.headlineLarge;
    }

    public final androidx.compose.ui.text.TextStyle getHeadlineMedium() {
        return this.headlineMedium;
    }

    public final androidx.compose.ui.text.TextStyle getHeadlineSmall() {
        return this.headlineSmall;
    }

    public final androidx.compose.ui.text.TextStyle getTitleLarge() {
        return this.titleLarge;
    }

    public final androidx.compose.ui.text.TextStyle getTitleMedium() {
        return this.titleMedium;
    }

    public final androidx.compose.ui.text.TextStyle getTitleSmall() {
        return this.titleSmall;
    }

    public final androidx.compose.ui.text.TextStyle getBodyLarge() {
        return this.bodyLarge;
    }

    public final androidx.compose.ui.text.TextStyle getBodyMedium() {
        return this.bodyMedium;
    }

    public final androidx.compose.ui.text.TextStyle getBodySmall() {
        return this.bodySmall;
    }

    public final androidx.compose.ui.text.TextStyle getLabelLarge() {
        return this.labelLarge;
    }

    public final androidx.compose.ui.text.TextStyle getLabelMedium() {
        return this.labelMedium;
    }

    public final androidx.compose.ui.text.TextStyle getLabelSmall() {
        return this.labelSmall;
    }

    /* renamed from: getDisplayLargeEmphasized$material3, reason: from getter */
    public final androidx.compose.ui.text.TextStyle getDisplayLargeEmphasized() {
        return this.displayLargeEmphasized;
    }

    /* renamed from: getDisplayMediumEmphasized$material3, reason: from getter */
    public final androidx.compose.ui.text.TextStyle getDisplayMediumEmphasized() {
        return this.displayMediumEmphasized;
    }

    /* renamed from: getDisplaySmallEmphasized$material3, reason: from getter */
    public final androidx.compose.ui.text.TextStyle getDisplaySmallEmphasized() {
        return this.displaySmallEmphasized;
    }

    /* renamed from: getHeadlineLargeEmphasized$material3, reason: from getter */
    public final androidx.compose.ui.text.TextStyle getHeadlineLargeEmphasized() {
        return this.headlineLargeEmphasized;
    }

    /* renamed from: getHeadlineMediumEmphasized$material3, reason: from getter */
    public final androidx.compose.ui.text.TextStyle getHeadlineMediumEmphasized() {
        return this.headlineMediumEmphasized;
    }

    /* renamed from: getHeadlineSmallEmphasized$material3, reason: from getter */
    public final androidx.compose.ui.text.TextStyle getHeadlineSmallEmphasized() {
        return this.headlineSmallEmphasized;
    }

    /* renamed from: getTitleLargeEmphasized$material3, reason: from getter */
    public final androidx.compose.ui.text.TextStyle getTitleLargeEmphasized() {
        return this.titleLargeEmphasized;
    }

    /* renamed from: getTitleMediumEmphasized$material3, reason: from getter */
    public final androidx.compose.ui.text.TextStyle getTitleMediumEmphasized() {
        return this.titleMediumEmphasized;
    }

    /* renamed from: getTitleSmallEmphasized$material3, reason: from getter */
    public final androidx.compose.ui.text.TextStyle getTitleSmallEmphasized() {
        return this.titleSmallEmphasized;
    }

    /* renamed from: getBodyLargeEmphasized$material3, reason: from getter */
    public final androidx.compose.ui.text.TextStyle getBodyLargeEmphasized() {
        return this.bodyLargeEmphasized;
    }

    /* renamed from: getBodyMediumEmphasized$material3, reason: from getter */
    public final androidx.compose.ui.text.TextStyle getBodyMediumEmphasized() {
        return this.bodyMediumEmphasized;
    }

    /* renamed from: getBodySmallEmphasized$material3, reason: from getter */
    public final androidx.compose.ui.text.TextStyle getBodySmallEmphasized() {
        return this.bodySmallEmphasized;
    }

    /* renamed from: getLabelLargeEmphasized$material3, reason: from getter */
    public final androidx.compose.ui.text.TextStyle getLabelLargeEmphasized() {
        return this.labelLargeEmphasized;
    }

    /* renamed from: getLabelMediumEmphasized$material3, reason: from getter */
    public final androidx.compose.ui.text.TextStyle getLabelMediumEmphasized() {
        return this.labelMediumEmphasized;
    }

    /* renamed from: getLabelSmallEmphasized$material3, reason: from getter */
    public final androidx.compose.ui.text.TextStyle getLabelSmallEmphasized() {
        return this.labelSmallEmphasized;
    }

    public /* synthetic */ Typography(androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.text.TextStyle textStyle2, androidx.compose.ui.text.TextStyle textStyle3, androidx.compose.ui.text.TextStyle textStyle4, androidx.compose.ui.text.TextStyle textStyle5, androidx.compose.ui.text.TextStyle textStyle6, androidx.compose.ui.text.TextStyle textStyle7, androidx.compose.ui.text.TextStyle textStyle8, androidx.compose.ui.text.TextStyle textStyle9, androidx.compose.ui.text.TextStyle textStyle10, androidx.compose.ui.text.TextStyle textStyle11, androidx.compose.ui.text.TextStyle textStyle12, androidx.compose.ui.text.TextStyle textStyle13, androidx.compose.ui.text.TextStyle textStyle14, androidx.compose.ui.text.TextStyle textStyle15, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getDisplayLarge() : textStyle, (i & 2) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getDisplayMedium() : textStyle2, (i & 4) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getDisplaySmall() : textStyle3, (i & 8) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getHeadlineLarge() : textStyle4, (i & 16) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getHeadlineMedium() : textStyle5, (i & 32) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getHeadlineSmall() : textStyle6, (i & 64) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getTitleLarge() : textStyle7, (i & 128) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getTitleMedium() : textStyle8, (i & 256) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getTitleSmall() : textStyle9, (i & 512) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getBodyLarge() : textStyle10, (i & 1024) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getBodyMedium() : textStyle11, (i & 2048) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getBodySmall() : textStyle12, (i & 4096) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getLabelLarge() : textStyle13, (i & 8192) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getLabelMedium() : textStyle14, (i & 16384) != 0 ? androidx.compose.material3.tokens.TypographyTokens.INSTANCE.getLabelSmall() : textStyle15);
    }

    public Typography(androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.text.TextStyle textStyle2, androidx.compose.ui.text.TextStyle textStyle3, androidx.compose.ui.text.TextStyle textStyle4, androidx.compose.ui.text.TextStyle textStyle5, androidx.compose.ui.text.TextStyle textStyle6, androidx.compose.ui.text.TextStyle textStyle7, androidx.compose.ui.text.TextStyle textStyle8, androidx.compose.ui.text.TextStyle textStyle9, androidx.compose.ui.text.TextStyle textStyle10, androidx.compose.ui.text.TextStyle textStyle11, androidx.compose.ui.text.TextStyle textStyle12, androidx.compose.ui.text.TextStyle textStyle13, androidx.compose.ui.text.TextStyle textStyle14, androidx.compose.ui.text.TextStyle textStyle15) {
        this(textStyle, textStyle2, textStyle3, textStyle4, textStyle5, textStyle6, textStyle7, textStyle8, textStyle9, textStyle10, textStyle11, textStyle12, textStyle13, textStyle14, textStyle15, textStyle, textStyle2, textStyle3, textStyle4, textStyle5, textStyle6, textStyle7, textStyle8, textStyle9, textStyle10, textStyle11, textStyle12, textStyle13, textStyle14, textStyle15);
    }

    public final androidx.compose.material3.Typography copy$material3(androidx.compose.ui.text.TextStyle displayLarge, androidx.compose.ui.text.TextStyle displayMedium, androidx.compose.ui.text.TextStyle displaySmall, androidx.compose.ui.text.TextStyle headlineLarge, androidx.compose.ui.text.TextStyle headlineMedium, androidx.compose.ui.text.TextStyle headlineSmall, androidx.compose.ui.text.TextStyle titleLarge, androidx.compose.ui.text.TextStyle titleMedium, androidx.compose.ui.text.TextStyle titleSmall, androidx.compose.ui.text.TextStyle bodyLarge, androidx.compose.ui.text.TextStyle bodyMedium, androidx.compose.ui.text.TextStyle bodySmall, androidx.compose.ui.text.TextStyle labelLarge, androidx.compose.ui.text.TextStyle labelMedium, androidx.compose.ui.text.TextStyle labelSmall, androidx.compose.ui.text.TextStyle displayLargeEmphasized, androidx.compose.ui.text.TextStyle displayMediumEmphasized, androidx.compose.ui.text.TextStyle displaySmallEmphasized, androidx.compose.ui.text.TextStyle headlineLargeEmphasized, androidx.compose.ui.text.TextStyle headlineMediumEmphasized, androidx.compose.ui.text.TextStyle headlineSmallEmphasized, androidx.compose.ui.text.TextStyle titleLargeEmphasized, androidx.compose.ui.text.TextStyle titleMediumEmphasized, androidx.compose.ui.text.TextStyle titleSmallEmphasized, androidx.compose.ui.text.TextStyle bodyLargeEmphasized, androidx.compose.ui.text.TextStyle bodyMediumEmphasized, androidx.compose.ui.text.TextStyle bodySmallEmphasized, androidx.compose.ui.text.TextStyle labelLargeEmphasized, androidx.compose.ui.text.TextStyle labelMediumEmphasized, androidx.compose.ui.text.TextStyle labelSmallEmphasized) {
        return new androidx.compose.material3.Typography(displayLarge, displayMedium, displaySmall, headlineLarge, headlineMedium, headlineSmall, titleLarge, titleMedium, titleSmall, bodyLarge, bodyMedium, bodySmall, labelLarge, labelMedium, labelSmall, displayLargeEmphasized, displayMediumEmphasized, displaySmallEmphasized, headlineLargeEmphasized, headlineMediumEmphasized, headlineSmallEmphasized, titleLargeEmphasized, titleMediumEmphasized, titleSmallEmphasized, bodyLargeEmphasized, bodyMediumEmphasized, bodySmallEmphasized, labelLargeEmphasized, labelMediumEmphasized, labelSmallEmphasized);
    }

    public final androidx.compose.material3.Typography copy(androidx.compose.ui.text.TextStyle displayLarge, androidx.compose.ui.text.TextStyle displayMedium, androidx.compose.ui.text.TextStyle displaySmall, androidx.compose.ui.text.TextStyle headlineLarge, androidx.compose.ui.text.TextStyle headlineMedium, androidx.compose.ui.text.TextStyle headlineSmall, androidx.compose.ui.text.TextStyle titleLarge, androidx.compose.ui.text.TextStyle titleMedium, androidx.compose.ui.text.TextStyle titleSmall, androidx.compose.ui.text.TextStyle bodyLarge, androidx.compose.ui.text.TextStyle bodyMedium, androidx.compose.ui.text.TextStyle bodySmall, androidx.compose.ui.text.TextStyle labelLarge, androidx.compose.ui.text.TextStyle labelMedium, androidx.compose.ui.text.TextStyle labelSmall) {
        return copy$material3(displayLarge, displayMedium, displaySmall, headlineLarge, headlineMedium, headlineSmall, titleLarge, titleMedium, titleSmall, bodyLarge, bodyMedium, bodySmall, labelLarge, labelMedium, labelSmall, this.displayLargeEmphasized, this.displayMediumEmphasized, this.displaySmallEmphasized, this.headlineLargeEmphasized, this.headlineMediumEmphasized, this.headlineSmallEmphasized, this.titleLargeEmphasized, this.titleMediumEmphasized, this.titleSmallEmphasized, this.bodyLargeEmphasized, this.bodyMediumEmphasized, this.bodySmallEmphasized, this.labelLargeEmphasized, this.labelMediumEmphasized, this.labelSmallEmphasized);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.material3.Typography)) {
            return false;
        }
        androidx.compose.material3.Typography typography = (androidx.compose.material3.Typography) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.displayLarge, typography.displayLarge) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayMedium, typography.displayMedium) && kotlin.jvm.internal.Intrinsics.areEqual(this.displaySmall, typography.displaySmall) && kotlin.jvm.internal.Intrinsics.areEqual(this.headlineLarge, typography.headlineLarge) && kotlin.jvm.internal.Intrinsics.areEqual(this.headlineMedium, typography.headlineMedium) && kotlin.jvm.internal.Intrinsics.areEqual(this.headlineSmall, typography.headlineSmall) && kotlin.jvm.internal.Intrinsics.areEqual(this.titleLarge, typography.titleLarge) && kotlin.jvm.internal.Intrinsics.areEqual(this.titleMedium, typography.titleMedium) && kotlin.jvm.internal.Intrinsics.areEqual(this.titleSmall, typography.titleSmall) && kotlin.jvm.internal.Intrinsics.areEqual(this.bodyLarge, typography.bodyLarge) && kotlin.jvm.internal.Intrinsics.areEqual(this.bodyMedium, typography.bodyMedium) && kotlin.jvm.internal.Intrinsics.areEqual(this.bodySmall, typography.bodySmall) && kotlin.jvm.internal.Intrinsics.areEqual(this.labelLarge, typography.labelLarge) && kotlin.jvm.internal.Intrinsics.areEqual(this.labelMedium, typography.labelMedium) && kotlin.jvm.internal.Intrinsics.areEqual(this.labelSmall, typography.labelSmall) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayLargeEmphasized, typography.displayLargeEmphasized) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayMediumEmphasized, typography.displayMediumEmphasized) && kotlin.jvm.internal.Intrinsics.areEqual(this.displaySmallEmphasized, typography.displaySmallEmphasized) && kotlin.jvm.internal.Intrinsics.areEqual(this.headlineLargeEmphasized, typography.headlineLargeEmphasized) && kotlin.jvm.internal.Intrinsics.areEqual(this.headlineMediumEmphasized, typography.headlineMediumEmphasized) && kotlin.jvm.internal.Intrinsics.areEqual(this.headlineSmallEmphasized, typography.headlineSmallEmphasized) && kotlin.jvm.internal.Intrinsics.areEqual(this.titleLargeEmphasized, typography.titleLargeEmphasized) && kotlin.jvm.internal.Intrinsics.areEqual(this.titleMediumEmphasized, typography.titleMediumEmphasized) && kotlin.jvm.internal.Intrinsics.areEqual(this.titleSmallEmphasized, typography.titleSmallEmphasized) && kotlin.jvm.internal.Intrinsics.areEqual(this.bodyLargeEmphasized, typography.bodyLargeEmphasized) && kotlin.jvm.internal.Intrinsics.areEqual(this.bodyMediumEmphasized, typography.bodyMediumEmphasized) && kotlin.jvm.internal.Intrinsics.areEqual(this.bodySmallEmphasized, typography.bodySmallEmphasized) && kotlin.jvm.internal.Intrinsics.areEqual(this.labelLargeEmphasized, typography.labelLargeEmphasized) && kotlin.jvm.internal.Intrinsics.areEqual(this.labelMediumEmphasized, typography.labelMediumEmphasized) && kotlin.jvm.internal.Intrinsics.areEqual(this.labelSmallEmphasized, typography.labelSmallEmphasized);
    }

    public final int hashCode() {
        int hashCode = this.displayLarge.hashCode();
        int hashCode2 = this.displayMedium.hashCode();
        int hashCode3 = this.displaySmall.hashCode();
        int hashCode4 = this.headlineLarge.hashCode();
        int hashCode5 = this.headlineMedium.hashCode();
        int hashCode6 = this.headlineSmall.hashCode();
        int hashCode7 = this.titleLarge.hashCode();
        int hashCode8 = this.titleMedium.hashCode();
        int hashCode9 = this.titleSmall.hashCode();
        int hashCode10 = this.bodyLarge.hashCode();
        int hashCode11 = this.bodyMedium.hashCode();
        int hashCode12 = this.bodySmall.hashCode();
        int hashCode13 = this.labelLarge.hashCode();
        int hashCode14 = this.labelMedium.hashCode();
        int hashCode15 = this.labelSmall.hashCode();
        int hashCode16 = this.displayLargeEmphasized.hashCode();
        int hashCode17 = this.displayMediumEmphasized.hashCode();
        int hashCode18 = this.displaySmallEmphasized.hashCode();
        int hashCode19 = this.headlineLargeEmphasized.hashCode();
        int hashCode20 = this.headlineMediumEmphasized.hashCode();
        int hashCode21 = this.headlineSmallEmphasized.hashCode();
        int hashCode22 = this.titleLargeEmphasized.hashCode();
        int hashCode23 = this.titleMediumEmphasized.hashCode();
        int hashCode24 = this.titleSmallEmphasized.hashCode();
        int hashCode25 = this.bodyLargeEmphasized.hashCode();
        int hashCode26 = this.bodyMediumEmphasized.hashCode();
        int hashCode27 = this.bodySmallEmphasized.hashCode();
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + hashCode20) * 31) + hashCode21) * 31) + hashCode22) * 31) + hashCode23) * 31) + hashCode24) * 31) + hashCode25) * 31) + hashCode26) * 31) + hashCode27) * 31) + this.labelLargeEmphasized.hashCode()) * 31) + this.labelMediumEmphasized.hashCode()) * 31) + this.labelSmallEmphasized.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Typography(displayLarge=");
        sb.append(this.displayLarge);
        sb.append(", displayMedium=");
        sb.append(this.displayMedium);
        sb.append(",displaySmall=");
        sb.append(this.displaySmall);
        sb.append(", headlineLarge=");
        sb.append(this.headlineLarge);
        sb.append(", headlineMedium=");
        sb.append(this.headlineMedium);
        sb.append(", headlineSmall=");
        sb.append(this.headlineSmall);
        sb.append(", titleLarge=");
        sb.append(this.titleLarge);
        sb.append(", titleMedium=");
        sb.append(this.titleMedium);
        sb.append(", titleSmall=");
        sb.append(this.titleSmall);
        sb.append(", bodyLarge=");
        sb.append(this.bodyLarge);
        sb.append(", bodyMedium=");
        sb.append(this.bodyMedium);
        sb.append(", bodySmall=");
        sb.append(this.bodySmall);
        sb.append(", labelLarge=");
        sb.append(this.labelLarge);
        sb.append(", labelMedium=");
        sb.append(this.labelMedium);
        sb.append(", labelSmall=");
        sb.append(this.labelSmall);
        sb.append(", displayLargeEmphasized=");
        sb.append(this.displayLargeEmphasized);
        sb.append(", displayMediumEmphasized=");
        sb.append(this.displayMediumEmphasized);
        sb.append(", displaySmallEmphasized=");
        sb.append(this.displaySmallEmphasized);
        sb.append(", headlineLargeEmphasized=");
        sb.append(this.headlineLargeEmphasized);
        sb.append(", headlineMediumEmphasized=");
        sb.append(this.headlineMediumEmphasized);
        sb.append(", headlineSmallEmphasized=");
        sb.append(this.headlineSmallEmphasized);
        sb.append(", titleLargeEmphasized=");
        sb.append(this.titleLargeEmphasized);
        sb.append(", titleMediumEmphasized=");
        sb.append(this.titleMediumEmphasized);
        sb.append(", titleSmallEmphasized=");
        sb.append(this.titleSmallEmphasized);
        sb.append(", bodyLargeEmphasized=");
        sb.append(this.bodyLargeEmphasized);
        sb.append(", bodyMediumEmphasized=");
        sb.append(this.bodyMediumEmphasized);
        sb.append(", bodySmallEmphasized=");
        sb.append(this.bodySmallEmphasized);
        sb.append(", labelLargeEmphasized=");
        sb.append(this.labelLargeEmphasized);
        sb.append(", labelMediumEmphasized=");
        sb.append(this.labelMediumEmphasized);
        sb.append(", labelSmallEmphasized=");
        sb.append(this.labelSmallEmphasized);
        sb.append(')');
        return sb.toString();
    }

    public Typography() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK, null);
    }
}
