package com.apollographql.apollo.api.json.internal;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0000*\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "", "-LongToIntExact", "(J)I", "", "-DoubleToIntExact", "(D)I", "-LongToDoubleExact", "(J)D", "-DoubleToLongExact", "(D)J"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UtilsKt {
    /* renamed from: -LongToIntExact, reason: not valid java name */
    public static final int m9955LongToIntExact(long j) {
        int i = (int) j;
        if (i == j) {
            return i;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(j);
        sb.append(" cannot be converted to Int");
        throw new java.lang.IllegalStateException(sb.toString().toString());
    }

    /* renamed from: -DoubleToIntExact, reason: not valid java name */
    public static final int m9952DoubleToIntExact(double d) {
        int i = (int) d;
        if (i == d) {
            return i;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(d);
        sb.append(" cannot be converted to Int");
        throw new java.lang.IllegalStateException(sb.toString().toString());
    }

    /* renamed from: -LongToDoubleExact, reason: not valid java name */
    public static final double m9954LongToDoubleExact(long j) {
        double d = j;
        if (((long) d) == j) {
            return d;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(j);
        sb.append(" cannot be converted to Double");
        throw new java.lang.IllegalStateException(sb.toString().toString());
    }

    /* renamed from: -DoubleToLongExact, reason: not valid java name */
    public static final long m9953DoubleToLongExact(double d) {
        long j = (long) d;
        if (j == d) {
            return j;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(d);
        sb.append(" cannot be converted to Long");
        throw new java.lang.IllegalStateException(sb.toString().toString());
    }
}
