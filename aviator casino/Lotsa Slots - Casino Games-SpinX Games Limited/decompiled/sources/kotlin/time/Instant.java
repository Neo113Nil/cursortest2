package kotlin.time;

/* compiled from: Instant.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00060\u0002j\u0002`\u0003:\u0001!B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u0005J\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u0007H\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001cH\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\""}, d2 = {"Lkotlin/time/Instant;", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "epochSeconds", "", "nanosecondsOfSecond", "", "<init>", "(JI)V", "getEpochSeconds", "()J", "getNanosecondsOfSecond", "()I", "toEpochMilliseconds", "plus", com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, "Lkotlin/time/Duration;", "plus-LRDsOJo", "(J)Lkotlin/time/Instant;", "minus", "minus-LRDsOJo", "other", "minus-UwyO8pc", "(Lkotlin/time/Instant;)J", "compareTo", "equals", "", "", "hashCode", "toString", "", "writeReplace", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Instant implements java.lang.Comparable<kotlin.time.Instant>, java.io.Serializable {
    private final long epochSeconds;
    private final int nanosecondsOfSecond;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.time.Instant.Companion INSTANCE = new kotlin.time.Instant.Companion(null);
    private static final kotlin.time.Instant MIN = new kotlin.time.Instant(-31557014167219200L, 0);
    private static final kotlin.time.Instant MAX = new kotlin.time.Instant(31556889864403199L, 999999999);

    public Instant(long j, int i) {
        this.epochSeconds = j;
        this.nanosecondsOfSecond = i;
        if (-31557014167219200L > j || j >= 31556889864403200L) {
            throw new java.lang.IllegalArgumentException("Instant exceeds minimum or maximum instant".toString());
        }
    }

    public final long getEpochSeconds() {
        return this.epochSeconds;
    }

    public final int getNanosecondsOfSecond() {
        return this.nanosecondsOfSecond;
    }

    public final long toEpochMilliseconds() {
        long j = this.epochSeconds;
        long j2 = 1000;
        if (j >= 0) {
            if (j != 1) {
                if (j != 0) {
                    long j3 = j * 1000;
                    if (j3 / 1000 != j) {
                        return Long.MAX_VALUE;
                    }
                    j2 = j3;
                } else {
                    j2 = 0;
                }
            }
            long j4 = this.nanosecondsOfSecond / 1000000;
            long j5 = j2 + j4;
            if ((j2 ^ j5) >= 0 || (j4 ^ j2) < 0) {
                return j5;
            }
            return Long.MAX_VALUE;
        }
        long j6 = j + 1;
        if (j6 != 1) {
            if (j6 != 0) {
                long j7 = j6 * 1000;
                if (j7 / 1000 != j6) {
                    return Long.MIN_VALUE;
                }
                j2 = j7;
            } else {
                j2 = 0;
            }
        }
        long j8 = (this.nanosecondsOfSecond / 1000000) - 1000;
        long j9 = j2 + j8;
        if ((j2 ^ j9) >= 0 || (j8 ^ j2) < 0) {
            return j9;
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: minus-LRDsOJo, reason: not valid java name */
    public final kotlin.time.Instant m12244minusLRDsOJo(long duration) {
        return m12246plusLRDsOJo(kotlin.time.Duration.m12190unaryMinusUwyO8pc(duration));
    }

    /* renamed from: minus-UwyO8pc, reason: not valid java name */
    public final long m12245minusUwyO8pc(kotlin.time.Instant other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
        long duration = kotlin.time.DurationKt.toDuration(this.epochSeconds - other.epochSeconds, kotlin.time.DurationUnit.SECONDS);
        kotlin.time.Duration.Companion companion2 = kotlin.time.Duration.INSTANCE;
        return kotlin.time.Duration.m12175plusLRDsOJo(duration, kotlin.time.DurationKt.toDuration(this.nanosecondsOfSecond - other.nanosecondsOfSecond, kotlin.time.DurationUnit.NANOSECONDS));
    }

    @Override // java.lang.Comparable
    public int compareTo(kotlin.time.Instant other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        int compare = kotlin.jvm.internal.Intrinsics.compare(this.epochSeconds, other.epochSeconds);
        return compare != 0 ? compare : kotlin.jvm.internal.Intrinsics.compare(this.nanosecondsOfSecond, other.nanosecondsOfSecond);
    }

    public boolean equals(java.lang.Object other) {
        if (this != other) {
            if (other instanceof kotlin.time.Instant) {
                kotlin.time.Instant instant = (kotlin.time.Instant) other;
                if (this.epochSeconds != instant.epochSeconds || this.nanosecondsOfSecond != instant.nanosecondsOfSecond) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return kotlin.UByte$$ExternalSyntheticBackport0.m(this.epochSeconds) + (this.nanosecondsOfSecond * 51);
    }

    public java.lang.String toString() {
        java.lang.String formatIso;
        formatIso = kotlin.time.InstantKt.formatIso(this);
        return formatIso;
    }

    private final java.lang.Object writeReplace() {
        return kotlin.time.InstantJvmKt.serializedInstant(this);
    }

    /* compiled from: Instant.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fR\u0011\u0010\u0010\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012¨\u0006\u0019"}, d2 = {"Lkotlin/time/Instant$Companion;", "", "<init>", "()V", "now", "Lkotlin/time/Instant;", "fromEpochMilliseconds", "epochMilliseconds", "", "fromEpochSeconds", "epochSeconds", "nanosecondAdjustment", "", "parse", "input", "", "DISTANT_PAST", "getDISTANT_PAST", "()Lkotlin/time/Instant;", "DISTANT_FUTURE", "getDISTANT_FUTURE", "MIN", "getMIN$kotlin_stdlib", "MAX", "getMAX$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use Clock.System.now() instead", replaceWith = @kotlin.ReplaceWith(expression = "Clock.System.now()", imports = {"kotlin.time.Clock"}))
        public final kotlin.time.Instant now() {
            throw new kotlin.NotImplementedError(null, 1, null);
        }

        public final kotlin.time.Instant fromEpochMilliseconds(long epochMilliseconds) {
            long j = epochMilliseconds / 1000;
            if ((epochMilliseconds ^ 1000) < 0 && j * 1000 != epochMilliseconds) {
                j--;
            }
            long j2 = epochMilliseconds % 1000;
            int i = (int) ((j2 + (1000 & (((j2 ^ 1000) & ((-j2) | j2)) >> 63))) * 1000000);
            if (j < -31557014167219200L) {
                return getMIN$kotlin_stdlib();
            }
            if (j > 31556889864403199L) {
                return getMAX$kotlin_stdlib();
            }
            return fromEpochSeconds(j, i);
        }

        public static /* synthetic */ kotlin.time.Instant fromEpochSeconds$default(kotlin.time.Instant.Companion companion, long j, long j2, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                j2 = 0;
            }
            return companion.fromEpochSeconds(j, j2);
        }

        public final kotlin.time.Instant fromEpochSeconds(long epochSeconds, long nanosecondAdjustment) {
            long j = nanosecondAdjustment / 1000000000;
            if ((nanosecondAdjustment ^ 1000000000) < 0 && j * 1000000000 != nanosecondAdjustment) {
                j--;
            }
            long j2 = epochSeconds + j;
            if ((epochSeconds ^ j2) < 0 && (j ^ epochSeconds) >= 0) {
                kotlin.time.Instant.Companion companion = kotlin.time.Instant.INSTANCE;
                return epochSeconds > 0 ? companion.getMAX$kotlin_stdlib() : companion.getMIN$kotlin_stdlib();
            }
            if (j2 < -31557014167219200L) {
                return getMIN$kotlin_stdlib();
            }
            if (j2 > 31556889864403199L) {
                return getMAX$kotlin_stdlib();
            }
            long j3 = nanosecondAdjustment % 1000000000;
            return new kotlin.time.Instant(j2, (int) (j3 + ((((j3 ^ 1000000000) & ((-j3) | j3)) >> 63) & 1000000000)));
        }

        public final kotlin.time.Instant fromEpochSeconds(long epochSeconds, int nanosecondAdjustment) {
            return fromEpochSeconds(epochSeconds, nanosecondAdjustment);
        }

        public final kotlin.time.Instant parse(java.lang.CharSequence input) {
            kotlin.time.Instant parseIso;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
            parseIso = kotlin.time.InstantKt.parseIso(input);
            return parseIso;
        }

        public final kotlin.time.Instant getDISTANT_PAST() {
            return fromEpochSeconds(-3217862419201L, 999999999);
        }

        public final kotlin.time.Instant getDISTANT_FUTURE() {
            return fromEpochSeconds(3093527980800L, 0);
        }

        public final kotlin.time.Instant getMIN$kotlin_stdlib() {
            return kotlin.time.Instant.MIN;
        }

        public final kotlin.time.Instant getMAX$kotlin_stdlib() {
            return kotlin.time.Instant.MAX;
        }
    }

    /* renamed from: plus-LRDsOJo, reason: not valid java name */
    public final kotlin.time.Instant m12246plusLRDsOJo(long duration) {
        long m12160getInWholeSecondsimpl = kotlin.time.Duration.m12160getInWholeSecondsimpl(duration);
        int m12162getNanosecondsComponentimpl = kotlin.time.Duration.m12162getNanosecondsComponentimpl(duration);
        if (m12160getInWholeSecondsimpl == 0 && m12162getNanosecondsComponentimpl == 0) {
            return this;
        }
        long j = this.epochSeconds;
        long j2 = j + m12160getInWholeSecondsimpl;
        if ((j ^ j2) >= 0 || (m12160getInWholeSecondsimpl ^ j) < 0) {
            return INSTANCE.fromEpochSeconds(j2, this.nanosecondsOfSecond + m12162getNanosecondsComponentimpl);
        }
        return kotlin.time.Duration.m12173isPositiveimpl(duration) ? MAX : MIN;
    }
}
