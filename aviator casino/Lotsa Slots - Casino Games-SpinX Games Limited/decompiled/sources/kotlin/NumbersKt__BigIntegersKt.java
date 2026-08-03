package kotlin;

/* compiled from: BigIntegers.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0003\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\r\u0010\u0007\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\r\u0010\b\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\r\u0010\t\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\r\u0010\n\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\u0015\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\r\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\f\u001a\u0015\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\f\u001a\r\u0010\u0012\u001a\u00020\u0001*\u00020\u0010H\u0087\b\u001a\r\u0010\u0012\u001a\u00020\u0001*\u00020\u0013H\u0087\b\u001a\r\u0010\u0014\u001a\u00020\u0015*\u00020\u0001H\u0087\b\u001a!\u0010\u0014\u001a\u00020\u0015*\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0087\b¨\u0006\u0019"}, d2 = {"plus", "Ljava/math/BigInteger;", "other", "minus", "times", "div", "rem", "unaryMinus", "inc", "dec", "inv", "and", "or", "xor", "shl", com.ironsource.B5.q, "", "shr", "toBigInteger", "", "toBigDecimal", "Ljava/math/BigDecimal;", "scale", "mathContext", "Ljava/math/MathContext;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/NumbersKt")
/* loaded from: classes6.dex */
class NumbersKt__BigIntegersKt extends kotlin.NumbersKt__BigDecimalsKt {
    private static final java.math.BigInteger plus(java.math.BigInteger bigInteger, java.math.BigInteger other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        java.math.BigInteger add = bigInteger.add(other);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(add, "add(...)");
        return add;
    }

    private static final java.math.BigInteger minus(java.math.BigInteger bigInteger, java.math.BigInteger other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        java.math.BigInteger subtract = bigInteger.subtract(other);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(subtract, "subtract(...)");
        return subtract;
    }

    private static final java.math.BigInteger times(java.math.BigInteger bigInteger, java.math.BigInteger other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        java.math.BigInteger multiply = bigInteger.multiply(other);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(multiply, "multiply(...)");
        return multiply;
    }

    private static final java.math.BigInteger div(java.math.BigInteger bigInteger, java.math.BigInteger other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        java.math.BigInteger divide = bigInteger.divide(other);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(divide, "divide(...)");
        return divide;
    }

    private static final java.math.BigInteger rem(java.math.BigInteger bigInteger, java.math.BigInteger other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        java.math.BigInteger remainder = bigInteger.remainder(other);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(remainder, "remainder(...)");
        return remainder;
    }

    private static final java.math.BigInteger unaryMinus(java.math.BigInteger bigInteger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        java.math.BigInteger negate = bigInteger.negate();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(negate, "negate(...)");
        return negate;
    }

    private static final java.math.BigInteger inc(java.math.BigInteger bigInteger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        java.math.BigInteger add = bigInteger.add(java.math.BigInteger.ONE);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(add, "add(...)");
        return add;
    }

    private static final java.math.BigInteger dec(java.math.BigInteger bigInteger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        java.math.BigInteger subtract = bigInteger.subtract(java.math.BigInteger.ONE);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(subtract, "subtract(...)");
        return subtract;
    }

    private static final java.math.BigInteger inv(java.math.BigInteger bigInteger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        java.math.BigInteger not = bigInteger.not();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(not, "not(...)");
        return not;
    }

    private static final java.math.BigInteger and(java.math.BigInteger bigInteger, java.math.BigInteger other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        java.math.BigInteger and = bigInteger.and(other);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(and, "and(...)");
        return and;
    }

    private static final java.math.BigInteger or(java.math.BigInteger bigInteger, java.math.BigInteger other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        java.math.BigInteger or = bigInteger.or(other);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(or, "or(...)");
        return or;
    }

    private static final java.math.BigInteger xor(java.math.BigInteger bigInteger, java.math.BigInteger other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        java.math.BigInteger xor = bigInteger.xor(other);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(xor, "xor(...)");
        return xor;
    }

    private static final java.math.BigInteger shl(java.math.BigInteger bigInteger, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        java.math.BigInteger shiftLeft = bigInteger.shiftLeft(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(shiftLeft, "shiftLeft(...)");
        return shiftLeft;
    }

    private static final java.math.BigInteger shr(java.math.BigInteger bigInteger, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        java.math.BigInteger shiftRight = bigInteger.shiftRight(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(shiftRight, "shiftRight(...)");
        return shiftRight;
    }

    private static final java.math.BigInteger toBigInteger(int i) {
        java.math.BigInteger valueOf = java.math.BigInteger.valueOf(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        return valueOf;
    }

    private static final java.math.BigInteger toBigInteger(long j) {
        java.math.BigInteger valueOf = java.math.BigInteger.valueOf(j);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        return valueOf;
    }

    private static final java.math.BigDecimal toBigDecimal(java.math.BigInteger bigInteger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        return new java.math.BigDecimal(bigInteger);
    }

    static /* synthetic */ java.math.BigDecimal toBigDecimal$default(java.math.BigInteger bigInteger, int i, java.math.MathContext mathContext, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            mathContext = java.math.MathContext.UNLIMITED;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new java.math.BigDecimal(bigInteger, i, mathContext);
    }

    private static final java.math.BigDecimal toBigDecimal(java.math.BigInteger bigInteger, int i, java.math.MathContext mathContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new java.math.BigDecimal(bigInteger, i, mathContext);
    }
}
