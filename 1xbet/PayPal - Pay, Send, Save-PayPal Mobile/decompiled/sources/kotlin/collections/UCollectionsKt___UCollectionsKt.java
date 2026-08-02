package kotlin.collections;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00050\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\t0\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\r0\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0012\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00050\u0011¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0014\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0016\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0004\b\u0016\u0010\u0013\u001a\u0017\u0010\u0017\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0004\b\u0017\u0010\u0013"}, d2 = {"", "Lkotlin/UByte;", "Lkotlin/UByteArray;", "toUByteArray", "(Ljava/util/Collection;)[B", "Lkotlin/UInt;", "Lkotlin/UIntArray;", "toUIntArray", "(Ljava/util/Collection;)[I", "Lkotlin/ULong;", "Lkotlin/ULongArray;", "toULongArray", "(Ljava/util/Collection;)[J", "Lkotlin/UShort;", "Lkotlin/UShortArray;", "toUShortArray", "(Ljava/util/Collection;)[S", "", "sumOfUInt", "(Ljava/lang/Iterable;)I", "sumOfULong", "(Ljava/lang/Iterable;)J", "sumOfUByte", "sumOfUShort"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/UCollectionsKt")
/* loaded from: classes17.dex */
class UCollectionsKt___UCollectionsKt {
    public static final byte[] toUByteArray(java.util.Collection<kotlin.UByte> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        byte[] m23453constructorimpl = kotlin.UByteArray.m23453constructorimpl(collection.size());
        java.util.Iterator<kotlin.UByte> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            kotlin.UByteArray.m23464setVurrAj0(m23453constructorimpl, i, it.next().getGetHighSpeedVideoFpsRangesFor());
            i++;
        }
        return m23453constructorimpl;
    }

    public static final int[] toUIntArray(java.util.Collection<kotlin.UInt> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        int[] m23477constructorimpl = kotlin.UIntArray.m23477constructorimpl(collection.size());
        java.util.Iterator<kotlin.UInt> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            kotlin.UIntArray.m23488setVXSXFK8(m23477constructorimpl, i, it.next().getCamera2StreamConfigurationMap());
            i++;
        }
        return m23477constructorimpl;
    }

    public static final long[] toULongArray(java.util.Collection<kotlin.ULong> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        long[] m23501constructorimpl = kotlin.ULongArray.m23501constructorimpl(collection.size());
        java.util.Iterator<kotlin.ULong> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            kotlin.ULongArray.m23512setk8EXiF4(m23501constructorimpl, i, it.next().getGetHighSpeedVideoFpsRanges());
            i++;
        }
        return m23501constructorimpl;
    }

    public static final short[] toUShortArray(java.util.Collection<kotlin.UShort> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        short[] m23525constructorimpl = kotlin.UShortArray.m23525constructorimpl(collection.size());
        java.util.Iterator<kotlin.UShort> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            kotlin.UShortArray.m23536set01HTLdE(m23525constructorimpl, i, it.next().getGetHighResolutionOutputSizeshNQ4ISI());
            i++;
        }
        return m23525constructorimpl;
    }

    public static final int sumOfUInt(java.lang.Iterable<kotlin.UInt> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        java.util.Iterator<kotlin.UInt> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = kotlin.UInt.m23470constructorimpl(i + it.next().getCamera2StreamConfigurationMap());
        }
        return i;
    }

    public static final long sumOfULong(java.lang.Iterable<kotlin.ULong> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        java.util.Iterator<kotlin.ULong> it = iterable.iterator();
        long j = 0;
        while (it.hasNext()) {
            j = kotlin.ULong.m23494constructorimpl(j + it.next().getGetHighSpeedVideoFpsRanges());
        }
        return j;
    }

    public static final int sumOfUByte(java.lang.Iterable<kotlin.UByte> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        java.util.Iterator<kotlin.UByte> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = kotlin.UInt.m23470constructorimpl(i + kotlin.UInt.m23470constructorimpl(it.next().getGetHighSpeedVideoFpsRangesFor() & 255));
        }
        return i;
    }

    public static final int sumOfUShort(java.lang.Iterable<kotlin.UShort> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        java.util.Iterator<kotlin.UShort> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = kotlin.UInt.m23470constructorimpl(i + kotlin.UInt.m23470constructorimpl(it.next().getGetHighResolutionOutputSizeshNQ4ISI() & kotlin.UShort.MAX_VALUE));
        }
        return i;
    }
}
