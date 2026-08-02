package androidx.compose.foundation.pager;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0002\b\tJ#\u0010\u0006\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/pager/PageSize;", "", "Landroidx/compose/ui/unit/Density;", "", "availableSpace", "pageSpacing", "calculateMainAxisPageSize", "(Landroidx/compose/ui/unit/Density;II)I", "Fill", "Fixed"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface PageSize {
    int calculateMainAxisPageSize(androidx.compose.ui.unit.Density density, int i, int i2);

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/foundation/pager/PageSize$Fill;", "Landroidx/compose/foundation/pager/PageSize;", "<init>", "()V", "Landroidx/compose/ui/unit/Density;", "", "availableSpace", "pageSpacing", "calculateMainAxisPageSize", "(Landroidx/compose/ui/unit/Density;II)I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Fill implements androidx.compose.foundation.pager.PageSize {
        public static final int $stable = 0;
        public static final androidx.compose.foundation.pager.PageSize.Fill INSTANCE = new androidx.compose.foundation.pager.PageSize.Fill();

        @Override // androidx.compose.foundation.pager.PageSize
        public final int calculateMainAxisPageSize(androidx.compose.ui.unit.Density density, int i, int i2) {
            return i;
        }

        private Fill() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/compose/foundation/pager/PageSize$Fixed;", "Landroidx/compose/foundation/pager/PageSize;", "Landroidx/compose/ui/unit/Dp;", "pageSize", "<init>", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/Density;", "", "availableSpace", "pageSpacing", "calculateMainAxisPageSize", "(Landroidx/compose/ui/unit/Density;II)I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getPageSize-D9Ej5fM", "()F"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Fixed implements androidx.compose.foundation.pager.PageSize {
        public static final int $stable = 0;
        private final float pageSize;

        private Fixed(float f) {
            this.pageSize = f;
        }

        /* renamed from: getPageSize-D9Ej5fM, reason: not valid java name and from getter */
        public final float getPageSize() {
            return this.pageSize;
        }

        @Override // androidx.compose.foundation.pager.PageSize
        public final int calculateMainAxisPageSize(androidx.compose.ui.unit.Density density, int i, int i2) {
            return density.mo1412roundToPx0680j_4(this.pageSize);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof androidx.compose.foundation.pager.PageSize.Fixed) {
                return androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.pageSize, ((androidx.compose.foundation.pager.PageSize.Fixed) other).pageSize);
            }
            return false;
        }

        public final int hashCode() {
            return androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.pageSize);
        }

        public /* synthetic */ Fixed(float f, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(f);
        }
    }
}
