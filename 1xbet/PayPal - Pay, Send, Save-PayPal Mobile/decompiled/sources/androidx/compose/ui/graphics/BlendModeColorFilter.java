package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u0013"}, d2 = {"Landroidx/compose/ui/graphics/BlendModeColorFilter;", "Landroidx/compose/ui/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/Color;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/getHighSpeedVideoFpsRanges;", "nativeColorFilter", "<init>", "(JILandroid/graphics/ColorFilter;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getColor-0d7_KjU", "()J", com.visa.cbp.getEncExpo.warmup, "getBlendMode-0nO6VwU"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BlendModeColorFilter extends androidx.compose.ui.graphics.ColorFilter {
    public static final int $stable = 0;
    private final int blendMode;
    private final long color;

    private BlendModeColorFilter(long j, int i, android.graphics.ColorFilter colorFilter) {
        super(colorFilter);
        this.color = j;
        this.blendMode = i;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name and from getter */
    public final int getBlendMode() {
        return this.blendMode;
    }

    private BlendModeColorFilter(long j, int i) {
        this(j, i, androidx.compose.ui.graphics.AndroidColorFilter_androidKt.m5859actualTintColorFilterxETnrds(j, i), null);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.graphics.BlendModeColorFilter)) {
            return false;
        }
        androidx.compose.ui.graphics.BlendModeColorFilter blendModeColorFilter = (androidx.compose.ui.graphics.BlendModeColorFilter) other;
        return androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.color, blendModeColorFilter.color) && androidx.compose.ui.graphics.BlendMode.m5906equalsimpl0(this.blendMode, blendModeColorFilter.blendMode);
    }

    public final int hashCode() {
        return (androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.color) * 31) + androidx.compose.ui.graphics.BlendMode.m5907hashCodeimpl(this.blendMode);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BlendModeColorFilter(color=");
        sb.append((java.lang.Object) androidx.compose.ui.graphics.Color.m6004toStringimpl(this.color));
        sb.append(", blendMode=");
        sb.append((java.lang.Object) androidx.compose.ui.graphics.BlendMode.m5908toStringimpl(this.blendMode));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ BlendModeColorFilter(long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i);
    }

    public /* synthetic */ BlendModeColorFilter(long j, int i, android.graphics.ColorFilter colorFilter, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, colorFilter);
    }
}
