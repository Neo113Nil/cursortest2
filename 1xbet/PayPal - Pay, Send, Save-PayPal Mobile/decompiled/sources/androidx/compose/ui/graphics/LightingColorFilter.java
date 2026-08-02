package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018"}, d2 = {"Landroidx/compose/ui/graphics/LightingColorFilter;", "Landroidx/compose/ui/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/Color;", "multiply", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/getHighSpeedVideoFpsRanges;", "nativeColorFilter", "<init>", "(JJLandroid/graphics/ColorFilter;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getMultiply-0d7_KjU", "()J", "getAdd-0d7_KjU"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LightingColorFilter extends androidx.compose.ui.graphics.ColorFilter {
    public static final int $stable = 0;
    private final long add;
    private final long multiply;

    private LightingColorFilter(long j, long j2, android.graphics.ColorFilter colorFilter) {
        super(colorFilter);
        this.multiply = j;
        this.add = j2;
    }

    /* renamed from: getAdd-0d7_KjU, reason: not valid java name and from getter */
    public final long getAdd() {
        return this.add;
    }

    /* renamed from: getMultiply-0d7_KjU, reason: not valid java name and from getter */
    public final long getMultiply() {
        return this.multiply;
    }

    private LightingColorFilter(long j, long j2) {
        this(j, j2, androidx.compose.ui.graphics.AndroidColorFilter_androidKt.m5858actualLightingColorFilterOWjLjI(j, j2), null);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.graphics.LightingColorFilter)) {
            return false;
        }
        androidx.compose.ui.graphics.LightingColorFilter lightingColorFilter = (androidx.compose.ui.graphics.LightingColorFilter) other;
        return androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.multiply, lightingColorFilter.multiply) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.add, lightingColorFilter.add);
    }

    public final int hashCode() {
        return (androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.multiply) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.add);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LightingColorFilter(multiply=");
        sb.append((java.lang.Object) androidx.compose.ui.graphics.Color.m6004toStringimpl(this.multiply));
        sb.append(", add=");
        sb.append((java.lang.Object) androidx.compose.ui.graphics.Color.m6004toStringimpl(this.add));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ LightingColorFilter(long j, long j2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    public /* synthetic */ LightingColorFilter(long j, long j2, android.graphics.ColorFilter colorFilter, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, colorFilter);
    }
}
