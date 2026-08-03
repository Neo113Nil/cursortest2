package kotlin;

/* compiled from: BigDecimals.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0007\n\u0002\u0010\u0006\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0003\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\r\u0010\u0007\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\r\u0010\b\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\r\u0010\t\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\r\u0010\n\u001a\u00020\u0001*\u00020\u000bH\u0087\b\u001a\u0015\u0010\n\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0087\b\u001a\r\u0010\n\u001a\u00020\u0001*\u00020\u000eH\u0087\b\u001a\u0015\u0010\n\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\f\u001a\u00020\rH\u0087\b\u001a\r\u0010\n\u001a\u00020\u0001*\u00020\u000fH\u0087\b\u001a\u0015\u0010\n\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0087\b\u001a\r\u0010\n\u001a\u00020\u0001*\u00020\u0010H\u0087\b\u001a\u0015\u0010\n\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\f\u001a\u00020\rH\u0087\b¨\u0006\u0011"}, d2 = {"plus", "Ljava/math/BigDecimal;", "other", "minus", "times", "div", "rem", "unaryMinus", "inc", "dec", "toBigDecimal", "", "mathContext", "Ljava/math/MathContext;", "", "", "", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/NumbersKt")
/* loaded from: classes6.dex */
class NumbersKt__BigDecimalsKt {
    private static final java.math.BigDecimal plus(java.math.BigDecimal bigDecimal, java.math.BigDecimal other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        java.math.BigDecimal add = bigDecimal.add(other);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(add, "add(...)");
        return add;
    }

    private static final java.math.BigDecimal minus(java.math.BigDecimal bigDecimal, java.math.BigDecimal other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        java.math.BigDecimal subtract = bigDecimal.subtract(other);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(subtract, "subtract(...)");
        return subtract;
    }

    private static final java.math.BigDecimal times(java.math.BigDecimal bigDecimal, java.math.BigDecimal other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        java.math.BigDecimal multiply = bigDecimal.multiply(other);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(multiply, "multiply(...)");
        return multiply;
    }

    private static final java.math.BigDecimal div(java.math.BigDecimal bigDecimal, java.math.BigDecimal other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        java.math.BigDecimal divide = bigDecimal.divide(other, java.math.RoundingMode.HALF_EVEN);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(divide, "divide(...)");
        return divide;
    }

    private static final java.math.BigDecimal rem(java.math.BigDecimal bigDecimal, java.math.BigDecimal other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        java.math.BigDecimal remainder = bigDecimal.remainder(other);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(remainder, "remainder(...)");
        return remainder;
    }

    private static final java.math.BigDecimal unaryMinus(java.math.BigDecimal bigDecimal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        java.math.BigDecimal negate = bigDecimal.negate();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(negate, "negate(...)");
        return negate;
    }

    private static final java.math.BigDecimal inc(java.math.BigDecimal bigDecimal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        java.math.BigDecimal add = bigDecimal.add(java.math.BigDecimal.ONE);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(add, "add(...)");
        return add;
    }

    private static final java.math.BigDecimal dec(java.math.BigDecimal bigDecimal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        java.math.BigDecimal subtract = bigDecimal.subtract(java.math.BigDecimal.ONE);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(subtract, "subtract(...)");
        return subtract;
    }

    private static final java.math.BigDecimal toBigDecimal(int i) {
        java.math.BigDecimal valueOf = java.math.BigDecimal.valueOf(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        return valueOf;
    }

    private static final java.math.BigDecimal toBigDecimal(int i, java.math.MathContext mathContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new java.math.BigDecimal(i, mathContext);
    }

    private static final java.math.BigDecimal toBigDecimal(long j) {
        java.math.BigDecimal valueOf = java.math.BigDecimal.valueOf(j);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        return valueOf;
    }

    private static final java.math.BigDecimal toBigDecimal(long j, java.math.MathContext mathContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new java.math.BigDecimal(j, mathContext);
    }

    private static final java.math.BigDecimal toBigDecimal(float f) {
        return new java.math.BigDecimal(java.lang.String.valueOf(f));
    }

    private static final java.math.BigDecimal toBigDecimal(float f, java.math.MathContext mathContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new java.math.BigDecimal(java.lang.String.valueOf(f), mathContext);
    }

    private static final java.math.BigDecimal toBigDecimal(double d) {
        return new java.math.BigDecimal(java.lang.String.valueOf(d));
    }

    private static final java.math.BigDecimal toBigDecimal(double d, java.math.MathContext mathContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new java.math.BigDecimal(java.lang.String.valueOf(d), mathContext);
    }
}
