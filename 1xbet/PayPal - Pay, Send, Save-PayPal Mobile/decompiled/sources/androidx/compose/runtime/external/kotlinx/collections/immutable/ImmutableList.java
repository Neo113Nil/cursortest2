package androidx.compose.runtime.external.kotlinx.collections.immutable;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\tJ%\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "E", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "", "fromIndex", "toIndex", "subList", "(II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "SubList"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ImmutableList<E> extends java.util.List<E>, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection<E>, kotlin.jvm.internal.markers.KMappedMarker {
    @Override // java.util.List
    default androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList<E> subList(int fromIndex, int toIndex) {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList.SubList(this, fromIndex, toIndex);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0011\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList$SubList;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "Lkotlin/collections/AbstractList;", "p0", "", "p1", "p2", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;II)V", "get", "(I)Ljava/lang/Object;", "subList", "(II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "getSize", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class SubList<E> extends kotlin.collections.AbstractList<E> implements androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList<E> {
        private final int Camera2StreamConfigurationMap;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private int getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final int getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList<E> getHighSpeedVideoFpsRanges;

        /* JADX WARN: Multi-variable type inference failed */
        public SubList(androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList<? extends E> immutableList, int i, int i2) {
            this.getHighSpeedVideoFpsRanges = immutableList;
            this.getHighSpeedVideoSizes = i;
            this.Camera2StreamConfigurationMap = i2;
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation.checkRangeIndexes$runtime(i, i2, immutableList.size());
            this.getHighSpeedVideoFpsRangesFor = i2 - i;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final E get(int p0) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation.checkElementIndex$runtime(p0, this.getHighSpeedVideoFpsRangesFor);
            return this.getHighSpeedVideoFpsRanges.get(this.getHighSpeedVideoSizes + p0);
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        /* renamed from: getSize, reason: from getter */
        public final int getGetHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // kotlin.collections.AbstractList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
        public final androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList<E> subList(int p0, int p1) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation.checkRangeIndexes$runtime(p0, p1, this.getHighSpeedVideoFpsRangesFor);
            androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList<E> immutableList = this.getHighSpeedVideoFpsRanges;
            int i = this.getHighSpeedVideoSizes;
            return new androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList.SubList(immutableList, p0 + i, i + p1);
        }
    }
}
