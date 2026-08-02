package kotlin.random;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0000\u0018\u0000 !2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001!B9\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fB\u0019\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001b"}, d2 = {"Lkotlin/random/XorWowRandom;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Camera2StreamConfigurationMap;", "", "x", "y", "z", "w", "v", "addend", "<init>", "(IIIIII)V", "seed1", "seed2", "(II)V", "", "getHighResolutionOutputSizeshNQ4ISI", "()V", "", "readResolve", "()Ljava/lang/Object;", "nextInt", "()I", "bitCount", "nextBits", "(I)I", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "getOutputFormats", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class XorWowRandom extends kotlin.random.Random implements java.io.Serializable {
    private static final kotlin.random.XorWowRandom.Companion Companion = new kotlin.random.XorWowRandom.Companion(null);
    private static final long serialVersionUID = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRangesFor;
    private int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private int getOutputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private int getHighSpeedVideoSizes;

    public XorWowRandom(int i, int i2, int i3, int i4, int i5, int i6) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.Camera2StreamConfigurationMap = i2;
        this.getHighSpeedVideoSizes = i3;
        this.getHighSpeedVideoFpsRanges = i4;
        this.getHighSpeedVideoFpsRangesFor = i5;
        this.getOutputFormats = i6;
        getHighResolutionOutputSizeshNQ4ISI();
        for (int i7 = 0; i7 < 64; i7++) {
            nextInt();
        }
    }

    public XorWowRandom(int i, int i2) {
        this(i, i2, 0, 0, ~i, (i << 10) ^ (i2 >>> 4));
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        if ((this.getHighResolutionOutputSizeshNQ4ISI | this.Camera2StreamConfigurationMap | this.getHighSpeedVideoSizes | this.getHighSpeedVideoFpsRanges | this.getHighSpeedVideoFpsRangesFor) == 0) {
            throw new java.lang.IllegalArgumentException("Initial state must have at least one non-zero element.".toString());
        }
    }

    private final java.lang.Object readResolve() {
        try {
            getHighResolutionOutputSizeshNQ4ISI();
            return this;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable initCause = new java.io.InvalidObjectException(th.getMessage()).initCause(th);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(initCause, "");
            throw initCause;
        }
    }

    @Override // kotlin.random.Random
    public final int nextInt() {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = i ^ (i >>> 2);
        this.getHighResolutionOutputSizeshNQ4ISI = this.Camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = this.getHighSpeedVideoSizes;
        this.getHighSpeedVideoSizes = this.getHighSpeedVideoFpsRanges;
        int i3 = this.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRanges = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.getHighSpeedVideoFpsRangesFor = i4;
        int i5 = this.getOutputFormats + 362437;
        this.getOutputFormats = i5;
        return i4 + i5;
    }

    @Override // kotlin.random.Random
    public final int nextBits(int bitCount) {
        return kotlin.random.RandomKt.takeUpperBits(nextInt(), bitCount);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/random/XorWowRandom$Companion;", "", "<init>", "()V", "", "serialVersionUID", "J"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
