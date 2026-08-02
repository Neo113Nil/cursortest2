package androidx.compose.runtime.internal;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/runtime/internal/AtomicInt;", "Ljava/util/concurrent/atomic/AtomicInteger;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(I)V", "amount", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(I)I", "", "toByte", "()B", "", "toShort", "()S", "", "toChar", "()C"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AtomicInt extends java.util.concurrent.atomic.AtomicInteger {
    public static final int $stable = 8;

    public AtomicInt(int i) {
        super(i);
    }

    @Override // java.lang.Number
    public final byte byteValue() {
        return toByte();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final double doubleValue() {
        return toDouble();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final float floatValue() {
        return toFloat();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final int intValue() {
        return toInt();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final long longValue() {
        return toLong();
    }

    @Override // java.lang.Number
    public final short shortValue() {
        return toShort();
    }

    public final double toDouble() {
        return super.doubleValue();
    }

    public final float toFloat() {
        return super.floatValue();
    }

    public final int toInt() {
        return super.intValue();
    }

    public final long toLong() {
        return super.longValue();
    }

    public final int add(int amount) {
        return addAndGet(amount);
    }

    public final byte toByte() {
        return (byte) intValue();
    }

    public final short toShort() {
        return (short) intValue();
    }

    @kotlin.Deprecated(message = "Direct conversion to Char is deprecated. Use toInt().toChar() or Char constructor instead.\nIf you override toChar() function in your Number inheritor, it's recommended to gradually deprecate the overriding function and then remove it.\nSee https://youtrack.jetbrains.com/issue/KT-46465 for details about the migration", replaceWith = @kotlin.ReplaceWith(expression = "this.toInt().toChar()", imports = {}))
    public final char toChar() {
        return (char) intValue();
    }
}
