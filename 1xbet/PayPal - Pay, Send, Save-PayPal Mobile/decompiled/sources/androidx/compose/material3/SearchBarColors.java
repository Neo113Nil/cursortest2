package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/material3/SearchBarColors;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "dividerColor", "Landroidx/compose/material3/TextFieldColors;", "inputFieldColors", "<init>", "(JJLandroidx/compose/material3/TextFieldColors;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getContainerColor-0d7_KjU", "()J", "getDividerColor-0d7_KjU", "Landroidx/compose/material3/TextFieldColors;", "getInputFieldColors", "()Landroidx/compose/material3/TextFieldColors;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SearchBarColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long dividerColor;
    private final androidx.compose.material3.TextFieldColors inputFieldColors;

    private SearchBarColors(long j, long j2, androidx.compose.material3.TextFieldColors textFieldColors) {
        this.containerColor = j;
        this.dividerColor = j2;
        this.inputFieldColors = textFieldColors;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* renamed from: getDividerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDividerColor() {
        return this.dividerColor;
    }

    public final androidx.compose.material3.TextFieldColors getInputFieldColors() {
        return this.inputFieldColors;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private SearchBarColors(long j, long j2) {
        this(j, j2, r5, null);
        androidx.compose.material3.TextFieldColors textFieldColors;
        textFieldColors = androidx.compose.material3.SearchBarKt.toString;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.material3.SearchBarColors)) {
            return false;
        }
        androidx.compose.material3.SearchBarColors searchBarColors = (androidx.compose.material3.SearchBarColors) other;
        return androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.containerColor, searchBarColors.containerColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.dividerColor, searchBarColors.dividerColor) && kotlin.jvm.internal.Intrinsics.areEqual(this.inputFieldColors, searchBarColors.inputFieldColors);
    }

    public final int hashCode() {
        return (((androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.containerColor) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.dividerColor)) * 31) + this.inputFieldColors.hashCode();
    }

    @kotlin.Deprecated(message = "Use overload that takes `inputFieldColors", replaceWith = @kotlin.ReplaceWith(expression = "SearchBarColors(containerColor, dividerColor, inputFieldColors)", imports = {}))
    public /* synthetic */ SearchBarColors(long j, long j2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    public /* synthetic */ SearchBarColors(long j, long j2, androidx.compose.material3.TextFieldColors textFieldColors, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, textFieldColors);
    }
}
