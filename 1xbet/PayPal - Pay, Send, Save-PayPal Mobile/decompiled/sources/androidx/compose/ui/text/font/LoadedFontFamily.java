package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/ui/text/font/LoadedFontFamily;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/Typeface;", "typeface", "<init>", "(Landroidx/compose/ui/text/font/Typeface;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/font/Typeface;", "getTypeface", "()Landroidx/compose/ui/text/font/Typeface;"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.compose.ui.text.font.LoadedFontFamily) && kotlin.jvm.internal.Intrinsics.areEqual(this.typeface, ((androidx.compose.ui.text.font.LoadedFontFamily) other).typeface);
    }

    public final int hashCode() {
        return this.typeface.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadedFontFamily(typeface=");
        sb.append(this.typeface);
        sb.append(')');
        return sb.toString();
    }
}
