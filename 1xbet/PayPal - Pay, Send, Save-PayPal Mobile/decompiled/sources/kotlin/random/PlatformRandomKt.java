package kotlin.random;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lkotlin/random/Random;", "Ljava/util/Random;", "asJavaRandom", "(Lkotlin/random/Random;)Ljava/util/Random;", "asKotlinRandom", "(Ljava/util/Random;)Lkotlin/random/Random;", "", "hi26", "low27", "", "doubleFromParts", "(II)D"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PlatformRandomKt {
    public static final double doubleFromParts(int i, int i2) {
        return ((i << 27) + i2) / 9.007199254740992E15d;
    }

    public static final java.util.Random asJavaRandom(kotlin.random.Random random) {
        java.util.Random getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        kotlin.random.AbstractPlatformRandom abstractPlatformRandom = random instanceof kotlin.random.AbstractPlatformRandom ? (kotlin.random.AbstractPlatformRandom) random : null;
        return (abstractPlatformRandom == null || (getHighResolutionOutputSizeshNQ4ISI = abstractPlatformRandom.getGetHighResolutionOutputSizeshNQ4ISI()) == null) ? new kotlin.random.KotlinRandom(random) : getHighResolutionOutputSizeshNQ4ISI;
    }

    public static final kotlin.random.Random asKotlinRandom(java.util.Random random) {
        kotlin.random.Random random2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        kotlin.random.KotlinRandom kotlinRandom = random instanceof kotlin.random.KotlinRandom ? (kotlin.random.KotlinRandom) random : null;
        return (kotlinRandom == null || (random2 = kotlinRandom.getHighSpeedVideoFpsRangesFor) == null) ? new kotlin.random.PlatformRandom(random) : random2;
    }
}
