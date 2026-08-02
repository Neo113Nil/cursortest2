package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/ui/layout/ModifierInfo;", "", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "extra", "<init>", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/LayoutCoordinates;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "Ljava/lang/Object;", "getExtra", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ModifierInfo {
    public static final int $stable = 8;
    private final androidx.compose.ui.layout.LayoutCoordinates coordinates;
    private final java.lang.Object extra;
    private final androidx.compose.ui.Modifier modifier;

    public ModifierInfo(androidx.compose.ui.Modifier modifier, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, java.lang.Object obj) {
        this.modifier = modifier;
        this.coordinates = layoutCoordinates;
        this.extra = obj;
    }

    public /* synthetic */ ModifierInfo(androidx.compose.ui.Modifier modifier, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, java.lang.Object obj, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(modifier, layoutCoordinates, (i & 4) != 0 ? null : obj);
    }

    public final androidx.compose.ui.Modifier getModifier() {
        return this.modifier;
    }

    public final androidx.compose.ui.layout.LayoutCoordinates getCoordinates() {
        return this.coordinates;
    }

    public final java.lang.Object getExtra() {
        return this.extra;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ModifierInfo(");
        sb.append(this.modifier);
        sb.append(", ");
        sb.append(this.coordinates);
        sb.append(", ");
        sb.append(this.extra);
        sb.append(')');
        return sb.toString();
    }
}
