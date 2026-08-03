package androidx.compose.ui.text.font;

/* compiled from: FontFamily.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/font/LoadedFontFamily;", "Landroidx/compose/ui/text/font/FontFamily;", "typeface", "Landroidx/compose/ui/text/font/Typeface;", "(Landroidx/compose/ui/text/font/Typeface;)V", "getTypeface", "()Landroidx/compose/ui/text/font/Typeface;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LoadedFontFamily extends androidx.compose.ui.text.font.FontFamily {
    public static final int $stable = 0;
    private final androidx.compose.ui.text.font.Typeface typeface;

    public LoadedFontFamily(androidx.compose.ui.text.font.Typeface typeface) {
        super(true, null);
        this.typeface = typeface;
    }

    public final androidx.compose.ui.text.font.Typeface getTypeface() {
        return this.typeface;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.compose.ui.text.font.LoadedFontFamily) && kotlin.jvm.internal.Intrinsics.areEqual(this.typeface, ((androidx.compose.ui.text.font.LoadedFontFamily) other).typeface);
    }

    public int hashCode() {
        return this.typeface.hashCode();
    }

    public java.lang.String toString() {
        return "LoadedFontFamily(typeface=" + this.typeface + ')';
    }
}
