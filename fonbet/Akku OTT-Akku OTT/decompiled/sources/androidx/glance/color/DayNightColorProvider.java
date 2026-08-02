package androidx.glance.color;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.glance.unit.ColorProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0005J\u0019\u0010\n\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0007J\u0019\u0010\f\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0007J*\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J \u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H\u0016ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0012ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u001bJ\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/glance/color/DayNightColorProvider;", "Landroidx/glance/unit/ColorProvider;", "day", "Landroidx/compose/ui/graphics/Color;", "night", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDay-0d7_KjU", "()J", "J", "getNight-0d7_KjU", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "copy", "copy--OWjLjI", "(JJ)Landroidx/glance/color/DayNightColorProvider;", "equals", "", "other", "", "getColor", "context", "Landroid/content/Context;", "getColor-vNxB06k", "(Landroid/content/Context;)J", "isNightMode", "(Z)J", "hashCode", "", "toString", "", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public final /* data */ class DayNightColorProvider implements ColorProvider {
    public static final int $stable = 0;
    private final long day;
    private final long night;

    public /* synthetic */ DayNightColorProvider(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    /* renamed from: copy--OWjLjI$default, reason: not valid java name */
    public static /* synthetic */ DayNightColorProvider m1352copyOWjLjI$default(DayNightColorProvider dayNightColorProvider, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dayNightColorProvider.day;
        }
        if ((i & 2) != 0) {
            j2 = dayNightColorProvider.night;
        }
        return dayNightColorProvider.m1355copyOWjLjI(j, j2);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getDay() {
        return this.day;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getNight() {
        return this.night;
    }

    /* renamed from: copy--OWjLjI, reason: not valid java name */
    public final DayNightColorProvider m1355copyOWjLjI(long day, long night) {
        return new DayNightColorProvider(day, night, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DayNightColorProvider)) {
            return false;
        }
        DayNightColorProvider dayNightColorProvider = (DayNightColorProvider) other;
        return Color.m508equalsimpl0(this.day, dayNightColorProvider.day) && Color.m508equalsimpl0(this.night, dayNightColorProvider.night);
    }

    @Override // androidx.glance.unit.ColorProvider
    /* renamed from: getColor-vNxB06k, reason: not valid java name */
    public long mo1356getColorvNxB06k(Context context) {
        return m1357getColorvNxB06k(DayNightColorProvidersKt.isNightMode(context));
    }

    /* renamed from: getDay-0d7_KjU, reason: not valid java name */
    public final long m1358getDay0d7_KjU() {
        return this.day;
    }

    /* renamed from: getNight-0d7_KjU, reason: not valid java name */
    public final long m1359getNight0d7_KjU() {
        return this.night;
    }

    public int hashCode() {
        return Color.m514hashCodeimpl(this.night) + (Color.m514hashCodeimpl(this.day) * 31);
    }

    public String toString() {
        return "DayNightColorProvider(day=" + ((Object) Color.m515toStringimpl(this.day)) + ", night=" + ((Object) Color.m515toStringimpl(this.night)) + ')';
    }

    private DayNightColorProvider(long j, long j2) {
        this.day = j;
        this.night = j2;
    }

    /* renamed from: getColor-vNxB06k, reason: not valid java name */
    public final long m1357getColorvNxB06k(boolean isNightMode) {
        return isNightMode ? this.night : this.day;
    }
}
