package kotlin.random;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0006\u001a\u0019\u0010\t\u001a\u00020\u0000*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\f\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\b\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0017\u0010\u0019\u001a\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u0017\u0010\u001b\u001a\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"", "seed", "Lkotlin/random/Random;", "Random", "(I)Lkotlin/random/Random;", "", "(J)Lkotlin/random/Random;", "Lkotlin/ranges/IntRange;", "range", "nextInt", "(Lkotlin/random/Random;Lkotlin/ranges/IntRange;)I", "Lkotlin/ranges/LongRange;", "nextLong", "(Lkotlin/random/Random;Lkotlin/ranges/LongRange;)J", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "fastLog2", "(I)I", "bitCount", "takeUpperBits", "(II)I", "from", "until", "", "checkRangeBounds", "(II)V", "(JJ)V", "", "(DD)V", "", "", "boundsErrorMessage", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RandomKt {
    public static final int takeUpperBits(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }

    public static final kotlin.random.Random Random(int i) {
        return new kotlin.random.XorWowRandom(i, i >> 31);
    }

    public static final kotlin.random.Random Random(long j) {
        return new kotlin.random.XorWowRandom((int) j, (int) (j >> 32));
    }

    public static final int nextInt(kotlin.random.Random random, kotlin.ranges.IntRange intRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intRange, "");
        if (intRange.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Cannot get random in empty range: ".concat(java.lang.String.valueOf(intRange)));
        }
        return intRange.getLast() < Integer.MAX_VALUE ? random.nextInt(intRange.getFirst(), intRange.getLast() + 1) : intRange.getFirst() > Integer.MIN_VALUE ? random.nextInt(intRange.getFirst() - 1, intRange.getLast()) + 1 : random.nextInt();
    }

    public static final long nextLong(kotlin.random.Random random, kotlin.ranges.LongRange longRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longRange, "");
        if (longRange.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Cannot get random in empty range: ".concat(java.lang.String.valueOf(longRange)));
        }
        return longRange.getLast() < Long.MAX_VALUE ? random.nextLong(longRange.getFirst(), longRange.getLast() + 1) : longRange.getFirst() > Long.MIN_VALUE ? random.nextLong(longRange.getFirst() - 1, longRange.getLast()) + 1 : random.nextLong();
    }

    public static final int fastLog2(int i) {
        return 31 - java.lang.Integer.numberOfLeadingZeros(i);
    }

    public static final void checkRangeBounds(int i, int i2) {
        if (i2 <= i) {
            throw new java.lang.IllegalArgumentException(boundsErrorMessage(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)).toString());
        }
    }

    public static final void checkRangeBounds(long j, long j2) {
        if (j2 <= j) {
            throw new java.lang.IllegalArgumentException(boundsErrorMessage(java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2)).toString());
        }
    }

    public static final void checkRangeBounds(double d, double d2) {
        if (d2 <= d) {
            throw new java.lang.IllegalArgumentException(boundsErrorMessage(java.lang.Double.valueOf(d), java.lang.Double.valueOf(d2)).toString());
        }
    }

    public static final java.lang.String boundsErrorMessage(java.lang.Object obj, java.lang.Object obj2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Random range is empty: [");
        sb.append(obj);
        sb.append(", ");
        sb.append(obj2);
        sb.append(").");
        return sb.toString();
    }
}
