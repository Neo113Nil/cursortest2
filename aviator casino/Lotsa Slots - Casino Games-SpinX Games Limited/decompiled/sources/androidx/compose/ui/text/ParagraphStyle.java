package androidx.compose.ui.text;

/* compiled from: ParagraphStyle.kt */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001Bq\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014B5\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0015BM\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0016Be\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0017Bg\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0018Jr\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013ø\u0001\u0000¢\u0006\u0004\b<\u0010=J@\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0007ø\u0001\u0000¢\u0006\u0004\b>\u0010?JX\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0007ø\u0001\u0000¢\u0006\u0004\b@\u0010AJp\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ|\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\bD\u0010EJ\u0013\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010I\u001a\u00020JH\u0016J\u0014\u0010K\u001a\u00020\u00002\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0000H\u0007J\u0011\u0010L\u001a\u00020\u00002\u0006\u0010H\u001a\u00020\u0000H\u0087\u0002J\b\u0010M\u001a\u00020NH\u0016R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00118GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u0004\u0018\u00010\u000f8GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010!R\"\u0010\"\u001a\u0004\u0018\u00010\u00038GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010%R\"\u0010&\u001a\u0004\u0018\u00010\u00058GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b'\u0010\u001b\u001a\u0004\b(\u0010)R\u0019\u0010\u0010\u001a\u00020\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0019\u0010\u000e\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010,\u001a\u0004\b-\u0010+R\u0019\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010,\u001a\u0004\b5\u0010+R\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010,\u001a\u0004\b6\u0010+R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006O"}, d2 = {"Landroidx/compose/ui/text/ParagraphStyle;", "", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "textDirection", "Landroidx/compose/ui/text/style/TextDirection;", "lineHeight", "Landroidx/compose/ui/unit/TextUnit;", "textIndent", "Landroidx/compose/ui/text/style/TextIndent;", "platformStyle", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "lineHeightStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "lineBreak", "Landroidx/compose/ui/text/style/LineBreak;", "hyphens", "Landroidx/compose/ui/text/style/Hyphens;", "textMotion", "Landroidx/compose/ui/text/style/TextMotion;", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "deprecated_boxing_hyphens", "getHyphens-EaSxIns$annotations", "()V", "getHyphens-EaSxIns", "()Landroidx/compose/ui/text/style/Hyphens;", "deprecated_boxing_lineBreak", "getLineBreak-LgCVezo$annotations", "getLineBreak-LgCVezo", "()Landroidx/compose/ui/text/style/LineBreak;", "deprecated_boxing_textAlign", "getTextAlign-buA522U$annotations", "getTextAlign-buA522U", "()Landroidx/compose/ui/text/style/TextAlign;", "deprecated_boxing_textDirection", "getTextDirection-mmuk1to$annotations", "getTextDirection-mmuk1to", "()Landroidx/compose/ui/text/style/TextDirection;", "getHyphens-vmbZdU8", "()I", "I", "getLineBreak-rAG3T2k", "getLineHeight-XSAIIZE", "()J", "J", "getLineHeightStyle", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "getPlatformStyle", "()Landroidx/compose/ui/text/PlatformParagraphStyle;", "getTextAlign-e0LSkKk", "getTextDirection-s_7X-co", "getTextIndent", "()Landroidx/compose/ui/text/style/TextIndent;", "getTextMotion", "()Landroidx/compose/ui/text/style/TextMotion;", "copy", "copy-ykzQM6k", "(IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/ParagraphStyle;", "copy-Elsmlbk", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;)Landroidx/compose/ui/text/ParagraphStyle;", "copy-xPh5V4g", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;)Landroidx/compose/ui/text/ParagraphStyle;", "copy-ciSxzs0", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;)Landroidx/compose/ui/text/ParagraphStyle;", "copy-NH1kkwU", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/ParagraphStyle;", "equals", "", "other", "hashCode", "", "merge", "plus", "toString", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ParagraphStyle {
    public static final int $stable = 0;
    private final int hyphens;
    private final int lineBreak;
    private final long lineHeight;
    private final androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle;
    private final androidx.compose.ui.text.PlatformParagraphStyle platformStyle;
    private final int textAlign;
    private final int textDirection;
    private final androidx.compose.ui.text.style.TextIndent textIndent;
    private final androidx.compose.ui.text.style.TextMotion textMotion;

    public /* synthetic */ ParagraphStyle(int i, int i2, long j, androidx.compose.ui.text.style.TextIndent textIndent, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle, int i3, int i4, androidx.compose.ui.text.style.TextMotion textMotion, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, j, textIndent, platformParagraphStyle, lineHeightStyle, i3, i4, textMotion);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public /* synthetic */ ParagraphStyle(androidx.compose.ui.text.style.TextAlign textAlign, androidx.compose.ui.text.style.TextDirection textDirection, long j, androidx.compose.ui.text.style.TextIndent textIndent, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle, androidx.compose.ui.text.style.LineBreak lineBreak, androidx.compose.ui.text.style.Hyphens hyphens, androidx.compose.ui.text.style.TextMotion textMotion, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineBreak, Hyphens, TextMotion are deprecated. Please use the new stable constructors.")
    public /* synthetic */ ParagraphStyle(androidx.compose.ui.text.style.TextAlign textAlign, androidx.compose.ui.text.style.TextDirection textDirection, long j, androidx.compose.ui.text.style.TextIndent textIndent, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle, androidx.compose.ui.text.style.LineBreak lineBreak, androidx.compose.ui.text.style.Hyphens hyphens, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructors.")
    public /* synthetic */ ParagraphStyle(androidx.compose.ui.text.style.TextAlign textAlign, androidx.compose.ui.text.style.TextDirection textDirection, long j, androidx.compose.ui.text.style.TextIndent textIndent, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j, textIndent, platformParagraphStyle, lineHeightStyle);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructor.")
    public /* synthetic */ ParagraphStyle(androidx.compose.ui.text.style.TextAlign textAlign, androidx.compose.ui.text.style.TextDirection textDirection, long j, androidx.compose.ui.text.style.TextIndent textIndent, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j, textIndent);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getHyphens-EaSxIns$annotations, reason: not valid java name */
    public static /* synthetic */ void m3864getHyphensEaSxIns$annotations() {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getLineBreak-LgCVezo$annotations, reason: not valid java name */
    public static /* synthetic */ void m3865getLineBreakLgCVezo$annotations() {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getTextAlign-buA522U$annotations, reason: not valid java name */
    public static /* synthetic */ void m3866getTextAlignbuA522U$annotations() {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getTextDirection-mmuk1to$annotations, reason: not valid java name */
    public static /* synthetic */ void m3867getTextDirectionmmuk1to$annotations() {
    }

    private ParagraphStyle(int i, int i2, long j, androidx.compose.ui.text.style.TextIndent textIndent, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle, int i3, int i4, androidx.compose.ui.text.style.TextMotion textMotion) {
        this.textAlign = i;
        this.textDirection = i2;
        this.lineHeight = j;
        this.textIndent = textIndent;
        this.platformStyle = platformParagraphStyle;
        this.lineHeightStyle = lineHeightStyle;
        this.lineBreak = i3;
        this.hyphens = i4;
        this.textMotion = textMotion;
        if (androidx.compose.ui.unit.TextUnit.m4670equalsimpl0(j, androidx.compose.ui.unit.TextUnit.INSTANCE.m4684getUnspecifiedXSAIIZE()) || androidx.compose.ui.unit.TextUnit.m4673getValueimpl(j) >= 0.0f) {
            return;
        }
        throw new java.lang.IllegalStateException(("lineHeight can't be negative (" + androidx.compose.ui.unit.TextUnit.m4673getValueimpl(j) + ')').toString());
    }

    public /* synthetic */ ParagraphStyle(int i, int i2, long j, androidx.compose.ui.text.style.TextIndent textIndent, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle, int i3, int i4, androidx.compose.ui.text.style.TextMotion textMotion, int i5, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? androidx.compose.ui.text.style.TextAlign.INSTANCE.m4366getUnspecifiede0LSkKk() : i, (i5 & 2) != 0 ? androidx.compose.ui.text.style.TextDirection.INSTANCE.m4379getUnspecifieds_7Xco() : i2, (i5 & 4) != 0 ? androidx.compose.ui.unit.TextUnit.INSTANCE.m4684getUnspecifiedXSAIIZE() : j, (i5 & 8) != 0 ? null : textIndent, (i5 & 16) != 0 ? null : platformParagraphStyle, (i5 & 32) != 0 ? null : lineHeightStyle, (i5 & 64) != 0 ? androidx.compose.ui.text.style.LineBreak.INSTANCE.m4293getUnspecifiedrAG3T2k() : i3, (i5 & 128) != 0 ? androidx.compose.ui.text.style.Hyphens.INSTANCE.m4272getUnspecifiedvmbZdU8() : i4, (i5 & 256) == 0 ? textMotion : null, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* renamed from: getTextAlign-e0LSkKk, reason: not valid java name and from getter */
    public final int getTextAlign() {
        return this.textAlign;
    }

    /* renamed from: getTextDirection-s_7X-co, reason: not valid java name and from getter */
    public final int getTextDirection() {
        return this.textDirection;
    }

    /* renamed from: getLineHeight-XSAIIZE, reason: not valid java name and from getter */
    public final long getLineHeight() {
        return this.lineHeight;
    }

    public final androidx.compose.ui.text.style.TextIndent getTextIndent() {
        return this.textIndent;
    }

    public final androidx.compose.ui.text.PlatformParagraphStyle getPlatformStyle() {
        return this.platformStyle;
    }

    public final androidx.compose.ui.text.style.LineHeightStyle getLineHeightStyle() {
        return this.lineHeightStyle;
    }

    /* renamed from: getLineBreak-rAG3T2k, reason: not valid java name and from getter */
    public final int getLineBreak() {
        return this.lineBreak;
    }

    /* renamed from: getHyphens-vmbZdU8, reason: not valid java name and from getter */
    public final int getHyphens() {
        return this.hyphens;
    }

    public final androidx.compose.ui.text.style.TextMotion getTextMotion() {
        return this.textMotion;
    }

    /* renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final androidx.compose.ui.text.style.TextAlign m3878getTextAlignbuA522U() {
        return androidx.compose.ui.text.style.TextAlign.m4353boximpl(this.textAlign);
    }

    /* renamed from: getTextDirection-mmuk1to, reason: not valid java name */
    public final androidx.compose.ui.text.style.TextDirection m3880getTextDirectionmmuk1to() {
        return androidx.compose.ui.text.style.TextDirection.m4367boximpl(this.textDirection);
    }

    /* renamed from: getHyphens-EaSxIns, reason: not valid java name */
    public final androidx.compose.ui.text.style.Hyphens m3873getHyphensEaSxIns() {
        return androidx.compose.ui.text.style.Hyphens.m4263boximpl(this.hyphens);
    }

    /* renamed from: getLineBreak-LgCVezo, reason: not valid java name */
    public final androidx.compose.ui.text.style.LineBreak m3875getLineBreakLgCVezo() {
        return androidx.compose.ui.text.style.LineBreak.m4273boximpl(this.lineBreak);
    }

    public /* synthetic */ ParagraphStyle(androidx.compose.ui.text.style.TextAlign textAlign, androidx.compose.ui.text.style.TextDirection textDirection, long j, androidx.compose.ui.text.style.TextIndent textIndent, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle, androidx.compose.ui.text.style.LineBreak lineBreak, androidx.compose.ui.text.style.Hyphens hyphens, androidx.compose.ui.text.style.TextMotion textMotion, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : textAlign, (i & 2) != 0 ? null : textDirection, (i & 4) != 0 ? androidx.compose.ui.unit.TextUnit.INSTANCE.m4684getUnspecifiedXSAIIZE() : j, (i & 8) != 0 ? null : textIndent, (i & 16) != 0 ? null : platformParagraphStyle, (i & 32) != 0 ? null : lineHeightStyle, (i & 64) != 0 ? null : lineBreak, (i & 128) != 0 ? null : hyphens, (i & 256) == 0 ? textMotion : null, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    private ParagraphStyle(androidx.compose.ui.text.style.TextAlign textAlign, androidx.compose.ui.text.style.TextDirection textDirection, long j, androidx.compose.ui.text.style.TextIndent textIndent, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle, androidx.compose.ui.text.style.LineBreak lineBreak, androidx.compose.ui.text.style.Hyphens hyphens, androidx.compose.ui.text.style.TextMotion textMotion) {
        this(textAlign != null ? textAlign.getValue() : androidx.compose.ui.text.style.TextAlign.INSTANCE.m4366getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : androidx.compose.ui.text.style.TextDirection.INSTANCE.m4379getUnspecifieds_7Xco(), j, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.getMask() : androidx.compose.ui.text.style.LineBreak.INSTANCE.m4293getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.getValue() : androidx.compose.ui.text.style.Hyphens.INSTANCE.m4272getUnspecifiedvmbZdU8(), textMotion, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public /* synthetic */ ParagraphStyle(androidx.compose.ui.text.style.TextAlign textAlign, androidx.compose.ui.text.style.TextDirection textDirection, long j, androidx.compose.ui.text.style.TextIndent textIndent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : textAlign, (i & 2) != 0 ? null : textDirection, (i & 4) != 0 ? androidx.compose.ui.unit.TextUnit.INSTANCE.m4684getUnspecifiedXSAIIZE() : j, (i & 8) != 0 ? null : textIndent, null);
    }

    private ParagraphStyle(androidx.compose.ui.text.style.TextAlign textAlign, androidx.compose.ui.text.style.TextDirection textDirection, long j, androidx.compose.ui.text.style.TextIndent textIndent) {
        this(textAlign != null ? textAlign.getValue() : androidx.compose.ui.text.style.TextAlign.INSTANCE.m4366getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : androidx.compose.ui.text.style.TextDirection.INSTANCE.m4379getUnspecifieds_7Xco(), j, textIndent, (androidx.compose.ui.text.PlatformParagraphStyle) null, (androidx.compose.ui.text.style.LineHeightStyle) null, androidx.compose.ui.text.style.LineBreak.INSTANCE.m4293getUnspecifiedrAG3T2k(), androidx.compose.ui.text.style.Hyphens.INSTANCE.m4272getUnspecifiedvmbZdU8(), (androidx.compose.ui.text.style.TextMotion) null, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public /* synthetic */ ParagraphStyle(androidx.compose.ui.text.style.TextAlign textAlign, androidx.compose.ui.text.style.TextDirection textDirection, long j, androidx.compose.ui.text.style.TextIndent textIndent, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : textAlign, (i & 2) != 0 ? null : textDirection, (i & 4) != 0 ? androidx.compose.ui.unit.TextUnit.INSTANCE.m4684getUnspecifiedXSAIIZE() : j, (i & 8) != 0 ? null : textIndent, (i & 16) != 0 ? null : platformParagraphStyle, (i & 32) == 0 ? lineHeightStyle : null, null);
    }

    private ParagraphStyle(androidx.compose.ui.text.style.TextAlign textAlign, androidx.compose.ui.text.style.TextDirection textDirection, long j, androidx.compose.ui.text.style.TextIndent textIndent, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle) {
        this(textAlign != null ? textAlign.getValue() : androidx.compose.ui.text.style.TextAlign.INSTANCE.m4366getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : androidx.compose.ui.text.style.TextDirection.INSTANCE.m4379getUnspecifieds_7Xco(), j, textIndent, platformParagraphStyle, lineHeightStyle, androidx.compose.ui.text.style.LineBreak.INSTANCE.m4293getUnspecifiedrAG3T2k(), androidx.compose.ui.text.style.Hyphens.INSTANCE.m4272getUnspecifiedvmbZdU8(), (androidx.compose.ui.text.style.TextMotion) null, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public /* synthetic */ ParagraphStyle(androidx.compose.ui.text.style.TextAlign textAlign, androidx.compose.ui.text.style.TextDirection textDirection, long j, androidx.compose.ui.text.style.TextIndent textIndent, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle, androidx.compose.ui.text.style.LineBreak lineBreak, androidx.compose.ui.text.style.Hyphens hyphens, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : textAlign, (i & 2) != 0 ? null : textDirection, (i & 4) != 0 ? androidx.compose.ui.unit.TextUnit.INSTANCE.m4684getUnspecifiedXSAIIZE() : j, (i & 8) != 0 ? null : textIndent, (i & 16) != 0 ? null : platformParagraphStyle, (i & 32) != 0 ? null : lineHeightStyle, (i & 64) != 0 ? null : lineBreak, (i & 128) == 0 ? hyphens : null, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    private ParagraphStyle(androidx.compose.ui.text.style.TextAlign textAlign, androidx.compose.ui.text.style.TextDirection textDirection, long j, androidx.compose.ui.text.style.TextIndent textIndent, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle, androidx.compose.ui.text.style.LineBreak lineBreak, androidx.compose.ui.text.style.Hyphens hyphens) {
        this(textAlign != null ? textAlign.getValue() : androidx.compose.ui.text.style.TextAlign.INSTANCE.m4366getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : androidx.compose.ui.text.style.TextDirection.INSTANCE.m4379getUnspecifieds_7Xco(), j, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.getMask() : androidx.compose.ui.text.style.LineBreak.INSTANCE.m4293getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.getValue() : androidx.compose.ui.text.style.Hyphens.INSTANCE.m4272getUnspecifiedvmbZdU8(), (androidx.compose.ui.text.style.TextMotion) null, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static /* synthetic */ androidx.compose.ui.text.ParagraphStyle merge$default(androidx.compose.ui.text.ParagraphStyle paragraphStyle, androidx.compose.ui.text.ParagraphStyle paragraphStyle2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            paragraphStyle2 = null;
        }
        return paragraphStyle.merge(paragraphStyle2);
    }

    public final androidx.compose.ui.text.ParagraphStyle merge(androidx.compose.ui.text.ParagraphStyle other) {
        return other == null ? this : androidx.compose.ui.text.ParagraphStyleKt.m3882fastMergej5T8yCg(this, other.textAlign, other.textDirection, other.lineHeight, other.textIndent, other.platformStyle, other.lineHeightStyle, other.lineBreak, other.hyphens, other.textMotion);
    }

    public final androidx.compose.ui.text.ParagraphStyle plus(androidx.compose.ui.text.ParagraphStyle other) {
        return merge(other);
    }

    /* renamed from: copy-Elsmlbk$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.ParagraphStyle m3859copyElsmlbk$default(androidx.compose.ui.text.ParagraphStyle paragraphStyle, androidx.compose.ui.text.style.TextAlign textAlign, androidx.compose.ui.text.style.TextDirection textDirection, long j, androidx.compose.ui.text.style.TextIndent textIndent, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            textAlign = androidx.compose.ui.text.style.TextAlign.m4353boximpl(paragraphStyle.textAlign);
        }
        if ((i & 2) != 0) {
            textDirection = androidx.compose.ui.text.style.TextDirection.m4367boximpl(paragraphStyle.textDirection);
        }
        androidx.compose.ui.text.style.TextDirection textDirection2 = textDirection;
        if ((i & 4) != 0) {
            j = paragraphStyle.lineHeight;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        return paragraphStyle.m3868copyElsmlbk(textAlign, textDirection2, j2, textIndent);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-Elsmlbk, reason: not valid java name */
    public final /* synthetic */ androidx.compose.ui.text.ParagraphStyle m3868copyElsmlbk(androidx.compose.ui.text.style.TextAlign textAlign, androidx.compose.ui.text.style.TextDirection textDirection, long lineHeight, androidx.compose.ui.text.style.TextIndent textIndent) {
        return new androidx.compose.ui.text.ParagraphStyle(textAlign != null ? textAlign.getValue() : androidx.compose.ui.text.style.TextAlign.INSTANCE.m4366getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : androidx.compose.ui.text.style.TextDirection.INSTANCE.m4379getUnspecifieds_7Xco(), lineHeight, textIndent, this.platformStyle, this.lineHeightStyle, this.lineBreak, this.hyphens, this.textMotion, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* renamed from: copy-xPh5V4g$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.ParagraphStyle m3862copyxPh5V4g$default(androidx.compose.ui.text.ParagraphStyle paragraphStyle, androidx.compose.ui.text.style.TextAlign textAlign, androidx.compose.ui.text.style.TextDirection textDirection, long j, androidx.compose.ui.text.style.TextIndent textIndent, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            textAlign = androidx.compose.ui.text.style.TextAlign.m4353boximpl(paragraphStyle.textAlign);
        }
        if ((i & 2) != 0) {
            textDirection = androidx.compose.ui.text.style.TextDirection.m4367boximpl(paragraphStyle.textDirection);
        }
        androidx.compose.ui.text.style.TextDirection textDirection2 = textDirection;
        if ((i & 4) != 0) {
            j = paragraphStyle.lineHeight;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        androidx.compose.ui.text.style.TextIndent textIndent2 = textIndent;
        if ((i & 16) != 0) {
            platformParagraphStyle = paragraphStyle.platformStyle;
        }
        androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle2 = platformParagraphStyle;
        if ((i & 32) != 0) {
            lineHeightStyle = paragraphStyle.lineHeightStyle;
        }
        return paragraphStyle.m3871copyxPh5V4g(textAlign, textDirection2, j2, textIndent2, platformParagraphStyle2, lineHeightStyle);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-xPh5V4g, reason: not valid java name */
    public final /* synthetic */ androidx.compose.ui.text.ParagraphStyle m3871copyxPh5V4g(androidx.compose.ui.text.style.TextAlign textAlign, androidx.compose.ui.text.style.TextDirection textDirection, long lineHeight, androidx.compose.ui.text.style.TextIndent textIndent, androidx.compose.ui.text.PlatformParagraphStyle platformStyle, androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle) {
        return new androidx.compose.ui.text.ParagraphStyle(textAlign != null ? textAlign.getValue() : androidx.compose.ui.text.style.TextAlign.INSTANCE.m4366getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : androidx.compose.ui.text.style.TextDirection.INSTANCE.m4379getUnspecifieds_7Xco(), lineHeight, textIndent, platformStyle, lineHeightStyle, this.lineBreak, this.hyphens, this.textMotion, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineBreak, Hyphens, TextMotion are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-ciSxzs0, reason: not valid java name */
    public final /* synthetic */ androidx.compose.ui.text.ParagraphStyle m3870copyciSxzs0(androidx.compose.ui.text.style.TextAlign textAlign, androidx.compose.ui.text.style.TextDirection textDirection, long lineHeight, androidx.compose.ui.text.style.TextIndent textIndent, androidx.compose.ui.text.PlatformParagraphStyle platformStyle, androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle, androidx.compose.ui.text.style.LineBreak lineBreak, androidx.compose.ui.text.style.Hyphens hyphens) {
        return new androidx.compose.ui.text.ParagraphStyle(textAlign != null ? textAlign.getValue() : androidx.compose.ui.text.style.TextAlign.INSTANCE.m4366getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : androidx.compose.ui.text.style.TextDirection.INSTANCE.m4379getUnspecifieds_7Xco(), lineHeight, textIndent, platformStyle, lineHeightStyle, lineBreak != null ? lineBreak.getMask() : androidx.compose.ui.text.style.LineBreak.INSTANCE.m4293getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.getValue() : androidx.compose.ui.text.style.Hyphens.INSTANCE.m4272getUnspecifiedvmbZdU8(), this.textMotion, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    /* renamed from: copy-NH1kkwU, reason: not valid java name */
    public final /* synthetic */ androidx.compose.ui.text.ParagraphStyle m3869copyNH1kkwU(androidx.compose.ui.text.style.TextAlign textAlign, androidx.compose.ui.text.style.TextDirection textDirection, long lineHeight, androidx.compose.ui.text.style.TextIndent textIndent, androidx.compose.ui.text.PlatformParagraphStyle platformStyle, androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle, androidx.compose.ui.text.style.LineBreak lineBreak, androidx.compose.ui.text.style.Hyphens hyphens, androidx.compose.ui.text.style.TextMotion textMotion) {
        return new androidx.compose.ui.text.ParagraphStyle(textAlign != null ? textAlign.getValue() : androidx.compose.ui.text.style.TextAlign.INSTANCE.m4366getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : androidx.compose.ui.text.style.TextDirection.INSTANCE.m4379getUnspecifieds_7Xco(), lineHeight, textIndent, platformStyle, lineHeightStyle, lineBreak != null ? lineBreak.getMask() : androidx.compose.ui.text.style.LineBreak.INSTANCE.m4293getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.getValue() : androidx.compose.ui.text.style.Hyphens.INSTANCE.m4272getUnspecifiedvmbZdU8(), textMotion, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* renamed from: copy-ykzQM6k, reason: not valid java name */
    public final androidx.compose.ui.text.ParagraphStyle m3872copyykzQM6k(int textAlign, int textDirection, long lineHeight, androidx.compose.ui.text.style.TextIndent textIndent, androidx.compose.ui.text.PlatformParagraphStyle platformStyle, androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, androidx.compose.ui.text.style.TextMotion textMotion) {
        return new androidx.compose.ui.text.ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, platformStyle, lineHeightStyle, lineBreak, hyphens, textMotion, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.text.ParagraphStyle)) {
            return false;
        }
        androidx.compose.ui.text.ParagraphStyle paragraphStyle = (androidx.compose.ui.text.ParagraphStyle) other;
        return androidx.compose.ui.text.style.TextAlign.m4356equalsimpl0(this.textAlign, paragraphStyle.textAlign) && androidx.compose.ui.text.style.TextDirection.m4370equalsimpl0(this.textDirection, paragraphStyle.textDirection) && androidx.compose.ui.unit.TextUnit.m4670equalsimpl0(this.lineHeight, paragraphStyle.lineHeight) && kotlin.jvm.internal.Intrinsics.areEqual(this.textIndent, paragraphStyle.textIndent) && kotlin.jvm.internal.Intrinsics.areEqual(this.platformStyle, paragraphStyle.platformStyle) && kotlin.jvm.internal.Intrinsics.areEqual(this.lineHeightStyle, paragraphStyle.lineHeightStyle) && androidx.compose.ui.text.style.LineBreak.m4279equalsimpl0(this.lineBreak, paragraphStyle.lineBreak) && androidx.compose.ui.text.style.Hyphens.m4266equalsimpl0(this.hyphens, paragraphStyle.hyphens) && kotlin.jvm.internal.Intrinsics.areEqual(this.textMotion, paragraphStyle.textMotion);
    }

    public int hashCode() {
        int m4357hashCodeimpl = ((((androidx.compose.ui.text.style.TextAlign.m4357hashCodeimpl(this.textAlign) * 31) + androidx.compose.ui.text.style.TextDirection.m4371hashCodeimpl(this.textDirection)) * 31) + androidx.compose.ui.unit.TextUnit.m4674hashCodeimpl(this.lineHeight)) * 31;
        androidx.compose.ui.text.style.TextIndent textIndent = this.textIndent;
        int hashCode = (m4357hashCodeimpl + (textIndent != null ? textIndent.hashCode() : 0)) * 31;
        androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle = this.platformStyle;
        int hashCode2 = (hashCode + (platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0)) * 31;
        androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle = this.lineHeightStyle;
        int hashCode3 = (((((hashCode2 + (lineHeightStyle != null ? lineHeightStyle.hashCode() : 0)) * 31) + androidx.compose.ui.text.style.LineBreak.m4283hashCodeimpl(this.lineBreak)) * 31) + androidx.compose.ui.text.style.Hyphens.m4267hashCodeimpl(this.hyphens)) * 31;
        androidx.compose.ui.text.style.TextMotion textMotion = this.textMotion;
        return hashCode3 + (textMotion != null ? textMotion.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ParagraphStyle(textAlign=" + ((java.lang.Object) androidx.compose.ui.text.style.TextAlign.m4358toStringimpl(this.textAlign)) + ", textDirection=" + ((java.lang.Object) androidx.compose.ui.text.style.TextDirection.m4372toStringimpl(this.textDirection)) + ", lineHeight=" + ((java.lang.Object) androidx.compose.ui.unit.TextUnit.m4680toStringimpl(this.lineHeight)) + ", textIndent=" + this.textIndent + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + this.lineHeightStyle + ", lineBreak=" + ((java.lang.Object) androidx.compose.ui.text.style.LineBreak.m4284toStringimpl(this.lineBreak)) + ", hyphens=" + ((java.lang.Object) androidx.compose.ui.text.style.Hyphens.m4268toStringimpl(this.hyphens)) + ", textMotion=" + this.textMotion + ')';
    }
}
