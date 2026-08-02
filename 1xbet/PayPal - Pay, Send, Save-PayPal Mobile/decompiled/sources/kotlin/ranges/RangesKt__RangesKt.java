package kotlin.ranges;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a2\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a2\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\t0\n*\u00020\t2\u0006\u0010\u0002\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u000b\u001a\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\u0006*\u00020\t2\u0006\u0010\u0002\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u0007\u0010\f\u001a\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\r0\n*\u00020\r2\u0006\u0010\u0002\u001a\u00020\rH\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u000e\u001a\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\r0\u0006*\u00020\r2\u0006\u0010\u0002\u001a\u00020\rH\u0086\u0002¢\u0006\u0004\b\u0007\u0010\u000f\u001a\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"", "T", "that", "Lkotlin/ranges/ClosedRange;", "rangeTo", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lkotlin/ranges/ClosedRange;", "Lkotlin/ranges/OpenEndRange;", "rangeUntil", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lkotlin/ranges/OpenEndRange;", "", "Lkotlin/ranges/ClosedFloatingPointRange;", "(DD)Lkotlin/ranges/ClosedFloatingPointRange;", "(DD)Lkotlin/ranges/OpenEndRange;", "", "(FF)Lkotlin/ranges/ClosedFloatingPointRange;", "(FF)Lkotlin/ranges/OpenEndRange;", "", "isPositive", "", "step", "", "checkStepIsPositive", "(ZLjava/lang/Number;)V"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/ranges/RangesKt")
/* loaded from: classes3.dex */
public class RangesKt__RangesKt {
    public static final <T extends java.lang.Comparable<? super T>> kotlin.ranges.ClosedRange<T> rangeTo(T t, T t2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t2, "");
        return new kotlin.ranges.ComparableRange(t, t2);
    }

    public static final <T extends java.lang.Comparable<? super T>> kotlin.ranges.OpenEndRange<T> rangeUntil(T t, T t2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t2, "");
        return new kotlin.ranges.ComparableOpenEndRange(t, t2);
    }

    public static final kotlin.ranges.ClosedFloatingPointRange<java.lang.Double> rangeTo(double d, double d2) {
        return new kotlin.ranges.ClosedDoubleRange(d, d2);
    }

    public static final kotlin.ranges.OpenEndRange<java.lang.Double> rangeUntil(double d, double d2) {
        return new kotlin.ranges.OpenEndDoubleRange(d, d2);
    }

    public static final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> rangeTo(float f, float f2) {
        return new kotlin.ranges.ClosedFloatRange(f, f2);
    }

    public static final kotlin.ranges.OpenEndRange<java.lang.Float> rangeUntil(float f, float f2) {
        return new kotlin.ranges.OpenEndFloatRange(f, f2);
    }

    public static final void checkStepIsPositive(boolean z, java.lang.Number number) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number, "");
        if (z) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Step must be positive, was: ");
        sb.append(number);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }
}
