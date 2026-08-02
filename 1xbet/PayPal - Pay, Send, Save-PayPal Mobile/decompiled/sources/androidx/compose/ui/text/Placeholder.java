package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012"}, d2 = {"Landroidx/compose/ui/text/Placeholder;", "", "Landroidx/compose/ui/unit/TextUnit;", "width", "height", "Landroidx/compose/ui/text/PlaceholderVerticalAlign;", "placeholderVerticalAlign", "<init>", "(JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-K8Q-__8", "(JJI)Landroidx/compose/ui/text/Placeholder;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getWidth-XSAIIZE", "()J", "getHeight-XSAIIZE", com.visa.cbp.getEncExpo.warmup, "getPlaceholderVerticalAlign-J6kI3mc"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Placeholder {
    public static final int $stable = 0;
    private final long height;
    private final int placeholderVerticalAlign;
    private final long width;

    private Placeholder(long j, long j2, int i) {
        this.width = j;
        this.height = j2;
        this.placeholderVerticalAlign = i;
        if (androidx.compose.ui.unit.TextUnit.m8793getRawTypeimpl(j) == 0) {
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException("width cannot be TextUnit.Unspecified");
        }
        if (androidx.compose.ui.unit.TextUnit.m8793getRawTypeimpl(j2) == 0) {
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException("height cannot be TextUnit.Unspecified");
        }
    }

    /* renamed from: getWidth-XSAIIZE, reason: not valid java name and from getter */
    public final long getWidth() {
        return this.width;
    }

    /* renamed from: getHeight-XSAIIZE, reason: not valid java name and from getter */
    public final long getHeight() {
        return this.height;
    }

    /* renamed from: getPlaceholderVerticalAlign-J6kI3mc, reason: not valid java name and from getter */
    public final int getPlaceholderVerticalAlign() {
        return this.placeholderVerticalAlign;
    }

    /* renamed from: copy-K8Q-__8$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.Placeholder m7927copyK8Q__8$default(androidx.compose.ui.text.Placeholder placeholder, long j, long j2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            j = placeholder.width;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = placeholder.height;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            i = placeholder.placeholderVerticalAlign;
        }
        return placeholder.m7928copyK8Q__8(j3, j4, i);
    }

    /* renamed from: copy-K8Q-__8, reason: not valid java name */
    public final androidx.compose.ui.text.Placeholder m7928copyK8Q__8(long width, long height, int placeholderVerticalAlign) {
        return new androidx.compose.ui.text.Placeholder(width, height, placeholderVerticalAlign, null);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.text.Placeholder)) {
            return false;
        }
        androidx.compose.ui.text.Placeholder placeholder = (androidx.compose.ui.text.Placeholder) other;
        return androidx.compose.ui.unit.TextUnit.m8792equalsimpl0(this.width, placeholder.width) && androidx.compose.ui.unit.TextUnit.m8792equalsimpl0(this.height, placeholder.height) && androidx.compose.ui.text.PlaceholderVerticalAlign.m7935equalsimpl0(this.placeholderVerticalAlign, placeholder.placeholderVerticalAlign);
    }

    public final int hashCode() {
        return (((androidx.compose.ui.unit.TextUnit.m8796hashCodeimpl(this.width) * 31) + androidx.compose.ui.unit.TextUnit.m8796hashCodeimpl(this.height)) * 31) + androidx.compose.ui.text.PlaceholderVerticalAlign.m7936hashCodeimpl(this.placeholderVerticalAlign);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Placeholder(width=");
        sb.append((java.lang.Object) androidx.compose.ui.unit.TextUnit.m8802toStringimpl(this.width));
        sb.append(", height=");
        sb.append((java.lang.Object) androidx.compose.ui.unit.TextUnit.m8802toStringimpl(this.height));
        sb.append(", placeholderVerticalAlign=");
        sb.append((java.lang.Object) androidx.compose.ui.text.PlaceholderVerticalAlign.m7937toStringimpl(this.placeholderVerticalAlign));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ Placeholder(long j, long j2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, i);
    }
}
