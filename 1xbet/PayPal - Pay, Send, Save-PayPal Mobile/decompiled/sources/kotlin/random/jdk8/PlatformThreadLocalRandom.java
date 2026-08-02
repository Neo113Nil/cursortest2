package kotlin.random.jdk8;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlin/random/jdk8/PlatformThreadLocalRandom;", "Lkotlin/random/AbstractPlatformRandom;", "<init>", "()V", "", "from", "until", "nextInt", "(II)I", "", "nextLong", "(J)J", "(JJ)J", "", "nextDouble", "(D)D", "Ljava/util/Random;", "getImpl", "()Ljava/util/Random;", "impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PlatformThreadLocalRandom extends kotlin.random.AbstractPlatformRandom {
    @Override // kotlin.random.AbstractPlatformRandom
    public final java.util.Random getImpl() {
        java.util.concurrent.ThreadLocalRandom current = java.util.concurrent.ThreadLocalRandom.current();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(current, "");
        return current;
    }

    @Override // kotlin.random.Random
    public final int nextInt(int from, int until) {
        return java.util.concurrent.ThreadLocalRandom.current().nextInt(from, until);
    }

    @Override // kotlin.random.Random
    public final long nextLong(long until) {
        return java.util.concurrent.ThreadLocalRandom.current().nextLong(until);
    }

    @Override // kotlin.random.Random
    public final long nextLong(long from, long until) {
        return java.util.concurrent.ThreadLocalRandom.current().nextLong(from, until);
    }

    @Override // kotlin.random.Random
    public final double nextDouble(double until) {
        return java.util.concurrent.ThreadLocalRandom.current().nextDouble(until);
    }
}
