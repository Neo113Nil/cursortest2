package androidx.glance.unit;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0019\u0010\b\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006J \u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J \u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0016ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/glance/unit/FixedColorProvider;", "Landroidx/glance/unit/ColorProvider;", "color", "Landroidx/compose/ui/graphics/Color;", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getColor-0d7_KjU", "()J", "J", "component1", "component1-0d7_KjU", "copy", "copy-8_81llA", "(J)Landroidx/glance/unit/FixedColorProvider;", "equals", "", "other", "", "getColor", "context", "Landroid/content/Context;", "getColor-vNxB06k", "(Landroid/content/Context;)J", "hashCode", "", "toString", "", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final /* data */ class FixedColorProvider implements ColorProvider {
    public static final int $stable = 0;
    private final long color;

    public /* synthetic */ FixedColorProvider(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    /* renamed from: copy-8_81llA$default, reason: not valid java name */
    public static /* synthetic */ FixedColorProvider m1507copy8_81llA$default(FixedColorProvider fixedColorProvider, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = fixedColorProvider.color;
        }
        return fixedColorProvider.m1509copy8_81llA(j);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    /* renamed from: copy-8_81llA, reason: not valid java name */
    public final FixedColorProvider m1509copy8_81llA(long color) {
        return new FixedColorProvider(color, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FixedColorProvider) && Color.m508equalsimpl0(this.color, ((FixedColorProvider) other).color);
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m1510getColor0d7_KjU() {
        return this.color;
    }

    @Override // androidx.glance.unit.ColorProvider
    /* renamed from: getColor-vNxB06k */
    public long mo1356getColorvNxB06k(Context context) {
        return this.color;
    }

    public int hashCode() {
        return Color.m514hashCodeimpl(this.color);
    }

    public String toString() {
        return "FixedColorProvider(color=" + ((Object) Color.m515toStringimpl(this.color)) + ')';
    }

    private FixedColorProvider(long j) {
        this.color = j;
    }
}
