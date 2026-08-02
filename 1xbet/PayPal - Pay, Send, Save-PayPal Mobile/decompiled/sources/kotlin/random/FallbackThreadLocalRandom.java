package kotlin.random;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n"}, d2 = {"Lkotlin/random/FallbackThreadLocalRandom;", "Lkotlin/random/AbstractPlatformRandom;", "<init>", "()V", "Lkotlin/random/FallbackThreadLocalRandom$implStorage$1;", "Camera2StreamConfigurationMap", "Lkotlin/random/FallbackThreadLocalRandom$implStorage$1;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Random;", "getImpl", "()Ljava/util/Random;", "impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FallbackThreadLocalRandom extends kotlin.random.AbstractPlatformRandom {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.random.FallbackThreadLocalRandom$implStorage$1 getHighSpeedVideoFpsRangesFor = new java.lang.ThreadLocal<java.util.Random>() { // from class: kotlin.random.FallbackThreadLocalRandom$implStorage$1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public final java.util.Random initialValue() {
            return new java.util.Random();
        }
    };

    @Override // kotlin.random.AbstractPlatformRandom
    public final java.util.Random getImpl() {
        java.util.Random random = get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(random, "");
        return random;
    }
}
