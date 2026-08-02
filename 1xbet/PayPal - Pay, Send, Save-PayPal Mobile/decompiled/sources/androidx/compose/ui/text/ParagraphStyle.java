package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b'\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015Bs\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0016B7\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0014\u0010\u0017BO\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0014\u0010\u0018Bg\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ=\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJU\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b!\u0010\"Jm\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b#\u0010$Jy\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b%\u0010&Jo\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010\u001a\u001a\u0004\u0018\u00010)H\u0096\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010/R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b5\u0010/R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u00108R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010;R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010>R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\bB\u0010/R\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00103\u001a\u0004\bC\u0010/R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010D\u001a\u0004\bE\u0010FR\u001c\u0010K\u001a\u0004\u0018\u00010\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\bI\u0010J\u001a\u0004\bG\u0010HR\u001c\u0010O\u001a\u0004\u0018\u00010\u00048GX\u0087\u0004¢\u0006\f\u0012\u0004\bN\u0010J\u001a\u0004\bL\u0010MR\u001c\u0010S\u001a\u0004\u0018\u00010\u00108GX\u0087\u0004¢\u0006\f\u0012\u0004\bR\u0010J\u001a\u0004\bP\u0010QR\u001c\u0010W\u001a\u0004\u0018\u00010\u000e8GX\u0087\u0004¢\u0006\f\u0012\u0004\bV\u0010J\u001a\u0004\bT\u0010U"}, d2 = {"Landroidx/compose/ui/text/ParagraphStyle;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "Landroidx/compose/ui/text/style/TextAlign;", "textAlign", "Landroidx/compose/ui/text/style/TextDirection;", "textDirection", "Landroidx/compose/ui/unit/TextUnit;", "lineHeight", "Landroidx/compose/ui/text/style/TextIndent;", "textIndent", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "platformStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "lineHeightStyle", "Landroidx/compose/ui/text/style/LineBreak;", "lineBreak", "Landroidx/compose/ui/text/style/Hyphens;", "hyphens", "Landroidx/compose/ui/text/style/TextMotion;", "textMotion", "<init>", "(IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "merge", "(Landroidx/compose/ui/text/ParagraphStyle;)Landroidx/compose/ui/text/ParagraphStyle;", "plus", "copy-Elsmlbk", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;)Landroidx/compose/ui/text/ParagraphStyle;", "copy", "copy-xPh5V4g", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;)Landroidx/compose/ui/text/ParagraphStyle;", "copy-ciSxzs0", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;)Landroidx/compose/ui/text/ParagraphStyle;", "copy-NH1kkwU", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/ParagraphStyle;", "copy-ykzQM6k", "(IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/ParagraphStyle;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getTextAlign-e0LSkKk", "getTextDirection-s_7X-co", "J", "getLineHeight-XSAIIZE", "()J", "Landroidx/compose/ui/text/style/TextIndent;", "getTextIndent", "()Landroidx/compose/ui/text/style/TextIndent;", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "getPlatformStyle", "()Landroidx/compose/ui/text/PlatformParagraphStyle;", "Landroidx/compose/ui/text/style/LineHeightStyle;", "getLineHeightStyle", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "getLineBreak-rAG3T2k", "getHyphens-vmbZdU8", "Landroidx/compose/ui/text/style/TextMotion;", "getTextMotion", "()Landroidx/compose/ui/text/style/TextMotion;", "getTextAlign-buA522U", "()Landroidx/compose/ui/text/style/TextAlign;", "getTextAlign-buA522U$annotations", "()V", "deprecated_boxing_textAlign", "getTextDirection-mmuk1to", "()Landroidx/compose/ui/text/style/TextDirection;", "getTextDirection-mmuk1to$annotations", "deprecated_boxing_textDirection", "getHyphens-EaSxIns", "()Landroidx/compose/ui/text/style/Hyphens;", "getHyphens-EaSxIns$annotations", "deprecated_boxing_hyphens", "getLineBreak-LgCVezo", "()Landroidx/compose/ui/text/style/LineBreak;", "getLineBreak-LgCVezo$annotations", "deprecated_boxing_lineBreak"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ParagraphStyle implements androidx.compose.ui.text.AnnotatedString.Annotation {
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

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getHyphens-EaSxIns$annotations, reason: not valid java name */
    public static /* synthetic */ void m7908getHyphensEaSxIns$annotations() {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getLineBreak-LgCVezo$annotations, reason: not valid java name */
    public static /* synthetic */ void m7909getLineBreakLgCVezo$annotations() {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getTextAlign-buA522U$annotations, reason: not valid java name */
    public static /* synthetic */ void m7910getTextAlignbuA522U$annotations() {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getTextDirection-mmuk1to$annotations, reason: not valid java name */
    public static /* synthetic */ void m7911getTextDirectionmmuk1to$annotations() {
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
        if (androidx.compose.ui.unit.TextUnit.m8792equalsimpl0(j, androidx.compose.ui.unit.TextUnit.INSTANCE.m8806getUnspecifiedXSAIIZE()) || androidx.compose.ui.unit.TextUnit.m8795getValueimpl(j) >= 0.0f) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("lineHeight can't be negative (");
        sb.append(androidx.compose.ui.unit.TextUnit.m8795getValueimpl(j));
        sb.append(')');
        androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalStateException(sb.toString());
    }

    public /* synthetic */ ParagraphStyle(int i, int i2, long j, androidx.compose.ui.text.style.TextIndent textIndent, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle, int i3, int i4, androidx.compose.ui.text.style.TextMotion textMotion, int i5, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? androidx.compose.ui.text.style.TextAlign.INSTANCE.m8449getUnspecifiede0LSkKk() : i, (i5 & 2) != 0 ? androidx.compose.ui.text.style.TextDirection.INSTANCE.m8465getUnspecifieds_7Xco() : i2, (i5 & 4) != 0 ? androidx.compose.ui.unit.TextUnit.INSTANCE.m8806getUnspecifiedXSAIIZE() : j, (i5 & 8) != 0 ? null : textIndent, (i5 & 16) != 0 ? null : platformParagraphStyle, (i5 & 32) != 0 ? null : lineHeightStyle, (i5 & 64) != 0 ? androidx.compose.ui.text.style.LineBreak.INSTANCE.m8361getUnspecifiedrAG3T2k() : i3, (i5 & 128) != 0 ? androidx.compose.ui.text.style.Hyphens.INSTANCE.m8337getUnspecifiedvmbZdU8() : i4, (i5 & 256) == 0 ? textMotion : null, (kotlin.jvm.internal.DefaultConstructorMarker) null);
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
    public final androidx.compose.ui.text.style.TextAlign m7922getTextAlignbuA522U() {
        return androidx.compose.ui.text.style.TextAlign.m8436boximpl(this.textAlign);
    }

    /* renamed from: getTextDirection-mmuk1to, reason: not valid java name */
    public final androidx.compose.ui.text.style.TextDirection m7924getTextDirectionmmuk1to() {
        return androidx.compose.ui.text.style.TextDirection.m8453boximpl(this.textDirection);
    }

    /* renamed from: getHyphens-EaSxIns, reason: not valid java name */
    public final androidx.compose.ui.text.style.Hyphens m7917getHyphensEaSxIns() {
        return androidx.compose.ui.text.style.Hyphens.m8328boximpl(this.hyphens);
    }

    /* renamed from: getLineBreak-LgCVezo, reason: not valid java name */
    public final androidx.compose.ui.text.style.LineBreak m7919getLineBreakLgCVezo() {
        return androidx.compose.ui.text.style.LineBreak.m8341boximpl(this.lineBreak);
    }

    public /* synthetic */ ParagraphStyle(androidx.compose.ui.text.style.TextAlign textAlign, androidx.compose.ui.text.style.TextDirection textDirection, long j, androidx.compose.ui.text.style.TextIndent textIndent, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle, androidx.compose.ui.text.style.LineBreak lineBreak, androidx.compose.ui.text.style.Hyphens hyphens, androidx.compose.ui.text.style.TextMotion textMotion, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : textAlign, (i & 2) != 0 ? null : textDirection, (i & 4) != 0 ? androidx.compose.ui.unit.TextUnit.INSTANCE.m8806getUnspecifiedXSAIIZE() : j, (i & 8) != 0 ? null : textIndent, (i & 16) != 0 ? null : platformParagraphStyle, (i & 32) != 0 ? null : lineHeightStyle, (i & 64) != 0 ? null : lineBreak, (i & 128) != 0 ? null : hyphens, (i & 256) == 0 ? textMotion : null, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    private ParagraphStyle(androidx.compose.ui.text.style.TextAlign textAlign, androidx.compose.ui.text.style.TextDirection textDirection, long j, androidx.compose.ui.text.style.TextIndent textIndent, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle, androidx.compose.ui.text.style.LineBreak lineBreak, androidx.compose.ui.text.style.Hyphens hyphens, androidx.compose.ui.text.style.TextMotion textMotion) {
        this(textAlign != null ? textAlign.m8442unboximpl() : androidx.compose.ui.text.style.TextAlign.INSTANCE.m8449getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m8459unboximpl() : androidx.compose.ui.text.style.TextDirection.INSTANCE.m8465getUnspecifieds_7Xco(), j, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.getGetHighResolutionOutputSizeshNQ4ISI() : androidx.compose.ui.text.style.LineBreak.INSTANCE.m8361getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m8334unboximpl() : androidx.compose.ui.text.style.Hyphens.INSTANCE.m8337getUnspecifiedvmbZdU8(), textMotion, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public /* synthetic */ ParagraphStyle(androidx.compose.ui.text.style.TextAlign textAlign, androidx.compose.ui.text.style.TextDirection textDirection, long j, androidx.compose.ui.text.style.TextIndent textIndent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : textAlign, (i & 2) != 0 ? null : textDirection, (i & 4) != 0 ? androidx.compose.ui.unit.TextUnit.INSTANCE.m8806getUnspecifiedXSAIIZE() : j, (i & 8) != 0 ? null : textIndent, null);
    }

    private ParagraphStyle(androidx.compose.ui.text.style.TextAlign textAlign, androidx.compose.ui.text.style.TextDirection textDirection, long j, androidx.compose.ui.text.style.TextIndent textIndent) {
        this(textAlign != null ? textAlign.m8442unboximpl() : androidx.compose.ui.text.style.TextAlign.INSTANCE.m8449getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m8459unboximpl() : androidx.compose.ui.text.style.TextDirection.INSTANCE.m8465getUnspecifieds_7Xco(), j, textIndent, (androidx.compose.ui.text.PlatformParagraphStyle) null, (androidx.compose.ui.text.style.LineHeightStyle) null, androidx.compose.ui.text.style.LineBreak.INSTANCE.m8361getUnspecifiedrAG3T2k(), androidx.compose.ui.text.style.Hyphens.INSTANCE.m8337getUnspecifiedvmbZdU8(), (androidx.compose.ui.text.style.TextMotion) null, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public /* synthetic */ ParagraphStyle(androidx.compose.ui.text.style.TextAlign textAlign, androidx.compose.ui.text.style.TextDirection textDirection, long j, androidx.compose.ui.text.style.TextIndent textIndent, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : textAlign, (i & 2) != 0 ? null : textDirection, (i & 4) != 0 ? androidx.compose.ui.unit.TextUnit.INSTANCE.m8806getUnspecifiedXSAIIZE() : j, (i & 8) != 0 ? null : textIndent, (i & 16) != 0 ? null : platformParagraphStyle, (i & 32) == 0 ? lineHeightStyle : null, null);
    }

    private ParagraphStyle(androidx.compose.ui.text.style.TextAlign textAlign, androidx.compose.ui.text.style.TextDirection textDirection, long j, androidx.compose.ui.text.style.TextIndent textIndent, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle) {
        this(textAlign != null ? textAlign.m8442unboximpl() : androidx.compose.ui.text.style.TextAlign.INSTANCE.m8449getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m8459unboximpl() : androidx.compose.ui.text.style.TextDirection.INSTANCE.m8465getUnspecifieds_7Xco(), j, textIndent, platformParagraphStyle, lineHeightStyle, androidx.compose.ui.text.style.LineBreak.INSTANCE.m8361getUnspecifiedrAG3T2k(), androidx.compose.ui.text.style.Hyphens.INSTANCE.m8337getUnspecifiedvmbZdU8(), (androidx.compose.ui.text.style.TextMotion) null, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public /* synthetic */ ParagraphStyle(androidx.compose.ui.text.style.TextAlign textAlign, androidx.compose.ui.text.style.TextDirection textDirection, long j, androidx.compose.ui.text.style.TextIndent textIndent, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle, androidx.compose.ui.text.style.LineBreak lineBreak, androidx.compose.ui.text.style.Hyphens hyphens, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : textAlign, (i & 2) != 0 ? null : textDirection, (i & 4) != 0 ? androidx.compose.ui.unit.TextUnit.INSTANCE.m8806getUnspecifiedXSAIIZE() : j, (i & 8) != 0 ? null : textIndent, (i & 16) != 0 ? null : platformParagraphStyle, (i & 32) != 0 ? null : lineHeightStyle, (i & 64) != 0 ? null : lineBreak, (i & 128) == 0 ? hyphens : null, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    private ParagraphStyle(androidx.compose.ui.text.style.TextAlign textAlign, androidx.compose.ui.text.style.TextDirection textDirection, long j, androidx.compose.ui.text.style.TextIndent textIndent, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle, androidx.compose.ui.text.style.LineBreak lineBreak, androidx.compose.ui.text.style.Hyphens hyphens) {
        this(textAlign != null ? textAlign.m8442unboximpl() : androidx.compose.ui.text.style.TextAlign.INSTANCE.m8449getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m8459unboximpl() : androidx.compose.ui.text.style.TextDirection.INSTANCE.m8465getUnspecifieds_7Xco(), j, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.getGetHighResolutionOutputSizeshNQ4ISI() : androidx.compose.ui.text.style.LineBreak.INSTANCE.m8361getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m8334unboximpl() : androidx.compose.ui.text.style.Hyphens.INSTANCE.m8337getUnspecifiedvmbZdU8(), (androidx.compose.ui.text.style.TextMotion) null, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static /* synthetic */ androidx.compose.ui.text.ParagraphStyle merge$default(androidx.compose.ui.text.ParagraphStyle paragraphStyle, androidx.compose.ui.text.ParagraphStyle paragraphStyle2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            paragraphStyle2 = null;
        }
        return paragraphStyle.merge(paragraphStyle2);
    }

    public final androidx.compose.ui.text.ParagraphStyle merge(androidx.compose.ui.text.ParagraphStyle other) {
        return other == null ? this : androidx.compose.ui.text.ParagraphStyleKt.m7926fastMergej5T8yCg(this, other.textAlign, other.textDirection, other.lineHeight, other.textIndent, other.platformStyle, other.lineHeightStyle, other.lineBreak, other.hyphens, other.textMotion);
    }

    public final androidx.compose.ui.text.ParagraphStyle plus(androidx.compose.ui.text.ParagraphStyle other) {
        return merge(other);
    }

    /* renamed from: copy-Elsmlbk$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.ParagraphStyle m7903copyElsmlbk$default(androidx.compose.ui.text.ParagraphStyle paragraphStyle, androidx.compose.ui.text.style.TextAlign textAlign, androidx.compose.ui.text.style.TextDirection textDirection, long j, androidx.compose.ui.text.style.TextIndent textIndent, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            textAlign = androidx.compose.ui.text.style.TextAlign.m8436boximpl(paragraphStyle.textAlign);
        }
        if ((i & 2) != 0) {
            textDirection = androidx.compose.ui.text.style.TextDirection.m8453boximpl(paragraphStyle.textDirection);
        }
        androidx.compose.ui.text.style.TextDirection textDirection2 = textDirection;
        if ((i & 4) != 0) {
            j = paragraphStyle.lineHeight;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        return paragraphStyle.m7912copyElsmlbk(textAlign, textDirection2, j2, textIndent);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-Elsmlbk, reason: not valid java name */
    public final /* synthetic */ androidx.compose.ui.text.ParagraphStyle m7912copyElsmlbk(androidx.compose.ui.text.style.TextAlign textAlign, androidx.compose.ui.text.style.TextDirection textDirection, long lineHeight, androidx.compose.ui.text.style.TextIndent textIndent) {
        return new androidx.compose.ui.text.ParagraphStyle(textAlign != null ? textAlign.m8442unboximpl() : androidx.compose.ui.text.style.TextAlign.INSTANCE.m8449getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m8459unboximpl() : androidx.compose.ui.text.style.TextDirection.INSTANCE.m8465getUnspecifieds_7Xco(), lineHeight, textIndent, this.platformStyle, this.lineHeightStyle, this.lineBreak, this.hyphens, this.textMotion, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* renamed from: copy-xPh5V4g$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.ParagraphStyle m7906copyxPh5V4g$default(androidx.compose.ui.text.ParagraphStyle paragraphStyle, androidx.compose.ui.text.style.TextAlign textAlign, androidx.compose.ui.text.style.TextDirection textDirection, long j, androidx.compose.ui.text.style.TextIndent textIndent, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            textAlign = androidx.compose.ui.text.style.TextAlign.m8436boximpl(paragraphStyle.textAlign);
        }
        if ((i & 2) != 0) {
            textDirection = androidx.compose.ui.text.style.TextDirection.m8453boximpl(paragraphStyle.textDirection);
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
        return paragraphStyle.m7915copyxPh5V4g(textAlign, textDirection2, j2, textIndent2, platformParagraphStyle2, lineHeightStyle);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-xPh5V4g, reason: not valid java name */
    public final /* synthetic */ androidx.compose.ui.text.ParagraphStyle m7915copyxPh5V4g(androidx.compose.ui.text.style.TextAlign textAlign, androidx.compose.ui.text.style.TextDirection textDirection, long lineHeight, androidx.compose.ui.text.style.TextIndent textIndent, androidx.compose.ui.text.PlatformParagraphStyle platformStyle, androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle) {
        return new androidx.compose.ui.text.ParagraphStyle(textAlign != null ? textAlign.m8442unboximpl() : androidx.compose.ui.text.style.TextAlign.INSTANCE.m8449getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m8459unboximpl() : androidx.compose.ui.text.style.TextDirection.INSTANCE.m8465getUnspecifieds_7Xco(), lineHeight, textIndent, platformStyle, lineHeightStyle, this.lineBreak, this.hyphens, this.textMotion, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineBreak, Hyphens, TextMotion are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-ciSxzs0, reason: not valid java name */
    public final /* synthetic */ androidx.compose.ui.text.ParagraphStyle m7914copyciSxzs0(androidx.compose.ui.text.style.TextAlign textAlign, androidx.compose.ui.text.style.TextDirection textDirection, long lineHeight, androidx.compose.ui.text.style.TextIndent textIndent, androidx.compose.ui.text.PlatformParagraphStyle platformStyle, androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle, androidx.compose.ui.text.style.LineBreak lineBreak, androidx.compose.ui.text.style.Hyphens hyphens) {
        return new androidx.compose.ui.text.ParagraphStyle(textAlign != null ? textAlign.m8442unboximpl() : androidx.compose.ui.text.style.TextAlign.INSTANCE.m8449getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m8459unboximpl() : androidx.compose.ui.text.style.TextDirection.INSTANCE.m8465getUnspecifieds_7Xco(), lineHeight, textIndent, platformStyle, lineHeightStyle, lineBreak != null ? lineBreak.getGetHighResolutionOutputSizeshNQ4ISI() : androidx.compose.ui.text.style.LineBreak.INSTANCE.m8361getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m8334unboximpl() : androidx.compose.ui.text.style.Hyphens.INSTANCE.m8337getUnspecifiedvmbZdU8(), this.textMotion, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    /* renamed from: copy-NH1kkwU, reason: not valid java name */
    public final /* synthetic */ androidx.compose.ui.text.ParagraphStyle m7913copyNH1kkwU(androidx.compose.ui.text.style.TextAlign textAlign, androidx.compose.ui.text.style.TextDirection textDirection, long lineHeight, androidx.compose.ui.text.style.TextIndent textIndent, androidx.compose.ui.text.PlatformParagraphStyle platformStyle, androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle, androidx.compose.ui.text.style.LineBreak lineBreak, androidx.compose.ui.text.style.Hyphens hyphens, androidx.compose.ui.text.style.TextMotion textMotion) {
        return new androidx.compose.ui.text.ParagraphStyle(textAlign != null ? textAlign.m8442unboximpl() : androidx.compose.ui.text.style.TextAlign.INSTANCE.m8449getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m8459unboximpl() : androidx.compose.ui.text.style.TextDirection.INSTANCE.m8465getUnspecifieds_7Xco(), lineHeight, textIndent, platformStyle, lineHeightStyle, lineBreak != null ? lineBreak.getGetHighResolutionOutputSizeshNQ4ISI() : androidx.compose.ui.text.style.LineBreak.INSTANCE.m8361getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m8334unboximpl() : androidx.compose.ui.text.style.Hyphens.INSTANCE.m8337getUnspecifiedvmbZdU8(), textMotion, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* renamed from: copy-ykzQM6k, reason: not valid java name */
    public final androidx.compose.ui.text.ParagraphStyle m7916copyykzQM6k(int textAlign, int textDirection, long lineHeight, androidx.compose.ui.text.style.TextIndent textIndent, androidx.compose.ui.text.PlatformParagraphStyle platformStyle, androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, androidx.compose.ui.text.style.TextMotion textMotion) {
        return new androidx.compose.ui.text.ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, platformStyle, lineHeightStyle, lineBreak, hyphens, textMotion, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.text.ParagraphStyle)) {
            return false;
        }
        androidx.compose.ui.text.ParagraphStyle paragraphStyle = (androidx.compose.ui.text.ParagraphStyle) other;
        return androidx.compose.ui.text.style.TextAlign.m8439equalsimpl0(this.textAlign, paragraphStyle.textAlign) && androidx.compose.ui.text.style.TextDirection.m8456equalsimpl0(this.textDirection, paragraphStyle.textDirection) && androidx.compose.ui.unit.TextUnit.m8792equalsimpl0(this.lineHeight, paragraphStyle.lineHeight) && kotlin.jvm.internal.Intrinsics.areEqual(this.textIndent, paragraphStyle.textIndent) && kotlin.jvm.internal.Intrinsics.areEqual(this.platformStyle, paragraphStyle.platformStyle) && kotlin.jvm.internal.Intrinsics.areEqual(this.lineHeightStyle, paragraphStyle.lineHeightStyle) && androidx.compose.ui.text.style.LineBreak.m8347equalsimpl0(this.lineBreak, paragraphStyle.lineBreak) && androidx.compose.ui.text.style.Hyphens.m8331equalsimpl0(this.hyphens, paragraphStyle.hyphens) && kotlin.jvm.internal.Intrinsics.areEqual(this.textMotion, paragraphStyle.textMotion);
    }

    public final int hashCode() {
        int m8440hashCodeimpl = androidx.compose.ui.text.style.TextAlign.m8440hashCodeimpl(this.textAlign);
        int m8457hashCodeimpl = androidx.compose.ui.text.style.TextDirection.m8457hashCodeimpl(this.textDirection);
        int m8796hashCodeimpl = androidx.compose.ui.unit.TextUnit.m8796hashCodeimpl(this.lineHeight);
        androidx.compose.ui.text.style.TextIndent textIndent = this.textIndent;
        int hashCode = textIndent != null ? textIndent.hashCode() : 0;
        androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle = this.platformStyle;
        int hashCode2 = platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0;
        androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle = this.lineHeightStyle;
        int hashCode3 = lineHeightStyle != null ? lineHeightStyle.hashCode() : 0;
        int m8351hashCodeimpl = androidx.compose.ui.text.style.LineBreak.m8351hashCodeimpl(this.lineBreak);
        int m8332hashCodeimpl = androidx.compose.ui.text.style.Hyphens.m8332hashCodeimpl(this.hyphens);
        androidx.compose.ui.text.style.TextMotion textMotion = this.textMotion;
        return (((((((((((((((m8440hashCodeimpl * 31) + m8457hashCodeimpl) * 31) + m8796hashCodeimpl) * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + m8351hashCodeimpl) * 31) + m8332hashCodeimpl) * 31) + (textMotion != null ? textMotion.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ParagraphStyle(textAlign=");
        sb.append((java.lang.Object) androidx.compose.ui.text.style.TextAlign.m8441toStringimpl(this.textAlign));
        sb.append(", textDirection=");
        sb.append((java.lang.Object) androidx.compose.ui.text.style.TextDirection.m8458toStringimpl(this.textDirection));
        sb.append(", lineHeight=");
        sb.append((java.lang.Object) androidx.compose.ui.unit.TextUnit.m8802toStringimpl(this.lineHeight));
        sb.append(", textIndent=");
        sb.append(this.textIndent);
        sb.append(", platformStyle=");
        sb.append(this.platformStyle);
        sb.append(", lineHeightStyle=");
        sb.append(this.lineHeightStyle);
        sb.append(", lineBreak=");
        sb.append((java.lang.Object) androidx.compose.ui.text.style.LineBreak.m8352toStringimpl(this.lineBreak));
        sb.append(", hyphens=");
        sb.append((java.lang.Object) androidx.compose.ui.text.style.Hyphens.m8333toStringimpl(this.hyphens));
        sb.append(", textMotion=");
        sb.append(this.textMotion);
        sb.append(')');
        return sb.toString();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructor.")
    public /* synthetic */ ParagraphStyle(androidx.compose.ui.text.style.TextAlign textAlign, androidx.compose.ui.text.style.TextDirection textDirection, long j, androidx.compose.ui.text.style.TextIndent textIndent, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j, textIndent);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructors.")
    public /* synthetic */ ParagraphStyle(androidx.compose.ui.text.style.TextAlign textAlign, androidx.compose.ui.text.style.TextDirection textDirection, long j, androidx.compose.ui.text.style.TextIndent textIndent, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j, textIndent, platformParagraphStyle, lineHeightStyle);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineBreak, Hyphens, TextMotion are deprecated. Please use the new stable constructors.")
    public /* synthetic */ ParagraphStyle(androidx.compose.ui.text.style.TextAlign textAlign, androidx.compose.ui.text.style.TextDirection textDirection, long j, androidx.compose.ui.text.style.TextIndent textIndent, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle, androidx.compose.ui.text.style.LineBreak lineBreak, androidx.compose.ui.text.style.Hyphens hyphens, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public /* synthetic */ ParagraphStyle(androidx.compose.ui.text.style.TextAlign textAlign, androidx.compose.ui.text.style.TextDirection textDirection, long j, androidx.compose.ui.text.style.TextIndent textIndent, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle, androidx.compose.ui.text.style.LineBreak lineBreak, androidx.compose.ui.text.style.Hyphens hyphens, androidx.compose.ui.text.style.TextMotion textMotion, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    public /* synthetic */ ParagraphStyle(int i, int i2, long j, androidx.compose.ui.text.style.TextIndent textIndent, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle, int i3, int i4, androidx.compose.ui.text.style.TextMotion textMotion, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, j, textIndent, platformParagraphStyle, lineHeightStyle, i3, i4, textMotion);
    }
}
