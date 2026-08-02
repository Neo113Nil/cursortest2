package kotlin.random;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000 \r2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\rB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lkotlin/random/PlatformRandom;", "Lkotlin/random/AbstractPlatformRandom;", "Ljava/io/Serializable;", "Lkotlin/io/Camera2StreamConfigurationMap;", "Ljava/util/Random;", "p0", "<init>", "(Ljava/util/Random;)V", "getHighSpeedVideoFpsRanges", "Ljava/util/Random;", "getImpl", "()Ljava/util/Random;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class PlatformRandom extends kotlin.random.AbstractPlatformRandom implements java.io.Serializable {
    private static final kotlin.random.PlatformRandom.Companion Companion = new kotlin.random.PlatformRandom.Companion(null);
    private static final long serialVersionUID = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Random getHighResolutionOutputSizeshNQ4ISI;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/random/PlatformRandom$Companion;", "", "<init>", "()V", "", "serialVersionUID", "J"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PlatformRandom(java.util.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        this.getHighResolutionOutputSizeshNQ4ISI = random;
    }

    @Override // kotlin.random.AbstractPlatformRandom
    /* renamed from: getImpl, reason: from getter */
    public final java.util.Random getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
