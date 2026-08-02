package kotlin.random;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001d\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Lkotlin/random/KotlinRandom;", "Ljava/util/Random;", "Lkotlin/random/Random;", "p0", "<init>", "(Lkotlin/random/Random;)V", "", io.ktor.http.LinkHeader.Rel.Next, "(I)I", "nextInt", "()I", "", "nextBoolean", "()Z", "", "nextLong", "()J", "", "nextFloat", "()F", "", "nextDouble", "()D", "", "", "nextBytes", "([B)V", "setSeed", "(J)V", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/random/Random;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Z", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class KotlinRandom extends java.util.Random {
    private static final kotlin.random.KotlinRandom.Companion Companion = new kotlin.random.KotlinRandom.Companion(null);
    private static final long serialVersionUID = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    final kotlin.random.Random getHighSpeedVideoFpsRangesFor;

    public KotlinRandom(kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        this.getHighSpeedVideoFpsRangesFor = random;
    }

    @Override // java.util.Random
    protected final int next(int p0) {
        return this.getHighSpeedVideoFpsRangesFor.nextBits(p0);
    }

    @Override // java.util.Random
    public final int nextInt() {
        return this.getHighSpeedVideoFpsRangesFor.nextInt();
    }

    @Override // java.util.Random
    public final int nextInt(int p0) {
        return this.getHighSpeedVideoFpsRangesFor.nextInt(p0);
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return this.getHighSpeedVideoFpsRangesFor.nextBoolean();
    }

    @Override // java.util.Random
    public final long nextLong() {
        return this.getHighSpeedVideoFpsRangesFor.nextLong();
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return this.getHighSpeedVideoFpsRangesFor.nextFloat();
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return this.getHighSpeedVideoFpsRangesFor.nextDouble();
    }

    @Override // java.util.Random
    public final void nextBytes(byte[] p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighSpeedVideoFpsRangesFor.nextBytes(p0);
    }

    @Override // java.util.Random
    public final void setSeed(long p0) {
        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            return;
        }
        throw new java.lang.UnsupportedOperationException("Setting seed is not supported.");
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/random/KotlinRandom$Companion;", "", "<init>", "()V", "", "serialVersionUID", "J"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
