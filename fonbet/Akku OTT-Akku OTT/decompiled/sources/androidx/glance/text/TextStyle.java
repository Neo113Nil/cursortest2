package androidx.glance.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.TextUnit;
import androidx.glance.unit.ColorProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001BZ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fø\u0001\u0000¢\u0006\u0002\u0010\u0010Jc\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020'H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\rø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/glance/text/TextStyle;", "", "color", "Landroidx/glance/unit/ColorProvider;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "fontWeight", "Landroidx/glance/text/FontWeight;", "fontStyle", "Landroidx/glance/text/FontStyle;", "textAlign", "Landroidx/glance/text/TextAlign;", "textDecoration", "Landroidx/glance/text/TextDecoration;", "fontFamily", "Landroidx/glance/text/FontFamily;", "(Landroidx/glance/unit/ColorProvider;Landroidx/compose/ui/unit/TextUnit;Landroidx/glance/text/FontWeight;Landroidx/glance/text/FontStyle;Landroidx/glance/text/TextAlign;Landroidx/glance/text/TextDecoration;Landroidx/glance/text/FontFamily;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getColor", "()Landroidx/glance/unit/ColorProvider;", "getFontFamily", "()Landroidx/glance/text/FontFamily;", "getFontSize-U3a4LBI", "()Landroidx/compose/ui/unit/TextUnit;", "getFontStyle-xuO1esU", "()Landroidx/glance/text/FontStyle;", "getFontWeight-pJbD0qI", "()Landroidx/glance/text/FontWeight;", "getTextAlign-B6tg0O8", "()Landroidx/glance/text/TextAlign;", "getTextDecoration-W4vNVHs", "()Landroidx/glance/text/TextDecoration;", "copy", "copy-KmPxOYk", "equals", "", "other", "hashCode", "", "toString", "", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextStyle {
    public static final int $stable = 0;
    private final ColorProvider color;
    private final FontFamily fontFamily;
    private final TextUnit fontSize;
    private final FontStyle fontStyle;
    private final FontWeight fontWeight;
    private final TextAlign textAlign;
    private final TextDecoration textDecoration;

    public /* synthetic */ TextStyle(ColorProvider colorProvider, TextUnit textUnit, FontWeight fontWeight, FontStyle fontStyle, TextAlign textAlign, TextDecoration textDecoration, FontFamily fontFamily, DefaultConstructorMarker defaultConstructorMarker) {
        this(colorProvider, textUnit, fontWeight, fontStyle, textAlign, textDecoration, fontFamily);
    }

    /* renamed from: copy-KmPxOYk$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m1498copyKmPxOYk$default(TextStyle textStyle, ColorProvider colorProvider, TextUnit textUnit, FontWeight fontWeight, FontStyle fontStyle, TextAlign textAlign, TextDecoration textDecoration, FontFamily fontFamily, int i, Object obj) {
        if ((i & 1) != 0) {
            colorProvider = textStyle.color;
        }
        if ((i & 2) != 0) {
            textUnit = textStyle.fontSize;
        }
        if ((i & 4) != 0) {
            fontWeight = textStyle.fontWeight;
        }
        if ((i & 8) != 0) {
            fontStyle = textStyle.fontStyle;
        }
        if ((i & 16) != 0) {
            textAlign = textStyle.textAlign;
        }
        if ((i & 32) != 0) {
            textDecoration = textStyle.textDecoration;
        }
        if ((i & 64) != 0) {
            fontFamily = textStyle.fontFamily;
        }
        TextDecoration textDecoration2 = textDecoration;
        FontFamily fontFamily2 = fontFamily;
        TextAlign textAlign2 = textAlign;
        FontWeight fontWeight2 = fontWeight;
        return textStyle.m1499copyKmPxOYk(colorProvider, textUnit, fontWeight2, fontStyle, textAlign2, textDecoration2, fontFamily2);
    }

    /* renamed from: copy-KmPxOYk, reason: not valid java name */
    public final TextStyle m1499copyKmPxOYk(ColorProvider color, TextUnit fontSize, FontWeight fontWeight, FontStyle fontStyle, TextAlign textAlign, TextDecoration textDecoration, FontFamily fontFamily) {
        return new TextStyle(color, fontSize, fontWeight, fontStyle, textAlign, textDecoration, fontFamily, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextStyle)) {
            return false;
        }
        TextStyle textStyle = (TextStyle) other;
        return Intrinsics.areEqual(this.color, textStyle.color) && Intrinsics.areEqual(this.fontSize, textStyle.fontSize) && Intrinsics.areEqual(this.fontWeight, textStyle.fontWeight) && Intrinsics.areEqual(this.fontStyle, textStyle.fontStyle) && Intrinsics.areEqual(this.textDecoration, textStyle.textDecoration) && Intrinsics.areEqual(this.textAlign, textStyle.textAlign) && Intrinsics.areEqual(this.fontFamily, textStyle.fontFamily);
    }

    public final ColorProvider getColor() {
        return this.color;
    }

    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    /* renamed from: getFontSize-U3a4LBI, reason: not valid java name and from getter */
    public final TextUnit getFontSize() {
        return this.fontSize;
    }

    /* renamed from: getFontStyle-xuO1esU, reason: not valid java name and from getter */
    public final FontStyle getFontStyle() {
        return this.fontStyle;
    }

    /* renamed from: getFontWeight-pJbD0qI, reason: not valid java name and from getter */
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* renamed from: getTextAlign-B6tg0O8, reason: not valid java name and from getter */
    public final TextAlign getTextAlign() {
        return this.textAlign;
    }

    /* renamed from: getTextDecoration-W4vNVHs, reason: not valid java name and from getter */
    public final TextDecoration getTextDecoration() {
        return this.textDecoration;
    }

    public int hashCode() {
        int hashCode = this.color.hashCode() * 31;
        TextUnit textUnit = this.fontSize;
        int hashCode2 = (hashCode + (textUnit != null ? textUnit.hashCode() : 0)) * 31;
        FontWeight fontWeight = this.fontWeight;
        int hashCode3 = (hashCode2 + (fontWeight != null ? fontWeight.hashCode() : 0)) * 31;
        FontStyle fontStyle = this.fontStyle;
        int hashCode4 = (hashCode3 + (fontStyle != null ? fontStyle.hashCode() : 0)) * 31;
        TextDecoration textDecoration = this.textDecoration;
        int hashCode5 = (hashCode4 + (textDecoration != null ? textDecoration.hashCode() : 0)) * 31;
        TextAlign textAlign = this.textAlign;
        int hashCode6 = (hashCode5 + (textAlign != null ? textAlign.hashCode() : 0)) * 31;
        FontFamily fontFamily = this.fontFamily;
        return hashCode6 + (fontFamily != null ? fontFamily.hashCode() : 0);
    }

    public String toString() {
        return "TextStyle(color=" + this.color + ", fontSize=" + this.fontSize + ", fontWeight=" + this.fontWeight + ", fontStyle=" + this.fontStyle + ", textDecoration=" + this.textDecoration + ", textAlign=" + this.textAlign + ", fontFamily=" + this.fontFamily + ')';
    }

    private TextStyle(ColorProvider colorProvider, TextUnit textUnit, FontWeight fontWeight, FontStyle fontStyle, TextAlign textAlign, TextDecoration textDecoration, FontFamily fontFamily) {
        this.color = colorProvider;
        this.fontSize = textUnit;
        this.fontWeight = fontWeight;
        this.fontStyle = fontStyle;
        this.textAlign = textAlign;
        this.textDecoration = textDecoration;
        this.fontFamily = fontFamily;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ TextStyle(ColorProvider colorProvider, TextUnit textUnit, FontWeight fontWeight, FontStyle fontStyle, TextAlign textAlign, TextDecoration textDecoration, FontFamily fontFamily, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r0, r1, r3, r4, r5, r6, (i & 64) == 0 ? fontFamily : null, null);
        ColorProvider defaultTextColor = (i & 1) != 0 ? TextDefaults.INSTANCE.getDefaultTextColor() : colorProvider;
        TextUnit textUnit2 = (i & 2) != 0 ? null : textUnit;
        FontWeight fontWeight2 = (i & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i & 8) != 0 ? null : fontStyle;
        TextAlign textAlign2 = (i & 16) != 0 ? null : textAlign;
        TextDecoration textDecoration2 = (i & 32) != 0 ? null : textDecoration;
    }
}
