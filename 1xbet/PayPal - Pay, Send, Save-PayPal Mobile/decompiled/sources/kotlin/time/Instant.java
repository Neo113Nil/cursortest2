package kotlin.time;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00060\u0002j\u0002`\u0003:\u0001-B\u0019\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0010\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0013\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010\"J\u001b\u0010'\u001a\u00020&2\n\u0010%\u001a\u00060#j\u0002`$H\u0002¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d"}, d2 = {"Lkotlin/time/Instant;", "", "Ljava/io/Serializable;", "Lkotlin/io/Camera2StreamConfigurationMap;", "", "epochSeconds", "", "nanosecondsOfSecond", "<init>", "(JI)V", "toEpochMilliseconds", "()J", "Lkotlin/time/Duration;", "duration", "plus-LRDsOJo", "(J)Lkotlin/time/Instant;", "plus", "minus-LRDsOJo", "minus", "other", "minus-UwyO8pc", "(Lkotlin/time/Instant;)J", "compareTo", "(Lkotlin/time/Instant;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/getHighSpeedVideoSizes;", "input", "", "readObject", "(Ljava/io/ObjectInputStream;)V", "J", "getEpochSeconds", com.visa.cbp.getEncExpo.warmup, "getNanosecondsOfSecond", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Instant implements java.lang.Comparable<kotlin.time.Instant>, java.io.Serializable {
    private final long epochSeconds;
    private final int nanosecondsOfSecond;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.time.Instant.Companion INSTANCE = new kotlin.time.Instant.Companion(null);
    private static final kotlin.time.Instant MIN = new kotlin.time.Instant(-31557014167219200L, 0);
    private static final kotlin.time.Instant MAX = new kotlin.time.Instant(31556889864403199L, org.threeten.bp.Year.MAX_VALUE);

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
    public final kotlin.time.Instant m24016minusLRDsOJo(long duration) {
        return m24018plusLRDsOJo(kotlin.time.Duration.m23981unaryMinusUwyO8pc(duration));
    }

    /* renamed from: minus-UwyO8pc, reason: not valid java name */
    public final long m24017minusUwyO8pc(kotlin.time.Instant other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
        long duration = kotlin.time.DurationKt.toDuration(this.epochSeconds - other.epochSeconds, kotlin.time.DurationUnit.SECONDS);
        kotlin.time.Duration.Companion companion2 = kotlin.time.Duration.INSTANCE;
        return kotlin.time.Duration.m23966plusLRDsOJo(duration, kotlin.time.DurationKt.toDuration(this.nanosecondsOfSecond - other.nanosecondsOfSecond, kotlin.time.DurationUnit.NANOSECONDS));
    }

    @Override // java.lang.Comparable
    public final int compareTo(kotlin.time.Instant other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        int compare = kotlin.jvm.internal.Intrinsics.compare(this.epochSeconds, other.epochSeconds);
        return compare != 0 ? compare : kotlin.jvm.internal.Intrinsics.compare(this.nanosecondsOfSecond, other.nanosecondsOfSecond);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof kotlin.time.Instant)) {
            return false;
        }
        kotlin.time.Instant instant = (kotlin.time.Instant) other;
        return this.epochSeconds == instant.epochSeconds && this.nanosecondsOfSecond == instant.nanosecondsOfSecond;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.epochSeconds) + (this.nanosecondsOfSecond * 51);
    }

    public final java.lang.String toString() {
        return kotlin.time.InstantKt.access$formatIso(this);
    }

    private final java.lang.Object writeReplace() {
        return kotlin.time.InstantJvmKt.serializedInstant(this);
    }

    private final void readObject(java.io.ObjectInputStream input) {
        throw new java.io.InvalidObjectException("Deserialization is supported via proxy only");
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0006R\u0011\u0010\u0019\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0006R\u001a\u0010\u001a\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0006R\u001a\u0010\u001d\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0006"}, d2 = {"Lkotlin/time/Instant$Companion;", "", "<init>", "()V", "Lkotlin/time/Instant;", "now", "()Lkotlin/time/Instant;", "", "epochMilliseconds", "fromEpochMilliseconds", "(J)Lkotlin/time/Instant;", "epochSeconds", "nanosecondAdjustment", "fromEpochSeconds", "(JJ)Lkotlin/time/Instant;", "", "(JI)Lkotlin/time/Instant;", "", "input", "parse", "(Ljava/lang/CharSequence;)Lkotlin/time/Instant;", "parseOrNull", "getDISTANT_PAST", "DISTANT_PAST", "getDISTANT_FUTURE", "DISTANT_FUTURE", "MIN", "Lkotlin/time/Instant;", "getMIN$kotlin_stdlib", "MAX", "getMAX$kotlin_stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
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
                return epochSeconds > 0 ? kotlin.time.Instant.INSTANCE.getMAX$kotlin_stdlib() : kotlin.time.Instant.INSTANCE.getMIN$kotlin_stdlib();
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
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
            return kotlin.time.InstantKt.access$parseIso(input).toInstant();
        }

        public final kotlin.time.Instant parseOrNull(java.lang.CharSequence input) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
            return kotlin.time.InstantKt.access$parseIso(input).toInstantOrNull();
        }

        public final kotlin.time.Instant getDISTANT_PAST() {
            return fromEpochSeconds(kotlinx.datetime.InstantKt.DISTANT_PAST_SECONDS, org.threeten.bp.Year.MAX_VALUE);
        }

        public final kotlin.time.Instant getDISTANT_FUTURE() {
            return fromEpochSeconds(kotlinx.datetime.InstantKt.DISTANT_FUTURE_SECONDS, 0);
        }

        public final kotlin.time.Instant getMIN$kotlin_stdlib() {
            return kotlin.time.Instant.MIN;
        }

        public final kotlin.time.Instant getMAX$kotlin_stdlib() {
            return kotlin.time.Instant.MAX;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: plus-LRDsOJo, reason: not valid java name */
    public final kotlin.time.Instant m24018plusLRDsOJo(long duration) {
        long m23956getInWholeSecondsimpl = kotlin.time.Duration.m23956getInWholeSecondsimpl(duration);
        int m23958getNanosecondsComponentimpl = kotlin.time.Duration.m23958getNanosecondsComponentimpl(duration);
        if (m23956getInWholeSecondsimpl == 0 && m23958getNanosecondsComponentimpl == 0) {
            return this;
        }
        long j = this.epochSeconds;
        long j2 = j + m23956getInWholeSecondsimpl;
        if ((j ^ j2) >= 0 || (m23956getInWholeSecondsimpl ^ j) < 0) {
            return INSTANCE.fromEpochSeconds(j2, this.nanosecondsOfSecond + m23958getNanosecondsComponentimpl);
        }
        return kotlin.time.Duration.m23964isPositiveimpl(duration) ? MAX : MIN;
    }
}
