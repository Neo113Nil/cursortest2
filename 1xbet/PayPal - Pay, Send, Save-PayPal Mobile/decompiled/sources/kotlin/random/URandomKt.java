package kotlin.random;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0002\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u0002\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u0002\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0002\u0010\f\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0019\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0014¢\u0006\u0004\b\u000e\u0010\u0015\u001a\u001b\u0010\u001a\u001a\u00020\u0016*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001a\u001a\u00020\u0016*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001a\u0010\u001d\u001a/\u0010\u001a\u001a\u00020\u0016*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u001e\u001a\u00020\u001b2\b\b\u0002\u0010\u001f\u001a\u00020\u001bH\u0007¢\u0006\u0004\b \u0010!\u001a\u001f\u0010%\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010(\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\rH\u0000¢\u0006\u0004\b&\u0010'"}, d2 = {"Lkotlin/random/Random;", "Lkotlin/UInt;", "nextUInt", "(Lkotlin/random/Random;)I", "until", "nextUInt-qCasIEU", "(Lkotlin/random/Random;I)I", "from", "nextUInt-a8DCA5k", "(Lkotlin/random/Random;II)I", "Lkotlin/ranges/UIntRange;", "range", "(Lkotlin/random/Random;Lkotlin/ranges/UIntRange;)I", "Lkotlin/ULong;", "nextULong", "(Lkotlin/random/Random;)J", "nextULong-V1Xi4fY", "(Lkotlin/random/Random;J)J", "nextULong-jmpaW-c", "(Lkotlin/random/Random;JJ)J", "Lkotlin/ranges/ULongRange;", "(Lkotlin/random/Random;Lkotlin/ranges/ULongRange;)J", "Lkotlin/UByteArray;", "array", "nextUBytes-EVgfTAA", "(Lkotlin/random/Random;[B)[B", "nextUBytes", "", io.ktor.http.ContentDisposition.Parameters.Size, "(Lkotlin/random/Random;I)[B", "fromIndex", "toIndex", "nextUBytes-Wvrt4B4", "(Lkotlin/random/Random;[BII)[B", "", "checkUIntRangeBounds-J1ME1BU", "(II)V", "checkUIntRangeBounds", "checkULongRangeBounds-eb3DHEI", "(JJ)V", "checkULongRangeBounds"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class URandomKt {
    public static final int nextUInt(kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        return kotlin.UInt.m23470constructorimpl(random.nextInt());
    }

    /* renamed from: nextUInt-qCasIEU, reason: not valid java name */
    public static final int m23840nextUIntqCasIEU(kotlin.random.Random random, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        return m23839nextUInta8DCA5k(random, 0, i);
    }

    /* renamed from: nextUInt-a8DCA5k, reason: not valid java name */
    public static final int m23839nextUInta8DCA5k(kotlin.random.Random random, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        m23834checkUIntRangeBoundsJ1ME1BU(i, i2);
        return kotlin.UInt.m23470constructorimpl(random.nextInt(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) ^ Integer.MIN_VALUE);
    }

    public static final int nextUInt(kotlin.random.Random random, kotlin.ranges.UIntRange uIntRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uIntRange, "");
        if (uIntRange.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Cannot get random in empty range: ".concat(java.lang.String.valueOf(uIntRange)));
        }
        return java.lang.Integer.compareUnsigned(uIntRange.getLast(), -1) < 0 ? m23839nextUInta8DCA5k(random, uIntRange.getFirst(), kotlin.UInt.m23470constructorimpl(uIntRange.getLast() + 1)) : java.lang.Integer.compareUnsigned(uIntRange.getFirst(), 0) > 0 ? kotlin.UInt.m23470constructorimpl(m23839nextUInta8DCA5k(random, kotlin.UInt.m23470constructorimpl(uIntRange.getFirst() - 1), uIntRange.getLast()) + 1) : nextUInt(random);
    }

    public static final long nextULong(kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        return kotlin.ULong.m23494constructorimpl(random.nextLong());
    }

    /* renamed from: nextULong-V1Xi4fY, reason: not valid java name */
    public static final long m23841nextULongV1Xi4fY(kotlin.random.Random random, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        return m23842nextULongjmpaWc(random, 0L, j);
    }

    /* renamed from: nextULong-jmpaW-c, reason: not valid java name */
    public static final long m23842nextULongjmpaWc(kotlin.random.Random random, long j, long j2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        m23835checkULongRangeBoundseb3DHEI(j, j2);
        return kotlin.ULong.m23494constructorimpl(random.nextLong(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) ^ Long.MIN_VALUE);
    }

    public static final long nextULong(kotlin.random.Random random, kotlin.ranges.ULongRange uLongRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uLongRange, "");
        if (uLongRange.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Cannot get random in empty range: ".concat(java.lang.String.valueOf(uLongRange)));
        }
        return java.lang.Long.compareUnsigned(uLongRange.getLast(), -1L) < 0 ? m23842nextULongjmpaWc(random, uLongRange.getFirst(), kotlin.ULong.m23494constructorimpl(uLongRange.getLast() + kotlin.ULong.m23494constructorimpl(1L))) : java.lang.Long.compareUnsigned(uLongRange.getFirst(), 0L) > 0 ? kotlin.ULong.m23494constructorimpl(m23842nextULongjmpaWc(random, kotlin.ULong.m23494constructorimpl(uLongRange.getFirst() - kotlin.ULong.m23494constructorimpl(1L)), uLongRange.getLast()) + kotlin.ULong.m23494constructorimpl(1L)) : nextULong(random);
    }

    @kotlin.IgnorableReturnValue
    /* renamed from: nextUBytes-EVgfTAA, reason: not valid java name */
    public static final byte[] m23836nextUBytesEVgfTAA(kotlin.random.Random random, byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        random.nextBytes(bArr);
        return bArr;
    }

    public static final byte[] nextUBytes(kotlin.random.Random random, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        return kotlin.UByteArray.m23454constructorimpl(random.nextBytes(i));
    }

    /* renamed from: nextUBytes-Wvrt4B4$default, reason: not valid java name */
    public static /* synthetic */ byte[] m23838nextUBytesWvrt4B4$default(kotlin.random.Random random, byte[] bArr, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = kotlin.UByteArray.m23460getSizeimpl(bArr);
        }
        return m23837nextUBytesWvrt4B4(random, bArr, i, i2);
    }

    @kotlin.IgnorableReturnValue
    /* renamed from: nextUBytes-Wvrt4B4, reason: not valid java name */
    public static final byte[] m23837nextUBytesWvrt4B4(kotlin.random.Random random, byte[] bArr, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        random.nextBytes(bArr, i, i2);
        return bArr;
    }

    /* renamed from: checkUIntRangeBounds-J1ME1BU, reason: not valid java name */
    public static final void m23834checkUIntRangeBoundsJ1ME1BU(int i, int i2) {
        if (java.lang.Integer.compareUnsigned(i2, i) <= 0) {
            throw new java.lang.IllegalArgumentException(kotlin.random.RandomKt.boundsErrorMessage(kotlin.UInt.m23469boximpl(i), kotlin.UInt.m23469boximpl(i2)).toString());
        }
    }

    /* renamed from: checkULongRangeBounds-eb3DHEI, reason: not valid java name */
    public static final void m23835checkULongRangeBoundseb3DHEI(long j, long j2) {
        if (java.lang.Long.compareUnsigned(j2, j) <= 0) {
            throw new java.lang.IllegalArgumentException(kotlin.random.RandomKt.boundsErrorMessage(kotlin.ULong.m23493boximpl(j), kotlin.ULong.m23493boximpl(j2)).toString());
        }
    }
}
