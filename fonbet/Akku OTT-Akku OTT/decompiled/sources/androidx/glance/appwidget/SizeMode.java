package androidx.glance.appwidget;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.DpSize;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/glance/appwidget/SizeMode;", "", "Exact", "Responsive", "Single", "Landroidx/glance/appwidget/SizeMode$Exact;", "Landroidx/glance/appwidget/SizeMode$Responsive;", "Landroidx/glance/appwidget/SizeMode$Single;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SizeMode {

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Landroidx/glance/appwidget/SizeMode$Exact;", "Landroidx/glance/appwidget/SizeMode;", "()V", "toString", "", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Exact implements SizeMode {
        public static final int $stable = 0;
        public static final Exact INSTANCE = new Exact();

        private Exact() {
        }

        public String toString() {
            return "SizeMode.Exact";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Landroidx/glance/appwidget/SizeMode$Responsive;", "Landroidx/glance/appwidget/SizeMode;", "sizes", "", "Landroidx/compose/ui/unit/DpSize;", "(Ljava/util/Set;)V", "getSizes", "()Ljava/util/Set;", "equals", "", "other", "", "hashCode", "", "toString", "", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSizeMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SizeMode.kt\nandroidx/glance/appwidget/SizeMode$Responsive\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,84:1\n1#2:85\n*E\n"})
    public static final class Responsive implements SizeMode {
        public static final int $stable = 8;
        private final Set<DpSize> sizes;

        public Responsive(Set<DpSize> set) {
            this.sizes = set;
            if (set.isEmpty()) {
                throw new IllegalArgumentException("The set of sizes cannot be empty");
            }
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!Intrinsics.areEqual(Responsive.class, other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.checkNotNull(other, "null cannot be cast to non-null type androidx.glance.appwidget.SizeMode.Responsive");
            return Intrinsics.areEqual(this.sizes, ((Responsive) other).sizes);
        }

        public final Set<DpSize> getSizes() {
            return this.sizes;
        }

        public int hashCode() {
            return this.sizes.hashCode();
        }

        public String toString() {
            return "SizeMode.Responsive(sizes=" + this.sizes + ')';
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Landroidx/glance/appwidget/SizeMode$Single;", "Landroidx/glance/appwidget/SizeMode;", "()V", "toString", "", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Single implements SizeMode {
        public static final int $stable = 0;
        public static final Single INSTANCE = new Single();

        private Single() {
        }

        public String toString() {
            return "SizeMode.Single";
        }
    }
}
