package kotlinx.datetime.internal;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\u0015"}, d2 = {"Lkotlinx/datetime/internal/DecimalFraction;", "", "", "fractionalPart", "digits", "<init>", "(II)V", "newDigits", "fractionalPartWithNDigits", "(I)I", "other", "compareTo", "(Lkotlinx/datetime/internal/DecimalFraction;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", com.visa.cbp.getEncExpo.warmup, "getFractionalPart", "getDigits"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DecimalFraction implements java.lang.Comparable<kotlinx.datetime.internal.DecimalFraction> {
    private final int digits;
    private final int fractionalPart;

    public DecimalFraction(int i, int i2) {
        this.fractionalPart = i;
        this.digits = i2;
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("Digits must be non-negative, but was ".concat(java.lang.String.valueOf(i2)).toString());
        }
    }

    public final int getFractionalPart() {
        return this.fractionalPart;
    }

    public final int getDigits() {
        return this.digits;
    }

    public final int fractionalPartWithNDigits(int newDigits) {
        int i = this.digits;
        if (newDigits == i) {
            return this.fractionalPart;
        }
        if (newDigits > i) {
            return this.fractionalPart * kotlinx.datetime.internal.MathKt.getPOWERS_OF_TEN()[newDigits - this.digits];
        }
        return this.fractionalPart / kotlinx.datetime.internal.MathKt.getPOWERS_OF_TEN()[this.digits - newDigits];
    }

    @Override // java.lang.Comparable
    public final int compareTo(kotlinx.datetime.internal.DecimalFraction other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        int max = java.lang.Math.max(this.digits, other.digits);
        return kotlin.jvm.internal.Intrinsics.compare(fractionalPartWithNDigits(max), other.fractionalPartWithNDigits(max));
    }

    public final boolean equals(java.lang.Object other) {
        return (other instanceof kotlinx.datetime.internal.DecimalFraction) && compareTo((kotlinx.datetime.internal.DecimalFraction) other) == 0;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = kotlinx.datetime.internal.MathKt.getPOWERS_OF_TEN()[this.digits];
        sb.append(this.fractionalPart / i);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb.append(kotlin.text.StringsKt.removePrefix(java.lang.String.valueOf(i + (this.fractionalPart % i)), (java.lang.CharSequence) "1"));
        return sb.toString();
    }

    public final int hashCode() {
        throw new java.lang.UnsupportedOperationException("DecimalFraction is not supposed to be used as a hash key");
    }
}
