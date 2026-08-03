package androidx.compose.ui.text.platform;

/* compiled from: AndroidParagraphIntrinsics.android.kt */
@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010%R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010)R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0014\u00101\u001a\u000202X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0014\u00105\u001a\u000206X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108¨\u00069"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "text", "", "style", "Landroidx/compose/ui/text/TextStyle;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "density", "Landroidx/compose/ui/unit/Density;", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;)V", "charSequence", "", "getCharSequence$ui_text_release", "()Ljava/lang/CharSequence;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "emojiCompatProcessed", "", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "hasStaleResolvedFonts", "getHasStaleResolvedFonts", "()Z", "layoutIntrinsics", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "getLayoutIntrinsics$ui_text_release", "()Landroidx/compose/ui/text/android/LayoutIntrinsics;", "maxIntrinsicWidth", "", "getMaxIntrinsicWidth", "()F", "minIntrinsicWidth", "getMinIntrinsicWidth", "getPlaceholders", "()Ljava/util/List;", "resolvedTypefaces", "Landroidx/compose/ui/text/platform/TypefaceDirtyTrackerLinkedList;", "getSpanStyles", "getStyle", "()Landroidx/compose/ui/text/TextStyle;", "getText", "()Ljava/lang/String;", "textDirectionHeuristic", "", "getTextDirectionHeuristic$ui_text_release", "()I", "textPaint", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "getTextPaint$ui_text_release", "()Landroidx/compose/ui/text/platform/AndroidTextPaint;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidParagraphIntrinsics implements androidx.compose.ui.text.ParagraphIntrinsics {
    public static final int $stable = 8;
    private final java.lang.CharSequence charSequence;
    private final androidx.compose.ui.unit.Density density;
    private final boolean emojiCompatProcessed;
    private final androidx.compose.ui.text.font.FontFamily.Resolver fontFamilyResolver;
    private final androidx.compose.ui.text.android.LayoutIntrinsics layoutIntrinsics;
    private final java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> placeholders;
    private androidx.compose.ui.text.platform.TypefaceDirtyTrackerLinkedList resolvedTypefaces;
    private final java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>> spanStyles;
    private final androidx.compose.ui.text.TextStyle style;
    private final java.lang.String text;
    private final int textDirectionHeuristic;
    private final androidx.compose.ui.text.platform.AndroidTextPaint textPaint;

    public AndroidParagraphIntrinsics(java.lang.String str, androidx.compose.ui.text.TextStyle textStyle, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>> list, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> list2, androidx.compose.ui.text.font.FontFamily.Resolver resolver, androidx.compose.ui.unit.Density density) {
        boolean hasEmojiCompat;
        androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle> range;
        this.text = str;
        this.style = textStyle;
        this.spanStyles = list;
        this.placeholders = list2;
        this.fontFamilyResolver = resolver;
        this.density = density;
        androidx.compose.ui.text.platform.AndroidTextPaint androidTextPaint = new androidx.compose.ui.text.platform.AndroidTextPaint(1, density.getDensity());
        this.textPaint = androidTextPaint;
        hasEmojiCompat = androidx.compose.ui.text.platform.AndroidParagraphIntrinsics_androidKt.getHasEmojiCompat(textStyle);
        this.emojiCompatProcessed = !hasEmojiCompat ? false : androidx.compose.ui.text.platform.EmojiCompatStatus.INSTANCE.getFontLoaded().getValue().booleanValue();
        this.textDirectionHeuristic = androidx.compose.ui.text.platform.AndroidParagraphIntrinsics_androidKt.m4216resolveTextDirectionHeuristicsHklW4sA(textStyle.m4007getTextDirections_7Xco(), textStyle.getLocaleList());
        kotlin.jvm.functions.Function4<androidx.compose.ui.text.font.FontFamily, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, android.graphics.Typeface> function4 = new kotlin.jvm.functions.Function4<androidx.compose.ui.text.font.FontFamily, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, android.graphics.Typeface>() { // from class: androidx.compose.ui.text.platform.AndroidParagraphIntrinsics$resolveTypeface$1
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ android.graphics.Typeface invoke(androidx.compose.ui.text.font.FontFamily fontFamily, androidx.compose.ui.text.font.FontWeight fontWeight, androidx.compose.ui.text.font.FontStyle fontStyle, androidx.compose.ui.text.font.FontSynthesis fontSynthesis) {
                return m4215invokeDPcqOEQ(fontFamily, fontWeight, fontStyle.m4079unboximpl(), fontSynthesis.getValue());
            }

            /* renamed from: invoke-DPcqOEQ, reason: not valid java name */
            public final android.graphics.Typeface m4215invokeDPcqOEQ(androidx.compose.ui.text.font.FontFamily fontFamily, androidx.compose.ui.text.font.FontWeight fontWeight, int i, int i2) {
                androidx.compose.ui.text.platform.TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList;
                androidx.compose.runtime.State<java.lang.Object> mo4050resolveDPcqOEQ = androidx.compose.ui.text.platform.AndroidParagraphIntrinsics.this.getFontFamilyResolver().mo4050resolveDPcqOEQ(fontFamily, fontWeight, i, i2);
                if (!(mo4050resolveDPcqOEQ instanceof androidx.compose.ui.text.font.TypefaceResult.Immutable)) {
                    typefaceDirtyTrackerLinkedList = androidx.compose.ui.text.platform.AndroidParagraphIntrinsics.this.resolvedTypefaces;
                    androidx.compose.ui.text.platform.TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList2 = new androidx.compose.ui.text.platform.TypefaceDirtyTrackerLinkedList(mo4050resolveDPcqOEQ, typefaceDirtyTrackerLinkedList);
                    androidx.compose.ui.text.platform.AndroidParagraphIntrinsics.this.resolvedTypefaces = typefaceDirtyTrackerLinkedList2;
                    return typefaceDirtyTrackerLinkedList2.getTypeface();
                }
                java.lang.Object value = mo4050resolveDPcqOEQ.getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNull(value, "null cannot be cast to non-null type android.graphics.Typeface");
                return (android.graphics.Typeface) value;
            }
        };
        androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt.setTextMotion(androidTextPaint, textStyle.getTextMotion());
        androidx.compose.ui.text.SpanStyle applySpanStyle = androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt.applySpanStyle(androidTextPaint, textStyle.toSpanStyle(), function4, density, !list.isEmpty());
        if (applySpanStyle != null) {
            int size = list.size() + 1;
            java.util.ArrayList arrayList = new java.util.ArrayList(size);
            for (int i = 0; i < size; i++) {
                if (i == 0) {
                    range = new androidx.compose.ui.text.AnnotatedString.Range<>(applySpanStyle, 0, this.text.length());
                } else {
                    range = this.spanStyles.get(i - 1);
                }
                arrayList.add(range);
            }
            list = arrayList;
        }
        java.lang.CharSequence createCharSequence = androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt.createCharSequence(this.text, this.textPaint.getTextSize(), this.style, list, this.placeholders, this.density, function4, this.emojiCompatProcessed);
        this.charSequence = createCharSequence;
        this.layoutIntrinsics = new androidx.compose.ui.text.android.LayoutIntrinsics(createCharSequence, this.textPaint, this.textDirectionHeuristic);
    }

    public final java.lang.String getText() {
        return this.text;
    }

    public final androidx.compose.ui.text.TextStyle getStyle() {
        return this.style;
    }

    public final java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>> getSpanStyles() {
        return this.spanStyles;
    }

    public final java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    public final androidx.compose.ui.text.font.FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    public final androidx.compose.ui.unit.Density getDensity() {
        return this.density;
    }

    /* renamed from: getTextPaint$ui_text_release, reason: from getter */
    public final androidx.compose.ui.text.platform.AndroidTextPaint getTextPaint() {
        return this.textPaint;
    }

    /* renamed from: getCharSequence$ui_text_release, reason: from getter */
    public final java.lang.CharSequence getCharSequence() {
        return this.charSequence;
    }

    /* renamed from: getLayoutIntrinsics$ui_text_release, reason: from getter */
    public final androidx.compose.ui.text.android.LayoutIntrinsics getLayoutIntrinsics() {
        return this.layoutIntrinsics;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMaxIntrinsicWidth() {
        return this.layoutIntrinsics.getMaxIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMinIntrinsicWidth() {
        return this.layoutIntrinsics.getMinIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public boolean getHasStaleResolvedFonts() {
        boolean hasEmojiCompat;
        androidx.compose.ui.text.platform.TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList = this.resolvedTypefaces;
        if (typefaceDirtyTrackerLinkedList == null || !typefaceDirtyTrackerLinkedList.isStaleResolvedFont()) {
            if (!this.emojiCompatProcessed) {
                hasEmojiCompat = androidx.compose.ui.text.platform.AndroidParagraphIntrinsics_androidKt.getHasEmojiCompat(this.style);
                if (!hasEmojiCompat || !androidx.compose.ui.text.platform.EmojiCompatStatus.INSTANCE.getFontLoaded().getValue().booleanValue()) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: getTextDirectionHeuristic$ui_text_release, reason: from getter */
    public final int getTextDirectionHeuristic() {
        return this.textDirectionHeuristic;
    }
}
